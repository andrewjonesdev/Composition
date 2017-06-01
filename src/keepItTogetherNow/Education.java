package keepItTogetherNow;

import java.util.ArrayList;
import java.util.Collection;

public class Education {
private ArrayList <String> priorSchools = new ArrayList<>();

//public Education (Collection<String> schools){
public Education (String[] a){
	for (int i = 0; i<a.length; i++){
		priorSchools.add(a[i]);
	}
}

public Education(){
	
}

public void addEarlierEducation(String earlyEd){

	priorSchools.add(0, earlyEd);

}

public void addLaterEducation(String lateEd){

	priorSchools.add(lateEd);

}

public String getEd(int count){
	return priorSchools.get(count+1);
}

public String toString(){
	String listString = "";
	for(int count = 0; (count<priorSchools.size() && count<10); count++){
		if(count!=(priorSchools.size()-1))
		{
			listString += (priorSchools.get(count) + ", ");
		}
		else{
			listString += priorSchools.get(count);
		}
	}
	return listString;
}

}

