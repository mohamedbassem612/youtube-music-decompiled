package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgs {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback");
    public final hix A;
    public hgq C;
    public boolean D;
    public int E;
    private final aunn G;
    public final Context b;
    public final mbc c;
    public final awmd d;
    public final awmd e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final aunn j;
    public final aunn k;
    public final aunn l;
    public final aunn m;
    public final aunn n;
    public final aunn o;
    public final aunn p;
    public final aunn q;
    public final aunn r;
    public final aunn s;
    public final aunn t;
    public final aunn u;
    public final aunn v;
    public final aunn w;
    public final aunn x;
    public final aunn y;
    public final aunn z;
    public final Handler B = new Handler(Looper.getMainLooper());
    public hjy F = hjy.a;

    public hgs(Context context, mbc mbcVar, awmd awmdVar, awmd awmdVar2, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19, aunn aunnVar20, aunn aunnVar21, aunn aunnVar22, hix hixVar) {
        this.b = context;
        this.c = mbcVar;
        this.d = awmdVar;
        this.e = awmdVar2;
        this.f = aunnVar;
        this.g = aunnVar2;
        this.h = aunnVar3;
        this.i = aunnVar4;
        this.j = aunnVar5;
        this.k = aunnVar6;
        this.l = aunnVar7;
        this.m = aunnVar8;
        this.G = aunnVar9;
        this.n = aunnVar10;
        this.o = aunnVar11;
        this.p = aunnVar12;
        this.q = aunnVar13;
        this.s = aunnVar14;
        this.t = aunnVar15;
        this.u = aunnVar16;
        this.w = aunnVar17;
        this.v = aunnVar18;
        this.r = aunnVar19;
        this.y = aunnVar20;
        this.x = aunnVar21;
        this.z = aunnVar22;
        this.A = hixVar;
    }

    public static Bundle b(zne zneVar, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        boolean z = false;
        if (!zneVar.equals(zmw.a) && !zneVar.equals(zmu.a)) {
            z = true;
        }
        bundle.putBoolean("skip_entitlement_check", z);
        return bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x006b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[ORIG_RETURN, RETURN] */
    public static boolean f(String str) {
        switch (str) {
            case "onRewind()":
            case "thumbs_down_action":
            case "onSetRating()":
            case "onFastForward()":
            case "fast_forward_action":
            case "togglePause":
            case "onSeekTo()":
            case "onPause()":
            case "rewind_action":
            case "onPlay()":
            case "thumbs_up_action":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0058 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005a A[ORIG_RETURN, RETURN] */
    public static boolean g(String str) {
        switch (str) {
            case "start_radio_action":
            case "onSkipToNext()":
            case "skip_previous_action":
            case "skip_next_action":
            case "onPlayFromMediaId()":
            case "onSkipToPrevious()":
            case "onPlayFromUri()":
            case "onPlayFromSearch()":
            case "onSkipToQueueItem()":
                return true;
            default:
                return false;
        }
    }

    public final Bundle a(String str, hjy hjyVar) {
        Bundle bundle = new Bundle();
        bundle.putString("get_consent_status", str);
        if (!TextUtils.equals(str, "granted")) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.google.android.apps.youtube.music", "com.google.android.apps.youtube.music.activities.MusicActivity"));
            intent.putExtra("com.google.android.apps.youtube.music.mediabrowser.consent.CONSENT_DIALOG_INTENT_ACTION", true);
            zot zotVar = hjyVar.b;
            intent.putExtra("referrer", zotVar.b);
            Context context = this.b;
            intent.putExtra("referring_app_name", hgm.a(context.getPackageManager(), zotVar));
            intent.putExtra("media_client_name", hjyVar.d.b);
            PendingIntent pendingIntentB = qof.b(context, 0, intent, 201326592);
            if (pendingIntentB != null) {
                bundle.putParcelable("CONSENT_INTENT", pendingIntentB);
            }
        }
        return bundle;
    }

    public final void c() {
        boolean zD = ((acdq) this.G.io()).D();
        aunn aunnVar = this.f;
        if (zD) {
            ((hgy) aunnVar.io()).b();
        } else {
            ((hgy) aunnVar.io()).f();
        }
    }

    public final void d(String str, Object... objArr) {
        ((agrc) ((agrc) a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "logAtWarning", 430, "MusicMediaSessionCallback.java")).w("%s", String.format(str, objArr));
    }

    public final void e() {
        boolean zD = ((acdq) this.G.io()).D();
        aunn aunnVar = this.f;
        if (zD) {
            ((hgy) aunnVar.io()).e();
        } else {
            ((hgy) aunnVar.io()).g();
        }
    }
}
