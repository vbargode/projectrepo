package org.anssler.beans;
/*
 * Copyright 2014 Hippo B.V. (http://www.onehippo.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.Calendar;
import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.components.model.Authors;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "ansserlocal:blogpost")
@Node(jcrType = "ansserlocal:blogpost")
public class Blogpost extends HippoDocument implements Authors {

    public static final String TITLE = "ansserlocal:title";
    public static final String INTRODUCTION = "ansserlocal:introduction";
    public static final String CONTENT = "ansserlocal:content";
    public static final String PUBLICATION_DATE = "ansserlocal:publicationdate";
    public static final String CATEGORIES = "ansserlocal:categories";
    public static final String AUTHOR = "ansserlocal:author";
    public static final String AUTHOR_NAMES = "ansserlocal:authornames";
    public static final String LINK = "ansserlocal:link";
    public static final String AUTHORS = "ansserlocal:authors";
    public static final String TAGS = "hippostd:tags";


   @HippoEssentialsGenerated(internalName = "ansserlocal:publicationdate")
    public Calendar getPublicationDate() {
        return getProperty(PUBLICATION_DATE);
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:authornames")
    public String[] getAuthorNames() {
        return getProperty(AUTHOR_NAMES);
    }

    public String getAuthor() {
        final String[] authorNames = getAuthorNames();
        if(authorNames !=null && authorNames.length > 0){
            return authorNames[0];
        }
        return null;
    }


    @HippoEssentialsGenerated(internalName = "ansserlocal:title")
    public String getTitle() {
        return getProperty(TITLE);
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:introduction")
    public String getIntroduction() {
        return getProperty(INTRODUCTION);
    }

    @HippoEssentialsGenerated(internalName = "ansserlocal:categories")
    public String[] getCategories() {
        return getProperty(CATEGORIES);
    }

    @Override
    @HippoEssentialsGenerated(internalName = "ansserlocal:authors")
    public List<Author> getAuthors() {
        return getLinkedBeans(AUTHORS, Author.class);
    }
}