import { TestBed } from '@angular/core/testing';

import { Parser3 } from './parser3';

describe('Parser3', () => {
  let service: Parser3;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Parser3);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
