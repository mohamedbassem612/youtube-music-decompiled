package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kca extends gda implements kcb {
    public kca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // defpackage.kcb
    public final void a(jzt jztVar, String str, String str2, boolean z) {
        Parcel parcelC = c();
        gdc.c(parcelC, jztVar);
        parcelC.writeString(str);
        parcelC.writeString(str2);
        parcelC.writeInt(z ? 1 : 0);
        e(4, parcelC);
    }

    @Override // defpackage.kcb
    public final void b(int i) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        e(5, parcelC);
    }

    @Override // defpackage.kcb
    public final void g(klo kloVar) {
        Parcel parcelC = c();
        gdc.c(parcelC, kloVar);
        e(3, parcelC);
    }

    @Override // defpackage.kcb
    public final void h(int i) {
        Parcel parcelC = c();
        parcelC.writeInt(i);
        e(2, parcelC);
    }

    @Override // defpackage.kcb
    public final void i(boolean z) {
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        e(7, parcelC);
    }

    @Override // defpackage.kcb
    public final void j(boolean z) {
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeInt(z ? 1 : 0);
        parcelC.writeInt(0);
        e(6, parcelC);
    }

    @Override // defpackage.kcb
    public final void k() {
        Parcel parcelC = c();
        gdc.c(parcelC, null);
        e(1, parcelC);
    }
}
