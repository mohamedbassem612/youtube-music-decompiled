package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aek implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(2);
    private final Bundle a;

    public aek(Object obj) {
        this.a = aep.a(obj, aep.d(obj.getClass()), aen.a());
    }

    public final Object a() {
        Map map = aep.a;
        return aep.b(this.a, aen.a());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public aek(Bundle bundle) {
        this.a = bundle;
    }
}
