package createClasses.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import javax.print.attribute.standard.MediaSize.Other;

class practice{
	
public static class Data{
		int id;
		String name;
		Data(int i, String n){
			id=i;
			name=n;
		}
		
		@Override
		public String toString() {
			return "id: "+id + " & Name " +name;
		}
		
		@Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
		
		@Override
		public boolean equals(Object o) {
			if(this==o)
				return true;
			if(o==null||getClass()!=o.getClass())
				return false;
			 
				Data d=(Data) o;
				return id==d.id && Objects.equals(name,d.name);
		}

	}

	public static void main(String[] args) {
		
		 Set<Data> s=new HashSet<>();
		 
		 s.add(new Data(1,"hello"));
		 s.add(new Data(1,"hello"));
		 s.add(new Data(2,"hello"));
		 
		 Iterator<Data> iter=s.iterator();
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
	 }
		 
		
	}
	

//	@override
//	public static Set toString() {
//		return
//	}

	
}