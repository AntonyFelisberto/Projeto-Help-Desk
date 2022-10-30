import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Credentials } from 'src/app/models/Credentials';
import { AuthenticateService } from 'src/app/services/authenticate/authenticate.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  credentials:Credentials = {
    email:'',
    password:''
  };

  email = new FormControl(null, Validators.email)
  password = new FormControl(null, Validators.minLength(3))

  constructor(private toast: ToastrService,
              private loginService:AuthenticateService) { }

  ngOnInit(): void {
  }

  logar(){
    this.loginService.autenticate(this.credentials).subscribe( response =>{
      this.toast.info(response.headers.get('Authorization'))
      this.loginService.sucessFullLogin(response.headers.get('Authorization').substring(7));
    },() =>{
      this.toast.error('Usuario e/ou senha invalidos');
    })
  }

  validation():boolean{
    return this.email.valid && this.password.valid
  }

}
