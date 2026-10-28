package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agpq extends agku {
    static final agpq a = new agpq(new agpc());
    final transient agpc b;
    private final transient int c;

    public agpq(agpc agpcVar) {
        this.b = agpcVar;
        long jC = 0;
        for (int i = 0; i < agpcVar.c; i++) {
            jC += (long) agpcVar.c(i);
        }
        this.c = ahng.P(jC);
    }

    @Override // defpackage.agow
    public final int a(Object obj) {
        return this.b.b(obj);
    }

    @Override // defpackage.agku, defpackage.agow
    public final /* synthetic */ Set i() {
        return new agpo(this);
    }

    @Override // defpackage.agjw
    public final boolean l() {
        return false;
    }

    @Override // defpackage.agku
    public final agkz n() {
        return new agpo(this);
    }

    @Override // defpackage.agku
    public final agox p(int i) {
        return this.b.m(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.agow
    public final int size() {
        return this.c;
    }

    @Override // defpackage.agku, defpackage.agjw
    public Object writeReplace() {
        return new agpp(this);
    }
}
