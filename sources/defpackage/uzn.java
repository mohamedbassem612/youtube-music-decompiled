package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzn extends awpk implements awqk {
    int a;
    final /* synthetic */ uzt b;
    final /* synthetic */ List c;
    final /* synthetic */ usd d;
    final /* synthetic */ List e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzn(uzt uztVar, List list, usd usdVar, List list2, awoq awoqVar) {
        super(2, awoqVar);
        this.b = uztVar;
        this.c = list;
        this.d = usdVar;
        this.e = list2;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        uzn uznVar = new uzn(this.b, this.c, this.d, this.e, awoqVar);
        uznVar.f = obj;
        return uznVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((uzn) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:17:0x0040, B:19:0x0044, B:25:0x007f), top: B:31:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007f A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:17:0x0040, B:19:0x0044, B:25:0x007f), top: B:31:0x0040 }] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awwd awwdVar;
        Throwable th;
        awox awoxVar = awox.a;
        if (this.a != 0) {
            awwdVar = (awwd) this.f;
            try {
                atqp.j(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!(th instanceof CancellationException)) {
                        throw th;
                    }
                    twu.d("CompEffectsReconciler", 6, "Reconciler: Failed to reconcile declarative effects composition.", th);
                    uzt uztVar = this.b;
                    zvl zvlVar = uztVar.d;
                    zvj zvjVarA = zvk.a();
                    zvjVarA.j = 40;
                    zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
                    zvjVarA.d("Failed to reconcile declarative effects composition.");
                    zvjVarA.f(th);
                    zvlVar.a(zvjVarA.a());
                    uztVar.g = awno.a;
                } catch (Throwable th3) {
                    uzt uztVar2 = this.b;
                    if (uztVar2.f == awwdVar) {
                        uztVar2.r();
                        uztVar2.h = null;
                    }
                    throw th3;
                }
            }
        } else {
            atqp.j(obj);
            awwd awwdVar2 = (awwd) ((awut) this.f).b().get(awwd.d);
            try {
                uzt uztVar3 = this.b;
                List list = this.c;
                usd usdVar = this.d;
                this.f = awwdVar2;
                this.a = 1;
                if (uztVar3.m(list, usdVar, this) == awoxVar) {
                    return awoxVar;
                }
                awwdVar = awwdVar2;
            } catch (Throwable th4) {
                awwdVar = awwdVar2;
                th = th4;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                twu.d("CompEffectsReconciler", 6, "Reconciler: Failed to reconcile declarative effects composition.", th);
                uzt uztVar4 = this.b;
                zvl zvlVar2 = uztVar4.d;
                zvj zvjVarA2 = zvk.a();
                zvjVarA2.j = 40;
                zvjVarA2.c(ajtv.ERROR_LEVEL_ERROR);
                zvjVarA2.d("Failed to reconcile declarative effects composition.");
                zvjVarA2.f(th);
                zvlVar2.a(zvjVarA2.a());
                uztVar4.g = awno.a;
            }
        }
        this.b.g = this.e;
        uzt uztVar5 = this.b;
        if (uztVar5.f == awwdVar) {
            uztVar5.r();
            uztVar5.h = null;
        }
        return awmy.a;
    }
}
