package app.rive.runtime.kotlin.fonts;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import app.rive.RiveLog;
import defpackage.a;
import defpackage.actf;
import defpackage.atqq;
import defpackage.avkz;
import defpackage.awml;
import defpackage.awno;
import defpackage.awnp;
import defpackage.awpr;
import defpackage.awqg;
import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awsq;
import defpackage.awss;
import defpackage.awsu;
import defpackage.awsx;
import defpackage.awtc;
import internal.org.jni_zero.JniZero;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FontHelper {
    public static final int $stable = 0;
    private static final String TAG = "Rive/FontHelper";
    private static awml localeWatcher;
    public static final Companion Companion = new Companion(null);
    private static final AtomicReference familiesMapCache = new AtomicReference(null);
    private static final AtomicReference familiesListCache = new AtomicReference(null);

    public static final List getSystemFallbackChain() {
        return Companion.getSystemFallbackChain();
    }

    public static final void invalidateSystemFallbacks() {
        Companion.invalidateSystemFallbacks();
    }

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        private Companion() {
        }

        private final void filterFamilies(List list, Set set, Fonts.Weight weight, String str) {
            awsx awsxVarAx;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Fonts.Family family = (Fonts.Family) it.next();
                if (weight == null) {
                    awsxVarAx = new awsu(atqq.ax(family.getFonts().values()), new actf(12), 0);
                } else {
                    List list2 = (List) family.getFonts().get(weight);
                    awsxVarAx = list2 != null ? atqq.ax(list2) : awsq.a;
                }
                Iterator itA = awsxVarAx.a();
                while (itA.hasNext()) {
                    Fonts.Font font = (Fonts.Font) itA.next();
                    if (str == null || awrc.v(str) || awrc.c(font.getStyle(), str)) {
                        set.add(font);
                    }
                }
            }
        }

        private final List filterNonExistingFonts(List list) {
            if (list.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Fonts.Family family = (Fonts.Family) it.next();
                Map fonts = family.getFonts();
                LinkedHashMap linkedHashMap = new LinkedHashMap(atqq.u(fonts.size()));
                for (Map.Entry entry : fonts.entrySet()) {
                    Object key = entry.getKey();
                    List list2 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        if (FontHelper.Companion.getFontFile((Fonts.Font) obj) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Fonts.Family family2 = !linkedHashMap2.isEmpty() ? new Fonts.Family(family.getName(), family.getVariant(), family.getLang(), linkedHashMap2) : null;
                if (family2 != null) {
                    arrayList.add(family2);
                }
            }
            return arrayList;
        }

        static final boolean findMatches$lambda$0(String str, String str2, Map.Entry entry) {
            entry.getClass();
            Fonts.Family family = (Fonts.Family) entry.getValue();
            if (str == null || awrc.z(family.getName(), str)) {
                return str2 == null || awrc.c(family.getLang(), str2);
            }
            return false;
        }

        static final Fonts.Family findMatches$lambda$1(Map.Entry entry) {
            entry.getClass();
            return (Fonts.Family) entry.getValue();
        }

        static final boolean findMatches$lambda$2(String str, String str2, Fonts.Family family) {
            family.getClass();
            if (str == null || awrc.z(family.getName(), str)) {
                return str2 == null || awrc.c(family.getLang(), str2);
            }
            return false;
        }

        public static /* synthetic */ List findMatches$third_party_java_android_libs_rive_rive_android$default(Companion companion, List list, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.findMatches$third_party_java_android_libs_rive_rive_android(list, fontOpts);
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if (1 == (i & 1)) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if (1 == (i & 1)) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 1) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        static final String getFallbackFonts$lambda$0() {
            return "getFallbackFonts: no system font found";
        }

        static final File getFontFile$lambda$0(Fonts.Font font, String str) {
            str.getClass();
            return new File(str, awrc.q(font.getName()).toString());
        }

        public static /* synthetic */ List getSystemFallbackChain$default(Companion companion, Locale locale, int i, Object obj) {
            if ((i & 1) != 0) {
                locale = Locale.getDefault();
                locale.getClass();
            }
            return companion.getSystemFallbackChain(locale);
        }

        static final File loadFontList$lambda$0(String str) {
            str.getClass();
            return new File(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String loadFontList$lambda$2$0(Exception exc) {
            return "Error parsing fonts XML: ".concat(String.valueOf(exc.getMessage()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String loadFontList$lambda$3$0() {
            return "No valid system font XML file found at expected paths.";
        }

        static final File loadFonts$lambda$0(String str) {
            str.getClass();
            return new File(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String loadFonts$lambda$2$0(Exception exc) {
            return "Error parsing fonts XML: ".concat(String.valueOf(exc.getMessage()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String loadFonts$lambda$3$0() {
            return "No valid system font XML file found at expected paths.";
        }

        private final List processMatchingFamilies(awsx awsxVar, final String str, Fonts.Weight weight, String str2) {
            List listG = awqx.g(awsxVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listG) {
                String name = ((Fonts.Family) obj).getName();
                if (name == null || awrc.v(name)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            awml awmlVar = new awml(arrayList, arrayList2);
            Object obj2 = awmlVar.a;
            List list = (List) awmlVar.b;
            List listAm = atqq.am((List) obj2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return atqq.f(Boolean.valueOf(awrc.c(((Fonts.Family) obj4).getLang(), str)), Boolean.valueOf(awrc.c(((Fonts.Family) obj3).getLang(), str)));
                }
            });
            List listAm2 = atqq.am(list, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$2
                @Override // java.util.Comparator
                public final int compare(Object obj3, Object obj4) {
                    return atqq.f(Boolean.valueOf(awrc.c(((Fonts.Family) obj4).getLang(), str)), Boolean.valueOf(awrc.c(((Fonts.Family) obj3).getLang(), str)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listAm, linkedHashSet, weight, str2);
            filterFamilies(listAm2, linkedHashSet, weight, str2);
            return atqq.ap(linkedHashSet);
        }

        private final Fonts.Font regularFont(Fonts.Family family) {
            Object obj;
            List listO = atqq.O(family.getFonts().values());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listO) {
                Fonts.Font font = (Fonts.Font) obj2;
                if (awrc.c(font.getStyle(), Fonts.Font.STYLE_NORMAL) && font.getFallbackFor() == null) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int iAbs = Math.abs(((Fonts.Font) next).getWeight().getWeight() - Fonts.Weight.Companion.getNORMAL().getWeight());
                    do {
                        Object next2 = it.next();
                        int iAbs2 = Math.abs(((Fonts.Font) next2).getWeight().getWeight() - Fonts.Weight.Companion.getNORMAL().getWeight());
                        if (iAbs > iAbs2) {
                            next = next2;
                            iAbs = iAbs2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            return (Fonts.Font) obj;
        }

        public final List findMatches$third_party_java_android_libs_rive_rive_android(Map map, Fonts.FontOpts fontOpts) {
            map.getClass();
            fontOpts.getClass();
            final String familyName = fontOpts.getFamilyName();
            final String lang = fontOpts.getLang();
            return processMatchingFamilies(new awsu(new awss(atqq.ax(map.entrySet()), true, new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda8
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FontHelper.Companion.findMatches$lambda$0(familyName, lang, (Map.Entry) obj));
                }
            }), new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda9
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.findMatches$lambda$1((Map.Entry) obj);
                }
            }, 2), fontOpts.getLang(), fontOpts.getWeight(), fontOpts.getStyle());
        }

        public final Fonts.Font getFallbackFont(Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return (Fonts.Font) atqq.Z(getFallbackFonts(fontOpts));
        }

        public final byte[] getFallbackFontBytes(Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(fontOpts);
            if (fallbackFont != null) {
                return FontHelper.Companion.getFontBytes(fallbackFont);
            }
            return null;
        }

        public final List getFallbackFonts(Fonts.FontOpts fontOpts) {
            fontOpts.getClass();
            List systemFontList = getSystemFontList();
            if (!systemFontList.isEmpty()) {
                return findMatches$third_party_java_android_libs_rive_rive_android(systemFontList, fontOpts);
            }
            RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FontHelper.Companion.getFallbackFonts$lambda$0();
                }
            });
            return awno.a;
        }

        public final byte[] getFontBytes(Fonts.Font font) {
            font.getClass();
            File fontFile = getFontFile(font);
            if (fontFile == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fontFile);
            try {
                long length = fontFile.length();
                if (length > 2147483647L) {
                    throw new OutOfMemoryError("File " + fontFile + " is too big (" + length + " bytes) to fit in memory.");
                }
                int i = (int) length;
                byte[] bArrCopyOf = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                    if (i4 < 0) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
                        bArrCopyOf.getClass();
                        JniZero.l(fileInputStream, null);
                        return bArrCopyOf;
                    }
                    i2 -= i4;
                    i3 += i4;
                }
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    awpr awprVar = new awpr();
                    awprVar.write(i5);
                    avkz.c(fileInputStream, awprVar);
                    int size = awprVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError(a.bV(fontFile, "File ", " is too big to fit in memory."));
                    }
                    byte[] bArrA = awprVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    bArrCopyOf.getClass();
                    atqq.aV(bArrA, bArrCopyOf, i, 0, awprVar.size());
                }
                JniZero.l(fileInputStream, null);
                return bArrCopyOf;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    JniZero.l(fileInputStream, th);
                    throw th2;
                }
            }
        }

        public final File getFontFile(final Fonts.Font font) {
            Object next;
            font.getClass();
            awtc awtcVar = new awtc(new awsu(atqq.ax(SystemFontsParser.Companion.getSYSTEM_FONTS_PATHS$third_party_java_android_libs_rive_rive_android()), new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda0
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.getFontFile$lambda$0(font, (String) obj);
                }
            }, 2));
            while (awtcVar.hasNext()) {
                next = awtcVar.next();
                if (((File) next).exists()) {
                    return (File) next;
                }
            }
            next = null;
            return (File) next;
        }

        public final List getSystemFallbackChain(Locale locale) {
            Fonts.FontFile fontFile;
            locale.getClass();
            List systemFontList = getSystemFontList();
            ArrayList arrayList = new ArrayList();
            for (Object obj : systemFontList) {
                Fonts.Family family = (Fonts.Family) obj;
                String name = family.getName();
                if (name == null || awrc.v(name)) {
                    if (!awrc.c(family.getVariant(), "elegant")) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (FontHelper.Companion.langMatches$third_party_java_android_libs_rive_rive_android(((Fonts.Family) obj2).getLang(), locale)) {
                    arrayList2.add(obj2);
                } else {
                    arrayList3.add(obj2);
                }
            }
            awml awmlVar = new awml(arrayList2, arrayList3);
            Object obj3 = awmlVar.a;
            List list = (List) awmlVar.b;
            List listI = atqq.I(getFallbackFont$default(this, null, 1, null));
            List listAj = atqq.aj((List) obj3, list);
            ArrayList arrayList4 = new ArrayList();
            Iterator it = listAj.iterator();
            while (it.hasNext()) {
                Fonts.Font fontRegularFont = FontHelper.Companion.regularFont((Fonts.Family) it.next());
                if (fontRegularFont != null) {
                    arrayList4.add(fontRegularFont);
                }
            }
            List<Fonts.Font> listAj2 = atqq.aj(listI, arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Fonts.Font font : listAj2) {
                File fontFile2 = FontHelper.Companion.getFontFile(font);
                if (fontFile2 != null) {
                    String absolutePath = fontFile2.getAbsolutePath();
                    absolutePath.getClass();
                    fontFile = new Fonts.FontFile(absolutePath, font.getTtcIndex());
                } else {
                    fontFile = null;
                }
                if (fontFile != null) {
                    arrayList5.add(fontFile);
                }
            }
            return atqq.ah(arrayList5);
        }

        public final List getSystemFontList() {
            List listLoadFontList$third_party_java_android_libs_rive_rive_android = (List) FontHelper.familiesListCache.get();
            if (listLoadFontList$third_party_java_android_libs_rive_rive_android == null) {
                synchronized (this) {
                    listLoadFontList$third_party_java_android_libs_rive_rive_android = (List) FontHelper.familiesListCache.get();
                    if (listLoadFontList$third_party_java_android_libs_rive_rive_android == null) {
                        listLoadFontList$third_party_java_android_libs_rive_rive_android = FontHelper.Companion.loadFontList$third_party_java_android_libs_rive_rive_android();
                    }
                }
            }
            return listLoadFontList$third_party_java_android_libs_rive_rive_android;
        }

        public final Map getSystemFonts() {
            Map mapLoadFonts$third_party_java_android_libs_rive_rive_android = (Map) FontHelper.familiesMapCache.get();
            if (mapLoadFonts$third_party_java_android_libs_rive_rive_android == null) {
                synchronized (this) {
                    mapLoadFonts$third_party_java_android_libs_rive_rive_android = (Map) FontHelper.familiesMapCache.get();
                    if (mapLoadFonts$third_party_java_android_libs_rive_rive_android == null) {
                        mapLoadFonts$third_party_java_android_libs_rive_rive_android = FontHelper.Companion.loadFonts$third_party_java_android_libs_rive_rive_android();
                    }
                }
            }
            return mapLoadFonts$third_party_java_android_libs_rive_rive_android;
        }

        public final void invalidateSystemFallbacks() {
            NativeFontHelper.INSTANCE.cppInvalidateSystemFallbacks();
        }

        public final boolean langMatches$third_party_java_android_libs_rive_rive_android(String str, Locale locale) {
            locale.getClass();
            if (str == null) {
                return false;
            }
            String script = locale.getScript();
            if (script.length() == 0) {
                if (awrc.c(locale.getLanguage(), "zh")) {
                    script = atqq.aS(new String[]{"TW", "HK", "MO"}).contains(locale.getCountry()) ? "Hant" : "Hans";
                } else {
                    script = "";
                }
            }
            script.getClass();
            List listE = awrc.E(str, new char[]{','});
            if (listE.isEmpty()) {
                return false;
            }
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                List listE2 = awrc.E(awrc.q((String) it.next()).toString(), new char[]{'-'});
                String str2 = (String) atqq.aa(listE2, 1);
                if (str2 == null || str2.length() != 4) {
                    str2 = null;
                }
                if (awrc.c(listE2.get(0), locale.getLanguage()) && (str2 == null || awrc.z(str2, script))) {
                    return true;
                }
            }
            return false;
        }

        public final List loadFontList$third_party_java_android_libs_rive_rive_android() {
            Object next;
            List fontsXML$third_party_java_android_libs_rive_rive_android;
            awtc awtcVar = new awtc(new awsu(atqq.aT(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH}), new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda2
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.loadFontList$lambda$0((String) obj);
                }
            }, 2));
            do {
                if (!awtcVar.hasNext()) {
                    next = null;
                    break;
                }
                next = awtcVar.next();
            } while (!((File) next).exists());
            File file = (File) next;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXML$third_party_java_android_libs_rive_rive_android = SystemFontsParser.Companion.parseFontsXML$third_party_java_android_libs_rive_rive_android(fileInputStream);
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FontHelper.Companion.loadFontList$lambda$2$0(e);
                            }
                        });
                        fontsXML$third_party_java_android_libs_rive_rive_android = awno.a;
                    }
                    JniZero.l(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.l(fileInputStream, th);
                        throw th2;
                    }
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontHelper.Companion.loadFontList$lambda$3$0();
                    }
                });
                fontsXML$third_party_java_android_libs_rive_rive_android = awno.a;
            }
            List listFilterNonExistingFonts = filterNonExistingFonts(fontsXML$third_party_java_android_libs_rive_rive_android);
            FontHelper.familiesListCache.set(listFilterNonExistingFonts);
            return listFilterNonExistingFonts;
        }

        public final Map loadFonts$third_party_java_android_libs_rive_rive_android() {
            Object next;
            Map fontsXMLMap$third_party_java_android_libs_rive_rive_android;
            awtc awtcVar = new awtc(new awsu(atqq.aT(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH}), new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda5
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.loadFonts$lambda$0((String) obj);
                }
            }, 2));
            do {
                if (!awtcVar.hasNext()) {
                    next = null;
                    break;
                }
                next = awtcVar.next();
            } while (!((File) next).exists());
            File file = (File) next;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXMLMap$third_party_java_android_libs_rive_rive_android = SystemFontsParser.Companion.parseFontsXMLMap$third_party_java_android_libs_rive_rive_android(fileInputStream);
                    } catch (Exception e) {
                        RiveLog.INSTANCE.getLogger().e(FontHelper.TAG, null, new Function0() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FontHelper.Companion.loadFonts$lambda$2$0(e);
                            }
                        });
                        fontsXMLMap$third_party_java_android_libs_rive_rive_android = awnp.a;
                    }
                    JniZero.l(fileInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        JniZero.l(fileInputStream, th);
                        throw th2;
                    }
                }
            } else {
                RiveLog.INSTANCE.getLogger().w(FontHelper.TAG, new Function0() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FontHelper.Companion.loadFonts$lambda$3$0();
                    }
                });
                fontsXMLMap$third_party_java_android_libs_rive_rive_android = awnp.a;
            }
            Map mapFilterNonExistingFonts = filterNonExistingFonts(fontsXMLMap$third_party_java_android_libs_rive_rive_android);
            FontHelper.familiesMapCache.set(mapFilterNonExistingFonts);
            return mapFilterNonExistingFonts;
        }

        public final void resetForTesting() {
            FontHelper.familiesMapCache.set(null);
            FontHelper.familiesListCache.set(null);
        }

        public final synchronized void stopWatchingLocaleChangesForTesting$third_party_java_android_libs_rive_rive_android() {
            awml awmlVar = FontHelper.localeWatcher;
            if (awmlVar != null) {
                ((Context) awmlVar.a).unregisterComponentCallbacks((ComponentCallbacks) awmlVar.b);
            }
            FontHelper.localeWatcher = null;
        }

        public final synchronized void watchLocaleChanges$third_party_java_android_libs_rive_rive_android(Context context) {
            context.getClass();
            if (FontHelper.localeWatcher != null) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            ComponentCallbacks componentCallbacks = new ComponentCallbacks() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$watchLocaleChanges$callback$1
                private Locale lastLocale;

                {
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    this.lastLocale = locale;
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    configuration.getClass();
                    Locale locale = Locale.getDefault();
                    locale.getClass();
                    if (awrc.c(locale, this.lastLocale)) {
                        return;
                    }
                    this.lastLocale = locale;
                    FontHelper.Companion.invalidateSystemFallbacks();
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                }
            };
            applicationContext.registerComponentCallbacks(componentCallbacks);
            FontHelper.localeWatcher = new awml(applicationContext, componentCallbacks);
            invalidateSystemFallbacks();
        }

        public /* synthetic */ Companion(awqx awqxVar) {
            this();
        }

        public static /* synthetic */ List findMatches$third_party_java_android_libs_rive_rive_android$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i, Object obj) {
            if ((i & 2) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.findMatches$third_party_java_android_libs_rive_rive_android(map, fontOpts);
        }

        public final List findMatches$third_party_java_android_libs_rive_rive_android(List list, Fonts.FontOpts fontOpts) {
            list.getClass();
            fontOpts.getClass();
            final String familyName = fontOpts.getFamilyName();
            final String lang = fontOpts.getLang();
            return processMatchingFamilies(new awss(atqq.ax(list), true, new awqg() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$$ExternalSyntheticLambda10
                @Override // defpackage.awqg
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FontHelper.Companion.findMatches$lambda$2(familyName, lang, (Fonts.Family) obj));
                }
            }), fontOpts.getLang(), fontOpts.getWeight(), fontOpts.getStyle());
        }

        private final Map filterNonExistingFonts(Map map) {
            String name;
            if (map.isEmpty()) {
                return map;
            }
            List listFilterNonExistingFonts = filterNonExistingFonts(atqq.ap(map.values()));
            LinkedHashMap linkedHashMap = new LinkedHashMap(awro.f(atqq.u(atqq.N(listFilterNonExistingFonts, 10)), 16));
            for (Object obj : listFilterNonExistingFonts) {
                Fonts.Family family = (Fonts.Family) obj;
                String name2 = family.getName();
                if (name2 != null && name2.length() != 0) {
                    name = family.getName();
                } else {
                    name = ((Fonts.Font) atqq.X(atqq.O(family.getFonts().values()))).getName();
                }
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        public final List getSystemFallbackChain() {
            return getSystemFallbackChain$default(this, null, 1, null);
        }
    }

    public static final List getSystemFallbackChain(Locale locale) {
        return Companion.getSystemFallbackChain(locale);
    }
}
