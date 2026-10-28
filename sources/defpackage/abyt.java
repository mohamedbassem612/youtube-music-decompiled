package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyt implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(7);
    public final String a;
    public final abyn b;
    public final abyw c;
    public final abza d;
    public final abzm e;
    public final abzg f;

    public abyt(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = typ.c(parcel.readString());
        this.b = (abyn) parcel.readParcelable(classLoader);
        this.c = (abyw) parcel.readParcelable(classLoader);
        this.d = (abza) parcel.readParcelable(classLoader);
        this.e = (abzm) parcel.readParcelable(classLoader);
        this.f = (abzg) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "State { videoId=%s }", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.f, 0);
    }

    public abyt(String str, abyn abynVar, abyw abywVar, abza abzaVar, abzm abzmVar, abzg abzgVar) {
        this.a = str;
        this.b = abynVar;
        this.c = abywVar;
        this.d = abzaVar;
        this.e = abzmVar;
        this.f = abzgVar;
    }
}
