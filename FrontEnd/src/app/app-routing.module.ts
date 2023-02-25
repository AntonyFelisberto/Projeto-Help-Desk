import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NavComponent } from './components/nav/nav.component';
import { TechnicalComponent } from './components/tecnico/technical-list/technical.component';
import { TecnicoCreateComponent } from './components/tecnico/tecnico-create/tecnico-create.component';
import { TecnicoUpdateComponent } from './components/tecnico/tecnico-update/tecnico-update.component';
import { AutenticationRouteGuard } from './services/guard/autentication-route.guard';
import { TecnicoDeleteComponent } from './components/tecnico/tecnico-delete/tecnico-delete.component';
import { ClientCreateComponent } from './components/client/client-create/client-create.component';
import { ClientUpdateComponent } from './components/client/client-update/client-update.component';
import { ClientDeleteComponent } from './components/client/client-delete/client-delete.component';
import { ClientListComponent } from './components/client/client-list/client-list.component';

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
          {path:'technical/update/:id',component:TecnicoUpdateComponent},
          {path:'technical/delete/:id',component:TecnicoDeleteComponent},

          {path:'client',component:ClientListComponent},
          {path:'client/create',component:ClientCreateComponent},
          {path:'client/update/:id',component:ClientUpdateComponent},
          {path:'client/delete/:id',component:ClientDeleteComponent},
        ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
