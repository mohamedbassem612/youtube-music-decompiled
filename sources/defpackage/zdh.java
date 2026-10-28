package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zdh extends cmi {
    private final cjz a;
    private final zdd b;
    private final Handler c;
    private final zcf d;
    private final zjd e;
    private final bss f;
    private volatile zdg g;
    private bzg h;
    private final wjr i;

    public zdh(Executor executor, cjz cjzVar, zdd zddVar, Handler handler, zcf zcfVar, zjd zjdVar, wjr wjrVar) {
        this.a = cjzVar;
        this.b = zddVar;
        this.c = handler;
        this.d = zcfVar;
        bsi bsiVar = new bsi();
        bsiVar.a = "VodMediaSource";
        bsiVar.b = Uri.EMPTY;
        bsiVar.d = new zce(null, zcfVar);
        this.f = bsiVar.a();
        this.e = zjdVar;
        this.i = wjrVar;
        executor.execute(new ywt(zcfVar, 15));
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        zjd zjdVar = this.e;
        zjdVar.aN();
        zcf zcfVar = this.d;
        synchronized (zcfVar) {
            this.g = new zdg(craVar, zcfVar, this.a, G(cnmVar), this.b, F(cnmVar), zjdVar, this.h, this.i);
        }
        this.e.aM();
        return this.g;
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.f;
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.h = bzgVar;
        Handler handler = this.c;
        cjz cjzVar = this.a;
        cjzVar.e(handler.getLooper(), r());
        cjzVar.c();
        z(new zdi(this.f));
    }

    @Override // defpackage.cmi
    protected final void jI() {
        this.a.d();
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        zjd zjdVar = this.e;
        zjdVar.aP();
        Iterator it = ((zdg) cnkVar).b.iterator();
        while (it.hasNext()) {
            ((cpk) it.next()).h(null);
        }
        zjdVar.aO();
    }

    @Override // defpackage.cno
    public final void jG() {
    }
}
