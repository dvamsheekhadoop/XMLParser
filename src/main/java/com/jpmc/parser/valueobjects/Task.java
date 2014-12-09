package com.jpmc.parser.valueobjects;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Task")
public class Task {
	public String description;
	public String argc;
	public List<Arg> args = new ArrayList<Arg>();
	public List<Parameter> parameters = new ArrayList<Parameter>();

	public void execute() {
		// pass the command line args array from main method to Task
		String commandLineArguments[] = this.commandArgValues;
		cliOptions = getContext().getCliOptions();
		List<Arg> argNameList = this.args;
		for (int i = 0; i < argNameList.size(); i++) {
			cliOptions.put(agrNameList.get(i), commandLineArguments[i]);
		}
		// rest of the code is as is
		List<Parameter> parameters = this.parameters;
		//
		// /
		//
	}
}
