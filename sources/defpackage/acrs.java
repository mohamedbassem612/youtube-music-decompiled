package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acrs extends acrp {
    private final acvc I;
    private final avmm J;
    private final Executor K;
    private final avmb L;
    private final acph M;
    private final aawo N;
    public final acvv s;
    public final acvg y;
    public final hno z;

    public acrs(tqj tqjVar, aenu aenuVar, acph acphVar, hno hnoVar, acvc acvcVar, aawo aawoVar, acvg acvgVar, Executor executor, avmb avmbVar, ViewGroup viewGroup, acvv acvvVar) {
        super(tqjVar, aenuVar, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reel_player_page, viewGroup, false));
        this.M = acphVar;
        this.z = hnoVar;
        this.s = acvvVar;
        this.I = acvcVar;
        this.N = aawoVar;
        this.y = acvgVar;
        this.K = executor;
        this.L = avmbVar;
        this.J = new avmm();
        acvvVar.k = acvcVar;
        ((ViewGroup) this.a.findViewById(R.id.reel_player_page_content)).addView(acvvVar.a(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // defpackage.acrp
    protected final void C(acra acraVar) {
        if (((vxz) this.z.i).l(235, 45789549L, false)) {
            this.K.execute(afwl.i(new acnp(this, acraVar, 7, null)));
        } else {
            Q(acraVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    @Override // defpackage.acrp
    public final void D() {
        acvg acvgVar;
        this.s.j();
        acph acphVar = this.M;
        acphVar.g();
        acphVar.c.b();
        acphVar.i = Optional.empty();
        if (acphVar.h) {
            acpl acplVar = acphVar.l;
            acplVar.c();
            acplVar.d();
        } else {
            acpl acplVar2 = acphVar.l;
            acplVar2.d();
            acplVar2.c();
        }
        View viewS = acphVar.e.s();
        if (viewS != null && acphVar.j.isPresent() && viewS.getViewTreeObserver().isAlive()) {
            viewS.getViewTreeObserver().removeOnGlobalLayoutListener(acphVar.j.get());
            acphVar.j = Optional.empty();
        }
        acvc acvcVar = this.I;
        acvcVar.b.b();
        acvcVar.a.clear();
        acvcVar.a();
        acvcVar.j = false;
        acvcVar.o = null;
        acvcVar.p = null;
        acvcVar.n = null;
        acvcVar.q = null;
        acvcVar.r = null;
        hno hnoVar = this.z;
        hnoVar.bj();
        if (hnoVar.az() && (acvgVar = this.y) != null) {
            ViewGroup viewGroup = acvgVar.d;
            ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(acvgVar.d);
            }
            acvx acvxVar = acvgVar.e;
            if (acvxVar != null) {
                acvxVar.b();
            }
            acvgVar.f = null;
            acvgVar.d = null;
        }
        this.J.b();
    }

    @Override // defpackage.acrp
    public final boolean F() {
        apfp apfpVarC;
        int iAU;
        acra acraVar = this.w;
        return acraVar == null || (apfpVarC = acraVar.c()) == null || (iAU = a.aU(apfpVarC.M)) == 0 || iAU == 1;
    }

    @Override // defpackage.acrp
    public final acvv H() {
        return this.s;
    }

    @Override // defpackage.acrp
    public final Optional I() {
        return Optional.of(this.N);
    }

    @Override // defpackage.acrp
    public final Optional J() {
        return Optional.of(this.M);
    }

    @Override // defpackage.acrp
    public final void N(aazn aaznVar) {
        acph acphVar = this.M;
        Optional optional = acphVar.k;
        acog acogVar = new acog(acphVar, aaznVar, 2, null);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            Object obj2 = acogVar.b;
            Object obj3 = acogVar.a;
            if (((aclu) obj).a) {
                aazn aaznVar2 = (aazn) obj3;
                if (aaznVar2.b()) {
                    acph acphVar2 = (acph) obj2;
                    acphVar2.a(Optional.empty());
                    acphVar2.e();
                } else if (aaznVar2.c()) {
                    ((acph) obj2).l.c();
                }
            }
        }
    }

    @Override // defpackage.acrp
    public final void O(boolean z) {
        super.O(z);
        acvv acvvVar = this.s;
        int i = 1;
        acvvVar.j = true;
        acvvVar.e(z);
        acph acphVar = this.M;
        acphVar.a.c(((avlr) ((adz) acphVar.g.io()).b).ag(new acnt(acphVar, 19), new abxq(19)));
        acphVar.c();
        final acvc acvcVar = this.I;
        if (z && twb.c(acvcVar.f)) {
            acvcVar.b();
        }
        if (acvcVar.m != null) {
            avmm avmmVar = acvcVar.b;
            avmmVar.b();
            abfs abfsVar = acvcVar.c;
            avmmVar.c(abfsVar.d.p().al(new avni() { // from class: acvb
                @Override // defpackage.avni
                public final void a(Object obj) {
                    View view;
                    acqz acqzVar;
                    acqh acqhVar;
                    acra acraVarJ;
                    acqz acqzVar2;
                    acqh acqhVar2;
                    acra acraVarJ2;
                    acqh acqhVar3;
                    acqh acqhVar4;
                    boolean z2 = ((abfq) obj).a;
                    acvc acvcVar2 = acvcVar;
                    if (z2) {
                        if (acvcVar2.k == null && acvcVar2.l != null) {
                            if (((vxz) acvcVar2.t.i).l(251, 45798857L, false)) {
                                acvcVar2.l.setLayoutResource(R.layout.iwf_a11y_controls_with_lens);
                            } else {
                                acvcVar2.l.setLayoutResource(R.layout.iwf_a11y_controls);
                            }
                            ViewGroup viewGroup = (ViewGroup) acvcVar2.l.inflate();
                            acvcVar2.k = (LinearLayout) viewGroup.findViewById(R.id.reel_a11y_controls);
                        }
                        if (acvcVar2.k != null) {
                            Context context = acvcVar2.f;
                            int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
                            LinearLayout linearLayout = (LinearLayout) acvcVar2.k.findViewById(R.id.reel_a11y_horizontal_container);
                            if (linearLayout != null) {
                                linearLayout.setLayoutDirection(layoutDirection);
                            }
                            acvcVar2.o = acvcVar2.k.findViewById(R.id.reel_prev_reel_button);
                            acvcVar2.o.setOnClickListener(new yde(acvcVar2, 7));
                            acvcVar2.p = acvcVar2.k.findViewById(R.id.reel_next_reel_button);
                            acvcVar2.p.setOnClickListener(new yde(acvcVar2, 8));
                            acvcVar2.q = acvcVar2.k.findViewById(R.id.reel_horizontal_prev_reel_button);
                            View view2 = acvcVar2.q;
                            if (view2 != null) {
                                view2.setRotation(layoutDirection == 1 ? 180.0f : 0.0f);
                                acvcVar2.q.setOnClickListener(new yde(acvcVar2, 9));
                            }
                            acvcVar2.r = acvcVar2.k.findViewById(R.id.reel_horizontal_next_reel_button);
                            View view3 = acvcVar2.r;
                            if (view3 != null) {
                                view3.setRotation(layoutDirection != 1 ? 0.0f : 180.0f);
                                acvcVar2.r.setOnClickListener(new yde(acvcVar2, 10));
                            }
                            acvcVar2.n = (ImageView) acvcVar2.k.findViewById(R.id.reel_play_pause_button);
                            if (acvcVar2.j) {
                                acvcVar2.n.setOnClickListener(new yde(acvcVar2, 11));
                                acvcVar2.g = new abgk(acvcVar2.n, context, true, true);
                            }
                        }
                        LinearLayout linearLayout2 = acvcVar2.k;
                        if (linearLayout2 != null) {
                            tuk.l(linearLayout2, true);
                            View view4 = acvcVar2.o;
                            if (view4 != null) {
                                acmx acmxVar = acvcVar2.s;
                                long j = acvcVar2.h;
                                acqz acqzVar3 = acmxVar.a;
                                view4.setVisibility((!(acqzVar3.Q() && acqzVar3.L()) && ((acqhVar4 = acqzVar3.ag) == null || acqhVar4.A(j) == acqzVar3.ag.B())) ? 4 : 0);
                            }
                            View view5 = acvcVar2.p;
                            if (view5 != null) {
                                acmx acmxVar2 = acvcVar2.s;
                                long j2 = acvcVar2.h;
                                acqz acqzVar4 = acmxVar2.a;
                                view5.setVisibility(((!acqzVar4.Q() || acqzVar4.b.m) && ((acqhVar3 = acqzVar4.ag) == null || acqhVar3.A(j2) == acqzVar4.ag.C())) ? 4 : 0);
                            }
                            View view6 = acvcVar2.q;
                            if (view6 != null) {
                                acmx acmxVar3 = acvcVar2.s;
                                view6.setVisibility((!acmxVar3.c.aP() || (acqhVar2 = (acqzVar2 = acmxVar3.a).ag) == null || !acqzVar2.ak || (acraVarJ2 = acqhVar2.J(acvcVar2.h)) == null || !acraVarJ2.l() || acvcVar2.i <= 0) ? 4 : 0);
                            }
                            View view7 = acvcVar2.r;
                            if (view7 != null) {
                                acmx acmxVar4 = acvcVar2.s;
                                view7.setVisibility((!acmxVar4.c.aP() || (acqhVar = (acqzVar = acmxVar4.a).ag) == null || !acqzVar.ak || (acraVarJ = acqhVar.J(acvcVar2.h)) == null || !acraVarJ.l() || acvcVar2.i >= ((long) (acraVarJ.o.size() + (-1)))) ? 4 : 0);
                            }
                            ImageView imageView = acvcVar2.n;
                            if (imageView != null) {
                                imageView.setVisibility(true != acvcVar2.j ? 4 : 0);
                            }
                            int i2 = acvcVar2.s.b;
                            int i3 = i2 - 1;
                            if (i2 == 0) {
                                throw null;
                            }
                            if (i3 == 1) {
                                view = acvcVar2.o;
                            } else if (i3 == 2) {
                                view = acvcVar2.p;
                            } else if (i3 != 3) {
                                view = i3 != 4 ? null : acvcVar2.r;
                            } else {
                                view = acvcVar2.q;
                            }
                            if (view != null && view.getVisibility() == 0) {
                                view.performAccessibilityAction(64, null);
                            }
                            apfg apfgVar = acvcVar2.m;
                            if (apfgVar != null) {
                                xgn xgnVar = acvcVar2.e;
                                amud amudVar = apfgVar.c;
                                if (amudVar == null) {
                                    amudVar = amud.b;
                                }
                                xgnVar.w(new xgj(amudVar), null);
                            }
                        }
                    } else {
                        acvcVar2.a();
                    }
                    for (ime imeVar : acvcVar2.a) {
                    }
                    if (z2) {
                        acvcVar2.b();
                    }
                }
            }, new acrr(8)));
            avmmVar.c(((avlh) acvcVar.d.r().o).al(new acym(acvcVar, i), new acrr(8)));
            abfsVar.a();
        }
    }

    @Override // defpackage.acrp
    public final void P() {
        super.P();
        acvv acvvVar = this.s;
        acvvVar.j = false;
        acvvVar.f();
        acvc acvcVar = this.I;
        acvcVar.b.b();
        acvcVar.a.clear();
        acvcVar.a();
        this.z.bj();
    }

    public final void Q(acra acraVar) {
        acph acphVar;
        View view = this.a;
        apfp apfpVarC = acraVar.c();
        ImageView imageView = (ImageView) view.findViewById(R.id.reel_player_page_frame0);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.reel_player_page_current_frame_snapshot);
        acvv acvvVar = this.s;
        aclu acluVarB = acvvVar.b();
        Optional optionalOf = Optional.of(apfpVarC);
        acph acphVar2 = this.M;
        acphVar2.i = optionalOf;
        final acpl acplVar = acphVar2.l;
        acvf acvfVar = acphVar2.e;
        acvfVar.f();
        hno hnoVar = acphVar2.m;
        if (!hnoVar.aC()) {
            acplVar.g = acvfVar.r();
        }
        imageView2.getClass();
        acplVar.f = imageView2;
        acphVar2.k = Optional.ofNullable(acluVarB);
        imageView.getClass();
        acplVar.e = imageView;
        if (!((vxz) acplVar.m.i).l(88, 45646094L, false)) {
            imageView.setBackgroundColor(imageView.getContext().getColor(R.color.reel_player_background));
        }
        acplVar.n = new adif(new ColorDrawable(imageView.getContext().getResources().getColor(R.color.yt_black4)));
        adhv adhvVar = acplVar.d;
        tym tymVar = acplVar.o;
        adhs adhsVar = new adhs() { // from class: acpi
            @Override // defpackage.adhs
            public final adif a() {
                return acplVar.n;
            }
        };
        adhvVar.getClass();
        tymVar.getClass();
        acplVar.h = new adia(adhvVar, tymVar, adhsVar, imageView, true);
        int i = 1;
        if ((apfpVarC.c & SemanticState.ReadOnly) != 0) {
            if (((vxz) hnoVar.i).l(223, 45780209L, false)) {
                avmm avmmVar = acphVar2.c;
                avmmVar.b();
                avmmVar.c(acluVarB.e.p().L(acphVar2.f).ak(new acnt(acphVar2, 20)));
            }
            if (!hnoVar.aC() || acvfVar.r().getHeight() > 0) {
                acphVar = acphVar2;
                acphVar.d(apfpVarC);
            } else {
                View viewS = acvfVar.s();
                if (viewS != null) {
                    Class<?> cls = acphVar2.getClass();
                    ViewTreeObserver viewTreeObserver = viewS.getViewTreeObserver();
                    acphVar = acphVar2;
                    acpg acpgVar = new acpg(acphVar, cls.getSimpleName(), viewS, apfpVarC, viewTreeObserver);
                    viewTreeObserver.addOnGlobalLayoutListener(acpgVar);
                    acphVar.j = Optional.of(acpgVar);
                } else {
                    acphVar = acphVar2;
                }
            }
            if (hnoVar.aK()) {
                acphVar.b.c(nsj.f().p().ay().ak(new acpf(acphVar, i)));
            }
        } else {
            acplVar.d();
        }
        acvc acvcVar = this.I;
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.iwf_a11y_controls);
        long j = acraVar.q;
        long j2 = acraVar.b;
        acvcVar.l = viewStub;
        acvcVar.h = j;
        acvcVar.i = j2;
        if ((apfpVarC.d & 65536) != 0) {
            apji apjiVar = apfpVarC.S;
            if (apjiVar == null) {
                apjiVar = apji.a;
            }
            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfh.a);
            apjiVar.c(aihlVarCheckIsLite);
            Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
            acvcVar.m = (apfg) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
            acvcVar.j = acvcVar.m.b;
        }
        hno hnoVar2 = this.z;
        if (hnoVar2.az()) {
            acvg acvgVar = this.y;
            acvgVar.d = new FrameLayout(acvgVar.a);
        }
        acvvVar.c(acraVar.f);
        avmm avmmVar2 = this.J;
        avmmVar2.c(acraVar.d().af(new acpf(this, 18)));
        avlr avlrVarAq = acraVar.e.r().aq();
        if (!((vxz) hnoVar2.m).l(113, 45832542L, false)) {
            acvvVar.getClass();
            avmmVar2.c(avlrVarAq.af(new acrr(1)));
        } else {
            avlr avlrVarO = avlrVarAq.O(this.L);
            acvvVar.getClass();
            avmmVar2.c(avlrVarO.ag(new acrr(1), new acrr(0)));
        }
    }
}
