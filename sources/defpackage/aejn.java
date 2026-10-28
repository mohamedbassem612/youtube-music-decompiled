package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aejn implements avkw {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public aejn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.avkw
    public final void a() {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            avax avaxVar = ((tsg) obj).f;
            if (avaxVar != null) {
                avaxVar.d();
                return;
            }
            return;
        }
        aejo aejoVar = (aejo) obj;
        aejoVar.b();
        qcb qcbVar = aejoVar.W;
        qcbVar.getClass();
        aejoVar.d.post(new aehz(qcbVar, 16));
    }

    @Override // defpackage.avkw
    public final void b(Throwable th) {
        int i = this.$cid;
        Object obj = this.a;
        if (i != 0) {
            tsg tsgVar = (tsg) obj;
            if (tsgVar.e.get()) {
                return;
            }
            tsgVar.g.a(th);
            return;
        }
        aejo aejoVar = (aejo) obj;
        aejoVar.b();
        aejoVar.d.post(new aead(this, th, 11));
    }

    @Override // defpackage.avkw
    public final /* synthetic */ void c(Object obj) {
        if (this.$cid != 0) {
            atxv atxvVar = (atxv) obj;
            atxvVar.getClass();
            tsg tsgVar = (tsg) this.a;
            if (tsgVar.e.get()) {
                return;
            }
            tsk tskVar = tsgVar.g;
            tsl tslVar = tskVar.b;
            tslVar.d.execute(afwl.i(new pac(atxvVar, tslVar, tskVar.c, tskVar.e, tskVar, tskVar.d, 2)));
            return;
        }
        afxq afxqVar = (afxq) obj;
        aejo aejoVar = (aejo) this.a;
        aejoVar.b();
        int iAT = a.aT(afxqVar.c);
        if (iAT != 0 && iAT == 3) {
            Handler handler = aejoVar.d;
            qcb qcbVar = aejoVar.X;
            qcbVar.getClass();
            handler.post(new aehz(qcbVar, 17));
        }
        Handler handler2 = aejoVar.d;
        handler2.post(new aead(this, afxqVar, 9));
        afxy afxyVar = afxqVar.f;
        if (afxyVar == null) {
            afxyVar = afxy.a;
        }
        if (afxyVar.b.d() > 0) {
            handler2.post(new aead(this, afxqVar, 10));
        }
        if ((afxqVar.b & 1) != 0) {
            handler2.post(new aehz(afxqVar, 18));
        }
    }
}
