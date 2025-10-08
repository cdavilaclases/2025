import { Component,ElementRef, ViewChild } from '@angular/core';
import { ParserServicio } from '../parser-servicio';
import * as d3 from 'd3';
import 'd3-graphviz';

@Component({
  selector: 'app-pagina',
  standalone: false,
  templateUrl: './pagina.html',
  styleUrl: './pagina.css'
})
export class Pagina {

  @ViewChild('graphContainer', { static: true }) graphContainer!: ElementRef;

  texto:string="";

  parserServicio:ParserServicio

  constructor(parserServicio:ParserServicio){
    this.parserServicio = parserServicio;
  }

  compilar(){
    try{
      let nodo:any = this.parserServicio.parse(this.texto);
      console.log(nodo);
      console.log(nodo.codigo);
      console.log(nodo.numero);

      let grafo:any = d3.select(this.graphContainer.nativeElement);
      grafo.graphviz()
      .renderDot('digraph { '+nodo.codigo+' }');

      alert("Es un binario");
    }
    catch(e:any){
      console.log(e);
      alert("No es un binario");
    }
  }

}
