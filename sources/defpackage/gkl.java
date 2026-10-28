package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkl implements auob, aupg {
    public final boy a;
    final aupr c;
    final aupr d;
    final aupr e;
    final aupr f;
    final aupr g;
    private final ght h;
    private final gkl i = this;
    final aupr b = gjo.a;

    public gkl(ght ghtVar, boy boyVar) {
        this.h = ghtVar;
        this.a = boyVar;
        this.c = new giq(ghtVar, this, 0, 2);
        this.d = new giq(ghtVar, this, 1, 2);
        this.e = new giq(ghtVar, this, 2, 2);
        this.f = new giq(ghtVar, this, 3, 2);
        this.g = new giq(ghtVar, this, 4, 2);
    }

    @Override // defpackage.auob
    public final Map a() {
        return agpn.b;
    }

    @Override // defpackage.auob
    public final Map b() {
        return new aupp(agkj.n("affp", this.c, "afhh", this.d, "afkm", this.e, "aczu", this.f, "afmx", this.g));
    }
}
