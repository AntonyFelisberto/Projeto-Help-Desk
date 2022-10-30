import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { Credentials } from 'src/app/models/Credentials';

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

  constructor(private toast: ToastrService) { }

  ngOnInit(): void {
  }

  logar(){
    this.toast.error("Usuario e/ou senha invalidos!","Login")
    this.credentials.email = ''
    this.credentials.password = ''    
  }

  validation():boolean{
    if(this.email.valid && this.password.valid){
      return true;
    }else{
      return false;
    }
  }

}
