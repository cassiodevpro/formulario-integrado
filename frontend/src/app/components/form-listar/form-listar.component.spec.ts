import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormListarComponent } from './form-listar.component';

describe('FormListarComponent', () => {
  let component: FormListarComponent;
  let fixture: ComponentFixture<FormListarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormListarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormListarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
