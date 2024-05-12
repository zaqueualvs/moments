import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../environments/environment";
import {Moment} from "../Moment";

@Injectable({
  providedIn: 'root'
})
export class MomentService {

  private baseApiUrl = environment.baseApiUrl;
  private apiUrl = `${this.baseApiUrl}api/moments`;

  constructor(private http: HttpClient) { }

  getMoments(): Observable<Moment[]> {
    return this.http.get<Moment[]>(this.apiUrl)
  }

  createMoment(formData: FormData): Observable<FormData>{
    console.log(formData.get('image'))
    return this.http.post<FormData>(this.apiUrl, formData);
  }
}
