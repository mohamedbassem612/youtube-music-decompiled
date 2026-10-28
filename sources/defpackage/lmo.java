package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lmo extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(13);
    private final String a;
    private final String b;

    public lmo(Parcel parcel) {
        this.a = parcel.readString();
        String string = parcel.readString();
        kro.l(string);
        this.b = string;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lmo)) {
            return false;
        }
        lmo lmoVar = (lmo) obj;
        return Objects.equals(this.a, lmoVar.a) && Objects.equals(this.b, lmoVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
