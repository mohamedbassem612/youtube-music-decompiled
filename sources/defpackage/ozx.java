package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ozx implements ozv {
    private static final agsn a = agsn.h("GnpSdk");
    private final aunn b;
    private final aunn c;

    public ozx(qbi qbiVar, aunn aunnVar, pbw pbwVar, paa paaVar, aunn aunnVar2, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4) {
        qbiVar.getClass();
        aunnVar.getClass();
        pbwVar.getClass();
        paaVar.getClass();
        aunnVar2.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        awmdVar3.getClass();
        awmdVar4.getClass();
        this.b = aunnVar;
        this.c = aunnVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ozv
    public final Object a(plx plxVar, String str, phb phbVar, awoq awoqVar) throws Throwable {
        ozw ozwVar;
        if (awoqVar instanceof ozw) {
            ozwVar = (ozw) awoqVar;
            int i = ozwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozwVar.c = i - Integer.MIN_VALUE;
            } else {
                ozwVar = new ozw(this, awoqVar);
            }
        } else {
            ozwVar = new ozw(this, awoqVar);
        }
        ozw ozwVar2 = ozwVar;
        Object objB = ozwVar2.a;
        Object obj = awox.a;
        int i2 = ozwVar2.c;
        if (i2 == 0) {
            atqp.j(objB);
            Bundle bundle = new Bundle();
            nvi.b(bundle, plxVar);
            bundle.putString("GNP_THREAD_ID_KEY", str);
            bundle.putString("EXTRA_REFRESH_REASON_KEY", phbVar.name());
            ppy ppyVar = (ppy) this.b.io();
            Object objIo = this.c.io();
            objIo.getClass();
            ozwVar2.c = 1;
            objB = ppyVar.b((ppw) objIo, plxVar, bundle, null, str, ozwVar2);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(objB);
        obj = (pky) objB;
        if (obj instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) obj).b())).t("Unable to schedule task for refreshing single notification.");
        }
        return obj;
    }
}
