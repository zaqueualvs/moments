import { Component } from '@angular/core';
import {FaIconComponent} from "@fortawesome/angular-fontawesome";
import {faTimes} from "@fortawesome/free-solid-svg-icons/faTimes";
import {MessagesService} from "../../services/messages.service";
import {NgIf} from "@angular/common";

@Component({
  selector: 'app-messages',
  standalone: true,
  imports: [
    FaIconComponent,
    NgIf
  ],
  templateUrl: './messages.component.html',
  styleUrl: './messages.component.css'
})
export class MessagesComponent {

  protected readonly faTimes = faTimes;
  constructor(public messagesService: MessagesService) {
  }
}
