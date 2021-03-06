/**
 * vertigo - application development platform
 *
 * Copyright (C) 2013-2021, Vertigo.io, team@vertigo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vertigo.struts2.core;

/**
 * Mode du formulaire 
 * @author npiedeloup
 */
public enum FormMode {
	/**
	 * Mode lecture seul.
	 */
	readOnly("xhtml_read"),
	/**
	 * Mode edition.
	 */
	edit("xhtml"),
	/**
	 * Mode création.
	 */
	create("xhtml");

	private final String themeName;

	private FormMode(final String themeName) {
		this.themeName = themeName;
	}

	/**
	 * @return Nom du theme utilisé.
	 */
	public String getTheme() {
		return themeName;
	}
}
