import { Injectable } from '@angular/core';
import * as peggy from 'peggy';

@Injectable({
  providedIn: 'root'
})
export class ParserServicio {
  
   private parser!: peggy.Parser;

   constructor() {
    this.compileGrammar();
  }

   private compileGrammar() {

    const grammar = `
    
    {
      let counter = 0;

      function nextId() {
        return ++counter;
      }
    }


    L = b:B l:L {
      let nodo = {};
      nodo.numero = "nodo"+nextId();
      nodo.codigo = b.codigo + l.codigo + nodo.numero + "[label = L];"
                  + nodo.numero + "->" + b.numero + ";"
                  + nodo.numero + "->" + l.numero + ";";
      return nodo;
    }
      /b:B {
        let nodo = {};
        nodo.numero = "nodo"+nextId();
        nodo.codigo = b.codigo + nodo.numero + "[label = L];"
                      +nodo.numero + "->" + b.numero +";";
        return nodo;
      }
    
    B = "1"{
        let nodo = {};
        nodo.numero = "nodo"+nextId();
        let uno = "nodo"+nextId();
        nodo.codigo = nodo.numero + "[label = B];"
         + uno + "[label = 1];"
         + nodo.numero + "->" + uno +";";
         return nodo;
      }
      /"0"{
        let nodo = {};
        nodo.numero = "nodo"+nextId();
        let cero = "nodo"+nextId();
        nodo.codigo = nodo.numero + "[label = B];"
         + cero + "[label = 0];"
         + nodo.numero + "->" + cero +";";
         return nodo;
      }

    `;
    this.parser = peggy.generate(grammar);
  }

  parse(expression: string): any {
    return this.parser.parse(expression);
  }


}
