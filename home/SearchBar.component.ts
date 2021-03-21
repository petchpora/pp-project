import { Component, Input } from '@angular/core' ;
@Component({
selector: 'searchBar',
templateUrl: './SearchBar.component.html',
styleUrls: ['./SearchBar.component.css']
})
export class SearchBarComponent {

@Input()
title: string;

    find(){
        alert('Try typing "iphone" and see the result ;)')
    }
constructor() {}
}

