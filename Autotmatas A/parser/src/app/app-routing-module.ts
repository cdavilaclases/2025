import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Pagina } from './pagina/pagina';
import { Ejemplo2 } from './ejemplo2/ejemplo2';
const routes: Routes = [
  {path:'',component:Pagina},
  {path:'ejemplo2',component:Ejemplo2}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
