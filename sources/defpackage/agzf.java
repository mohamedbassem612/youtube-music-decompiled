package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agzf implements awqg {
    private final axff a = new axfi(false);
    private aext b;

    public agzf(awqg awqgVar) {
        this.b = new agzg(awqgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(awoq awoqVar) throws Throwable {
        agze agzeVar;
        axff axffVar;
        axff axffVar2;
        if (awoqVar instanceof agze) {
            agzeVar = (agze) awoqVar;
            int i = agzeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                agzeVar.c = i - Integer.MIN_VALUE;
            } else {
                agzeVar = new agze(this, awoqVar);
            }
        } else {
            agzeVar = new agze(this, awoqVar);
        }
        Object obj = agzeVar.a;
        Object obj2 = awox.a;
        int i2 = agzeVar.c;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                axffVar = this.a;
                agzeVar.d = (axfi) axffVar;
                agzeVar.c = 1;
                if (axffVar.a(agzeVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                axffVar2 = agzeVar.d;
                try {
                    atqp.j(obj);
                    this.b = new agzd(obj);
                    obj2 = obj;
                    axffVar = axffVar2;
                    axffVar.c();
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    axffVar2.c();
                    throw th;
                }
            }
            axfi axfiVar = agzeVar.d;
            atqp.j(obj);
            axffVar = axfiVar;
            aext aextVar = this.b;
            int iG = aext.g(aextVar);
            if (iG == 0) {
                obj2 = ((agzd) aextVar).a;
                axffVar.c();
            } else {
                if (iG != 1) {
                    throw new awmj();
                }
                awqg awqgVar = ((agzg) aextVar).a;
                agzeVar.d = (axfi) axffVar;
                agzeVar.c = 2;
                Object objInvoke = awqgVar.invoke(agzeVar);
                if (objInvoke != obj2) {
                    axffVar2 = axffVar;
                    obj = objInvoke;
                    this.b = new agzd(obj);
                    obj2 = obj;
                    axffVar = axffVar2;
                    axffVar.c();
                }
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            axffVar2 = axffVar;
            axffVar2.c();
            throw th;
        }
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        awoq awoqVar = (awoq) obj;
        aext aextVar = this.b;
        int iG = aext.g(aextVar);
        if (iG == 0) {
            return ((agzd) aextVar).a;
        }
        if (iG == 1) {
            return a(awoqVar);
        }
        throw new awmj();
    }
}
