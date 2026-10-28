package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kjv extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(10);
    public final boolean a;

    public kjv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kjv) && this.a == ((kjv) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a));
    }

    public final String toString() {
        return "LogVerifierResultParcelable[" + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }
}
