package defpackage;

import android.animation.Animator;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.audiopreview.AudioPreviewPlayerActivity;
import com.google.android.apps.youtube.music.bluetooth.BluetoothA2dpService;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dxk implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ dxk(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [axo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v41, types: [aunn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        TimeBar timeBar;
        abhl abhlVar;
        abgk abgkVar;
        switch (this.$cid) {
            case 0:
                this.a.accept(new dwy(awno.a));
                break;
            case 1:
                ((SwipeRefreshLayout) this.a).b();
                break;
            case 2:
                ((AtomicBoolean) this.a).set(true);
                break;
            case 3:
                try {
                    ((env) this.a).b.h.a();
                } catch (Throwable th) {
                    eov.f("BillingClient", "Exception calling onBillingServiceDisconnected.", th);
                    return;
                }
                break;
            case 4:
                enx enxVar = (enx) this.a;
                enu enuVar = enxVar.c;
                enuVar.m(0);
                int i = enxVar.b;
                eoh eohVar = eoi.h;
                enuVar.u(24, eohVar, i);
                enxVar.b(eohVar);
                break;
            case 5:
                ((fmx) this.a).d(System.nanoTime());
                break;
            case 6:
                ((fmz) this.a).b = Choreographer.getInstance();
                break;
            case 7:
                ((Animator) this.a).resume();
                break;
            case 8:
                Object obj = this.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    fwz fwzVar = ((gao) obj).d;
                    gaj.a(fwzVar.e, gao.h(((gao) obj).b), fwzVar.f, ((gao) obj).e).j();
                } catch (NullPointerException e) {
                    ((gao) obj).c.e(2027, System.currentTimeMillis() - jCurrentTimeMillis, e, null, null);
                    return;
                }
                break;
            case 9:
                Object obj2 = this.a;
                try {
                    if (((gbg) obj2).f == null && ((gbg) obj2).h) {
                        jwb jwbVar = new jwb(((gbg) obj2).a);
                        jwbVar.c(true);
                        ((gbg) obj2).f = jwbVar;
                        break;
                    }
                } catch (IOException | kmj | kmk unused) {
                    ((gbg) obj2).f = null;
                    return;
                }
                break;
            case 10:
                ((gbm) this.a).c();
                break;
            case 11:
                Object obj3 = this.a;
                while (true) {
                    try {
                        int i2 = ((gdg) obj3).f;
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList.add((gdk) ((gdg) obj3).c.take());
                        }
                        for (Map map : ((gdg) obj3).a(arrayList).values()) {
                            boolean z = false;
                            for (int i4 = 3; !z && i4 > 0; i4--) {
                                try {
                                    Thread.sleep(1L);
                                    ((gdg) obj3).a.a(((gdg) obj3).d, map);
                                    z = true;
                                } catch (gdh e2) {
                                    Log.w("ReporterDefault", '#' + i4 + " failed to send report", e2);
                                    z = false;
                                }
                            }
                        }
                    } catch (InterruptedException unused2) {
                        Log.w("ReporterDefault", "Reporter interrupted.");
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                break;
            case 12:
                try {
                    ((wps) ((get) this.a).ae.io()).a();
                } catch (wno e3) {
                    ((agrc) ((agrc) ((agrc) get.a.b()).j(e3)).k("com/google/android/apps/youtube/music/activities/MusicActivityPeer", "handleSignInEvent", (char) 2606, "MusicActivityPeer.java")).t("Something went wrong when refreshing the global configs.");
                    return;
                }
                break;
            case 13:
                ((View) this.a).requestLayout();
                break;
            case 14:
                ((inu) this.a).b();
                break;
            case 15:
                zpw zpwVar = (zpw) this.a;
                ((xds) zpwVar.l.io()).f();
                ((zrn) zpwVar.i.io()).f();
                break;
            case 16:
                ((AudioPreviewPlayerActivity) this.a).finish();
                break;
            case 17:
                gls glsVar = (gls) this.a;
                if (glsVar.i != null && (timeBar = glsVar.p) != null && !timeBar.w() && glsVar.s != 0 && (abhlVar = glsVar.r) != null) {
                    abhlVar.c = glsVar.i.getCurrentPosition();
                    glsVar.p.v(glsVar.r);
                    if (glsVar.i.getCurrentPosition() == glsVar.s && (abgkVar = glsVar.q) != null) {
                        abgkVar.a(new abgi(abgh.f, false));
                        break;
                    }
                }
                break;
            case 18:
                BluetoothA2dpService bluetoothA2dpService = (BluetoothA2dpService) this.a;
                bluetoothA2dpService.j = false;
                bluetoothA2dpService.stopSelf();
                break;
            case 19:
                ExtendedFloatingActionButton extendedFloatingActionButton = ((gms) this.a).G;
                if (extendedFloatingActionButton != null) {
                    extendedFloatingActionButton.setVisibility(8);
                }
                break;
            default:
                ((gnf) this.a).C();
                break;
        }
    }

    public dxk(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
