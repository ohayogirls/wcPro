package ldx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Core {
	private String content;
	public Core(String str){
		this.content = str;
	}
	public List<Map.Entry<String, Integer>> CountWord(){
		//识别单词，统计词频
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String reg = "[a-zA-Z]+";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(content);
        while(m.find()){
                String w = m.group().toLowerCase();
            if(null == map.get(w)){
                map.put(w, 1);
            }else{
                int x = map.get(w);
                map.put(w, x + 1);
            }
        }
        //对HashMap排序
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {  
            public int compare(Map.Entry<String, Integer> o1,  
                    Map.Entry<String, Integer> o2) {  
            	if((o2.getValue()).toString().compareTo(o1.getValue().toString())==0){
            		return (o1.getKey()).toString().compareTo(o2.getKey().toString());
            	}
            	else{
            		return (o2.getValue()).toString().compareTo(o1.getValue().toString());  
            	}
            }  
        });
        return list;
	}
	public String getresults(List<Map.Entry<String, Integer>> list){
		String str = "";
		int flag=1;
		for (Map.Entry<String, Integer> mapping : list) {  
			if(flag==1) {
				str+=(mapping.getKey() + " " + mapping.getValue());
				flag = 0;
			}
			else str+=("\r\n"+mapping.getKey() + " " + mapping.getValue());  
        }
		return str;
	}
}
