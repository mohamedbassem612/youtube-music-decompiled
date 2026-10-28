package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uji implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pyc(20);
    public final long a;
    public final Uri b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final aljj g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public uji(long j, Uri uri, String str, String str2, long j2, long j3, aljj aljjVar, long j4, int i, int i2, int i3, int i4) {
        this.a = j;
        this.b = uri;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = j3;
        this.g = aljjVar;
        this.h = j4;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    public static ujh a() {
        ujh ujhVar = new ujh();
        ujhVar.f(Long.MIN_VALUE);
        ujhVar.k(0);
        ujhVar.e(0);
        ujhVar.h(0);
        return ujhVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uji) {
            return this.b.equals(((uji) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        aljj aljjVar = this.g;
        return "DeviceLocalFile{id=" + this.a + ", uri=" + String.valueOf(this.b) + ", displayName=" + this.c + ", directory=" + this.d + ", size=" + this.e + ", duration=" + this.f + ", previewCoordinates=" + String.valueOf(aljjVar) + ", lastModifiedTime=" + this.h + ", fileType=" + this.i + ", width=" + this.j + ", height=" + this.k + ", rotation=" + this.l + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        aljj aljjVar = this.g;
        if (aljjVar == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            ahng.aE(parcel, aljjVar);
        }
    }

    public uji() {
        throw null;
    }
}
