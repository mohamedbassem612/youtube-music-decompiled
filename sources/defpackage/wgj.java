package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wgj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uwz(6);
    public final aisu a;

    public wgj(aisu aisuVar) {
        aisuVar.getClass();
        this.a = aisuVar;
    }

    public final String a() {
        return this.a.g;
    }

    public final List b() {
        return this.a.e;
    }

    public final List c() {
        return this.a.i;
    }

    public final List d() {
        return this.a.h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Objects.equals(this.a, ((wgj) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tym.u(this.a, parcel);
    }
}
