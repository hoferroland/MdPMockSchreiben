package ch.zhaw.mdp.selbstaendigmockschreiben;

public interface IDatabaseAuth {
	
	// Interface mit Vorschrift zur Implementierung der
	// authentifizierung mit den zu übergebenden Parameter user und password
	boolean authenticate(String user, String password);

}
