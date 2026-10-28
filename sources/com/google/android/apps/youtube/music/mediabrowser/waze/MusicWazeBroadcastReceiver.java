package com.google.android.apps.youtube.music.mediabrowser.waze;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.youtube.music.R;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.agso;
import defpackage.aump;
import defpackage.aunb;
import defpackage.awku;
import defpackage.axle;
import defpackage.axoz;
import defpackage.hka;
import defpackage.hkb;
import defpackage.jnm;
import defpackage.qof;
import defpackage.tbt;
import defpackage.tcc;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import defpackage.zwt;
import internal.org.jni_zero.CommonApis;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MusicWazeBroadcastReceiver extends hka implements aunb {
    private static final agrf f = agrf.h("com/google/android/apps/youtube/music/mediabrowser/waze/MusicWazeBroadcastReceiver");
    public tbt c;
    public awku d;
    public jnm e;
    private aump g;
    private boolean h;

    @Override // defpackage.aunb
    public final void a() {
        this.d.kk(Boolean.TRUE);
    }

    @Override // defpackage.aunb
    public final void b() {
        this.d.kk(Boolean.FALSE);
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        aump aumpVar = this.g;
        if (aumpVar == null || !aumpVar.g) {
            return;
        }
        aumpVar.c();
    }

    @Override // defpackage.hka, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((hkb) CommonApis.j(context)).dW(this);
                    this.a = true;
                }
            }
        }
        if (!this.h) {
            this.c.f(this);
            this.h = true;
        }
        if (!this.e.C()) {
            String string = context.getString(R.string.free_user_waze);
            Intent intent2 = new Intent();
            intent2.setPackage("com.waze");
            intent2.setAction("com.waze.sdk.audio.ACTION_OFFLINE_MESSAGE");
            intent2.putExtra("errorMessage", string);
            intent2.putExtra("token", intent.getStringExtra("token"));
            context.sendBroadcast(intent2);
            return;
        }
        if ("com.waze.sdk.audio.ACTION_INIT".equals(intent.getAction())) {
            try {
                aump aumpVar = this.g;
                if (aumpVar == null || !aumpVar.g) {
                    Intent intent3 = new Intent();
                    intent3.setClassName(context, "com.google.android.apps.youtube.music.activities.InternalMusicActivity");
                    PendingIntent pendingIntentB = qof.b(context, 0, intent3, 1275068416);
                    if (pendingIntentB != null) {
                        axle axleVar = new axle();
                        axleVar.a = pendingIntentB;
                        axleVar.b = Integer.valueOf(context.getColor(R.color.ytm_color_light_red));
                        axoz axozVar = new axoz(axleVar);
                        WeakReference weakReference = aump.a;
                        try {
                            i = context.getPackageManager().getPackageInfo("com.waze", 0).versionCode;
                        } catch (PackageManager.NameNotFoundException unused) {
                            i = 0;
                        }
                        if (i == 0) {
                            throw new IllegalStateException("Waze not installed.");
                        }
                        if (i < 1021549) {
                            throw new IllegalStateException(String.format("Waze version %s does not support Audio SDK version %s.", CommonApis.m(context), "v1.0.0.8"));
                        }
                        WeakReference weakReference2 = aump.a;
                        if (weakReference2 != null && weakReference2.get() != null && ((aump) aump.a.get()).g) {
                            ((aump) aump.a.get()).c();
                        }
                        aump.a = new WeakReference(new aump(context, axozVar, this));
                        this.g = (aump) aump.a.get();
                    }
                }
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) f.b().i(agso.a, "MusicWazeBroadcastRecv")).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/waze/MusicWazeBroadcastReceiver", "onReceive", 'I', "MusicWazeBroadcastReceiver.java")).t("Waze exception in connectToWazeIfNeeded: ");
                zvp.b(zvn.b, zvm.n, "Waze exception in connectToWazeIfNeeded: ", e);
            }
        }
    }
}
