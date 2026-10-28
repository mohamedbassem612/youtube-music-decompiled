package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjg extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(8);
    public final List a;

    public kjg(List list) {
        this.a = DesugarCollections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kjg) {
            return this.a.equals(((kjg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 1, list);
        ksy.h(parcel, iG);
    }
}
