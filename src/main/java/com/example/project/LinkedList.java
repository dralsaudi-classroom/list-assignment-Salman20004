package com.example.project;

public class LinkedList<T> implements List<T>{
	private Node<T> head;
	private Node<T> current;
	
    public LinkedList() {
		head = current = null;
	}
	public boolean empty() {
		return head == null;
	}
	public boolean last() {
		return current.next == null;
	}
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T e) {
        current.data = e;
    }
    public void insert(T e) {
        if (empty()) {
            current = head = new Node<T>(e);
        } else {
            Node<T> tmp = current.next;
            current.next = new Node<T>(e);
            current = current.next;
            current.next = tmp;
        }
    }
    public void remove() {
        if (current == head) {
            head = head.next;
        } else {
            Node<T> tmp = head;
            while (tmp.next != current) {
                tmp = tmp.next;
            }
            tmp.next = current.next;
        }
        if (current.next == null) {
            current = head;
        } else {
            current = current.next;
        }
    }
    public T mostFrequentElement() {
        if(empty())return null ;
    	char most = 'N' ;
    	current = head;
    	
    	int a = 0 , b = 0 , c =0 , d=0 ,e=0;
    	while(last()==false) {
    		if((char)retrieve()=='A') {
    			a+=1;
    		}if((char)retrieve()=='B') {
    			b+=1;
    		}if((char)retrieve()=='C') {
    			c+=1;
    		}if((char)retrieve()=='D') {
    			d+=1;
    		}if((char)retrieve()=='E') {
    			e+=1;
    		}
    		if(a>b&&a>c&&a>d&&a>e) {
    			most = 'A';
    		}if(b>a&&b>c&&b>d&&b>e) {
    			most = 'B';

    		}if(c>b&&c>a&&c>d&&c>e) {
    			most = 'C';

    		}if(d>b&&d>c&&d>a&&d>e) {
    			most = 'D';

    		}if(e>b&&e>c&&e>d&&e>a) {
    			most = 'E';

    		}
    			
    		
    		findNext();
    	}
    	if((char)retrieve()=='A') {
			a+=1;
		}if((char)retrieve()=='B') {
			b+=1;
		}if((char)retrieve()=='C') {
			c+=1;
		}if((char)retrieve()=='D') {
			d+=1;
		}if((char)retrieve()=='E') {
			e+=1;
		}
		if(a>b&&a>c&&a>d&&a>e) {
			most = 'A';
		}if(b>a&&b>c&&b>d&&b>e) {
			most = 'B';

		}if(c>b&&c>a&&c>d&&c>e) {
			most = 'C';

		}if(d>b&&d>c&&d>a&&d>e) {
			most = 'D';

		}if(e>b&&e>c&&e>d&&e>a) {
			most = 'E';

		}
		current = head;  current = head;
		while(last()==false) {
			if(most==(char)retrieve()) {
				return (T)current;
			}
    		findNext();

		}
    	return (T)current;
        
    }
}