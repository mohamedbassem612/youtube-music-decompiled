package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class gbm implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private final Context b;
    private Application c;
    private final PowerManager d;
    private final KeyguardManager e;
    private BroadcastReceiver f;
    private final gbd g;
    private WeakReference h;
    private WeakReference i;
    private gba j;
    private byte k = -1;
    private int l = -1;
    private long m = -3;

    public gbm(Context context, gbd gbdVar) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.g = gbdVar;
        this.d = (PowerManager) applicationContext.getSystemService("power");
        this.e = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.c = (Application) applicationContext;
            this.j = new gba((Application) applicationContext, this);
        }
        d(null);
    }

    private final void e(Activity activity, int i) {
        Window window;
        if (this.i == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.l = i;
    }

    private final void f() {
        a.post(new dxk(this, 10, null));
    }

    private final void g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.h = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            gbl gblVar = new gbl(this);
            this.f = gblVar;
            this.b.registerReceiver(gblVar, intentFilter);
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.j);
            } catch (Exception unused) {
            }
        }
    }

    private final void h(View view) {
        try {
            WeakReference weakReference = this.h;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.h = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            try {
                this.b.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f = null;
        }
        Application application = this.c;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.j);
            } catch (Exception unused4) {
            }
        }
    }

    public final long a() {
        if (this.m <= -2 && b() == null) {
            this.m = -3L;
        }
        return this.m;
    }

    final View b() {
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    public final void c() {
        Activity activity;
        if (this.i != null) {
            View viewB = b();
            if (viewB == null) {
                this.m = -3L;
                this.k = (byte) -1;
                return;
            }
            int i = 0;
            int i2 = viewB.getVisibility() != 0 ? 1 : 0;
            if (!viewB.isShown()) {
                i2 |= 2;
            }
            PowerManager powerManager = this.d;
            if (powerManager != null && !powerManager.isScreenOn()) {
                i2 |= 4;
            }
            if (!this.g.a) {
                KeyguardManager keyguardManager = this.e;
                if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                    i2 |= 8;
                } else {
                    char[] cArr = gbj.a;
                    View rootView = viewB.getRootView();
                    if (rootView == null) {
                        rootView = viewB;
                    }
                    Context context = rootView.getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper) || i >= 10) {
                            activity = null;
                            break;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                            i++;
                        }
                    }
                    if (activity == null) {
                        i2 |= 8;
                    } else {
                        Window window = activity.getWindow();
                        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                        if (attributes == null || (attributes.flags & 524288) == 0) {
                            i2 |= 8;
                        }
                    }
                }
            }
            if (!viewB.getGlobalVisibleRect(new Rect())) {
                i2 |= 16;
            }
            if (!viewB.getLocalVisibleRect(new Rect())) {
                i2 |= 32;
            }
            int windowVisibility = viewB.getWindowVisibility();
            int i3 = this.l;
            if (i3 != -1) {
                windowVisibility = i3;
            }
            if (windowVisibility != 0) {
                i2 |= 64;
            }
            if (this.k != i2) {
                this.k = (byte) i2;
                this.m = i2 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i2);
            }
        }
    }

    final void d(View view) {
        long j;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            h(viewB);
        }
        this.i = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                g(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.m = j;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        c();
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        g(view);
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        c();
        f();
        h(view);
    }
}
