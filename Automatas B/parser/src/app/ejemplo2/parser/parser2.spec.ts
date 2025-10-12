import { TestBed } from '@angular/core/testing';

import { Parser2 } from './parser2';

describe('Parser2', () => {
  let service: Parser2;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Parser2);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
