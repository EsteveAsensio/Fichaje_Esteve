import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyAdminComponent } from './proy-admin.component';

describe('ProyAdminComponent', () => {
  let component: ProyAdminComponent;
  let fixture: ComponentFixture<ProyAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProyAdminComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProyAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
