package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acxt implements adma {
    public acxm a;
    public avlr b;
    public final Handler c;
    private fjw d;
    private ComponentTree e;
    private final awmd f;
    private final Context i;
    private final adce j;
    private avmm k;
    private acxs l;
    private final ntu n;
    private final mlo o;
    private final vxz p;
    private final afip q;
    private final AtomicReference g = new AtomicReference();
    private final AtomicReference h = new AtomicReference();
    private final AtomicLong m = new AtomicLong(0);

    public acxt(Context context, mlo mloVar, adbv adbvVar, afip afipVar, ntu ntuVar, vxz vxzVar, awmd awmdVar) {
        this.i = context;
        int i = mej.a;
        this.c = new Handler(Looper.getMainLooper());
        this.o = mloVar;
        this.j = adbvVar.a();
        this.q = afipVar;
        this.n = ntuVar;
        this.p = vxzVar;
        this.f = awmdVar;
    }

    private final fjw i(adly adlyVar) {
        View viewA = a();
        Object objC = adlyVar.c("ElementPresenter#LAYOUT_PARAMS");
        if (objC instanceof ViewGroup.LayoutParams) {
            ((fjw) viewA).setLayoutParams((ViewGroup.LayoutParams) objC);
        }
        ((ComponentHost) viewA).setTag(R.id.elements_navigation_args, adlyVar.e());
        return (fjw) viewA;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [awmd, java.lang.Object] */
    private final ComponentTree j(adly adlyVar, acxm acxmVar, boolean z, boolean z2, boolean z3, auym auymVar) {
        avmm avmmVar;
        fhd fhdVar;
        acxm acxmVar2;
        fkz fkzVar;
        avmm avmmVar2 = this.k;
        if (avmmVar2 != null) {
            avmmVar2.dispose();
        }
        avmm avmmVar3 = new avmm();
        this.k = avmmVar3;
        View viewA = a();
        boolean z4 = acxmVar instanceof acxm;
        acxm acxmVar3 = true != z4 ? null : acxmVar;
        adbt adbtVar = (adbt) this.j;
        boolean z5 = adbtVar.j;
        if (z5 || acxmVar3 != null) {
            fly flyVar = new fly();
            if (z5) {
                flyVar.d(avmm.class, this.k);
            }
            if (acxmVar3 != null) {
                flyVar.d(mlf.class, acxmVar3.a());
            }
            avmmVar = avmmVar3;
            if (this.p.l(250, 45668007L, false)) {
                ntu ntuVar = this.n;
                flyVar.d(ntt.class, new ntt(String.valueOf(ntuVar.a())));
                fhdVar = new fhd(this.i, "ElementPresenter", new omj(ntuVar.c()), flyVar);
            } else {
                fhdVar = new fhd(this.i, null, null, flyVar);
            }
        } else {
            fhdVar = ((fjw) viewA).y;
            avmmVar = avmmVar3;
        }
        Map mapE = adlyVar.e();
        Object obj = mapE != null ? mapE.get("com.google.android.libraries.youtube.innertube.endpoint.tag") : null;
        if (obj == null && (obj = this.a) == null) {
            obj = acxmVar;
        }
        amdd amddVar = adlyVar.d;
        Optional optionalOfNullable = Optional.ofNullable(adlyVar.d("sectionListController", null));
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(agkj.j("sectionListController", optionalOfNullable.get()));
        }
        this.l = new acxs(aawb.ad(obj, amddVar, (agkj) optionalOfNullable.orElse(null)));
        mlo mloVar = this.o;
        ntw ntwVarB = ntx.b(new glj(mloVar.a, 6));
        float f = adbtVar.f;
        nvx nvxVarA = nvy.a();
        nvxVarA.d(f);
        ntwVarB.f = nvxVarA.a();
        ntwVarB.c(z);
        Object[] objArr = {this.l};
        aguu.j(objArr, 1);
        ntwVarB.g = new agpi(objArr, 1);
        xgn xgnVar = adlyVar.b;
        xgz xgjVar = adlyVar.c;
        akrn akrnVar = z4 ? acxmVar.a : null;
        if (xgjVar == null && akrnVar != null && (akrnVar.b & 8) != 0 && akrnVar.d.d() > 0) {
            xgjVar = new xgj(akrnVar.d, (amud) null);
        }
        afip afipVar = this.q;
        ((Context) afipVar.b.io()).getClass();
        ((abxu) afipVar.d.io()).getClass();
        xgnVar.getClass();
        vxz vxzVar = (vxz) afipVar.g.io();
        vxzVar.getClass();
        vxz vxzVar2 = (vxz) afipVar.c.io();
        vxzVar2.getClass();
        vxz vxzVar3 = (vxz) afipVar.f.io();
        vxzVar3.getClass();
        ((vxz) afipVar.h.io()).getClass();
        vxz vxzVar4 = (vxz) afipVar.e.io();
        tqj tqjVar = (tqj) afipVar.a.io();
        tqjVar.getClass();
        ntwVarB.i = new adfx(vxzVar, vxzVar2, vxzVar3, vxzVar4, tqjVar, xgnVar, null, xgjVar);
        if (this.p.l(275, 45679816L, false)) {
            a.ap(this.h, (BlockRegistryProvider) this.f.io());
        }
        nsk nskVarB = nsl.b();
        nskVarB.m(ntwVarB.a());
        nskVarB.b(a());
        nskVarB.l(this.b);
        nskVarB.r = (String) this.g.get();
        BlockRegistryProvider blockRegistryProvider = (BlockRegistryProvider) this.h.get();
        nskVarB.s = blockRegistryProvider == null ? null : new mmx(blockRegistryProvider);
        ntu ntuVar2 = this.n;
        nskVarB.c = ntuVar2.d(ntuVar2.a());
        nsl nslVarA = nskVarB.a();
        final xgn xgnVar2 = adlyVar.b;
        final amdd amddVar2 = adlyVar.d;
        fgy fgyVarB = mloVar.b(fhdVar, nslVarA, acxmVar, new nth() { // from class: adas
            @Override // defpackage.nth
            public final ntg a(ntq ntqVar) {
                return new adau(ntqVar, xgnVar2, amddVar2);
            }
        }, avmmVar);
        if (auymVar != null) {
            auymVar.b = fgyVarB;
        }
        String str = ComponentTree.a;
        fhm fhmVar = new fhm(fhdVar);
        fhmVar.b(fgyVarB);
        fhmVar.o = null;
        fhmVar.d = z;
        fhmVar.k = z2;
        fhmVar.f = z3;
        if (z5 && (acxmVar2 = this.a) != null && (fkzVar = acxmVar2.b) != null) {
            fhmVar.h = fkzVar;
        }
        return fhmVar.a();
    }

    private final ComponentTree k(adly adlyVar, acxm acxmVar, boolean z, auym auymVar) {
        ComponentTree componentTree = this.e;
        if (componentTree == null) {
            ComponentTree componentTreeJ = j(adlyVar, acxmVar, false, false, z, auymVar);
            this.e = componentTreeJ;
            componentTree = componentTreeJ;
        }
        componentTree.getClass();
        return componentTree;
    }

    @Override // defpackage.adma
    public final View a() {
        fhd fhdVar = this.p.l(250, 45668007L, false) ? new fhd(this.i, "ElementPresenter", new omj(this.n.c()), null) : null;
        fjw fjwVar = this.d;
        if (fjwVar != null) {
            return fjwVar;
        }
        if (fhdVar == null) {
            fjw fjwVar2 = new fjw(this.i);
            this.d = fjwVar2;
            return fjwVar2;
        }
        fjw fjwVar3 = new fjw(fhdVar);
        this.d = fjwVar3;
        return fjwVar3;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.m.getAndIncrement();
        fjw fjwVar = this.d;
        if (fjwVar != null) {
            if (((adbt) this.j).j) {
                ComponentTree componentTree = fjwVar.w;
                acxm acxmVar = this.a;
                if (acxmVar != null) {
                    acxmVar.b = componentTree == null ? null : componentTree.e();
                }
            }
            fjwVar.H();
            fjwVar.O();
            fjwVar.K(null, true);
            fjwVar.setTag(R.id.elements_navigation_args, null);
        }
        ComponentTree componentTree2 = this.e;
        if (componentTree2 != null) {
            componentTree2.q = null;
            this.e = null;
        }
        avmm avmmVar = this.k;
        if (avmmVar != null) {
            avmmVar.dispose();
            this.k = null;
        }
        acxs acxsVar = this.l;
        if (acxsVar != null) {
            acxsVar.a = null;
        }
        this.l = null;
    }

    public final void d(maw mawVar) {
        if (mawVar != null) {
            this.g.set(mawVar.a());
        }
    }

    public final void e(agfr agfrVar) {
        this.h.set(new acxj(agfrVar));
    }

    public final void f(adly adlyVar, acxm acxmVar, boolean z) {
        taq.d();
        i(adlyVar).K(k(adlyVar, acxmVar, z, null), true);
    }

    public final void g(adly adlyVar, acxm acxmVar, final nqu nquVar) {
        this.m.getAndIncrement();
        auym auymVar = new auym();
        ComponentTree componentTreeK = k(adlyVar, acxmVar, false, auymVar);
        Object obj = auymVar.b;
        if (obj != null) {
            if (nquVar != null) {
                componentTreeK.q = new fhr() { // from class: acxr
                    @Override // defpackage.fhr
                    public final void a(ComponentTree componentTree) {
                        componentTree.q = null;
                        acqu acquVar = new acqu(nquVar, 5);
                        int i = mej.a;
                        this.a.c.post(acquVar);
                    }
                };
            }
            componentTreeK.D((fgy) obj, 0, 0, true, null, 1, null, null, false, false);
        }
    }

    public final void h(adly adlyVar, acxm acxmVar, boolean z, boolean z2) {
        this.m.getAndIncrement();
        fjw fjwVarI = i(adlyVar);
        Object objC = adlyVar.c("blockRegistry");
        if (objC instanceof maw) {
            d((maw) objC);
        }
        fjwVarI.K(j(adlyVar, acxmVar, z, z2, false, null), true);
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        h(adlyVar, (acxm) obj, false, false);
    }
}
