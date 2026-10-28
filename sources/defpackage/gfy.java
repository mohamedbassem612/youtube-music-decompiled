package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gfy implements awmd {
    private final /* synthetic */ int $cid;

    public /* synthetic */ gfy(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final Object io() {
        switch (this.$cid) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return sbc.a;
            case 6:
                return new qgh(null);
            case 7:
                return new qgc(null);
            case 8:
                qgu qguVarD = qgv.d();
                qguVarD.c = 2;
                return qguVarD.a();
            case 9:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                return new qhf(2, 320000L, agpr.a);
            case 10:
                return qim.d().a();
            case 11:
                xlf xlfVarD = qhx.d();
                xlfVarD.a = 2;
                return xlfVarD.d();
            case 12:
                qip qipVarD = qiq.d();
                qipVarD.e = 2;
                return qipVarD.a();
            case 13:
                vzq vzqVarD = qis.d();
                vzqVarD.a = 2;
                return vzqVarD.b();
            case 14:
                qfp qfpVarD = qfq.d();
                qfpVarD.c = 2;
                return qfpVarD.a();
            case 15:
                return new qfm(null);
            case 16:
                return qhh.d().a();
            case 17:
                return ThreadLocalRandom.current();
            case 18:
                return agfe.b;
            case 19:
                return agpi.a;
            default:
                return agpi.a;
        }
    }
}
