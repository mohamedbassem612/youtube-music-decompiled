package defpackage;

import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class coj extends cmi {
    private final byd a;
    private final cjz b;
    private final crj c;
    private final boolean d;
    private final bse e;
    private boolean f = true;
    private long g = -9223372036854775807L;
    private boolean h;
    private boolean i;
    private boolean j;
    private bzg k;
    private bss l;
    private final qcb m;

    public coj(bss bssVar, byd bydVar, qcb qcbVar, cjz cjzVar, crj crjVar, boolean z, bse bseVar) {
        this.l = bssVar;
        this.a = bydVar;
        this.m = qcbVar;
        this.b = cjzVar;
        this.c = crjVar;
        this.d = z;
        this.e = bseVar;
    }

    private final void d() {
        long j = this.g;
        btn cotVar = new cot(j, j, 0L, this.h, this.i, jF());
        if (this.f) {
            cotVar = new coh(cotVar);
        }
        z(cotVar);
    }

    public final void b(long j, cvz cvzVar, boolean z) {
        if (this.j && cvzVar.c()) {
            return;
        }
        this.j = !cvzVar.c();
        if (j == -9223372036854775807L) {
            j = this.g;
        }
        boolean zD = cvzVar.d();
        if (!this.f && this.g == j && this.h == zD && this.i == z) {
            return;
        }
        this.g = j;
        this.h = zD;
        this.i = z;
        this.f = false;
        d();
    }

    @Override // defpackage.cno
    public final cnk c(cnm cnmVar, cra craVar, long j) {
        bye byeVarA = this.a.a();
        bzg bzgVar = this.k;
        if (bzgVar != null) {
            byeVarA.e(bzgVar);
        }
        bsp bspVar = jF().c;
        bspVar.getClass();
        qcb qcbVar = this.m;
        r();
        return new cog(bspVar.a, byeVarA, new ovo(qcbVar.a), this.b, G(cnmVar), this.c, F(cnmVar), this, craVar, bspVar.f, this.d, this.e, bwp.y(bspVar.i));
    }

    @Override // defpackage.cno
    public final synchronized bss jF() {
        return this.l;
    }

    @Override // defpackage.cmi
    protected final void jH(bzg bzgVar) {
        this.k = bzgVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        cfd cfdVarR = r();
        cjz cjzVar = this.b;
        cjzVar.e(looperMyLooper, cfdVarR);
        cjzVar.c();
        d();
    }

    @Override // defpackage.cmi
    protected final void jI() {
        this.b.d();
    }

    @Override // defpackage.cmi, defpackage.cno
    public final synchronized void jJ(bss bssVar) {
        this.l = bssVar;
    }

    @Override // defpackage.cno
    public final void k(cnk cnkVar) {
        cog cogVar = (cog) cnkVar;
        if (cogVar.l) {
            for (con conVar : cogVar.k) {
                conVar.w();
            }
        }
        cogVar.d.e(cogVar);
        cogVar.g.removeCallbacksAndMessages(null);
        cogVar.i = null;
        cogVar.p = true;
    }

    @Override // defpackage.cno
    public final void jG() {
    }
}
