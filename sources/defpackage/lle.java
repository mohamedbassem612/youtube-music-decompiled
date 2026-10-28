package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lle extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(8);
    public static final byte[][] a;
    public static final lle b;
    public final String c;
    public final byte[] d;
    public final byte[][] e;
    public final byte[][] f;
    public final byte[][] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;
    public final int[] k;
    public final byte[][] l;

    static {
        byte[][] bArr = new byte[0][];
        a = bArr;
        b = new lle("", null, bArr, bArr, bArr, bArr, null, null, null, null);
    }

    public lle(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
        this.g = bArr4;
        this.h = bArr5;
        this.i = iArr;
        this.j = bArr6;
        this.k = iArr2;
        this.l = bArr7;
    }

    public static byte[][] a(List list, lld lldVar) {
        byte[][] bArrA;
        byte[][] bArrA2;
        Iterator it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            lle lleVar = (lle) it.next();
            if (lleVar != null && (bArrA2 = lldVar.a(lleVar)) != null) {
                length += bArrA2.length;
            }
        }
        if (length == 0) {
            return a;
        }
        byte[][] bArr = new byte[length][];
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            lle lleVar2 = (lle) it2.next();
            if (lleVar2 != null && (bArrA = lldVar.a(lleVar2)) != null) {
                for (byte[] bArr2 : bArrA) {
                    if (bArr2 != null) {
                        bArr[i] = bArr2;
                        i++;
                    }
                }
            }
        }
        return bArr;
    }

    private static List b(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new llj(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private final Set c() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.j;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.d;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return e((byte[][]) arrayList.toArray(new byte[0][]));
    }

    private static Set d(int[] iArr) {
        int length;
        if (iArr == null || (length = iArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetAg = ahng.ag(length);
        for (int i : iArr) {
            hashSetAg.add(Integer.valueOf(i));
        }
        return hashSetAg;
    }

    private static Set e(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetAg = ahng.ag(length);
        for (byte[] bArr2 : bArr) {
            kro.l(bArr2);
            hashSetAg.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetAg;
    }

    private static void f(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append('=');
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append('(');
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append('\'');
            kro.l(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append('\'');
            i++;
            z = false;
        }
        sb.append(')');
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lle)) {
            return false;
        }
        lle lleVar = (lle) obj;
        return a.ae(this.c, lleVar.c) && a.ae(c(), lleVar.c()) && a.ae(e(this.e), e(lleVar.e)) && a.ae(e(this.f), e(lleVar.f)) && a.ae(e(this.g), e(lleVar.g)) && a.ae(e(this.h), e(lleVar.h)) && a.ae(d(this.i), d(lleVar.i)) && a.ae(b(this.k), b(lleVar.k)) && a.ae(e(this.l), e(lleVar.l));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append('(');
        String str2 = this.c;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + '\'';
        }
        sb.append(str);
        byte[] bArr = this.d;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append('\'');
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append('\'');
        }
        sb.append(", ");
        f(sb, "GAIA=", this.e);
        sb.append(", ");
        f(sb, "PSEUDO=", this.f);
        sb.append(", ");
        f(sb, "ALWAYS=", this.g);
        sb.append(", ");
        f(sb, "OTHER=", this.h);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.i));
        sb.append(", ");
        f(sb, "directs=", this.j);
        sb.append(", genDims=");
        sb.append(Arrays.toString(b(this.k).toArray()));
        sb.append(", ");
        f(sb, "external=", this.l);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.c);
        ksy.q(parcel, 3, this.d);
        ksy.r(parcel, 4, this.e);
        ksy.r(parcel, 5, this.f);
        ksy.r(parcel, 6, this.g);
        ksy.r(parcel, 7, this.h);
        ksy.u(parcel, 8, this.i);
        ksy.r(parcel, 9, this.j);
        ksy.u(parcel, 10, this.k);
        ksy.r(parcel, 11, this.l);
        ksy.h(parcel, iG);
    }
}
