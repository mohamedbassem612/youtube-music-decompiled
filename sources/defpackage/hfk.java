package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfk {
    private final ci A;
    public final vxe a;
    public final zwb b;
    public final List c;
    public final abvk d;
    public final abvc e;
    public final hzi f;
    public final jkn g;
    public final Executor h;
    public final jlh i;
    public xgn j;
    public gsg k;
    public Map l;
    public final wqm m;
    public final vxz n;
    public aihh o;
    public final jan p;
    public final jan q;
    public final jan r;
    public qcb s;
    private final jkn t;
    private final tbt u;
    private final awkv v;
    private final awkv w;
    private final tfq x;
    private final vxz y;
    private final jij z;

    public hfk(zwb zwbVar, wqm wqmVar, tbt tbtVar, abvk abvkVar, abvc abvcVar, jan janVar, jan janVar2, jan janVar3, vxe vxeVar, xgn xgnVar, Executor executor, ci ciVar, tfq tfqVar, jij jijVar, hzi hziVar, hfn hfnVar, vxz vxzVar, vxz vxzVar2, jlh jlhVar, awkv awkvVar, awkv awkvVar2) {
        wqmVar.getClass();
        this.m = wqmVar;
        zwbVar.getClass();
        this.b = zwbVar;
        this.h = executor;
        this.c = new ArrayList();
        abvkVar.getClass();
        this.d = abvkVar;
        this.e = abvcVar;
        this.q = janVar;
        this.p = janVar2;
        this.r = janVar3;
        this.a = vxeVar;
        this.j = xgnVar;
        this.A = ciVar;
        this.x = tfqVar;
        this.z = jijVar;
        this.f = hziVar;
        this.t = hfnVar.H();
        this.g = hfnVar.H();
        this.l = null;
        this.u = tbtVar;
        this.n = vxzVar;
        this.y = vxzVar2;
        this.i = jlhVar;
        this.v = awkvVar;
        this.w = awkvVar2;
    }

    private static boolean i(amks amksVar) {
        if (amksVar != null && (amksVar.b & 1) != 0) {
            amlh amlhVar = amksVar.c;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            if (fhz.v(amlhVar)) {
                return true;
            }
        }
        return false;
    }

    public final void a(amlg amlgVar) {
        aihh aihhVar = this.o;
        if (aihhVar == null || (((amks) aihhVar.instance).b & 1) == 0) {
            return;
        }
        if (i((amks) aihhVar.build())) {
            amlh amlhVar = ((amks) aihhVar.instance).c;
            if (amlhVar == null) {
                amlhVar = amlh.a;
            }
            gsf gsfVar = new gsf(amlhVar.d, amlgVar);
            if (this.y.l(213, 45745584L, false)) {
                this.w.kk(gsfVar);
                return;
            } else {
                this.u.e(gsfVar);
                this.w.kk(gsfVar);
                return;
            }
        }
        amlh amlhVar2 = ((amks) aihhVar.instance).c;
        if (amlhVar2 == null) {
            amlhVar2 = amlh.a;
        }
        gsg gsgVar = new gsg(amlhVar2.c, amlgVar);
        if (this.y.l(213, 45745584L, false)) {
            this.v.kk(gsgVar);
        } else {
            this.u.e(gsgVar);
            this.v.kk(gsgVar);
        }
    }

    public final void b() {
        this.u.f(this);
    }

    public final void c(View view, int i) {
        View viewFindViewById = view.findViewById(i);
        List list = this.c;
        ArrayList arrayList = new ArrayList(list);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hfj hfjVar = (hfj) arrayList.get(i2);
            if (hfjVar.b == viewFindViewById) {
                list.remove(hfjVar);
            }
        }
    }

    public final void d() {
        this.u.l(this);
    }

    public final boolean e() {
        if (this.z.b()) {
            return false;
        }
        return this.o == null || !this.x.i();
    }

    public final void f(View view, boolean z) {
        hfj hfjVar = new hfj(view, z);
        g(hfjVar, this.o);
        this.c.add(hfjVar);
    }

    public final void g(hfj hfjVar, aihh aihhVar) {
        if (e()) {
            hfjVar.d(0);
            hfjVar.f(amlg.INDIFFERENT, false);
            hfjVar.b(false);
            return;
        }
        if (aihhVar == null || !((amks) aihhVar.instance).f) {
            hfjVar.d(8);
            return;
        }
        hfjVar.b(true);
        boolean z = hfjVar.a;
        xgn xgnVar = this.j;
        if (z) {
            boolean z2 = hfjVar.c;
            xgnVar.l(new xgj(xhb.b(98173)));
        } else {
            boolean z3 = hfjVar.c;
            xgnVar.l(new xgj(xhb.b(98171)));
        }
        hfjVar.d(0);
        View view = hfjVar.b;
        view.setAlpha(1.0f);
        amlg amlgVar = z ? amlg.DISLIKE : amlg.LIKE;
        boolean z4 = hfjVar.c;
        view.setOnClickListener(new hfh(this, aihhVar, amlgVar));
        if (i((amks) aihhVar.build())) {
            hfjVar.c(yno.ea(aihhVar), false);
        } else {
            hfjVar.f(yno.ea(aihhVar), false);
        }
        if (z || !view.isShown()) {
            return;
        }
        this.A.af(aihhVar.build(), view);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void h(aihh aihhVar, boolean z) {
        this.t.b(new hff((Object) this, (Object) aihhVar, z, (int) (0 == true ? 1 : 0)), aihhVar == null);
    }

    @tcc
    void handleLikePlaylistActionEvent(gsf gsfVar) {
        aihh aihhVar = this.o;
        if (aihhVar != null) {
            amks amksVar = (amks) aihhVar.instance;
            if ((amksVar.b & 1) != 0) {
                String str = gsfVar.a;
                amlh amlhVar = amksVar.c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                if (str.equals(amlhVar.d)) {
                    amlg amlgVar = gsfVar.b;
                    if (yno.ea(aihhVar) != amlgVar) {
                        yno.ec(aihhVar, amlgVar);
                    }
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((hfj) it.next()).c(amlgVar, true);
                    }
                }
            }
        }
    }

    @tcc
    void handleLikeVideoActionEvent(gsg gsgVar) {
        aihh aihhVar = this.o;
        if (aihhVar != null) {
            amks amksVar = (amks) aihhVar.instance;
            if ((amksVar.b & 1) != 0) {
                String str = gsgVar.a;
                amlh amlhVar = amksVar.c;
                if (amlhVar == null) {
                    amlhVar = amlh.a;
                }
                if (TextUtils.equals(str, amlhVar.c)) {
                    this.k = gsgVar;
                    amlg amlgVar = gsgVar.b;
                    if (yno.ea(aihhVar) != amlgVar) {
                        yno.ec(aihhVar, amlgVar);
                    }
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((hfj) it.next()).f(amlgVar, true);
                    }
                    return;
                }
            }
        }
        this.k = null;
    }
}
