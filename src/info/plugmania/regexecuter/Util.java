package info.plugmania.regexecuter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {
	RegeXEcuter plugin;

	public Util(RegeXEcuter instance) {
		plugin = instance;
	}
	
	public boolean regexJudge(String str, String pattern){
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		
		if(m.find()) return true;
		
		return false;
	}
}
