package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yb implements za {
    public final Deque a = new ArrayDeque();
    public final xr b;
    public final boc c;

    protected yb(xr xrVar, boc bocVar) {
        this.b = xrVar;
        this.c = bocVar;
        bocVar.b(new yc(this, 1));
    }

    public static final void c(ya yaVar, boolean z) {
        bob bobVar = yaVar.b.d;
        if (bobVar.a(bob.e)) {
            yaVar.a(boa.ON_PAUSE);
        }
        if (bobVar.a(bob.d)) {
            yaVar.a(boa.ON_STOP);
        }
        if (z) {
            yaVar.a(boa.ON_DESTROY);
        }
    }

    public final ya a() {
        afi.a();
        ya yaVar = (ya) this.a.peek();
        yaVar.getClass();
        return yaVar;
    }

    public final void b(ya yaVar, boolean z) {
        this.a.push(yaVar);
        if (z && ((boh) this.c).d.a(bob.c)) {
            yaVar.a(boa.ON_CREATE);
        }
        if (yaVar.b.d.a(bob.c) && ((boh) this.c).d.a(bob.d)) {
            ((ww) this.b.a(ww.class)).a();
            yaVar.a(boa.ON_START);
        }
    }
}
