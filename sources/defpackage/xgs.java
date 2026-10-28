package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(20);
    private final argn a;
    private final atqd b;

    public xgs(argn argnVar, atqd atqdVar) {
        this.a = argnVar;
        this.b = atqdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgs) {
            xgs xgsVar = (xgs) obj;
            if (this.a.equals(xgsVar.a) && this.b.equals(xgsVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        atqd atqdVar = this.b;
        return "VisualElementVisibilityKey{describeContents=0, ve=" + String.valueOf(this.a) + ", fvlCriteria=" + String.valueOf(atqdVar) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
        tym.u(this.b, parcel);
    }

    public xgs() {
        throw null;
    }
}
