package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vwq implements vwk {
    private final mbc a;

    public vwq(mbc mbcVar) {
        this.a = mbcVar;
    }

    @Override // defpackage.vwk
    public final vwj a(tmr tmrVar) {
        vwn vwnVar = vwn.AVAILABLE;
        tmt tmtVar = tmrVar.b;
        mbc mbcVar = this.a;
        if (tmtVar.b(mbcVar)) {
            vwnVar = vwn.EXPIRED;
        } else if (tmtVar.c(mbcVar)) {
            vwnVar = vwn.STALE;
        }
        return new vwo(vwnVar);
    }
}
