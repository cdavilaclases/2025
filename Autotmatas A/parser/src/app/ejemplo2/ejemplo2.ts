import { Component,ElementRef, ViewChild } from '@angular/core';
import { Parser2 } from './parser/parser2';
import * as d3 from 'd3';
import 'd3-graphviz';

@Component({
  selector: 'app-ejemplo2',
  standalone: false,
  templateUrl: './ejemplo2.html',
  styleUrl: './ejemplo2.css'
})
export class Ejemplo2 {

  @ViewChild('graphContainer', { static: true }) graphContainer!: ElementRef;
  
    texto:string="";
    valorDecimal:any = "";
  
    parserServicio:Parser2
  
    constructor(parserServicio:Parser2){
      this.parserServicio = parserServicio;
    }
  
    compilar(){
      try{
        let nodo:any = this.parserServicio.parse(this.texto);
        this.valorDecimal = nodo.val;
  
        alert("Es un binario");
      }
      catch(e:any){
        console.log(e);
        alert("No es un binario");
      }
    }
  
}
