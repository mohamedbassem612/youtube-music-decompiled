package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adiz implements adhv, tdz {
    public static final etx a = new etx("glide_thread_priority_override", null, etx.a);
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/rendering/image/glide/GlideImageManager");
    public final Context f;
    public final awmd g;
    private final awmd h;
    private final mbc i;
    private final awmd j;
    private final adkc k;
    final agfr c = aguu.al(new xjr(11));
    final agfr d = aguu.al(new xjr(12));
    final agfr e = aguu.al(new adav(this, 10));
    private final abgb l = new abgb(this);

    public adiz(Context context, awmd awmdVar, awmd awmdVar2, mbc mbcVar, adkc adkcVar, awmd awmdVar3) {
        this.f = context.getApplicationContext();
        this.h = awmdVar;
        this.k = adkcVar;
        this.g = awmdVar2;
        this.i = mbcVar;
        this.j = awmdVar3;
    }

    static fec r(adhr adhrVar) {
        fec fecVar = new fec();
        euc eucVar = adhrVar.j;
        if (eucVar != null) {
            fecVar = (fec) new fec().P(eucVar);
        }
        esf esfVar = adhrVar.d;
        if (esfVar != null) {
            fecVar = (fec) fecVar.E(esfVar);
        }
        int i = adhrVar.e;
        if (i > 0) {
            fecVar.C(i);
        }
        return adhrVar.k ? (fec) fecVar.u() : fecVar;
    }

    private final void s(ImageView imageView, aqmh aqmhVar, adhr adhrVar) {
        esr esrVar;
        if (imageView != null) {
            if (adhrVar == null) {
                adhrVar = adhr.a;
            }
            if (imageView instanceof ttp) {
                adhq adhqVar = new adhq(adhrVar);
                adhqVar.b(true);
                adhrVar = adhqVar.a();
            }
            adhr adhrVar2 = adhrVar;
            if (!aawb.O(aqmhVar)) {
                f(imageView);
                int i = adhrVar2.e;
                if (i > 0) {
                    imageView.setImageResource(i);
                    return;
                }
                return;
            }
            fej fejVar = new fej(imageView);
            adkc adkcVar = this.k;
            adht adhtVar = adhrVar2.h;
            mbc mbcVar = this.i;
            adkcVar.getClass();
            adjc adjcVar = new adjc(fejVar, adhrVar2, aqmhVar, adkcVar, adhtVar, mbcVar);
            Context context = imageView.getContext();
            if (adhrVar2 == null) {
                adhrVar2 = adhr.a;
            }
            esq esqVarC = this.l.c(context);
            if (esqVarC != null) {
                esn esnVarL = esqVarC.c().l(r(adhrVar2));
                int i2 = adhrVar2.l;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                }
                if (i3 != 1) {
                    esrVar = i3 != 2 ? (erf) this.c.io() : (fby) this.e.io();
                } else {
                    esrVar = (erf) this.d.io();
                }
                esn esnVarK = esnVarL.k(esrVar);
                if (aqmhVar.c.size() == 1) {
                    esnVarK.f(tyu.d(((aqmg) aqmhVar.c.get(0)).c));
                } else {
                    esnVarK.h(aqmhVar);
                }
                esnVarK.q(adjcVar);
            }
        }
    }

    @Override // defpackage.tsz
    public final void b(Uri uri, sxu sxuVar) {
        boolean z = !((vxz) this.j.io()).l(134, 45712301L, false);
        adhq adhqVarA = adhr.a();
        adhqVarA.b(z);
        ((adin) this.h.io()).a(uri, sxuVar, adhqVarA.a());
    }

    @Override // defpackage.adhv
    public final adhr d() {
        return adhr.a;
    }

    @Override // defpackage.adhv
    public final void e(adhu adhuVar) {
        ((ConcurrentSkipListSet) this.k.a).add(adhuVar);
    }

    @Override // defpackage.adhv
    public final void f(ImageView imageView) {
        esq esqVarC;
        if (imageView == null || (esqVarC = this.l.c(imageView.getContext())) == null) {
            return;
        }
        esqVarC.i(imageView);
    }

    @Override // defpackage.adhv
    public final void g(ImageView imageView, Uri uri) {
        i(imageView, uri, null);
    }

    @Override // defpackage.adhv
    public final void h(ImageView imageView, aqmh aqmhVar) {
        s(imageView, aqmhVar, null);
    }

    @Override // defpackage.adhv
    public final void i(ImageView imageView, Uri uri, adhr adhrVar) {
        j(imageView, aawb.N(uri), adhrVar);
    }

    @Override // defpackage.adhv
    public final void j(ImageView imageView, aqmh aqmhVar, adhr adhrVar) {
        if (aawb.O(aqmhVar)) {
            s(imageView, aqmhVar, adhrVar);
        } else {
            s(imageView, null, adhrVar);
        }
    }

    @Override // defpackage.tdz
    public final /* synthetic */ Object jC() {
        return nsi.l(this);
    }

    @Override // defpackage.tdz
    public final void jz() {
        p();
    }

    @Override // defpackage.adhv
    public final void k(Uri uri, sxu sxuVar) {
        adin adinVar = (adin) this.h.io();
        adin.d(adinVar.c);
        adhq adhqVarA = adhr.a();
        adhqVarA.b(false);
        adinVar.c(uri, sxuVar, adhqVarA.a());
    }

    @Override // defpackage.adhv
    public final void l(Uri uri, sxu sxuVar, adhr adhrVar) {
        ((adin) this.h.io()).a(uri, sxuVar, adhrVar);
    }

    @Override // defpackage.adhv
    public final void m(Uri uri, sxu sxuVar) {
        adin adinVar = (adin) this.h.io();
        sxuVar.getClass();
        Context context = adinVar.c;
        adin.d(context);
        esn esnVarF = erj.d(context).a(byte[].class).f(uri);
        char[] cArr = ffs.a;
        if (a.x()) {
            esnVarF.q(new adik(sxuVar, uri));
        } else {
            taf.i(a.bC(esnVarF), adinVar.d, new xfa(sxuVar, uri, 9, null), new xwl(sxuVar, uri, 17), null);
        }
    }

    @Override // defpackage.adhv
    public final void n(aqmh aqmhVar, int i, int i2) {
        o(aqmhVar, i, i2, adhr.a().a());
    }

    @Override // defpackage.adhv
    public final void o(aqmh aqmhVar, int i, int i2, adhr adhrVar) {
        if (i <= 0 || i2 <= 0) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/rendering/image/glide/GlideImageManager", "preload", 298, "GlideImageManager.java")).x("ImageManager: cannot preload image. Invalid dimensions given: %d x %d", i, i2);
            return;
        }
        if (!aawb.O(aqmhVar)) {
            ((agrc) ((agrc) b.b()).k("com/google/android/libraries/youtube/rendering/image/glide/GlideImageManager", "preload", 303, "GlideImageManager.java")).t("ImageManager: cannot preload image with no model.");
            return;
        }
        esq esqVarC = this.l.c(this.f);
        if (esqVarC != null) {
            if (aqmhVar.c.size() != 1) {
                esqVarC.f(aqmhVar).o(i, i2);
                return;
            }
            Uri uriD = tyu.d(((aqmg) aqmhVar.c.get(0)).c);
            if (adhrVar.m == 3) {
                esqVarC.c().l(r(adhrVar)).f(uriD).o(i, i2);
            } else {
                esqVarC.b().f(uriD).o(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
    }

    @Override // defpackage.adhv
    public final void p() {
        if (adin.b != null) {
            synchronized (adin.a) {
                if (adin.b != null) {
                    Executor executor = taf.a;
                    taf.o(new abmn(9));
                }
            }
        }
    }

    @Override // defpackage.adhv
    public final void q(adhu adhuVar) {
        ((ConcurrentSkipListSet) this.k.a).remove(adhuVar);
    }
}
