public class space {
    public String replaceSpace(StringBuffer str) {
        StringBuilder s=new StringBuilder();
        for(char c:str.toString().toCharArray()){
            if(c==' ') s.append("%20");
            else s.append(c);
        }
        return s.toString();
    }
}
