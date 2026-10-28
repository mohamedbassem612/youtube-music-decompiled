package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class omp implements aupn {
    private final /* synthetic */ int $cid;
    private final aupr a;
    private final aupr b;
    private final aupr c;
    private final aupr d;
    private final aupr e;
    private final aupr f;

    public omp(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, int i) {
        this.$cid = i;
        this.a = auprVar;
        this.b = auprVar2;
        this.c = auprVar3;
        this.d = auprVar4;
        this.e = auprVar5;
        this.f = auprVar6;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* synthetic */ Object io() {
        if (this.$cid == 0) {
            ((omk) this.a).io();
            omj omjVar = (omj) this.b.io();
            qnl qnlVar = (qnl) this.c.io();
            qrx qrxVar = (qrx) this.d.io();
            Executor executor = (Executor) this.e.io();
            return new olq(omjVar, qnlVar, qrxVar, executor);
        }
        return new odj((fxg) ((aupo) this.d).b, (ocu) this.a.io(), (obb) ((aupo) this.f).b, (Context) ((aupo) this.b).b, (Map) ((aupo) this.e).b, (omj) this.c.io());
    }

    public omp(aupr auprVar, aupr auprVar2, aupr auprVar3, aupr auprVar4, aupr auprVar5, aupr auprVar6, int i, byte[] bArr) {
        this.$cid = i;
        this.d = auprVar;
        this.a = auprVar2;
        this.f = auprVar3;
        this.b = auprVar4;
        this.e = auprVar5;
        this.c = auprVar6;
    }
}
