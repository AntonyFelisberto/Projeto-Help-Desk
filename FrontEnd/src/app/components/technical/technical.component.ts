import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Technical } from 'src/app/models/Technicals';

@Component({
  selector: 'app-technical',
  templateUrl: './technical.component.html',
  styleUrls: ['./technical.component.css']
})
export class TechnicalComponent implements OnInit {

  ELEMENT_DATA: Technical[] = [
      {
        id:1,
        name:'antony',
        cpf:'123.456.789-10',
        email:'antony@gmail.com',
        password:'1234',
        profile:['0'],
        dateCreation:'29/10/2022'
      }
    ]

  constructor() { }

  ngOnInit(): void {
  }

  displayedColumns: string[] = ['id', 'name', 'cpf', 'email','actions'];
  dataSource = new MatTableDataSource<Technical>(this.ELEMENT_DATA);

  @ViewChild(MatPaginator) paginator: MatPaginator;

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
  }

}
