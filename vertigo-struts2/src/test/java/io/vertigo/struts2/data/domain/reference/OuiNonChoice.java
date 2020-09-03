/**
 * vertigo - application development platform
 *
 * Copyright (C) 2013-2020, Vertigo.io, team@vertigo.io
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
package io.vertigo.struts2.data.domain.reference;

import io.vertigo.core.lang.Generated;
import io.vertigo.datamodel.structure.model.Entity;
import io.vertigo.datamodel.structure.model.UID;
import io.vertigo.datamodel.structure.stereotype.DataSpace;
import io.vertigo.datamodel.structure.stereotype.DisplayField;
import io.vertigo.datamodel.structure.stereotype.Field;
import io.vertigo.datamodel.structure.stereotype.SortField;
import io.vertigo.datamodel.structure.util.DtObjectUtil;

/**
 * This class is automatically generated.
 * DO NOT EDIT THIS FILE DIRECTLY.
 */
@Generated
@DataSpace("ouiNon")
public final class OuiNonChoice implements Entity {
	private static final long serialVersionUID = 1L;

	private Boolean key;
	private String libelle;

	/** {@inheritDoc} */
	@Override
	public UID<OuiNonChoice> getUID() {
		return UID.of(this);
	}

	/**
	 * Champ : ID.
	 * Récupère la valeur de la propriété 'Valeur'.
	 * @return Boolean key <b>Obligatoire</b>
	 */
	@Field(smartType = "STyOuiNon", type = "ID", cardinality = io.vertigo.core.lang.Cardinality.ONE, label = "Valeur")
	public Boolean getKey() {
		return key;
	}

	/**
	 * Champ : ID.
	 * Définit la valeur de la propriété 'Valeur'.
	 * @param key Boolean <b>Obligatoire</b>
	 */
	public void setKey(final Boolean key) {
		this.key = key;
	}

	/**
	 * Champ : DATA.
	 * Récupère la valeur de la propriété 'Libellé'.
	 * @return String libelle
	 */
	@Field(smartType = "STyLabel", label = "Libellé")
	@DisplayField
	@SortField
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Champ : DATA.
	 * Définit la valeur de la propriété 'Libellé'.
	 * @param libelle String
	 */
	public void setLibelle(final String libelle) {
		this.libelle = libelle;
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return DtObjectUtil.toString(this);
	}
}
