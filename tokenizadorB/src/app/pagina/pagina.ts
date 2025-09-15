import { Component } from '@angular/core';

@Component({
  selector: 'app-pagina',
  standalone: false,
  templateUrl: './pagina.html',
  styleUrl: './pagina.scss'
})
export class Pagina {

  displayedColumns: string[] = ['token', 'lexema', 'linea', 'columna'];
  dataSource: any = [];

  texto: string = "";

  tokenizar(){
    let estado = 'A';
    let linea = 1;
    let columna = 0;
    let token:any = {};
    let caracter = [...this.texto];
    this.dataSource = [];
    for(let i of caracter){
      let codigo:number = i.charCodeAt(0);
      columna++;
      switch(estado){
        case 'A':
          switch(codigo){
            case 43: //+
            token = this.crearToken('+','+',linea,columna); 
            break;
            case 44: //,
              token = this.crearToken(',',',',linea,columna);
            break;
            case 45: //-
              token = this.crearToken('-','-',linea,columna);
            break;
            case 10: // salto de linea
              linea ++;
              columna = 0;
              if(token.token) this.dataSource.push(token);
              token = {};
              
            break;
            case 32: //espacio
              if(token.token) this.dataSource.push(token);
              token = {};    
                        
            break;

            default:
              if(codigo>=48 && codigo<=57){
                token = this.crearToken('Numero',i,linea,columna);
                estado = 'B';
              }

          }
        break;
        case 'B':
          switch(codigo){
          case 10: // salto de linea
              linea ++;
              columna = 0;
              if(token.token) this.dataSource.push(token);
              token = {};
              estado = 'A';
            break;
            case 32: //espacio
              if(token.token) this.dataSource.push(token);
              token = {};   
              estado = 'A';           
            break;
            default:
              if(codigo>=48 && codigo<=57){
                token.lexema += i;
              }
          }
        break;
      }
      
    }
    if(token.token){ 
      this.dataSource.push(token);
    }

  }

  crearToken(token:any,lexema:any,linea:any,columna:any):any{
    let objeto:any = {};
    objeto.token = token;
    objeto.lexema = lexema;
    objeto.linea = linea;
    objeto.columna = columna;
    return objeto;
  }
}
