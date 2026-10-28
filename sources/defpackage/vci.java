package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vci implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new uwz(3);
    public final String a;
    public final String b;

    public vci(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vci) {
            vci vciVar = (vci) obj;
            if (Objects.equals(this.a, vciVar.a) && Objects.equals(this.b, vciVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "Place{placeId='" + this.a + "', placeName='" + this.b + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    vci() {
        this.a = null;
        this.b = null;
    }

    public vci(String str, String str2) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
    }
}
