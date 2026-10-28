package app.rive.runtime.kotlin.fonts;

import android.util.Xml;
import app.rive.RiveLog;
import defpackage.a;
import defpackage.atqq;
import defpackage.awml;
import defpackage.awmq;
import defpackage.awno;
import defpackage.awnp;
import defpackage.awoa;
import defpackage.awqx;
import defpackage.awrc;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class SystemFontsParser {
    public static final int $stable = 0;
    public static final String FALLBACK_FONTS_XML_PATH = "/system/etc/system_fallback.xml";
    public static final String FONTS_XML_PATH = "/system/etc/fonts.xml";
    public static final String SYSTEM_FONTS_XML_PATH = "/system/etc/system_fonts.xml";
    private static final String TAG = "SystemFontsParser";
    public static final Companion Companion = new Companion(null);
    private static final List SYSTEM_FONTS_PATHS = atqq.aL(new String[]{"/system/fonts/", "/product/fonts/", "/system/product/fonts/", "/data/fonts/", "/system/font/"});
    private static final List fontFilesOrder = atqq.aL(new awml[]{new awml(Fonts.Weight.Companion.getNORMAL(), Fonts.Font.STYLE_NORMAL), new awml(Fonts.Weight.Companion.getBOLD(), Fonts.Font.STYLE_NORMAL), new awml(Fonts.Weight.Companion.getNORMAL(), Fonts.Font.STYLE_ITALIC), new awml(Fonts.Weight.Companion.getBOLD(), Fonts.Font.STYLE_ITALIC)});

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final awml fromFileFonts(List list, List list2, final String str, String str2, String str3) {
            String lang = str2;
            String variant = str3;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    atqq.M();
                }
                final Fonts.FileFont fileFont = (Fonts.FileFont) obj;
                if (i >= SystemFontsParser.fontFilesOrder.size()) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SystemFontsParser.Companion.fromFileFonts$lambda$0$0(str, fileFont);
                        }
                    });
                } else {
                    awml awmlVar = (awml) SystemFontsParser.fontFilesOrder.get(i);
                    Fonts.Weight weight = (Fonts.Weight) awmlVar.a;
                    String str4 = (String) awmlVar.b;
                    String string = awrc.q(fileFont.getName()).toString();
                    if (string.length() == 0) {
                        RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SystemFontsParser.Companion.fromFileFonts$lambda$0$1(str);
                            }
                        });
                    } else {
                        Fonts.Font font = new Fonts.Font(weight, str4, string, null, 0, null, null, 112, null);
                        Object arrayList = linkedHashMap.get(weight);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(weight, arrayList);
                        }
                        ((List) arrayList).add(font);
                    }
                }
                i = i2;
            }
            String str5 = null;
            if (linkedHashMap.isEmpty()) {
                RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SystemFontsParser.Companion.fromFileFonts$lambda$1(str);
                    }
                });
                return new awml(new Fonts.Family(str, variant, lang, awnp.a), awno.a);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String string2 = awrc.q((String) it.next()).toString();
                Fonts.Alias alias = string2.length() > 0 ? new Fonts.Alias(string2, str, null) : null;
                if (alias != null) {
                    arrayList2.add(alias);
                }
            }
            if (variant == null) {
                Fonts.FileFont fileFont2 = (Fonts.FileFont) atqq.Z(list);
                variant = fileFont2 != null ? fileFont2.getVariant() : null;
            }
            if (lang == null) {
                Fonts.FileFont fileFont3 = (Fonts.FileFont) atqq.Z(list);
                lang = fileFont3 != null ? fileFont3.getLang() : null;
            }
            String string3 = variant != null ? awrc.q(variant).toString() : null;
            if (string3 == null || awrc.v(string3)) {
                string3 = null;
            }
            String string4 = lang != null ? awrc.q(lang).toString() : null;
            if (string4 != null && !awrc.v(string4)) {
                str5 = string4;
            }
            return new awml(new Fonts.Family(str, string3, str5, linkedHashMap), arrayList2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String fromFileFonts$lambda$0$0(String str, Fonts.FileFont fileFont) {
            return "Legacy family '" + str + "' has more than " + SystemFontsParser.fontFilesOrder.size() + " files in <fileset>. Ignoring extra file: '" + fileFont.getName() + '\'';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String fromFileFonts$lambda$0$1(String str) {
            return a.bT(str, "Skipping empty filename in <fileset> for family '", "'.");
        }

        static final String fromFileFonts$lambda$1(String str) {
            return "Could not extract any valid fonts from <fileset> for legacy family '" + str + '\'';
        }

        private final awml fromFontList(final String str, List list, String str2, String str3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Fonts.Font font = (Fonts.Font) it.next();
                if (awrc.v(font.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SystemFontsParser.Companion.fromFontList$lambda$0$0(str);
                        }
                    });
                } else {
                    Fonts.Weight weight = font.getWeight();
                    Object arrayList = linkedHashMap.get(weight);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(weight, arrayList);
                    }
                    ((List) arrayList).add(font);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return new awml(new Fonts.Family(str, str3, str2, linkedHashMap), awno.a);
            }
            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.bT(str, "Family '", "' from <font> list resulted in no valid fonts. Creating empty family.");
                }
            });
            return new awml(new Fonts.Family(str, str3, str2, awnp.a), awno.a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String fromFontList$lambda$0$0(String str) {
            return a.bT(str, "Skipping font with blank filename in family '", "'.");
        }

        private final String getOptionalAttribute(XmlPullParser xmlPullParser, String str, String str2) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? attributeValue : str2;
        }

        static /* synthetic */ String getOptionalAttribute$default(Companion companion, XmlPullParser xmlPullParser, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.getOptionalAttribute(xmlPullParser, str, str2);
        }

        private final String getRequiredAttribute(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new IllegalArgumentException("Missing required attribute: ".concat(String.valueOf(str)));
        }

        private final Fonts.Alias readAlias(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Companion companion;
            XmlPullParser xmlPullParser2;
            xmlPullParser.require(2, null, "alias");
            try {
                final String requiredAttribute = getRequiredAttribute(xmlPullParser, "name");
                final String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "to");
                companion = this;
                xmlPullParser2 = xmlPullParser;
                try {
                    String optionalAttribute$default = getOptionalAttribute$default(companion, xmlPullParser2, "weight", null, 4, null);
                    Fonts.Weight weightFromString = optionalAttribute$default != null ? Fonts.Weight.Companion.fromString(optionalAttribute$default) : null;
                    companion.skip(xmlPullParser2);
                    if (!awrc.v(requiredAttribute) && !awrc.v(requiredAttribute2)) {
                        return new Fonts.Alias(awrc.q(requiredAttribute).toString(), awrc.q(requiredAttribute2).toString(), weightFromString);
                    }
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return a.ct(requiredAttribute2, requiredAttribute, "Skipping alias with blank name ('", "') or to ('", "').");
                        }
                    });
                    return null;
                } catch (IllegalArgumentException e) {
                    e = e;
                    final IllegalArgumentException illegalArgumentException = e;
                    RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return "Skipping alias due to missing required attribute: ".concat(String.valueOf(illegalArgumentException.getMessage()));
                        }
                    });
                    companion.skip(xmlPullParser2);
                    return null;
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                companion = this;
                xmlPullParser2 = xmlPullParser;
            }
        }

        private final Fonts.Axis readAxis(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String requiredAttribute = getRequiredAttribute(xmlPullParser, "tag");
            String requiredAttribute2 = getRequiredAttribute(xmlPullParser, "stylevalue");
            skip(xmlPullParser);
            if (awrc.v(requiredAttribute) || awrc.v(requiredAttribute2)) {
                throw new IllegalArgumentException("Axis tag found with blank 'tag' or 'stylevalue'.");
            }
            return new Fonts.Axis(requiredAttribute, requiredAttribute2);
        }

        private final Fonts.Family readFamily(final String str, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            awmq awmqVar = new awmq(getOptionalAttribute$default(SystemFontsParser.Companion, xmlPullParser, "lang", null, 4, null), getOptionalAttribute$default(SystemFontsParser.Companion, xmlPullParser, "variant", null, 4, null), getOptionalAttribute$default(SystemFontsParser.Companion, xmlPullParser, "ignore", null, 4, null));
            Object obj = awmqVar.a;
            Object obj2 = awmqVar.b;
            Object obj3 = awmqVar.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (awrc.c(awrc.q(name).toString(), "font")) {
                        try {
                            Fonts.Font font = readFont(xmlPullParser);
                            Fonts.Weight weight = font.getWeight();
                            Object arrayList = linkedHashMap.get(weight);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(weight, arrayList);
                            }
                            ((List) arrayList).add(font);
                        } catch (Exception e) {
                            RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readFamily$lambda$2(str, e);
                                }
                            });
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            if (atqq.ay(atqq.aL(new String[]{"true", "1"}), obj3) || linkedHashMap.isEmpty()) {
                return null;
            }
            return new Fonts.Family(str, (String) obj2, (String) obj, linkedHashMap);
        }

        static final String readFamily$lambda$2(String str, Exception exc) {
            return "Failed to read <font> in family '" + str + "': " + exc.getMessage();
        }

        private final Fonts.Family readFamilyEntry(XmlPullParser xmlPullParser, List list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "family");
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "name", null, 4, null);
            String string = optionalAttribute$default != null ? awrc.q(optionalAttribute$default).toString() : null;
            if (string != null && string.length() > 0) {
                return readFamily(string, xmlPullParser);
            }
            awml legacyFamily = readLegacyFamily(xmlPullParser);
            if (legacyFamily == null) {
                return null;
            }
            Fonts.Family family = (Fonts.Family) legacyFamily.a;
            List list2 = (List) legacyFamily.b;
            if (list2.isEmpty()) {
                return family;
            }
            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SystemFontsParser.Companion.readFamilyEntry$lambda$0$0();
                }
            });
            list.addAll(list2);
            return family;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readFamilyEntry$lambda$0$0() {
            return "Legacy family generated aliases - these will be processed globally.";
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
        private final List readFileset(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            final XmlPullParser xmlPullParser2;
            String string;
            awoa awoaVar = new awoa(10);
            xmlPullParser.require(2, null, "fileset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (awrc.c(awrc.q(name).toString(), "file")) {
                        xmlPullParser2 = xmlPullParser;
                        String optionalAttribute$default = getOptionalAttribute$default(SystemFontsParser.Companion, xmlPullParser2, "variant", null, 4, null);
                        if (optionalAttribute$default == null || awrc.v(optionalAttribute$default)) {
                            optionalAttribute$default = null;
                        }
                        String optionalAttribute$default2 = getOptionalAttribute$default(SystemFontsParser.Companion, xmlPullParser2, "lang", null, 4, null);
                        if (optionalAttribute$default2 == null || awrc.v(optionalAttribute$default2)) {
                            optionalAttribute$default2 = null;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (xmlPullParser2.next() == 4) {
                            String text = xmlPullParser2.getText();
                            if (text == null || (string = awrc.q(text).toString()) == null) {
                                string = "";
                            }
                            sb.append(string);
                            xmlPullParser2.next();
                        }
                        String string2 = sb.toString();
                        if (xmlPullParser2.getEventType() == 3) {
                            String name2 = xmlPullParser2.getName();
                            name2.getClass();
                            if (!awrc.c(awrc.q(name2).toString(), "file")) {
                                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SystemFontsParser.Companion.readFileset$lambda$0$3(xmlPullParser2);
                                    }
                                });
                            }
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readFileset$lambda$0$3(xmlPullParser2);
                                }
                            });
                        }
                        if (string2.length() == 0) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            awoaVar.add(new Fonts.FileFont(string2, optionalAttribute$default, optionalAttribute$default2));
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readFileset$lambda$0$6();
                                }
                            });
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        SystemFontsParser.Companion.skip(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                }
            }
            return awoaVar.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readFileset$lambda$0$3(XmlPullParser xmlPullParser) throws XmlPullParserException {
            return "Expected </file> tag after reading text, found " + xmlPullParser.getEventType() + ' ' + xmlPullParser.getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readFileset$lambda$0$6() {
            return "Skipping <file> tag with empty content within <fileset>";
        }

        private final Fonts.Font readFont(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String text;
            Integer numG;
            xmlPullParser.require(2, null, "font");
            Fonts.Weight.Companion companion = Fonts.Weight.Companion;
            Fonts.Weight weightFromString = companion.fromString(getOptionalAttribute(xmlPullParser, "weight", String.valueOf(companion.getNORMAL().getWeight())));
            String optionalAttribute = getOptionalAttribute(xmlPullParser, "style", Fonts.Font.STYLE_NORMAL);
            String str = optionalAttribute == null ? Fonts.Font.STYLE_NORMAL : optionalAttribute;
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "index", null, 4, null);
            int iIntValue = 0;
            if (optionalAttribute$default != null && (numG = awrc.G(optionalAttribute$default)) != null) {
                iIntValue = numG.intValue();
            }
            String optionalAttribute$default2 = getOptionalAttribute$default(this, xmlPullParser, "postScriptName", null, 4, null);
            if (optionalAttribute$default2 == null || awrc.v(optionalAttribute$default2)) {
                optionalAttribute$default2 = null;
            }
            String optionalAttribute$default3 = getOptionalAttribute$default(this, xmlPullParser, "fallbackFor", null, 4, null);
            String str2 = (optionalAttribute$default3 == null || awrc.v(optionalAttribute$default3)) ? null : optionalAttribute$default3;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (awrc.c(awrc.q(name).toString(), "axis")) {
                        try {
                            arrayList.add(readAxis(xmlPullParser));
                        } catch (Exception e) {
                            RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return "Failed to read <axis> tag: ".concat(String.valueOf(e.getMessage()));
                                }
                            });
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                } else if (eventType == 4 && (text = xmlPullParser.getText()) != null) {
                    sb.append(text);
                }
            }
            String string = awrc.q(sb.toString()).toString();
            String str3 = string.length() == 0 ? null : string;
            if (str3 != null) {
                return new Fonts.Font(weightFromString, str, str3, true != arrayList.isEmpty() ? arrayList : null, iIntValue, optionalAttribute$default2, str2);
            }
            throw new IllegalStateException("Font tag found with empty filename");
        }

        private final awml readLegacyFamily(final XmlPullParser xmlPullParser) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            String optionalAttribute$default = getOptionalAttribute$default(this, xmlPullParser, "variant", null, 4, null);
            String optionalAttribute$default2 = getOptionalAttribute$default(this, xmlPullParser, "lang", null, 4, null);
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    try {
                        String name = xmlPullParser.getName();
                        name.getClass();
                        String string = awrc.q(name).toString();
                        int iHashCode = string.hashCode();
                        if (iHashCode != -854981274) {
                            if (iHashCode != 3148879) {
                                if (iHashCode == 1721971191 && string.equals("nameset")) {
                                    arrayList.addAll(readNameset(xmlPullParser));
                                } else {
                                    skip(xmlPullParser);
                                }
                            } else if (string.equals("font")) {
                                arrayList3.add(readFont(xmlPullParser));
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("fileset")) {
                            arrayList2.addAll(readFileset(xmlPullParser));
                        } else {
                            skip(xmlPullParser);
                        }
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(SystemFontsParser.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SystemFontsParser.Companion.readLegacyFamily$lambda$0(xmlPullParser, e);
                            }
                        });
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                return fromFontList(arrayList.isEmpty() ? "" : (String) arrayList.remove(0), arrayList3, optionalAttribute$default2, optionalAttribute$default);
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return fromFileFonts(arrayList2, arrayList, awrc.q((String) arrayList.remove(0)).toString(), optionalAttribute$default2, optionalAttribute$default);
        }

        static final String readLegacyFamily$lambda$0(XmlPullParser xmlPullParser, Exception exc) {
            return "Error reading tag '" + xmlPullParser.getName() + "' inside legacy family - Skipping tag - " + exc.getMessage();
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        private final List readNameset(final XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String string;
            xmlPullParser.require(2, null, "nameset");
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    if (awrc.c(awrc.q(name).toString(), "name")) {
                        String str = "";
                        if (xmlPullParser.next() == 4) {
                            String text = xmlPullParser.getText();
                            if (text != null && (string = awrc.q(text).toString()) != null) {
                                str = string;
                            }
                            xmlPullParser.next();
                        }
                        if (xmlPullParser.getEventType() == 3) {
                            String name2 = xmlPullParser.getName();
                            name2.getClass();
                            if (!awrc.c(awrc.q(name2).toString(), "name")) {
                                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return SystemFontsParser.Companion.readNameset$lambda$0(xmlPullParser);
                                    }
                                });
                            }
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readNameset$lambda$0(xmlPullParser);
                                }
                            });
                        }
                        if (!awrc.v(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        static final String readNameset$lambda$0(XmlPullParser xmlPullParser) throws XmlPullParserException {
            return "Expected </name> tag after reading text, but found " + xmlPullParser.getEventType() + ' ' + xmlPullParser.getName();
        }

        private final void readNestedFamilies(XmlPullParser xmlPullParser, Map map, List list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "familyset");
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    String string = awrc.q(name).toString();
                    if (awrc.c(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, list);
                        if (familyEntry != null) {
                            String name2 = familyEntry.getName();
                            map.put((name2 == null || name2.length() == 0) ? ((Fonts.Font) atqq.X(atqq.O(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                        }
                    } else if (awrc.c(string, "alias")) {
                        Fonts.Alias alias = readAlias(xmlPullParser);
                        if (alias != null) {
                            list.add(alias);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
        }

        private final List readNestedFamiliesList(XmlPullParser xmlPullParser, List list) throws XmlPullParserException, IOException {
            xmlPullParser.require(2, null, "familyset");
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.getClass();
                    String string = awrc.q(name).toString();
                    if (awrc.c(string, "family")) {
                        Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, list);
                        if (familyEntry != null) {
                            arrayList.add(familyEntry);
                        }
                    } else if (awrc.c(string, "alias")) {
                        Fonts.Alias alias = readAlias(xmlPullParser);
                        if (alias != null) {
                            list.add(alias);
                        }
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            return arrayList;
        }

        private final List readRootElement(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Object next;
            Fonts.Family familyRemapAlias;
            Object next2;
            xmlPullParser.require(2, null, null);
            final String name = xmlPullParser.getName();
            if (!awrc.c(name, "familyset") && !awrc.c(name, "fonts-modification") && !awrc.c(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.bT(name, "Unexpected root tag '", "' in font XML");
                    }
                });
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<Fonts.Alias> arrayList2 = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name2 = xmlPullParser.getName();
                    name2.getClass();
                    String string = awrc.q(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(xmlPullParser);
                                if (alias != null) {
                                    arrayList2.add(alias);
                                }
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, arrayList2);
                            if (familyEntry != null) {
                                arrayList.add(familyEntry);
                            }
                        } else {
                            skip(xmlPullParser);
                        }
                    } else if (string.equals("familyset")) {
                        arrayList.addAll(readNestedFamiliesList(xmlPullParser, arrayList2));
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(atqq.N(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Fonts.Family) it.next()).getName());
            }
            Set setAv = atqq.av(arrayList3);
            for (final Fonts.Alias alias2 : arrayList2) {
                if (!setAv.contains(alias2.getName())) {
                    Iterator it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!awrc.c(((Fonts.Family) next2).getName(), alias2.getOriginal()));
                    Fonts.Family family = (Fonts.Family) next2;
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.Companion.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            setAv.add(alias2.getName());
                            arrayList.add(familyRemapAlias2);
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readRootElement$lambda$4$1$1(alias2);
                                }
                            });
                        }
                    }
                }
            }
            List listAr = atqq.ar(arrayList2);
            while (!listAr.isEmpty()) {
                Iterator it3 = listAr.iterator();
                boolean z = false;
                while (it3.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it3.next();
                    if (setAv.contains(alias3.getName())) {
                        it3.remove();
                    } else {
                        Iterator it4 = arrayList.iterator();
                        do {
                            if (!it4.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it4.next();
                        } while (!awrc.c(((Fonts.Family) next).getName(), alias3.getOriginal()));
                        Fonts.Family family2 = (Fonts.Family) next;
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.Companion.remapAlias(alias3, family2)) != null) {
                            setAv.add(alias3.getName());
                            arrayList.add(familyRemapAlias);
                            it3.remove();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readRootElement$lambda$4$1$1(Fonts.Alias alias) {
            return "Could not remap alias '" + alias.getName() + "' because target '" + alias.getOriginal() + "' not found.";
        }

        private final Map readRootElementMap(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            Fonts.Family familyRemapAlias;
            xmlPullParser.require(2, null, null);
            final String name = xmlPullParser.getName();
            if (!awrc.c(name, "familyset") && !awrc.c(name, "fonts-modification") && !awrc.c(name, "config")) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return a.bT(name, "Unexpected root tag '", "' in font XML");
                    }
                });
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList<Fonts.Alias> arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name2 = xmlPullParser.getName();
                    name2.getClass();
                    String string = awrc.q(name2).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1359677826) {
                        if (iHashCode != -1281860764) {
                            if (iHashCode == 92902992 && string.equals("alias")) {
                                Fonts.Alias alias = readAlias(xmlPullParser);
                                if (alias != null) {
                                    arrayList.add(alias);
                                }
                            } else {
                                skip(xmlPullParser);
                            }
                        } else if (string.equals("family")) {
                            Fonts.Family familyEntry = readFamilyEntry(xmlPullParser, arrayList);
                            if (familyEntry != null) {
                                String name3 = familyEntry.getName();
                                linkedHashMap.put((name3 == null || name3.length() == 0) ? ((Fonts.Font) atqq.X(atqq.O(familyEntry.getFonts().values()))).getName() : familyEntry.getName(), familyEntry);
                            }
                        } else {
                            skip(xmlPullParser);
                        }
                    } else if (string.equals("familyset")) {
                        readNestedFamilies(xmlPullParser, linkedHashMap, arrayList);
                    } else {
                        skip(xmlPullParser);
                    }
                }
            }
            for (final Fonts.Alias alias2 : arrayList) {
                if (linkedHashMap.containsKey(alias2.getName())) {
                    RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SystemFontsParser.Companion.readRootElementMap$lambda$3$1(alias2);
                        }
                    });
                } else {
                    Fonts.Family family = (Fonts.Family) linkedHashMap.get(alias2.getOriginal());
                    if (family != null) {
                        Fonts.Family familyRemapAlias2 = SystemFontsParser.Companion.remapAlias(alias2, family);
                        if (familyRemapAlias2 != null) {
                            linkedHashMap.put(alias2.getName(), familyRemapAlias2);
                        } else {
                            RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SystemFontsParser.Companion.readRootElementMap$lambda$3$0$1(alias2);
                                }
                            });
                        }
                    }
                }
            }
            List listAr = atqq.ar(arrayList);
            while (!listAr.isEmpty()) {
                Iterator it = listAr.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Fonts.Alias alias3 = (Fonts.Alias) it.next();
                    if (linkedHashMap.containsKey(alias3.getName())) {
                        it.remove();
                    } else {
                        Fonts.Family family2 = (Fonts.Family) linkedHashMap.get(alias3.getOriginal());
                        if (family2 != null && (familyRemapAlias = SystemFontsParser.Companion.remapAlias(alias3, family2)) != null) {
                            linkedHashMap.put(alias3.getName(), familyRemapAlias);
                            it.remove();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readRootElementMap$lambda$3$0$1(Fonts.Alias alias) {
            return "Could not remap alias '" + alias.getName() + "' because target '" + alias.getOriginal() + "' not found.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String readRootElementMap$lambda$3$1(Fonts.Alias alias) {
            return "Skipping alias '" + alias.getName() + "' because a family with that name already exists.";
        }

        private final Fonts.Family remapAlias(final Fonts.Alias alias, Fonts.Family family) {
            final Fonts.Weight weight = alias.getWeight();
            if (weight == null) {
                return new Fonts.Family(alias.getName(), family.getVariant(), family.getLang(), family.getFonts());
            }
            List list = (List) family.getFonts().get(weight);
            if (list == null || list.isEmpty()) {
                RiveLog.INSTANCE.getLogger().w(SystemFontsParser.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.SystemFontsParser$Companion$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SystemFontsParser.Companion.remapAlias$lambda$0(alias, weight);
                    }
                });
                return null;
            }
            return new Fonts.Family(alias.getName(), family.component2(), family.component3(), atqq.v(new awml(weight, list)));
        }

        static final String remapAlias$lambda$0(Fonts.Alias alias, Fonts.Weight weight) {
            return "Alias '" + alias.getName() + "' targets weight " + weight.getWeight() + " in family '" + alias.getOriginal() + "', but that doesn't exist";
        }

        private final void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            int i = 1;
            while (i > 0) {
                int next = xmlPullParser.next();
                if (next == 1) {
                    return;
                }
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
        }

        public final List getSYSTEM_FONTS_PATHS$third_party_java_android_libs_rive_rive_android() {
            return SystemFontsParser.SYSTEM_FONTS_PATHS;
        }

        public final List parseFontsXML$third_party_java_android_libs_rive_rive_android(InputStream inputStream) throws XmlPullParserException, IOException {
            inputStream.getClass();
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            xmlPullParserNewPullParser.nextTag();
            xmlPullParserNewPullParser.getClass();
            return readRootElement(xmlPullParserNewPullParser);
        }

        public final Map parseFontsXMLMap$third_party_java_android_libs_rive_rive_android(InputStream inputStream) throws XmlPullParserException, IOException {
            inputStream.getClass();
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            xmlPullParserNewPullParser.nextTag();
            xmlPullParserNewPullParser.getClass();
            return readRootElementMap(xmlPullParserNewPullParser);
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }
    }
}
