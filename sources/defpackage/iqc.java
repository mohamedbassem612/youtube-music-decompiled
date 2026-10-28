package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.ui.components.loading.LoadingFrameLayout;
import com.google.android.apps.youtube.music.ui.tabs.TabbedView;
import com.google.android.apps.youtube.music.watchpage.ui.WatchWhileLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iqc implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ iqc(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v91, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r13v92, types: [java.lang.Object, mdm] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService] */
    @Override // java.lang.Runnable
    public final void run() {
        acfw acfwVarH;
        wjf wjfVarC;
        wjf wjfVarC2;
        int i = 0;
        switch (this.$cid) {
            case 0:
                Object obj = this.a;
                iqd iqdVar = (iqd) obj;
                if (iqdVar.e.compareAndSet(false, true)) {
                    aihf aihfVarA = iqdVar.a();
                    iqv iqvVar = iqdVar.c;
                    ListenableFuture listenableFutureB = iqvVar.b();
                    ListenableFuture listenableFutureA = iqvVar.a();
                    ahud ahudVar = new ahud(new ahek(false, agke.p(new ListenableFuture[]{listenableFutureB, listenableFutureA})), (byte[]) null);
                    iqb iqbVar = new iqb(listenableFutureB, listenableFutureA, aihfVarA, i);
                    Executor executor = iqdVar.d;
                    ListenableFuture listenableFutureK = ahudVar.k(iqbVar, executor);
                    iin iinVar = new iin(obj, 3);
                    long j = afwl.a;
                    listenableFutureK.addListener(new ahei(listenableFutureK, new afwj(afty.c(false), iinVar, 0)), executor);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.a;
                igr igrVar = (igr) obj2;
                abvk abvkVar = igrVar.d;
                acfw acfwVarH2 = abvkVar.h();
                if (igrVar.h || igrVar.c() || !abvkVar.ac() || acfwVarH2 == null || (acfwVarH = abvkVar.h()) == null || (wjfVarC = acfwVarH.c()) == null || wjfVarC.R() || wjfVarC.S() || (wjfVarC2 = acfwVarH2.c()) == null) {
                    return;
                }
                ahno.at(igrVar.i.af(wjfVarC2.G(), hna.x(wjfVarC2), hna.y(wjfVarC2)), new hfb(obj2, 15), igrVar.f);
                return;
            case 2:
                ixz ixzVar = (ixz) this.a;
                LoadingFrameLayout loadingFrameLayout = ixzVar.i;
                boolean zL = loadingFrameLayout.e.l(31, 45757116L, false);
                Object parent = loadingFrameLayout;
                if (zL) {
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAnimation() != null) {
                            ixzVar.h.animate().alpha(1.0f).setDuration(50L).setStartDelay(0L);
                            return;
                        }
                        parent = view.getParent();
                    }
                }
                ixzVar.h.animate().alpha(1.0f).setDuration(50L).setStartDelay(450L);
                return;
            case 3:
                ((TabbedView) this.a).a.e();
                return;
            case 4:
                ((jkr) this.a).a();
                return;
            case 5:
                jkr jkrVar = (jkr) this.a;
                jkrVar.b("sa_to");
                jkrVar.a();
                return;
            case 6:
                ((hwc) this.a).C();
                return;
            case 7:
                TextView textView = ((jol) this.a).B;
                if (textView != null) {
                    textView.setSelected(true);
                    return;
                }
                return;
            case 8:
                ((joz) this.a).as = null;
                return;
            case 9:
                joz jozVar = (joz) this.a;
                jozVar.q.setSelected(true);
                jozVar.r.setSelected(true);
                jozVar.t.setSelected(true);
                return;
            case 10:
                WatchWhileLayout watchWhileLayout = (WatchWhileLayout) this.a;
                watchWhileLayout.invalidate();
                watchWhileLayout.requestLayout();
                return;
            case 11:
                WatchWhileLayout watchWhileLayout2 = (WatchWhileLayout) this.a;
                watchWhileLayout2.bw = true;
                hww hwwVar = watchWhileLayout2.bv;
                if (hwwVar != null) {
                    watchWhileLayout2.O(hwwVar);
                    watchWhileLayout2.bv = null;
                    return;
                }
                return;
            case 12:
                ((jui) this.a).d();
                return;
            case 13:
                Object obj3 = this.a;
                while (true) {
                    synchronized (obj3) {
                        if (((kkx) obj3).a != 2) {
                            return;
                        }
                        Queue queue = ((kkx) obj3).c;
                        if (queue.isEmpty()) {
                            ((kkx) obj3).d();
                            return;
                        }
                        kkz kkzVar = (kkz) queue.poll();
                        SparseArray sparseArray = ((kkx) obj3).d;
                        int i2 = kkzVar.a;
                        sparseArray.put(i2, kkzVar);
                        ((kkx) obj3).e.c.schedule(new ihq(obj3, kkzVar, 7), 30L, TimeUnit.SECONDS);
                        kkx kkxVar = (kkx) obj3;
                        klc klcVar = kkxVar.e;
                        Messenger messenger = kkxVar.b;
                        int i3 = kkzVar.b;
                        Message messageObtain = Message.obtain();
                        messageObtain.what = i3;
                        messageObtain.arg1 = i2;
                        messageObtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kkzVar.b());
                        bundle.putString("pkg", ((Context) klcVar.b).getPackageName());
                        bundle.putBundle("data", kkzVar.c);
                        messageObtain.setData(bundle);
                        try {
                            khn khnVar = ((kkx) obj3).f;
                            Object obj4 = khnVar.b;
                            if (obj4 != null) {
                                ((Messenger) obj4).send(messageObtain);
                            } else {
                                Object obj5 = khnVar.a;
                                if (obj5 == null) {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                                ((kku) obj5).b(messageObtain);
                            }
                        } catch (RemoteException e) {
                            kkxVar.g(e.getMessage());
                        }
                    }
                }
                break;
            case 14:
                ((kkx) this.a).b();
                return;
            case 15:
                int i4 = kwc.a;
                ((kjc) this.a).x(new ahek(new kwy()));
                return;
            case 16:
                ((kyj) this.a).c();
                return;
            case 17:
                kjc kjcVar = ((ler) this.a).i;
                ldr ldrVar = (ldr) kjcVar.a;
                ldrVar.r();
                if (kjcVar.c()) {
                    if (kjcVar.d()) {
                        ldrVar.g().q.b(null);
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "(not set)");
                        bundle2.putString("medium", "(not set)");
                        bundle2.putString("_cis", "intent");
                        bundle2.putLong("_cc", 1L);
                        ldrVar.i().N("auto", "_cmpx", bundle2);
                    } else {
                        String strA = ldrVar.g().q.a();
                        if (TextUtils.isEmpty(strA)) {
                            ldrVar.aT().d.a("Cache still valid but referrer not found");
                        } else {
                            long jA = ldrVar.g().r.a() / 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle3 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle3);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle3.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            ldrVar.i().N(pair.first == null ? "app" : (String) pair.first, "_cmp", (Bundle) pair.second);
                        }
                        ldrVar.g().q.b(null);
                    }
                    ldrVar.g().r.b(0L);
                    return;
                }
                return;
            case 18:
                ((lhh) this.a).h = null;
                return;
            case 19:
                this.a.b();
                return;
            default:
                if (Build.VERSION.SDK_INT < 31) {
                    Binder.flushPendingCommands();
                }
                this.a.a();
                return;
        }
    }

    public iqc(lbc lbcVar, int i) {
        this.$cid = i;
        this.a = lbcVar;
    }
}
