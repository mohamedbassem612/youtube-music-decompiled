package defpackage;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class inp {
    public final mbc a;
    public int b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int h = 1;
    public final Set g = EnumSet.noneOf(alxs.class);

    public inp(mbc mbcVar) {
        this.a = mbcVar;
    }

    public final void a(alxs alxsVar) {
        this.g.add(alxsVar);
    }

    public final void b(int i) {
        this.b = Math.max(this.b, i);
    }
}
