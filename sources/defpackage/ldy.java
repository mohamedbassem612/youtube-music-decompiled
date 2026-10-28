package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ldy implements Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ldy(aaok aaokVar, abri abriVar, int i) {
        this.$cid = i;
        this.b = aaokVar;
        this.a = abriVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.$cid;
        if (i == 0) {
            lfv lfvVar = ((lcn) this.b).a;
            lfvVar.B();
            return lfvVar.v().B((String) this.a);
        }
        if (i == 1) {
            lfv lfvVar2 = ((lcn) this.a).a;
            lfvVar2.B();
            return new lbu(lfvVar2.c(((lbg) this.b).a));
        }
        if (i != 2) {
            wjf wjfVarA = ((abps) ((aaok) this.b).d).a((abri) this.a);
            wjfVarA.getClass();
            return wjfVarA;
        }
        lbg lbgVar = (lbg) this.b;
        String str = lbgVar.a;
        kro.l(str);
        lfv lfvVar3 = (lfv) this.a;
        if (lfvVar3.u(str).o() && lgh.g(lbgVar.s, 100).o()) {
            return lfvVar3.e(lbgVar).x();
        }
        lfvVar3.aT().k.a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }

    public ldy(Object obj, lbg lbgVar, int i) {
        this.$cid = i;
        this.b = lbgVar;
        this.a = obj;
    }

    public ldy(lcn lcnVar, String str, int i) {
        this.$cid = i;
        this.a = str;
        this.b = lcnVar;
    }
}
