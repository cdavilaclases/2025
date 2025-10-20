import { NgModule, provideBrowserGlobalErrorListeners, provideZonelessChangeDetection } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing-module';
import { App } from './app';

import { FormsModule } from '@angular/forms';
import { Pagina } from './pagina/pagina';
import { Ejemplo2 } from './ejemplo2/ejemplo2';
import { Ejemplo3 } from './ejemplo3/ejemplo3';


@NgModule({
  declarations: [
    App,
    Pagina,
    Ejemplo2,
    Ejemplo3
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZonelessChangeDetection()
  ],
  bootstrap: [App]
})
export class AppModule { }
