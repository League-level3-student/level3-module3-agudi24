package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String rs = "";
		for(int i = 0; i < s.length(); i++)  {
			String ts = "";
			ts+=s.charAt(i);
			
			if(i%2 == 0) {
				ts = ts.toLowerCase();
			} else {
				ts = ts.toUpperCase();
			}
			
			rs+=ts;
		}
		return rs;
	}

}
