import { Component,ElementRef, ViewChild } from '@angular/core';
import { ParserService } from '../parser-service';

import * as d3 from 'd3';
import 'd3-graphviz';

@Component({
  selector: 'app-pagina',
  standalone: false,
  templateUrl: './pagina.html',
  styleUrl: './pagina.scss'
})
export class Pagina {

  @ViewChild('graphContainer', { static: true }) graphContainer!: ElementRef;

  private parser:ParserService;

  texto:string = "";

  constructor(parser:ParserService){
    this.parser = parser;
  }

  parsear(){

    try{
      let nodo:any = this.parser.parse(this.texto);
      let codigo = 'digraph { '+nodo.codigo+' }';
      let grafo:any = d3.select(this.graphContainer.nativeElement);
      grafo.graphviz()
      .renderDot(codigo);

      alert("Es binario");
    }catch(e:any){
      alert("No es un binario")
    }

  }


}
