import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import {DeliveryBoysService} from '../../core/services/delivery-boys/delivery-boys.service';
import {DeliveryBoysModule} from '../delivery-boys/delivery-boys.module';
import {DashboardModule} from '../dashboard/dashboard.module';
import {DeliveryManagementModule} from '../delivery-management/delivery-management.module';
import {ShopManagementModule} from '../shop-management/shop-management.module';
import {DeliveryboyViewModule} from '../deliveryboy-view/deliveryboy-view.module';
import {SharedModule} from '../shared/shared.module';
import {LockedModule} from '../locked/locked.module';


@NgModule({
  imports: [
    CommonModule,
    HomeRoutingModule,
    DeliveryBoysModule,
    DeliveryManagementModule,
    ShopManagementModule,
    DashboardModule,
    DeliveryboyViewModule,
    SharedModule,
    LockedModule
  ],
  declarations: [HomeComponent],
})
export class HomeModule { }
