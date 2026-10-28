package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oea implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;

    public oea(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        Object odzVar;
        int i = this.$cid;
        if (i == 0) {
            odzVar = new odz((Context) ((aupo) this.a).b, (oaq) ((aupo) this.b).b, (omj) this.c.io(), (omj) this.d.io());
        } else {
            if (i != 1) {
                aupr auprVar = this.d;
                aunn aunnVarB = aupm.b(this.a);
                omj omjVar = (omj) auprVar.io();
                oay oayVar = ((oaq) ((aupo) this.c).b).m;
                if (oayVar == null) {
                    oayVar = oay.a;
                }
                return new ablj(aunnVarB, omjVar, oayVar.c);
            }
            Object obj = ((aupo) this.a).b;
            aupr auprVar2 = this.c;
            aupr auprVar3 = this.b;
            aunn aunnVarB2 = aupm.b(this.d);
            aunn aunnVarB3 = aupm.b(auprVar3);
            aunn aunnVarB4 = aupm.b(auprVar2);
            oaq oaqVar = (oaq) obj;
            oay oayVar2 = oaqVar.m;
            if (oayVar2 == null) {
                oayVar2 = oay.a;
            }
            boolean z = oayVar2.b;
            oay oayVar3 = oaqVar.m;
            if (oayVar3 == null) {
                oayVar3 = oay.a;
            }
            long j = oayVar3.d;
            boolean z2 = oaqVar.f;
            boolean z3 = oaqVar.z;
            odzVar = new odr(aunnVarB2, aunnVarB3, aunnVarB4, z, j);
        }
        return odzVar;
    }

    public oea(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, byte[] bArr) {
        this.$cid = i;
        this.d = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.a = auprVar4;
    }

    public oea(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, int i, char[] cArr) {
        this.$cid = i;
        this.a = auprVar;
        this.d = auprVar2;
        this.b = auprVar3;
        this.c = auprVar4;
    }
}
