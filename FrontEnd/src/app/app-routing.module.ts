import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { NavComponent } from './components/nav/nav.component';
import { TechnicalComponent } from './components/technical/technical.component';

const routes: Routes = [
  {path:'',component:NavComponent, 
    children:[
      {path:'home',component:HomeComponent},
      {path:'technical',component:TechnicalComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
