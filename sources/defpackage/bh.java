package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.support.v7.widget.ActionBarOverlayLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bh implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ bh(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        awq awqVarD;
        Object systemService;
        Context contextC;
        switch (this.$cid) {
            case 0:
                C0027do.b(this.a, 4);
                break;
            case 1:
                Object obj = this.a;
                Iterator it = ((bj) obj).a.iterator();
                while (it.hasNext()) {
                    ((bk) it.next()).a.f((dy) obj);
                }
                break;
            case 2:
                Function0 function0 = (Function0) ((awrm) this.a).a;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 3:
                ((cc) this.a).m663lambda$performDestroyView$18$androidsupportv4appFragment();
                break;
            case 4:
                ((cc) this.a).onDestroyView();
                break;
            case 5:
                ((cc) this.a).m671lambda$performStop$16$androidsupportv4appFragment();
                break;
            case 6:
                ((cc) this.a).m672lambda$performStop$17$androidsupportv4appFragment();
                break;
            case 7:
                ((cc) this.a).onStop();
                break;
            case 8:
                ((cc) this.a).onDetach();
                break;
            case 9:
                ((cc) this.a).m664lambda$performPause$14$androidsupportv4appFragment();
                break;
            case 10:
                ((cc) this.a).m665lambda$performPause$15$androidsupportv4appFragment();
                break;
            case 11:
                ((cc) this.a).onPause();
                break;
            case 12:
                ((cc) this.a).m662lambda$performDestroy$19$androidsupportv4appFragment();
                break;
            case 13:
                ((cc) this.a).onDestroy();
                break;
            case 14:
                ((cc) this.a).callStartTransitionListener(false);
                break;
            case 15:
                eb ebVar = (eb) this.a;
                if (!ebVar.b.isEmpty()) {
                    ebVar.e();
                }
                break;
            case 16:
                ArrayList arrayList = ((dd) this.a).m;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((cx) arrayList.get(i)).a();
                }
                break;
            case 17:
                int i2 = ga.b;
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = (Context) this.a;
                    ComponentName componentName = new ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            afw afwVar = new afw(ga.f);
                            while (true) {
                                if (afwVar.hasNext()) {
                                    ga gaVar = (ga) ((WeakReference) afwVar.next()).get();
                                    if (gaVar != null && (contextC = gaVar.c()) != null) {
                                        systemService = contextC.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                awqVarD = awq.d(bh$$ExternalSyntheticApiModelOutline0.m(systemService).getApplicationLocales());
                            } else {
                                awqVarD = awq.a;
                            }
                        } else {
                            awqVarD = ga.c;
                            if (awqVarD == null) {
                                awqVarD = awq.a;
                            }
                        }
                        if (awqVarD.g()) {
                            String strA = atf.a(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                bh$$ExternalSyntheticApiModelOutline0.m(systemService2).setApplicationLocales(LocaleList.forLanguageTags(strA));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                ga.e = true;
                break;
            case 18:
                gp gpVar = (gp) this.a;
                gpVar.r.showAtLocation(gpVar.q, 55, 0, 0);
                gpVar.N();
                if (gpVar.U()) {
                    gpVar.q.setAlpha(0.0f);
                    ci ciVarX = bac.x(gpVar.q);
                    ciVarX.q(1.0f);
                    gpVar.H = ciVarX;
                    gpVar.H.t(new gc(this));
                } else {
                    gpVar.q.setAlpha(1.0f);
                    gpVar.q.setVisibility(0);
                }
                break;
            case 19:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.j);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(-actionBarOverlayLayout2.c.getHeight()).setListener(actionBarOverlayLayout2.j);
                break;
        }
    }

    public bh(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
