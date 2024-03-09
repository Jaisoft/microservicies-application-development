import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MainpageComponent } from './mainpage/mainpage.component';
import { RegisterComponent } from './register/register.component';

const routes: Routes = [
  { path: "", component: LoginComponent},
  { path: "register", component: RegisterComponent},
  { path: "mainpage", component: MainpageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [MainpageComponent, LoginComponent, RegisterComponent]
