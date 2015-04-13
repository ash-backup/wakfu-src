package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class ContainerCharacterCreationEditorBackground implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ContainerCharacterCreationEditorBackground() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final PixmapBorder element = new PixmapBorder();
        element.onCheckOut();
        element.setElementMap(elementMap);
        appearance.addBasicElement(element);
        element.onAttributesInitialized();
        final PixmapElement checkOut = PixmapElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setHeight(130);
        checkOut.setPosition(Alignment17.NORTH_WEST);
        checkOut.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut.setWidth(24);
        checkOut.setX(916);
        checkOut.setY(892);
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final PixmapElement checkOut2 = PixmapElement.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setHeight(130);
        checkOut2.setPosition(Alignment17.NORTH);
        checkOut2.setTexture(this.doc.getTexture("preWorld_2.tga"));
        checkOut2.setWidth(253);
        checkOut2.setX(423);
        checkOut2.setY(507);
        element.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(130);
        checkOut3.setPosition(Alignment17.NORTH_EAST);
        checkOut3.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut3.setWidth(24);
        checkOut3.setX(943);
        checkOut3.setY(892);
        element.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(68);
        checkOut4.setPosition(Alignment17.WEST);
        checkOut4.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut4.setWidth(24);
        checkOut4.setX(951);
        checkOut4.setY(242);
        element.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(68);
        checkOut5.setPosition(Alignment17.EAST);
        checkOut5.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut5.setWidth(24);
        checkOut5.setX(924);
        checkOut5.setY(242);
        element.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(66);
        checkOut6.setPosition(Alignment17.SOUTH_WEST);
        checkOut6.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut6.setWidth(24);
        checkOut6.setX(978);
        checkOut6.setY(244);
        element.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(66);
        checkOut7.setPosition(Alignment17.SOUTH);
        checkOut7.setTexture(this.doc.getTexture("preWorld_2.tga"));
        checkOut7.setWidth(253);
        checkOut7.setX(258);
        checkOut7.setY(184);
        element.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(66);
        checkOut8.setPosition(Alignment17.SOUTH_EAST);
        checkOut8.setTexture(this.doc.getTexture("preWorld_0.tga"));
        checkOut8.setWidth(24);
        checkOut8.setX(213);
        checkOut8.setY(243);
        element.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        element.onChildrenAdded();
        final PixmapBackground checkOut9 = PixmapBackground.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setScaled(true);
        appearance.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(68);
        checkOut10.setPosition(Alignment17.CENTER);
        checkOut10.setTexture(this.doc.getTexture("preWorld_2.tga"));
        checkOut10.setWidth(253);
        checkOut10.setX(2);
        checkOut10.setY(182);
        checkOut9.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        checkOut9.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}