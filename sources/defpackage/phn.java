package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class phn {
    private static final agsn a = agsn.h("GnpSdk");
    private final aunn b;

    public phn(aunn aunnVar) {
        aunnVar.getClass();
        this.b = aunnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, pxk] */
    public final Object a(Intent intent, awoq awoqVar) {
        phm phmVar;
        agev agevVarI;
        if (awoqVar instanceof phm) {
            phmVar = (phm) awoqVar;
            int i = phmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                phmVar.c = i - Integer.MIN_VALUE;
            } else {
                phmVar = new phm(this, awoqVar);
            }
        } else {
            phmVar = new phm(this, awoqVar);
        }
        Object objB = phmVar.a;
        awox awoxVar = awox.a;
        int i2 = phmVar.c;
        if (i2 == 0) {
            atqp.j(objB);
            agsn agsnVar = pho.a;
            intent.getClass();
            String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION");
            if (stringExtra == null || stringExtra.length() == 0) {
                agevVarI = agdf.a;
            } else {
                try {
                    agevVarI = agev.i(nxm.a(stringExtra));
                } catch (RuntimeException e) {
                    ((agsj) ((agsj) pho.a.c()).j(e)).s();
                    agevVarI = agdf.a;
                }
            }
            if (!agevVarI.g()) {
                return new pla(null);
            }
            pve pveVar = (pve) this.b.io();
            ?? C = agevVarI.c();
            phmVar.c = 1;
            objB = pveVar.b(C, phmVar);
            if (objB == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objB);
        }
        pky pkyVar = (pky) objB;
        if (pkyVar instanceof pku) {
            ((agsj) ((agsj) a.c()).j(((pku) pkyVar).b())).t("Failed to fetch account from storage.");
            return pkyVar;
        }
        plx plxVar = (plx) pkyVar.d();
        if (plxVar != null) {
            return new pla(plxVar);
        }
        ((agsj) a.c()).t("Account not in storage.");
        return new pkv(new plu("Account not in storage."), pkx.X);
    }
}
