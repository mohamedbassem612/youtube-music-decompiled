package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kah implements kpe {
    private final /* synthetic */ int $cid;

    public /* synthetic */ kah(int i) {
        this.$cid = i;
    }

    @Override // defpackage.kpe
    public final void a(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                khc khcVar = (khc) obj;
                khn khnVar = kan.a;
                khi khiVar = (khi) khcVar.C();
                Context context = khcVar.p;
                khiVar.a(ksy.ap());
                ((kjc) obj2).x(null);
                break;
            case 1:
                jzj jzjVar = new jzj((kjc) obj2);
                jzh jzhVar = (jzh) ((jzf) obj).C();
                Parcel parcelC = jzhVar.c();
                gdc.e(parcelC, jzjVar);
                jzhVar.e(3, parcelC);
                break;
            case 2:
                khc khcVar2 = (khc) obj;
                khn khnVar2 = kan.a;
                khi khiVar2 = (khi) khcVar2.C();
                Context context2 = khcVar2.p;
                khiVar2.g(ksy.ap());
                ((kjc) obj2).x(Boolean.TRUE);
                break;
            case 3:
                khc khcVar3 = (khc) obj;
                khn khnVar3 = kan.a;
                khi khiVar3 = (khi) khcVar3.C();
                Context context3 = khcVar3.p;
                khiVar3.g(ksy.ap());
                ((kjc) obj2).x(Boolean.TRUE);
                break;
            case 4:
                kbg kbgVar = (kbg) obj;
                kby kbyVar = new kby((kjc) obj2, 1);
                kbh kbhVar = (kbh) kbgVar.C();
                Context context4 = kbgVar.p;
                kmv kmvVarAp = ksy.ap();
                Parcel parcelC2 = kbhVar.c();
                gdc.e(parcelC2, kbyVar);
                gdc.c(parcelC2, kmvVarAp);
                kbhVar.f(2, parcelC2);
                break;
            case 5:
                kzb kzbVar = (kzb) obj;
                khn khnVar4 = kza.a;
                kyw kywVar = new kyw(Long.MAX_VALUE, 0, false, null);
                if (kzbVar.k(kyu.j)) {
                    kyy kyyVar = (kyy) kzbVar.C();
                    kzc kzcVar = new kzc(4, null, new kby((kjc) obj2, 5, (short[]) null), null, null);
                    Parcel parcelC3 = kyyVar.c();
                    gdc.c(parcelC3, kywVar);
                    gdc.c(parcelC3, kzcVar);
                    kyyVar.e(90, parcelC3);
                } else if (!kzbVar.k(kyu.f)) {
                    kyy kyyVar2 = (kyy) kzbVar.C();
                    Parcel parcelD = kyyVar2.d(7, kyyVar2.c());
                    Location location = (Location) gdc.a(parcelD, Location.CREATOR);
                    parcelD.recycle();
                    ((kjc) obj2).x(location);
                } else {
                    kyy kyyVar3 = (kyy) kzbVar.C();
                    kby kbyVar2 = new kby((kjc) obj2, 5, (short[]) null);
                    Parcel parcelC4 = kyyVar3.c();
                    gdc.c(parcelC4, kywVar);
                    gdc.e(parcelC4, kbyVar2);
                    kyyVar3.e(82, parcelC4);
                }
                break;
            case 6:
                int i = llq.a;
                llt lltVar = (llt) ((llu) obj).C();
                kby kbyVar3 = new kby((kjc) obj2, 6, (int[]) null);
                Parcel parcelC5 = lltVar.c();
                gdc.e(parcelC5, kbyVar3);
                lltVar.e(27, parcelC5);
                break;
            case 7:
                lmr lmrVar = (lmr) obj;
                lmq lmqVar = (lmq) lmrVar.C();
                lml lmlVar = new lml((kjc) obj2);
                Context context5 = lmrVar.p;
                kmv kmvVarAp2 = ksy.ap();
                Parcel parcelC6 = lmqVar.c();
                gdc.e(parcelC6, lmlVar);
                gdc.c(parcelC6, kmvVarAp2);
                lmqVar.f(1, parcelC6);
                break;
            default:
                lpn lpnVar = new lpn((kjc) obj2);
                lpw lpwVar = (lpw) ((lpz) obj).C();
                Parcel parcelC7 = lpwVar.c();
                gdc.e(parcelC7, lpnVar);
                lpwVar.e(2, parcelC7);
                break;
        }
    }
}
