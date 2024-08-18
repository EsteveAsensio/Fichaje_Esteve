import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpEmpleadoComponent } from './imp-empleado.component';

describe('ImpEmpleadoComponent', () => {
  let component: ImpEmpleadoComponent;
  let fixture: ComponentFixture<ImpEmpleadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ImpEmpleadoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ImpEmpleadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
