package ch.zhaw.mdp.selbstaendigmockschreiben;

public interface IDatabaseStorage {

	// Interface als Schnittstelle zur Simulation der Datenhaltung
	// von Usern und Passwörtern
	void add(String user, String password);

	String get(String key);

}
