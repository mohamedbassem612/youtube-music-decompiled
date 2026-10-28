package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awbg extends awav {
    final avnn b;
    final int c;
    final int d;

    public awbg(avlu avluVar, avnn avnnVar, int i, int i2) {
        super(avluVar);
        this.b = avnnVar;
        this.d = i2;
        this.c = Math.max(8, i);
    }

    @Override // defpackage.avlr
    public final void e(avlw avlwVar) {
        avlu avluVar = this.a;
        avnn avnnVar = this.b;
        if (JniZero.c(avluVar, avlwVar, avnnVar)) {
            return;
        }
        int i = this.d;
        if (i == 1) {
            avluVar.ak(new awbf(new awkr(avlwVar), avnnVar, this.c));
        } else {
            avluVar.ak(new awbd(avlwVar, avnnVar, this.c, i == 3));
        }
    }
}
