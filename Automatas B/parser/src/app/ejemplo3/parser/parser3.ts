import { Injectable } from '@angular/core';
import * as peggy from 'peggy';

@Injectable({
  providedIn: 'root'
})
export class Parser3 {

  private parser!: peggy.Parser;
  
    constructor() {
      this.compileGrammar();
    }
  
     private compileGrammar() {
  
      const grammar = `
      S = L S
      /L
      /""
            
      L = A B C D

      A = "a" A
      /"a"

      B = "b" B
      /"c" B
      /"b"
      /"c"
      / ""

      C = "d"
      /""

      D = "e" D
      /"e"

      `;
      this.parser = peggy.generate(grammar);
  
     }
  
     parse(expression: string): any {
      return this.parser.parse(expression);
    }
  
}
