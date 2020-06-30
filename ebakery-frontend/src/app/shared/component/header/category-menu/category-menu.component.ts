import { Component, OnInit } from '@angular/core';
import { Category } from '../../../model/category';
import { CategoryService } from '../../../service/category.service';

@Component({
  selector: 'app-category-menu',
  templateUrl: './category-menu.component.html',
  styleUrls: ['./category-menu.component.scss'],
})
export class CategoryMenuComponent implements OnInit {
  categories: Category[];

  constructor(private categoryService: CategoryService) {
  }

  ngOnInit() {
    this.listCategories();
  }

  listCategories() {
    this.categoryService.getCategories$().subscribe((data) => {
      this.categories = data;
    });
  }
}
