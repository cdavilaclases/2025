import { TestBed } from '@angular/core/testing';

import { ParserServicio } from './parser-servicio';

describe('ParserServicio', () => {
  let service: ParserServicio;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ParserServicio);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
