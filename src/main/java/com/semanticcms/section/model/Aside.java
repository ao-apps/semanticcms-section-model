/*
 * semanticcms-section-model - Sections nested within SemanticCMS pages and elements.
 * Copyright (C) 2019, 2022  AO Industries, Inc.
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

/**
 * <a href="https://www.w3.org/TR/html5/sections.html#the-aside-element">The aside element</a>.
 */
public class Aside extends SectioningContent {

  @Override
  protected String getDefaultIdPrefix() {
    return "aside";
  }
}
