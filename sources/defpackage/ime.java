package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ime extends acvv implements Animation.AnimationListener, acnj {
    public static final /* synthetic */ int i = 0;
    private Animation A;
    private izd B;
    private final hno C;
    public final LottieAnimationView a;
    public final vxe b;
    public final xgm c;
    public final jlh d;
    public ajwo e;
    public boolean f;
    public final vxz g;
    public final isi h;
    private final ViewGroup l;
    private final ViewGroup m;
    private final acvx n;
    private final abvn o;
    private final abvk p;
    private final Context q;
    private final RelativeLayout r;
    private final ImageView s;
    private final ImageView t;
    private final avmb u;
    private final avmm v = new avmm();
    private final acnk w;
    private akrn x;
    private apfp y;
    private Animation z;

    public ime(Context context, abvn abvnVar, avmb avmbVar, acvy acvyVar, xgm xgmVar, vxe vxeVar, acnk acnkVar, hno hnoVar, isi isiVar, jlh jlhVar, vxz vxzVar, adxj adxjVar) {
        this.q = context;
        this.o = abvnVar;
        this.p = abvnVar.o();
        this.b = vxeVar;
        this.u = avmbVar;
        this.c = xgmVar;
        this.w = acnkVar;
        this.C = hnoVar;
        this.d = jlhVar;
        this.g = vxzVar;
        ViewGroup viewGroup = (ViewGroup) View.inflate(context, R.layout.reel_samples_video_item, null);
        this.l = viewGroup;
        this.m = (ViewGroup) viewGroup.findViewById(R.id.overlay_elements_container);
        this.r = (RelativeLayout) viewGroup.findViewById(R.id.controls_layout);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.pause_state);
        this.s = imageView;
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.play_state);
        this.t = imageView2;
        this.a = (LottieAnimationView) viewGroup.findViewById(R.id.like_animation);
        this.n = acvyVar.io();
        this.h = isiVar.s((LoadingFrameLayout) viewGroup.findViewById(R.id.loading_spinner_container));
        imageView2.setImageResource(adxjVar.b(arqz.bC));
        imageView.setImageResource(adxjVar.b(arqz.bl));
    }

    private final void m() {
        akrn akrnVar = this.x;
        if (akrnVar != null) {
            this.n.d(this.m, akrnVar, null, this.j);
            izd izdVarAc = kro.ac(this.l, this.x.d.G(), this.c.hB());
            this.B = izdVarAc;
            final int i2 = 1;
            izdVarAc.a(new izc(this) { // from class: imd
                public final /* synthetic */ ime a;

                {
                    this.a = this;
                }

                @Override // defpackage.izc
                public final void a() {
                    if (i2 == 0) {
                        this.a.i();
                        return;
                    }
                    agrx agrxVar = agso.a;
                    ime imeVar = this.a;
                    ajwo ajwoVar = imeVar.e;
                    if (ajwoVar != null) {
                        imeVar.b.a(ajwoVar);
                        ajwo ajwoVar2 = imeVar.e;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
                        ajwoVar2.c(aihlVarCheckIsLite);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                            if (!imeVar.g.m(8, 45661900L)) {
                                imeVar.d.b();
                            }
                            imeVar.d();
                            LottieAnimationView lottieAnimationView = imeVar.a;
                            lottieAnimationView.p(0.0f, true);
                            lottieAnimationView.setVisibility(0);
                            lottieAnimationView.f();
                            imeVar.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(192989)), null);
                        }
                    }
                }
            });
            final int i3 = 0;
            this.B.b(new izc(this) { // from class: imd
                public final /* synthetic */ ime a;

                {
                    this.a = this;
                }

                @Override // defpackage.izc
                public final void a() {
                    if (i3 == 0) {
                        this.a.i();
                        return;
                    }
                    agrx agrxVar = agso.a;
                    ime imeVar = this.a;
                    ajwo ajwoVar = imeVar.e;
                    if (ajwoVar != null) {
                        imeVar.b.a(ajwoVar);
                        ajwo ajwoVar2 = imeVar.e;
                        aihl aihlVarCheckIsLite = aihn.checkIsLite(amla.b);
                        ajwoVar2.c(aihlVarCheckIsLite);
                        if (ajwoVar2.j.n(aihlVarCheckIsLite.d)) {
                            if (!imeVar.g.m(8, 45661900L)) {
                                imeVar.d.b();
                            }
                            imeVar.d();
                            LottieAnimationView lottieAnimationView = imeVar.a;
                            lottieAnimationView.p(0.0f, true);
                            lottieAnimationView.setVisibility(0);
                            lottieAnimationView.f();
                            imeVar.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(192989)), null);
                        }
                    }
                }
            });
        }
    }

    private final void n(boolean z) {
        if (l().isPresent() && ((acvc) l().get()).c()) {
            return;
        }
        if (!z) {
            d();
        } else if (this.p.X()) {
            tuk.l(this.t, true);
        } else {
            tuk.l(this.s, true);
        }
    }

    private final void o() {
        this.v.b();
        Optional optionalL = l();
        imc imcVar = new imc(this, 1);
        if (true == optionalL.isPresent()) {
            Object obj = optionalL.get();
            ((acvc) obj).a.remove(imcVar.a);
        }
    }

    @Override // defpackage.acvv
    public final View a() {
        return this.l;
    }

    @Override // defpackage.acvv
    public final aclu b() {
        aclt acltVarA = aclu.a();
        acltVarA.b(true);
        return acltVarA.a();
    }

    @Override // defpackage.acvv
    public final void c(ajwo ajwoVar) {
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        this.y = (apfp) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        agrx agrxVar = agso.a;
        String str = this.y.o;
    }

    public final void d() {
        if (l().isPresent() && ((acvc) l().get()).c()) {
            return;
        }
        tuk.l(this.t, false);
        tuk.l(this.s, false);
    }

    @Override // defpackage.acvv
    public final void e(boolean z) {
        agrx agrxVar = agso.a;
        int i2 = 0;
        if (z) {
            isi isiVar = this.h;
            isiVar.l();
            ((LoadingFrameLayout) isiVar.c).setVisibility(0);
            isiVar.p();
        }
        m();
        this.f = false;
        Context context = this.q;
        int integer = context.getResources().getInteger(R.integer.immersive_fade_duration_slow);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, android.R.anim.fade_out);
        this.z = animationLoadAnimation;
        animationLoadAnimation.setDuration(integer);
        this.z.setAnimationListener(this);
        int integer2 = context.getResources().getInteger(R.integer.immersive_fade_duration_fast);
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, android.R.anim.fade_in);
        this.A = animationLoadAnimation2;
        animationLoadAnimation2.setDuration(integer2);
        this.A.setAnimationListener(this);
        int i3 = 14;
        int i4 = 7;
        if (this.y != null) {
            avmm avmmVar = this.v;
            avmmVar.b();
            abvn abvnVar = this.o;
            avlh avlhVarW = abvnVar.C().p().W(new hpr(i3));
            avmb avmbVar = this.u;
            avmmVar.e(avlhVarW.L(avmbVar).al(new ifo(this, 15), new ido(i4)), ((avlh) abvnVar.r().o).al(new ifo(this, 16), new ido(i4)), ((avlh) abvnVar.r().k).L(avmbVar).al(new ifo(this, 13), new ido(i4)));
            Optional optionalL = l();
            imc imcVar = new imc(this, i2);
            if (true == optionalL.isPresent()) {
                ((acvc) optionalL.get()).a.add(imcVar.a);
            }
        }
        if (this.C.ac()) {
            this.v.c(this.w.b().B(new hxe(i3)).ag(new ifo(this, i3), new ido(i4)));
        } else {
            this.w.c(this);
        }
        xgm xgmVar = this.c;
        xgmVar.hB().l(new xgj(xhb.b(176036)));
        xgmVar.hB().l(new xgj(xhb.b(192989)));
    }

    @Override // defpackage.acvv
    public final void f() {
        if (this.C.ac()) {
            o();
        } else {
            this.w.g(this);
        }
    }

    @Override // defpackage.acnj
    public final void g() {
        this.h.l();
    }

    @Override // defpackage.acvv
    public final void h(alqc alqcVar) {
        agrx agrxVar = agso.a;
        apez apezVar = alqcVar.d;
        if (apezVar == null) {
            apezVar = apez.a;
        }
        apji apjiVar = (apezVar.b == 36890 ? (apgc) apezVar.c : apgc.a).b;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akrs.a);
        apjiVar.c(aihlVarCheckIsLite);
        Object objK = apjiVar.j.k(aihlVarCheckIsLite.d);
        this.x = (akrn) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        apez apezVar2 = alqcVar.d;
        if (apezVar2 == null) {
            apezVar2 = apez.a;
        }
        ajwo ajwoVar = (apezVar2.b == 36890 ? (apgc) apezVar2.c : apgc.a).c;
        if (ajwoVar == null) {
            ajwoVar = ajwo.a;
        }
        this.e = ajwoVar;
        m();
    }

    public final void i() {
        Animation animation;
        agrx agrxVar = agso.a;
        RelativeLayout relativeLayout = this.r;
        relativeLayout.clearAnimation();
        if (!this.f && (animation = this.A) != null) {
            relativeLayout.startAnimation(animation);
        }
        abvk abvkVar = this.p;
        if (abvkVar.X()) {
            abvkVar.ap(false, 2);
        } else {
            abvkVar.A();
        }
        this.c.hB().o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(176036)), null);
    }

    @Override // defpackage.acvv
    public final void j() {
        this.n.b();
        this.x = null;
        this.y = null;
        this.r.clearAnimation();
        izd izdVar = this.B;
        if (izdVar != null) {
            izdVar.c();
        }
        izd izdVar2 = this.B;
        if (izdVar2 != null) {
            izdVar2.c();
        }
        o();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation != this.A) {
            n(false);
            return;
        }
        n(true);
        Animation animation2 = this.z;
        if (animation2 != null) {
            this.r.startAnimation(animation2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
