package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afyc extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ awqk c;
    final /* synthetic */ ahub d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afyc(ahub ahubVar, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = ahubVar;
        this.c = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        afyc afycVar = new afyc(this.d, this.c, awoqVar);
        afycVar.e = obj;
        return afycVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((afyc) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        axff axffVar;
        awox awoxVar = awox.a;
        int i = this.b;
        if (i == 0) {
            atqp.j(obj);
            awrc.M((awut) this.e);
            ahub ahubVar = this.d;
            awqk awqkVar = this.c;
            Object obj2 = ahubVar.a;
            this.e = obj2;
            this.a = awqkVar;
            this.b = 1;
            if (JniZero.n(afyb.a, obj2, this) == awoxVar) {
                return awoxVar;
            }
            JniZero.q(this).resumeWith(awmy.a);
            return awoxVar;
        }
        if (i != 1) {
            axffVar = (axff) this.e;
            try {
                atqp.j(obj);
                axffVar.c();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                axffVar.c();
                throw th;
            }
        }
        ?? r1 = this.a;
        axff axffVar2 = (axff) this.e;
        atqp.j(obj);
        try {
            this.e = axffVar2;
            this.a = null;
            this.b = 2;
            obj = awrc.J(r1, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            axffVar = axffVar2;
            axffVar.c();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            axffVar = axffVar2;
            axffVar.c();
            throw th;
        }
    }
}
