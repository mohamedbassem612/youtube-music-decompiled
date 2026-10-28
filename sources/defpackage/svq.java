package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class svq implements sxt {
    private final zvl a;
    private final yhi b;

    public svq(zvl zvlVar, yhi yhiVar) {
        this.a = zvlVar;
        this.b = yhiVar;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, vxe] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, vxe] */
    @Override // defpackage.sxt
    public final boolean d(int i, int i2, Intent intent) {
        if (i != 1902) {
            return false;
        }
        if (i2 == -1) {
            yhi yhiVar = this.b;
            ajwn ajwnVar = ((aleo) yhiVar.a).d;
            if (ajwnVar == null) {
                ajwnVar = ajwn.a;
            }
            nsh.h(((vax) yhiVar.b).a, ajwnVar);
        } else if (i2 == 0) {
            yhi yhiVar2 = this.b;
            ajwn ajwnVar2 = ((aleo) yhiVar2.a).d;
            if (ajwnVar2 == null) {
                ajwnVar2 = ajwn.a;
            }
            if ((ajwnVar2.b & 2) != 0) {
                ajwo ajwoVar = ajwnVar2.d;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                ((vax) yhiVar2.b).a.a(ajwoVar);
            }
        } else if (i2 == 1) {
            this.b.e();
        } else {
            ((agrc) ((agrc) svr.a.b()).k("com/google/android/libraries/youtube/commerce/payment/controller/PurchaseManagerController$PurchaseManagerAPIResultCallback", "handleActivityResult", 166, "PurchaseManagerController.java")).u("Unknown purchase manager flow result code received: %d", i2);
            zvl zvlVar = this.a;
            zvj zvjVarA = zvk.a();
            zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
            zvjVarA.j = 20;
            zvjVarA.d(a.bR(i2, "Unknown purchase manager flow result code received: "));
            zvlVar.a(zvjVarA.a());
        }
        return true;
    }
}
