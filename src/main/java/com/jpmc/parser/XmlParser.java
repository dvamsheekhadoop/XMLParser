package com.jpmc.parser;

import java.io.File;

import com.jpmc.parser.valueobjects.Task;
import com.jpmc.parser.valueobjects.XMLConfiguration;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XmlParser {
	public static void main(String args[]) {
		XStream xstream = new XStream(new StaxDriver());
		xstream.processAnnotations(XMLConfiguration.class);

		XMLConfiguration xmlConfig = (XMLConfiguration) xstream
				.fromXML(new File("src/main/resources/appconf.xml"));

		Task t = xmlConfig.taskList.get(0);

		System.out.println(xmlConfig.taskList.get(0).args);

	}
}
