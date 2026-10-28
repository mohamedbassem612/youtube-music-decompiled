package defpackage;

import android.view.accessibility.AccessibilityManager;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abhi {
    public boolean a;
    public final Object b;
    public Object c;

    public abhi(byte[] bArr) {
        this.b = "com.google.android.gms.cast.framework.media.MediaIntentReceiver";
        this.c = new keu(keu.a, keu.b, 10000L, null, kro.u("smallIconDrawableResId"), kro.u("stopLiveStreamDrawableResId"), kro.u("pauseDrawableResId"), kro.u("playDrawableResId"), kro.u("skipNextDrawableResId"), kro.u("skipPrevDrawableResId"), kro.u("forwardDrawableResId"), kro.u("forward10DrawableResId"), kro.u("forward30DrawableResId"), kro.u("rewindDrawableResId"), kro.u("rewind10DrawableResId"), kro.u("rewind30DrawableResId"), kro.u("disconnectDrawableResId"), kro.u("notificationImageSizeDimenResId"), kro.u("castingToDeviceStringResId"), kro.u("stopLiveStreamStringResId"), kro.u("pauseStringResId"), kro.u("playStringResId"), kro.u("skipNextStringResId"), kro.u("skipPrevStringResId"), kro.u("forwardStringResId"), kro.u("forward10StringResId"), kro.u("forward30StringResId"), kro.u("rewindStringResId"), kro.u("rewind10StringResId"), kro.u("rewind30StringResId"), kro.u("disconnectStringResId"), null, false, false);
        this.a = true;
    }

    private static final boolean i(int i) {
        return i == 1 || i == 2;
    }

    public final void a(int i, long j) {
        b(i(i), i, j);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void b(boolean z, int i, long j) {
        if (z == i(i)) {
            if (this.a != z) {
                this.a = z;
                Object obj = this.c;
                if (obj != null) {
                    abhk abhkVar = (abhk) ((abgn) obj).a;
                    if (abhkVar.getParent() != null) {
                        abhkVar.getParent().requestDisallowInterceptTouchEvent(z);
                    }
                    abhkVar.f();
                }
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((abhp) it.next()).f(i, j);
            }
        }
    }

    public final keh c() {
        Object obj = this.b;
        return new keh((String) obj, null, null, (keu) this.c, false, this.a);
    }

    public final void d() {
        this.c = null;
    }

    public final synchronized Boolean e() {
        if (this.a) {
            this.c = Boolean.valueOf(((AccessibilityManager) this.b).isTouchExplorationEnabled());
            this.a = false;
        }
        return (Boolean) this.c;
    }

    public final synchronized void f() {
        this.a = true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Queue] */
    public final void g(lpb lpbVar) {
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(lpbVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Queue] */
    public final void h(lpa lpaVar) {
        lpb lpbVar;
        Object obj = this.b;
        synchronized (obj) {
            if (this.c == null || this.a) {
                return;
            }
            this.a = true;
            while (true) {
                synchronized (obj) {
                    lpbVar = (lpb) this.c.poll();
                    if (lpbVar == null) {
                        this.a = false;
                        return;
                    }
                }
                lpbVar.b(lpaVar);
            }
        }
    }

    public abhi(char[] cArr) {
        this.b = new Object();
    }

    public abhi() {
        this.b = new HashSet();
        this.a = false;
    }

    public abhi(AccessibilityManager accessibilityManager) {
        this.a = true;
        this.c = null;
        this.b = accessibilityManager;
    }
}
