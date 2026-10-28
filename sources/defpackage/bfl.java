package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfl extends awpk implements awqk {
    int a;
    final /* synthetic */ bfp b;
    final /* synthetic */ awqk c;
    final /* synthetic */ dqy d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfl(bfp bfpVar, awqk awqkVar, dqy dqyVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = bfpVar;
        this.c = awqkVar;
        this.d = dqyVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bfl bflVar = new bfl(this.b, this.c, this.d, awoqVar);
        bflVar.e = obj;
        return bflVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bfl) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [awye, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awut awutVar = (awut) this.e;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            return obj;
        }
        awuk awukVar = new awuk();
        bfp bfpVar = this.b;
        awqk awqkVar = this.c;
        dqy dqyVar = this.d;
        bgk bgkVarH = bfpVar.g.h();
        axfd axfdVar = new axfd(awqkVar, (awuj) awukVar, bgkVarH instanceof bdw ? new bgc(((bdw) bgkVarH).c) : bgkVarH, awutVar.b(), dqyVar);
        djl djlVar = bfpVar.h;
        Object objJ = djlVar.c.j(axfdVar);
        if (objJ instanceof awyg) {
            Throwable thA = awyi.a(objJ);
            if (thA == null) {
                throw new awyl("Channel was closed normally");
            }
            throw thA;
        }
        if (objJ instanceof awyh) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) ((ci) djlVar.d).a).getAndIncrement() == 0) {
            awro.t(djlVar.a, null, 0, new pvm(djlVar, (awoq) null, 1), 3);
        }
        this.e = null;
        this.a = 1;
        Object objW = awukVar.w(this);
        return objW == awoxVar ? awoxVar : objW;
    }
}
