/*
 * semanticcms-section-model - Sections nested within SemanticCMS pages and elements.
 * Copyright (C) 2019, 2020, 2021, 2022, 2024  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of semanticcms-section-model.
 *
 * semanticcms-section-model is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * semanticcms-section-model is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with semanticcms-section-model.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.semanticcms.section.model;

import static com.aoapps.lang.Strings.nullIfEmpty;

import com.semanticcms.core.model.Element;

/**
 * <a href="https://www.w3.org/TR/html5/dom.html#sectioning-content">Sectioning content</a>
 * is content that defines the scope of <a href="https://www.w3.org/TR/html5/sections.html#the-header-element">headings</a>
 * and <a href="https://www.w3.org/TR/html5/sections.html#the-footer-element">footers</a>.
 */
public abstract class SectioningContent extends Element {

  private volatile String label;

  @Override
  public String getLabel() {
    return label;
  }

  /**
   * Sets the label while making sure not frozen.
   */
  public void setLabel(String label) {
    checkNotFrozen();
    this.label = nullIfEmpty(label);
  }
}
