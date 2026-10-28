package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yny {
    public final wjf a;
    public final List b;
    public final long c;
    public final long d;
    public final ynz e;
    public ynw f;
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final Runnable h = new ynx(this);
    public final abqq i;

    public yny(abqq abqqVar, wjf wjfVar, List list, long j, long j2, ynz ynzVar) {
        this.i = abqqVar;
        this.a = wjfVar;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = ynzVar;
    }

    public final synchronized void a(ynw ynwVar) {
        this.f = ynwVar;
    }
}
