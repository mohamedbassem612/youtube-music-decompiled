package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class loi extends kry implements kni {
    public static final Parcelable.Creator CREATOR = new lof(2);
    public final List a;
    public final String b;

    public loi(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.kni
    public final Status a() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.D(parcel, 1, list);
        ksy.B(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
