import { Injectable } from '@angular/core';
import * as peggy from 'peggy';

@Injectable({ providedIn: 'root' })
export class ParserService {
  private parser!: peggy.Parser;

  constructor() {
    this.compileGrammar();
  }

  private compileGrammar() {
    
    const grammar = `
    
{
  // Inicializador: se ejecuta una vez al generar el parser
  let counter = 0;

  function nextId() {
    return ++counter;
  }
}

     
E
  = a:T "+" b:E { 
  let r = {};
    r.nodo = "nodo"+nextId();
    let s = "nodo"+nextId();
    r.codigo = a.codigo+ s + "[label = mas];" +b.codigo+ r.nodo + "[label = E];"+r.nodo+"->"+a.nodo+";"+r.nodo+"->"+s+";"+r.nodo+"->"+b.nodo+";";
    r.valor = a.valor + b.valor;
  return r;
  
  return a; 
  }
  / a:T "-" b:E { 
  let r = {};
    r.nodo = "nodo"+nextId();
    let s = "nodo"+nextId();
    r.codigo = a.codigo+ s + "[label = menos];" +b.codigo+ r.nodo + "[label = E];"+r.nodo+"->"+a.nodo+";"+r.nodo+"->"+s+";"+r.nodo+"->"+b.nodo+";";
    r.valor = a.valor - b.valor;
  return r;
  }
  / a:T { 
  let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = a.codigo + r.nodo + "[label = E];"+r.nodo+"->"+a.nodo+";"
    r.valor = a.valor;
  return r
  return a;}


T
  = a:F "*" b:T { 
  let r = {};
    r.nodo = "nodo"+nextId();
    let s = "nodo"+nextId();
    r.codigo = a.codigo+ s + "[label = por];" +b.codigo+ r.nodo + "[label = T];"+r.nodo+"->"+a.nodo+";"+r.nodo+"->"+s+";"+r.nodo+"->"+b.nodo+";";
    r.valor = a.valor * b.valor;
  return r; }
  / a:F "/" b:T { 
  let r = {};
    r.nodo = "nodo"+nextId();
    let s = "nodo"+nextId();
    r.codigo = a.codigo+ s + "[label = div];" +b.codigo+ r.nodo + "[label = T];"+r.nodo+"->"+a.nodo+";"+r.nodo+"->"+s+";"+r.nodo+"->"+b.nodo+";";
    r.valor = a.valor / b.valor;
  return r;
  }
  / a:F {
  let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = a.codigo + r.nodo + "[label = T];"+r.nodo+"->"+a.nodo+";";
    r.valor = a.valor;
  return r;
  }


F
  = "(" a:E ")" { 
    let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = a.codigo +r.nodo + "[label = F];"+r.nodo+"->"+a.nodo+";";
    r.valor = a.valor;
  return r;
  }
  / a:Number {
    let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = a.codigo + r.nodo + "[label = F];"+r.nodo+"->"+a.nodo+";";
    r.valor = a.valor;
    return r;
    }


Number
  = a:Decimal {return a;}
  / a:Integer {return a;}

Decimal
  = int:[0-9]+ "." frac:[0-9]+ {
  let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = r.nodo + "[label ="+ int.join("") + "." + frac.join("")+"];";
    r.valor = parseFloat(int.join("") + "." + frac.join("")); 
      return r;
    }

Integer
  = digits:[0-9]+ {
      let r = {};
    r.nodo = "nodo"+nextId();
    r.codigo = r.nodo + "[label ="+ digits.join("")+"];";
    r.valor = parseInt(digits.join(""), 10);
    return r;
    }

    `;
    this.parser = peggy.generate(grammar);
  }

  parse(expression: string): any {
    return this.parser.parse(expression);
  }
}
