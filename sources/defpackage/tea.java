package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tea implements tcr, tcq, tct, tcs {
    public final awmd a;
    public volatile boolean b;
    public final teq c;
    public final oml d;
    private final mbc e;
    private final ahey f;
    private final avmb g;
    private volatile ListenableFuture h;
    private volatile ListenableFuture i;
    private final rnj j;

    public tea(teq teqVar, awmd awmdVar, mbc mbcVar, ahey aheyVar, avmb avmbVar, avmb avmbVar2, oml omlVar, rnj rnjVar) {
        teqVar.getClass();
        awmdVar.getClass();
        mbcVar.getClass();
        aheyVar.getClass();
        avmbVar.getClass();
        avmbVar2.getClass();
        omlVar.getClass();
        rnjVar.getClass();
        this.c = teqVar;
        this.a = awmdVar;
        this.e = mbcVar;
        this.f = aheyVar;
        this.g = avmbVar2;
        this.d = omlVar;
        this.j = rnjVar;
        ((tdd) omlVar.b).a(this);
        int i = 2;
        if (omlVar.i() == 2) {
            c();
            d();
        }
        ((avlr) rnjVar.a).H().O(avmbVar2).af(new sqk(new rla(this, i), 15));
    }

    private final void c() {
        tec tecVar;
        tec tecVar2 = null;
        if (this.h == null) {
            Object objIo = this.a.io();
            objIo.getClass();
            rnj rnjVar = (rnj) objIo;
            if (rnjVar.l()) {
                if (rnjVar.l()) {
                    vxz vxzVar = (vxz) rnjVar.a;
                    tecVar = new tec(vxzVar.c(69, 45807488L, 10L) * 1000, awro.e(vxzVar.c(70, 45807489L, 85L) / 100.0d, 0.0d, 1.0d));
                } else {
                    tecVar = null;
                }
                if (tecVar != null && tecVar.a > 0) {
                    tecVar2 = tecVar;
                }
            }
        }
        if (tecVar2 != null) {
            this.h = ahno.aj(new sxk(this, tecVar2, 4), 0L, tecVar2.a, TimeUnit.MILLISECONDS, this.e, this.f);
        }
    }

    private final void d() {
        ted tedVar;
        ted tedVar2 = null;
        if (this.i == null) {
            Object objIo = this.a.io();
            objIo.getClass();
            rnj rnjVar = (rnj) objIo;
            if (rnjVar.m()) {
                if (rnjVar.m()) {
                    vxz vxzVar = (vxz) rnjVar.a;
                    tedVar = new ted(vxzVar.c(72, 45822952L, 30L) * 1000, (int) vxzVar.c(73, 45822953L, 3000L), (int) vxzVar.c(85, 45848339L, 0L), (int) vxzVar.c(83, 45844178L, 350L), (int) vxzVar.c(84, 45844179L, 500L));
                } else {
                    tedVar = null;
                }
                if (tedVar != null && tedVar.a > 0) {
                    tedVar2 = tedVar;
                }
            }
        }
        if (tedVar2 != null) {
            this.i = ahno.aj(new sxk(this, tedVar2, 5), 0L, tedVar2.a, TimeUnit.MILLISECONDS, this.e, this.f);
        }
    }

    @Override // defpackage.tcr
    public final void a() {
        c();
        d();
    }

    @Override // defpackage.tct
    public final void b(int i) {
        tew tewVar;
        int i2 = 5;
        if (i == 5 || i == 10) {
            tewVar = tew.b;
        } else if (i == 15) {
            tewVar = tew.c;
        } else if (i != 20) {
            tewVar = (i == 40 || i == 60 || i == 80) ? tew.e : null;
        } else {
            tewVar = tew.d;
        }
        if (tewVar != null) {
            if (i == 5) {
                i2 = 7;
            } else if (i == 10) {
                i2 = 6;
            } else if (i != 15) {
                if (i == 20) {
                    i2 = 4;
                } else if (i == 40) {
                    i2 = 3;
                } else if (i != 60) {
                    i2 = i != 80 ? 0 : 1;
                } else {
                    i2 = 2;
                }
            }
            this.c.j(tewVar, i2);
        }
    }

    @Override // defpackage.tcq
    public final void t() {
        ListenableFuture listenableFuture = this.h;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
        }
        this.h = null;
        ListenableFuture listenableFuture2 = this.i;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(false);
        }
        this.i = null;
        if (this.b && ((vxz) ((rnj) this.a.io()).a).l(212, 45814560L, false)) {
            this.c.j(tew.d, 12);
        }
    }
}
