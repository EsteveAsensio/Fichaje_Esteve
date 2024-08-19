import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpAdminComponent } from './imp-admin.component';

describe('ImpAdminComponent', () => {
  let component: ImpAdminComponent;
  let fixture: ComponentFixture<ImpAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ImpAdminComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ImpAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
