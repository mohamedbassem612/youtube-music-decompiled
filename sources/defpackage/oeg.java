package defpackage;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oeg implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;
    private final aupr f;

    public oeg(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
        this.f = auprVar6;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        int i = this.$cid;
        aupr auprVar = this.a;
        if (i == 0) {
            return new aczl((kwv) auprVar.io(), (xsc) this.b.io(), (ablj) this.c.io(), (omj) this.d.io(), (ExecutorService) ((aupo) this.e).b, (oaq) ((aupo) this.f).b);
        }
        ablj abljVar = (ablj) auprVar.io();
        aczl aczlVar = (aczl) this.e.io();
        xsc xscVar = (xsc) this.b.io();
        omj omjVar = (omj) this.d.io();
        obc obcVar = (obc) this.c.io();
        oaq oaqVar = (oaq) ((aupo) this.f).b;
        oay oayVar = oaqVar.m;
        if (oayVar == null) {
            oayVar = oay.a;
        }
        boolean z = oayVar.e;
        oay oayVar2 = oaqVar.m;
        long j = (oayVar2 == null ? oay.a : oayVar2).f;
        if (oayVar2 == null) {
            oayVar2 = oay.a;
        }
        return new odx(abljVar, aczlVar, xscVar, omjVar, obcVar, z, j, oayVar2.g);
    }

    public oeg(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, int i, byte[] bArr) {
        this.$cid = i;
        this.a = auprVar;
        this.e = auprVar2;
        this.b = auprVar3;
        this.d = auprVar4;
        this.c = auprVar5;
        this.f = auprVar6;
    }
}
