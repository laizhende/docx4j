/*
 *  Copyright 2009, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */
package org.docx4j.model.properties;

import org.apache.log4j.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.CSSValue;
import org.w3c.dom.css.CSSValueList;

public class AdHocProperty extends Property {
	
	protected static Logger log = Logger.getLogger(AdHocProperty.class);	
	
	private String cssName;
	private String cssValue;
	
	public AdHocProperty(String cssName, String cssValue) {
		this.cssName  = cssName;
		this.cssValue = cssValue;
	}
	
	public String getCssProperty() {
		return composeCss(cssName, cssValue);
	}
	
	public void setXslFO(Element foElement) {
		// Not implemented		
	} 
	

}
