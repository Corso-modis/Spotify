import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestioneBraniComponent } from './gestione-brani.component';

describe('GestioneBraniComponent', () => {
  let component: GestioneBraniComponent;
  let fixture: ComponentFixture<GestioneBraniComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GestioneBraniComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GestioneBraniComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
