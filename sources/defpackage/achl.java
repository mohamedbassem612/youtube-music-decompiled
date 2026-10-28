package defpackage;

import app.rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class achl implements Runnable {
    public ScheduledFuture a;
    public final List b = new ArrayList();
    public boolean c;
    public final acho d;
    final /* synthetic */ achr e;
    private int f;

    public achl(achr achrVar, achq achqVar) {
        this.e = achrVar;
        this.d = new acho(achqVar);
    }

    public final void a() {
        this.d.a = true;
        this.f = 0;
        this.c = false;
        ScheduledFuture scheduledFuture = this.a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.a = null;
        }
        this.b.clear();
    }

    public final boolean b() {
        ScheduledFuture scheduledFuture;
        return (this.d.a || (scheduledFuture = this.a) == null || scheduledFuture.isDone()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        alvl alvlVar;
        ajwo ajwoVar;
        achq achqVar;
        acib acibVar;
        taq.c();
        acho achoVar = this.d;
        if (achoVar.a) {
            return;
        }
        achr achrVar = this.e;
        if (achrVar.I() && achrVar.f) {
            this.c = true;
            return;
        }
        boolean z = false;
        this.c = false;
        awmd awmdVar = achrVar.b;
        wqh wqhVarA = ((achm) awmdVar.io()).a();
        wqhVarA.G(achoVar.b);
        wqhVarA.o(achoVar.d);
        achn achnVar = (achn) wqhVarA;
        achnVar.e = this.b;
        achnVar.D = achoVar.e;
        achnVar.E = achoVar.j;
        abmt abmtVar = achrVar.c;
        if (abmtVar.bU() && (acibVar = achrVar.k) != null) {
            Iterator it = ((acfg) acibVar).B.d.iterator();
            while (it.hasNext()) {
                ((acii) it.next()).q();
            }
        }
        if (abmtVar.bL() && (achqVar = achrVar.e) != null && achqVar.k) {
            z = true;
        }
        if (abmtVar.bk() || z) {
            wqhVarA.F(this.f);
        }
        aboe aboeVar = null;
        alve alveVar = null;
        try {
            alus alusVarB = ((achm) awmdVar.io()).b(wqhVarA);
            this.f++;
            acho achoVar2 = this.d;
            if (alusVarB == null) {
                achoVar2.c = null;
                achoVar2.f = null;
                achoVar2.m = agpi.a;
                achoVar2.g = null;
                achoVar2.i = null;
                achoVar2.k = null;
                achoVar2.l = null;
                achoVar2.h = null;
            } else {
                if ((alusVarB.b & 2) != 0) {
                    alvlVar = alusVarB.d;
                    if (alvlVar == null) {
                        alvlVar = alvl.a;
                    }
                } else {
                    alvlVar = null;
                }
                achoVar2.c = alvlVar;
                if ((alusVarB.b & 16) != 0) {
                    ajwoVar = alusVarB.e;
                    if (ajwoVar == null) {
                        ajwoVar = ajwo.a;
                    }
                } else {
                    ajwoVar = null;
                }
                achoVar2.f = ajwoVar;
                if (!alusVarB.j.isEmpty()) {
                    achoVar2.m = alusVarB.j;
                } else if (alusVarB.i.isEmpty()) {
                    achoVar2.m = agpi.a;
                } else {
                    aihf aihfVarCreateBuilder = akjg.a.createBuilder();
                    akjh akjhVar = akjh.PLAYER_CUE_RANGE_SET_IDENTIFIER_EMBARGO;
                    aihfVarCreateBuilder.copyOnWrite();
                    akjg akjgVar = (akjg) aihfVarCreateBuilder.instance;
                    akjgVar.c = akjhVar.t;
                    akjgVar.b |= 1;
                    aihfVarCreateBuilder.aS(alusVarB.i);
                    achoVar2.m = agke.q((akjg) aihfVarCreateBuilder.build());
                }
                if ((alusVarB.b & 64) != 0 && (alveVar = alusVarB.g) == null) {
                    alveVar = alve.a;
                }
                achoVar2.g = alveVar;
                achoVar2.i = alusVarB.k;
                if ((alusVarB.b & SemanticState.Hidden) != 0) {
                    achoVar2.e = alusVarB.h;
                }
                achoVar2.h = alusVarB.n;
                achoVar2.k = alusVarB.l;
                achoVar2.l = alusVarB.m;
            }
            boolean zH = achoVar2.a ? true : this.e.H(achoVar2.a());
            achr achrVar2 = this.e;
            long jZ = achrVar2.z(alusVarB);
            achrVar2.i = jZ;
            if (zH) {
                achrVar2.E(this, jZ);
            }
        } catch (wno e) {
            achr achrVar3 = this.e;
            Iterator it2 = achrVar3.g.iterator();
            while (it2.hasNext()) {
                aboe aboeVarE = ((achv) it2.next()).e(e);
                if (aboeVarE != null) {
                    aboeVar = aboeVarE;
                    break;
                }
            }
            if (aboeVar != null) {
                achrVar3.F(aboeVar);
            } else {
                achrVar3.E(this, achrVar3.i);
            }
        }
    }
}
