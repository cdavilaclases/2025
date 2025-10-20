import { Component } from '@angular/core';
import { Parser3 } from './parser/parser3';

@Component({
  selector: 'app-ejemplo3',
  standalone: false,
  templateUrl: './ejemplo3.html',
  styleUrl: './ejemplo3.css'
})
export class Ejemplo3 {
texto:string="";
    valorDecimal:any = "";
  
    parserServicio:Parser3;
    valida:boolean = false;
  
    constructor(parserServicio:Parser3){
      this.parserServicio = parserServicio;
    }
  
    compilar(){
      try{
        let nodo:any = this.parserServicio.parse(this.texto);
        this.valida = true;
      }
      catch(e:any){
        this.valida = false;
      }
    }
}
