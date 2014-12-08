package com.jpmc.parser.valueobjects;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("parameter")
public class Parameter {
	public String name;
	public String value;
}
