package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ss {
    public static final /* synthetic */ int b = 0;
    public final uz a;

    static {
        new sr("", "", "").d();
    }

    public ss(uz uzVar) {
        uzVar.getClass();
        this.a = uzVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    private static Object q(tb tbVar, int i, Map map) {
        uz[] uzVarArr;
        while (i < tbVar.a()) {
            ta taVarB = tbVar.b(i);
            Object objCopyOfRange = map.get(taVarB.a);
            if (objCopyOfRange == null) {
                return null;
            }
            int i2 = taVarB.b;
            if (i2 != -1) {
                vi viVar = (vi) objCopyOfRange;
                String[] strArr = viVar.b;
                if (strArr == null) {
                    long[] jArr = viVar.c;
                    if (jArr == null) {
                        double[] dArr = viVar.d;
                        if (dArr == null) {
                            boolean[] zArr = viVar.e;
                            if (zArr == null) {
                                byte[][] bArr = viVar.f;
                                if (bArr == null) {
                                    Object[] objArr = viVar.g;
                                    if (objArr == null) {
                                        sp[] spVarArr = viVar.h;
                                        if (spVarArr == null) {
                                            rw[] rwVarArr = viVar.i;
                                            if (rwVarArr == null) {
                                                Objects.toString(objCopyOfRange);
                                                throw new IllegalStateException("Unsupported value type: ".concat(objCopyOfRange.toString()));
                                            }
                                            if (i2 < rwVarArr.length) {
                                                objCopyOfRange = Arrays.copyOfRange(rwVarArr, i2, i2 + 1);
                                            } else {
                                                objCopyOfRange = null;
                                            }
                                        } else if (i2 < spVarArr.length) {
                                            objCopyOfRange = Arrays.copyOfRange(spVarArr, i2, i2 + 1);
                                        } else {
                                            objCopyOfRange = null;
                                        }
                                    } else if (i2 < objArr.length) {
                                        objCopyOfRange = objArr[i2];
                                    } else {
                                        objCopyOfRange = null;
                                    }
                                } else if (i2 < bArr.length) {
                                    objCopyOfRange = Arrays.copyOfRange(bArr, i2, i2 + 1);
                                } else {
                                    objCopyOfRange = null;
                                }
                            } else if (i2 < zArr.length) {
                                objCopyOfRange = Arrays.copyOfRange(zArr, i2, i2 + 1);
                            } else {
                                objCopyOfRange = null;
                            }
                        } else if (i2 < dArr.length) {
                            objCopyOfRange = Arrays.copyOfRange(dArr, i2, i2 + 1);
                        } else {
                            objCopyOfRange = null;
                        }
                    } else if (i2 < jArr.length) {
                        objCopyOfRange = Arrays.copyOfRange(jArr, i2, i2 + 1);
                    } else {
                        objCopyOfRange = null;
                    }
                } else if (i2 < strArr.length) {
                    objCopyOfRange = Arrays.copyOfRange(strArr, i2, i2 + 1);
                } else {
                    objCopyOfRange = null;
                }
            }
            if (objCopyOfRange != null) {
                if (i == tbVar.a() - 1) {
                    if (objCopyOfRange instanceof vi) {
                        return ((vi) objCopyOfRange).a();
                    }
                } else if (objCopyOfRange instanceof uz) {
                    i++;
                    map = ((uz) objCopyOfRange).i;
                } else {
                    if (!(objCopyOfRange instanceof vi) || (uzVarArr = ((vi) objCopyOfRange).g) == null) {
                        Objects.toString(tbVar);
                        Log.e("AppSearchGenericDocumen", "Failed to apply path to document; no nested value found: ".concat(tbVar.toString()));
                        return null;
                    }
                    int length = uzVarArr.length;
                    if (length != 1) {
                        ArrayList arrayList = new ArrayList(length);
                        for (uz uzVar : uzVarArr) {
                            Object objQ = q(tbVar, i + 1, uzVar.i);
                            if (objQ != null) {
                                arrayList.add(objQ);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        Object obj = arrayList.get(0);
                        if (obj instanceof String[]) {
                            int length2 = 0;
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                length2 += ((String[]) arrayList.get(i3)).length;
                            }
                            String[] strArr2 = new String[length2];
                            int i4 = 0;
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                String[] strArr3 = (String[]) arrayList.get(i5);
                                int length3 = strArr3.length;
                                System.arraycopy(strArr3, 0, strArr2, i4, length3);
                                i4 += length3;
                            }
                            return strArr2;
                        }
                        if (obj instanceof long[]) {
                            int length4 = 0;
                            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                length4 += ((long[]) arrayList.get(i6)).length;
                            }
                            long[] jArr2 = new long[length4];
                            int i7 = 0;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                long[] jArr3 = (long[]) arrayList.get(i8);
                                int length5 = jArr3.length;
                                System.arraycopy(jArr3, 0, jArr2, i7, length5);
                                i7 += length5;
                            }
                            return jArr2;
                        }
                        if (obj instanceof double[]) {
                            int length6 = 0;
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                length6 += ((double[]) arrayList.get(i9)).length;
                            }
                            double[] dArr2 = new double[length6];
                            int i10 = 0;
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                double[] dArr3 = (double[]) arrayList.get(i11);
                                int length7 = dArr3.length;
                                System.arraycopy(dArr3, 0, dArr2, i10, length7);
                                i10 += length7;
                            }
                            return dArr2;
                        }
                        if (obj instanceof boolean[]) {
                            int length8 = 0;
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                length8 += ((boolean[]) arrayList.get(i12)).length;
                            }
                            boolean[] zArr2 = new boolean[length8];
                            int i13 = 0;
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                boolean[] zArr3 = (boolean[]) arrayList.get(i14);
                                int length9 = zArr3.length;
                                System.arraycopy(zArr3, 0, zArr2, i13, length9);
                                i13 += length9;
                            }
                            return zArr2;
                        }
                        if (obj instanceof byte[][]) {
                            int length10 = 0;
                            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                length10 += ((byte[][]) arrayList.get(i15)).length;
                            }
                            byte[][] bArr2 = new byte[length10][];
                            int i16 = 0;
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                byte[][] bArr3 = (byte[][]) arrayList.get(i17);
                                int length11 = bArr3.length;
                                System.arraycopy(bArr3, 0, bArr2, i16, length11);
                                i16 += length11;
                            }
                            return bArr2;
                        }
                        if (!(obj instanceof uz[])) {
                            Objects.toString(obj);
                            throw new IllegalStateException("Unexpected property type: ".concat(String.valueOf(obj)));
                        }
                        int length12 = 0;
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            length12 += ((uz[]) arrayList.get(i18)).length;
                        }
                        uz[] uzVarArr2 = new uz[length12];
                        int i19 = 0;
                        for (int i20 = 0; i20 < arrayList.size(); i20++) {
                            uz[] uzVarArr3 = (uz[]) arrayList.get(i20);
                            int length13 = uzVarArr3.length;
                            System.arraycopy(uzVarArr3, 0, uzVarArr2, i19, length13);
                            i19 += length13;
                        }
                        return uzVarArr2;
                    }
                    i++;
                    map = uzVarArr[0].i;
                }
            }
            return objCopyOfRange;
        }
        return null;
    }

    private static Object r(String str, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AppSearchGenericDocumen", a.bU((byte) 34, str, "Error casting to requested type for path \""), e);
            return null;
        }
    }

    private static void s(String str, String str2, int i) {
        if (i > 1) {
            Log.w("AppSearchGenericDocumen", "The value for \"" + str2 + "\" contains " + i + " elements. Only the first one will be returned from getProperty" + str + "(). Try getProperty" + str + "Array().");
        }
    }

    public final int a() {
        return this.a.f;
    }

    public final long b() {
        return this.a.d;
    }

    public final long c() {
        return this.a.e;
    }

    public final Object d(String str) {
        Object objQ;
        str.getClass();
        Map map = this.a.i;
        if (str.isEmpty()) {
            objQ = q(new tb(str), 0, map);
            break;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                vi viVar = (vi) map.get(str);
                if (viVar == null) {
                    objQ = null;
                    break;
                }
                objQ = viVar.a();
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '[' || cCharAt == ']') {
                objQ = q(new tb(str), 0, map);
                break;
            }
            i++;
        }
        if (objQ instanceof uz) {
            return new ss[]{new ss((uz) objQ)};
        }
        if (!(objQ instanceof uz[])) {
            return objQ;
        }
        uz[] uzVarArr = (uz[]) objQ;
        ss[] ssVarArr = new ss[uzVarArr.length];
        for (int i2 = 0; i2 < uzVarArr.length; i2++) {
            uz uzVar = uzVarArr[i2];
            if (uzVar == null) {
                Log.e("AppSearchGenericDocumen", "The inner parcel is null at " + i2 + ", for path: " + str);
            } else {
                ssVarArr[i2] = new ss(uzVar);
            }
        }
        return ssVarArr;
    }

    public final String e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ss) {
            return this.a.equals(((ss) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.a.a;
    }

    public final String g(String str) {
        int length;
        String[] strArrN = n(str);
        if (strArrN == null || (length = strArrN.length) == 0) {
            return null;
        }
        s("String", str, length);
        return strArrN[0];
    }

    public final String h() {
        return this.a.c;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Set i() {
        return DesugarCollections.unmodifiableSet(this.a.i.keySet());
    }

    final void j(vn vnVar) {
        vnVar.a("{\n");
        vnVar.d();
        vnVar.a("namespace: \"");
        vnVar.a(f());
        vnVar.a("\",\n");
        vnVar.a("id: \"");
        vnVar.a(e());
        vnVar.a("\",\n");
        vnVar.a("score: ");
        vnVar.b(Integer.valueOf(a()));
        vnVar.a(",\n");
        vnVar.a("schemaType: \"");
        vnVar.a(h());
        vnVar.a("\",\n");
        List list = this.a.h;
        List listUnmodifiableList = list == null ? null : DesugarCollections.unmodifiableList(list);
        if (listUnmodifiableList != null) {
            vnVar.a("parentTypes: ");
            vnVar.b(listUnmodifiableList);
            vnVar.a("\n");
        }
        vnVar.a("creationTimestampMillis: ");
        vnVar.b(Long.valueOf(b()));
        vnVar.a(",\n");
        vnVar.a("timeToLiveMillis: ");
        vnVar.b(Long.valueOf(c()));
        vnVar.a(",\n");
        vnVar.a("properties: {\n");
        String[] strArr = (String[]) i().toArray(new String[0]);
        Arrays.sort(strArr);
        for (int i = 0; i < strArr.length; i++) {
            Object objD = d(strArr[i]);
            azs.l(objD);
            vnVar.d();
            String str = strArr[i];
            azs.l(str);
            vnVar.a("\"");
            vnVar.a(str);
            vnVar.a("\": [");
            if (objD instanceof ss[]) {
                ss[] ssVarArr = (ss[]) objD;
                int i2 = 0;
                while (true) {
                    int length = ssVarArr.length;
                    if (i2 >= length) {
                        break;
                    }
                    vnVar.a("\n");
                    vnVar.d();
                    ssVarArr[i2].j(vnVar);
                    if (i2 != length - 1) {
                        vnVar.a(",");
                    }
                    vnVar.a("\n");
                    vnVar.c();
                    i2++;
                }
            } else {
                int length2 = Array.getLength(objD);
                for (int i3 = 0; i3 < length2; i3++) {
                    Object obj = Array.get(objD, i3);
                    if (obj instanceof String) {
                        vnVar.a("\"");
                        vnVar.a((String) obj);
                        vnVar.a("\"");
                    } else if (obj instanceof byte[]) {
                        vnVar.a(Arrays.toString((byte[]) obj));
                    } else if (obj != null) {
                        vnVar.a(obj.toString());
                    }
                    if (i3 != length2 - 1) {
                        vnVar.a(", ");
                    }
                }
            }
            vnVar.a("]");
            if (i != strArr.length - 1) {
                vnVar.a(",\n");
            }
            vnVar.c();
        }
        vnVar.a("\n");
        vnVar.a("}");
        vnVar.c();
        vnVar.a("\n");
        vnVar.a("}");
    }

    public final byte[] k(String str) {
        int length;
        byte[][] bArrO = o(str);
        if (bArrO == null || (length = bArrO.length) == 0) {
            return null;
        }
        s("ByteArray", str, length);
        return bArrO[0];
    }

    public final long[] l(String str) {
        return (long[]) r(str, d(str), long[].class);
    }

    public final ss[] m(String str) {
        azs.l(str);
        return (ss[]) r(str, d(str), ss[].class);
    }

    public final String[] n(String str) {
        return (String[]) r(str, d(str), String[].class);
    }

    public final byte[][] o(String str) {
        return (byte[][]) r(str, d(str), byte[][].class);
    }

    public final boolean p() {
        int length;
        boolean[] zArr = (boolean[]) r("notPlatformSurfaceable", d("notPlatformSurfaceable"), boolean[].class);
        if (zArr == null || (length = zArr.length) == 0) {
            return false;
        }
        s("Boolean", "notPlatformSurfaceable", length);
        return zArr[0];
    }

    public final String toString() {
        vn vnVar = new vn();
        j(vnVar);
        return vnVar.toString();
    }

    public ss(ss ssVar) {
        this(ssVar.a);
    }
}
