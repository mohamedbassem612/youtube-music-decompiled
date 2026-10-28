package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lla extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(5);
    public final String a;
    public final byte[] b;
    public final String c;
    public final lkz[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public lla(String str, String str2, lkz[] lkzVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = lkzVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (lkz lkzVar : lkzVarArr) {
            this.e.put(Integer.valueOf(lkzVar.a), lkzVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lla)) {
            return false;
        }
        lla llaVar = (lla) obj;
        return a.ae(this.a, llaVar.a) && a.ae(this.c, llaVar.c) && this.e.equals(llaVar.e) && this.f == llaVar.f && Arrays.equals(this.b, llaVar.b) && this.g == llaVar.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((lkz) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.c);
        ksy.E(parcel, 4, this.d, i);
        ksy.i(parcel, 5, this.f);
        ksy.q(parcel, 6, this.b);
        ksy.m(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }
}
