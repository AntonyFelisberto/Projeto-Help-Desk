import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { apiConfig } from 'src/app/config/api.config';
import { Credentials } from 'src/app/models/Credentials';

@Injectable({
  providedIn: 'root'
})
export class AuthenticateService {

  constructor(private httpClient:HttpClient) { }

  autenticate(credentials:Credentials){
    return this.httpClient.post(`${apiConfig.baseUrl}/login`,credentials, {
      observe:'response',
      responseType:'text'
    });
  }

  sucessFullLogin(authToken:string){
    localStorage.setItem('token',authToken)
  }

}
