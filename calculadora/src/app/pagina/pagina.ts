import { Component, ElementRef, ViewChild, AfterViewInit } from '@angular/core';
import { ParserService } from '../parser/parser-service';
import * as d3 from 'd3';
import 'd3-graphviz';


@Component({
  selector: 'app-pagina',
  standalone: false,
  templateUrl: './pagina.html',
  styleUrl: './pagina.css'
})
export class Pagina 
implements AfterViewInit {
  @ViewChild('graphContainer', { static: true }) graphContainer!: ElementRef;

  ngAfterViewInit() {
    
  }


expresion = '';
  resultado: any = '';

  constructor(private parserService: ParserService) {}

  calcular() {
    try {
      this.resultado = this.parserService.parse(this.expresion);
      console.log(this.resultado);
      let grafo:any = d3.select(this.graphContainer.nativeElement);
      grafo.graphviz()
      .renderDot('digraph { '+this.resultado.codigo+' }');
    } catch (e) {
      this.resultado = 'Error en la expresión';
      console.log(e);
    }
  }

}
