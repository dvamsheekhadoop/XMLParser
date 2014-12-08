package com.jpmc.parser.valueobjects;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Task")
public class Task {
	public String description;
	public String argc;
	@XStreamImplicit(itemFieldName = "arg")
	public List<String> args = new ArrayList<String>();
	public List<Parameter> parameters = new ArrayList<Parameter>();
}
