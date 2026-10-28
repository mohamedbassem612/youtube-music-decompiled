package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.media.interfaces.RestartPrefetchEvaluationSource;
import j$.util.Optional;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ygz implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ygz(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v39, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v41, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v42, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v43, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object, yxg] */
    /* JADX WARN: Type inference failed for: r14v45, types: [java.lang.Object, yxg] */
    @Override // java.lang.Runnable
    public final void run() {
        yax yaxVar;
        xvz xvzVar;
        xvg xvgVarL;
        String string;
        zif[] zifVarArr;
        int i = 6;
        xve xveVar = null;
        switch (this.$cid) {
            case 0:
                ((yha) this.a).d();
                return;
            case 1:
                Object obj = this.a;
                yay yayVar = (yay) obj;
                Uri uri = yayVar.k.a;
                if (uri != null) {
                    yayVar.k = yayVar.k.n(yayVar.d.a(uri, yayVar.k.p()));
                }
                ycj ycjVar = (ycj) obj;
                boolean zAv = ycjVar.av();
                if (yayVar.aM()) {
                    yayVar.F.w(16, "d_lar");
                    if (yayVar.aM()) {
                        xvn xvnVar = yayVar.k;
                        boolean z = (xvnVar.k().d == null || xvnVar.l() == null) ? false : true;
                        if (yayVar.aL() && (string = yayVar.b.getString(xvnVar.n.b, null)) != null && string.contains(",")) {
                            List listH = agfm.b(',').h(string);
                            yaxVar = new yax(new xvz((String) listH.get(0)), new xvg((String) listH.get(1)));
                        } else {
                            yaxVar = null;
                        }
                        if (z) {
                            xvzVar = xvnVar.k().d;
                            xvgVarL = xvnVar.l();
                        } else if (yaxVar != null) {
                            xvzVar = yaxVar.a;
                            xvgVarL = yaxVar.b;
                        }
                        ycp ycpVar = yayVar.E;
                        ycpVar.l(9);
                        xvv xvvVar = new xvv(2, xvnVar.k().b);
                        xvh xvhVar = (xvh) yayVar.e.b(Arrays.asList(xvzVar), z ? 6 : 5).get(xvzVar);
                        if (xvhVar == null) {
                            ((agrc) ((agrc) yay.a.b().i(agso.a, "MDX.Dial")).k("com/google/android/libraries/youtube/mdx/remote/internal/DialSession", "getCloudScreenInfoForDialDevice", 709, "DialSession.java")).w("Unable to retrieve lounge token for screenId %s", xvzVar);
                        } else {
                            ycpVar.l(11);
                            int i2 = xve.i;
                            xvb xvbVar = new xvb();
                            xvbVar.f(xvzVar);
                            xvbVar.g(xvnVar.c);
                            xvbVar.b(xvgVarL);
                            xvbVar.c(xvhVar);
                            xvbVar.e(xvvVar);
                            xve xveVarA = xvbVar.a();
                            Iterator it = yayVar.q.a(Arrays.asList(xveVarA), tok.MDX_PAIRING_URL_BUILDER_SESSION_AVAILABILITY_WITH_EXTRA_INFO_DIAL_SESSION).iterator();
                            while (it.hasNext()) {
                                if (xvzVar.equals(((xve) it.next()).d)) {
                                    yayVar.aE(true);
                                    xveVar = xveVarA;
                                }
                            }
                        }
                    }
                    if (xveVar != null) {
                        yayVar.E.l(17);
                        yayVar.aF(xveVar);
                        return;
                    } else if (zAv) {
                        ycjVar.aP(amyu.MDX_SESSION_DISCONNECT_REASON_DIAL_RECOVERY_SMOOTH_PAIRING_SCREEN_NOT_ONLINE, Optional.empty());
                        return;
                    }
                } else if (zAv) {
                    ycjVar.aP(amyu.MDX_SESSION_DISCONNECT_REASON_SCREEN_APP_STOPPED, Optional.empty());
                    return;
                }
                yayVar.aH();
                return;
            case 2:
                yhu yhuVar = (yhu) this.a;
                if (yhuVar.f) {
                    yhuVar.h(yhuVar.a.io());
                    return;
                }
                return;
            case 3:
                int i3 = zic.a;
                ((yhu) this.a).f();
                return;
            case 4:
                ((ype) this.a).b(null, true);
                return;
            case 5:
                Object obj2 = this.a;
                synchronized (zik.class) {
                    ysm ysmVar = ((yrf) obj2).a;
                    if (ysmVar.b() - 1 != 1) {
                        ysmVar.a().unselectForPlaybackAndDispose(((yrf) obj2).b);
                    } else {
                        ysmVar.c().dispose();
                    }
                    break;
                }
                return;
            case 6:
                ((ytv) this.a).q();
                return;
            case 7:
                ((ytv) this.a).j();
                return;
            case 8:
                ((ytv) this.a).m();
                return;
            case 9:
                Object obj3 = this.a;
                ygz ygzVar = new ygz(obj3, i);
                ytv ytvVar = (ytv) obj3;
                if (ytvVar.D("restartPrefetchEvaluation", ygzVar)) {
                    ytvVar.c.H(RestartPrefetchEvaluationSource.PREFETCH_SEQUENCE_CHANGED, false);
                    return;
                }
                return;
            case 10:
                ((ytv) this.a).k();
                return;
            case 11:
                ((ytv) this.a).n();
                return;
            case 12:
                ((yuk) this.a).a.a.aa(true, 41);
                return;
            case 13:
                Object obj4 = this.a;
                yuz yuzVar = (yuz) obj4;
                int iA = yuzVar.d.a();
                synchronized (obj4) {
                    ArrayDeque arrayDeque = (ArrayDeque) ((yuz) obj4).b.io();
                    zifVarArr = (zif[]) arrayDeque.toArray(new zif[arrayDeque.size()]);
                    ((yuz) obj4).c = false;
                    break;
                }
                ArrayList arrayList = new ArrayList(zifVarArr.length);
                for (zif zifVar : zifVarArr) {
                    if (zifVar.c == 0) {
                        aihf builder = zifVar.toBuilder();
                        builder.copyOnWrite();
                        ((zif) builder.instance).c = iA;
                        arrayList.add((zif) builder.build());
                    } else {
                        arrayList.add(zifVar);
                    }
                }
                taf.j(yuzVar.a.b(new xwd(arrayList, i)), new xwk(8));
                return;
            case 14:
                this.a.g();
                return;
            case 15:
                this.a.e();
                return;
            case 16:
                this.a.y();
                return;
            case 17:
                this.a.q();
                return;
            case 18:
                this.a.n();
                return;
            case 19:
                this.a.m();
                return;
            default:
                this.a.r();
                return;
        }
    }
}
