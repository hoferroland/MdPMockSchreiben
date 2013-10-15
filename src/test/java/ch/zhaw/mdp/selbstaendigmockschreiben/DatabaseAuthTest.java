package ch.zhaw.mdp.selbstaendigmockschreiben;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Test;

public class DatabaseAuthTest {
	
	@Test
	public void test() {
		
		IDatabaseStorage storage = EasyMock.createNiceMock(IDatabaseStorage.class);
		//storage.add("roland", "roland");
		
		
		EasyMock.expect(storage.get("roland")).andReturn("rolandPasswort");
		EasyMock.replay(storage);
		
		IDatabaseAuth auth = new DatabaseAuth(storage);
		
		
		
		assertTrue(auth.authenticate("roland", "rolandPasswort"));
		assertFalse(auth.authenticate("roland", "asdf"));
		assertFalse(auth.authenticate("roland", "24"));
	}


}
