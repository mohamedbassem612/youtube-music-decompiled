package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swc implements adma {
    public final adhv a;
    public final Activity b;
    public final vxe c;
    public final adsz d;
    public final ViewGroup e;
    public final swh f;
    public final xgm g;
    public final adrv h;
    public adzw i = null;
    public amfe j;
    public int k;
    public final afip l;
    private final FrameLayout m;
    private swb n;
    private swb o;
    private swb p;
    private final elq q;

    public swc(Activity activity, adhv adhvVar, afip afipVar, vxe vxeVar, lqa lqaVar, swh swhVar, elq elqVar, xgm xgmVar, adrv adrvVar, ViewGroup viewGroup) {
        this.b = activity;
        this.a = adhvVar;
        this.c = vxeVar;
        this.l = afipVar;
        this.e = viewGroup;
        this.f = swhVar;
        this.q = elqVar;
        this.g = xgmVar;
        this.h = adrvVar;
        int iOrElse = tzk.n(activity, R.attr.ytStaticWhite).orElse(0);
        adsy adsyVar = (adsy) lqaVar.a;
        adsyVar.f(iOrElse);
        adsyVar.e(iOrElse);
        this.d = adsyVar.a();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.m = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // defpackage.adma
    public final View a() {
        return this.m;
    }

    @Override // defpackage.adma
    public final void b(admh admhVar) {
        this.j = null;
    }

    final boolean d() {
        amfe amfeVar = this.j;
        return (amfeVar == null || amfeVar.p) ? false : true;
    }

    @Override // defpackage.adma
    public final /* synthetic */ void hU(adly adlyVar, Object obj) {
        int i;
        swb swbVar;
        amfe amfeVar = (amfe) obj;
        this.j = amfeVar;
        this.k = this.b.getResources().getConfiguration().orientation;
        int iAS = a.aS(this.j.h);
        if (iAS == 0) {
            iAS = 1;
        }
        int i2 = iAS - 1;
        if (i2 != 1) {
            i = i2 != 2 ? R.layout.interstitial_promo_view : R.layout.interstitial_edunitube_view;
        } else {
            i = R.layout.onboarding_interstitial_promo_view;
        }
        if (this.i == null) {
            Object objD = adlyVar.d("overlay_controller_param", null);
            if (objD instanceof adzw) {
                this.i = (adzw) objD;
            }
        }
        FrameLayout frameLayout = this.m;
        frameLayout.removeAllViews();
        if (this.k == 1) {
            swb swbVar2 = this.p;
            if (swbVar2 == null || i != swbVar2.b) {
                this.p = new swb(this, i, this.q);
            }
            swbVar = this.p;
            this.n = swbVar;
        } else {
            swb swbVar3 = this.o;
            if (swbVar3 == null || i != swbVar3.b) {
                this.o = new swb(this, i, this.q);
            }
            swbVar = this.o;
            this.n = swbVar;
        }
        swbVar.d(amfeVar);
        frameLayout.addView(this.n.a);
    }
}
