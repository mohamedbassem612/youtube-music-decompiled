package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcc extends kry implements Iterable {
    public static final Parcelable.Creator CREATOR = new kwo(5);
    public final Bundle a;

    public lcc(Bundle bundle) {
        this.a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.a);
    }

    public final Long b(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public final Object c(String str) {
        return this.a.get(str);
    }

    public final String d(String str) {
        return this.a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new lcb(this);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        Bundle bundleA = a();
        int iG2 = ksy.g(parcel, 2);
        parcel.writeBundle(bundleA);
        ksy.h(parcel, iG2);
        ksy.h(parcel, iG);
    }
}
