package _00_Text_Funkifier;


public class CapitalizedString extends SpecialString{
	public CapitalizedString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String capitalizedString = "";
		for (int i = 0; i < s.length(); i++) {
			capitalizedString += s.charAt(i);
		}
		capitalizedString = capitalizedString.toUpperCase();
		return capitalizedString;
	}
}
