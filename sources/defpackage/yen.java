package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yen extends sye {
    public final yfo a;
    public final awmd b;
    public final xeu c;
    public final yha d;
    private final aunn e;
    private final yef f;
    private final mbc g;
    private final zjr h;
    private final afho i;
    private final ahey j;
    private final ahey k;
    private final vxu l;
    private final hed m;

    public yen(vxu vxuVar, hed hedVar, aunn aunnVar, yef yefVar, yfo yfoVar, yha yhaVar, awmd awmdVar, xeu xeuVar, mbc mbcVar, zjr zjrVar, afho afhoVar, ahey aheyVar, ahey aheyVar2) {
        this.l = vxuVar;
        this.m = hedVar;
        this.e = aunnVar;
        this.f = yefVar;
        this.a = yfoVar;
        this.d = yhaVar;
        this.b = awmdVar;
        this.c = xeuVar;
        this.g = mbcVar;
        this.h = zjrVar;
        this.i = afhoVar;
        this.j = aheyVar;
        this.k = aheyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // defpackage.sye
    protected final void a() {
        ajbz ajbzVar;
        boolean z;
        mbc mbcVar = this.g;
        long jD = mbcVar.d();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jC = mbcVar.c() / 1000;
        zjr zjrVar = this.h;
        long j = jC - zjrVar.A;
        zhq zhqVar = zhq.ABR;
        ajvu ajvuVarC = this.l.c();
        ajci ajciVarBn = zik.bn(ajvuVarC);
        int i = 1;
        byte[] bArr = null;
        if (ajciVarBn != null && ajciVarBn.e) {
            hed hedVar = this.m;
            if (ajvuVarC == null) {
                ajbzVar = null;
            } else {
                ajby ajbyVar = ajvuVarC.e;
                if (ajbyVar == null) {
                    ajbyVar = ajby.a;
                }
                if ((ajbyVar.b & 2) == 0) {
                    ajbzVar = null;
                } else {
                    ajby ajbyVar2 = ajvuVarC.e;
                    if (((ajbyVar2 == null ? ajby.a : ajbyVar2).b & 2) != 0) {
                        if (ajbyVar2 == null) {
                            ajbyVar2 = ajby.a;
                        }
                        ajbzVar = ajbyVar2.d;
                        if (ajbzVar == null) {
                            ajbzVar = ajbz.a;
                        }
                    } else {
                        ajbzVar = null;
                    }
                }
            }
            if (ajbzVar == null || (ajbzVar.b & 1) == 0) {
                z = true;
            } else {
                aobg aobgVar = ajbzVar.c;
                if (aobgVar == null) {
                    aobgVar = aobg.a;
                }
                if (aobgVar.b) {
                    z = true;
                } else {
                    z = false;
                }
            }
            hedVar.y(z);
        }
        ((zfs) this.e.io()).f();
        this.f.a();
        if (zjrVar.i.l(452, 45807776L, false)) {
            this.k.execute(afwl.i(new tpo(13)));
        }
        if (!zjrVar.j.m(158, 45477765L)) {
            if (!zjrVar.eI()) {
                jsk jskVar = (jsk) ((agfr) this.b.io()).io();
                if (jskVar instanceof jtc) {
                    jtc jtcVar = (jtc) jskVar;
                    yha yhaVar = this.d;
                    yhaVar.getClass();
                    xxy xxyVar = new xxy(yhaVar, bArr);
                    if (jtcVar.k != null) {
                        throw new IllegalStateException();
                    }
                    synchronized (jtcVar.d) {
                        if (jtcVar.c) {
                            xxyVar.a(jtcVar.j);
                        } else {
                            jtcVar.k = xxyVar;
                        }
                    }
                }
            } else if (this.h.aF()) {
                afho afhoVar = this.i;
                ahey aheyVar = this.j;
                ListenableFuture listenableFutureB = afhoVar.b();
                wuy wuyVar = new wuy(this, 10);
                yqj yqjVar = new yqj(this, i);
                Executor executor = taf.a;
                taa taaVar = new taa(yqjVar, null, wuyVar);
                long j2 = afwl.a;
                listenableFutureB.addListener(new ahei(listenableFutureB, new afwj(afty.c(false), taaVar, 0)), aheyVar);
            } else {
                yfo yfoVar = this.a;
                awmd awmdVar = this.b;
                yha yhaVar2 = this.d;
                yhaVar2.getClass();
                yfoVar.f(awmdVar, new xxy(yhaVar2, bArr), agpr.a);
            }
        }
        long jD2 = (this.g.d() - jD) / 1000;
        xeu xeuVar = this.c;
        zic.k(7, j, xeuVar);
        zic.k(4, jD2, xeuVar);
    }
}
