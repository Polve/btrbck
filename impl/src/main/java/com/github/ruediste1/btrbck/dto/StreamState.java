package com.github.ruediste1.btrbck.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.github.ruediste1.btrbck.dom.Stream;

/**
 * Contains the information sent to the source in order to determine the clone
 * sources for the synchronization
 */
public class StreamState implements Serializable {

	private static final long serialVersionUID = 1L;

	public Stream stream;
	public final Set<Integer> snapshotNumbers = new HashSet<>();
}
