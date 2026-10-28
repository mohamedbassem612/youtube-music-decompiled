package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class sxg extends sye {
    private final awmd a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;
    private final tqj g;
    private final Executor h;
    private final Optional i;
    private final vxz j;

    public sxg(Executor executor, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, tqj tqjVar, vxz vxzVar, Optional optional) {
        this.h = executor;
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        this.f = awmdVar6;
        this.g = tqjVar;
        this.j = vxzVar;
        this.i = optional;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.sye
    protected final void a() {
        boolean z = ((aedj) this.f.io()).a;
        this.b.io();
        tao taoVar = (tao) this.d.io();
        int i = tqr.a;
        if ((this.g.a(1074007586) & 1) == 0 && ((Boolean) this.a.io()).booleanValue()) {
            ayq ayqVar = (ayq) this.c.io();
            if (taoVar.d().f) {
                ayqVar.O((Executor) this.e.io());
            } else {
                ayqVar.O(this.h);
            }
        }
        if (this.j.l(136, 45620953L, false)) {
            Optional optional = this.i;
            optional.isPresent();
            avni avniVar = (avni) Optional.ofNullable((avni) optional.get().io()).orElse(new jop(6));
            boolean z2 = atqp.w;
            atqp.a = avniVar;
        }
    }
}
