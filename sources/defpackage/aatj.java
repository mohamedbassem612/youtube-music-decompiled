package defpackage;

import j$.util.Optional;
import java.security.Key;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aatj {
    public final jsk a;
    public Key b;
    public Key c;
    public zgy d;
    public final boolean e;
    private final agfr f;
    private final byb g;
    private final mbc h;
    private final Object i;
    private final ygf j;
    private final Optional k;
    private final zjr l;
    private final tgr m;

    public aatj(agfr agfrVar, jsk jskVar, mbc mbcVar, Object obj, ygf ygfVar, tgr tgrVar, Optional optional, zjr zjrVar, boolean z) {
        this.f = agfrVar;
        this.a = jskVar;
        this.h = mbcVar;
        this.i = obj;
        this.j = ygfVar;
        this.m = tgrVar;
        this.g = new ynt(jskVar, zjrVar);
        this.k = optional;
        this.l = zjrVar;
        this.e = z;
    }

    public final ynw a() {
        Key key = this.b;
        Key key2 = this.c;
        zgy zgyVar = this.d;
        zgyVar.getClass();
        return new ynw(this.f, this.a, key, key2, zgyVar, this.g, this.h, this.i, this.j, this.m, this.k, this.l, this.e);
    }
}
