import { Component , Input  } from '@angular/core';

@Component({
  selector: 'app-image-loader',
  templateUrl: './image-loader.component.html',
  styleUrls: ['./image-loader.component.css']
})
export class ImageLoaderComponent {
  
  @Input() imageLoading: boolean = false;
  @Input() imageLoaded: boolean = false;
  @Input() imageUrl: string = '';
  @Input() imageLoadingUrl: string = '';
  @Input() noImageUrl: string = '';
  @Input() alt: string = '';
  @Input() imageId: string = '';
  @Input() imageHeight: string = '';
  @Input() imageWidth: string = '';
  @Input() imageClass: string = '';

  onImageLoaded() {
    this.imageLoading = false;
  }

  handleEmptyImage() {
    this.imageLoading = false;
    this.imageUrl = this.noImageUrl;
  }

}
