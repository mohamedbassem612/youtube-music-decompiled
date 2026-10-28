package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class knk extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(1);
    public final long a;

    public knk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof knk) && this.a == ((knk) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return a.ak(this.a);
    }

    public final String toString() {
        return "SourceUserContext(" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, j);
        ksy.h(parcel, iG);
    }
}
