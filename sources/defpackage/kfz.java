package defpackage;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kfz {
    public static final khn a = new khn("MediaSessionManager", (String) null);
    public final Context b;
    public final kbn c;
    public final kdx d;
    public final kcr e;
    public final keu f;
    public final ComponentName g;
    public final kfo h;
    public final kfo i;
    public kfm j;
    public CastDevice k;
    public fg l;
    public ez m;
    public boolean n;
    public final ket o;
    private final ComponentName p;
    private kfv q;
    private final Handler r;
    private final Runnable s;
    private PlaybackStateCompat.CustomAction t;
    private PlaybackStateCompat.CustomAction u;
    private PlaybackStateCompat.CustomAction v;
    private PlaybackStateCompat.CustomAction w;

    public kfz(Context context, kbn kbnVar, kdx kdxVar) {
        keu keuVar;
        this.b = context;
        this.c = kbnVar;
        this.d = kdxVar;
        kbk kbkVarB = kbk.b();
        kfv kfvVar = null;
        this.e = kbkVarB != null ? kbkVarB.d() : null;
        keh kehVar = kbnVar.h;
        this.f = kehVar == null ? null : kehVar.c;
        this.o = new kfy(this);
        String str = kehVar == null ? null : kehVar.b;
        this.p = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = kehVar == null ? null : kehVar.a;
        this.g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        kfo kfoVar = new kfo(context);
        this.h = kfoVar;
        kfoVar.c = new kfw(this, 1);
        kfo kfoVar2 = new kfo(context);
        this.i = kfoVar2;
        kfoVar2.c = new kfw(this, 0);
        this.r = new afkg(Looper.getMainLooper(), (byte[]) null);
        khn khnVar = kfv.a;
        keh kehVar2 = kbnVar.h;
        if (kehVar2 != null && (keuVar = kehVar2.c) != null) {
            kel kelVar = keuVar.G;
            if (kelVar != null) {
                List listE = kga.e(kelVar);
                int[] iArrF = kga.f(kelVar);
                int size = listE == null ? 0 : listE.size();
                if (listE == null || listE.isEmpty()) {
                    kfv.a.b("ket doesn't provide any action.", new Object[0]);
                } else if (listE.size() > 5) {
                    kfv.a.b("ket provides more than 5 actions.", new Object[0]);
                } else if (iArrF == null || (iArrF.length) == 0) {
                    kfv.a.b("ket doesn't provide any actions for compact view.", new Object[0]);
                } else {
                    for (int i : iArrF) {
                        if (i < 0 || i >= size) {
                            kfv.a.b("ketprovides a compact view action whose index is out of bounds.", new Object[0]);
                        }
                    }
                    kfvVar = new kfv(context);
                }
            } else {
                kfvVar = new kfv(context);
            }
        }
        this.q = kfvVar;
        this.s = new kcx(this, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r5.intValue() <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r6.intValue() >= (r5.b() - 1)) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long g(java.lang.String r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -945151566(0xffffffffc7aa21b2, float:-87107.39)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6a
            r1 = -945080078(0xffffffffc7ab38f2, float:-87665.89)
            if (r0 == r1) goto L2f
            r5 = 235550565(0xe0a3765, float:1.7036485E-30)
            if (r0 != r5) goto Lac
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Lac
            r5 = 3
            if (r7 != r5) goto L26
            r6 = 514(0x202, double:2.54E-321)
            r3 = r6
            r7 = r5
            goto L29
        L26:
            r5 = 512(0x200, double:2.53E-321)
            r3 = r5
        L29:
            r5 = 2
            if (r7 != r5) goto Lac
            r3 = 516(0x204, double:2.55E-321)
            goto Lac
        L2f:
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lac
            kfm r5 = r5.j
            if (r5 == 0) goto L64
            boolean r6 = r5.n()
            if (r6 == 0) goto L64
            kax r5 = r5.h()
            defpackage.kro.l(r5)
            r6 = 128(0x80, double:6.3E-322)
            boolean r6 = r5.e(r6)
            r0 = 16
            if (r6 != 0) goto La5
            int r6 = r5.p
            if (r6 != 0) goto La5
            int r6 = r5.c
            java.lang.Integer r5 = r5.d(r6)
            if (r5 == 0) goto L64
            int r5 = r5.intValue()
            if (r5 > 0) goto La5
        L64:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            r8.putBoolean(r5, r2)
            goto Lac
        L6a:
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Lac
            kfm r5 = r5.j
            if (r5 == 0) goto La7
            boolean r6 = r5.n()
            if (r6 == 0) goto La7
            kax r5 = r5.h()
            defpackage.kro.l(r5)
            r6 = 64
            boolean r6 = r5.e(r6)
            r0 = 32
            if (r6 != 0) goto La5
            int r6 = r5.p
            if (r6 != 0) goto La5
            int r6 = r5.c
            java.lang.Integer r6 = r5.d(r6)
            if (r6 == 0) goto La7
            int r6 = r6.intValue()
            int r5 = r5.b()
            int r5 = r5 + (-1)
            if (r6 >= r5) goto La7
        La5:
            r3 = r0
            goto Lac
        La7:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            r8.putBoolean(r5, r2)
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfz.g(java.lang.String, int, android.os.Bundle):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x0105 A[PHI: r9
      0x0105: PHI (r9v13 android.support.v4.media.session.PlaybackStateCompat$CustomAction) = 
      (r9v1 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v1 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v5 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v5 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v9 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v9 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v14 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
      (r9v14 android.support.v4.media.session.PlaybackStateCompat$CustomAction)
     binds: [B:53:0x00ce, B:55:0x00d2, B:38:0x0094, B:40:0x0098, B:23:0x005a, B:25:0x005e, B:8:0x0018, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    /* JADX WARN: Code duplicated, block: B:68:0x010f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:77:0x012e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    private final void h(fi fiVar, String str, kes kesVar) {
        PlaybackStateCompat.CustomAction customAction;
        keu keuVar;
        PlaybackStateCompat.CustomAction customAction2;
        keu keuVar2;
        keu keuVar3;
        keu keuVar4;
        PlaybackStateCompat.CustomAction customAction3 = null;
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                customAction = this.u;
                if (customAction != null || (keuVar = this.f) == null) {
                    customAction3 = customAction;
                } else {
                    Context context = this.b;
                    long j = keuVar.d;
                    int iD = kga.d(keuVar, j);
                    int iC = kga.c(keuVar, j);
                    String string = context.getResources().getString(iD);
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (iC == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string, iC, null);
                    this.u = customAction2;
                    customAction3 = customAction2;
                }
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                customAction = this.v;
                if (customAction != null || (keuVar2 = this.f) == null) {
                    customAction3 = customAction;
                } else {
                    String string2 = this.b.getResources().getString(keuVar2.F);
                    if (TextUtils.isEmpty(string2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    int i = keuVar2.r;
                    if (i == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i, null);
                    this.v = customAction2;
                    customAction3 = customAction2;
                }
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                customAction = this.w;
                if (customAction != null || (keuVar3 = this.f) == null) {
                    customAction3 = customAction;
                } else {
                    String string3 = this.b.getResources().getString(keuVar3.F);
                    if (TextUtils.isEmpty(string3)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    int i2 = keuVar3.r;
                    if (i2 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string3, i2, null);
                    this.w = customAction2;
                    customAction3 = customAction2;
                }
            case "com.google.android.gms.cast.framework.action.FORWARD":
                customAction = this.t;
                if (customAction != null || (keuVar4 = this.f) == null) {
                    customAction3 = customAction;
                } else {
                    Context context2 = this.b;
                    long j2 = keuVar4.d;
                    int iB = kga.b(keuVar4, j2);
                    int iA = kga.a(keuVar4, j2);
                    String string4 = context2.getResources().getString(iB);
                    if (TextUtils.isEmpty(string4)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (iA == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction2 = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, iA, null);
                    this.t = customAction2;
                    customAction3 = customAction2;
                }
            default:
                if (kesVar != null) {
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    String str2 = kesVar.c;
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    int i3 = kesVar.b;
                    if (i3 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction3 = new PlaybackStateCompat.CustomAction(str, str2, i3, null);
                }
        }
    }

    private static final boolean i(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    private final Uri j(kas kasVar) {
        kpo kpoVarN;
        keh kehVar = this.c.h;
        if ((kehVar == null ? null : kehVar.a()) != null) {
            kpoVarN = ket.n(kasVar);
        } else {
            kpoVarN = kasVar.c() ? (kpo) kasVar.a.get(0) : null;
        }
        if (kpoVarN != null) {
            return kpoVarN.b;
        }
        return null;
    }

    private final ek k() {
        fg fgVar = this.l;
        MediaMetadataCompat mediaMetadataCompatN = fgVar == null ? null : ((fg) fgVar.a).n();
        return mediaMetadataCompatN == null ? new ek() : new ek(mediaMetadataCompatN);
    }

    final void a(Bitmap bitmap, int i) {
        fg fgVar = this.l;
        if (fgVar != null) {
            if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
                bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(0);
            }
            ek ekVarK = k();
            ekVarK.b(i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
            fgVar.j(ekVarK.a());
        }
    }

    public final void b(boolean z) {
        if (this.c.i) {
            Runnable runnable = this.s;
            if (runnable != null) {
                this.r.removeCallbacks(runnable);
            }
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) kco.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.r.postDelayed(this.s, 1000L);
                }
            }
        }
    }

    public final void c() {
        kfv kfvVar = this.q;
        if (kfvVar != null) {
            khn.e();
            kfvVar.c.a();
            NotificationManager notificationManager = kfvVar.b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void d() {
        if (this.c.i) {
            this.r.removeCallbacks(this.s);
            Context context = this.b;
            Intent intent = new Intent(context, (Class<?>) kco.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void e(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatA;
        fg fgVar;
        kas kasVar;
        PendingIntent pendingIntentA;
        fg fgVar2 = this.l;
        if (fgVar2 != null) {
            Bundle bundle = new Bundle();
            fi fiVar = new fi();
            kfm kfmVar = this.j;
            if (kfmVar == null || this.q == null) {
                playbackStateCompatA = fiVar.a();
            } else {
                fiVar.e(i, (kfmVar.b() == 0 || kfmVar.p()) ? 0L : kfmVar.d(), 1.0f);
                if (i == 0) {
                    playbackStateCompatA = fiVar.a();
                } else {
                    keu keuVar = this.f;
                    kel kelVar = keuVar != null ? keuVar.G : null;
                    kfm kfmVar2 = this.j;
                    long jG = (kfmVar2 == null || kfmVar2.p() || this.j.t()) ? 0L : 256L;
                    if (kelVar != null) {
                        List<kes> listE = kga.e(kelVar);
                        if (listE != null) {
                            for (kes kesVar : listE) {
                                String str = kesVar.a;
                                if (i(str)) {
                                    jG |= g(str, i, bundle);
                                } else {
                                    h(fiVar, str, kesVar);
                                }
                            }
                        }
                    } else if (keuVar != null) {
                        for (String str2 : keuVar.c) {
                            if (i(str2)) {
                                jG |= g(str2, i, bundle);
                            } else {
                                h(fiVar, str2, null);
                            }
                        }
                    }
                    fiVar.a = jG;
                    playbackStateCompatA = fiVar.a();
                }
            }
            fgVar2.k(playbackStateCompatA);
            keu keuVar2 = this.f;
            if (keuVar2 != null && keuVar2.H) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (keuVar2 != null && keuVar2.I) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                fgVar2.h(bundle);
            }
            if (i == 0) {
                fgVar2.j(new ek().a());
                return;
            }
            if (this.j != null) {
                ComponentName componentName = this.p;
                if (componentName == null) {
                    pendingIntentA = null;
                } else {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    Context context = this.b;
                    int i2 = kyg.a;
                    pendingIntentA = kyg.a(context, intent, 201326592);
                }
                if (pendingIntentA != null) {
                    fgVar2.l(pendingIntentA);
                }
            }
            kfm kfmVar3 = this.j;
            if (kfmVar3 == null || (fgVar = this.l) == null || mediaInfo == null || (kasVar = mediaInfo.c) == null) {
                return;
            }
            long j = kfmVar3.p() ? 0L : mediaInfo.d;
            String strA = kasVar.a("com.google.android.gms.cast.metadata.TITLE");
            String strA2 = kasVar.a("com.google.android.gms.cast.metadata.SUBTITLE");
            ek ekVarK = k();
            ekVarK.c("android.media.metadata.DURATION", j);
            if (strA != null) {
                ekVarK.e("android.media.metadata.TITLE", strA);
                ekVarK.e("android.media.metadata.DISPLAY_TITLE", strA);
            }
            if (strA2 != null) {
                ekVarK.e("android.media.metadata.DISPLAY_SUBTITLE", strA2);
            }
            fgVar.j(ekVarK.a());
            Uri uriJ = j(kasVar);
            if (uriJ != null) {
                this.h.b(uriJ);
            } else {
                a(null, 0);
            }
            Uri uriJ2 = j(kasVar);
            if (uriJ2 != null) {
                this.i.b(uriJ2);
            } else {
                a(null, 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    public final void f() {
        MediaInfo mediaInfoF;
        kas kasVar;
        boolean z;
        boolean z2;
        kpo kpoVarO;
        kav kavVarG;
        MediaInfo mediaInfo;
        kfm kfmVar = this.j;
        if (kfmVar != null) {
            int iB = kfmVar.b();
            MediaInfo mediaInfoF2 = kfmVar.f();
            if (kfmVar.q() && (kavVarG = kfmVar.g()) != null && (mediaInfo = kavVarG.a) != null) {
                mediaInfoF2 = mediaInfo;
            }
            e(iB, mediaInfoF2);
            if (!kfmVar.n()) {
                c();
                d();
                return;
            }
            if (iB != 0) {
                kfv kfvVar = this.q;
                if (kfvVar != null) {
                    khn.e();
                    CastDevice castDevice = this.k;
                    kfm kfmVar2 = this.j;
                    fg fgVar = this.l;
                    if (castDevice != null && kfmVar2 != null && fgVar != null && (mediaInfoF = kfmVar2.f()) != null && (kasVar = mediaInfoF.c) != null) {
                        kax kaxVarH = kfmVar2.h();
                        if (kaxVarH == null) {
                            z = false;
                            z2 = z;
                        } else {
                            int i = kaxVarH.p;
                            if (i == 1 || i == 2 || i == 3) {
                                z = true;
                                z2 = z;
                            } else {
                                Integer numD = kaxVarH.d(kaxVarH.c);
                                if (numD != null) {
                                    boolean z3 = numD.intValue() > 0;
                                    z = numD.intValue() < kaxVarH.b() + (-1);
                                    z2 = z3;
                                } else {
                                    z = false;
                                    z2 = z;
                                }
                            }
                        }
                        kfu kfuVar = new kfu(kfmVar2.c() == 2, mediaInfoF.a, kasVar.a("com.google.android.gms.cast.metadata.TITLE"), castDevice.d, fgVar.c(), z, z2);
                        kfu kfuVar2 = kfvVar.e;
                        if (kfuVar2 == null || kfuVar.b != kfuVar2.b || kfuVar.c != kfuVar2.c || !khe.g(kfuVar.d, kfuVar2.d) || !khe.g(kfuVar.e, kfuVar2.e) || kfuVar.f != kfuVar2.f || kfuVar.g != kfuVar2.g) {
                            kfvVar.e = kfuVar;
                            kfvVar.a();
                        }
                        if (kfvVar.f != null) {
                            kpoVarO = ket.o(kasVar, kfvVar.d);
                        } else {
                            kpoVarO = kasVar.c() ? (kpo) kasVar.a.get(0) : null;
                        }
                        mgk mgkVar = new mgk(kpoVarO);
                        mgk mgkVar2 = kfvVar.g;
                        if (mgkVar2 == null || !khe.g(mgkVar.a, mgkVar2.a)) {
                            kfo kfoVar = kfvVar.c;
                            kfoVar.c = new kft(kfvVar, mgkVar);
                            kfoVar.b((Uri) mgkVar.a);
                        }
                    }
                }
                if (kfmVar.q()) {
                    return;
                }
                b(true);
            }
        }
    }
}
