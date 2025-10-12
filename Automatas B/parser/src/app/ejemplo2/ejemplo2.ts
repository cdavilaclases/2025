import { Component,ElementRef, ViewChild } from '@angular/core';
import { Parser2 } from './parser/parser2';

import * as d3 from 'd3';
import 'd3-graphviz';
import { Parser } from '@angular/compiler';


@Component({
  selector: 'app-ejemplo2',
  standalone: false,
  templateUrl: './ejemplo2.html',
  styleUrl: './ejemplo2.scss'
})
export class Ejemplo2 {

  @ViewChild('graphContainer', { static: true }) graphContainer!: ElementRef;
  
    private parser:Parser2;
  
    texto:string = "";
    decimal:any="";
  
    constructor(parser:Parser2){
      this.parser = parser;
    }
  
    parsear(){
  
      try{
        let nodo:any = this.parser.parse(this.texto);
        
        this.decimal = nodo.val;
  
        alert("Es binario");
      }catch(e:any){
        alert("No es un binario")
      }
  
    }
  

}
