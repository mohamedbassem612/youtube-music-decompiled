package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class avtq extends avrf {
    public static final /* synthetic */ int f = 0;
    final avnn c;
    final int d;
    final int e;

    public avtq(avlh avlhVar, avnn avnnVar, int i, int i2) {
        super(avlhVar);
        this.c = avnnVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.avlh
    protected final void ar(axsp axspVar) {
        avlh avlhVar = this.b;
        avnn avnnVar = this.c;
        if (JniZero.e(avlhVar, axspVar, avnnVar)) {
            return;
        }
        avlhVar.ap(new avtp(axspVar, avnnVar, this.d, this.e));
    }
}
