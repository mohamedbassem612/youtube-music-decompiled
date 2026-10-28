package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.apps.youtube.music.R;
import j$.util.DesugarCollections;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class fg {
    public final Object a;
    public final Object b;
    public final Object c;

    public fg(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = new ArrayList();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.c = new fe(context, str);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.c = new fd(context, str);
        } else {
            this.c = new fc(context, str);
        }
        g(new ew(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        ((fb) this.c).a.setMediaButtonReceiver(pendingIntent);
        this.a = new fg(context, c());
    }

    public static int a() {
        Resources system = Resources.getSystem();
        int i = system.getDisplayMetrics().widthPixels;
        try {
            return system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
        } catch (Resources.NotFoundException unused) {
            return i;
        }
    }

    public static Bundle b(Bundle bundle) {
        if (bundle != null) {
            d(bundle);
            try {
                bundle.isEmpty();
                return bundle;
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
            }
        }
        return null;
    }

    public static void d(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(fg.class.getClassLoader());
        }
    }

    public static void r(Activity activity, fg fgVar) {
        activity.getWindow().getDecorView().setTag(R.id.media_controller_compat_view_tag, fgVar);
        axfd.az(activity, fgVar);
    }

    public final MediaSessionCompat$Token c() {
        return ((fb) this.c).b;
    }

    public final void e() {
        Object obj = this.c;
        fb fbVar = (fb) obj;
        fbVar.d.kill();
        if (Build.VERSION.SDK_INT == 27) {
            try {
                MediaSession mediaSession = ((fb) obj).a;
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
            }
        }
        MediaSession mediaSession2 = fbVar.a;
        mediaSession2.setCallback(null);
        fbVar.l.a.set(null);
        mediaSession2.release();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void f(boolean z) {
        ((fb) this.c).a.setActive(z);
        ?? r2 = this.b;
        int size = r2.size();
        for (int i = 0; i < size; i++) {
            ((ff) r2.get(i)).a();
        }
    }

    public final void g(ez ezVar, Handler handler) {
        Object obj = this.c;
        if (ezVar == null) {
            ((fb) obj).d(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        ((fb) obj).d(ezVar, handler);
    }

    public final void h(Bundle bundle) {
        ((fb) this.c).a.setExtras(bundle);
    }

    public final void i(int i) {
        ((fb) this.c).f(i);
    }

    public final void j(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        fb fbVar = (fb) this.c;
        fbVar.g = mediaMetadataCompat;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.c == null) {
                MediaMetadata.Builder builder = new MediaMetadata.Builder();
                Bundle bundle = mediaMetadataCompat.b;
                for (String str : bundle.keySet()) {
                    Integer num = (Integer) MediaMetadataCompat.a.get(str);
                    if (num == null) {
                        num = -1;
                    }
                    int iIntValue = num.intValue();
                    if (iIntValue == 0) {
                        builder.putLong(str, bundle.getLong(str, 0L));
                    } else if (iIntValue == 1) {
                        builder.putText(str, bundle.getCharSequence(str));
                    } else if (iIntValue == 2) {
                        builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                    } else if (iIntValue != 3) {
                        Object obj = bundle.get(str);
                        if (obj == null || (obj instanceof CharSequence)) {
                            builder.putText(str, (CharSequence) obj);
                        } else if (obj instanceof Long) {
                            builder.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Bitmap) {
                            builder.putBitmap(str, (Bitmap) obj);
                        } else if (obj instanceof Rating) {
                            builder.putRating(str, (Rating) obj);
                        }
                    } else {
                        builder.putRating(str, (Rating) bundle.getParcelable(str));
                    }
                }
                mediaMetadataCompat.c = builder.build();
            }
            mediaMetadata = mediaMetadataCompat.c;
        }
        fbVar.a.setMetadata(mediaMetadata);
    }

    public final void k(PlaybackStateCompat playbackStateCompat) {
        Object obj = this.c;
        fb fbVar = (fb) obj;
        fbVar.e = playbackStateCompat;
        synchronized (fbVar.c) {
            RemoteCallbackList remoteCallbackList = ((fb) obj).d;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                iBeginBroadcast--;
                if (iBeginBroadcast < 0) {
                    break;
                } else {
                    try {
                        ((en) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).a(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
            }
            ((fb) obj).d.finishBroadcast();
        }
        MediaSession mediaSession = fbVar.a;
        if (playbackStateCompat.l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(playbackStateCompat.a, playbackStateCompat.b, playbackStateCompat.d, playbackStateCompat.h);
            builder.setBufferedPosition(playbackStateCompat.c);
            builder.setActions(playbackStateCompat.e);
            builder.setErrorMessage(playbackStateCompat.g);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.i) {
                PlaybackState.CustomAction customActionBuild = customAction.e;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(customAction.a, customAction.b, customAction.c);
                    builder2.setExtras(customAction.d);
                    customActionBuild = builder2.build();
                }
                builder.addCustomAction(customActionBuild);
            }
            builder.setActiveQueueItemId(playbackStateCompat.j);
            builder.setExtras(playbackStateCompat.k);
            playbackStateCompat.l = builder.build();
        }
        mediaSession.setPlaybackState(playbackStateCompat.l);
    }

    public final void l(PendingIntent pendingIntent) {
        ((fb) this.c).a.setSessionActivity(pendingIntent);
    }

    public final boolean m() {
        return ((fb) this.c).a.isActive();
    }

    public final MediaMetadataCompat n() {
        MediaMetadata metadata = ((MediaController) ((axfd) this.a).d).getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.c(metadata);
        }
        return null;
    }

    public final PlaybackStateCompat o() {
        axfd axfdVar = (axfd) this.a;
        Object obj = axfdVar.b;
        if (((MediaSessionCompat$Token) obj).a() != null) {
            try {
                return ((MediaSessionCompat$Token) obj).a().a();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = ((MediaController) axfdVar.d).getPlaybackState();
        if (playbackState == null) {
            return null;
        }
        return PlaybackStateCompat.a(playbackState);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0068 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(defpackage.et r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L6d
            java.lang.Object r0 = r4.b
            boolean r0 = r0.remove(r5)
            if (r0 != 0) goto L12
            java.lang.String r4 = "MediaControllerCompat"
            java.lang.String r5 = "the callback has never been registered"
            android.util.Log.w(r4, r5)
            goto L63
        L12:
            r0 = 0
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L68
            android.media.session.MediaController$Callback r1 = r5.a     // Catch: java.lang.Throwable -> L68
            r2 = r4
            axfd r2 = (defpackage.axfd) r2     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.d     // Catch: java.lang.Throwable -> L68
            android.media.session.MediaController r2 = (android.media.session.MediaController) r2     // Catch: java.lang.Throwable -> L68
            r2.unregisterCallback(r1)     // Catch: java.lang.Throwable -> L68
            r1 = r4
            axfd r1 = (defpackage.axfd) r1     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L68
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L68
            r2 = r4
            axfd r2 = (defpackage.axfd) r2     // Catch: java.lang.Throwable -> L66
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L66
            r3 = r2
            android.support.v4.media.session.MediaSessionCompat$Token r3 = (android.support.v4.media.session.MediaSessionCompat$Token) r3     // Catch: java.lang.Throwable -> L66
            eq r3 = r3.a()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L58
            axfd r4 = (defpackage.axfd) r4     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            java.lang.Object r4 = r4.c     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            java.lang.Object r4 = r4.remove(r5)     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            eu r4 = (defpackage.eu) r4     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            if (r4 == 0) goto L5f
            r5.c = r0     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            android.support.v4.media.session.MediaSessionCompat$Token r2 = (android.support.v4.media.session.MediaSessionCompat$Token) r2     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            eq r2 = r2.a()     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            r2.c(r4)     // Catch: android.os.RemoteException -> L4f java.lang.Throwable -> L66
            goto L5f
        L4f:
            r4 = move-exception
            java.lang.String r2 = "MediaControllerCompat"
            java.lang.String r3 = "Dead object in unregisterCallback."
            android.util.Log.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L66
            goto L5f
        L58:
            axfd r4 = (defpackage.axfd) r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r4.e     // Catch: java.lang.Throwable -> L66
            r4.remove(r5)     // Catch: java.lang.Throwable -> L66
        L5f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            r5.e(r0)
        L63:
            return
        L64:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L66
            throw r4     // Catch: java.lang.Throwable -> L68
        L66:
            r4 = move-exception
            goto L64
        L68:
            r4 = move-exception
            r5.e(r0)
            throw r4
        L6d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "callback must not be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg.p(et):void");
    }

    public final void q(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        ((MediaController) ((axfd) this.a).d).dispatchMediaButtonEvent(keyEvent);
    }

    public final void s() {
        ((acdo) this.c).c();
    }

    public final void t() {
        ((acdo) this.c).d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [abfz, java.lang.Object] */
    public final void u() {
        this.a.m();
        ((acdo) this.c).e();
    }

    public final void v() {
        ((acdo) this.c).f();
    }

    @Deprecated
    public final void w(long j) {
        ((acdo) this.c).h(j);
    }

    @Deprecated
    public final void x(long j, appa appaVar) {
        ((acdo) this.c).i(j, appaVar);
    }

    public final fdr y() {
        return new ev(((MediaController) ((axfd) this.a).d).getTransportControls());
    }

    public fg(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.b = DesugarCollections.synchronizedSet(new HashSet());
            this.c = mediaSessionCompat$Token;
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new axfd(context, mediaSessionCompat$Token);
                return;
            } else {
                this.a = new axfd(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public fg(acdo acdoVar, tce tceVar, abfz abfzVar) {
        this.c = acdoVar;
        this.b = tceVar;
        this.a = abfzVar;
    }
}
