package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awfb extends awav {
    final avnn b;
    final int c;

    public awfb(avlu avluVar, avnn avnnVar, int i) {
        super(avluVar);
        this.b = avnnVar;
        this.c = i;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        avnn avnnVar = this.b;
        avlu avluVar = this.a;
        if (JniZero.c(avluVar, avlwVar, avnnVar)) {
            return;
        }
        avluVar.ak(new awfa(avlwVar, avnnVar, this.c));
    }
}
