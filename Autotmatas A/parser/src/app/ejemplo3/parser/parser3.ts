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
    //a?(b|c)+d*
        const grammar = `
        L = A B C

        A = "a"
        /""

        B = "b" B
        /"c" B
        /"b"
        /"c"

        C = "d" C
        /"d"
        /""

        _ = [ \\n\\t]*
        
        `;
        this.parser = peggy.generate(grammar);
      }
    
      parse(expression: string): any {
        return this.parser.parse(expression);
      }
}
