package defpackage;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.youtube.music.R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqo implements abjj, tbj {
    private final aunn A;
    private final View B;
    private final View C;
    private boolean D;
    private hyz E;
    public final aunn a;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
    public final jqv f;
    public final aunn g;
    public final aunn h;
    public final avmb i;
    public final aunn j;
    public final ViewPager2 k;
    public final ViewPager2 l;
    public final jqr m;
    public final int n;
    public final avmm o = new avmm();
    public final jqm p;
    public final jql q;
    public final iqv r;
    public final ValueAnimator s;
    public int t;
    public boolean u;
    public aboe v;
    public final jnj w;
    public final hwz x;
    private final cf y;
    private final View z;

    /* JADX WARN: Type inference failed for: r10v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [awmd, java.lang.Object] */
    public jqo(FrameLayout frameLayout, FrameLayout frameLayout2, cf cfVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, hwz hwzVar, aunn aunnVar6, jqs jqsVar, aerj aerjVar, jnm jnmVar, aunn aunnVar7, aunn aunnVar8, avmb avmbVar, jnj jnjVar, aunn aunnVar9) {
        this.y = cfVar;
        this.B = cfVar.findViewById(R.id.mini_player_metadata);
        this.z = cfVar.findViewById(R.id.watch_fragment);
        this.A = aunnVar;
        this.a = aunnVar2;
        this.b = aunnVar3;
        this.x = hwzVar;
        this.e = aunnVar6;
        this.c = aunnVar4;
        this.d = aunnVar5;
        this.g = aunnVar7;
        this.h = aunnVar8;
        this.i = avmbVar;
        this.w = jnjVar;
        this.j = aunnVar9;
        this.C = cfVar.findViewById(R.id.mini_player_view_pager_fade_edge);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(frameLayout.getContext());
        ViewPager2 viewPager2 = (ViewPager2) layoutInflaterFrom.inflate(R.layout.player_view_pager, frameLayout).findViewById(R.id.player_view_pager);
        this.k = viewPager2;
        abjr abjrVar = ((abjp) aunnVar3.io()).b;
        cf cfVar2 = (cf) aerjVar.a.io();
        cfVar2.getClass();
        adhv adhvVar = (adhv) aerjVar.d.io();
        adhvVar.getClass();
        hwz hwzVar2 = (hwz) aerjVar.b.io();
        hwzVar2.getClass();
        ?? Io = aerjVar.f.io();
        Io.getClass();
        ?? Io2 = aerjVar.e.io();
        Io2.getClass();
        ((adul) aerjVar.c.io()).getClass();
        kjc kjcVar = (kjc) aerjVar.g.io();
        kjcVar.getClass();
        jqv jqvVar = new jqv(abjrVar, cfVar2, adhvVar, hwzVar2, Io, Io2, kjcVar);
        this.f = jqvVar;
        viewPager2.d(jqvVar);
        viewPager2.setClipToPadding(false);
        this.n = (int) frameLayout.getContext().getResources().getDimension(R.dimen.swipeable_album_art_page_margin);
        viewPager2.setClipChildren(false);
        this.p = new jqm(this);
        ViewPager2 viewPager3 = (ViewPager2) layoutInflaterFrom.inflate(R.layout.mini_player_view_pager, frameLayout2).findViewById(R.id.mini_player_view_pager);
        this.l = viewPager3;
        abjr abjrVar2 = ((abjp) aunnVar3.io()).b;
        adhv adhvVar2 = (adhv) jqsVar.a.io();
        adhvVar2.getClass();
        hwz hwzVar3 = (hwz) jqsVar.b.io();
        hwzVar3.getClass();
        cf cfVar3 = (cf) jqsVar.c.io();
        cfVar3.getClass();
        ?? Io3 = jqsVar.d.io();
        Io3.getClass();
        Executor executor = (Executor) jqsVar.e.io();
        executor.getClass();
        avmb avmbVar2 = (avmb) jqsVar.f.io();
        avmbVar2.getClass();
        jqsVar.g.io().getClass();
        ?? Io4 = jqsVar.h.io();
        Io4.getClass();
        ((adul) jqsVar.i.io()).getClass();
        ?? Io5 = jqsVar.j.io();
        Io5.getClass();
        jqr jqrVar = new jqr(abjrVar2, adhvVar2, hwzVar3, cfVar3, Io3, executor, avmbVar2, Io4, Io5);
        this.m = jqrVar;
        viewPager3.g(new jqk());
        viewPager3.d(jqrVar);
        viewPager3.setClipToPadding(false);
        viewPager3.setClipChildren(false);
        this.q = new jql(this);
        this.s = new ValueAnimator();
        this.r = jnmVar.c(cfVar);
    }

    private final void m(int i) {
        ((xgn) this.g.io()).d(new xgj(xhb.b(i)));
    }

    private final void n() {
        if (!l() || this.D || this.u || o() || ((abjp) this.b.io()).b.isEmpty()) {
            ViewPager2 viewPager2 = this.l;
            viewPager2.setVisibility(8);
            viewPager2.h(false);
            return;
        }
        ViewPager2 viewPager3 = this.l;
        viewPager3.setVisibility(0);
        viewPager3.h(true);
        cf cfVar = this.y;
        iqv iqvVar = this.r;
        afxd afxdVarF = afxd.f(iqvVar.c());
        gpr gprVar = new gpr(10);
        Executor executor = iqvVar.c;
        taf.k(cfVar, afxdVarF.h(gprVar, executor).b(Throwable.class, new iqj(11), executor), new jco(6), new jlz(this, 9));
    }

    private final boolean o() {
        aboe aboeVar = this.v;
        if (aboeVar != null) {
            int i = aboeVar.j;
            if (aawb.B(i) && !aawb.C(i, 15)) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        if (!j() || this.u || o()) {
            ViewPager2 viewPager2 = this.k;
            viewPager2.setVisibility(8);
            viewPager2.h(false);
        } else {
            ViewPager2 viewPager3 = this.k;
            viewPager3.setVisibility(0);
            viewPager3.h(true);
        }
        n();
    }

    public final void b(int i, boolean z) {
        this.k.e(i, z);
        ViewPager2 viewPager2 = this.l;
        if (!viewPager2.j()) {
            viewPager2.e(i, z);
        }
        this.v = null;
        a();
        m(99176);
        m(99175);
        m(173811);
        m(173810);
    }

    @Override // defpackage.tbj
    public final void d(int i, int i2) {
        if (((vxz) this.j.io()).l(85, 45746502L, false)) {
            this.i.e(new jie(this, i, i2, 6));
        } else {
            this.f.l(i, i2);
            this.m.l(i, i2);
        }
    }

    public final void f(boolean z) {
        this.D = z;
        if (z) {
            aunn aunnVar = this.b;
            if (!((abjp) aunnVar.io()).b.isEmpty()) {
                ((abjp) aunnVar.io()).r();
            }
        }
        n();
    }

    public final void g(boolean z) {
        ((hfn) this.c.io()).x();
        if (!z && l()) {
            this.l.setAlpha(1.0f);
            this.C.setAlpha(1.0f);
            this.B.setVisibility(4);
            this.z.setVisibility(4);
            return;
        }
        this.B.setVisibility(0);
        this.z.setVisibility(0);
        ViewPager2 viewPager2 = this.l;
        viewPager2.setAlpha(0.0f);
        this.C.setAlpha(0.0f);
        jqr jqrVar = this.m;
        int i = viewPager2.a;
        jqrVar.l = i;
        jqrVar.h.execute(afwl.i(new gkw(jqrVar, i, 2)));
    }

    public final void h(boolean z) {
        ((hfn) this.c.io()).x();
        if (z || !j()) {
            this.z.setVisibility(0);
            this.k.setAlpha(0.0f);
        } else {
            this.k.setAlpha(1.0f);
            this.z.setVisibility(4);
            ((hwc) this.A.io()).g();
        }
    }

    @Override // defpackage.abjj
    public final void ho(int i, int i2) {
        if (((vxz) this.j.io()).l(85, 45746502L, false)) {
            this.i.e(new jie(this, i, i2, 5));
        } else {
            i(i, i2);
        }
    }

    public final void i(int i, int i2) {
        hyz hyzVar = (hyz) ((abjp) this.b.io()).k(this.w.q());
        boolean z = false;
        if (hyzVar != this.E && i >= 0 && i2 >= 0 && Math.abs(i2 - i) == 1 && hwz.k(this.x.f())) {
            z = true;
        }
        b(i2, z);
        this.E = hyzVar;
    }

    public final boolean j() {
        int iOrdinal = ((hfn) this.c.io()).x().ordinal();
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return this.w.s();
        }
        if (iOrdinal == 6) {
            return ((vxz) this.j.io()).l(105, 45795183L, false);
        }
        return false;
    }

    @Override // defpackage.tbj
    public final void jT(int i, int i2) {
        if (((vxz) this.j.io()).l(85, 45746502L, false)) {
            this.i.e(new jie(this, i, i2, 3));
        } else {
            this.f.j(i, i2);
            this.m.j(i, i2);
        }
    }

    @Override // defpackage.tbj
    public final void jU(int i, int i2) {
        if (((vxz) this.j.io()).l(85, 45746502L, false)) {
            this.i.e(new jie(this, i, i2, 4));
        } else {
            this.f.m(i, i2);
            this.m.m(i, i2);
        }
    }

    @Override // defpackage.tbj
    public final void k(int i, int i2) {
        if (((vxz) this.j.io()).l(85, 45746502L, false)) {
            this.i.e(new jie(this, i, i2, 7));
        } else {
            this.f.j(i, 1);
            this.m.j(i, 1);
        }
    }

    public final boolean l() {
        hww hwwVarX = ((hfn) this.c.io()).x();
        return this.w.p() ? hwwVarX.b(hww.b, hww.e, hww.f) : hwwVarX.b(hww.b, hww.e);
    }
}
