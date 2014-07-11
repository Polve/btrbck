package com.github.ruediste1.btrbck.dom;

import java.util.UUID;

public class RestoreVersionHistoryEntry extends VersionHistoryEntry {

	int restoredSnapshotNr;

	public RestoreVersionHistoryEntry(UUID streamId) {
		super(streamId);
	}

	@Override
	public int getRepresentedSnapshotCount() {
		return 0;
	}

}
