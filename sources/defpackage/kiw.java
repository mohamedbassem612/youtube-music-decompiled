package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiw extends kry {
    public static final Parcelable.Creator CREATOR = new kix();
    private static final String[] p = new String[0];
    public final kjw a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final lle[] g;
    public final boolean h;
    public kjv i;
    public final int j;
    public final kjp k;
    public kjg l;
    public final byte[] m;
    public final Long n;
    public final aulj o;
    private final String[] q;

    public kiw(kjw kjwVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, lle[] lleVarArr, kjv kjvVar, String[] strArr2, int i, kjp kjpVar, kjg kjgVar, byte[] bArr3, Long l) {
        this.a = kjwVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = lleVarArr;
        this.i = kjvVar;
        this.q = strArr2;
        this.j = i;
        this.o = null;
        this.k = kjpVar;
        this.l = kjgVar;
        this.m = bArr3;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kiw) {
            kiw kiwVar = (kiw) obj;
            if (Objects.equals(this.a, kiwVar.a) && Arrays.equals(this.b, kiwVar.b) && Arrays.equals(this.c, kiwVar.c) && Arrays.equals(this.d, kiwVar.d) && Objects.equals(this.o, kiwVar.o) && Arrays.equals(this.e, kiwVar.e) && Arrays.deepEquals(this.f, kiwVar.f) && Arrays.equals(this.g, kiwVar.g) && Arrays.equals(this.q, kiwVar.q) && this.h == kiwVar.h && Objects.equals(this.i, kiwVar.i) && this.j == kiwVar.j && Objects.equals(this.k, kiwVar.k) && Objects.equals(this.l, kiwVar.l) && Arrays.equals(this.m, kiwVar.m) && Objects.equals(this.n, kiwVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), this.o, Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.deepHashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Boolean.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.q)), this.i, Integer.valueOf(this.j), this.k, this.l, Integer.valueOf(Arrays.hashCode(this.m)), this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.o);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.q));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        kjv kjvVar = this.i;
        sb.append(kjvVar != null ? kjvVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(Arrays.toString(this.m));
        sb.append(", ");
        sb.append(this.n);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kjw kjwVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 2, kjwVar, i);
        ksy.q(parcel, 3, this.b);
        ksy.u(parcel, 4, this.c);
        ksy.C(parcel, 5, this.d);
        ksy.u(parcel, 6, this.e);
        ksy.r(parcel, 7, this.f);
        ksy.i(parcel, 8, this.h);
        ksy.E(parcel, 9, this.g, i);
        ksy.A(parcel, 11, this.i, i);
        String[] strArr = this.q;
        if (strArr == null) {
            strArr = p;
        }
        ksy.C(parcel, 12, strArr);
        ksy.l(parcel, 13, this.j);
        ksy.A(parcel, 14, this.k, i);
        ksy.A(parcel, 15, this.l, i);
        ksy.q(parcel, 16, this.m);
        ksy.z(parcel, 17, this.n);
        ksy.h(parcel, iG);
    }

    public kiw(kjw kjwVar, aulj auljVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, lle[] lleVarArr, String[] strArr2, int i, Long l) {
        this.a = kjwVar;
        this.o = auljVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = lleVarArr;
        this.h = true;
        this.q = strArr2;
        this.j = i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
