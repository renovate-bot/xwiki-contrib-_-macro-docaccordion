/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.macro.docaccordion;

import org.xwiki.properties.annotation.PropertyDescription;
import org.xwiki.properties.annotation.PropertyName;

/**
 * Parameters for the {@link org.xwiki.contrib.macro.docaccordion.internal.DocAccordionMacro} Macro.
 */
public class DocAccordionMacroParameters
{
    public enum DocAccordionMacroSort
    {
        /**
         * Accordions sorted chronologically.
         */
        CHRONO,

        /**
         * Accordions sorted alphabetically by document title.
         */
        ALPHA,

        /**
         * Accordions sorted alphabetically by document name.
         */
        ALPHA_DOCNAME,

        /**
         * Accordions sorted alphabetically by document fullName.
         */
        ALPHA_DOCFULLNAME
    }

    /**
     * @see #getSpace()
     */
    private String space;

    /**
     * @see #getXclass()
     */
    private String xclass;

    /**
     * @see #getSort()
     */
    private DocAccordionMacroSort sort = DocAccordionMacroSort.CHRONO;

    /**
     * @see #getDisplayAuthor()
     */
    private boolean displayAuthor = true;

    /**
     * @see #getDisplayDate()
     */
    private boolean displayDate = true;

    /**
     * @see #getOpenFirstAccordion()
     */
    private boolean openFirstAccordion = true;

    /**
     * @see #getLimit()
     */
    private int limit = 100;

    /**
     * @see #getAccordionMaxHeight()
     */
    private int accordionMaxHeight;

    /**
     * @see #getShowSpaceTopLevelDocs()
     */
    private boolean showSpaceTopLevelDocs = true;

    /**
     * @see #getIgnoreSpaceWebHomePage()
     */
    private boolean ignoreSpaceWebHomePage = true;

    /**
     * @return the space parameter
     */
    public String getSpace()
    {
        return this.space;
    }

    /**
     * @param space the space parameter
     */
    @PropertyName("Location")
    @PropertyDescription("Limit the selection to this page and its children. If the selected page is an Application Within Minutes, display items of that application.")
    public void setSpace(String space)
    {
        this.space = space;
    }

    /**
     * @return the xclass parameter
     */
    public String getXclass()
    {
        return this.xclass;
    }

    /**
     * @param xclass the xclass parameter
     */
    @PropertyName("Application class")
    @PropertyDescription("Limit the selection to documents containing objects instance of this XClass.")
    public void setXclass(String xclass)
    {
        this.xclass = xclass;
    }

    /**
     * @return the sort parameter
     */
    public DocAccordionMacroSort getSort()
    {
        return this.sort;
    }

    /**
     * @param sort the sort parameter
     */
    @PropertyName("Order")
    @PropertyDescription("Sort the available documents.")
    public void setSort(DocAccordionMacroSort sort)
    {
        this.sort = sort;
    }

    /**
     * @return the displayAuthor parameter
     */
    public boolean getDisplayAuthor()
    {
        return this.displayAuthor;
    }

    /**
     * @param displayAuthor the displayAuthor parameter
     */
    @PropertyName("Show the author")
    @PropertyDescription("Display the document author.")
    public void setDisplayAuthor(boolean displayAuthor)
    {
        this.displayAuthor = displayAuthor;
    }

    /**
     * @return the displayDate parameter
     */
    public boolean getDisplayDate()
    {
        return this.displayDate;
    }

    /**
     * @param displayDate the displayDate parameter
     */
    @PropertyName("Show the modification date")
    @PropertyDescription("Display the document last modification date.")
    public void setDisplayDate(boolean displayDate)
    {
        this.displayDate = displayDate;
    }

    /**
     * @return the limit parameter
     */
    public int getLimit()
    {
        return this.limit;
    }

    /**
     * @param limit the limit parameter
     */
    @PropertyName("Total number of accordions")
    @PropertyDescription("Limit the number of accordions that could be displayed.")
    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    /**
     * @return the accordionMaxHeight parameter
     */
    public int getAccordionMaxHeight()
    {
        return this.accordionMaxHeight;
    }

    /**
     * @param accordionMaxHeight the accordionMaxHeight parameter
     */
    @PropertyName("Size of accordions")
    @PropertyDescription("The maximum height that an accordion use to display the document content. To avoid scrollbars use zero for an unlimited height.")
    public void setAccordionMaxHeight(int accordionMaxHeight)
    {
        this.accordionMaxHeight = accordionMaxHeight;
    }

    /**
     * @return the openFirstAccordion parameter
     */
    public boolean getOpenFirstAccordion()
    {
        return this.openFirstAccordion;
    }

    /**
     * @param openFirstAccordion the openFirstAccordion parameter
     */
    @PropertyName("Show first accordions")
    @PropertyDescription("Open the first accordion.")
    public void setOpenFirstAccordion(boolean openFirstAccordion)
    {
        this.openFirstAccordion = openFirstAccordion;
    }

    /**
     * @return the showTopLevelDocs parameter
     */
    public boolean getShowSpaceTopLevelDocs()
    {
        return this.showSpaceTopLevelDocs;
    }

    /**
     * @param showSpaceTopLevelDocs the showSpaceTopLevelDocs parameter
     */
    @PropertyName("Show top level documents")
    @PropertyDescription("Only directl children of the space will be listed.")
    public void setShowSpaceTopLevelDocs(boolean showSpaceTopLevelDocs)
    {
        this.showSpaceTopLevelDocs = showSpaceTopLevelDocs;
    }

    /**
     * @return the ignoreSpaceWebHomePage parameter
     */
    public boolean getIgnoreSpaceWebHomePage()
    {
        return this.ignoreSpaceWebHomePage;
    }

    /**
     * @param ignoreSpaceWebHomePage the ignoreSpaceWebHomePage parameter
     */
    @PropertyName("Ignore '.WebHome' documents")
    @PropertyDescription("Ignore the '.WebHome' page of the space when listing a space documents.")
    public void setIgnoreSpaceWebHomePage(boolean ignoreSpaceWebHomePage)
    {
        this.ignoreSpaceWebHomePage = ignoreSpaceWebHomePage;
    }
}
