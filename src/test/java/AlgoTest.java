package test.java;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

//import java.util.Vector;

//import org.junit.jupiter.api.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	//Should return sequence 2,3,4,5,6
	@Test
	public void testBubbleSort() {
		SortAlgos test =new SortAlgos();
		Item one= new Item(4);
		Item two= new Item(3);
		Item three= new Item(6);
		Item four= new Item(2);
		Item five= new Item(5);
		//Item[] arr= new Item[] {one,two,three,four,five};
		
		Item[] v = new Item[] {one,two,three,four,five};
		Item[] v1 = new Item[] {one,two,three,four,five};
		test.bubbleSort(v);
		test.bubbleSort(v1);
		for(int i =0;i<v.length;i++) {
			assert(v[i]==v1[i]);
		}
		
	}

	////Should return sequence 2,3,4,5,6
	@Test
	public void testMergesort() {
		SortAlgos test =new SortAlgos();
		Item one= new Item(4);
		Item two= new Item(3);
		Item three= new Item(6);
		Item four= new Item(2);
		Item five= new Item(5);
		Item[] v = new Item[] {one,two,three,four,five};
		Item[] v1 = new Item[] {one,two,three,four,five};
		test.mergeSort(v);
		test.mergeSort(v1);
		for(int i =0;i<v.length;i++) {
			assert(v[i]==v1[i]);
		}
		
	}
	//Should return sequence 2,3,4,5,6
		@Test
		public void testSelectionSort() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(4);
			Item two= new Item(3);
			Item three= new Item(6);
			Item four= new Item(2);
			Item five= new Item(5);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.selectionSort(v);
			test.selectionSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);
			}
			
	}
		//Should return sequence 2,2,3,5,6
		@Test
		public void testInsertionSort() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(2);
			Item two= new Item(3);
			Item three= new Item(6);
			Item four= new Item(2);
			Item five= new Item(5);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.insertionSort(v);
			test.insertionSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);
			}
			
	}
		//Should return 2,2,3,5,6
		@Test
		public void testQuickSort() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(2);
			Item two= new Item(3);
			Item three= new Item(6);
			Item four= new Item(2);
			Item five= new Item(5);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.quickSort(v);
			test.quickSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);
			}
		}	
		//Should return 2,2,3,5,6
	@Test
	public void testHeapSort() {
		SortAlgos test =new SortAlgos();
		Item one= new Item(2);
		Item two= new Item(3);
		Item three= new Item(6);
		Item four= new Item(2);
		Item five= new Item(5);
		Item[] v = new Item[] {one,two,three,four,five};
		Item[] v1 = new Item[] {one,two,three,four,five};
		test.heapSort(v);
		test.heapSort(v1);
		for(int i =0;i<v.length;i++) {
			assert(v[i]==v1[i]);
		}
		}
		//Should return 3,6,71,392,500
		@Test
		public void testQuickSort2() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(71);
			Item two= new Item(3);
			Item three= new Item(6);
			Item four= new Item(392);
			Item five= new Item(500);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.quickSort(v);
			test.quickSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);

}
}
		//Should return 5,39,100,200,600
	@Test
	public void testHeapSort2() {
		SortAlgos test =new SortAlgos();
		Item one= new Item(100);
		Item two= new Item(39);
		Item three= new Item(600);
		Item four= new Item(200);
		Item five= new Item(5);
		Item[] v = new Item[] {one,two,three,four,five};
		Item[] v1 = new Item[] {one,two,three,four,five};
		test.heapSort(v);
		test.heapSort(v1);
		for(int i =0;i<v.length;i++) {
			assert(v[i]==v1[i]);
		
		}
}
		//Should return 4,4,4,4,4
	    @Test
		public void testSelectionSort2() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(4);
			Item two= new Item(4);
			Item three= new Item(4);
			Item four= new Item(4);
			Item five= new Item(4);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.selectionSort(v);
			test.selectionSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);
			}
		}
			//Should return sequence 16,21,29,30,50
		    @Test
			public void testInsertionSort2() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(21);
				Item two= new Item(30);
				Item three= new Item(16);
				Item four= new Item(29);
				Item five= new Item(50);
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.insertionSort(v);
				test.insertionSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
				
			}	
			//Should return 200,999,999,999,999
		@Test
		public void testHeapSort3() {
			SortAlgos test =new SortAlgos();
			Item one= new Item(999);
			Item two= new Item(999);
			Item three= new Item(999);
			Item four= new Item(200);
			Item five= new Item(999);
			Item[] v = new Item[] {one,two,three,four,five};
			Item[] v1 = new Item[] {one,two,three,four,five};
			test.heapSort(v);
			test.heapSort(v1);
			for(int i =0;i<v.length;i++) {
				assert(v[i]==v1[i]);
			
			}
}
			//Should return sequence 3,12,22,5111,69999
			@Test
			public void testInsertionSort3() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(12);
				Item two= new Item(3);
				Item three= new Item(69999);
				Item four= new Item(22);
				Item five= new Item(5111);
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.insertionSort(v);
				test.insertionSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
}
			
			//Should return sequence 3,12,22,5111,69999
			@Test
			public void testQuickSort3() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(12);
				Item two= new Item(3);
				Item three= new Item(69999);
				Item four= new Item(22);
				Item five= new Item(5111);
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.quickSort(v);
				test.quickSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
}
			//Should return sequence 0,0,3,6,5
			@Test
			public void testBubbleSort3() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(0);
				Item two= new Item(3);
				Item three= new Item(6);
				Item four= new Item(0);
				Item five= new Item(5);
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.bubbleSort(v);
				test.bubbleSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 01,26,033,33,53
			@Test
			public void testBubbleSort4() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(01);
				Item two= new Item(33);
				Item three= new Item(26);
				Item four= new Item(033);
				Item five= new Item(53);
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.bubbleSort(v);
				test.bubbleSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 1,999,9999,100000,9999999
			@Test
			public void testBubbleSort5() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(9999999);
				Item two= new Item(100000);
				Item three= new Item(1);
				Item four= new Item(999);
				Item five= new Item(9999);
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.bubbleSort(v);
				test.bubbleSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 40,50,60,70,80
			@Test
			public void testBubbleSort6() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(80);
				Item two= new Item(60);
				Item three= new Item(70);
				Item four= new Item(40);
				Item five= new Item(50);
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five};
				Item[] v1 = new Item[] {one,two,three,four,five};
				test.bubbleSort(v);
				test.bubbleSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
			@Test
			public void testBubbleSort7() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(80);
				Item two= new Item(60);
				Item three= new Item(70);
				Item four= new Item(110);
				Item five= new Item(511);
				Item six= new Item(700);
				Item seven= new Item(10);
				Item eight= new Item(380);
				Item nine= new Item(20);
				Item ten= new Item(699);
				
				Item eleven= new Item(200);
				
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				test.bubbleSort(v);
				test.bubbleSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
			@Test
			public void testInsertionsort() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(80);
				Item two= new Item(60);
				Item three= new Item(70);
				Item four= new Item(110);
				Item five= new Item(511);
				Item six= new Item(700);
				Item seven= new Item(10);
				Item eight= new Item(380);
				Item nine= new Item(20);
				Item ten= new Item(699);
				
				Item eleven= new Item(200);
				
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				test.insertionSort(v);
				test.insertionSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
			@Test
			public void testQuicksort() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(80);
				Item two= new Item(60);
				Item three= new Item(70);
				Item four= new Item(110);
				Item five= new Item(511);
				Item six= new Item(700);
				Item seven= new Item(10);
				Item eight= new Item(380);
				Item nine= new Item(20);
				Item ten= new Item(699);
				
				Item eleven= new Item(200);
				
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				test.quickSort(v);
				test.quickSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
			//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
			@Test
			public void testHeapSort6() {
				SortAlgos test =new SortAlgos();
				Item one= new Item(80);
				Item two= new Item(60);
				Item three= new Item(70);
				Item four= new Item(110);
				Item five= new Item(511);
				Item six= new Item(700);
				Item seven= new Item(10);
				Item eight= new Item(380);
				Item nine= new Item(20);
				Item ten= new Item(699);
				
				Item eleven= new Item(200);
				
				//Item[] arr= new Item[] {one,two,three,four,five};
				
				Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
				test.heapSort(v);
				test.heapSort(v1);
				for(int i =0;i<v.length;i++) {
					assert(v[i]==v1[i]);
				}
			}
				//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
			@Test
				public void testHeapSort16() {
					SortAlgos test =new SortAlgos();
					Item one= new Item(0);
					Item two= new Item(0);
					Item three= new Item(70);
					Item four= new Item(110);
					Item five= new Item(511);
					Item six= new Item(70);
					Item seven= new Item(10);
					Item eight= new Item(380);
					Item nine= new Item(20);
					Item ten= new Item(699);
					
					Item eleven= new Item(200);
					
					//Item[] arr= new Item[] {one,two,three,four,five};
					
					Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
					Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
					test.heapSort(v);
					test.heapSort(v1);
					for(int i =0;i<v.length;i++) {
						assert(v[i]==v1[i]);
					}
				}
					//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
				@Test
					public void testHeapSort63() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(200);
						
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
						test.heapSort(v);
						test.heapSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
			}
			
				
					//Should return sequence 1,999,9999,100000,9999999
					@Test
					public void testBubbleSort95() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(9999999);
						Item two= new Item(100000);
						Item three= new Item(1);
						Item four= new Item(999);
						Item five= new Item(9999);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.bubbleSort(v);
						test.bubbleSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					////Should return sequence 2,3,4,5,6
					@Test
					public void testMergesort5() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(40000);
						Item two= new Item(300);
						Item three= new Item(699998);
						Item four= new Item(66662);
						Item five= new Item(57777);
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
						}
					////Should return sequence 2,3,4,5,6
					@Test
					public void testMergesort60() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(4990);
						Item two= new Item(4003);
						Item three= new Item(1699);
						Item four= new Item(2000);
						Item five= new Item(5);
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
						
}
					////Should return sequence 2,3,4,5,6
					@Test
					public void testMergesort560() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(4990);
						Item two= new Item(3);
						Item three= new Item(9);
						Item four= new Item(20);
						Item five= new Item(5);
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					//Should return sequence 2,3,4,5,6
					@Test
					public void testSelectionSort8() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(60);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(10);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(200);
						
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven};
						
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
						
				}
					//Should return sequence 10,20,60,70,80,110,200,380,511,699,700
					@Test
					public void testHeapSort663() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(6);
						Item twelv= new Item(66);
						Item thirten= new Item(89);
						Item fourteen= new Item(1);
						Item fifteen= new Item(200);
						Item sixteen= new Item(2090);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.heapSort(v);
						test.heapSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testmergeSort663() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(6);
						Item twelv= new Item(66);
						Item thirten= new Item(89);
						Item fourteen= new Item(1);
						Item fifteen= new Item(200);
						Item sixteen= new Item(2090);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testmergeSorting663() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(6);
						Item twelv= new Item(66);
						Item thirten= new Item(89);
						Item fourteen= new Item(1);
						Item fifteen= new Item(200);
						Item sixteen= new Item(2090);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testSelection() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(6);
						Item twelv= new Item(66);
						Item thirten= new Item(89);
						Item fourteen= new Item(1);
						Item fifteen= new Item(200);
						Item sixteen= new Item(2090);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.selectionSort(v);
						test.selectionSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testinsertionSort663() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(80);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(511);
						Item six= new Item(700);
						Item seven= new Item(0);
						Item eight= new Item(380);
						Item nine= new Item(20);
						Item ten= new Item(699);
						
						Item eleven= new Item(6);
						Item twelv= new Item(66);
						Item thirten= new Item(89);
						Item fourteen= new Item(1);
						Item fifteen= new Item(200);
						Item sixteen= new Item(2090);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.insertionSort(v);
						test.insertionSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testinsertionSort63() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(800);
						Item two= new Item(600);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(591);
						Item six= new Item(7);
						Item seven= new Item(0);
						Item eight= new Item(80);
						Item nine= new Item(0);
						Item ten= new Item(9);
						
						
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten};
						test.insertionSort(v);
						test.insertionSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					@Test
					public void testBubblesort() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(800);
						Item two= new Item(6);
						Item three= new Item(70);
						Item four= new Item(110);
						Item five= new Item(1);
						Item six= new Item(79);
						Item seven= new Item(0);
						Item eight= new Item(800);
						Item nine= new Item(0);
						Item ten= new Item(98);
						
						Item eleven= new Item(16);
						Item twelv= new Item(6);
						Item thirten= new Item(79);
						Item fourteen= new Item(1);
						Item fifteen= new Item(290);
						Item sixteen= new Item(29);
						//Item[] arr= new Item[] {one,two,three,four,five};
						
						Item[] v = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelv,thirten,fourteen,fifteen};
						test.bubbleSort(v);
						test.bubbleSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					////Should return sequence 2,3,4,5,6
					@Test
					public void testInsertionsrt() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(14);
						Item two= new Item(3);
						Item three= new Item(6999);
						Item four= new Item(2);
						Item five= new Item(777775);
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.insertionSort(v);
						test.insertionSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
						
					}
					////Should return sequence 2,3,4,5,6
					@Test
					public void testMergeSort() {
						SortAlgos test =new SortAlgos();
						Item one= new Item(400);
						Item two= new Item(3000000);
						Item three= new Item(5555556);
						Item four= new Item(2);
						Item five= new Item(5);
						Item[] v = new Item[] {one,two,three,four,five};
						Item[] v1 = new Item[] {one,two,three,four,five};
						test.mergeSort(v);
						test.mergeSort(v1);
						for(int i =0;i<v.length;i++) {
							assert(v[i]==v1[i]);
						}
					}
					////Should return sequence 2,3,4,5,6
					@Test
						public void testInsertionsOrt() {
							SortAlgos test =new SortAlgos();
							Item one= new Item(14);
							Item two= new Item(3);
							Item three= new Item(6999);
							Item four= new Item(2);
							Item five= new Item(80);
							Item six= new Item(1111);
							Item seven= new Item(777775);
							Item eight= new Item(2233);
							Item nine= new Item(22);
							Item ten= new Item(3535);
							Item[] v = new Item[] {one,two,three,four,five,six,seven,eight};
							Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight};
							test.insertionSort(v);
							test.insertionSort(v1);
							for(int i =0;i<v.length;i++) {
								assert(v[i]==v1[i]);
							}
						}
						@Test
							public void testMergesort68() {
								SortAlgos test =new SortAlgos();
								Item one= new Item(4990);
								Item two= new Item(3);
								Item three= new Item(9);
								Item four= new Item(20);
								Item five= new Item(239);
								Item six= new Item(335);
								Item seven= new Item(5000);
								Item eight= new Item(52);
								Item[] v = new Item[] {one,two,three,four,five,six,seven,eight};
								Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight};
								test.mergeSort(v);
								test.mergeSort(v1);
								for(int i =0;i<v.length;i++) {
									assert(v[i]==v1[i]);
								}
							}
							////Should return sequence 2,3,4,5,6
							@Test
							public void testMergesorting60() {
								SortAlgos test =new SortAlgos();
								Item one= new Item(0);
								Item two= new Item(4003);
								Item three= new Item(0);
								Item four= new Item(0);
								Item five= new Item(1);
								Item six= new Item(52);
								Item seven= new Item(35);
								Item eight= new Item(59);
								Item[] v = new Item[] {one,two,three,four,five,six,seven,eight};
								Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight};
								test.mergeSort(v);
								test.mergeSort(v1);
								for(int i =0;i<v.length;i++) {
									assert(v[i]==v1[i]);
								}
								
					}
							////Should return sequence 2,3,4,5,6
							@Test
							public void testMerge60() {
								SortAlgos test =new SortAlgos();
								Item one= new Item(0);
								Item two= new Item(4003);
								Item three= new Item(0);
								Item four= new Item(0);
								Item five= new Item(1);
								Item six= new Item(52);
								Item seven= new Item(35);
								Item eight= new Item(59);
								Item[] v = new Item[] {one,two,three,four,five,six,seven,eight};
								Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight};
								test.mergeSort(v);
								test.mergeSort(v1);
								for(int i =0;i<v.length;i++) {
									assert(v[i]==v1[i]);
								}
							}
							////Should return sequence 2,3,4,5,6
							@Test
							public void testMergeSORT() {
								SortAlgos test =new SortAlgos();
								Item one= new Item(0);
								Item two= new Item(4003);
								Item three= new Item(0);
								Item four= new Item(0);
								Item five= new Item(1);
								Item six= new Item(52);
								Item seven= new Item(35);
								Item eight= new Item(59);
								Item[] v = new Item[] {one,two,three,four,five,six,seven,eight};
								Item[] v1 = new Item[] {one,two,three,four,five,six,seven,eight};
								test.mergeSort(v);
								test.mergeSort(v1);
								for(int i =0;i<v.length;i++) {
									assert(v[i]==v1[i]);
								}
}
				

}
