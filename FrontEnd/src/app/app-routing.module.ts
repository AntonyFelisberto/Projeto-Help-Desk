import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NavComponent } from './components/nav/nav.component';
import { TechnicalComponent } from './components/technical-list/technical.component';
import { TecnicoCreateComponent } from './components/tecnico-create/tecnico-create.component';
import { AutenticationRouteGuard } from './services/guard/autentication-route.guard';

const routes: Routes = [
  {
    path:'login',component:LoginComponent
  },
  {
    path:'',component:NavComponent,
      canActivate:[AutenticationRouteGuard],
        children:[
          {path:'home',component:HomeComponent},
          {path:'technical',component:TechnicalComponent},
          {path:'technical/create',component:TecnicoCreateComponent},
          {path:'technical/update/:id',component:TecnicoCreateComponent}
        ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
