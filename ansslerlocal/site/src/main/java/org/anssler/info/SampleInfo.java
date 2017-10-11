package org.anssler.info;

import org.hippoecm.hst.core.parameters.Parameter;

public interface SampleInfo {
	@Parameter(name = "documentTypes", defaultValue = "ansserlocal:sampledocument", displayName = "Document Type")
	String getDocType();
}
