package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kyt extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(9);
    private final int a;

    private kyt() {
        this.a = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kyt) {
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(((kyt) obj).a));
        }
        return false;
    }

    public int getMaxInflight() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, getMaxInflight());
        ksy.h(parcel, iG);
    }

    public kyt(int i) {
        this.a = i;
    }
}
