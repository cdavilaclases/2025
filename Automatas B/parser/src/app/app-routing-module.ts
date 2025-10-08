import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { Pagina } from './pagina/pagina';

const routes: Routes = [
  {path:'',component:Pagina}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
