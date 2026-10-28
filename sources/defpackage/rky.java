package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rky implements vxc {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/account/command/SignInCommand");
    public final zwb a;
    public final vxe b;
    public final rqa c;
    public final omj d;
    public final hed e;
    private final cf g;
    private final zwi h;
    private final Executor i;
    private final rlw k;
    private final awmd l;
    private tnh m;
    private final rql n;
    private final rnj o;
    private final nrc p;
    private final tld q;

    public rky(cf cfVar, rql rqlVar, zwb zwbVar, zwi zwiVar, rqa rqaVar, omj omjVar, vxe vxeVar, Executor executor, rnj rnjVar, rlw rlwVar, hed hedVar, tld tldVar, Optional optional, awmd awmdVar) {
        this.g = cfVar;
        this.n = rqlVar;
        this.a = zwbVar;
        this.h = zwiVar;
        this.c = rqaVar;
        this.d = omjVar;
        this.i = executor;
        this.o = rnjVar;
        this.b = vxeVar;
        this.k = rlwVar;
        this.e = hedVar;
        this.q = tldVar;
        this.p = (nrc) optional.orElse(null);
        this.l = awmdVar;
    }

    private final void g(apzh apzhVar, zwa zwaVar) {
        if ((apzhVar.b & 2) != 0) {
            if (((vxz) this.l.io()).l(90, 45856298L, false)) {
                int i = apzhVar.b;
                if ((i & SemanticState.Hidden) != 0) {
                    ajue ajueVar = apzhVar.g;
                    if (ajueVar == null) {
                        ajueVar = ajue.b;
                    }
                    if (h(ajueVar)) {
                        return;
                    }
                } else if ((i & 32) == 0 && apzhVar.j && !zwaVar.m() && this.p != null) {
                    return;
                }
            }
            rnj rnjVar = this.o;
            if (apzhVar.c == null) {
                ajwo ajwoVar = ajwo.a;
            }
            rnjVar.b();
        }
    }

    private final boolean h(ajue ajueVar) {
        zwb zwbVar = this.a;
        if (zwbVar.u()) {
            String strI = zwbVar.e().i();
            akkd akkdVar = ajueVar.j;
            if (akkdVar == null) {
                akkdVar = akkd.a;
            }
            if (strI.equals(akkdVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vxc
    public final /* synthetic */ boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    @Override // defpackage.vxc
    public final void c(final ajwo ajwoVar, final Map map) {
        boolean z;
        if (ajwoVar != null) {
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
            ajwoVar.c(aihlVarCheckIsLite);
            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                zwa zwaVarE = this.a.e();
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apzi.a);
                ajwoVar.c(aihlVarCheckIsLite2);
                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                apzh apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
                zws zwsVar = (zws) tym.U(map, "sign_in_callback", zws.class);
                boolean z2 = false;
                boolean z3 = zwaVarE.m() && ((vxz) this.l.io()).l(76, 45820038L, false);
                if (zwaVarE.g() && ((vxz) this.l.io()).l(78, 45823347L, false) && (apzhVar.b & 2) != 0) {
                    ajwo ajwoVar2 = apzhVar.c;
                    if (ajwoVar2 == null) {
                        ajwoVar2 = ajwo.a;
                    }
                    aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apni.a);
                    ajwoVar2.c(aihlVarCheckIsLite3);
                    if (ajwoVar2.j.n(aihlVarCheckIsLite3.d)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z3 || z) {
                    ajwo ajwoVarA = vxh.a("FEwhat_to_watch");
                    aihf builder = apzhVar.toBuilder();
                    builder.copyOnWrite();
                    apzh apzhVar2 = (apzh) builder.instance;
                    ajwoVarA.getClass();
                    apzhVar2.c = ajwoVarA;
                    apzhVar2.b |= 2;
                    aihh aihhVar = (aihh) ajwoVar.toBuilder();
                    aihhVar.e(apzi.a, (apzh) builder.build());
                    ajwoVar = (ajwo) aihhVar.build();
                    apzhVar = (apzh) builder.build();
                }
                ajwo ajwoVar3 = null;
                if (!zwaVarE.m() && (apzhVar.b & 32) != 0 && !apzhVar.d.equals("pre_child_id")) {
                    if (!zwaVarE.i().equals(apzhVar.d)) {
                        g(apzhVar, zwaVarE);
                        tnh tnhVar = new tnh() { // from class: rkx
                            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
                            @Override // defpackage.tnh
                            public final void a(Object obj) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = ((xsc) obj).b.iterator();
                                while (it.hasNext()) {
                                    arrayList.addAll(((ovo) it.next()).i());
                                }
                                ajwo ajwoVar4 = ajwoVar;
                                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apzi.a);
                                ajwoVar4.c(aihlVarCheckIsLite4);
                                Object objK2 = ajwoVar4.j.k(aihlVarCheckIsLite4.d);
                                Object objC = objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2);
                                Map map2 = map;
                                apzh apzhVar3 = (apzh) objC;
                                zws zwsVar2 = (zws) tym.U(map2, "sign_in_callback", zws.class);
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    rky rkyVar = this.a;
                                    if (!it2.hasNext()) {
                                        if ((apzhVar3.b & 64) == 0) {
                                            rkyVar.f(ajwoVar4, map2, zwsVar2);
                                            return;
                                        }
                                        vxe vxeVar = rkyVar.b;
                                        ajwo ajwoVar5 = apzhVar3.e;
                                        if (ajwoVar5 == null) {
                                            ajwoVar5 = ajwo.a;
                                        }
                                        vxeVar.a(ajwoVar5);
                                        return;
                                    }
                                    wnq wnqVar = (wnq) it2.next();
                                    if (wnqVar.k() && apzhVar3.d.equals(wnqVar.h())) {
                                        apzh apzhVar4 = wnqVar.c;
                                        ajwo ajwoVar6 = null;
                                        if (apzhVar4 == null || (apzhVar4.b & SemanticState.Hidden) == 0) {
                                            if (wnqVar.d != null) {
                                                rkyVar.b.a(wnqVar.d());
                                                return;
                                            }
                                            rqa rqaVar = rkyVar.c;
                                            if ((apzhVar3.b & 2) != 0 && (ajwoVar6 = apzhVar3.c) == null) {
                                                ajwoVar6 = ajwo.a;
                                            }
                                            rqaVar.h(wnqVar, ajwoVar6, zwsVar2);
                                            return;
                                        }
                                        rkyVar.d(apzhVar4);
                                        rqa rqaVar2 = rkyVar.c;
                                        ajue ajueVar = apzhVar4.g;
                                        if (ajueVar == null) {
                                            ajueVar = ajue.b;
                                        }
                                        arbj arbjVar = apzhVar4.h;
                                        if (arbjVar == null) {
                                            arbjVar = arbj.a;
                                        }
                                        if ((apzhVar3.b & 2) != 0 && (ajwoVar6 = apzhVar3.c) == null) {
                                            ajwoVar6 = ajwo.a;
                                        }
                                        rqaVar2.i(ajueVar, arbjVar, ajwoVar6, zwsVar2);
                                        return;
                                    }
                                }
                            }
                        };
                        this.m = tnhVar;
                        this.k.a(null, tnhVar);
                        return;
                    }
                    if ((apzhVar.b & 2) != 0) {
                        vxe vxeVar = this.b;
                        ajwo ajwoVar4 = apzhVar.c;
                        if (ajwoVar4 == null) {
                            ajwoVar4 = ajwo.a;
                        }
                        vxeVar.a(ajwoVar4);
                        return;
                    }
                    return;
                }
                g(apzhVar, zwaVarE);
                if ((apzhVar.b & SemanticState.Hidden) == 0) {
                    boolean z4 = ((Boolean) tym.T(map, "FromTopBarMenu", Boolean.FALSE)).booleanValue() || ((apzhVar.b & 32) != 0 && "pre-incognito-id".equals(apzhVar.d));
                    if ((apzhVar.b & 32) != 0 && "pre_child_id".equals(apzhVar.d)) {
                        z2 = true;
                    }
                    if (!zwaVarE.m() || !z4) {
                        if (z2) {
                            taf.i(this.d.I(), this.i, new iul(5), new rjy(this, apzhVar, zwsVar, 6), null);
                            return;
                        } else {
                            f(ajwoVar, map, zwsVar);
                            return;
                        }
                    }
                    zwi zwiVar = this.h;
                    rqk rqkVar = new rqk(zwsVar, 1);
                    if ((apzhVar.b & 2) != 0 && (ajwoVar3 = apzhVar.c) == null) {
                        ajwoVar3 = ajwo.a;
                    }
                    zwiVar.b(rqkVar, ajwoVar3);
                    return;
                }
                d(apzhVar);
                ajue ajueVar = apzhVar.g;
                if (ajueVar == null) {
                    ajueVar = ajue.b;
                }
                if ((apzhVar.b & 2) != 0 && h(ajueVar)) {
                    vxe vxeVar2 = this.b;
                    ajwo ajwoVar5 = apzhVar.c;
                    if (ajwoVar5 == null) {
                        ajwoVar5 = ajwo.a;
                    }
                    vxeVar2.a(ajwoVar5);
                }
                rqa rqaVar = this.c;
                arbj arbjVar = apzhVar.h;
                if (arbjVar == null) {
                    arbjVar = arbj.a;
                }
                if ((apzhVar.b & 2) != 0 && (ajwoVar3 = apzhVar.c) == null) {
                    ajwoVar3 = ajwo.a;
                }
                rqaVar.i(ajueVar, arbjVar, ajwoVar3, zwsVar);
            }
        }
    }

    public final void d(apzh apzhVar) {
        int i = apzhVar.b;
        if ((i & SemanticState.Hidden) == 0 || (i & SemanticState.ReadOnly) == 0) {
            return;
        }
        tld tldVar = this.q;
        ajue ajueVar = apzhVar.g;
        if (ajueVar == null) {
            ajueVar = ajue.b;
        }
        Object obj = tldVar.b;
        rlt rltVarA = rlt.a(ajueVar);
        taf.i(afxd.f(((syn) obj).n(rltVarA)).c(afig.class, new qmu(new pge(tldVar, rltVarA, 9, null), 8), MoreExecutors.directExecutor()), this.i, new iul(6), new itt(this, apzhVar, 5), null);
    }

    public final void f(ajwo ajwoVar, Map map, zws zwsVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apzi.a);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        apzh apzhVar = (apzh) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        if (apzhVar.j && !this.a.e().m()) {
            if (this.p != null) {
                if (map != null) {
                }
                if ((ajwoVar.b & 1) != 0) {
                    ajwoVar.c.G();
                }
                if ((apzhVar.b & 2) != 0) {
                    ajwo ajwoVar2 = apzhVar.c;
                }
                int i = apzhVar.k;
                throw null;
            }
            ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/account/command/SignInCommand", "startSignInFlow", 377, "SignInCommand.java")).t("Lite Account Switcher is enabled but launcher is absent.");
        }
        this.n.c(this.g, ajwoVar, zwsVar);
    }

    @Override // defpackage.vxc
    public final /* synthetic */ void a(ajwo ajwoVar) {
    }
}
