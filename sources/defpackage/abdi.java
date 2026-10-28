package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abdi implements abea {
    public static final abdj g = new abdj(agke.q(xhb.b(22156)), agke.t(xhb.b(28239), xhb.b(28240), xhb.b(123454), xhb.b(123453)));
    public final boolean a;
    public final boolean b;
    public abdx c;

    @Deprecated
    public xgn d;
    public String e;
    public abdy f;
    public final abjf h;
    private final Map i;
    private final avmm j;
    private final abdw k;
    private final abvn l;
    private abec m;
    private ajwo n;
    private abdj o;
    private final abxv p;
    private final ci q;
    private ci r;

    public abdi(abjf abjfVar, vxz vxzVar, abdw abdwVar, abxv abxvVar, awmd awmdVar, abvn abvnVar) {
        this.h = abjfVar;
        this.k = abdwVar;
        this.p = abxvVar;
        this.l = abvnVar;
        ci ciVar = new ci((Object) awmdVar, (byte[]) null);
        this.q = ciVar;
        this.r = ciVar;
        this.a = vxzVar.l(3, 45353628L, false);
        this.b = vxzVar.l(39, 45801907L, false);
        this.i = new ConcurrentHashMap();
        this.o = g;
        this.d = xgn.l;
        this.j = new avmm();
        t(this.r.aq());
    }

    private static Optional s(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite);
        if (!ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            return Optional.empty();
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(arik.a);
        ajwoVar.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
        return Optional.of(((arij) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).d);
    }

    @Deprecated
    private final void t(xgn xgnVar) {
        if (this.d != xgnVar) {
            l(false);
            this.d = xgnVar;
            abjf abjfVar = this.h;
            xgnVar.getClass();
            abjfVar.b = xgnVar;
        }
    }

    private final void u() {
        this.j.b();
    }

    @Override // defpackage.abea
    public final xgn a() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Deprecated
    public final xhy b(ajwo ajwoVar) {
        xhy xhwVar;
        xgn xgnVar = this.d;
        xgt xgtVarA = this.o.a(xgnVar, ajwoVar, this.m);
        m(abdy.b);
        if (xgtVarA == null) {
            String simpleName = ajwoVar == null ? "null" : ajwoVar.getClass().getSimpleName();
            zvp.a(zvn.b, zvm.z, "DefaultWatchInteractionLoggingController: Failed to log new screen when setting video. navigationEndpoint=" + simpleName + ", watchScreenInteractionLoggingBehavior=" + this.o.getClass().getSimpleName());
            xhwVar = xgnVar;
        } else {
            abxv abxvVar = this.p;
            xgo xgoVar = (xgo) abxvVar.b.io();
            xgoVar.getClass();
            xpl xplVar = (xpl) abxvVar.a.io();
            xplVar.getClass();
            Executor executor = (Executor) abxvVar.c.io();
            executor.getClass();
            xhwVar = new xhw(xgoVar, xplVar, abxvVar.d, executor, xgtVarA);
        }
        this.n = ajwoVar;
        this.m = null;
        return xhwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xhy] */
    public final xhz c(xhy xhyVar, wjf wjfVar, String str) {
        return aawo.b(xhyVar, this.h.b, new abbj(this, 2), wjfVar, str, null);
    }

    @Override // defpackage.abea
    public final abdy d() {
        return this.f;
    }

    @Override // defpackage.abea
    public final void e(abdz abdzVar) {
        this.i.put(abdzVar, Boolean.TRUE);
    }

    @Override // defpackage.abea
    public final void f() {
        u();
        if (this.c == null) {
            this.c = this.k.a(this);
        }
        avmm avmmVar = this.j;
        abvn abvnVar = this.l;
        int i = 1;
        avmmVar.e(((avlh) abvnVar.r().a).i(aawb.y(abvnVar.X(), 512L)).i(new abwr(i)).al(new aawl(new aawi(this, 12), "DWILC", 1), new abeq(i)), abvnVar.P().i(aawb.y(abvnVar.X(), 512L)).i(new abwr(i)).al(new aawi(this, 13), new abeq(i)), abvnVar.N().i(aawb.y(abvnVar.X(), 512L)).i(new abwr(i)).al(new aawi(this, 14), new abeq(i)));
    }

    final void g(wjf wjfVar, String str) {
        xgn xgnVar = this.d;
        if (TextUtils.isEmpty(str)) {
            str = this.e;
        }
        c(xgnVar, wjfVar, str);
    }

    @Deprecated
    public final void h(xhy xhyVar, ajwo ajwoVar, ajwo ajwoVar2) {
        if (Objects.equals(ajwoVar, ajwoVar2)) {
            return;
        }
        if (ajwoVar2 == null) {
            abvk abvkVarO = this.l.o();
            ajwoVar2 = aboc.h(abvkVarO.n(), abvkVarO.m(), abvkVarO.b());
        }
        if (abnn.j(ajwoVar, ajwoVar2)) {
            return;
        }
        xhyVar.t();
    }

    @Override // defpackage.abea
    public final void i() {
        u();
        this.h.b();
        this.d.B();
        l(false);
        this.r = this.q;
        this.i.clear();
        t(this.r.aq());
    }

    @Override // defpackage.abea
    public final void j(abdz abdzVar) {
        this.i.remove(abdzVar);
    }

    @Override // defpackage.abea
    public final void k(ajwo ajwoVar) {
        l(p(ajwoVar));
    }

    final void l(boolean z) {
        if (!z) {
            this.n = null;
            this.e = null;
        }
        xgn xgnVar = this.d;
        if (xgnVar != null) {
            this.h.b();
            xgnVar.B();
        }
        m(abdy.a);
    }

    public final void m(abdy abdyVar) {
        this.f = abdyVar;
        Iterator it = this.i.keySet().iterator();
        while (it.hasNext()) {
            ((abdz) it.next()).hn(abdyVar);
        }
    }

    @Override // defpackage.abea
    public final void n(abec abecVar) {
        this.m = abecVar;
    }

    final boolean o(ajwo ajwoVar) {
        ajwo ajwoVar2;
        return this.f == abdy.a || (ajwoVar2 = this.n) == null || !ajwoVar2.equals(ajwoVar);
    }

    final boolean p(ajwo ajwoVar) {
        ajwo ajwoVar2 = this.n;
        if (ajwoVar2 == null || ajwoVar == null) {
            return false;
        }
        Optional optionalS = s(ajwoVar2);
        Optional optionalS2 = s(ajwoVar);
        if (optionalS.isPresent() && optionalS2.isPresent()) {
            return ((String) optionalS.get()).equals(optionalS2.get());
        }
        return false;
    }

    @Override // defpackage.abea
    public final void q(abdj abdjVar) {
        abdjVar.getClass();
        this.o = abdjVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xhy] */
    public final void r(xhy xhyVar, wgi wgiVar, String str) {
        aawo.c(xhyVar, this.h.b, new abbj(this, 3), wgiVar, str, null);
    }
}
