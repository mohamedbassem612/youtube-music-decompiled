package defpackage;

import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zbh extends cmi implements zap {
    final zbg a;
    public volatile zbj b;
    private final zgy c;
    private final cjz d;
    private final zfc e;
    private final wiu f;
    private final wja g;
    private final yxb h;
    private final String i;
    private final bss j;
    private bzg k;
    private final zjr l;
    private final Handler m;
    private final tfq n;
    private final xxj[] o;
    private final wjr p;

    public zbh(zgy zgyVar, cjz cjzVar, Handler handler, Handler handler2, wiu wiuVar, wja wjaVar, yxb yxbVar, zfc zfcVar, zao zaoVar, String str, Object obj, wjr wjrVar, xxj[] xxjVarArr, tfq tfqVar, zjr zjrVar) {
        zkf.a(!wjaVar.t.isEmpty());
        this.c = zgyVar;
        this.d = cjzVar;
        this.a = new zbg(this, handler, zaoVar, handler2);
        this.f = wiuVar;
        this.g = wjaVar;
        this.h = yxbVar;
        this.e = zfcVar;
        this.i = str;
        this.p = wjrVar;
        bsi bsiVar = new bsi();
        bsiVar.a = "ManifestlessLiveMediaSource";
        bsiVar.b = Uri.EMPTY;
        bsiVar.d = obj;
        this.j = bsiVar.a();
        this.o = xxjVarArr;
        this.n = tfqVar;
        this.l = zjrVar;
        this.m = handler2;
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        wiu wiuVar = this.f;
        wja wjaVar = this.g;
        yxb yxbVar = this.h;
        zfc zfcVar = this.e;
        zbg zbgVar = this.a;
        String str = this.i;
        bss bssVar = this.j;
        wjr wjrVar = this.p;
        xxj[] xxjVarArr = this.o;
        tfq tfqVar = this.n;
        zjr zjrVar = this.l;
        return new zbf(this.c, this.d, G(cnmVar), this.k, F(cnmVar), craVar, wiuVar, wjaVar, yxbVar, zfcVar, zbgVar, str, bssVar, wjrVar, xxjVarArr, tfqVar, zjrVar);
    }

    @Override // defpackage.zap
    public final long jE(long j) {
        if (this.b != null) {
            return this.b.jE(j);
        }
        return -1L;
    }

    @Override // defpackage.cno
    public final bss jF() {
        return this.j;
    }

    @Override // defpackage.cno
    public final synchronized void jG() {
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.k = bzgVar;
        Handler handler = this.m;
        cjz cjzVar = this.d;
        cjzVar.e(handler.getLooper(), r());
        cjzVar.c();
        z(new zbl(this.g.H(), this.j));
    }

    @Override // defpackage.cmi
    protected final void jI() {
        this.d.d();
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        if (cnkVar instanceof zbf) {
            ((zbf) cnkVar).r();
        }
    }
}
