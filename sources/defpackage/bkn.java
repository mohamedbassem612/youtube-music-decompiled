package defpackage;

import android.animation.ValueAnimator;
import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bkn implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ bkn(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [cal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [cal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                Object obj = ((bkq) this.a).h.a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i = 0;
                while (true) {
                    bkq bkqVar = (bkq) obj;
                    ArrayList arrayList = bkqVar.b;
                    if (i >= arrayList.size()) {
                        if (bkqVar.d) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                            if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                                ere ereVar = bkqVar.f;
                                ValueAnimator.unregisterDurationScaleChangeListener(ereVar.a);
                                ereVar.a = null;
                            }
                            bkqVar.d = false;
                        }
                        if (arrayList.size() > 0) {
                            bkqVar.g.m(bkqVar.c);
                            return;
                        }
                        return;
                    }
                    bko bkoVar = (bko) arrayList.get(i);
                    if (bkoVar != null) {
                        aha ahaVar = bkqVar.a;
                        Long l = (Long) ahaVar.get(bkoVar);
                        if (l == null) {
                            bkoVar.a(jUptimeMillis);
                        } else if (l.longValue() < jUptimeMillis2) {
                            ahaVar.remove(bkoVar);
                            bkoVar.a(jUptimeMillis);
                        }
                    }
                    i++;
                }
                break;
            case 1:
                bcx bcxVar = (bcx) this.a;
                if (bcxVar.e) {
                    if (bcxVar.c) {
                        bcxVar.c = false;
                        bcw bcwVar = bcxVar.a;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        bcwVar.e = jCurrentAnimationTimeMillis;
                        bcwVar.g = -1L;
                        bcwVar.f = jCurrentAnimationTimeMillis;
                        bcwVar.h = 0.5f;
                    }
                    bcw bcwVar2 = bcxVar.a;
                    if ((bcwVar2.g > 0 && AnimationUtils.currentAnimationTimeMillis() > bcwVar2.g + ((long) bcwVar2.i)) || !bcxVar.b()) {
                        bcxVar.e = false;
                        return;
                    }
                    if (bcxVar.d) {
                        bcxVar.d = false;
                        long jUptimeMillis3 = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis3, jUptimeMillis3, 3, 0.0f, 0.0f, 0);
                        bcxVar.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (bcwVar2.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = bcwVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - bcwVar2.f;
                    bcwVar2.f = jCurrentAnimationTimeMillis2;
                    bcxVar.f.scrollListBy((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * bcwVar2.d));
                    View view = bcxVar.b;
                    int i2 = bac.a;
                    view.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ((bls) this.a).a();
                return;
            case 3:
                bqp bqpVar = (bqp) this.a;
                bqpVar.g.c.remove(bqpVar.h.l());
                return;
            case 4:
                this.a.ga();
                return;
            case 5:
                this.a.fZ();
                return;
            case 6:
                cbj cbjVar = (cbj) this.a;
                MediaRouter2 mediaRouter2 = cbjVar.b;
                mediaRouter2.getClass();
                MediaRouter2$ControllerCallback mediaRouter2$ControllerCallback = cbjVar.d;
                mediaRouter2$ControllerCallback.getClass();
                mediaRouter2.unregisterControllerCallback(mediaRouter2$ControllerCallback);
                cbjVar.d = null;
                MediaRouter2 mediaRouter3 = cbjVar.b;
                MediaRouter2$RouteCallback mediaRouter2$RouteCallback = cbjVar.c;
                mediaRouter2$RouteCallback.getClass();
                mediaRouter3.unregisterRouteCallback(mediaRouter2$RouteCallback);
                return;
            case 7:
                cbm cbmVar = (cbm) this.a;
                AudioManager audioManager = cbmVar.a;
                if (audioManager != null) {
                    AudioDeviceCallback audioDeviceCallback = cbmVar.b;
                    audioDeviceCallback.getClass();
                    audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
                    return;
                }
                return;
            case 8:
                try {
                    ccs.h((cdn) this.a);
                    return;
                } catch (cbo e) {
                    bvx.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 9:
                ces cesVar = (ces) this.a;
                cesVar.H(cesVar.B(), 1028, new cce(2));
                cesVar.g.f();
                return;
            case 10:
                ((cfj) this.a).d();
                return;
            case 11:
                int i3 = cfg.b;
                ((cfj) this.a).d();
                return;
            case 12:
                dje djeVar = (dje) this.a;
                if (djeVar.i()) {
                    djeVar.h(-1, new cce(14));
                    return;
                }
                return;
            case 13:
                chd chdVar = (chd) this.a;
                if (chdVar.k >= 300000) {
                    chdVar.c.h();
                    chdVar.k = 0L;
                    return;
                }
                return;
            case 14:
                ((chz) this.a).o();
                return;
            case 15:
                Object obj2 = this.a;
                try {
                    ((chz) obj2).j(false);
                    return;
                } catch (Exception e2) {
                    ((chz) obj2).l = new IOException(e2);
                    return;
                }
            case 16:
                Object obj3 = this.a;
                cjr cjrVar = (cjr) obj3;
                if (cjrVar.b) {
                    return;
                }
                cju cjuVar = cjrVar.a;
                if (cjuVar != null) {
                    cjuVar.p(cjrVar.d);
                }
                cjrVar.c.c.remove(obj3);
                cjrVar.b = true;
                return;
            case 17:
                ((cjo) this.a).p(null);
                return;
            case 18:
                Object obj4 = this.a;
                Object obj5 = ((cld) obj4).a;
                synchronized (obj5) {
                    if (((cld) obj4).h) {
                        return;
                    }
                    long j2 = ((cld) obj4).g - 1;
                    ((cld) obj4).g = j2;
                    if (j2 > 0) {
                        return;
                    }
                    if (j2 >= 0) {
                        ((cld) obj4).a();
                        return;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException();
                    synchronized (obj5) {
                        try {
                            ((cld) obj4).i = illegalStateException;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
            case 19:
                ((cog) this.a).n = true;
                return;
            default:
                ((cog) this.a).u();
                return;
        }
    }

    public bkn(Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
