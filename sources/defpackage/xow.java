package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xow extends wnn {
    public final Object c;
    public final Object d;
    private final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xow(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar, tqj tqjVar) {
        super(abxvVar, tqjVar.k(1073828827) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        this.e = zwbVar;
        this.d = vxzVar;
        this.c = f(allr.a, wlpVar, new hes(18), new het(16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture a(aihf aihfVar) {
        xov xovVar = new xov(this.b, this.e.e(), aihfVar);
        xovVar.m();
        return ((wnh) this.c).b(xovVar, this.d, null);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zwb] */
    public final wtp b(String str) {
        Object obj = this.e;
        wtp wtpVar = new wtp((String) obj, this.b, this.c.e());
        wtpVar.a = str;
        return wtpVar;
    }

    public final ListenableFuture c(String str, String str2, String str3, Executor executor, alxr alxrVar, alxq alxqVar) {
        wtp wtpVarB = b(str);
        wtpVarB.b = str2;
        wtpVarB.c = str3;
        wtpVarB.d = false;
        if (alxrVar != null) {
            wtpVarB.D = agev.i(alxrVar);
        }
        if (alxqVar != null) {
            wtpVarB.E = agev.i(alxqVar);
        }
        return ((wnh) this.d).b(wtpVarB, executor, null);
    }

    public final alxg d(String str, String str2, String str3) {
        wtp wtpVarB = b(str);
        wtpVarB.b = "";
        wtpVarB.c = str2;
        wtpVarB.e = str3;
        wtpVarB.d = false;
        return (alxg) ((wnh) this.d).c(wtpVarB);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final wog g() {
        return new wog(this.b, this.e.e(), ((vxz) this.d).l(34, 45402343L, false));
    }

    public xow(agev agevVar, wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar) {
        super(abxvVar, tggVar);
        this.c = zwbVar;
        this.d = f(alxg.a, wlpVar, new wql(5), new wre(3));
        this.e = (String) agevVar.e("search/get_suggestions");
    }

    public xow(wlp wlpVar, abxv abxvVar, zwb zwbVar, tgg tggVar, Executor executor) {
        super(abxvVar, tggVar);
        this.e = zwbVar;
        this.d = executor;
        this.c = f(alrg.a, wlpVar, new wql(7), new wre(5));
    }
}
