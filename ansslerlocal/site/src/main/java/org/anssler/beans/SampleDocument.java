package org.anssler.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import java.util.Calendar;

@HippoEssentialsGenerated(internalName = "ansserlocal:SampleDocument")
@Node(jcrType = "ansserlocal:SampleDocument")
public class SampleDocument extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "ansserlocal:title")
    public String getTitle() {
        return getProperty("ansserlocal:title");
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:introduction")
    public String getIntroduction() {
        return getProperty("ansserlocal:introduction");
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:documentdate")
    public Calendar getDocumentdate() {
        return getProperty("ansserlocal:documentdate");
    }
}
