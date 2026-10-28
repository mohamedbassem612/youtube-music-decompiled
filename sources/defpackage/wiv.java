package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wiv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(8);
    public final int a;

    public wiv(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wiv) && this.a == ((wiv) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        String str;
        int i = this.a;
        Locale locale = Locale.US;
        if (i == 0) {
            str = "MONO";
        } else if (i != 1) {
            str = i != 3 ? "Invalid" : "TOP_BOTTOM";
        } else {
            str = "SBS_LR";
        }
        return String.format(locale, "PlayerThreedRendererModel{layout=%s}", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public wiv() {
        throw null;
    }
}
