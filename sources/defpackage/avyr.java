package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avyr extends avxz {
    final avnn b;
    final avnn c;
    final Callable d;

    public avyr(avlp avlpVar, avnn avnnVar, avnn avnnVar2, Callable callable) {
        super(avlpVar);
        this.b = avnnVar;
        this.c = avnnVar2;
        this.d = callable;
    }

    @Override // defpackage.avlm
    protected final void G(avln avlnVar) {
        this.a.F(new avyq(avlnVar, this.b, this.c, this.d));
    }
}
