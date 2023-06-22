package org.yup.OnlineStore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.yup.OnlineStore.views.Menu;

@SpringBootApplication
public class OnlineStoreApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(OnlineStoreApplication.class);

	public static void main (String[] args){
		LOG.info("STARTING THE APPLICATION");
		ConfigurableApplicationContext nymph = SpringApplication.run(OnlineStoreApplication.class, args);
		LOG.info("APPLICATION FINISHED");

		Menu.mainMenu();
	}

	@Override
	public void run (String...args){
		LOG.info("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			LOG.info("args[{}]: {}", i, args[i]);
		}

	}

}


