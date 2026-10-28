package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jav extends adwg {
    public ixi a;
    private final wbz aA;
    private final zwb aB;
    private final admk aC;
    private final List aD;
    private final acxn aE;
    private final avmb aF;
    private ViewGroup aG;
    private jas aH;
    private Object aI;
    private avmn aJ;
    private final aduv aK;
    private final qa aL;
    private final ahud aM;
    private final ci aN;
    public final aunn b;
    public final avmb c;
    public final avmm d;
    public Object e;
    public ExtendedFloatingActionButton f;
    public final vxe g;
    public ijt h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public jav(ahek ahekVar, adws adwsVar, ahud ahudVar, avlh avlhVar, avlh avlhVar2, avmb avmbVar, avmb avmbVar2, aduv aduvVar, vxe vxeVar, mlo mloVar, vxz vxzVar, acxn acxnVar, awmd awmdVar, awmd awmdVar2, vxz vxzVar2, avlh avlhVar3, ntu ntuVar, afip afipVar, vxz vxzVar3, awmd awmdVar3, aunn aunnVar, ci ciVar, aunn aunnVar2, aduh aduhVar, zwb zwbVar, aunn aunnVar3, wbz wbzVar, zzf zzfVar, vxz vxzVar4, awmd awmdVar4, jaw jawVar) {
        vxz vxzVar5;
        advz aebiVar;
        adwq adwqVarI;
        adss adssVar = new adss();
        adssVar.c(jawVar.i);
        int i = 6;
        int i2 = 0;
        if (Objects.equals(jawVar.b.getTag(441581429), "disable-recycler-binder")) {
            vxzVar5 = vxzVar2;
            aebiVar = aw;
        } else {
            nvx nvxVarA = nvy.a();
            nvxVarA.c(true);
            int iC = (int) vxzVar2.c(4, 45387250L, 0L);
            if (iC > 0) {
                nvxVarA.e(iC);
            }
            vxzVar5 = vxzVar2;
            float fA = (float) vxzVar5.a(0, 45387253L, 0.0d);
            nvxVarA.b(fA <= 0.0f ? 1.5f : fA);
            ntw ntwVarB = ntx.b(new glj(mloVar.a, 6));
            ntwVarB.b(false);
            ntwVarB.c(false);
            ntwVarB.f = nvxVarA.a();
            aebiVar = new aebi(mloVar, ntwVarB.a(), vxzVar, jawVar.j, ntuVar, afipVar, awmdVar, awmdVar2, jawVar.f);
        }
        adssVar.a = aebiVar;
        byte b = adssVar.c;
        adssVar.b = avlhVar3;
        adssVar.c = (byte) (b | 28);
        RecyclerView recyclerView = jawVar.b;
        admo admoVarD = ahekVar.d(jawVar.i);
        advd advdVar = jawVar.h;
        xgn xgnVar = jawVar.j;
        adst adstVar = new adst();
        adstVar.n(recyclerView);
        adstVar.g(admoVarD);
        adstVar.l(advdVar);
        adstVar.e(xgnVar);
        adstVar.i(avlhVar);
        adstVar.c((tbt) adwsVar.a);
        adstVar.b(adwsVar.b);
        adstVar.d((vyo) adwsVar.c);
        adstVar.k = adwsVar.d;
        adstVar.q |= 1073741824;
        adstVar.m = adwsVar.e;
        byte b2 = adstVar.r;
        adstVar.n = adwsVar.f;
        adstVar.r = (byte) (b2 | 6);
        adstVar.m((vxz) adwsVar.h);
        adstVar.t = (vxz) adwsVar.i;
        int i3 = adstVar.q;
        adstVar.v = (abhh) adwsVar.g;
        adstVar.q = i3 | 805306368;
        Object obj = adwsVar.j;
        adstVar.p = obj != null ? ((vxz) obj).l(411, 45835715L, false) : false;
        adstVar.r = (byte) (adstVar.r | 32);
        adxd adxdVar = jawVar.a;
        adstVar.a = adxdVar instanceof jat ? adxdVar.o : adxdVar;
        adstVar.q |= 1;
        adstVar.f(jawVar.d);
        adstVar.b = jawVar.e;
        adstVar.q |= 16;
        adstVar.k(jawVar.g);
        adstVar.c = jawVar.k;
        adstVar.q |= SemanticState.Modal;
        adstVar.j(jawVar.l);
        adstVar.h(jawVar.o);
        adstVar.g = new ArrayDeque();
        adstVar.q |= 524288;
        adstVar.d = vxzVar5.l(273, 45838802L, false) ? zzfVar.b.H(new hpr(15)).p() : avlhVar2;
        adstVar.q |= 65536;
        adstVar.e = true != vxzVar5.l(273, 45838802L, false) ? 1000L : 0L;
        int i4 = adstVar.q;
        adstVar.f = avmbVar;
        adstVar.h = jawVar.f;
        adstVar.u = jawVar.q;
        adstVar.i = aunnVar;
        adstVar.q = i4 | 20316160;
        adstVar.l = true != vxzVar5.l(240, 45794845L, false) ? null : aunnVar3;
        int i5 = adstVar.q;
        adstVar.j = awmdVar3;
        adstVar.s = vxzVar3;
        adstVar.q = i5 | (-2076180480);
        int i6 = 5;
        adstVar.o = new glj(aduhVar, 5);
        adstVar.r = (byte) (adstVar.r | 8);
        adssVar.b(adstVar.a());
        super(adssVar.a());
        ArrayList arrayList = new ArrayList();
        this.aD = arrayList;
        this.d = new avmm();
        this.g = vxeVar;
        this.aK = aduvVar;
        admk admkVar = jawVar.i;
        this.aC = admkVar;
        this.aA = wbzVar;
        this.aB = zwbVar;
        this.aG = jawVar.m;
        this.f = jawVar.p;
        this.aE = acxnVar;
        this.aN = ciVar;
        this.b = aunnVar2;
        this.c = avmbVar;
        this.aF = avmbVar2;
        if (vxzVar4.c(6, 45842208L, 0L) > 0) {
            jah jahVar = (jah) awmdVar4.io();
            long jC = jahVar.m.c(6, 45842208L, 0L);
            synchronized (jahVar.l) {
                if (jahVar.g == null && jC > 0) {
                    jahVar.d.isPresent();
                    jahVar.h = jC;
                    jahVar.j = jahVar.e.c == aobh.NETWORK_QUALITY_BUCKET_OFFLINE;
                    jahVar.i = jahVar.a();
                    jahVar.k = null;
                    jahVar.g = jahVar.e.b.H(new ibj(new hhn(18), 11)).p().L(jahVar.f).al(new iwb(new hol(jahVar, 12), i6), new iwb(new hhn(19), i));
                }
            }
        }
        RecyclerView recyclerView2 = jawVar.b;
        recyclerView2.aI(admkVar.f());
        vxz vxzVar6 = this.aa;
        if (vxzVar6 != null && vxzVar6.l(27, 45722447L, false) && (adwqVarI = I()) != null) {
            glx.a(adwqVarI, new jap(this, i2));
        }
        adwq adwqVarI2 = I();
        if (adwqVarI2 != null) {
            glx.a(adwqVarI2, new jap(this, 2));
        }
        admc admcVar = this.m;
        admcVar.jR(new jep(1));
        admcVar.jR(new jep(0));
        jas jasVar = new jas(new jar(this));
        this.aH = jasVar;
        jasVar.o(recyclerView2);
        admcVar.g(this.aH);
        admcVar.jR(new jao(this, i2));
        admcVar.g(new adso(this, 1));
        this.aM = ahudVar;
        ahudVar.ad((RecyclerView) this.l, jawVar.j);
        jaq jaqVar = new jaq(this);
        this.aL = jaqVar;
        recyclerView2.aC(jaqVar);
        jau jauVar = jawVar.n;
        if (jauVar != null) {
            arrayList.add(jauVar);
        }
        adxd adxdVar2 = jawVar.a;
        if (adxdVar2 instanceof jat) {
            jat jatVar = (jat) adxdVar2;
            aS(jatVar.a, jatVar);
            Object obj2 = jatVar.c;
            if (obj2 instanceof ajnf) {
                l((ajnf) obj2);
            }
        }
        ((RecyclerView) this.l).ah(jawVar.c);
        ((RecyclerView) this.l).az();
        aT();
    }

    private final void aS(Object obj, jat jatVar) {
        maw mawVar;
        ViewGroup viewGroup = this.aG;
        if (viewGroup == null || obj == null) {
            return;
        }
        admk admkVar = this.aC;
        kro.X(viewGroup, admkVar);
        super.ao();
        Context context = this.aG.getContext();
        L(new jao(context, 2));
        L(new jao(jatVar, 3));
        ixi ixiVar = this.a;
        if (ixiVar != null) {
            ixiVar.e();
        }
        ixi ixiVar2 = new ixi();
        this.a = ixiVar2;
        if (obj instanceof ajta) {
            ajsx ajsxVarA = ajsx.a(((ajta) obj).f);
            if (ajsxVarA == null) {
                ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
            }
            ixiVar2.d = ajsxVarA;
        }
        if (obj instanceof acxm) {
            this.h = new ijt((wek) this.aA.e(this.aB.e()));
            if (I() != null && (mawVar = I().a) != null) {
                L(new gob(mawVar, 14));
            }
        }
        int i = 4;
        L(new jao(this, i));
        L(new jao(context, 5));
        ViewGroup viewGroup2 = this.aG;
        View viewS = kro.S(obj, admkVar, viewGroup2, (admo) this.m);
        if (viewS != null) {
            viewGroup2.addView(viewS);
            this.e = obj;
            Iterable$EL.forEach(this.aD, new hpf(this, viewS, i, null));
        }
    }

    private final void aT() {
        RecyclerView recyclerView = (RecyclerView) this.l;
        if (Objects.equals(recyclerView.getTag(R.id.disable_section_list_auto_padding_tag), Boolean.TRUE)) {
            return;
        }
        recyclerView.setClipToPadding(false);
        recyclerView.setPaddingRelative(0, 0, 0, recyclerView.getResources().getDimensionPixelSize(R.dimen.mini_player_height));
    }

    public final advc e(Object obj) {
        for (advc advcVar : this.n) {
            if (advcVar.a().contains(obj)) {
                return advcVar;
            }
        }
        return null;
    }

    @Override // defpackage.adsr
    protected final void h(apoq apoqVar) {
        apoo apooVar = apoqVar.h;
        if (apooVar == null) {
            apooVar = apoo.a;
        }
        int i = apooVar.b;
        if (i == 90823135) {
            if (this.aG == null) {
                K((ajta) apooVar.c);
            } else if (this.a != null) {
                super.ao();
                ajta ajtaVar = apooVar.b == 90823135 ? (ajta) apooVar.c : ajta.a;
                ixi ixiVar = this.a;
                ajsx ajsxVarA = ajsx.a(ajtaVar.f);
                if (ajsxVarA == null) {
                    ajsxVarA = ajsx.CHIP_CLOUD_SELECTION_BEHAVIOR_UNKNOWN;
                }
                ixiVar.d = ajsxVarA;
                ixiVar.h((List) Collection.EL.stream(ajtaVar.c).map(new ixa(2)).collect(aghu.a));
                this.e = ajtaVar;
            } else {
                aS((ajta) apooVar.c, null);
            }
        } else if (i == 259982244) {
            K((anrs) apooVar.c);
        } else if (i == 153515154) {
            aS(this.aE.a((akrn) apooVar.c), null);
        }
        apon aponVar = apoqVar.i;
        if (aponVar == null) {
            aponVar = apon.a;
        }
        if (aponVar.b != 65153809) {
            k();
            return;
        }
        apon aponVar2 = apoqVar.i;
        if (aponVar2 == null) {
            aponVar2 = apon.a;
        }
        l(aponVar2.b == 65153809 ? (ajnf) aponVar2.c : ajnf.a);
    }

    @Override // defpackage.adsr, defpackage.adtv, defpackage.advw
    public final synchronized adxd hq() {
        ixi ixiVar;
        ixiVar = this.a;
        return new jat(this.e, ixiVar != null ? ixiVar.b() : agpi.a, this.aI, super.hq());
    }

    @Override // defpackage.adsr, defpackage.adtv
    protected final void ht(toe toeVar, acjx acjxVar) {
        View view;
        super.ht(toeVar, acjxVar);
        if (acjxVar.a() != acjw.b || (view = this.l) == null || ((RecyclerView) view).canScrollVertically(1)) {
            return;
        }
        af(u() - 1);
    }

    @Override // defpackage.adwg, defpackage.adsr, defpackage.adtv, defpackage.twn
    public final void i() {
        super.i();
        RecyclerView recyclerView = (RecyclerView) this.l;
        recyclerView.aE(this.aL);
        this.d.dispose();
        k();
        nl nlVar = recyclerView.E;
        if (nlVar != null && nlVar.j()) {
            recyclerView.E.c();
        }
        ahud ahudVar = this.aM;
        if (ahudVar != null) {
            ahudVar.ae(recyclerView);
        }
        this.aD.clear();
        ViewGroup viewGroup = this.aG;
        if (viewGroup != null) {
            admk admkVar = this.aC;
            kro.X(viewGroup, admkVar);
            if (adul.d(this.aG) != null) {
                adul.g(this.aG, admkVar);
            }
        }
        this.e = null;
        ixi ixiVar = this.a;
        if (ixiVar != null) {
            ixiVar.e();
            this.a = null;
        }
        this.h = null;
        jas jasVar = this.aH;
        if (jasVar != null) {
            ((admo) this.m).i(jasVar);
            this.aH.o(new RecyclerView(recyclerView.getContext()));
        }
        this.f = null;
        this.aG = null;
    }

    @Override // defpackage.adsr, defpackage.adtb
    public final void j(apho aphoVar, ajwo ajwoVar) {
        int iBc;
        if (aphoVar == null || (iBc = a.bc(aphoVar.f)) == 0 || iBc != 5) {
            M(false);
        } else {
            Optional optionalFindAny = Collection.EL.stream(J()).filter(new iui(8)).map(new ixa(3)).findAny();
            if (optionalFindAny.isPresent()) {
                ((iyn) optionalFindAny.get()).h(true);
            } else {
                M(false);
            }
        }
        this.t.b(aawb.ae(aphoVar));
        aC(aawb.ae(aphoVar), ajwoVar);
    }

    public final void k() {
        this.aI = null;
        avmn avmnVar = this.aJ;
        if (avmnVar != null && !avmnVar.f()) {
            avnr.b((AtomicReference) this.aJ);
            this.aJ = null;
        }
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f;
        if (extendedFloatingActionButton != null) {
            extendedFloatingActionButton.setVisibility(8);
        }
    }

    public final void l(ajnf ajnfVar) {
        aduv aduvVar;
        k();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f;
        if (extendedFloatingActionButton != null) {
            if ((ajnfVar.b & 64) != 0) {
                extendedFloatingActionButton.setAllCaps(false);
                ExtendedFloatingActionButton extendedFloatingActionButton2 = this.f;
                alay alayVar = ajnfVar.m;
                if (alayVar == null) {
                    alayVar = alay.a;
                }
                extendedFloatingActionButton2.setText(ackj.k(null, alayVar, null, false));
            } else if (ajnfVar.e != 8) {
                return;
            }
            if (ajnfVar.e == 8 && (aduvVar = this.aK) != null) {
                ExtendedFloatingActionButton extendedFloatingActionButton3 = this.f;
                Context context = extendedFloatingActionButton3.getContext();
                aliz alizVarA = aliz.a((ajnfVar.e == 8 ? (alja) ajnfVar.f : alja.a).c);
                if (alizVarA == null) {
                    alizVarA = aliz.UNKNOWN;
                }
                Drawable drawableD = dl.d(context, aduvVar.a(alizVarA));
                if (((MaterialButton) extendedFloatingActionButton3).c != drawableD) {
                    extendedFloatingActionButton3.f = -2.1474836E9f;
                    ((MaterialButton) extendedFloatingActionButton3).c = drawableD;
                    extendedFloatingActionButton3.g(true);
                    extendedFloatingActionButton3.h(extendedFloatingActionButton3.getMeasuredWidth(), extendedFloatingActionButton3.getMeasuredHeight());
                }
            }
            if ((ajnfVar.b & SemanticState.Multiline) != 0) {
                ExtendedFloatingActionButton extendedFloatingActionButton4 = this.f;
                ajwo ajwoVar = ajnfVar.s;
                if (ajwoVar == null) {
                    ajwoVar = ajwo.a;
                }
                q(extendedFloatingActionButton4, ajwoVar, ajnfVar);
            }
            if ((ajnfVar.b & 8388608) != 0) {
                this.aJ = this.aA.e(this.aB.e()).j(ajnfVar.A, true).O(this.aF).ag(new gkr(this, ajnfVar, 14), new ido(15));
            }
            this.ag.w(new xgj(ajnfVar.y, (amud) null), null);
            this.f.setVisibility(0);
            this.aI = ajnfVar;
            this.aN.af(ajnfVar, this.f);
        }
    }

    @Override // defpackage.adwg, defpackage.adsr
    public final void p(Configuration configuration) {
        super.p(configuration);
        aS(this.e, (jat) hq());
        aT();
    }

    public final void q(ExtendedFloatingActionButton extendedFloatingActionButton, ajwo ajwoVar, ajnf ajnfVar) {
        if (extendedFloatingActionButton != null) {
            if (this.g == null || ajwoVar == null) {
                extendedFloatingActionButton.setOnClickListener(null);
            } else {
                extendedFloatingActionButton.setOnClickListener(new ivx((Object) this, (Object) ajnfVar, (Object) ajwoVar, 3, (byte[]) null));
            }
        }
    }

    @Override // defpackage.adsr
    protected final boolean r() {
        return true;
    }
}
