package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fuv extends fkx {

    @fmt(a = 10)
    @fmu(a = fmv.a)
    public fgy a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean d;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public bdb g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int q;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Integer r;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fti s;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean t;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fhz u;

    public fuv() {
        super("VerticalScroll");
        this.q = 1;
    }

    private static final fuu aE(fhd fhdVar) {
        return (fuu) fhdVar.i().c;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        fut futVar = (fut) fizVar;
        fut futVar2 = (fut) fizVar2;
        futVar.a = futVar2.a;
        futVar.b = futVar2.b;
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        fuu fuuVarAE = aE(fhdVar);
        fgy fgyVar = this.a;
        int i = this.e;
        boolean z = this.d;
        abh abhVar = new abh(0);
        abhVar.a = i;
        fhm fhmVarD = ComponentTree.d(fhdVar, fgyVar);
        fhmVarD.d = z;
        ComponentTree componentTreeA = fhmVarD.a();
        fuuVarAE.b = abhVar;
        fuuVarAE.a = componentTreeA;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        fuu fuuVarAE = aE(fhdVar);
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.t;
        boolean z2 = this.f;
        boolean z3 = this.d;
        fhz fhzVar = this.u;
        bdb bdbVar = this.g;
        fti ftiVar = this.s;
        int i = this.q;
        ComponentTree componentTree = fuuVarAE.a;
        Integer num = this.r;
        abh abhVar = fuuVarAE.b;
        abh abhVar2 = (num == null || num.intValue() == -1) ? abhVar : new abh(num.intValue());
        lithoScrollView.h.K(componentTree, true);
        lithoScrollView.j = z3;
        int i2 = abhVar2.a;
        lithoScrollView.l = abhVar2;
        frn frnVar = new frn(lithoScrollView, i2);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(frnVar);
        lithoScrollView.i = frnVar;
        if (ftiVar != null) {
            lithoScrollView.k = new fqm();
            lithoScrollView.k.a = ftiVar;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.setNestedScrollingEnabled(z2);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        if (num != null && num.intValue() != -1) {
            abhVar.a = num.intValue();
        }
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.d = bdbVar;
        lithoScrollView.setOverScrollMode(i);
        if (fhzVar != null) {
            fhzVar.aw(lithoScrollView);
        }
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        fuu fuuVar = (fuu) fkyVar;
        fuu fuuVar2 = (fuu) fkyVar2;
        fuuVar2.a = fuuVar.a;
        fuuVar2.b = fuuVar.b;
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean S() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean V() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        fuv fuvVar = (fuv) fgyVar;
        fuv fuvVar2 = (fuv) fgyVar2;
        fif fifVar = new fif(fuvVar == null ? null : fuvVar.a, fuvVar2 == null ? null : fuvVar2.a);
        fif fifVar2 = new fif(fuvVar == null ? null : Boolean.valueOf(fuvVar.t), fuvVar2 == null ? null : Boolean.valueOf(fuvVar2.t));
        fif fifVar3 = new fif(fuvVar == null ? null : Boolean.TRUE, fuvVar2 == null ? null : Boolean.TRUE);
        fif fifVar4 = new fif(fuvVar == null ? null : Boolean.valueOf(fuvVar.c), fuvVar2 == null ? null : Boolean.valueOf(fuvVar2.c));
        fif fifVar5 = new fif(fuvVar == null ? null : Boolean.valueOf(fuvVar.f), fuvVar2 == null ? null : Boolean.valueOf(fuvVar2.f));
        fif fifVar6 = new fif(fuvVar == null ? null : Boolean.valueOf(fuvVar.d), fuvVar2 == null ? null : Boolean.valueOf(fuvVar2.d));
        fif fifVar7 = new fif(fuvVar == null ? null : fuvVar.r, fuvVar2 != null ? fuvVar2.r : null);
        fgy fgyVar3 = (fgy) fifVar.a;
        fgy fgyVar4 = (fgy) fifVar.b;
        boolean z = fna.a;
        return (fgyVar3.g(fgyVar4) && ((Boolean) fifVar2.a).equals(fifVar2.b) && ((Boolean) fifVar3.a).equals(fifVar3.b) && ((Boolean) fifVar4.a).equals(fifVar4.b) && ((Boolean) fifVar5.a).equals(fifVar5.b) && ((Boolean) fifVar6.a).equals(fifVar6.b) && Objects.equals(fifVar7.a, fifVar7.b)) ? false : true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        fuu fuuVarAE = aE(fhdVar);
        fgy fgyVar = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        ComponentTree componentTree = fuuVarAE.a;
        fut futVar = (fut) fizVar;
        Integer num = futVar.b;
        Integer num2 = futVar.a;
        int iG = (fjiVar.g() - fjiVar.d()) - fjiVar.e();
        int iB = (fjiVar.b() - fjiVar.f()) - fjiVar.c();
        if (num != null && num.intValue() == iG) {
            if (!z) {
                return;
            }
            z = true;
            if (num2 != null && num2.intValue() == iB) {
                return;
            }
        }
        fhz.av(fhdVar, View.MeasureSpec.makeMeasureSpec(fjiVar.g(), 1073741824), View.MeasureSpec.makeMeasureSpec(fjiVar.b(), 1073741824), new fkw(), componentTree, fgyVar, z, z2);
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        fuu fuuVarAE = aE(fhdVar);
        fhz.av(fhdVar, i, i2, fkwVar, fuuVarAE.a, this.a, this.c, this.b);
        Integer numValueOf = Integer.valueOf(fkwVar.a);
        Integer numValueOf2 = Integer.valueOf(fkwVar.b);
        fut futVar = (fut) fizVar;
        futVar.b = numValueOf;
        futVar.a = numValueOf2;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        fhz fhzVar = this.u;
        if (fhzVar != null) {
            fhzVar.aw(null);
        }
        lithoScrollView.d = null;
        lithoScrollView.h.K(null, false);
        lithoScrollView.l = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.i);
        lithoScrollView.i = null;
        lithoScrollView.j = false;
        fqm fqmVar = lithoScrollView.k;
        if (fqmVar != null) {
            fqmVar.a = null;
            lithoScrollView.k = null;
        }
        lithoScrollView.m = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        fhz fhzVar;
        bdb bdbVar;
        Integer num;
        fti ftiVar;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            fuv fuvVar = (fuv) fgyVar;
            fgy fgyVar2 = this.a;
            if (fgyVar2 != null) {
                fgy fgyVar3 = fuvVar.a;
                boolean z = fna.a;
                if (fgyVar2.g(fgyVar3)) {
                    if (this.b == fuvVar.b && ((fhzVar = this.u) == null ? fuvVar.u == null : fhzVar.equals(fuvVar.u)) && this.c == fuvVar.c && this.d == fuvVar.d && this.e == fuvVar.e && this.f == fuvVar.f && ((bdbVar = this.g) == null ? fuvVar.g == null : bdbVar.equals(fuvVar.g)) && this.q == fuvVar.q && ((num = this.r) == null ? fuvVar.r == null : num.equals(fuvVar.r)) && ((ftiVar = this.s) == null ? fuvVar.s == null : ftiVar.equals(fuvVar.s)) && this.t == fuvVar.t) {
                        return true;
                    }
                }
            } else if (fuvVar.a == null) {
                if (this.b == fuvVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 3;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        fuv fuvVar = (fuv) super.l();
        fgy fgyVar = fuvVar.a;
        fuvVar.a = fgyVar != null ? fgyVar.l() : null;
        return fuvVar;
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new fut();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new fuu();
    }
}
