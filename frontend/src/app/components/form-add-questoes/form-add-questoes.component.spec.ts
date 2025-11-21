import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormAddQuestoesComponent } from './form-add-questoes.component';

describe('FormAddQuestoesComponent', () => {
  let component: FormAddQuestoesComponent;
  let fixture: ComponentFixture<FormAddQuestoesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormAddQuestoesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormAddQuestoesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
