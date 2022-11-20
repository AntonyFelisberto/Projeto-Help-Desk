import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_CONFIG } from 'src/app/config/api.config';
import { Technical } from 'src/app/models/Technicals';

@Injectable({
  providedIn: 'root'
})
export class TecnicoService {

  constructor(private httpCliente:HttpClient) { }

  findAll():Observable<Technical[]>{
    return this.httpCliente.get<Technical[]>(`${API_CONFIG.baseUrl}/technical`)
  }


  create(technical:Technical): Observable<Technical>{
    return this.httpCliente.post<Technical>(`${API_CONFIG}/technical`,technical)
  }
  
}
