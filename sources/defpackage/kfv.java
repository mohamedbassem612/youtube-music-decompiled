package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.youtube.music.R;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kfv {
    public static final khn a = new khn("MediaNotificationProxy", (String) null);
    public final NotificationManager b;
    public final kfo c;
    public final kem d;
    public kfu e;
    public final ket f;
    public mgk g;
    private final Context h;
    private final kbk i;
    private final keu j;
    private final ComponentName k;
    private final ComponentName l;
    private List m = new ArrayList();
    private int[] n;
    private final long o;
    private final Resources p;
    private Notification q;
    private atn r;
    private atn s;
    private atn t;
    private atn u;
    private atn v;
    private atn w;
    private atn x;
    private atn y;

    public kfv(Context context) {
        this.h = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        kbk kbkVarB = kbk.b();
        kro.l(kbkVarB);
        this.i = kbkVarB;
        kbn kbnVarC = kbkVarB.c();
        kro.l(kbnVarC);
        keh kehVar = kbnVarC.h;
        kro.l(kehVar);
        keu keuVar = kehVar.c;
        kro.l(keuVar);
        this.j = keuVar;
        this.f = kehVar.a();
        Resources resources = context.getResources();
        this.p = resources;
        this.k = new ComponentName(context.getApplicationContext(), kehVar.a);
        if (TextUtils.isEmpty(keuVar.e)) {
            this.l = null;
        } else {
            this.l = new ComponentName(context.getApplicationContext(), keuVar.e);
        }
        this.o = keuVar.d;
        int dimensionPixelSize = resources.getDimensionPixelSize(keuVar.s);
        kem kemVar = new kem(1, dimensionPixelSize, dimensionPixelSize);
        this.d = kemVar;
        this.c = new kfo(context.getApplicationContext(), kemVar);
        if (notificationManager != null) {
            kro.l(context);
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        kdd.e(agzl.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final atn b(String str) {
        atn atnVar;
        atn atnVar2;
        PendingIntent pendingIntentB;
        PendingIntent pendingIntentB2;
        int i;
        int i2;
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                long j = this.o;
                atnVar = this.w;
                if (atnVar == null) {
                    Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent.setComponent(this.k);
                    intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    Context context = this.h;
                    int i3 = kyg.a;
                    PendingIntent pendingIntentB3 = kyg.b(context, intent, 201326592);
                    keu keuVar = this.j;
                    int iC = kga.c(keuVar, j);
                    atn atnVarH = aag.h(iC == 0 ? null : IconCompat.g(null, "", iC), atr.c(this.p.getString(kga.d(keuVar, j))), pendingIntentB3, new Bundle(), null);
                    this.w = atnVarH;
                    return atnVarH;
                }
                return atnVar;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                boolean z = this.e.f;
                atnVar2 = this.t;
                if (atnVar2 == null) {
                    if (z) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent2.setComponent(this.k);
                        Context context2 = this.h;
                        int i4 = kyg.a;
                        pendingIntentB = kyg.b(context2, intent2, 67108864);
                    } else {
                        pendingIntentB = null;
                    }
                    keu keuVar2 = this.j;
                    String string = this.p.getString(keuVar2.x);
                    int i5 = keuVar2.j;
                    atn atnVarH2 = aag.h(i5 == 0 ? null : IconCompat.g(null, "", i5), atr.c(string), pendingIntentB, new Bundle(), null);
                    this.t = atnVarH2;
                    return atnVarH2;
                }
                return atnVar2;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                boolean z2 = this.e.g;
                atnVar2 = this.u;
                if (atnVar2 == null) {
                    if (z2) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent3.setComponent(this.k);
                        Context context3 = this.h;
                        int i6 = kyg.a;
                        pendingIntentB2 = kyg.b(context3, intent3, 67108864);
                    } else {
                        pendingIntentB2 = null;
                    }
                    keu keuVar3 = this.j;
                    String string2 = this.p.getString(keuVar3.y);
                    int i7 = keuVar3.k;
                    atn atnVarH3 = aag.h(i7 == 0 ? null : IconCompat.g(null, "", i7), atr.c(string2), pendingIntentB2, new Bundle(), null);
                    this.u = atnVarH3;
                    return atnVarH3;
                }
                return atnVar2;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                atnVar = this.y;
                if (atnVar == null) {
                    Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent4.setComponent(this.k);
                    Context context4 = this.h;
                    int i8 = kyg.a;
                    PendingIntent pendingIntentB4 = kyg.b(context4, intent4, 67108864);
                    keu keuVar4 = this.j;
                    String string3 = this.p.getString(keuVar4.F);
                    int i9 = keuVar4.r;
                    atn atnVarH4 = aag.h(i9 == 0 ? null : IconCompat.g(null, "", i9), atr.c(string3), pendingIntentB4, new Bundle(), null);
                    this.y = atnVarH4;
                    return atnVarH4;
                }
                return atnVar;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                atnVar = this.x;
                if (atnVar == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent5.setComponent(this.k);
                    Context context5 = this.h;
                    int i10 = kyg.a;
                    PendingIntent pendingIntentB5 = kyg.b(context5, intent5, 67108864);
                    keu keuVar5 = this.j;
                    String string4 = this.p.getString(keuVar5.F, "");
                    int i11 = keuVar5.r;
                    atn atnVarH5 = aag.h(i11 == 0 ? null : IconCompat.g(null, "", i11), atr.c(string4), pendingIntentB5, new Bundle(), null);
                    this.x = atnVarH5;
                    return atnVarH5;
                }
                return atnVar;
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                kfu kfuVar = this.e;
                int i12 = kfuVar.c;
                if (kfuVar.b) {
                    atnVar = this.s;
                    if (atnVar == null) {
                        keu keuVar6 = this.j;
                        if (i12 == 2) {
                            i = keuVar6.g;
                            i2 = keuVar6.u;
                        } else {
                            i = keuVar6.h;
                            i2 = keuVar6.v;
                        }
                        Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent6.setComponent(this.k);
                        Context context6 = this.h;
                        int i13 = kyg.a;
                        atn atnVarH6 = aag.h(i == 0 ? null : IconCompat.g(null, "", i), atr.c(this.p.getString(i2)), kyg.b(context6, intent6, 67108864), new Bundle(), null);
                        this.s = atnVarH6;
                        return atnVarH6;
                    }
                } else {
                    atnVar = this.r;
                    if (atnVar == null) {
                        Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent7.setComponent(this.k);
                        Context context7 = this.h;
                        int i14 = kyg.a;
                        PendingIntent pendingIntentB6 = kyg.b(context7, intent7, 67108864);
                        keu keuVar7 = this.j;
                        String string5 = this.p.getString(keuVar7.w);
                        int i15 = keuVar7.i;
                        atn atnVarH7 = aag.h(i15 == 0 ? null : IconCompat.g(null, "", i15), atr.c(string5), pendingIntentB6, new Bundle(), null);
                        this.r = atnVarH7;
                        return atnVarH7;
                    }
                }
                return atnVar;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                long j2 = this.o;
                atnVar = this.v;
                if (atnVar == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent8.setComponent(this.k);
                    intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                    Context context8 = this.h;
                    int i16 = kyg.a;
                    PendingIntent pendingIntentB7 = kyg.b(context8, intent8, 201326592);
                    keu keuVar8 = this.j;
                    int iA = kga.a(keuVar8, j2);
                    atn atnVarH8 = aag.h(iA == 0 ? null : IconCompat.g(null, "", iA), atr.c(this.p.getString(kga.b(keuVar8, j2))), pendingIntentB7, new Bundle(), null);
                    this.v = atnVarH8;
                    return atnVarH8;
                }
                return atnVar;
            default:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j3 = this.o;
                    atnVar = this.w;
                    if (atnVar == null) {
                        Intent intent9 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                        intent9.setComponent(this.k);
                        intent9.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                        Context context9 = this.h;
                        int i17 = kyg.a;
                        PendingIntent pendingIntentB8 = kyg.b(context9, intent9, 201326592);
                        keu keuVar9 = this.j;
                        int iC2 = kga.c(keuVar9, j3);
                        atn atnVarH9 = aag.h(iC2 == 0 ? null : IconCompat.g(null, "", iC2), atr.c(this.p.getString(kga.d(keuVar9, j3))), pendingIntentB8, new Bundle(), null);
                        this.w = atnVarH9;
                        return atnVarH9;
                    }
                    return atnVar;
                }
                a.b("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void a() {
        Object obj;
        PendingIntent activities;
        atn atnVarB;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.e == null) {
            return;
        }
        mgk mgkVar = this.g;
        if (mgkVar == null || (obj = mgkVar.b) == null) {
            obj = null;
        } else {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
                obj = null;
            }
        }
        Context context = this.h;
        atr atrVar = new atr(context, "cast_media_notification");
        atrVar.o((Bitmap) obj);
        keu keuVar = this.j;
        atrVar.q(keuVar.f);
        atrVar.l(this.e.d);
        atrVar.k(this.p.getString(keuVar.t, this.e.e));
        atrVar.e(2, true);
        atrVar.m = false;
        atrVar.A = 1;
        ComponentName componentName = this.l;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            avf avfVar = new avf(context);
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(avfVar.b.getPackageManager());
            }
            if (component != null) {
                avfVar.b(component);
            }
            avfVar.a(intent);
            int i = kyg.a;
            ArrayList arrayList = avfVar.a;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(avfVar.b, 1, intentArr, 201326592, null);
        }
        if (activities != null) {
            atrVar.h = activities;
        }
        kel kelVar = keuVar.G;
        if (kelVar != null) {
            khn.e();
            int[] iArrF = kga.f(kelVar);
            this.n = iArrF == null ? null : (int[]) iArrF.clone();
            List<kes> listE = kga.e(kelVar);
            this.m = new ArrayList();
            if (listE != null) {
                for (kes kesVar : listE) {
                    String str = kesVar.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        atnVarB = b(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.k);
                        int i2 = kyg.a;
                        PendingIntent pendingIntentB = kyg.b(context, intent2, 67108864);
                        int i3 = kesVar.b;
                        atnVarB = aag.h(i3 == 0 ? null : IconCompat.g(null, "", i3), atr.c(kesVar.c), pendingIntentB, new Bundle(), null);
                    }
                    if (atnVarB != null) {
                        this.m.add(atnVarB);
                    }
                }
            }
        } else {
            khn.e();
            this.m = new ArrayList();
            Iterator it = keuVar.c.iterator();
            while (it.hasNext()) {
                atn atnVarB2 = b((String) it.next());
                if (atnVarB2 != null) {
                    this.m.add(atnVarB2);
                }
            }
            this.n = (int[]) keuVar.a().clone();
        }
        Iterator it2 = this.m.iterator();
        while (it2.hasNext()) {
            atrVar.g((atn) it2.next());
        }
        brl brlVar = new brl();
        int[] iArr = this.n;
        if (iArr != null) {
            brlVar.a = iArr;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.e.a;
        if (mediaSessionCompat$Token != null) {
            brlVar.b = mediaSessionCompat$Token;
        }
        atrVar.r(brlVar);
        Notification notificationA = atrVar.a();
        this.q = notificationA;
        notificationManager.notify("castMediaNotification", 1, notificationA);
    }
}
