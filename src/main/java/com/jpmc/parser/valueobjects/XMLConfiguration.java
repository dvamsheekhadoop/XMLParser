package com.jpmc.parser.valueobjects;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("XMLConfiguration")
public class XMLConfiguration {

	@XStreamImplicit(itemFieldName = "Task")
	public List<Task> taskList = new ArrayList<Task>();

}
