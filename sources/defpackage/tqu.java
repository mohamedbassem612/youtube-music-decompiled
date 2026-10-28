package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.MessageQueue;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tqu extends BroadcastReceiver implements ComponentCallbacks2, Thread.UncaughtExceptionHandler, MessageQueue.IdleHandler, bnu {
    public Thread.UncaughtExceptionHandler a;
    final /* synthetic */ tqv b;

    public tqu(tqv tqvVar) {
        this.b = tqvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            this.b.b(143, 1, null);
        } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
            this.b.b(143, 0, null);
        }
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        this.b.b(130, 1, null);
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        this.b.b(130, 0, null);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.b.b(130, 0, null);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.b.b(267, 8, null);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.b.b(SemanticState.Focused, 2, null);
        } catch (RuntimeException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        try {
            this.b.b(SemanticState.Focused, 3, null);
        } catch (RuntimeException unused2) {
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
