package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aetj implements aeto {
    public final int a;
    public volatile boolean b;
    public final AtomicInteger c;
    private final aeto d;
    private final avmm e;
    private final avlh f;

    public aetj(aeto aetoVar, int i) {
        this.d = aetoVar;
        this.a = i;
        avmm avmmVar = new avmm();
        this.e = avmmVar;
        this.c = new AtomicInteger(0);
        this.f = ((aetg) aetoVar).b.p().H(new acpr(new acsc(this, 13), 15)).u(new aeti(new acsc(this, 14), 1)).p().S().ax().b(0, new aeti(new acqe((Object) avmmVar, 3, (char[]) null), 0));
    }

    @Override // defpackage.aeto
    public final avlh a() {
        return this.f;
    }

    @Override // defpackage.aeto
    public final void b() {
        this.d.b();
        this.e.b();
    }
}
