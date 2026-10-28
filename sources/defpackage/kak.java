package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kak implements kpe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ kak(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                khc khcVar = (khc) obj;
                kan kanVar = (kan) this.a;
                kanVar.n();
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC = khiVar.c();
                gdc.c(parcelC, kmvVarAp);
                khiVar.f(4, parcelC);
                kanVar.w((kjc) obj2);
                return;
            case 1:
                khc khcVar2 = (khc) obj;
                khi khiVar2 = (khi) khcVar2.C();
                Context context2 = khcVar2.p;
                Object obj3 = this.a;
                khiVar2.b(((kan) obj3).b, ksy.ap());
                khi khiVar3 = (khi) khcVar2.C();
                kmv kmvVarAp2 = ksy.ap();
                Parcel parcelC2 = khiVar3.c();
                gdc.c(parcelC2, kmvVarAp2);
                khiVar3.f(17, parcelC2);
                ((kjc) obj2).x(null);
                return;
            case 2:
                kgx kgxVar = (kgx) obj;
                int i = kgw.a;
                kgu kguVar = new kgu((kjc) obj2);
                khl khlVar = (khl) kgxVar.C();
                Context context3 = kgxVar.p;
                kmv kmvVarAp3 = ksy.ap();
                Parcel parcelC3 = khlVar.c();
                gdc.e(parcelC3, kguVar);
                parcelC3.writeStringArray((String[]) this.a);
                gdc.c(parcelC3, kmvVarAp3);
                khlVar.f(6, parcelC3);
                return;
            case 3:
                kjo kjoVar = (kjo) obj;
                kkc kkcVar = kjn.a;
                try {
                    ((kjr) kjoVar.C()).a(new kjj((kjc) obj2), (kjg) this.a);
                    return;
                } catch (RemoteException | RuntimeException e) {
                    Log.e("ClearcutLoggerApiImpl", "Failed to call logError", e);
                    throw e;
                }
            case 4:
                int i2 = kkk.a;
                kkm kkmVar = (kkm) ((kkl) obj).C();
                kkn kknVar = new kkn((kjc) obj2, 0);
                Parcel parcelC4 = kkmVar.c();
                gdc.c(parcelC4, this.a);
                gdc.e(parcelC4, kknVar);
                kkmVar.f(2, parcelC4);
                return;
            case 5:
                int i3 = ksh.a;
                ksd ksdVar = (ksd) ((ksb) obj).C();
                Parcel parcelC5 = ksdVar.c();
                gdc.c(parcelC5, this.a);
                ksdVar.f(1, parcelC5);
                ((kjc) obj2).x(null);
                return;
            case 6:
                int i4 = ksj.a;
                ksf ksfVar = (ksf) ((ksc) obj).C();
                Parcel parcelC6 = ksfVar.c();
                gdc.c(parcelC6, this.a);
                ksfVar.f(1, parcelC6);
                ((kjc) obj2).x(null);
                return;
            case 7:
                lkf lkfVar = (lkf) obj;
                int i5 = lji.a;
                ljh ljhVar = new ljh((kjc) obj2);
                lke lkeVar = (lke) lkfVar.C();
                Context context4 = lkfVar.p;
                kmv kmvVarAq = ksy.aq();
                Parcel parcelC7 = lkeVar.c();
                gdc.e(parcelC7, ljhVar);
                gdc.c(parcelC7, ((lqa) this.a).a);
                gdc.c(parcelC7, kmvVarAq);
                lkeVar.e(1, parcelC7);
                return;
            case 8:
                lkv lkvVar = (lkv) obj;
                kjc kjcVar = (kjc) obj2;
                lkr lkrVar = new lkr(kjcVar);
                ?? r5 = this.a;
                try {
                    lkm lkmVar = (lkm) lkvVar.C();
                    Context context5 = lkvVar.p;
                    kmv kmvVarAp4 = ksy.ap();
                    Parcel parcelC8 = lkmVar.c();
                    gdc.e(parcelC8, lkrVar);
                    gdc.c(parcelC8, r5);
                    gdc.c(parcelC8, kmvVarAp4);
                    lkmVar.e(3, parcelC8);
                    return;
                } catch (RemoteException unused) {
                    kro.z(Status.c, null, kjcVar);
                    return;
                }
            case 9:
                lkv lkvVar2 = (lkv) obj;
                kjc kjcVar2 = (kjc) obj2;
                lkq lkqVar = new lkq(kjcVar2);
                ?? r6 = this.a;
                try {
                    lkm lkmVar2 = (lkm) lkvVar2.C();
                    Context context6 = lkvVar2.p;
                    kmv kmvVarAp5 = ksy.ap();
                    Parcel parcelC9 = lkmVar2.c();
                    gdc.e(parcelC9, lkqVar);
                    gdc.c(parcelC9, r6);
                    gdc.c(parcelC9, kmvVarAp5);
                    lkmVar2.e(2, parcelC9);
                    return;
                } catch (RemoteException unused2) {
                    kro.z(Status.c, null, kjcVar2);
                    return;
                }
            case 10:
                lkv lkvVar3 = (lkv) obj;
                kjc kjcVar3 = (kjc) obj2;
                lkp lkpVar = new lkp(kjcVar3);
                ?? r7 = this.a;
                try {
                    lkm lkmVar3 = (lkm) lkvVar3.C();
                    Context context7 = lkvVar3.p;
                    kmv kmvVarAp6 = ksy.ap();
                    Parcel parcelC10 = lkmVar3.c();
                    gdc.e(parcelC10, lkpVar);
                    gdc.c(parcelC10, r7);
                    gdc.c(parcelC10, kmvVarAp6);
                    lkmVar3.e(1, parcelC10);
                    return;
                } catch (RemoteException unused3) {
                    kro.z(Status.c, null, kjcVar3);
                    return;
                }
            case 11:
                int i6 = llq.a;
                ((llt) ((llu) obj).C()).a(new lls((kjc) obj2), (String) this.a);
                return;
            default:
                lnx lnxVar = (lnx) obj;
                int i7 = lnw.a;
                lnt lntVar = new lnt(lnxVar, (kjc) obj2);
                lnu lnuVar = (lnu) lnxVar.C();
                Context context8 = lnxVar.p;
                kmv kmvVarAp7 = ksy.ap();
                Parcel parcelC11 = lnuVar.c();
                gdc.c(parcelC11, this.a);
                gdc.e(parcelC11, lntVar);
                gdc.c(parcelC11, kmvVarAp7);
                lnuVar.e(2, parcelC11);
                return;
        }
    }
}
