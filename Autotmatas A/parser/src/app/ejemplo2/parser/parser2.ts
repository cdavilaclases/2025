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
      function potenciaDos(exponente){
        let potencia = 1;
        for(let i = 1; i<= exponente; i++){
          potencia = 2*potencia;
        }
        return potencia;
      } 
     }

      L = var1:B patito2:L{
        let nodo = {};
        nodo.val = potenciaDos(patito2.pot+1)*var1.val + patito2.val;
        nodo.pot = patito2.pot + 1;
        return nodo;
      }
        / patito:B{
          return patito;
        } 

      B = "1"{
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
