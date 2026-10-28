package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bef {
    final /* synthetic */ axff a;
    final /* synthetic */ awri b;
    final /* synthetic */ awrm c;
    final /* synthetic */ bfp d;

    public bef(axff axffVar, awri awriVar, awrm awrmVar, bfp bfpVar) {
        this.a = axffVar;
        this.b = awriVar;
        this.c = awrmVar;
        this.d = bfpVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b0 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #2 {all -> 0x004d, blocks: (B:19:0x0049, B:32:0x00a8, B:34:0x00b0), top: B:53:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(awqk awqkVar, awoq awoqVar) throws Throwable {
        bee beeVar;
        axff axffVar;
        awri awriVar;
        bfp bfpVar;
        awqk awqkVar2;
        awrm awrmVar;
        axff axffVar2;
        axff axffVar3;
        Object obj;
        if (awoqVar instanceof bee) {
            beeVar = (bee) awoqVar;
            int i = beeVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                beeVar.e = i - Integer.MIN_VALUE;
            } else {
                beeVar = new bee(this, awoqVar);
            }
        } else {
            beeVar = new bee(this, awoqVar);
        }
        Object obj2 = beeVar.c;
        Object obj3 = awox.a;
        int i2 = beeVar.e;
        try {
            if (i2 == 0) {
                atqp.j(obj2);
                axffVar = this.a;
                awriVar = this.b;
                awrm awrmVar2 = this.c;
                bfpVar = this.d;
                beeVar.g = (bdz) awqkVar;
                beeVar.h = (axfi) axffVar;
                beeVar.a = awriVar;
                beeVar.b = awrmVar2;
                beeVar.f = bfpVar;
                beeVar.e = 1;
                if (axffVar.a(beeVar) != obj3) {
                    awqkVar2 = awqkVar;
                    awrmVar = awrmVar2;
                }
                return obj3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = beeVar.b;
                    awrmVar = (awrm) beeVar.a;
                    axffVar2 = beeVar.h;
                    try {
                        atqp.j(obj2);
                        awrmVar.a = obj;
                        obj3 = awrmVar.a;
                        axffVar2.c();
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        axffVar2.c();
                        throw th;
                    }
                }
                bfpVar = (bfp) beeVar.b;
                awrmVar = (awrm) beeVar.a;
                axffVar3 = beeVar.h;
                try {
                    atqp.j(obj2);
                    if (awrc.c(obj2, awrmVar.a)) {
                        axffVar2 = axffVar3;
                        obj3 = awrmVar.a;
                        axffVar2.c();
                    } else {
                        beeVar.g = null;
                        beeVar.h = (axfi) axffVar3;
                        beeVar.a = awrmVar;
                        beeVar.b = obj2;
                        beeVar.e = 3;
                        if (bfpVar.i(obj2, false, beeVar) != obj3) {
                            obj = obj2;
                            axffVar2 = axffVar3;
                            awrmVar.a = obj;
                            obj3 = awrmVar.a;
                            axffVar2.c();
                        }
                    }
                    return obj3;
                } catch (Throwable th2) {
                    th = th2;
                    axffVar2 = axffVar3;
                    axffVar2.c();
                    throw th;
                }
            }
            bfpVar = beeVar.f;
            awrmVar = (awrm) beeVar.b;
            awriVar = (awri) beeVar.a;
            axfi axfiVar = beeVar.h;
            awqkVar2 = beeVar.g;
            atqp.j(obj2);
            axffVar = axfiVar;
            if (awriVar.a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj4 = awrmVar.a;
            beeVar.g = null;
            beeVar.h = (axfi) axffVar;
            beeVar.a = awrmVar;
            beeVar.b = bfpVar;
            beeVar.f = null;
            beeVar.e = 2;
            Object objInvoke = awqkVar2.invoke(obj4, beeVar);
            if (objInvoke != obj3) {
                axffVar3 = axffVar;
                obj2 = objInvoke;
                if (awrc.c(obj2, awrmVar.a)) {
                    beeVar.g = null;
                    beeVar.h = (axfi) axffVar3;
                    beeVar.a = awrmVar;
                    beeVar.b = obj2;
                    beeVar.e = 3;
                    if (bfpVar.i(obj2, false, beeVar) != obj3) {
                        obj = obj2;
                        axffVar2 = axffVar3;
                        awrmVar.a = obj;
                        obj3 = awrmVar.a;
                        axffVar2.c();
                    }
                } else {
                    axffVar2 = axffVar3;
                    obj3 = awrmVar.a;
                    axffVar2.c();
                }
            }
            return obj3;
        } catch (Throwable th3) {
            th = th3;
            axffVar2 = axffVar;
            axffVar2.c();
            throw th;
        }
    }
}
