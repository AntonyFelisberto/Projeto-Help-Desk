import { Injectable } from '@angular/core';
import {HttpRequest,HttpHandler,HttpEvent,HttpInterceptor} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    let token = localStorage.getItem('token');

    if(token){
      const clonarRequisicao = request.clone({headers: request.headers.set('Authorization',`Bearer ${token}`)})
      return next.handle(clonarRequisicao)
    }else{
      return next.handle(request);
    } 
  }
}


