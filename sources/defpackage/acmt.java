package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acmt implements bnu {
    public boolean a;
    public final avmm b;
    public boolean c;
    public ViewGroup d;
    public String e;
    public final hno f;
    private final acvx g;
    private final acqz h;
    private final acng i;
    private boolean j;
    private final avmm k;
    private avmn l;
    private ViewGroup m;
    private Integer n;
    private boolean o;
    private Boolean p;
    private RecyclerView q;
    private qa r;
    private final adif s;

    public acmt(acvx acvxVar, acqz acqzVar, hno hnoVar, acng acngVar, adif adifVar) {
        acqzVar.getClass();
        hnoVar.getClass();
        acngVar.getClass();
        adifVar.getClass();
        this.g = acvxVar;
        this.h = acqzVar;
        this.f = hnoVar;
        this.i = acngVar;
        this.s = adifVar;
        this.b = new avmm();
        this.k = new avmm();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, RecyclerView recyclerView) {
        layoutInflater.getClass();
        recyclerView.getClass();
        if (!this.a) {
            this.d = null;
            this.m = null;
            return null;
        }
        View viewInflate = layoutInflater.inflate(R.layout.reel_bottom_action_bar, viewGroup, false);
        this.d = (ViewGroup) viewInflate.findViewById(R.id.reel_bottom_action_bar);
        this.m = (ViewGroup) viewInflate.findViewById(R.id.reel_bottom_action_bar_container);
        g();
        Integer num = this.n;
        if (num != null) {
            int iIntValue = num.intValue();
            this.n = null;
            e(iIntValue);
        }
        this.q = recyclerView;
        if (this.j && this.r == null && this.f.r() && this.j) {
            acmp acmpVar = new acmp(this);
            this.r = acmpVar;
            RecyclerView recyclerView2 = this.q;
            if (recyclerView2 != null) {
                recyclerView2.aC(acmpVar);
            }
        }
        return viewInflate;
    }

    public final void b(alqc alqcVar) {
        ViewGroup viewGroup;
        if (alqcVar == null || this.d == null || !this.a) {
            return;
        }
        akrn akrnVar = null;
        if ((alqcVar.b & 16777216) != 0) {
            apji apjiVar = alqcVar.w;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
            apjiVar.c(aihlVarCheckIsLite);
            if (apjiVar.j.n(aihlVarCheckIsLite.d)) {
                apji apjiVar2 = alqcVar.w;
                if (apjiVar2 == null) {
                    apjiVar2 = apji.a;
                }
                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(akrs.a);
                apjiVar2.c(aihlVarCheckIsLite2);
                Object objK = apjiVar2.j.k(aihlVarCheckIsLite2.d);
                akrnVar = (akrn) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
            }
        }
        acvx acvxVar = this.g;
        if (akrnVar == null) {
            acvxVar.b();
            return;
        }
        acvxVar.d(this.d, akrnVar, this.e, true);
        if (this.f.r() && this.j && (viewGroup = this.d) != null) {
            viewGroup.setVisibility(0);
            viewGroup.setAlpha(0.0f);
            viewGroup.animate().alpha(1.0f).start();
        }
    }

    public final void c() {
        ViewGroup viewGroup;
        this.b.b();
        hno hnoVar = this.f;
        if (hnoVar.n()) {
            this.e = null;
        }
        if (this.d != null) {
            this.g.b();
            if (hnoVar.r() && (viewGroup = this.d) != null) {
                viewGroup.removeAllViews();
            }
        }
        this.n = null;
        e(0);
        d(false);
    }

    public final void d(boolean z) {
        if (this.o != z) {
            this.o = z;
            g();
        }
    }

    public final void e(int i) {
        Integer num = this.n;
        if (num == null || num.intValue() != i) {
            this.n = Integer.valueOf(i);
            ViewGroup viewGroup = this.m;
            if (viewGroup != null) {
                tym.h(viewGroup, new tyi(i, 0), ViewGroup.MarginLayoutParams.class);
            }
        }
    }

    public final void f(apfu apfuVar) {
        hno hnoVar = this.f;
        boolean z = false;
        if ((hnoVar.am() || hnoVar.r()) && (apfuVar.b & SemanticState.Focused) != 0) {
            apdp apdpVar = apfuVar.i;
            if (apdpVar == null) {
                apdpVar = apdp.a;
            }
            if (apdpVar.b) {
                z = true;
            }
        }
        this.a = z;
        apdp apdpVar2 = apfuVar.i;
        if (apdpVar2 == null) {
            apdpVar2 = apdp.a;
        }
        this.j = apdpVar2.c;
    }

    public final void g() {
        if (this.d != null) {
            Boolean bool = this.p;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            hno hnoVar = this.f;
            boolean z = (hnoVar.an() && this.c) || (zBooleanValue && (!hnoVar.aA() || this.o));
            ViewGroup viewGroup = this.m;
            if (viewGroup != null) {
                viewGroup.setVisibility(true == z ? 8 : 0);
            }
        }
    }

    public final void h(boolean z) {
        Boolean bool = this.p;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (awrc.c(bool, boolValueOf)) {
            return;
        }
        this.p = boolValueOf;
        g();
    }

    @Override // defpackage.bnu
    public final void onCreate(bog bogVar) {
        if (this.f.an()) {
            avmm avmmVar = this.k;
            adif adifVar = this.s;
            avmmVar.c(((avlr) adifVar.a).ag(new acjp(new hho(this, 18, (float[][][]) null), 18), new acjp(acmq.a, 19)));
        }
    }

    @Override // defpackage.bnu
    public final void onDestroy(bog bogVar) {
        RecyclerView recyclerView;
        avmn avmnVar = this.l;
        if (avmnVar != null) {
            avmnVar.dispose();
        }
        this.l = null;
        if (this.f.an()) {
            this.k.b();
            this.c = false;
        }
        qa qaVar = this.r;
        if (qaVar != null && (recyclerView = this.q) != null) {
            recyclerView.aE(qaVar);
        }
        this.r = null;
        this.q = null;
        c();
        this.d = null;
        this.m = null;
    }

    @Override // defpackage.bnu
    public final void onPause(bog bogVar) {
        if (this.a) {
            avmn avmnVar = this.l;
            if (avmnVar != null) {
                avmnVar.dispose();
            }
            this.l = null;
        }
    }

    @Override // defpackage.bnu
    public final void onResume(bog bogVar) {
        if (this.a) {
            avmn avmnVar = this.l;
            if (avmnVar != null) {
                avmnVar.dispose();
            }
            acqz acqzVar = this.h;
            int i = 13;
            this.l = new avmm(acqzVar.al.ag(new acjp(new acjn(this, i), 12), new acjp(acmr.a, i)), this.i.g.al(new acjp(new acqe((Object) this, 1, (byte[]) null), 14), new acjp(acms.a, 15)));
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
