package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetl implements aeto {
    public final Set a;
    public volatile boolean b;
    private final avlh c;
    private final avmm d;
    private final avlh e;

    public aetl(avlh avlhVar, Set set) {
        this.c = avlhVar;
        this.a = set;
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        this.e = avlhVar.H(new acpr(new acsc(this, 15), 16)).u(new aeti(new acsc(this, 16), 3)).U(Boolean.FALSE).p().S().ax().b(0, new aeti(new acqe((Object) avmmVar, 4, (char[]) null), 4));
    }

    @Override // defpackage.aeto
    public final avlh a() {
        return this.e;
    }

    @Override // defpackage.aeto
    public final void b() {
        this.d.b();
    }
}
