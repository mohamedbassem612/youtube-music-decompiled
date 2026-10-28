package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.music.ui.components.chipcloud.ChipCloudChipView;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnc {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/watch/PlayerOverlayChipPresenter");
    private final Animation A;
    public final aunn b;
    public final aunn c;
    public final aunn d;
    public final avmb e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final ChipCloudChipView i;
    private final aunn q;
    private final aunn r;
    private final aunn s;
    private final aunn t;
    private final awmd u;
    private final awmd v;
    private final aunn w;
    private final aunn x;
    private final aunn y;
    private final Animation z;
    public final jnd p = new jnd(this);
    public boolean j = false;
    public boolean k = false;
    private boolean B = false;
    public ibh l = ibh.ATV_PREFERRED;
    public Optional m = Optional.empty();
    public final Map n = new HashMap();
    public final Map o = new HashMap();

    public jnc(ChipCloudChipView chipCloudChipView, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, avmb avmbVar, aunn aunnVar7, aunn aunnVar8, awmd awmdVar, awmd awmdVar2, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13) {
        this.i = chipCloudChipView;
        this.q = aunnVar;
        this.r = aunnVar2;
        this.s = aunnVar3;
        this.b = aunnVar4;
        this.c = aunnVar5;
        this.d = aunnVar6;
        this.e = avmbVar;
        this.t = aunnVar7;
        this.f = aunnVar8;
        this.u = awmdVar;
        this.v = awmdVar2;
        this.w = aunnVar9;
        this.x = aunnVar10;
        this.y = aunnVar11;
        this.g = aunnVar12;
        this.h = aunnVar13;
        Context context = chipCloudChipView.getContext();
        context.getClass();
        Resources resources = chipCloudChipView.getResources();
        resources.getClass();
        this.z = AnimationUtils.loadAnimation(context, R.anim.fade_out);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in);
        this.A = animationLoadAnimation;
        animationLoadAnimation.setDuration(resources.getInteger(R.integer.config_shortAnimTime));
    }

    private final amdd g(dii diiVar) {
        aihf aihfVarCreateBuilder = amdg.a.createBuilder();
        xrx xrxVar = (xrx) this.t.io();
        if (xrxVar != null) {
            int iL = xrxVar.l(diiVar);
            aihfVarCreateBuilder.copyOnWrite();
            amdg amdgVar = (amdg) aihfVarCreateBuilder.instance;
            amdgVar.c = iL - 1;
            amdgVar.b |= 1;
        }
        aihf aihfVarCreateBuilder2 = amdd.a.createBuilder();
        amdg amdgVar2 = (amdg) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        amdd amddVar = (amdd) aihfVarCreateBuilder2.instance;
        amdgVar2.getClass();
        amddVar.f = amdgVar2;
        amddVar.b |= 4;
        return (amdd) aihfVarCreateBuilder2.build();
    }

    private final void h(int i, dii diiVar, Map map) {
        xgt xgtVarA;
        xgn xgnVar = (xgn) this.q.io();
        if (xgnVar == null || (xgtVarA = xgnVar.a()) == null) {
            return;
        }
        String strA = xrx.a(diiVar);
        xgx xgxVar = (xgx) map.get(strA);
        if (xgxVar == null) {
            xgxVar = new xgx(xgtVarA, xhb.b(i));
            map.put(strA, xgxVar);
        }
        xgnVar.d(xgxVar);
        xgnVar.w(xgxVar, g(diiVar));
    }

    public final Optional a() {
        if (!this.m.isEmpty() && (((ajsy) this.m.get()).b & 32768) != 0) {
            amyl amylVar = ((ajsy) this.m.get()).o;
            if (amylVar == null) {
                amylVar = amyl.a;
            }
            if (!amylVar.f.isEmpty()) {
                abxv abxvVar = (abxv) this.r.io();
                if (abxvVar == null) {
                    return Optional.empty();
                }
                Optional optionalFindFirst = Collection.EL.stream(abxvVar.l(true)).filter(new jmy(this, 0)).findFirst();
                if (optionalFindFirst.isEmpty()) {
                    return Optional.empty();
                }
                dii diiVar = (dii) optionalFindFirst.get();
                if (!diiVar.h) {
                    return Optional.empty();
                }
                aunn aunnVar = this.w;
                if (aunnVar.io() != null) {
                    awmd awmdVar = this.u;
                    if (awmdVar.io() != null) {
                        if (!xrx.m(diiVar) || ((Boolean) awmdVar.io()).booleanValue()) {
                            return optionalFindFirst;
                        }
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public final void b() {
        ChipCloudChipView chipCloudChipView = this.i;
        if (chipCloudChipView.getVisibility() == 0) {
            chipCloudChipView.startAnimation(this.z);
            chipCloudChipView.setVisibility(8);
        }
    }

    public final void c(dii diiVar, Map map) {
        xgz xgzVar = (xgz) map.get(xrx.a(diiVar));
        if (xgzVar != null) {
            aunn aunnVar = this.q;
            if (aunnVar.io() != null) {
                ((xgn) aunnVar.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgzVar, g(diiVar));
            }
        }
    }

    public final void d() {
        this.m = Optional.empty();
        this.B = false;
    }

    public final void e() {
        jnc jncVar;
        if (this.m.isEmpty()) {
            jncVar = this;
        } else {
            if (this.B) {
                jncVar = this;
            } else {
                if (!this.m.isEmpty()) {
                    Optional optionalA = a();
                    if (!optionalA.isEmpty()) {
                        dii diiVar = (dii) optionalA.get();
                        ChipCloudChipView chipCloudChipView = this.i;
                        chipCloudChipView.a((ajsy) this.m.get());
                        h(157524, diiVar, this.n);
                        jncVar = this;
                        chipCloudChipView.c.setOnClickListener(new jmz(jncVar, diiVar, (xre) this.b.io(), (Boolean) this.v.io(), (dov) this.w.io(), (xrd) this.x.io(), (tbt) this.y.io(), diiVar));
                        jncVar.h(157525, diiVar, jncVar.o);
                        chipCloudChipView.b(new jip(jncVar, diiVar, 4, (char[]) null));
                        jncVar.B = true;
                    }
                }
                jncVar = this;
            }
            if (jncVar.k && !jncVar.j && jncVar.a().isPresent() && jncVar.f()) {
                ChipCloudChipView chipCloudChipView2 = jncVar.i;
                if (chipCloudChipView2.getVisibility() == 8) {
                    chipCloudChipView2.bringToFront();
                    chipCloudChipView2.setVisibility(0);
                    chipCloudChipView2.startAnimation(jncVar.A);
                    ((ydu) jncVar.d.io()).i();
                    return;
                }
                return;
            }
        }
        jncVar.b();
    }

    public final boolean f() {
        yco ycoVar = ((ycp) this.s.io()).e;
        return ycoVar == null || ycoVar.b() == 2;
    }
}
