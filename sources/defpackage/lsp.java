package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsp extends kry {
    public static final Parcelable.Creator CREATOR = new lry(10);

    @Deprecated
    final String a;

    @Deprecated
    final String b;
    final ArrayList c;

    public lsp(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.F(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
