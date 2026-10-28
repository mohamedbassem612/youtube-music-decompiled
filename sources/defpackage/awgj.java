package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awgj extends awks {
    final awks a;
    final avmb b;
    final int c;

    public awgj(awks awksVar, avmb avmbVar, int i) {
        this.a = awksVar;
        this.b = avmbVar;
        this.c = i;
    }

    @Override // defpackage.awks
    public final int a() {
        return ((awga) this.a).b;
    }

    final void b(int i, axsp[] axspVarArr, axsp[] axspVarArr2, avma avmaVar) {
        axsp axspVar = axspVarArr[i];
        int i2 = this.c;
        awif awifVar = new awif(i2);
        if (axspVar instanceof avok) {
            axspVarArr2[i] = new awgh((avok) axspVar, i2, awifVar, avmaVar);
        } else {
            axspVarArr2[i] = new awgi(axspVar, i2, awifVar, avmaVar);
        }
    }
}
