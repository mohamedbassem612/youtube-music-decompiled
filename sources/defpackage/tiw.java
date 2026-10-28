package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tiw implements tjl {
    private final tqj a;
    private final awmd b;
    private final awmd c;
    private final mbc d;

    public tiw(tqj tqjVar, awmd awmdVar, awmd awmdVar2, mbc mbcVar) {
        tqjVar.getClass();
        awmdVar.getClass();
        awmdVar2.getClass();
        mbcVar.getClass();
        this.a = tqjVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = mbcVar;
    }

    @Override // defpackage.tjl
    public final /* synthetic */ boolean a(tns tnsVar, List list, Throwable th) {
        return true;
    }

    @Override // defpackage.tjl
    public final /* synthetic */ boolean b(tns tnsVar) {
        return true;
    }

    @Override // defpackage.tjl
    public final tjm c(tns tnsVar, tlj tljVar, tit titVar, tmt tmtVar) {
        int i = tqr.a;
        tqj tqjVar = this.a;
        tko tkoVar = null;
        if (tqjVar.k(1073828828) && (!tqjVar.k(1073829864) || !((tre) this.c.io()).h.n())) {
            tkoVar = (tko) this.b.io();
        }
        return new tja(tnsVar, tljVar, tmtVar, titVar, tqjVar, tkoVar, this.d);
    }
}
