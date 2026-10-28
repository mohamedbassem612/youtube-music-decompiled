package defpackage;

import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbr extends cmi {
    private final cjz a;
    private final zgy b;
    private final zdd c;
    private final zcf d;
    private final bss e;
    private final Handler f;
    private final zjr g;
    private final zay h;
    private bzg i;
    private final wjr j;

    public zbr(zcf zcfVar, zgy zgyVar, zdd zddVar, cjz cjzVar, Handler handler, Handler handler2, zao zaoVar, wjr wjrVar, zjr zjrVar) {
        this.d = zcfVar;
        this.b = zgyVar;
        this.c = zddVar;
        this.a = cjzVar;
        this.f = handler2;
        this.g = zjrVar;
        this.h = new zay(handler, zaoVar, handler2);
        this.j = wjrVar;
        bsi bsiVar = new bsi();
        bsiVar.a = "OtfOrVodMediaSource";
        bsiVar.b = Uri.EMPTY;
        bsiVar.d = new zce(null, zcfVar);
        this.e = bsiVar.a();
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        zbq zbqVar;
        zcf zcfVar = this.d;
        synchronized (zcfVar) {
            zbqVar = new zbq(this.b, this.c, this.a, G(cnmVar), this.i, F(cnmVar), craVar, zcfVar.y, zcfVar.A, this.h, zcfVar.a, this.e, this.j, zcfVar.J, this.g);
        }
        return zbqVar;
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.e;
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.i = bzgVar;
        Handler handler = this.f;
        cjz cjzVar = this.a;
        cjzVar.e(handler.getLooper(), r());
        cjzVar.c();
        z(new zdi(this.e));
    }

    @Override // defpackage.cmi
    protected final void jI() {
        this.a.d();
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        ((zbq) cnkVar).r();
    }

    @Override // defpackage.cno
    public final void jG() {
    }
}
