package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avxa extends avrf {
    final avnn c;
    final int d;

    public avxa(avlh avlhVar, avnn avnnVar, int i) {
        super(avlhVar);
        this.c = avnnVar;
        this.d = i;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        avnn avnnVar = this.c;
        avlh avlhVar = this.b;
        if (JniZero.e(avlhVar, axspVar, avnnVar)) {
            return;
        }
        avlhVar.ap(new avwz(axspVar, avnnVar, this.d));
    }
}
