package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class egi extends awpk implements awqk {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dze e;
    final /* synthetic */ ees f;
    final /* synthetic */ dov g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egi(dze dzeVar, dov dovVar, ees eesVar, awoq awoqVar) {
        super(2, awoqVar);
        this.e = dzeVar;
        this.g = dovVar;
        this.f = eesVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        egi egiVar = new egi(this.e, this.g, this.f, awoqVar);
        egiVar.h = obj;
        return egiVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((egi) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [awox, awwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [awwd] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        CancellationException cancellationException;
        Object obj2;
        ?? r2;
        ?? r1;
        Object obj3;
        awut awutVar = (awut) this.h;
        ?? r3 = awox.a;
        try {
            if (this.d != 0) {
                Object obj4 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                try {
                    atqp.j(obj);
                    r1 = obj4;
                    obj3 = obj3;
                } catch (CancellationException e) {
                    cancellationException = e;
                    r2 = obj3;
                    String str = egn.a;
                    dze dzeVar = this.e;
                    dzf.b();
                    Objects.toString(dzeVar.getClass());
                    int i = ((AtomicInteger) obj2).get();
                    if (r2.isCancelled() || i == -256) {
                        throw cancellationException;
                    }
                    throw new egf(((AtomicInteger) obj2).get());
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    String str2 = egn.a;
                    dze dzeVar2 = this.e;
                    dzf.b();
                    Objects.toString(dzeVar2.getClass());
                    throw th2;
                }
            } else {
                atqp.j(obj);
                AtomicInteger atomicInteger = new AtomicInteger(-256);
                ListenableFuture listenableFutureB = this.e.b();
                listenableFutureB.getClass();
                awwd awwdVarT = awro.t(awutVar, null, 0, new egh(this.g, this.f, atomicInteger, listenableFutureB, (awoq) null, 0), 3);
                try {
                    this.h = null;
                    this.a = atomicInteger;
                    this.b = listenableFutureB;
                    this.c = awwdVarT;
                    this.d = 1;
                    Object objB = yi.b(listenableFutureB, this);
                    if (objB == r3) {
                        return r3;
                    }
                    r1 = awwdVarT;
                    obj = objB;
                    obj2 = atomicInteger;
                    obj3 = listenableFutureB;
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    obj2 = atomicInteger;
                    r2 = listenableFutureB;
                    String str3 = egn.a;
                    dze dzeVar3 = this.e;
                    dzf.b();
                    Objects.toString(dzeVar3.getClass());
                    int i2 = ((AtomicInteger) obj2).get();
                    if (r2.isCancelled()) {
                        throw cancellationException;
                    }
                    throw cancellationException;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    String str4 = egn.a;
                    dze dzeVar4 = this.e;
                    dzf.b();
                    Objects.toString(dzeVar4.getClass());
                    throw th4;
                }
            }
            bbl bblVar = (bbl) obj;
            r1.p(null);
            return bblVar;
        } catch (Throwable th5) {
            r3.p(null);
            throw th5;
        }
    }
}
