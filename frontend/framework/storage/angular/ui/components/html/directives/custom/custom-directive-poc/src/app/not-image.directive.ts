import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appNotImage]'
})
export class NotImageDirective {

  constructor(private elementImg: ElementRef) {}
   
  
  @HostListener('error') 
    onError():void {
      this.elementImg.nativeElement.src = 'https://cdn.britannica.com/91/181391-050-1DA18304/cat-toes-paw-number-paws-tiger-tabby.jpg';
    }
  

}
