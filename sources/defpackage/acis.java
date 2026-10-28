package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acis implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(13);
    public final acir a;
    public final acir b;
    public final wjf c;
    public final abnl d;
    public final boolean e;
    public final wjf f;
    public final String g;
    public final long h;
    public final String i;
    public final float j;
    public final boolean k;

    public acis(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = new acir(parcel);
        this.b = parcel.readInt() != 0 ? new acir(parcel) : null;
        this.c = (wjf) parcel.readParcelable(classLoader);
        this.d = (abnl) parcel.readParcelable(classLoader);
        this.e = parcel.readInt() != 0;
        this.f = (wjf) parcel.readParcelable(classLoader);
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readFloat();
        this.k = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acis) {
            acis acisVar = (acis) obj;
            if (Objects.equals(this.a, acisVar.a) && Objects.equals(this.b, acisVar.b) && Objects.equals(this.f, acisVar.f) && Objects.equals(this.g, acisVar.g) && Objects.equals(this.c, acisVar.c) && abnn.i(this.d, acisVar.d) && this.e == acisVar.e && this.h == acisVar.h && TextUtils.equals(this.i, acisVar.i) && this.j == acisVar.j && this.k == acisVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() + 527;
        acir acirVar = this.b;
        int iHashCode2 = acirVar != null ? acirVar.hashCode() : 0;
        int i = iHashCode * 31;
        wjf wjfVar = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (wjfVar != null ? wjfVar.hashCode() : 0)) * 31;
        abnl abnlVar = this.d;
        int iHashCode4 = (((iHashCode3 + (abnlVar != null ? abnlVar.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        wjf wjfVar2 = this.f;
        int iHashCode5 = (iHashCode4 + (wjfVar2 != null ? wjfVar2.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        long j = this.h;
        int i2 = (((((iHashCode5 + iHashCode6) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31;
        String str2 = this.i;
        return ((((i2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Float.floatToIntBits(this.j)) * 31) + (this.k ? 1 : 0);
    }

    public final String toString() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        wjf wjfVar = this.f;
        abnl abnlVar = this.d;
        wjf wjfVar2 = this.c;
        acir acirVar = this.b;
        return "DirectorSavedState{" + hexString + " contentVideoState=" + this.a.toString() + " interstitialVideoState=" + String.valueOf(acirVar) + " playerResponse=" + String.valueOf(wjfVar2) + " playbackStartDescriptor=" + String.valueOf(abnlVar) + " userInitiatedPlayback=" + this.e + " interstitialPlayerResponse=" + String.valueOf(wjfVar) + " interstitialCpn=" + this.g + " adStartPositionMillis=" + this.h + " videoCpn=" + this.i + " contentPlaybackRate=" + this.j + " fatalPlaybackErrorOccurred=" + this.k + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.a(parcel);
        acir acirVar = this.b;
        parcel.writeInt(acirVar != null ? 1 : 0);
        if (acirVar != null) {
            acirVar.a(parcel);
        }
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeFloat(this.j);
        parcel.writeInt(this.k ? 1 : 0);
    }

    public acis(acir acirVar, acir acirVar2, wjf wjfVar, abnl abnlVar, boolean z, wjf wjfVar2, String str, long j, String str2, float f, boolean z2) {
        this.a = acirVar;
        this.b = acirVar2;
        this.c = wjfVar;
        this.d = abnlVar;
        this.e = z;
        this.f = wjfVar2;
        this.g = str;
        this.h = j;
        this.i = str2;
        this.j = f;
        this.k = z2;
    }
}
