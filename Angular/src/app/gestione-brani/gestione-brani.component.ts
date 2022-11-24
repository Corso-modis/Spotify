import { Component } from '@angular/core';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

type BranoMusicale = {
  id: number;
  titolo: string;
  autore: string;
};

type BranoNumeroAscolti = {
  branoMusicale: BranoMusicale;
  numeroAscolti: number;
};

@Injectable({
  providedIn: 'root',
})
@Component({
  selector: 'app-gestione-brani',
  templateUrl: './gestione-brani.component.html',
  styleUrls: ['./gestione-brani.component.css'],
})
export class GestioneBraniComponent {
  isVisibile = false;
  brano: BranoMusicale = {
    id: 0,
    titolo: '',
    autore: '',
  };
  brani: BranoNumeroAscolti[] = [];

  constructor(private http: HttpClient) {}

  toggleForm() {
    if (this.isVisibile == false) {
      this.isVisibile = true;
    } else {
      this.isVisibile = false;
    }
  }

  loadBrano() {
    this.http
      .get('http://localhost:8080/brani/ascolti')
      .subscribe((data: any) => {
        this.brani = data as BranoNumeroAscolti[];
      });
  }

  sendBrano(brano: any) {
    let requestBody = brano;
    this.http
      .post('http://localhost:8080/brani/api', requestBody)
      .subscribe(() => this.loadBrano());
    this.toggleForm();
  }

  sendAscolto(id: number) {
    this.http
      .post('http://localhost:8080/brani/api/ascolto/' + id, null)
      .subscribe(() => this.loadBrano());
  }
}
