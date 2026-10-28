package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.rendering.image.glide.GlideImageLoggerImpl;
import com.google.android.libraries.youtube.rendering.ui.stickyheaders.StickyHeaderContainer;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rir implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rir(Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r15v54, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, zwb] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rqu] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2 = 11;
        int i3 = 1;
        switch (this.$cid) {
            case 0:
                ril rilVar = ((riv) this.b).j;
                rilVar.p = true;
                rilVar.q = this.a;
                break;
            case 1:
                ((rgc) this.b).e = this.a;
                break;
            case 2:
                ((rmo) this.b).v(this.a);
                break;
            case 3:
                syn synVar = (syn) this.b;
                zwa zwaVarE = synVar.a.e();
                agke agkeVarX = synVar.d.x();
                if ("youtube-direct".equals(rmp.c(zwaVarE))) {
                    int i4 = ((agpi) agkeVarX).d;
                    boolean zEquals = false;
                    for (int i5 = 0; i5 < i4; i5++) {
                        zEquals |= zwaVarE.i().equals(((afhq) agkeVarX.get(i5)).c);
                    }
                    if (zEquals) {
                        i2 = 13;
                    } else if (agkeVarX.isEmpty()) {
                        i2 = 10;
                    } else if (i4 != 1) {
                        i2 = 12;
                    }
                } else if ("youtube-delegated".equals(rmp.c(zwaVarE))) {
                    i2 = 14;
                } else {
                    i2 = "youtube-incognito".equals(rmp.c(zwaVarE)) ? 15 : 16;
                }
                synVar.k(this.a, 3, i2);
                break;
            case 4:
                ((View) this.b).setVisibility(this.a);
                break;
            case 5:
                vhn vhnVar = (vhn) this.b;
                if (nuo.h(vhnVar.c)) {
                    int i6 = this.a;
                    vhnVar.d.setAlpha(1.0f);
                    vhnVar.d.setVisibility(0);
                    vhnVar.c(vhnVar.b);
                    tym.i(vhnVar.d, new vrr(i3), new tye(tym.g(-1, -2), new tyj(i6 - vhnVar.d.getMeasuredHeight(), 2)), FrameLayout.LayoutParams.class);
                }
                break;
            case 6:
                StickyHeaderContainer stickyHeaderContainer = ((vnr) this.b).i;
                if (stickyHeaderContainer != null) {
                    stickyHeaderContainer.setPadding(0, 0, 0, this.a);
                }
                break;
            case 7:
                Object obj = this.b;
                xkn xknVar = (xkn) obj;
                final zwa zwaVarE2 = xknVar.b.e();
                zwaVarE2.getClass();
                xkp xkpVar = xknVar.e;
                final String strA = xkpVar.a(zwaVarE2);
                if (strA.length() != 0 && xknVar.g) {
                    final int i7 = this.a;
                    Object objIo = xknVar.f.io();
                    objIo.getClass();
                    mbc mbcVar = xknVar.a;
                    xkq xkqVar = (xkq) objIo;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long epochMilli = (mbcVar.f().toEpochMilli() / 86400000) / 60;
                    int i8 = agxm.b;
                    agxk agxkVarD = ((agxc) agxe.a).d(32);
                    agxkVarD.j(strA);
                    agxb agxbVar = (agxb) agxkVarD;
                    agxbVar.b(8);
                    agxbVar.a.putLong(epochMilli);
                    long j = ((agxh) agxkVarD.o()).a;
                    xkm xkmVar = xkm.a;
                    int i9 = i7 - 2;
                    if (i9 != 4 && i9 != 8) {
                        switch (i9) {
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 22:
                            case 23:
                                i2 = 12;
                                break;
                            case 20:
                            case 21:
                            case 24:
                                i2 = 10;
                                break;
                        }
                    } else {
                        i2 = 10;
                    }
                    if (xkqVar.b(i2, j).a) {
                        final String strAD = xknVar.j.aD(zwaVarE2);
                        final long jB = xkpVar.b(i7, zwaVarE2);
                        final long epochMilli2 = mbcVar.f().toEpochMilli();
                        try {
                            ListenableFuture listenableFutureN = ahng.n(agpi.a);
                            Executor executor = ((xkn) obj).i;
                            final xkn xknVar2 = (xkn) obj;
                            tab tabVar = new tab() { // from class: xkk
                                @Override // defpackage.twi
                                /* JADX INFO: renamed from: b */
                                public final void a(Throwable th) {
                                    xkn xknVar3 = xknVar2;
                                    ((agrc) ((agrc) xknVar3.h.b()).j(th).k("com/google/android/libraries/youtube/logging/reliability/DefaultLoggingReliabilityProber", "sendProbe$<anonymous>$<anonymous>", 97, "DefaultLoggingReliabilityProber.kt")).t("Failed to get experiment IDs");
                                    xknVar3.b(i7, epochMilli2, jB, strA, zwaVarE2, strAD, null);
                                }
                            };
                            final xkn xknVar3 = (xkn) obj;
                            taf.i(listenableFutureN, executor, tabVar, new tae() { // from class: xkl
                                @Override // defpackage.tae, defpackage.twi
                                public final void a(Object obj2) {
                                    xknVar3.b(i7, epochMilli2, jB, strA, zwaVarE2, strAD, (List) obj2);
                                }
                            }, null);
                        } catch (Exception e) {
                            ((agrc) ((agrc) xknVar.h.b()).j(e).k("com/google/android/libraries/youtube/logging/reliability/DefaultLoggingReliabilityProber", "sendProbe$<anonymous>", 121, "DefaultLoggingReliabilityProber.kt")).t("Failed to schedule reliability probe");
                            return;
                        }
                    }
                    break;
                }
                break;
            case 8:
                ((ytv) this.b).H(this.a);
                break;
            case 9:
                ((ytv) this.b).I(this.a);
                break;
            case 10:
                ((ytv) this.b).G(this.a);
                break;
            case 11:
                ((ywh) this.b).b.d(this.a);
                break;
            case 12:
                ((ywh) this.b).b.c(this.a);
                break;
            case 13:
                ((yyv) this.b).ao(this.a);
                break;
            case 14:
                acqz acqzVar = (acqz) this.b;
                if (this.a == acqzVar.Q) {
                    acqzVar.n(false);
                }
                break;
            case 15:
                ((GlideImageLoggerImpl) this.b).d.remove(Integer.valueOf(this.a));
                break;
            case 16:
                int i10 = this.a;
                Object obj2 = this.b;
                Integer numValueOf = Integer.valueOf(i10);
                GlideImageLoggerImpl glideImageLoggerImpl = (GlideImageLoggerImpl) obj2;
                if (((adix) glideImageLoggerImpl.c.get(numValueOf)) == null) {
                    glideImageLoggerImpl.d.remove(numValueOf);
                }
                break;
            case 17:
                Object obj3 = this.b;
                ((adwg) obj3).aP(((RecyclerView) ((adsr) obj3).l).n).d(this.a);
                break;
            case 18:
                ((RecyclerView) ((adsr) this.b).l).ab(this.a);
                break;
            case 19:
                Object obj4 = ((aejo) this.b).X.a;
                if (!kro.M((cc) obj4) && (i = this.a) > 0) {
                    jmg jmgVar = (jmg) obj4;
                    if (!jmgVar.Z) {
                        jmgVar.Z = true;
                        jmgVar.x("voz_ss");
                    }
                    jls jlsVar = jmgVar.au;
                    if (jlsVar != null) {
                        jlsVar.f(i);
                    }
                    break;
                }
                break;
            default:
                adzy adzyVar = new adzy(this.a, 2);
                Optional optional = ((aeqd) this.b).s;
                optional.isPresent();
                ((aeqt) optional.get().io()).b(adzyVar.a);
                break;
        }
    }
}
