package defpackage;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qjk {
    static final qjl a = new qiw(axhi.a, true);
    private final Random b;
    private final ahbw c;
    private final qiv d;

    public qjk(Random random) {
        this.b = random;
        this.d = null;
        this.c = null;
    }

    public final qjl a(axhi axhiVar) {
        ahbw ahbwVar;
        int iBt = a.bt(axhiVar.e);
        if (iBt == 0) {
            iBt = 1;
        }
        int i = iBt - 1;
        if (i == 1) {
            return new qiz(axhiVar, qjj.b(axhiVar).d());
        }
        if (i == 3) {
            return new qjc(axhiVar, this.b.nextDouble());
        }
        if (i != 4) {
            return new qiw(axhiVar, true);
        }
        qiv qivVar = this.d;
        return (qivVar == null || (ahbwVar = this.c) == null) ? a : new qiy(axhiVar, qjj.b(axhiVar), this.b, qivVar, ahbwVar);
    }

    public qjk(Random random, qiv qivVar, ahbw ahbwVar) {
        this.b = random;
        this.c = ahbwVar;
        this.d = qivVar;
    }
}
