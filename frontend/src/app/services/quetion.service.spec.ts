import { TestBed } from '@angular/core/testing';
import { QuetaoService } from './questao.service';


describe('QuetionService', () => {
  let service: QuetaoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(QuetaoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
