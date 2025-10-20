import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Pagina } from './pagina/pagina';
import { Ejemplo2 } from './ejemplo2/ejemplo2';
import { Ejemplo3 } from './ejemplo3/ejemplo3';

const routes: Routes = [
  {path:'',component:Pagina},
  {path:'ejemplo2',component:Ejemplo2},
  {path:'ejemplo3',component:Ejemplo3}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
