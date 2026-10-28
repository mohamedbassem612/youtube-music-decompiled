package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abzm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(11);
    public final aopm a;
    public final wjm b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;

    public abzm(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        acli acliVar = (acli) parcel.readParcelable(acli.class.getClassLoader());
        this.a = acliVar == null ? aopm.a : (aopm) acliVar.a(aopm.a);
        this.b = (wjm) parcel.readParcelable(classLoader);
        this.c = ahno.Z(parcel.readString());
        this.e = ahno.Z(parcel.readString());
        this.d = parcel.readInt();
        this.f = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        wjm wjmVar = this.b;
        return "AtrClient.AtrClientState{" + hexString + " baseAtrUri=" + String.valueOf(wjmVar.c()) + " delaySeconds=" + wjmVar.b(5) + " cpn=" + this.c + " videoId=" + this.e + " length=" + this.d + " atrPingRequested=" + this.f + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new acli(this.a), 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.e);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public abzm(aopm aopmVar, wjm wjmVar, String str, int i, boolean z, String str2) {
        this.a = aopmVar;
        this.b = wjmVar;
        this.c = str;
        this.d = i;
        this.f = z;
        this.e = str2;
    }
}
