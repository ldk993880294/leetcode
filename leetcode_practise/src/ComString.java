import java.util.ArrayList;
import java.util.List;

public class ComString {
    public static void main(String[] args) {
       String str="a:3,b:5,c:2@a:2,b:1";
        System.out.println(comString(str));

    }

    private static String comString(String str) {
        String[] split = str.split("@");
        if(split[1].length()==0) return str;
        List s0=new ArrayList<String>();
        List s1=new ArrayList<String>();
        String[] split0 = split[0].split(",");
        for(String split0i:split0){
            s0.add(split0i);
        }
        String[] split1 = split[1].split(",");
        for(String split1i:split1){
            s1.add(split1i);
        }
        String res="";
            for(int i=0;i<s0.size();i++){
                for(int j=i;j<s1.size();j++){
                    if(s0.get(i).toString().substring(0,1).equals(s1.get(j).toString().substring(0,1))){
                        int i0 = Integer.parseInt(s0.get(i).toString().substring(s0.get(i).toString().indexOf(":")+1));
                        int i1 = Integer.parseInt(s1.get(j).toString().substring(s1.get(j).toString().indexOf(":")+1));
                        res+=split0[i].substring(0,1)+":"+(i0-i1)+",";
                        break;
                    }
                }
            }
            for(int i=0;i<s0.size();i++){
                if(!res.contains(s0.get(i).toString().substring(0,1))){
                    int i0 = Integer.parseInt(s0.get(i).toString().substring(s0.get(i).toString().indexOf(":")+1));
                    res+=split0[i].substring(0,1)+":"+i0;
                }
            }
        return res;
    }
}
