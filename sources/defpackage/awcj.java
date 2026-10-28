package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awcj extends awav {
    final avnn b;
    final boolean c;
    final int d;
    final int e;

    public awcj(avlu avluVar, avnn avnnVar, boolean z, int i, int i2) {
        super(avluVar);
        this.b = avnnVar;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        avnn avnnVar = this.b;
        avlu avluVar = this.a;
        if (JniZero.c(avluVar, avlwVar, avnnVar)) {
            return;
        }
        avluVar.ak(new awci(avlwVar, avnnVar, this.c, this.d, this.e));
    }
}
