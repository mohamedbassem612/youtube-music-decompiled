package app.rive.runtime.kotlin.fonts;

import defpackage.awqx;
import defpackage.awrc;
import defpackage.awro;
import defpackage.awsa;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class Fonts {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: PG */
    public final class Axis {
        public static final int $stable = 0;
        private final String styleValue;
        private final String tag;

        public Axis(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.tag = str;
            this.styleValue = str2;
        }

        public static /* synthetic */ Axis copy$default(Axis axis, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = axis.tag;
            }
            if ((i & 2) != 0) {
                str2 = axis.styleValue;
            }
            return axis.copy(str, str2);
        }

        public final String component1() {
            return this.tag;
        }

        public final String component2() {
            return this.styleValue;
        }

        public final Axis copy(String str, String str2) {
            str.getClass();
            str2.getClass();
            return new Axis(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Axis) {
                Axis axis = (Axis) obj;
                if (awrc.c(this.tag, axis.tag) && awrc.c(this.styleValue, axis.styleValue)) {
                    return true;
                }
            }
            return false;
        }

        public final String getStyleValue() {
            return this.styleValue;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return (this.tag.hashCode() * 31) + this.styleValue.hashCode();
        }

        public String toString() {
            return "Axis(tag=" + this.tag + ", styleValue=" + this.styleValue + ')';
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Font {
        public static final String STYLE_ITALIC = "italic";
        public static final String STYLE_NORMAL = "normal";
        private final List axis;
        private final String fallbackFor;
        private final String name;
        private final String postScriptName;
        private final String style;
        private final int ttcIndex;
        private final Weight weight;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public Font(Weight weight, String str, String str2, List list, int i, String str3, String str4) {
            weight.getClass();
            str.getClass();
            str2.getClass();
            this.weight = weight;
            this.style = str;
            this.name = str2;
            this.axis = list;
            this.ttcIndex = i;
            this.postScriptName = str3;
            this.fallbackFor = str4;
        }

        public static /* synthetic */ Font copy$default(Font font, Weight weight, String str, String str2, List list, int i, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                weight = font.weight;
            }
            if ((i2 & 2) != 0) {
                str = font.style;
            }
            if ((i2 & 4) != 0) {
                str2 = font.name;
            }
            if ((i2 & 8) != 0) {
                list = font.axis;
            }
            if ((i2 & 16) != 0) {
                i = font.ttcIndex;
            }
            if ((i2 & 32) != 0) {
                str3 = font.postScriptName;
            }
            if ((i2 & 64) != 0) {
                str4 = font.fallbackFor;
            }
            return font.copy(weight, str, str2, list, i, str3, str4);
        }

        public final Weight component1() {
            return this.weight;
        }

        public final String component2() {
            return this.style;
        }

        public final String component3() {
            return this.name;
        }

        public final List component4() {
            return this.axis;
        }

        public final int component5() {
            return this.ttcIndex;
        }

        public final String component6() {
            return this.postScriptName;
        }

        public final String component7() {
            return this.fallbackFor;
        }

        public final Font copy(Weight weight, String str, String str2, List list, int i, String str3, String str4) {
            weight.getClass();
            str.getClass();
            str2.getClass();
            return new Font(weight, str, str2, list, i, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Font) {
                Font font = (Font) obj;
                if (awrc.c(this.weight, font.weight) && awrc.c(this.style, font.style) && awrc.c(this.name, font.name) && awrc.c(this.axis, font.axis) && this.ttcIndex == font.ttcIndex && awrc.c(this.postScriptName, font.postScriptName) && awrc.c(this.fallbackFor, font.fallbackFor)) {
                    return true;
                }
            }
            return false;
        }

        public final List getAxis() {
            return this.axis;
        }

        public final String getFallbackFor() {
            return this.fallbackFor;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPostScriptName() {
            return this.postScriptName;
        }

        public final String getStyle() {
            return this.style;
        }

        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iHashCode = (((this.weight.hashCode() * 31) + this.style.hashCode()) * 31) + this.name.hashCode();
            List list = this.axis;
            int iHashCode2 = ((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.ttcIndex) * 31;
            String str = this.postScriptName;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fallbackFor;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Font(weight=" + this.weight + ", style=" + this.style + ", name=" + this.name + ", axis=" + this.axis + ", ttcIndex=" + this.ttcIndex + ", postScriptName=" + this.postScriptName + ", fallbackFor=" + this.fallbackFor + ')';
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }

        public /* synthetic */ Font(Weight weight, String str, String str2, List list, int i, String str3, String str4, int i2, awqx awqxVar) {
            this(weight, str, str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class FontOpts {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static final FontOpts DEFAULT = new FontOpts("sans-serif", null, null, null, 14, null);
        private final String familyName;
        private final String lang;
        private final String style;
        private final Weight weight;

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ FontOpts(String str, String str2, Weight weight, String str3, int i, awqx awqxVar) {
            weight = (i & 4) != 0 ? Weight.Companion.getNORMAL() : weight;
            int i2 = i & 1;
            this(1 == i2 ? null : str, (i & 2) != 0 ? null : str2, weight, (i & 8) != 0 ? Font.STYLE_NORMAL : str3);
        }

        public static /* synthetic */ FontOpts copy$default(FontOpts fontOpts, String str, String str2, Weight weight, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fontOpts.familyName;
            }
            if ((i & 2) != 0) {
                str2 = fontOpts.lang;
            }
            if ((i & 4) != 0) {
                weight = fontOpts.weight;
            }
            if ((i & 8) != 0) {
                str3 = fontOpts.style;
            }
            return fontOpts.copy(str, str2, weight, str3);
        }

        public final String component1() {
            return this.familyName;
        }

        public final String component2() {
            return this.lang;
        }

        public final Weight component3() {
            return this.weight;
        }

        public final String component4() {
            return this.style;
        }

        public final FontOpts copy(String str, String str2, Weight weight, String str3) {
            return new FontOpts(str, str2, weight, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FontOpts) {
                FontOpts fontOpts = (FontOpts) obj;
                if (awrc.c(this.familyName, fontOpts.familyName) && awrc.c(this.lang, fontOpts.lang) && awrc.c(this.weight, fontOpts.weight) && awrc.c(this.style, fontOpts.style)) {
                    return true;
                }
            }
            return false;
        }

        public final String getFamilyName() {
            return this.familyName;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getStyle() {
            return this.style;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.familyName;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.lang;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int i = iHashCode * 31;
            Weight weight = this.weight;
            int iHashCode3 = (((i + iHashCode2) * 31) + (weight == null ? 0 : weight.hashCode())) * 31;
            String str3 = this.style;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "FontOpts(familyName=" + this.familyName + ", lang=" + this.lang + ", weight=" + this.weight + ", style=" + this.style + ')';
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            public final FontOpts getDEFAULT() {
                return FontOpts.DEFAULT;
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }

        public FontOpts(String str, String str2, Weight weight, String str3) {
            this.familyName = str;
            this.lang = str2;
            this.weight = weight;
            this.style = str3;
        }

        public FontOpts() {
            this(null, null, null, null, 15, null);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Weight implements Comparable {
        public static final int $stable = 0;
        private final int weight;
        public static final Companion Companion = new Companion(null);
        private static final Weight NORMAL = new Weight(400);
        private static final Weight BOLD = new Weight(700);

        public /* synthetic */ Weight(int i, int i2, awqx awqxVar) {
            this(1 == (i2 & 1) ? 400 : i);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = weight.weight;
            }
            return weight.copy(i);
        }

        @Override // java.lang.Comparable
        public int compareTo(Weight weight) {
            weight.getClass();
            int i = this.weight;
            int i2 = weight.weight;
            if (i < i2) {
                return -1;
            }
            return i != i2 ? 1 : 0;
        }

        public final int component1() {
            return this.weight;
        }

        public final Weight copy(int i) {
            return new Weight(i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Weight) && this.weight == ((Weight) obj).weight;
            }
            return true;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return this.weight;
        }

        public String toString() {
            return "Weight(weight=" + this.weight + ')';
        }

        /* JADX INFO: compiled from: PG */
        public final class Companion {
            private Companion() {
            }

            public static /* synthetic */ Weight fromInt$default(Companion companion, int i, int i2, Object obj) {
                if (1 == (i2 & 1)) {
                    i = 400;
                }
                return companion.fromInt(i);
            }

            public final Weight fromInt(int i) {
                return new Weight(awro.o(i, new awsa(0, 1000)));
            }

            public final Weight fromString(String str) {
                Integer numG;
                int iO = 400;
                if (str != null && (numG = awrc.G(str)) != null) {
                    iO = awro.o(numG.intValue(), new awsa(0, 1000));
                }
                return new Weight(iO);
            }

            public final Weight getBOLD() {
                return Weight.BOLD;
            }

            public final Weight getNORMAL() {
                return Weight.NORMAL;
            }

            public /* synthetic */ Companion(awqx awqxVar) {
                this();
            }
        }

        public Weight(int i) {
            this.weight = i;
        }

        public Weight() {
            this(0, 1, null);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class FontFile {
        public static final int $stable = 0;
        private final String path;
        private final int ttcIndex;

        public FontFile(String str, int i) {
            str.getClass();
            this.path = str;
            this.ttcIndex = i;
        }

        public static /* synthetic */ FontFile copy$default(FontFile fontFile, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = fontFile.path;
            }
            if ((i2 & 2) != 0) {
                i = fontFile.ttcIndex;
            }
            return fontFile.copy(str, i);
        }

        public final String component1() {
            return this.path;
        }

        public final int component2() {
            return this.ttcIndex;
        }

        public final FontFile copy(String str, int i) {
            str.getClass();
            return new FontFile(str, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FontFile) {
                FontFile fontFile = (FontFile) obj;
                if (awrc.c(this.path, fontFile.path) && this.ttcIndex == fontFile.ttcIndex) {
                    return true;
                }
            }
            return false;
        }

        public final String getPath() {
            return this.path;
        }

        public final int getTtcIndex() {
            return this.ttcIndex;
        }

        public int hashCode() {
            return (this.path.hashCode() * 31) + this.ttcIndex;
        }

        public String toString() {
            return "FontFile(path=" + this.path + ", ttcIndex=" + this.ttcIndex + ')';
        }

        public /* synthetic */ FontFile(String str, int i, int i2, awqx awqxVar) {
            this(str, (i2 & 2) != 0 ? 0 : i);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class FileFont {
        public static final int $stable = 0;
        private final String lang;
        private final String name;
        private final String variant;

        public /* synthetic */ FileFont(String str, String str2, String str3, int i, awqx awqxVar) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public static /* synthetic */ FileFont copy$default(FileFont fileFont, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileFont.name;
            }
            if ((i & 2) != 0) {
                str2 = fileFont.variant;
            }
            if ((i & 4) != 0) {
                str3 = fileFont.lang;
            }
            return fileFont.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.variant;
        }

        public final String component3() {
            return this.lang;
        }

        public final FileFont copy(String str, String str2, String str3) {
            str.getClass();
            return new FileFont(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FileFont) {
                FileFont fileFont = (FileFont) obj;
                if (awrc.c(this.name, fileFont.name) && awrc.c(this.variant, fileFont.variant) && awrc.c(this.lang, fileFont.lang)) {
                    return true;
                }
            }
            return false;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.variant;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lang;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FileFont(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ')';
        }

        public FileFont(String str, String str2, String str3) {
            str.getClass();
            this.name = str;
            this.variant = str2;
            this.lang = str3;
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Alias {
        public static final int $stable = 0;
        private final String name;
        private final String original;
        private final Weight weight;

        public Alias(String str, String str2, Weight weight) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.original = str2;
            this.weight = weight;
        }

        public static /* synthetic */ Alias copy$default(Alias alias, String str, String str2, Weight weight, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alias.name;
            }
            if ((i & 2) != 0) {
                str2 = alias.original;
            }
            if ((i & 4) != 0) {
                weight = alias.weight;
            }
            return alias.copy(str, str2, weight);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.original;
        }

        public final Weight component3() {
            return this.weight;
        }

        public final Alias copy(String str, String str2, Weight weight) {
            str.getClass();
            str2.getClass();
            return new Alias(str, str2, weight);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Alias) {
                Alias alias = (Alias) obj;
                if (awrc.c(this.name, alias.name) && awrc.c(this.original, alias.original) && awrc.c(this.weight, alias.weight)) {
                    return true;
                }
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final String getOriginal() {
            return this.original;
        }

        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iHashCode = (this.name.hashCode() * 31) + this.original.hashCode();
            Weight weight = this.weight;
            return (iHashCode * 31) + (weight == null ? 0 : weight.hashCode());
        }

        public String toString() {
            return "Alias(name=" + this.name + ", original=" + this.original + ", weight=" + this.weight + ')';
        }

        public /* synthetic */ Alias(String str, String str2, Weight weight, int i, awqx awqxVar) {
            this(str, str2, (i & 4) != 0 ? Weight.Companion.getNORMAL() : weight);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Family {
        public static final int $stable = 8;
        private final Map fonts;
        private final String lang;
        private final String name;
        private final String variant;

        public /* synthetic */ Family(String str, String str2, String str3, Map map, int i, awqx awqxVar) {
            this(1 == (i & 1) ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, map);
        }

        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = family.name;
            }
            if ((i & 2) != 0) {
                str2 = family.variant;
            }
            if ((i & 4) != 0) {
                str3 = family.lang;
            }
            if ((i & 8) != 0) {
                map = family.fonts;
            }
            return family.copy(str, str2, str3, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.variant;
        }

        public final String component3() {
            return this.lang;
        }

        public final Map component4() {
            return this.fonts;
        }

        public final Family copy(String str, String str2, String str3, Map map) {
            map.getClass();
            return new Family(str, str2, str3, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Family) {
                Family family = (Family) obj;
                if (awrc.c(this.name, family.name) && awrc.c(this.variant, family.variant) && awrc.c(this.lang, family.lang) && awrc.c(this.fonts, family.fonts)) {
                    return true;
                }
            }
            return false;
        }

        public final Map getFonts() {
            return this.fonts;
        }

        public final String getLang() {
            return this.lang;
        }

        public final String getName() {
            return this.name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.variant;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            int i = iHashCode * 31;
            String str3 = this.lang;
            return ((((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.fonts.hashCode();
        }

        public String toString() {
            return "Family(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ", fonts=" + this.fonts + ')';
        }

        public Family(String str, String str2, String str3, Map map) {
            map.getClass();
            this.name = str;
            this.variant = str2;
            this.lang = str3;
            this.fonts = map;
        }
    }
}
