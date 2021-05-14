package nLayerdDemo.core.adapters;

import GoogleRegister.GoogleManager;
import nLayerdDemo.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {
	@Override
	public void registerToSystem() {

		GoogleManager googleManager = new GoogleManager();
		googleManager.register();

	}
}