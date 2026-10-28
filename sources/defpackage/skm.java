package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class skm implements Parcelable, wgn {
    public static final Parcelable.Creator CREATOR = new pyc(11);
    public final smc a;

    public skm(smc smcVar) {
        this.a = smcVar;
    }

    public final Uri b() {
        return this.a.b();
    }

    public final wgm c() {
        return this.a.J();
    }

    public final wjf d() {
        return this.a.c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.a.o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof skm) {
            return this.a.equals(((skm) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.a.k();
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    @Override // defpackage.wgn
    public final long iK() {
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
    }
}
