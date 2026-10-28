package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class abwr implements avll {
    public final /* synthetic */ int a;

    public /* synthetic */ abwr(int i) {
        this.a = i;
    }

    @Override // defpackage.avll
    public final axso a(avlh avlhVar) {
        int i = this.a;
        if (i == 1) {
            avmb avmbVar = avmh.a;
            JniZero.a(avmbVar);
            return avlhVar.L(avmbVar);
        }
        if (i != 2) {
            return avlhVar;
        }
        avmb avmbVar2 = awlg.b;
        avnn avnnVar = atqp.g;
        return avlhVar.L(avmbVar2);
    }
}
