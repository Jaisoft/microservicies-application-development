import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello.component';
import { FakeService } from './fake.service';
import { HttpClientModule } from '@angular/common/http';
import { ImageLoaderComponent } from './image-loader/image-loader.component';

@NgModule({
  imports: [BrowserModule, FormsModule, HttpClientModule],
  declarations: [
    AppComponent,
    HelloComponent,
    ImageLoaderComponent
  ],
  bootstrap: [AppComponent],
  providers: [FakeService]
})
export class AppModule {}