package defpackage;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ez {
    final Object a = new Object();
    final MediaSession.Callback b = new ey(this);
    WeakReference c = new WeakReference(null);
    ex d;
    private boolean e;

    public boolean u(Intent intent) {
        fb fbVar;
        ex exVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT >= 27) {
            return false;
        }
        synchronized (this.a) {
            fbVar = (fb) this.c.get();
            exVar = this.d;
        }
        if (fbVar == null || exVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
            return false;
        }
        brf brfVarB = fbVar.b();
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 79 && keyCode != 85) {
            v(fbVar, exVar);
            return false;
        }
        if (keyEvent.getRepeatCount() != 0) {
            v(fbVar, exVar);
        } else if (this.e) {
            exVar.removeMessages(1);
            this.e = false;
            PlaybackStateCompat playbackStateCompat = fbVar.e;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.e) & 32) != 0) {
                q();
            }
        } else {
            this.e = true;
            exVar.sendMessageDelayed(exVar.obtainMessage(1, brfVarB), ViewConfiguration.getDoubleTapTimeout());
        }
        return true;
    }

    final void v(fb fbVar, Handler handler) {
        if (this.e) {
            boolean z = false;
            this.e = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = fbVar.e;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            if (playbackStateCompat != null && playbackStateCompat.a == 3) {
                z = true;
            }
            long j2 = 516 & j;
            long j3 = j & 514;
            if (z) {
                if (j3 != 0) {
                    d();
                }
            } else if (j2 != 0) {
                e();
            }
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void l() {
    }

    public void q() {
    }

    public void r() {
    }

    public void t() {
    }

    public void m(long j) {
    }

    public void n(RatingCompat ratingCompat) {
    }

    public void o(int i) {
    }

    public void p(int i) {
    }

    public void s(long j) {
    }

    public void b(String str, Bundle bundle) {
    }

    public void f(String str, Bundle bundle) {
    }

    public void g(String str, Bundle bundle) {
    }

    public void h(Uri uri, Bundle bundle) {
    }

    public void i(String str, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(Uri uri, Bundle bundle) {
    }

    public void a(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
