package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avgf {
    public static final Logger a = Logger.getLogger(avgf.class.getName());

    private avgf() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object a(ahwu ahwuVar) throws IOException {
        String strE;
        String string;
        String str;
        double d;
        ahno.P(ahwuVar.h(), "unexpected end of JSON");
        int i = ahwuVar.i() - 1;
        boolean z = true;
        if (i == 0) {
            int iA = ahwuVar.c;
            if (iA == 0) {
                iA = ahwuVar.a();
            }
            if (iA != 3) {
                throw ahwuVar.c("BEGIN_ARRAY");
            }
            ahwuVar.g(1);
            ahwuVar.i[ahwuVar.g - 1] = 0;
            ahwuVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (ahwuVar.h()) {
                arrayList.add(a(ahwuVar));
            }
            ahno.P(ahwuVar.i() == 2, "Bad token: ".concat(ahwuVar.j()));
            int iA2 = ahwuVar.c;
            if (iA2 == 0) {
                iA2 = ahwuVar.a();
            }
            if (iA2 != 4) {
                throw ahwuVar.c("END_ARRAY");
            }
            int i2 = ahwuVar.g;
            ahwuVar.g = i2 - 1;
            int[] iArr = ahwuVar.i;
            int i3 = i2 - 2;
            iArr[i3] = iArr[i3] + 1;
            ahwuVar.c = 0;
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (i == 2) {
            int iA3 = ahwuVar.c;
            if (iA3 == 0) {
                iA3 = ahwuVar.a();
            }
            if (iA3 != 1) {
                throw ahwuVar.c("BEGIN_OBJECT");
            }
            ahwuVar.g(3);
            ahwuVar.c = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (ahwuVar.h()) {
                int iA4 = ahwuVar.c;
                if (iA4 == 0) {
                    iA4 = ahwuVar.a();
                }
                switch (iA4) {
                    case 12:
                        strE = ahwuVar.e('\'');
                        break;
                    case 13:
                        strE = ahwuVar.e('\"');
                        break;
                    case 14:
                        strE = ahwuVar.f();
                        break;
                    default:
                        throw ahwuVar.c("a name");
                }
                ahwuVar.c = 0;
                ahwuVar.h[ahwuVar.g - 1] = strE;
                ahno.K(!linkedHashMap.containsKey(strE), "Duplicate key found: %s", strE);
                linkedHashMap.put(strE, a(ahwuVar));
            }
            ahno.P(ahwuVar.i() == 4, "Bad token: ".concat(ahwuVar.j()));
            int iA5 = ahwuVar.c;
            if (iA5 == 0) {
                iA5 = ahwuVar.a();
            }
            if (iA5 != 2) {
                throw ahwuVar.c("END_OBJECT");
            }
            int i4 = ahwuVar.g;
            int i5 = i4 - 1;
            ahwuVar.g = i5;
            ahwuVar.h[i5] = null;
            int[] iArr2 = ahwuVar.i;
            int i6 = i4 - 2;
            iArr2[i6] = iArr2[i6] + 1;
            ahwuVar.c = 0;
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (i == 5) {
            int iA6 = ahwuVar.c;
            if (iA6 == 0) {
                iA6 = ahwuVar.a();
            }
            if (iA6 != 15) {
                if (iA6 != 16) {
                    switch (iA6) {
                        case 8:
                            string = ahwuVar.e('\'');
                            break;
                        case 9:
                            string = ahwuVar.e('\"');
                            break;
                        case 10:
                            string = ahwuVar.f();
                            break;
                        case 11:
                            string = ahwuVar.f;
                            ahwuVar.f = null;
                            break;
                        default:
                            throw ahwuVar.c("a string");
                    }
                } else {
                    String str2 = new String(ahwuVar.a, ahwuVar.b, ahwuVar.e);
                    ahwuVar.b += ahwuVar.e;
                    str = str2;
                }
                ahwuVar.c = 0;
                int[] iArr3 = ahwuVar.i;
                int i7 = ahwuVar.g - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return str;
            }
            string = Long.toString(ahwuVar.d);
            str = string;
            ahwuVar.c = 0;
            int[] iArr4 = ahwuVar.i;
            int i8 = ahwuVar.g - 1;
            iArr4[i8] = iArr4[i8] + 1;
            return str;
        }
        if (i != 6) {
            if (i != 7) {
                if (i != 8) {
                    throw new IllegalStateException("Bad token: ".concat(ahwuVar.j()));
                }
                int iA7 = ahwuVar.c;
                if (iA7 == 0) {
                    iA7 = ahwuVar.a();
                }
                if (iA7 != 7) {
                    throw ahwuVar.c("null");
                }
                ahwuVar.c = 0;
                int[] iArr5 = ahwuVar.i;
                int i9 = ahwuVar.g - 1;
                iArr5[i9] = iArr5[i9] + 1;
                return null;
            }
            int iA8 = ahwuVar.c;
            if (iA8 == 0) {
                iA8 = ahwuVar.a();
            }
            if (iA8 == 5) {
                ahwuVar.c = 0;
                int[] iArr6 = ahwuVar.i;
                int i10 = ahwuVar.g - 1;
                iArr6[i10] = iArr6[i10] + 1;
            } else {
                if (iA8 != 6) {
                    throw ahwuVar.c("a boolean");
                }
                ahwuVar.c = 0;
                int[] iArr7 = ahwuVar.i;
                int i11 = ahwuVar.g - 1;
                iArr7[i11] = iArr7[i11] + 1;
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int iA9 = ahwuVar.c;
        if (iA9 == 0) {
            iA9 = ahwuVar.a();
        }
        if (iA9 != 15) {
            if (iA9 != 16) {
                switch (iA9) {
                    case 8:
                    case 9:
                        ahwuVar.f = ahwuVar.e(iA9 == 8 ? '\'' : '\"');
                        break;
                    case 10:
                        ahwuVar.f = ahwuVar.f();
                        break;
                    case 11:
                        break;
                    default:
                        throw ahwuVar.c("a double");
                }
            } else {
                char[] cArr = ahwuVar.a;
                int i12 = ahwuVar.b;
                int i13 = ahwuVar.e;
                ahwuVar.f = new String(cArr, i12, i13);
                ahwuVar.b = i12 + i13;
            }
            ahwuVar.c = 11;
            try {
                d = Double.parseDouble(ahwuVar.f);
                if (Double.isNaN(d) || Double.isInfinite(d)) {
                    throw ahwuVar.b("JSON forbids NaN and infinities: " + d);
                }
                ahwuVar.f = null;
                ahwuVar.c = 0;
                int[] iArr8 = ahwuVar.i;
                int i14 = ahwuVar.g - 1;
                iArr8[i14] = iArr8[i14] + 1;
            } catch (NumberFormatException e) {
                NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + ahwuVar.f + ahwuVar.d());
                numberFormatException.initCause(e);
                throw numberFormatException;
            }
        } else {
            ahwuVar.c = 0;
            int[] iArr9 = ahwuVar.i;
            int i15 = ahwuVar.g - 1;
            iArr9[i15] = iArr9[i15] + 1;
            d = ahwuVar.d;
        }
        return Double.valueOf(d);
    }
}
