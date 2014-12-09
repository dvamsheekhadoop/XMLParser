package com.jpmc.parser;

import java.io.File;
import java.util.List;

import com.jpmc.parser.valueobjects.Arg;
import com.jpmc.parser.valueobjects.XMLConfiguration;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XmlParser {
	public static void main(String args[]) {
		XStream xstream = new XStream(new StaxDriver());
		xstream.processAnnotations(XMLConfiguration.class);

		XMLConfiguration xmlConfig = (XMLConfiguration) xstream
				.fromXML(new File("src/main/resources/appconf.xml"));

		List<Arg> ls = xmlConfig.taskList.get(0).args;

		System.out.println(xmlConfig.taskList.get(0).args);

	}

	public void execute() {

	}
}
