package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        if(n>0 && list.empty()==false) {
    		
            list.findFirst();
            T tmp = list.retrieve();
            List <T> list2 ;
            int u = 0 ;
                while(list.last()==false) {
                    u+=1;
                    if(u>=n) {
                        tmp = list.retrieve();
                        list.insert(tmp);
                        
                    }
                    list.findNext();
                }
                list.findFirst();
                for(int i = 1 ; i <= n; i++) {
                    tmp = list.retrieve();
                    list.insert(tmp);
                    list.findNext();
                }
        }
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        {
            int n = 1;
            l1.findFirst();
            while(l1.last()==false) {
                l1.findNext();		n++;
            }
        while(n!=0) {
            l2.insert(l1.retrieve());
            l1.findPrevious();
            n--;
        }
            
    }

    
    	int n = 1;
    	l1.findFirst();
    	while(l1.last()==false) {
    		l1.findNext();		n++;
    	}
    while(n!=0) {
    	l2.insert(l1.retrieve());
    	l1.findPrevious();
    	n--;
    }
    
}
    }