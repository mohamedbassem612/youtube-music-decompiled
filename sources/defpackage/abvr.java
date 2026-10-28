package defpackage;

import android.text.TextUtils;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abvr implements abwo {
    public final axsp a;
    public final tbt b;
    public final abpj c;
    public final abwp d;
    public final abwk e;
    public final abmt f;
    public final dxu g;
    private final aboi h;

    public abvr(axsp axspVar, tbt tbtVar, aboi aboiVar, dxu dxuVar, abpj abpjVar, abwp abwpVar, abwk abwkVar, abmt abmtVar) {
        this.a = axspVar;
        this.b = tbtVar;
        this.h = aboiVar;
        this.g = dxuVar;
        this.c = abpjVar;
        this.e = abwkVar;
        this.d = abwpVar;
        this.f = abmtVar;
        tbtVar.a(this, abmi.class, new xfm(this, 2));
        abpjVar.q = this;
    }

    @Override // defpackage.abwo
    public final void a() {
        d(Duration.ofSeconds(-1L), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wjf] */
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
    @Override // defpackage.abwo
    public final void b(xpl xplVar) {
        this.c.h(xplVar.b, null, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [acey, java.lang.Object] */
    public final void c(abnl abnlVar, wgi wgiVar, String str) {
        this.a.kk(new aazm(abnlVar, wgiVar));
        ?? r2 = this.e.d;
        if (r2 == 0 || str == null || !r2.m().au().equals(str)) {
            return;
        }
        r2.m().bi().kk(new aazm(abnlVar, wgiVar));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Type inference failed for: r0v9, types: [acey, java.lang.Object] */
    public final void d(Duration duration, aphs aphsVar) {
        boolean z;
        String strW;
        wjf wjfVar;
        abnl abnlVar;
        abnl abnlVar2;
        aoqv aoqvVarN;
        ?? r0;
        this.g.f();
        abpj abpjVar = this.c;
        String strP = (!abpjVar.h.b(abnw.b) || (r0 = this.e.d) == 0) ? null : r0.p();
        abvq abvqVar = new abvq(this);
        wjf wjfVar2 = abpjVar.m;
        if (abpjVar.r(wjfVar2, "currentPlayerResponse") || wjfVar2 == null) {
            return;
        }
        String str = null;
        abor aborVar = abpjVar.i;
        if (aborVar != null) {
            if ((wjfVar2.t().b & 64) == 0) {
                z = false;
            } else {
                alvk alvkVar = wjfVar2.t().h;
                if (alvkVar == null) {
                    alvkVar = alvk.a;
                }
                if (alvkVar.b == 1024) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (abpjVar.f == null) {
                String str2 = (wjfVar2.t() == null || (aoqvVarN = aaje.n(wjfVar2.t())) == null || (aoqvVarN.b & 2) == 0) ? null : aoqvVarN.d;
                vxz vxzVar = abpjVar.e.g;
                if (!vxzVar.l(166, 45666638L, false) && !abpjVar.h.b(abnw.e) && ((!vxzVar.l(117, 45637331L, false) || (abnlVar2 = abpjVar.k) == null || abnlVar2.O() || !abpjVar.h.b(abnw.d)) && str2 == null && !z)) {
                    abpjVar.e();
                    abnp abnpVar = abpjVar.l;
                    if (abnpVar == null) {
                        abnpVar = abnp.a;
                    }
                    abpjVar.i(strP, abnpVar, abvqVar);
                    return;
                }
                sxw sxwVar = new sxw(new aajq(abpjVar, wjfVar2, 2));
                abpjVar.f = sxwVar;
                abnl abnlVar3 = abpjVar.k;
                if (abnlVar3 != null) {
                    abnk abnkVarF = abnlVar3.f();
                    if (str2 != null) {
                        abnkVarF.u = str2;
                    }
                    String strW2 = abnlVar3.w();
                    if (abpjVar.h.b(abnw.e)) {
                        if (!abpjVar.r(abpjVar.j, "lastFullyLoadedStartDescriptor") && (abnlVar = abpjVar.j) != null) {
                            strW = abnlVar.w();
                            str = strW;
                        }
                    } else if (!abpjVar.h.b(abnw.d)) {
                        abnl abnlVar4 = abpjVar.k;
                        if (abnlVar4 != null) {
                            strW = abnlVar4.w();
                            str = strW;
                        }
                    } else if (!abpjVar.r(abpjVar.a(), "currentPlayerResponse") && (wjfVar = abpjVar.m) != null) {
                        strW = wjfVar.G();
                        str = strW;
                    }
                    if (TextUtils.isEmpty(strW2) && str != null) {
                        abnkVarF.r = str;
                    }
                    abpjVar.d.execute(afwl.i(new aads(abpjVar, aborVar, abnkVarF.a(), strP, duration, aphsVar, sxwVar, 2)));
                }
            }
        }
    }

    public final void e(abnl abnlVar, abnp abnpVar) {
        if (abnlVar == null) {
            zvp.a(zvn.b, zvm.k, "Playbackservice#startRequest called without PlaybackStartDescriptor");
            return;
        }
        acey aceyVarA = this.e.a(abnlVar, abnpVar);
        boolean zP = abnlVar.P();
        abmw abmwVar = abmw.MEDIASESSION;
        this.h.f(!zP);
        String strP = aceyVarA.p();
        this.g.f();
        this.c.j(abnlVar, strP, new abvq(this), abnpVar);
    }
}
