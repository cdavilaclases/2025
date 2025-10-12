import { Injectable } from '@angular/core';
import * as peggy from 'peggy';

@Injectable({
  providedIn: 'root'
})
export class Parser2 {

  private parser!: peggy.Parser;

  constructor() {
    this.compileGrammar();
  }

   private compileGrammar() {

    const grammar = `
     {
      
     function potenciaDos(pot) {
          let resultado = 1;
          for(let i = 1; i<= pot; i++){
              resultado = 2*resultado;
          }
          return resultado;
      }
    }  

      L = b:B l:L {
          let nodo = {};
          nodo.val = potenciaDos(l.pot + 1)*b.val + l.val;
          nodo.pot = l.pot + 1;
          return nodo;
      }
      /b:B {
        return b;
      }
     
      B = "1" {
          let nodo = {};
          nodo.val = 1;
          nodo.pot = 0;
          return nodo;
        } 
        /"0" {
          let nodo = {};
          nodo.val = 0;
          nodo.pot = 0;
          return nodo;
        } 
    `;
    this.parser = peggy.generate(grammar);

   }

   parse(expression: string): any {
    return this.parser.parse(expression);
  }

  
}
