package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frw extends fkx {
    public static final /* synthetic */ int G = 0;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int A;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int B;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public oq C;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int D;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public mhc E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public qa F;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public fpx a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    CharSequence e;

    @fmt(a = 3)
    @fmu(a = fmv.h)
    public int f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nl g;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int q;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int r;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean s;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public nt t;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    public List u;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int v;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public ftc x;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int y;

    @fmt(a = 11)
    @fmu(a = fmv.a)
    public fip z;

    public frw() {
        super("Recycler");
        this.b = 0;
        this.c = true;
        this.d = true;
        this.g = ftf.a;
        this.r = 0;
        this.s = true;
        this.u = Collections.EMPTY_LIST;
        this.v = 0;
        this.w = true;
        this.y = -1;
        this.A = -16777216;
        this.B = 0;
        this.D = 0;
    }

    @Override // defpackage.fgy
    protected final Object A(fip fipVar, Object obj) {
        int i = fipVar.c;
        if (i == -1048037474) {
            gzj.bO((fhd) fipVar.d[0], (isw) obj);
        } else if (i == 946341036) {
            fiu fiuVar = fipVar.b;
            fhd fhdVar = (fhd) fipVar.d[0];
            int i2 = ((frv) fhdVar.i().c).a;
            int i3 = ftf.b;
            int i4 = i2 + 1;
            if (fhdVar.c != null) {
                fhdVar.x(new aero(0, new Object[]{Integer.valueOf(i4)}), "updateState:Recycler.onUpdateMeasure");
            }
        }
        return null;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        int i = ftf.b;
        return new ftl(context, new frm(context));
    }

    @Override // defpackage.fgy
    public final void G(fhd fhdVar) {
        frv frvVar = (frv) fhdVar.i().c;
        int i = ftf.b;
        Integer num = 0;
        num.getClass();
        frvVar.a = 0;
    }

    @Override // defpackage.fgy
    protected final void J(fhd fhdVar, Object obj, fiz fizVar) {
        ftl ftlVar = (ftl) obj;
        fpx fpxVar = this.a;
        ftc ftcVar = this.x;
        List list = this.u;
        oq oqVar = this.C;
        boolean z = this.w;
        mhc mhcVar = this.E;
        nt ntVar = this.t;
        fip fipVar = this.z;
        int i = ftf.b;
        ftlVar.setContentDescription(null);
        ftlVar.setEnabled(z && fipVar != null);
        ftlVar.a = fipVar != null ? new ixw(fipVar, 1) : null;
        RecyclerView recyclerView = ftlVar.l;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aC((qa) it.next());
            }
        }
        if (mhcVar != null) {
            ((frm) recyclerView).ae = mhcVar;
        }
        if (ntVar != null) {
            recyclerView.w(ntVar);
        }
        if (oqVar != null && recyclerView.G == null) {
            oqVar.f(recyclerView);
        }
        fpxVar.k();
        if (ftcVar != null) {
            ftcVar.c(ftlVar);
        }
        if (ftlVar.m) {
            recyclerView.requestLayout();
            ftlVar.m = false;
        }
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ftl ftlVar = (ftl) obj;
        RecyclerView recyclerView = ftlVar.l;
        fpx fpxVar = this.a;
        boolean z = this.d;
        int i = this.r;
        int i2 = this.B;
        int i3 = this.D;
        int i4 = this.b;
        int i5 = this.A;
        boolean z2 = this.c;
        boolean z3 = this.s;
        qa qaVar = this.F;
        int i6 = this.f;
        int i7 = this.y;
        int i8 = this.v;
        CharSequence charSequence = this.e;
        nl luVar = this.g;
        int i9 = this.q;
        int i10 = ftf.b;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        recyclerView.setContentDescription(charSequence);
        recyclerView.r = true;
        recyclerView.setClipToPadding(z);
        ftlVar.setClipToPadding(z);
        int i11 = bac.a;
        recyclerView.setPaddingRelative(i, i3, i2, i4);
        recyclerView.setClipChildren(z2);
        ftlVar.setClipChildren(z2);
        recyclerView.setNestedScrollingEnabled(z3);
        ftlVar.setNestedScrollingEnabled(z3);
        recyclerView.setScrollBarStyle(0);
        recyclerView.setHorizontalFadingEdgeEnabled(false);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(i6);
        recyclerView.setId(i7);
        recyclerView.setOverScrollMode(i8);
        ftlVar.i(i5);
        if (qaVar != null) {
            recyclerView.aJ(qaVar);
        }
        if (i9 > 0) {
            recyclerView.ag(i9);
        }
        if (luVar == ftf.a) {
            luVar = new lu((char[]) null);
        }
        ftlVar.n = recyclerView.E;
        recyclerView.af(luVar);
        fpxVar.ai(recyclerView);
    }

    @Override // defpackage.fgy
    public final void N(fky fkyVar, fky fkyVar2) {
        ((frv) fkyVar2).a = ((frv) fkyVar).a;
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

    /* JADX WARN: Code duplicated, block: B:155:0x0260  */
    @Override // defpackage.fgy
    protected final boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        qa qaVar;
        frw frwVar = (frw) fgyVar;
        frw frwVar2 = (frw) fgyVar2;
        fif fifVar = new fif(frwVar == null ? null : frwVar.a, frwVar2 == null ? null : frwVar2.a);
        fif fifVar2 = new fif(frwVar == null ? null : Boolean.TRUE, frwVar2 == null ? null : Boolean.TRUE);
        fif fifVar3 = new fif(frwVar == null ? null : Boolean.valueOf(frwVar.d), frwVar2 == null ? null : Boolean.valueOf(frwVar2.d));
        fif fifVar4 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.r), frwVar2 == null ? null : Integer.valueOf(frwVar2.r));
        fif fifVar5 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.B), frwVar2 == null ? null : Integer.valueOf(frwVar2.B));
        fif fifVar6 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.D), frwVar2 == null ? null : Integer.valueOf(frwVar2.D));
        fif fifVar7 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.b), frwVar2 == null ? null : Integer.valueOf(frwVar2.b));
        fif fifVar8 = new fif(null, null);
        fif fifVar9 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.A), frwVar2 == null ? null : Integer.valueOf(frwVar2.A));
        fif fifVar10 = new fif(frwVar == null ? null : Boolean.valueOf(frwVar.c), frwVar2 == null ? null : Boolean.valueOf(frwVar2.c));
        fif fifVar11 = new fif(frwVar == null ? null : 0, frwVar2 != null ? 0 : null);
        fif fifVar12 = new fif(frwVar == null ? null : frwVar.F, frwVar2 == null ? null : frwVar2.F);
        fif fifVar13 = new fif(frwVar == null ? null : Boolean.FALSE, frwVar2 == null ? null : Boolean.FALSE);
        fif fifVar14 = new fif(frwVar == null ? null : Boolean.FALSE, frwVar2 == null ? null : Boolean.FALSE);
        fif fifVar15 = new fif(frwVar == null ? null : Integer.valueOf(frwVar.f), frwVar2 == null ? null : Integer.valueOf(frwVar2.f));
        fif fifVar16 = new fif(frwVar == null ? null : frwVar.g, frwVar2 == null ? null : frwVar2.g);
        fif fifVar17 = new fif(frwVar == null ? null : Integer.valueOf(((frv) fkyVar).a), frwVar2 == null ? null : Integer.valueOf(((frv) fkyVar2).a));
        int i = ftf.b;
        if (((Integer) fifVar17.a).intValue() == ((Integer) fifVar17.b).intValue() && fifVar.a == fifVar.b && ((Boolean) fifVar2.a).equals(fifVar2.b) && ((Boolean) fifVar3.a).equals(fifVar3.b) && ((Integer) fifVar4.a).equals(fifVar4.b) && ((Integer) fifVar5.a).equals(fifVar5.b) && ((Integer) fifVar6.a).equals(fifVar6.b) && ((Integer) fifVar7.a).equals(fifVar7.b) && ((Boolean) fifVar10.a).equals(fifVar10.b) && ((Integer) fifVar11.a).equals(fifVar11.b) && ((Boolean) fifVar13.a).equals(fifVar13.b) && ((Boolean) fifVar14.a).equals(fifVar14.b) && ((Integer) fifVar15.a).equals(fifVar15.b)) {
            Integer num = (Integer) fifVar8.a;
            Integer num2 = (Integer) fifVar8.b;
            if (num != null ? num.equals(num2) : num2 == null) {
                if (((Integer) fifVar9.a).equals(fifVar9.b)) {
                    nl nlVar = (nl) fifVar16.a;
                    nl nlVar2 = (nl) fifVar16.b;
                    if (nlVar != null) {
                        if (nlVar.getClass().equals(nlVar2.getClass())) {
                            qaVar = (qa) fifVar12.a;
                            qa qaVar2 = (qa) fifVar12.b;
                            return qaVar == null ? false : false;
                        }
                    } else if (nlVar2 == null) {
                        qaVar = (qa) fifVar12.a;
                        qa qaVar3 = (qa) fifVar12.b;
                        if (qaVar == null ? qaVar.equals(qaVar3) : qaVar3 == null) {
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 3;
    }

    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        fpx fpxVar = this.a;
        int i = ftf.b;
        fpxVar.aj(fjiVar.g(), fjiVar.b());
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        fip fipVarO;
        fpx fpxVar = this.a;
        int i3 = ftf.b;
        if (fpxVar.j()) {
            fipVarO = o(frw.class, "Recycler", fhdVar, 946341036, new Object[]{fhdVar});
        } else {
            fpxVar.m();
            fipVarO = null;
        }
        fpxVar.ah(fkwVar, i, i2, fipVarO);
    }

    @Override // defpackage.fgy
    protected final void aq(fhd fhdVar, Object obj) {
        ftl ftlVar = (ftl) obj;
        RecyclerView recyclerView = ftlVar.l;
        fpx fpxVar = this.a;
        ftc ftcVar = this.x;
        nt ntVar = this.t;
        List list = this.u;
        int i = ftf.b;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        fpxVar.l();
        if (ftcVar != null) {
            ftcVar.c(null);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                recyclerView.aE((qa) it.next());
            }
        }
        if (ntVar != null) {
            recyclerView.Z(ntVar);
            recyclerView.Z(ntVar);
        }
        ((frm) recyclerView).ae = null;
        ftlVar.a = null;
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        ftl ftlVar = (ftl) obj;
        RecyclerView recyclerView = ftlVar.l;
        fpx fpxVar = this.a;
        qa qaVar = this.F;
        oq oqVar = this.C;
        int i = ftf.b;
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        recyclerView.setId(-1);
        if (qaVar != null) {
            recyclerView.aH(qaVar);
        }
        fpxVar.i(recyclerView);
        if (oqVar != null) {
            oqVar.f(null);
        }
        recyclerView.af(ftlVar.n);
        ftlVar.n = null;
    }

    @Override // defpackage.fgy
    protected final void av() {
        fpx fpxVar = this.a;
        int i = ftf.b;
        fpxVar.m();
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        CharSequence charSequence;
        nl nlVar;
        qa qaVar;
        nt ntVar;
        List list;
        ftc ftcVar;
        fip fipVar;
        oq oqVar;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            frw frwVar = (frw) fgyVar;
            fpx fpxVar = this.a;
            if (fpxVar == null ? frwVar.a == null : fpxVar.equals(frwVar.a)) {
                if (this.b == frwVar.b && this.c == frwVar.c && this.d == frwVar.d && ((charSequence = this.e) == null ? frwVar.e == null : charSequence.equals(frwVar.e)) && this.f == frwVar.f && ((nlVar = this.g) == null ? frwVar.g == null : nlVar.equals(frwVar.g)) && ((qaVar = this.F) == null ? frwVar.F == null : qaVar.equals(frwVar.F)) && this.q == frwVar.q && this.r == frwVar.r && this.s == frwVar.s && ((ntVar = this.t) == null ? frwVar.t == null : ntVar.equals(frwVar.t)) && ((list = this.u) == null ? frwVar.u == null : list.equals(frwVar.u)) && this.v == frwVar.v && this.w == frwVar.w && ((ftcVar = this.x) == null ? frwVar.x == null : ftcVar.equals(frwVar.x)) && this.y == frwVar.y && ((fipVar = this.z) == null ? frwVar.z == null : fipVar.a(frwVar.z)) && this.A == frwVar.A && this.B == frwVar.B && ((oqVar = this.C) == null ? frwVar.C == null : oqVar.equals(frwVar.C)) && this.D == frwVar.D) {
                    mhc mhcVar = this.E;
                    if (mhcVar != null) {
                        if (mhcVar.equals(frwVar.E)) {
                            return true;
                        }
                    } else if (frwVar.E == null) {
                        return true;
                    }
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
        return (frw) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fky u() {
        return new frv();
    }
}
