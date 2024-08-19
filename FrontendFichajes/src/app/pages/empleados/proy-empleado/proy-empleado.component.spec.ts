import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProyEmpleadoComponent } from './proy-empleado.component';

describe('ProyEmpleadoComponent', () => {
  let component: ProyEmpleadoComponent;
  let fixture: ComponentFixture<ProyEmpleadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ProyEmpleadoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProyEmpleadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
