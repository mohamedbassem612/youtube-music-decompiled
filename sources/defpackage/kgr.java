package defpackage;

import android.content.Context;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kgr implements kpe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kgr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            kgx kgxVar = (kgx) obj;
            int i2 = kgw.a;
            kgv kgvVar = new kgv((kjc) obj2);
            khl khlVar = (khl) kgxVar.C();
            Context context = kgxVar.p;
            ksy ksyVar = kxz.b;
            kmv kmvVarAr = ksy.ar();
            Parcel parcelC = khlVar.c();
            ClassLoader classLoader = gdc.a;
            parcelC.writeStrongBinder(kgvVar);
            parcelC.writeStringArray((String[]) this.a);
            gdc.c(parcelC, kmvVarAr);
            khlVar.f(7, parcelC);
            return;
        }
        if (i == 1) {
            kgx kgxVar2 = (kgx) obj;
            int i3 = kgw.a;
            kgt kgtVar = new kgt((kjc) obj2);
            khl khlVar2 = (khl) kgxVar2.C();
            Context context2 = kgxVar2.p;
            ksy ksyVar2 = kxz.b;
            kmv kmvVarAr2 = ksy.ar();
            Parcel parcelC2 = khlVar2.c();
            ClassLoader classLoader2 = gdc.a;
            parcelC2.writeStrongBinder(kgtVar);
            parcelC2.writeStringArray((String[]) this.a);
            gdc.c(parcelC2, kmvVarAr2);
            khlVar2.f(5, parcelC2);
            return;
        }
        if (i == 2) {
            int i4 = ksl.a;
            kse kseVar = (kse) ((ksm) obj).C();
            Parcel parcelC3 = kseVar.c();
            gdc.c(parcelC3, this.a);
            kseVar.f(1, parcelC3);
            ((kjc) obj2).x(null);
            return;
        }
        int i5 = llq.a;
        lls llsVar = new lls((kjc) obj2);
        llt lltVar = (llt) ((llu) obj).C();
        byte[] byteArray = ((aifs) this.a).toByteArray();
        Parcel parcelC4 = lltVar.c();
        ClassLoader classLoader3 = gdc.a;
        parcelC4.writeStrongBinder(llsVar);
        parcelC4.writeByteArray(byteArray);
        lltVar.e(31, parcelC4);
    }
}
