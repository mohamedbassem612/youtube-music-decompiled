package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpj extends kry {
    public static final Parcelable.Creator CREATOR = new lof(5);
    public final String a;
    public final byte[] b;
    public final List c;

    public lpj(String str, byte[] bArr, List list) {
        this.a = str;
        this.b = bArr;
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lpj) {
            lpj lpjVar = (lpj) obj;
            if (Objects.equals(this.a, lpjVar.a) && Arrays.equals(this.b, lpjVar.b) && Objects.equals(this.c, lpjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.q(parcel, 2, this.b);
        ksy.v(parcel, 3, new ArrayList(this.c));
        ksy.h(parcel, iG);
    }
}
