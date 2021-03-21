import { Component } from '@angular/core' ;
@Component({
selector: 'app-catag',
templateUrl: './CatagoryMenu.component.html',
styleUrls: ['./CatagoryMenu.component.css']
})
export class CatagComponent {
    phone=["iPhong", 'Samsun', 'OPPA', 'WEWO']
    toy=['fixma', 'nendoy', 'prime2', 'Bantai']
    com=['nsi', 'Lovenovo', 'spacer', 'EL-G', 'Samsun', 'McBook']
    book=['Nein-in', 'C-ED', 'Webulgid', 'amaron', 'National']
    shoe=['NIKY', 'adidos', 'Onizaki', 'SKETCHING', 'UWU']
    drink=['Cola', 'Cocoa', 'Coffee', 'Milk shake', 'Green tea']

    itemClick(){
        alert('Sorry, out of stock!')
    }
constructor() {}
}