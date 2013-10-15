package ch.zhaw.mdp.selbstaendigmockschreiben;


public class DatabaseAuth implements IDatabaseAuth {
	private IDatabaseStorage storage;

	public DatabaseAuth(IDatabaseStorage storage) {
		this.storage = storage;
	}

	// Implementation der Methode authenticate aus dem Interface
	public boolean authenticate(String user, String password) {
		String passwortFromStorage = storage.get(user);
		if (passwortFromStorage != null) {
			// Prüfung ob Passworteingabe mit dem gespeicherten Passwort übereinstimmt
			return passwortFromStorage.equals(password);
		} else {
			return false;
		}
	}

}
