package AntraPamoka;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lambda1 {
	
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,8,5,2,4,5,2,55,5,5,5,5,5,2,2,2,1,1);
        for(Integer i : list){
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        
        System.out.println();
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");

        }
        
        System.out.println();
        
        int i=0;
        do{
            System.out.print(list.get(i++)+" ");
        }
        while(i<list.size());
        
        System.out.println();
        
        int sizes = list.size();
        while(sizes>0){
            System.out.print(list.get(list.size()-sizes--)+" ");
        }
        
        System.out.println();

        list.forEach(x-> System.out.print(x+" "));
        
        System.out.println();
        
        list.forEach(t-> {
             t=t*t*t;
            System.out.print(t+" ");
        }
        );

        for(Integer sk: list){
            kubas(sk);
        }

    }
    
    
    public static void kubas(int x){
        int kubas = x*x*x;
        System.out.println(kubas+" ");
    }

}
