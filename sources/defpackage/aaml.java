package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaml {
    public static volatile boolean a;
    public static final int[] b = {0, 1, 2, 3, 4};
    public final wgs c;
    public final boolean d;
    public final long e;
    public final int f;
    public final long g;
    public final byte[] h;
    public final byte[] i;
    public final atxq j;
    public final String k;
    public final int l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final Uri p;
    public final int q;

    public aaml(wgs wgsVar, boolean z, long j, int i, long j2, int i2, byte[] bArr, byte[] bArr2, atxq atxqVar, String str, int i3, String str2, boolean z2, boolean z3, Uri uri) {
        this.c = wgsVar;
        this.d = z;
        this.e = j;
        this.f = i;
        this.g = j2;
        this.q = i2;
        this.h = bArr;
        this.i = bArr2;
        this.j = atxqVar;
        this.k = str;
        this.l = i3;
        this.m = str2;
        this.n = z2;
        this.o = z3;
        this.p = uri;
    }

    public static aamk e() {
        aamk aamkVar = new aamk();
        aamkVar.h(0);
        aamkVar.i(0L);
        aamkVar.j(1);
        aamkVar.f(0);
        aamkVar.g(false);
        aamkVar.d(false);
        return aamkVar;
    }

    public final int a() {
        return this.c.e();
    }

    public final long b() {
        return this.c.j();
    }

    public final aamc c(List list, boolean z) {
        String str;
        if (this.e <= 0) {
            return null;
        }
        String strF = f(z);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aamc aamcVar = (aamc) it.next();
            if (aamcVar != null && ((str = this.m) == null || str.equals(aamcVar.a))) {
                if (a) {
                    if (aamcVar.o(strF, 0L, b())) {
                        return aamcVar;
                    }
                } else if (aamcVar.h().contains(strF) && aamcVar.o(strF, 0L, b())) {
                    return aamcVar;
                }
            }
        }
        return null;
    }

    public final aamk d() {
        aamk aamkVarE = e();
        aamkVarE.e(this.c);
        aamkVarE.b(this.d);
        aamkVarE.c(this.e);
        aamkVarE.h(this.f);
        aamkVarE.i(this.g);
        aamkVarE.j(this.q);
        aamkVarE.a = this.h;
        aamkVarE.b = this.i;
        aamkVarE.c = this.j;
        aamkVarE.d = this.k;
        aamkVarE.f(this.l);
        aamkVarE.e = this.m;
        aamkVarE.g(this.n);
        aamkVarE.f = this.p;
        aamkVarE.d(this.o);
        return aamkVarE;
    }

    public final boolean equals(Object obj) {
        atxq atxqVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaml) {
            aaml aamlVar = (aaml) obj;
            if (this.c.equals(aamlVar.c) && this.d == aamlVar.d && this.e == aamlVar.e && this.f == aamlVar.f && this.g == aamlVar.g) {
                int i = this.q;
                int i2 = aamlVar.q;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    boolean z = aamlVar instanceof aaml;
                    if (Arrays.equals(this.h, z ? aamlVar.h : aamlVar.h)) {
                        if (Arrays.equals(this.i, z ? aamlVar.i : aamlVar.i) && ((atxqVar = this.j) != null ? atxqVar.equals(aamlVar.j) : aamlVar.j == null) && ((str = this.k) != null ? str.equals(aamlVar.k) : aamlVar.k == null) && this.l == aamlVar.l && ((str2 = this.m) != null ? str2.equals(aamlVar.m) : aamlVar.m == null) && this.n == aamlVar.n && this.o == aamlVar.o) {
                            Uri uri = this.p;
                            if (uri == null) {
                                if (aamlVar.p == null) {
                                    return true;
                                }
                            } else if (uri.equals(aamlVar.p)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String f(boolean z) {
        return zik.bv(g(), a(), h(), this.c.k(), z);
    }

    public final String g() {
        return ahno.Z(this.c.c);
    }

    public final String h() {
        return this.c.C();
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() ^ 1000003;
        int i = this.q;
        a.by(i);
        boolean z = this.d;
        int iHashCode2 = Arrays.hashCode(this.h);
        int i2 = true != z ? 1237 : 1231;
        int i3 = this.f;
        long j = this.e;
        int i4 = ((((((iHashCode * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ i3) * 1000003;
        long j2 = this.g;
        int iHashCode3 = ((((((i4 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ i) * 1000003) ^ iHashCode2) * 1000003) ^ Arrays.hashCode(this.i);
        atxq atxqVar = this.j;
        int iHashCode4 = ((iHashCode3 * 1000003) ^ (atxqVar == null ? 0 : atxqVar.hashCode())) * 1000003;
        String str = this.k;
        int iHashCode5 = (((iHashCode4 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.l) * 1000003;
        String str2 = this.m;
        int iHashCode6 = (((((iHashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ (true == this.o ? 1231 : 1237)) * 1000003;
        Uri uri = this.p;
        return iHashCode6 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final boolean i() {
        return this.e == b();
    }

    public final boolean j(List list, boolean z) {
        return c(list, z) != null;
    }

    public final String toString() {
        int i = this.q;
        String strValueOf = String.valueOf(this.c);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        byte[] bArr = this.h;
        byte[] bArr2 = this.i;
        atxq atxqVar = this.j;
        Uri uri = this.p;
        return "OfflineStream{formatStream=" + strValueOf + ", audioOnly=" + this.d + ", bytesTransferred=" + this.e + ", streamStatus=" + this.f + ", streamStatusTimestamp=" + this.g + ", offlineStorageFormat=" + string + ", wrappedKey=" + Arrays.toString(bArr) + ", discoKeyIv=" + Arrays.toString(bArr2) + ", discoKey=" + String.valueOf(atxqVar) + ", discoNonce=" + this.k + ", streamEncryptionKeyType=" + this.l + ", storageId=" + this.m + ", streamExpired=" + this.n + ", entityBased=" + this.o + ", ytbUri=" + String.valueOf(uri) + '}';
    }

    public aaml() {
        throw null;
    }
}
