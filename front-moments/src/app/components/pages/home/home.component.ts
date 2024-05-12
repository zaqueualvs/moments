import {Component, OnInit} from '@angular/core';
import {MomentService} from "../../../services/moment.service";
import {Moment} from "../../../Moment";
import {environment} from "../../../../environments/environment";
import {NgForOf, NgIf} from "@angular/common";
import {RouterLink} from "@angular/router";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    NgForOf,
    NgIf,
    RouterLink
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit{

  allMoments: Moment[] =[];
  moments: Moment[] =[];
  baseApiUrl = environment.baseApiUrl;

  constructor(private momentService: MomentService) {
  }

  ngOnInit(): void {

    this.momentService.getMoments().subscribe((items) =>{
      items.map((item)=>{
        item.created_at = new Date(item.created_at!).toLocaleString('pt-BR');
      });
      this.allMoments = items;
      this.moments = items;
    });
  }

  exibirImagem(image: any) {
    return 'data:image/jpeg;base64,' + image;
  }

}
