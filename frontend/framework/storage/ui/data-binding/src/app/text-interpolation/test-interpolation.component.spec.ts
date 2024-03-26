import {ComponentFixture, TestBed, waitForAsync} from '@angular/core/testing';
import { TextInterpolationComponent } from './text-interpolation.component';

describe('TextInterpolationComponent', () => {
  let textInterpolationComponent: TextInterpolationComponent;
  let fixture: ComponentFixture<TextInterpolationComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({imports: [TextInterpolationComponent]})
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextInterpolationComponent);
    textInterpolationComponent = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(textInterpolationComponent).toBeDefined();
  });

	it('should see title embeded into h3 tag', () => {
		const H3 = fixture.nativeElement.querySelector("h3");
		expect(textInterpolationComponent.title)
		.withContext('title embeded inside the <h3> tag')
		.toEqual(H3.textContent);
	});


  it('should see inputValue embeded in input tag', () => {
		const INPUT = fixture.nativeElement.querySelector("input");
		expect(textInterpolationComponent.inputValue)
		.withContext('inputValue embeded as a value inside the <input> tag')
		.toContain(INPUT.value);
	});


});