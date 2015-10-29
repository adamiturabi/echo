/*
 *  eXist Open Source Native XML Database
 *  Copyright (C) 2015 Loren Cahlander
 *  loren.cahlander@gmail.com
 *  http://greatlinkup.com
 *  
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *  
 *  $Id$
 */
package org.exist.xquery.modules.echo;

import java.util.List;
import java.util.Map;
import org.exist.xquery.AbstractInternalModule;
import org.exist.xquery.FunctionDef;

/**
 * @author Loren Cahlander (loren.cahlander@gmail.com)
 */
public class EchoModule extends AbstractInternalModule {

	public final static String NAMESPACE_URI = "http://exist-db.org/xquery/echo";
	
	public final static String PREFIX = "echo";
    public final static String INCLUSION_DATE = "2015-10-28";
    public final static String RELEASED_IN_VERSION = "eXist-3.0";

	private final static FunctionDef[] functions = {
		new FunctionDef(EchoFunction.signature, EchoFunction.class)
	};
	
	public EchoModule(Map<String, List<? extends Object>> parameters) {
		super(functions, parameters);
	}

	public String getNamespaceURI() {
		return NAMESPACE_URI;
	}

	public String getDefaultPrefix() {
		return PREFIX;
	}

	public String getDescription() {
		return "A module for showing good echo of module usage";
	}

    public String getReleaseVersion() {
        return RELEASED_IN_VERSION;
    }

}
