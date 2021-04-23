import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        String s = "aa", b = "a*";
        RegularExpressionMatching l = new RegularExpressionMatching();
        System.out.println(l.isMatch(s, b));

    }
}