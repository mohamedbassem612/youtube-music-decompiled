package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgg {
    public final awuj a;
    public List b;
    final /* synthetic */ bfp c;
    private final axff d;
    private final awou e;

    public bgg(bfp bfpVar, List list, awou awouVar) {
        awouVar.getClass();
        this.c = bfpVar;
        this.d = new axfi(false);
        this.a = new awuk();
        this.e = awouVar;
        this.b = atqq.ap(list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [axff] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [axff] */
    /* JADX WARN: Type inference failed for: r0v9, types: [axfi] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [bgg] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [axff] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Object a(awoq awoqVar) throws Throwable {
        bgf bgfVar;
        axff axffVar;
        ?? r6;
        ?? r0;
        if (awoqVar instanceof bgf) {
            bgfVar = (bgf) awoqVar;
            int i = bgfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgfVar.c = i - Integer.MIN_VALUE;
            } else {
                bgfVar = new bgf(this, awoqVar);
            }
        } else {
            bgfVar = new bgf(this, awoqVar);
        }
        Object obj = bgfVar.a;
        Object obj2 = awox.a;
        int i2 = bgfVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                if (this.a.kI()) {
                    return awmy.a;
                }
                axffVar = this.d;
                bgfVar.d = (axfi) axffVar;
                bgfVar.c = 1;
                if (axffVar.a(bgfVar) == obj2) {
                    r6 = axffVar;
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r0 = bgfVar.d;
                    try {
                        atqp.j(obj);
                        r0 = r0;
                        awou awouVar = this.a;
                        awmy awmyVar = awmy.a;
                        ((awwk) awouVar).L(awmyVar);
                        r0.c();
                        obj2 = awmy.a;
                        r6 = awmyVar;
                        r6 = r6;
                        return obj2;
                    } catch (Throwable th) {
                        th = th;
                        r0.c();
                        throw th;
                    }
                }
                axfi axfiVar = bgfVar.d;
                atqp.j(obj);
                r6 = axfiVar;
            }
            r6 = axffVar;
            if (this.a.kI()) {
                obj2 = awmy.a;
                r6.c();
                r6 = r6;
            } else {
                bgfVar.d = (axfi) r6;
                bgfVar.c = 2;
                if (b(bgfVar) != obj2) {
                    r6 = r6;
                    r0 = r6;
                    awou awouVar2 = this.a;
                    awmy awmyVar2 = awmy.a;
                    ((awwk) awouVar2).L(awmyVar2);
                    r0.c();
                    obj2 = awmy.a;
                    r6 = awmyVar2;
                }
            }
            r6 = r6;
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            r0 = r6;
            r0.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    protected final Object b(awoq awoqVar) throws Throwable {
        bed bedVar;
        if (awoqVar instanceof bed) {
            bedVar = (bed) awoqVar;
            int i = bedVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bedVar.b = i - Integer.MIN_VALUE;
            } else {
                bedVar = new bed(this, awoqVar);
            }
        } else {
            bedVar = new bed(this, awoqVar);
        }
        Object obj = bedVar.a;
        awox awoxVar = awox.a;
        int i2 = bedVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                atqp.j(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                atqp.j(obj);
            }
            return awmy.a;
        }
        atqp.j(obj);
        bedVar.b = 1;
        obj = null;
        awou awouVar = this.e;
        beh behVar = new beh(this.c, (dqy) obj, this, (awoq) null, 0);
        bedVar.b = 2;
        if (awro.p(awouVar, behVar, bedVar) == awoxVar) {
            return awoxVar;
        }
        return awmy.a;
    }
}
