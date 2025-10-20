import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ejemplo3 } from './ejemplo3';

describe('Ejemplo3', () => {
  let component: Ejemplo3;
  let fixture: ComponentFixture<Ejemplo3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Ejemplo3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ejemplo3);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
