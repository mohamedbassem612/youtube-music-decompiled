package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import j$.util.Optional;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public br(ecb ecbVar, ees eesVar, int i) {
        this.$cid = i;
        this.b = ecbVar;
        this.a = eesVar;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0225  */
    /* JADX WARN: Code duplicated, block: B:93:0x022b  */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0231  */
    /* JADX WARN: Code duplicated, block: B:97:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x0237  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v36, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v47, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 6;
        switch (this.$cid) {
            case 0:
                ((cc) this.a).m674lambda$restoreViewState$0$androidsupportv4appFragment((Bundle) this.b);
                break;
            case 1:
                ((cc) this.a).m656lambda$performActivityCreated$8$androidsupportv4appFragment((Bundle) this.b);
                break;
            case 2:
                ((cc) this.a).m673lambda$performViewCreated$7$androidsupportv4appFragment((Bundle) this.b);
                break;
            case 3:
                ((cc) this.a).m658lambda$performCreate$3$androidsupportv4appFragment((Bundle) this.b);
                break;
            case 4:
                eb ebVar = (eb) this.a;
                List list = ebVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    ea eaVar = (ea) obj;
                    int i2 = eaVar.h;
                    View view = eaVar.a.mView;
                    view.getClass();
                    dl.g(i2, view, ebVar.a);
                }
                break;
            case 5:
                eb ebVar2 = (eb) this.a;
                List list2 = ebVar2.b;
                Object obj2 = this.b;
                list2.remove(obj2);
                ebVar2.c.remove(obj2);
                break;
            case 6:
                ast.a = (AudioManager) ((Context) this.b).getSystemService("audio");
                ((zhk) this.a).h();
                break;
            case 7:
                bvc bvcVar = (bvc) this.b;
                if (bvcVar.d == 0) {
                    bvcVar.e(this.a);
                }
                break;
            case 8:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.b).registerReceiver(new bvz((afjq) this.a), intentFilter);
                break;
            case 9:
                Object obj3 = this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) obj3).getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i = 3;
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i = 4;
                                        break;
                                    case 13:
                                        i = 5;
                                        break;
                                    case 18:
                                        i = 2;
                                        break;
                                    case 20:
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            i = 9;
                                        } else {
                                            i = 0;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i = type != 9 ? 8 : 7;
                            } else {
                                i = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                } else {
                    i = 0;
                }
                Object obj4 = this.a;
                int i3 = Build.VERSION.SDK_INT;
                afjq afjqVar = ((bvz) obj4).a;
                if (i3 < 31 || i != 5) {
                    afjqVar.d(i);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) ((Context) obj3).getSystemService("phone");
                        telephonyManager.getClass();
                        bvy bvyVar = new bvy(afjqVar);
                        telephonyManager.registerTelephonyCallback(afjqVar.e, bvyVar);
                        telephonyManager.unregisterTelephonyCallback(bvyVar);
                    } catch (RuntimeException unused2) {
                        afjqVar.d(5);
                        return;
                    }
                }
                break;
            case 10:
                dzf.b();
                int i4 = ecb.d;
                ees eesVar = (ees) this.a;
                String str = eesVar.c;
                ((ecb) this.b).a.c(eesVar);
                break;
            case 11:
                ((ecd) this.a).a.l((dov) this.b, 3);
                break;
            case 12:
                if (((exr) this.b).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.a.run();
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
                break;
            case 13:
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                try {
                    Process.setThreadPriority(((fje) this.b).a);
                } catch (SecurityException unused3) {
                    Process.setThreadPriority(((fje) this.b).a + 1);
                }
                this.a.run();
                break;
            case 14:
                fsy.K(this.a, ((fsy) this.b).r);
                break;
            case 15:
                List listAsList = Arrays.asList((gdk) this.a);
                Object obj5 = this.b;
                for (Map map : ((gdg) obj5).a(listAsList).values()) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        try {
                            ((gdg) obj5).a.a(((gdg) obj5).d, map);
                        } catch (gdh e) {
                            Log.w("ReporterDefault", "failed to send report", e);
                        }
                        break;
                    }
                }
                break;
            case 16:
                get getVar = (get) this.b;
                if (getVar.g != null) {
                    Object obj6 = this.a;
                    View view2 = (View) getVar.aj.io();
                    ViewParent parent = view2.getParent();
                    ViewGroup viewGroup = obj6 == hww.h ? getVar.g.z : getVar.j;
                    if (parent != viewGroup) {
                        if (parent != null) {
                            ((ViewGroup) parent).removeView(view2);
                        }
                        viewGroup.addView(view2);
                    }
                    aunn aunnVar = getVar.ak;
                    hwo hwoVar = (hwo) aunnVar.io();
                    gei geiVar = new gei(getVar, (hww) obj6);
                    hwoVar.a = viewGroup;
                    hwoVar.b = geiVar;
                    ((hwo) aunnVar.io()).b(false);
                }
                break;
            case 17:
                ViewTreeObserver viewTreeObserver = ((View) this.b).getViewTreeObserver();
                ?? r11 = this.a;
                viewTreeObserver.removeOnPreDrawListener(r11);
                WeakReference weakReference = ((ges) r11).a;
                qih qihVar = qih.a;
                Activity activity = (Activity) weakReference.get();
                if (qpj.h(Thread.currentThread()) && qihVar.l == null) {
                    qihVar.l = new qfk(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
                    qih.b("Primes-tti-end-and-length-ms", qihVar.l.a);
                    if (activity != null) {
                        try {
                            activity.reportFullyDrawn();
                        } catch (RuntimeException unused4) {
                            return;
                        }
                    }
                    break;
                }
                break;
            case 18:
                Object obj7 = this.a;
                try {
                    ((ayq) ((jan) ((glb) this.b).e.io()).g.io()).O(null);
                    ((awlk) obj7).kn();
                } catch (Throwable th2) {
                    ((awlk) obj7).b(th2);
                    return;
                }
                break;
            case 19:
                Iterator it = ((gmy) this.b).f.iterator();
                while (it.hasNext()) {
                    ((gmz) it.next()).a((heh) this.a);
                }
                break;
            default:
                Optional optionalJ = gqh.j((wfy) this.a);
                if (optionalJ.isPresent()) {
                    gqh gqhVar = (gqh) this.b;
                    if (!gqhVar.e.k(gzj.a(gqhVar.f((acjx) optionalJ.get()))).d()) {
                        ((qtf) gqhVar.g.i.io()).b(1L, new Object[0]);
                    }
                }
                break;
        }
    }

    public /* synthetic */ br(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ br(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    public br(Object obj, Object obj2, int i, char[] cArr) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }
}
