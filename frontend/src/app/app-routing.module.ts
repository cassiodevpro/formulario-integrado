import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormListarComponent } from './components/form-listar/form-listar.component';
import { FormAddQuestoesComponent } from './components/form-add-questoes/form-add-questoes.component';

const routes: Routes = [

     { path: '', redirectTo: 'home', pathMatch: 'full' },
     { path: 'questoes', component: FormListarComponent },
     { path: 'home', component: FormAddQuestoesComponent },
     { path: '**', redirectTo: 'home' }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
