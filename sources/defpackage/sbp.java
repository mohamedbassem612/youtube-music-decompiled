package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sbp extends sbk implements rsq {
    public final awmd a;
    private final ahey b;
    private final ScheduledExecutorService c;
    private final Map d = new ConcurrentHashMap();

    public sbp(awmd awmdVar, ahey aheyVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = awmdVar;
        this.b = aheyVar;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.sbk
    protected final void Z(snk snkVar, smr smrVar) {
        if (snkVar instanceof skg) {
            sbo sboVar = (sbo) this.d.get(((skg) snkVar).a);
            if (sboVar == null || !sboVar.c) {
                return;
            }
            ((rsk) this.a.io()).q(Collections.singletonList(this.g.Y(snkVar.b())));
        }
    }

    @Override // defpackage.sbk
    protected final agkz ac() {
        return new agqj(skg.class);
    }

    @Override // defpackage.rsq
    public final void e(aaxa aaxaVar) {
        yvs yvsVar = aaxaVar.a;
        long j = yvsVar.g;
        if (j != -1) {
            Map map = this.d;
            String str = yvsVar.a;
            sbo sboVar = (sbo) map.get(str);
            if (sboVar == null) {
                sboVar = new sbo(aaxaVar.b);
                map.put(str, sboVar);
            } else {
                if (sboVar.c) {
                    return;
                }
                ListenableFuture listenableFuture = sboVar.b;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                }
            }
            ListenableFuture listenableFutureP = ahng.p(new gmf(this, sboVar, yvsVar, 12, (byte[]) null), j, TimeUnit.MILLISECONDS, this.b);
            sboVar.b = listenableFutureP;
            taf.h(listenableFutureP, this.c, new iul(14));
        }
    }

    @Override // defpackage.rsq
    public final void h(aazs aazsVar) {
        Collection.EL.removeIf(this.d.values(), new sco(aazsVar.a(), 1));
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void av() {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void f(zhz zhzVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void g(aazp aazpVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void i(String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void j(aayt aaytVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void k(aayw aaywVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void d(String str, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void o(int i, String str) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void n(wgi wgiVar, String str, wjf wjfVar) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void p(String str, long j, int i) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void au(abnr abnrVar, abnr abnrVar2, int i, int i2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void l(abob abobVar, wjf wjfVar, acfw acfwVar, String str, String str2) {
    }

    @Override // defpackage.rsq
    public final /* synthetic */ void m(String str, long j, long j2, long j3, boolean z) {
    }
}
