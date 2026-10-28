package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kar extends kry {
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public static final khn a = new khn("MediaLiveSeekableRange", (String) null);
    public static final Parcelable.Creator CREATOR = new jys(14);

    public kar(long j, long j2, boolean z, boolean z2) {
        this.b = Math.max(j, 0L);
        this.c = Math.max(j2, 0L);
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kar) {
            kar karVar = (kar) obj;
            if (this.b == karVar.b && this.c == karVar.c && this.d == karVar.d && this.e == karVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 2, j);
        ksy.m(parcel, 3, this.c);
        ksy.i(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
