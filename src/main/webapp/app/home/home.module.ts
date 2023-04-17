import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { SharedModule } from 'app/shared/shared.module';
import { HOME_ROUTE } from './home.route';
import { HomeComponent } from './home.component';
import {ProductComponent} from "../product/product.component";

@NgModule({
  imports: [SharedModule, RouterModule.forChild([HOME_ROUTE
  ,
      {
        path: 'product',
        component: ProductComponent,
        data: {
          pageTitle: 'Product Management',
        }
      },
      {
        path: 'product/new',
        component: ProductComponent,
        data: {
          pageTitle: 'Welcome, Java Hipster!',
        }
      },
      {
        path: 'product/edit',
        component: ProductComponent,
        data: {
          pageTitle: 'Welcome, Java Hipster!',
        }
      },
  ]
  )],
  declarations: [HomeComponent],
})
export class HomeModule {}
