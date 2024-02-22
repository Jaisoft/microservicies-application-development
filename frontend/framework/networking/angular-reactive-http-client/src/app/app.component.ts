import { Component, OnInit } from '@angular/core';
import { Post } from './post';
import { PostsService } from './posts.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'angular-reactive-http-client';
  post = {} as Post;
  posts: Post[] = [];

constructor(private postsService: PostsService) { }


ngOnInit() {
  this.getAll();
}

getAll() {
  this.postsService.get().subscribe((posts: Post[]) => {
    this.posts = posts;
  });
}  
}
