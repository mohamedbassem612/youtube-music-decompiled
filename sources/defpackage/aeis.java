package defpackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeis {
    final ScheduledExecutorService a;
    public final aeij b;
    final aeir c;
    final aeir d;
    final aeir e;
    public final aeim f;
    final aeir g;
    public final aeit h;
    public final aeiu i;
    public final Set j = new HashSet();
    public volatile boolean k = false;
    public final AtomicInteger l = new AtomicInteger();
    public volatile int m = 1;
    public volatile long n = 30000;
    final vxz o;
    public final zj p;

    public aeis(zj zjVar, ScheduledExecutorService scheduledExecutorService, vxz vxzVar) {
        this.p = zjVar;
        this.a = scheduledExecutorService;
        this.o = vxzVar;
        aeip aeipVar = new aeip(this);
        this.c = aeipVar;
        if (aeipVar.c != null) {
            throw new IllegalArgumentException("Root state already has a state machine");
        }
        aeij aeijVar = new aeij(aeipVar);
        aeipVar.c = aeijVar;
        this.b = aeijVar;
        aeiq aeiqVar = new aeiq(this);
        this.d = aeiqVar;
        aeik aeikVar = new aeik(this);
        this.e = aeikVar;
        aeim aeimVar = new aeim(this);
        this.f = aeimVar;
        aein aeinVar = new aein(this);
        this.g = aeinVar;
        aeit aeitVar = new aeit(this);
        this.h = aeitVar;
        aeiu aeiuVar = new aeiu(this);
        this.i = aeiuVar;
        aeir[] aeirVarArr = {aeipVar, aeiqVar, aeikVar, aeimVar, aeinVar, aeitVar, aeiuVar};
        for (int i = 0; i < 7; i++) {
            aeirVarArr[i].j();
        }
        this.b.b();
    }

    final boolean a() {
        return this.o.m(11, 45811671L);
    }
}
