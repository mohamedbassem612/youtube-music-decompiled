package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahqf extends kry {
    public static final Parcelable.Creator CREATOR = new ahpw(2);
    public final Uri a;
    public final Uri b;
    public final List c;

    public ahqf(Uri uri, Uri uri2, List list) {
        this.a = uri;
        this.b = uri2;
        this.c = list == null ? new ArrayList() : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Uri uri = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, uri, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.F(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
