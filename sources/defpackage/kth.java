package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class kth extends kry {
    public static final Parcelable.Creator CREATOR;
    public static final int a;
    public final Bundle b;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 60000;
        CREATOR = new kpm(12);
    }

    public kth() {
        String property;
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putInt("clientVersion", klt.b);
        try {
            property = System.getProperty("os.arch");
        } catch (Exception unused) {
            property = "?";
        }
        this.b.putString("appArchitecture", property);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.p(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }

    public kth(Bundle bundle) {
        new Bundle();
        this.b = bundle;
    }
}
