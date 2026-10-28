package defpackage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends Format {
    public static final /* synthetic */ int d = 0;
    private static final String[] e = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] f = {"", "currency", "percent", "integer"};
    private static final String[] g = {"", "short", "medium", "long", "full"};
    private static final Locale h = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient aa b;
    public transient Map c;
    private transient DateFormat i;
    private transient NumberFormat j;
    private transient k k;
    private transient k l;

    public l(String str, Locale locale) {
        Cloneable decimalFormat;
        this.a = locale;
        try {
            aa aaVar = this.b;
            if (aaVar == null) {
                this.b = new aa(str);
            } else {
                aaVar.i(str);
            }
            Map map = this.c;
            if (map != null) {
                map.clear();
            }
            int iB = this.b.b() - 2;
            int i = 1;
            while (i < iB) {
                z zVarD = this.b.d(i);
                if (zVarD.e == 6 && zVarD.b() == 2) {
                    aa aaVar2 = this.b;
                    int i2 = i + 3;
                    String strF = aaVar2.f(aaVar2.d(i + 2));
                    String strF2 = "";
                    z zVarD2 = this.b.d(i2);
                    if (zVarD2.e == 11) {
                        strF2 = this.b.f(zVarD2);
                        i2 = i + 4;
                    }
                    int iC = c(strF, e);
                    if (iC == 0) {
                        int iC2 = c(strF2, f);
                        decimalFormat = iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? iC2 != 3 ? new DecimalFormat(strF2, new DecimalFormatSymbols(this.a)) : NumberFormat.getIntegerInstance(this.a) : NumberFormat.getPercentInstance(this.a) : NumberFormat.getCurrencyInstance(this.a) : NumberFormat.getInstance(this.a);
                    } else if (iC == 1) {
                        int iC3 = c(strF2, g);
                        decimalFormat = iC3 != 0 ? iC3 != 1 ? iC3 != 2 ? iC3 != 3 ? iC3 != 4 ? new SimpleDateFormat(strF2, this.a) : DateFormat.getDateInstance(0, this.a) : DateFormat.getDateInstance(1, this.a) : DateFormat.getDateInstance(2, this.a) : DateFormat.getDateInstance(3, this.a) : DateFormat.getDateInstance(2, this.a);
                    } else {
                        if (iC != 2) {
                            throw new IllegalArgumentException(a.bU((byte) 34, strF, "Unknown format type \""));
                        }
                        int iC4 = c(strF2, g);
                        decimalFormat = iC4 != 0 ? iC4 != 1 ? iC4 != 2 ? iC4 != 3 ? iC4 != 4 ? new SimpleDateFormat(strF2, this.a) : DateFormat.getTimeInstance(0, this.a) : DateFormat.getTimeInstance(1, this.a) : DateFormat.getTimeInstance(2, this.a) : DateFormat.getTimeInstance(3, this.a) : DateFormat.getTimeInstance(2, this.a);
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i), decimalFormat);
                    i = i2;
                }
                i++;
            }
        } catch (RuntimeException e2) {
            aa aaVar3 = this.b;
            if (aaVar3 != null) {
                aaVar3.a = null;
                aaVar3.d = false;
                aaVar3.b.clear();
                ArrayList arrayList = aaVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e2;
        }
    }

    private static final int c(String str, String[] strArr) {
        byte[] bArr = g.a;
        if (str.length() != 0 && (g.a(str.charAt(0)) || g.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                if (!g.a(str.charAt(i))) {
                    while (true) {
                        int i2 = length - 1;
                        if (!g.a(str.charAt(i2))) {
                            break;
                        }
                        length = i2;
                    }
                } else {
                    i++;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(h);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    private final void d(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String str2;
        String strF;
        Object objValueOf;
        short s;
        short s2;
        int iIndexOf;
        boolean z;
        Object objValueOf2;
        Map map2;
        boolean z2;
        aa aaVar;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        aa aaVar2 = this.b;
        String str3 = aaVar2.a;
        int iA = aaVar2.d(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z3 = true;
        int i3 = 1;
        while (true) {
            z zVarD = this.b.d(i3);
            int i4 = zVarD.e;
            int i5 = zVarD.a - iA;
            if (i5 != 0 && !str3.regionMatches(iA, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                str2 = str3;
                iA = zVarD.a();
            } else {
                int iC = this.b.c(i3);
                int iB = zVarD.b();
                z zVarD2 = this.b.d(i3 + 1);
                if (objArr != null) {
                    s = zVarD2.c;
                    objValueOf = Integer.valueOf(s);
                    strF = null;
                } else {
                    strF = zVarD2.e == 9 ? this.b.f(zVarD2) : Integer.toString(zVarD2.c);
                    objValueOf = strF;
                    s = 0;
                }
                int i6 = i3 + 2;
                Map map3 = this.c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i3))) != null) {
                    parsePosition2.setIndex(index);
                    objValueOf2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    str2 = str3;
                    iIndexOf = parsePosition2.getIndex();
                    z = z3;
                    s2 = s;
                } else if (iB == z3 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i3)))) {
                    str2 = str3;
                    boolean z4 = z3;
                    s2 = s;
                    StringBuilder sb = new StringBuilder();
                    aa aaVar3 = this.b;
                    String str4 = aaVar3.a;
                    int iA2 = aaVar3.d(iC).a();
                    int i7 = iC + 1;
                    while (true) {
                        z zVarD3 = this.b.d(i7);
                        int i8 = zVarD3.e;
                        sb.append((CharSequence) str4, iA2, zVarD3.a);
                        if (i8 == 6 || i8 == 2) {
                            break;
                        }
                        i7++;
                        iA2 = zVarD3.a();
                    }
                    String string = sb.toString();
                    iIndexOf = string.length() != 0 ? str.indexOf(string, index) : str.length();
                    if (iIndexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String strSubstring = str.substring(index, iIndexOf);
                    boolean zEquals = strSubstring.equals("{" + objValueOf.toString() + '}');
                    z = !zEquals;
                    objValueOf2 = z4 == zEquals ? null : strSubstring;
                } else {
                    if (iB != 3) {
                        if (!a.b(iB) && iB != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(a.a(iB)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    parsePosition2.setIndex(index);
                    aa aaVar4 = this.b;
                    int index2 = parsePosition2.getIndex();
                    double d2 = Double.NaN;
                    int i9 = index2;
                    int i10 = i6;
                    while (true) {
                        z2 = z3;
                        if (aaVar4.h(i10) == 7) {
                            str2 = str3;
                            s2 = s;
                            break;
                        }
                        double dA = aaVar4.a(aaVar4.d(i10));
                        int i11 = i10 + 2;
                        int iC2 = aaVar4.c(i11);
                        String str5 = aaVar4.a;
                        str2 = str3;
                        int iA3 = aaVar4.d(i11).a();
                        int i12 = 0;
                        while (true) {
                            i11++;
                            s2 = s;
                            z zVarD4 = aaVar4.d(i11);
                            aaVar = aaVar4;
                            if (i11 == iC2 || zVarD4.e == 3) {
                                int i13 = zVarD4.a - iA3;
                                if (i13 != 0 && !str.regionMatches(index2, str5, iA3, i13)) {
                                    i = -1;
                                    break;
                                }
                                i12 += i13;
                                if (i11 == iC2) {
                                    i = i12;
                                    break;
                                }
                                iA3 = zVarD4.a();
                            }
                            aaVar4 = aaVar;
                            s = s2;
                        }
                        if (i >= 0 && (i2 = i + index2) > i9) {
                            i9 = i2;
                            d2 = dA;
                            if (i2 == str.length()) {
                                break;
                            }
                        }
                        i10 = iC2 + 1;
                        z3 = z2;
                        aaVar4 = aaVar;
                        str3 = str2;
                        s = s2;
                    }
                    if (i9 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i9);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        objValueOf2 = Double.valueOf(d2);
                        iIndexOf = parsePosition2.getIndex();
                        z = z2;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s2] = objValueOf2;
                    } else if (map != null) {
                        map.put(strF, objValueOf2);
                    }
                }
                iA = this.b.d(iC).a();
                index = iIndexOf;
                i3 = iC;
            }
            i3++;
            z3 = true;
            str3 = str2;
        }
    }

    private final void e(Object obj, avju avjuVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            f(null, (Map) obj, avjuVar, fieldPosition);
        } else {
            f((Object[]) obj, null, avjuVar, fieldPosition);
        }
    }

    private final void f(Object[] objArr, Map map, avju avjuVar, FieldPosition fieldPosition) {
        if (objArr != null && this.b.d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        b(0, null, objArr, map, null, avjuVar, fieldPosition);
    }

    private final void g(int i, j jVar, Object[] objArr, Map map, Object[] objArr2, avju avjuVar) {
        if (this.b.f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        b(i, jVar, objArr, map, objArr2, avjuVar, null);
    }

    public final NumberFormat a() {
        NumberFormat numberFormat = this.j;
        if (numberFormat != null) {
            return numberFormat;
        }
        NumberFormat numberFormat2 = NumberFormat.getInstance(this.a);
        this.j = numberFormat2;
        return numberFormat2;
    }

    /* JADX WARN: Code duplicated, block: B:251:0x04cc A[LOOP:2: B:114:0x0244->B:251:0x04cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:296:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:318:0x04de A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, java.util.List] */
    public final void b(int i, j jVar, Object[] objArr, Map map, Object[] objArr2, avju avjuVar, FieldPosition fieldPosition) {
        Object objValueOf;
        Object obj;
        FieldPosition fieldPosition2;
        int i2;
        Object obj2;
        Map map2;
        int i3;
        int i4;
        k kVar;
        double dA;
        int i5;
        boolean z;
        String str;
        String str2;
        int i6;
        int i7;
        int i8;
        v vVar;
        int i9;
        Map map3;
        x xVarA;
        int iC;
        int i10;
        Format format;
        ?? r2;
        int i11;
        int i12;
        this = this;
        avju avjuVar2 = avjuVar;
        aa aaVar = this.b;
        String str3 = aaVar.a;
        int iA = aaVar.d(i).a();
        boolean z2 = true;
        int i13 = i + 1;
        FieldPosition fieldPosition3 = fieldPosition;
        while (true) {
            z zVarD = this.b.d(i13);
            int i14 = zVarD.e;
            int i15 = zVarD.a;
            try {
                avjuVar2.a.append(str3, iA, i15);
                avjuVar2.b += i15 - iA;
                if (i14 == 2) {
                    return;
                }
                int iA2 = zVarD.a();
                if (i14 != 5) {
                    if (i14 == 6) {
                        int iC2 = this.b.c(i13);
                        int iB = zVarD.b();
                        z zVarD2 = this.b.d(i13 + 1);
                        String strF = this.b.f(zVarD2);
                        if (objArr != 0) {
                            short s = zVarD2.c;
                            objValueOf = avjuVar2.c != null ? Integer.valueOf(s) : null;
                            if (s < 0 || s >= objArr.length) {
                                obj = null;
                            } else {
                                obj = objArr[s];
                                z2 = false;
                            }
                        } else if (objArr2 != null) {
                            int i16 = 0;
                            while (true) {
                                if (i16 >= 2) {
                                    z2 = z2;
                                    obj = null;
                                    break;
                                } else {
                                    if (strF.equals(objArr2[i16].toString())) {
                                        obj = objArr2[i16 + 1];
                                        z2 = false;
                                        break;
                                    }
                                    i16 += 2;
                                }
                            }
                            objValueOf = strF;
                        } else if (map == 0 || !map.containsKey(strF)) {
                            objValueOf = strF;
                            obj = null;
                        } else {
                            obj = map.get(strF);
                            objValueOf = strF;
                            z2 = false;
                        }
                        int i17 = i13 + 2;
                        int i18 = avjuVar2.b;
                        if (z2) {
                            avjuVar2.r("{" + strF + '}');
                        } else {
                            if (obj == null) {
                                avjuVar2.r("null");
                            } else {
                                if (jVar == 0 || jVar.e != i13) {
                                    fieldPosition2 = fieldPosition3;
                                    Map map4 = this.c;
                                    if (map4 != null && (format = (Format) map4.get(Integer.valueOf(i13))) != null) {
                                        avjuVar2.s(format, obj);
                                    } else if (iB == 1 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i13)))) {
                                        i2 = i18;
                                        str3 = str3;
                                        obj2 = objValueOf;
                                        if (obj instanceof Number) {
                                            avjuVar2.s(this.a(), obj);
                                        } else if (obj instanceof Date) {
                                            DateFormat dateTimeInstance = this.i;
                                            if (dateTimeInstance == null) {
                                                dateTimeInstance = DateFormat.getDateTimeInstance(3, 3, this.a);
                                                this.i = dateTimeInstance;
                                            }
                                            avjuVar2.s(dateTimeInstance, obj);
                                        } else {
                                            avjuVar2.r(obj.toString());
                                        }
                                    } else {
                                        int i19 = i13;
                                        if (iB != 3) {
                                            int i20 = i18;
                                            if (!a.b(iB)) {
                                                str3 = str3;
                                                i3 = i20;
                                                obj2 = objValueOf;
                                                int iC3 = i17;
                                                if (iB != 5) {
                                                    throw new IllegalStateException("unexpected argType ".concat(a.a(iB)));
                                                }
                                                aa aaVar2 = this.b;
                                                String string = obj.toString();
                                                int iB2 = aaVar2.b();
                                                int i21 = 0;
                                                while (true) {
                                                    int i22 = iC3 + 1;
                                                    z zVarD3 = aaVar2.d(iC3);
                                                    if (zVarD3.e != 7) {
                                                        if (aaVar2.g(zVarD3, string)) {
                                                            i4 = i22;
                                                            break;
                                                        }
                                                        if (i21 == 0) {
                                                            i21 = aaVar2.g(zVarD3, "other") ? i22 : 0;
                                                        }
                                                        iC3 = aaVar2.c(i22) + 1;
                                                        if (iC3 >= iB2) {
                                                        }
                                                    }
                                                    i4 = i21;
                                                    break;
                                                }
                                                avjuVar2 = avjuVar;
                                                this.g(i4, null, objArr, map, objArr2, avjuVar2);
                                            } else {
                                                if (!(obj instanceof Number)) {
                                                    throw new IllegalArgumentException("'" + obj.toString() + "' is not a Number");
                                                }
                                                if (iB == 4) {
                                                    kVar = this.k;
                                                    if (kVar == null) {
                                                        kVar = new k(this, 1);
                                                        this.k = kVar;
                                                    }
                                                } else {
                                                    kVar = this.l;
                                                    if (kVar == null) {
                                                        kVar = new k(this, 2);
                                                        this.l = kVar;
                                                    }
                                                }
                                                Number number = (Number) obj;
                                                aa aaVar3 = this.b;
                                                z zVar = (z) aaVar3.b.get(i17);
                                                j jVar2 = new j(i17, strF, number, f.a(zVar.e) ? aaVar3.a(zVar) : 0.0d);
                                                int i23 = i17;
                                                aa aaVar4 = this.b;
                                                double dDoubleValue = number.doubleValue();
                                                int iB3 = aaVar4.b();
                                                z zVarD4 = aaVar4.d(i23);
                                                if (f.a(zVarD4.e)) {
                                                    i23 = i19 + 3;
                                                    dA = aaVar4.a(zVarD4);
                                                } else {
                                                    dA = 0.0d;
                                                }
                                                String str4 = null;
                                                boolean z3 = false;
                                                int i24 = 0;
                                                while (true) {
                                                    int i25 = i23 + 1;
                                                    double d2 = dDoubleValue;
                                                    z zVarD5 = aaVar4.d(i23);
                                                    int i26 = i23;
                                                    if (zVarD5.e != 7) {
                                                        if (f.a(aaVar4.h(i25))) {
                                                            int i27 = i26 + 2;
                                                            if (d2 == aaVar4.a(aaVar4.d(i25))) {
                                                                i5 = i27;
                                                                str3 = str3;
                                                                i3 = i20;
                                                                obj2 = objValueOf;
                                                                break;
                                                            }
                                                            i25 = i27;
                                                        } else {
                                                            if (z3) {
                                                                i25 = i25;
                                                                str3 = str3;
                                                                i3 = i20;
                                                                z = z3;
                                                                str = str4;
                                                                obj2 = objValueOf;
                                                                i25 = i25;
                                                                z3 = z;
                                                            } else {
                                                                if (aaVar4.g(zVarD5, "other")) {
                                                                    if (i24 == 0) {
                                                                        if (str4 == null || !str4.equals("other")) {
                                                                            i24 = i25;
                                                                        } else {
                                                                            i24 = i25;
                                                                            str3 = str3;
                                                                            i3 = i20;
                                                                            str = str4;
                                                                            obj2 = objValueOf;
                                                                        }
                                                                    }
                                                                    i25 = i25;
                                                                    str3 = str3;
                                                                    i3 = i20;
                                                                    z = z3;
                                                                    str = str4;
                                                                    obj2 = objValueOf;
                                                                    i25 = i25;
                                                                    z3 = z;
                                                                } else {
                                                                    if (str4 == null) {
                                                                        double d3 = d2 - dA;
                                                                        if (kVar.b == null) {
                                                                            Locale locale = kVar.a.a;
                                                                            int i28 = kVar.c;
                                                                            x xVar = x.a;
                                                                            y yVar = y.a;
                                                                            yVar.b();
                                                                            String str5 = (String) (i28 == 1 ? yVar.b : yVar.c).get(locale.getLanguage());
                                                                            if (str5 == null || str5.trim().length() == 0 || (xVarA = yVar.a(str5)) == null) {
                                                                                xVarA = x.a;
                                                                            }
                                                                            kVar.b = xVarA;
                                                                        }
                                                                        l lVar = kVar.a;
                                                                        int iC4 = jVar2.a;
                                                                        int iB4 = lVar.b.b();
                                                                        str3 = str3;
                                                                        if (f.a(lVar.b.d(iC4).e)) {
                                                                            iC4++;
                                                                        }
                                                                        while (true) {
                                                                            i3 = i20;
                                                                            i6 = iC4 + 1;
                                                                            z zVarD6 = lVar.b.d(iC4);
                                                                            int i29 = iC4;
                                                                            z = z3;
                                                                            if (zVarD6.e == 7) {
                                                                                i6 = 0;
                                                                            } else if (!lVar.b.g(zVarD6, "other")) {
                                                                                if (f.a(lVar.b.h(i6))) {
                                                                                    i6 = i29 + 2;
                                                                                }
                                                                                iC4 = lVar.b.c(i6) + 1;
                                                                                if (iC4 >= iB4) {
                                                                                    i6 = 0;
                                                                                    break;
                                                                                } else {
                                                                                    i20 = i3;
                                                                                    z3 = z;
                                                                                }
                                                                            }
                                                                            break;
                                                                        }
                                                                        String str6 = jVar2.b;
                                                                        int iC5 = i6 + 1;
                                                                        while (true) {
                                                                            z zVarD7 = lVar.b.d(iC5);
                                                                            int i30 = zVarD7.e;
                                                                            if (i30 == 2) {
                                                                                iC5 = 0;
                                                                            } else if (i30 == 5) {
                                                                                iC5 = -1;
                                                                            } else {
                                                                                i7 = 6;
                                                                                if (i30 == 6) {
                                                                                    int iB5 = zVarD7.b();
                                                                                    if (str6.length() != 0 && ((iB5 == 1 || iB5 == 2) && lVar.b.g(lVar.b.d(iC5 + 1), str6))) {
                                                                                        break;
                                                                                    } else {
                                                                                        iC5 = lVar.b.c(iC5);
                                                                                    }
                                                                                }
                                                                                iC5++;
                                                                                objValueOf = objValueOf;
                                                                            }
                                                                            i7 = 6;
                                                                            break;
                                                                        }
                                                                        jVar2.e = iC5;
                                                                        if (iC5 > 0 && (map3 = lVar.c) != null) {
                                                                            jVar2.f = (Format) map3.get(Integer.valueOf(iC5));
                                                                        }
                                                                        if (jVar2.f == null) {
                                                                            jVar2.f = lVar.a();
                                                                            jVar2.h = true;
                                                                        }
                                                                        jVar2.g = jVar2.f.format(jVar2.c);
                                                                        w wVar = kVar.b.h;
                                                                        if (Double.isInfinite(d3) || Double.isNaN(d3)) {
                                                                            obj2 = objValueOf;
                                                                            i8 = 0;
                                                                        } else {
                                                                            double d4 = d3 < 0.0d ? -d3 : d3;
                                                                            if (d4 < 1.0E9d) {
                                                                                long j = (long) (d4 * 1000000.0d);
                                                                                int i31 = 10;
                                                                                i9 = i7;
                                                                                while (true) {
                                                                                    if (i9 > 0) {
                                                                                        obj2 = objValueOf;
                                                                                        if ((j % 1000000) % ((long) i31) == 0) {
                                                                                            i31 *= 10;
                                                                                            i9--;
                                                                                            objValueOf = obj2;
                                                                                        }
                                                                                    } else {
                                                                                        obj2 = objValueOf;
                                                                                        i8 = 0;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                obj2 = objValueOf;
                                                                                String str7 = String.format(Locale.ENGLISH, "%1.15e", Double.valueOf(d4));
                                                                                int iLastIndexOf = str7.lastIndexOf(101);
                                                                                int i32 = iLastIndexOf + 1;
                                                                                if (str7.charAt(i32) == '+') {
                                                                                    i32 = iLastIndexOf + 2;
                                                                                }
                                                                                int i33 = (iLastIndexOf - 2) - Integer.parseInt(str7.substring(i32));
                                                                                if (i33 >= 0) {
                                                                                    i9 = i33;
                                                                                    for (int i34 = iLastIndexOf - 1; i9 > 0 && str7.charAt(i34) == '0'; i34--) {
                                                                                        i9--;
                                                                                    }
                                                                                } else {
                                                                                    i8 = 0;
                                                                                }
                                                                            }
                                                                            i8 = i9;
                                                                        }
                                                                        q qVar = new q(d3, i8);
                                                                        double d5 = qVar.a;
                                                                        if (Double.isInfinite(d5) || Double.isNaN(d5)) {
                                                                            str2 = "other";
                                                                        } else {
                                                                            Iterator it = wVar.b.iterator();
                                                                            do {
                                                                                if (!it.hasNext()) {
                                                                                    vVar = null;
                                                                                    break;
                                                                                }
                                                                                vVar = (v) it.next();
                                                                            } while (!vVar.b.a(qVar));
                                                                            str2 = vVar.a;
                                                                        }
                                                                        if (i24 != 0 && str2.equals("other")) {
                                                                            z = true;
                                                                        }
                                                                    } else {
                                                                        i25 = i25;
                                                                        str3 = str3;
                                                                        i3 = i20;
                                                                        z = z3;
                                                                        obj2 = objValueOf;
                                                                        str2 = str4;
                                                                    }
                                                                    if (z || !aaVar4.g(zVarD5, str2)) {
                                                                        str = str2;
                                                                        i25 = i25;
                                                                        z3 = z;
                                                                    } else {
                                                                        str = str2;
                                                                        i25 = i25;
                                                                        i24 = i25;
                                                                    }
                                                                }
                                                                z3 = true;
                                                            }
                                                            iC = aaVar4.c(i25) + 1;
                                                            if (iC < iB3) {
                                                                objValueOf = obj2;
                                                                str4 = str;
                                                                dDoubleValue = d2;
                                                                str3 = str3;
                                                                i20 = i3;
                                                                i23 = iC;
                                                            }
                                                        }
                                                        str3 = str3;
                                                        i3 = i20;
                                                        str = str4;
                                                        obj2 = objValueOf;
                                                        iC = aaVar4.c(i25) + 1;
                                                        if (iC < iB3) {
                                                            objValueOf = obj2;
                                                            str4 = str;
                                                            dDoubleValue = d2;
                                                            str3 = str3;
                                                            i20 = i3;
                                                            i23 = iC;
                                                        }
                                                    } else {
                                                        str3 = str3;
                                                        i3 = i20;
                                                        obj2 = objValueOf;
                                                    }
                                                    i5 = i24;
                                                    break;
                                                }
                                                g(i5, jVar2, objArr, map, objArr2, avjuVar);
                                                avjuVar2 = avjuVar;
                                            }
                                            i2 = i3;
                                        } else {
                                            if (!(obj instanceof Number)) {
                                                throw new IllegalArgumentException("'" + obj.toString() + "' is not a Number");
                                            }
                                            double dDoubleValue2 = ((Number) obj).doubleValue();
                                            aa aaVar5 = this.b;
                                            int iB6 = aaVar5.b();
                                            int i35 = i19 + 4;
                                            while (true) {
                                                int iC6 = aaVar5.c(i35);
                                                int i36 = iC6 + 1;
                                                if (i36 >= iB6) {
                                                    i10 = i18;
                                                    break;
                                                }
                                                int i37 = iC6 + 2;
                                                z zVarD8 = aaVar5.d(i36);
                                                i10 = i18;
                                                if (zVarD8.e == 7) {
                                                    break;
                                                }
                                                double dA2 = aaVar5.a(zVarD8);
                                                int i38 = iC6 + 3;
                                                if (aaVar5.a.charAt(((z) aaVar5.b.get(i37)).a) != '<') {
                                                    if (dDoubleValue2 < dA2) {
                                                        break;
                                                    }
                                                    i35 = i38;
                                                    i18 = i10;
                                                } else {
                                                    if (dDoubleValue2 <= dA2) {
                                                        break;
                                                    }
                                                    i35 = i38;
                                                    i18 = i10;
                                                }
                                                obj2 = objValueOf;
                                            }
                                            this = this;
                                            this.g(i35, null, objArr, map, objArr2, avjuVar2);
                                            avjuVar2 = avjuVar;
                                            i2 = i10;
                                            obj2 = objValueOf;
                                        }
                                    }
                                } else {
                                    fieldPosition2 = fieldPosition3;
                                    if (jVar.d == 0.0d) {
                                        avjuVar2.t(jVar.f, jVar.c, jVar.g);
                                    } else {
                                        avjuVar2.s(jVar.f, obj);
                                    }
                                }
                                i2 = i18;
                                obj2 = objValueOf;
                            }
                            r2 = avjuVar2.c;
                            if (r2 != 0 && i2 < (i12 = avjuVar2.b)) {
                                r2.add(new asd(obj2, i2, i12));
                            }
                            if (fieldPosition2 == null && i.a.equals(fieldPosition2.getFieldAttribute())) {
                                FieldPosition fieldPosition4 = fieldPosition2;
                                fieldPosition4.setBeginIndex(i2);
                                fieldPosition4.setEndIndex(avjuVar2.b);
                                fieldPosition3 = null;
                            } else {
                                fieldPosition3 = fieldPosition2;
                            }
                            iA = this.b.d(iC2).a();
                            i11 = iC2;
                        }
                        i2 = i18;
                        fieldPosition2 = fieldPosition3;
                        obj2 = objValueOf;
                        r2 = avjuVar2.c;
                        if (r2 != 0) {
                            r2.add(new asd(obj2, i2, i12));
                        }
                        if (fieldPosition2 == null) {
                            fieldPosition3 = fieldPosition2;
                        } else {
                            fieldPosition3 = fieldPosition2;
                        }
                        iA = this.b.d(iC2).a();
                        i11 = iC2;
                    }
                    i13 = i11 + 1;
                    z2 = true;
                    str3 = str3;
                } else if (jVar.h) {
                    avjuVar2.t(jVar.f, jVar.c, jVar.g);
                } else {
                    avjuVar2.s(this.a(), jVar.c);
                }
                str3 = str3;
                fieldPosition3 = fieldPosition3;
                iA = iA2;
                i11 = i13;
                i13 = i11 + 1;
                z2 = true;
                str3 = str3;
            } catch (IOException e2) {
                throw new ad(e2);
            }
        }
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        e(obj, new avju(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        avju avjuVar = new avju(sb);
        avjuVar.c = new ArrayList();
        e(obj, avjuVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (asd asdVar : avjuVar.c) {
            attributedString.addAttribute((AttributedCharacterIterator.Attribute) asdVar.c, asdVar.d, asdVar.a, asdVar.b);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        Map map;
        Object[] objArr;
        if (this.b.d) {
            map = new HashMap();
            int index = parsePosition.getIndex();
            d(str, parsePosition, null, map);
            if (parsePosition.getIndex() == index) {
                objArr = map;
                return null;
            }
        } else {
            int iC = 0;
            short s = -1;
            while (true) {
                if (iC != 0) {
                    iC = this.b.c(iC);
                }
                while (true) {
                    iC++;
                    int iH = this.b.h(iC);
                    if (iH == 6) {
                        break;
                    }
                    if (iH == 2) {
                        iC = -1;
                        break;
                    }
                }
                if (iC < 0) {
                    break;
                }
                short s2 = this.b.d(iC + 1).c;
                if (s2 > s) {
                    s = s2;
                }
            }
            Object[] objArr2 = new Object[s + 1];
            int index2 = parsePosition.getIndex();
            d(str, parsePosition, objArr2, null);
            objArr = objArr2;
            if (parsePosition.getIndex() == index2) {
                return null;
            }
        }
        objArr = map;
        return objArr;
    }
}
