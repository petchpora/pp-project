import { Component, Input } from '@angular/core' ;
@Component({
selector: 'app-todo',
templateUrl: './ToDoList.component.html',
styleUrls: ['./ToDoList.component.css']
})
export class ToDoListComponent {
@Input()
title: string;

todoArr =[];
newToDo:string;
addList(addToDo){
    this.todoArr.push(addToDo);
}
delList(pop){
    let delItem:number;
    delItem = this.todoArr.indexOf(pop);
    this.todoArr.splice(delItem, 1);
}

constructor() {}
}

