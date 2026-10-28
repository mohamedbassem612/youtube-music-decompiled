package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class qyf extends cbg {
    final /* synthetic */ qyh a;
    private final Context b;
    private final cgf c;
    private final clu d;
    private final cli e;
    private final AtomicBoolean f;
    private final Runnable g;
    private final qcb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyf(qyh qyhVar, Context context, cgf cgfVar, clu cluVar, cli cliVar, qcb qcbVar, Runnable runnable, AtomicBoolean atomicBoolean) {
        super(context);
        this.a = qyhVar;
        this.b = context;
        this.c = cgfVar;
        this.d = cluVar;
        this.e = cliVar;
        this.h = qcbVar;
        this.f = atomicBoolean;
        this.g = runnable;
    }

    @Override // defpackage.cbg, defpackage.cdt
    public final cdp[] jA(Handler handler, cty ctyVar, cfx cfxVar, cch cchVar, cch cchVar2) {
        cgf cgfVar = this.c;
        qyh qyhVar = this.a;
        qcb qcbVar = this.h;
        qyhVar.j = new qyg(this.b, this.e, this.d, handler, cfxVar, cgfVar, qcbVar, this.g, qyhVar.d, this.f);
        return new cdp[]{qyhVar.j};
    }
}
