import { Component } from '@angular/core';
import { Parser3 } from './parser/parser3';

@Component({
  selector: 'app-ejemplo3',
  standalone: false,
  templateUrl: './ejemplo3.html',
  styleUrl: './ejemplo3.scss'
})
export class Ejemplo3 {

  private parser:Parser3;
    
      texto:string = "";
      valida:boolean = false;

      constructor(parser:Parser3){
        this.parser = parser;
      }
    
      parsear(){
    
        try{
          let nodo:any = this.parser.parse(this.texto);
          this.valida = true;
          
        }catch(e:any){
          this.valida = false;
        }
    
      }
}
