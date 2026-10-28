package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class efj extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ Runnable d;
    final /* synthetic */ efk e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efj(long j, Runnable runnable, efk efkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = j;
        this.d = runnable;
        this.e = efkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        efj efjVar = new efj(this.c, this.d, this.e, awoqVar);
        efjVar.f = obj;
        return efjVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((efj) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [awut] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r0 = (awut) this.f;
        awox awoxVar = awox.a;
        try {
            if (this.b != 0) {
                Object obj2 = this.a;
                atqp.j(obj);
                r0 = obj2;
            } else {
                atqp.j(obj);
                awos awosVar = r0.b().get(awwd.d);
                awosVar.getClass();
                awwd awwdVar = (awwd) awosVar;
                long j = this.c;
                this.f = null;
                this.a = awwdVar;
                this.b = 1;
                r0 = awwdVar;
                if (avkz.y(j, this) == awoxVar) {
                    return awoxVar;
                }
            }
            this.d.run();
            efk efkVar = this.e;
            Runnable runnable = this.d;
            synchronized (efkVar.b) {
                Map map = efkVar.a;
                if (map.get(runnable) == r0) {
                    map.remove(runnable);
                }
            }
            return awmy.a;
        } catch (Throwable th) {
            efk efkVar2 = this.e;
            Runnable runnable2 = this.d;
            synchronized (efkVar2.b) {
                Map map2 = efkVar2.a;
                if (map2.get(runnable2) == r0) {
                    map2.remove(runnable2);
                }
                throw th;
            }
        }
    }
}
