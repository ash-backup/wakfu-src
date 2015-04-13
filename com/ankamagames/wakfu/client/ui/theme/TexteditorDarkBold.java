package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class TexteditorDarkBold implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public TexteditorDarkBold() {
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
        ((TextWidgetAppearance)appearance).setAlign(Alignment9.WEST);
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("defaultBoldFont"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final String id = "scrollFleshColor";
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut2);
        }
        checkOut2.setColor(new Color(0.94f, 0.86f, 0.66f, 1.0f));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final String id2 = "textEditorDarkBorder";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, pixmapBorder);
        }
        appearance.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut3 = PixmapElement.checkOut();
        checkOut3.setElementMap(elementMap);
        checkOut3.setHeight(4);
        checkOut3.setPosition(Alignment17.NORTH_WEST);
        checkOut3.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut3.setWidth(4);
        checkOut3.setX(865);
        checkOut3.setY(192);
        pixmapBorder.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(4);
        checkOut4.setPosition(Alignment17.NORTH);
        checkOut4.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut4.setWidth(20);
        checkOut4.setX(902);
        checkOut4.setY(134);
        pixmapBorder.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(4);
        checkOut5.setPosition(Alignment17.NORTH_EAST);
        checkOut5.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut5.setWidth(4);
        checkOut5.setX(863);
        checkOut5.setY(240);
        pixmapBorder.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(7);
        checkOut6.setPosition(Alignment17.EAST);
        checkOut6.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut6.setWidth(4);
        checkOut6.setX(913);
        checkOut6.setY(491);
        pixmapBorder.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(3);
        checkOut7.setPosition(Alignment17.SOUTH_EAST);
        checkOut7.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut7.setWidth(4);
        checkOut7.setX(224);
        checkOut7.setY(356);
        pixmapBorder.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(3);
        checkOut8.setPosition(Alignment17.SOUTH);
        checkOut8.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut8.setWidth(20);
        checkOut8.setX(771);
        checkOut8.setY(479);
        pixmapBorder.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(3);
        checkOut9.setPosition(Alignment17.SOUTH_WEST);
        checkOut9.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut9.setWidth(4);
        checkOut9.setX(974);
        checkOut9.setY(415);
        pixmapBorder.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(7);
        checkOut10.setPosition(Alignment17.WEST);
        checkOut10.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut10.setWidth(4);
        checkOut10.setX(913);
        checkOut10.setY(481);
        pixmapBorder.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        final String id3 = "textEditorDarkBackground";
        final PixmapBackground checkOut11 = PixmapBackground.checkOut();
        checkOut11.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut11);
        }
        checkOut11.setScaled(true);
        appearance.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(7);
        checkOut12.setPosition(Alignment17.CENTER);
        checkOut12.setTexture(this.doc.getTexture("default_1.tga"));
        checkOut12.setWidth(20);
        checkOut12.setX(788);
        checkOut12.setY(549);
        checkOut11.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        checkOut11.onChildrenAdded();
        final ColorElement checkOut13 = ColorElement.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setColor(new Color(0.9f, 0.9f, 0.9f, 1.0f));
        checkOut13.setName("selection");
        appearance.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final ColorElement checkOut14 = ColorElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setColor(new Color(0.9f, 0.9f, 0.9f, 1.0f));
        checkOut14.setName("cursor");
        appearance.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        appearance.onChildrenAdded();
    }
}