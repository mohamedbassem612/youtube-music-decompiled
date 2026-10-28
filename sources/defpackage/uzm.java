package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uzm implements val {
    public final zvl a;
    public final uys b;
    public final xpl c;
    private final bog d;
    private final vbk e;

    public uzm(zvl zvlVar, bog bogVar, uys uysVar, xpl xplVar, vbk vbkVar) {
        this.a = zvlVar;
        this.d = bogVar;
        this.b = uysVar;
        this.c = xplVar;
        this.e = vbkVar;
    }

    @Override // defpackage.val
    public final void a(String str, List list, Map map, Function0 function0) {
        function0.invoke();
    }

    @Override // defpackage.val
    public final void b(uzz uzzVar, List list, Map map, Function0 function0) {
        if (this.b.a(uzzVar.a) != null) {
            function0.invoke();
        } else {
            taf.k(this.d, this.e.b(uzzVar), new uny(this, 8), new svm(this, uzzVar, 14, null));
        }
    }

    @Override // defpackage.val
    public final void c(Function0 function0) {
        function0.invoke();
    }

    @Override // defpackage.val
    public final void d(String str, List list, Map map, Function0 function0) {
        function0.invoke();
    }

    public final void f(Throwable th) {
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
        zvjVarA.j = 40;
        zvjVarA.i = 397;
        zvjVarA.d("[Creation][Android][Effects]Error retrieving Xeno assets");
        zvjVarA.f(th);
        this.a.a(zvjVarA.a());
        ahno.ao(new ull(this, 12), taf.a);
    }

    @Override // defpackage.val
    public final void e() {
    }

    @Override // defpackage.val
    public final void g(van vanVar) {
    }
}
