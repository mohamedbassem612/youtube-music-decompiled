package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.slimstatusbar.SlimStatusBar;
import java.util.Deque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frz implements Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ Object b;

    public frz(fdk fdkVar, boolean z, int i) {
        this.$cid = i;
        this.a = z;
        this.b = fdkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r10v4, types: [fcr, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        switch (this.$cid) {
            case 0:
                long jUptimeMillis = SystemClock.uptimeMillis();
                while (true) {
                    ?? r0 = this.b;
                    if (r0.isEmpty()) {
                        return;
                    }
                    foi foiVar = (foi) r0.pollFirst();
                    boolean z = this.a;
                    foq foqVar = foiVar.d;
                    foe foeVar = foiVar.c;
                    boolean z2 = foiVar.a;
                    gzj gzjVar = foiVar.e;
                    gzj.aS();
                    if (foeVar != null) {
                        foqVar.n(foeVar, z2, z, jUptimeMillis, gzjVar, 0);
                    }
                }
                break;
            case 1:
                ffs.g();
                boolean z3 = this.a;
                kjx kjxVar = ((fdk) this.b).a;
                boolean z4 = kjxVar.b;
                kjxVar.b = z3;
                if (z4 != z3) {
                    kjxVar.c.a(z3);
                    return;
                }
                return;
            case 2:
                Object obj = this.b;
                Object obj2 = ((xfn) obj).i;
                boolean z5 = this.a;
                synchronized (obj2) {
                    if (((xfn) obj).k != 2) {
                        ((xfn) obj).k = 2;
                        ((xfn) obj).l(3, null, null, z5);
                        ((xfn) obj).j(z5);
                    }
                    break;
                }
                return;
            case 3:
                ((ytv) this.b).u(this.a);
                return;
            case 4:
                ((ytv) this.b).v(this.a);
                return;
            case 5:
                ((aeoh) this.b).l(this.a);
                return;
            case 6:
                aeoh aeohVar = (aeoh) this.b;
                aeohVar.L = true;
                boolean z6 = this.a;
                if (z6) {
                    aeohVar.f();
                } else {
                    aeohVar.e();
                }
                aeohVar.K = false;
                ViewGroup viewGroupB = aeohVar.b(z6);
                aeohVar.n(aeohVar.e, aeohVar.c(z6));
                aeohVar.o(7);
                if (z6) {
                    runnable = aeohVar.D;
                    runnable.getClass();
                } else {
                    runnable = aeohVar.C;
                    runnable.getClass();
                }
                viewGroupB.post(runnable);
                if (z6) {
                    aeohVar.o(4);
                    Runnable runnable2 = aeohVar.v;
                    runnable2.getClass();
                    viewGroupB.postDelayed(runnable2, 5000L);
                }
                String str = aeohVar.M;
                if (aeohVar.r() && aeohVar.L && str != null) {
                    SlimStatusBar slimStatusBarC = aeohVar.c(z6);
                    SlimStatusBar slimStatusBarC2 = aeohVar.c(!z6);
                    TextView textView = slimStatusBarC.a;
                    TextView textView2 = slimStatusBarC2.a;
                    if (textView == null || textView2 == null) {
                        return;
                    }
                    aeohVar.M = textView.getText().toString();
                    if (!str.contentEquals(aeohVar.M)) {
                        slimStatusBarC.b(str);
                        slimStatusBarC2.b(str);
                        slimStatusBarC.setAccessibilityLiveRegion(2);
                        aeohVar.M = str;
                    }
                    if (aeohVar.K) {
                        return;
                    }
                    Drawable drawableC = aeohVar.c.s() ? aeohVar.b.c(aeohVar.a, arqz.mK) : aeohVar.a.getDrawable(R.drawable.yt_outline_moon_z_vd_theme_24);
                    if (drawableC != null) {
                        Context context = aeohVar.a;
                        drawableC.setBounds(0, 0, twm.c(context.getResources().getDisplayMetrics(), 15), twm.c(context.getResources().getDisplayMetrics(), 15));
                        drawableC.setTint(-1);
                        textView.setCompoundDrawables(drawableC, null, null, null);
                        textView2.setCompoundDrawables(drawableC, null, null, null);
                        textView.setCompoundDrawablePadding(5);
                        textView2.setCompoundDrawablePadding(5);
                        aeohVar.K = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((aeoh) this.b).k(true, this.a);
                return;
        }
    }

    public /* synthetic */ frz(Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    public frz(Deque deque, boolean z, int i) {
        this.$cid = i;
        this.b = deque;
        this.a = z;
    }
}
