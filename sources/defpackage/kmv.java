package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmv extends kry {
    public static final Parcelable.Creator CREATOR = fh.a;
    public static final kmv a = kro.s(null, false, null, false);
    public final kmx b;
    public final boolean c;
    public final knk d;
    public boolean e;

    static {
        kro.s(null, false, null, true);
    }

    public kmv(kmx kmxVar, boolean z, knk knkVar) {
        this.b = kmxVar;
        this.c = z;
        this.d = knkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kmv)) {
            return false;
        }
        kmv kmvVar = (kmv) obj;
        return Objects.equals(this.b, kmvVar.b) && this.e == kmvVar.e && this.c == kmvVar.c && Objects.equals(this.d, kmvVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.e), Boolean.valueOf(this.c), this.d);
    }

    public final String toString() {
        knk knkVar = this.d;
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.b) + ", callbackSupportEnabled=" + this.c + ", sourceUserContext=" + String.valueOf(knkVar) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.e) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.b, i);
        boolean z = this.c;
        parcel.writeInt(262146);
        parcel.writeInt(z ? 1 : 0);
        ksy.A(parcel, 3, this.d, i);
        ksy.h(parcel, iG);
    }
}
