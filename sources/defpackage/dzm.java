package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dzm implements aqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dzm(Executor executor, String str, Function0 function0, int i) {
        this.$cid = i;
        this.a = executor;
        this.c = str;
        this.b = function0;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, wnf] */
    @Override // defpackage.aqk
    public final Object a(aqi aqiVar) {
        int i = this.$cid;
        int i2 = 0;
        if (i == 0) {
            this.a.execute(new dzn(this.b, this.c, aqiVar, i2));
            return awmy.a;
        }
        if (i != 1) {
            rqd rqdVar = new rqd(aqiVar, 2);
            this.b.c((wlu) this.c, (wne) this.a, rqdVar);
            return "ContinuationService.sendContinuation";
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aqiVar.a(new px(atomicBoolean, 9), dyu.INSTANCE);
        this.a.execute(new dzn((Object) atomicBoolean, (Object) aqiVar, this.b, 1, (byte[]) null));
        return this.c;
    }

    public /* synthetic */ dzm(Executor executor, Function0 function0, bop bopVar, int i) {
        this.$cid = i;
        this.a = executor;
        this.b = function0;
        this.c = bopVar;
    }

    public /* synthetic */ dzm(wnf wnfVar, wlu wluVar, wne wneVar, int i) {
        this.$cid = i;
        this.b = wnfVar;
        this.c = wluVar;
        this.a = wneVar;
    }
}
