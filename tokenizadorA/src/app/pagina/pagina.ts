import { Component } from '@angular/core';

@Component({
  selector: 'app-pagina',
  standalone: false,
  templateUrl: './pagina.html',
  styleUrl: './pagina.scss'
})
export class Pagina {

  displayedColumns: string[] = ['token', 'lexema', 'fila', 'columna'];
  dataSource: any = [];

  codigo: string = "";

  tokenizar() {
    this.dataSource = [];
    let fila = 1;
    let columna = 0;
    let estado = 'A';
    let token: any = {};
    let simbolos = [...this.codigo];

    for (let c of simbolos) {
      columna++;
      let codigo = c.charCodeAt(0);

      switch (estado) {
        case 'A':
          switch (codigo) {
            case 43: //+
              token = this.crearToken("+","+",fila,columna);
              break;
            case 44: //,
              token = this.crearToken(",",",",fila,columna);
              break;
            case 45: //-
              token = this.crearToken("-","-",fila,columna);
              break;
            case 10: //salto de linea
              if (token.token) this.dataSource.push(token);
              token = {};
              fila++;
              columna = 0;
              break;
            case 32: //espacio
              if (token.token) this.dataSource.push(token);
              token = {};
              break;
            default:
              if (codigo >= 46 && codigo <= 57) {
               token = this.crearToken("Numero",c,fila,columna);
                estado = 'B';
              }
          }
          break;
          case 'B':
            switch(codigo){
              case 10: //salto de linea
              if (token.token) this.dataSource.push(token);
              token = {};
              fila++;
              columna = 0;
              estado = "A";
              break;
            case 32: //espacio
              if (token.token) this.dataSource.push(token);
              token = {};
              estado = "A";
              break;
            default:
              if (codigo >= 46 && codigo <= 57) {
                token.lexema += c;               
              }
            }
          break;
          
      }

    }
    if (token.token) this.dataSource.push(token);
  }

  crearToken(token:any,lexema:any,fila:any,columna:any){
    let objeto:any = {};
    objeto.token = token;
    objeto.lexema = lexema;
    objeto.fila = fila;
    objeto.columna = columna;
    return objeto;
  }
}
