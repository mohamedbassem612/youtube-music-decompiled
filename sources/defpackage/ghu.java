package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ghu implements adjf {
    final /* synthetic */ gjc a;

    public ghu(gjc gjcVar) {
        this.a = gjcVar;
    }

    @Override // defpackage.adjf
    public final adjh a(adic adicVar, awmd awmdVar, awmd awmdVar2, Map map, eyl eylVar) {
        ght ghtVar = this.a.a;
        return new adjh(adicVar, awmdVar, awmdVar2, map, eylVar, (vxz) ghtVar.aL.io(), (mbc) ghtVar.l.io(), ghtVar.a.ai(), (Executor) ghtVar.z.io(), (tqj) ghtVar.q.io(), ghtVar.Q, (ScheduledExecutorService) ghtVar.T.io());
    }
}
