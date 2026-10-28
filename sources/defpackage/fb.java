package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fb {
    public final MediaSession a;
    final MediaSessionCompat$Token b;
    public final Object c = new Object();
    public final RemoteCallbackList d = new RemoteCallbackList();
    PlaybackStateCompat e;
    public List f;
    MediaMetadataCompat g;
    public int h;
    public int i;
    ez j;
    brf k;
    final ep l;

    public fb(Context context, String str) {
        MediaSession mediaSessionG = g(context, str);
        this.a = mediaSessionG;
        ep epVar = new ep(this);
        this.l = epVar;
        this.b = new MediaSessionCompat$Token(mediaSessionG.getSessionToken(), epVar);
        f(3);
    }

    public final ez a() {
        ez ezVar;
        synchronized (this.c) {
            ezVar = this.j;
        }
        return ezVar;
    }

    public brf b() {
        brf brfVar;
        synchronized (this.c) {
            brfVar = this.k;
        }
        return brfVar;
    }

    public final String c() {
        try {
            MediaSession mediaSession = this.a;
            return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }

    public final void d(ez ezVar, Handler handler) {
        synchronized (this.c) {
            this.j = ezVar;
            this.a.setCallback(ezVar == null ? null : ezVar.b, handler);
            if (ezVar != null) {
                synchronized (ezVar.a) {
                    try {
                        ezVar.c = new WeakReference(this);
                        ex exVar = ezVar.d;
                        if (exVar != null) {
                            exVar.removeCallbacksAndMessages(null);
                        }
                        ezVar.d = handler != null ? new ex(ezVar, handler.getLooper()) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void e(brf brfVar) {
        synchronized (this.c) {
            this.k = brfVar;
        }
    }

    public final void f(int i) {
        this.a.setFlags(i | 3);
    }

    public MediaSession g(Context context, String str) {
        return new MediaSession(context, str);
    }

    public void h() {
        throw null;
    }
}
