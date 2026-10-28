package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.KeyEvent;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hgq extends ez {
    public final /* synthetic */ hgs e;

    public hgq(hgs hgsVar) {
        this.e = hgsVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0092  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf  */
    private final hjy x(Bundle bundle, boolean z) {
        String str;
        zot zotVarAO;
        zne zneVarB;
        Pair pair;
        amzo amzoVar;
        String string;
        hgs hgsVar = this.e;
        zot zotVarAO2 = zik.aO(((fb) ((fg) hgsVar.d.io()).c).c());
        int i = Build.VERSION.SDK_INT;
        aunn aunnVar = hgsVar.j;
        if (i < 28) {
            str = null;
            if (bundle != null && bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.caller_package_name") && (string = bundle.getString("com.google.android.apps.youtube.music.mediabrowser.caller_package_name")) != null && !TextUtils.isEmpty(string)) {
                str = string;
            }
            zotVarAO = zik.aO(str);
            if (!zotVarAO.b()) {
                pair = new Pair(zotVarAO, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE);
            } else if (!zotVarAO2.b() || zotVarAO2.a("android.media.session.MediaController")) {
                if (z) {
                    zneVarB = ((hfy) aunnVar.io()).a();
                } else {
                    zneVarB = ((hfy) aunnVar.io()).b();
                }
                if (zneVarB.h()) {
                    ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "getActiveMediaPackageAndSource", 501, "MusicMediaSessionCallback.java")).t("getActiveMediaPackageAndSource() failed.");
                    pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                } else {
                    if (z) {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT;
                    } else {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_CLIENT;
                    }
                    pair = new Pair(zneVarB.b(), amzoVar);
                }
            } else {
                pair = new Pair(zotVarAO2, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_GET_CALLING_PACKAGE);
            }
        } else if (zotVarAO2.b()) {
            ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "getActiveMediaPackageAndSource", 468, "MusicMediaSessionCallback.java")).t("mediaSession.getCallingPackage() failed to retrieve package.");
            str = null;
            if (bundle != null) {
                str = string;
            }
            zotVarAO = zik.aO(str);
            if (!zotVarAO.b()) {
                pair = new Pair(zotVarAO, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE);
            } else if (zotVarAO2.b()) {
                if (z) {
                    zneVarB = ((hfy) aunnVar.io()).a();
                } else {
                    zneVarB = ((hfy) aunnVar.io()).b();
                }
                if (zneVarB.h()) {
                    if (z) {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT;
                    } else {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_CLIENT;
                    }
                    pair = new Pair(zneVarB.b(), amzoVar);
                } else {
                    ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "getActiveMediaPackageAndSource", 501, "MusicMediaSessionCallback.java")).t("getActiveMediaPackageAndSource() failed.");
                    pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                }
            } else {
                if (z) {
                    zneVarB = ((hfy) aunnVar.io()).a();
                } else {
                    zneVarB = ((hfy) aunnVar.io()).b();
                }
                if (zneVarB.h()) {
                    if (z) {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT;
                    } else {
                        amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_CLIENT;
                    }
                    pair = new Pair(zneVarB.b(), amzoVar);
                } else {
                    ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "getActiveMediaPackageAndSource", 501, "MusicMediaSessionCallback.java")).t("getActiveMediaPackageAndSource() failed.");
                    pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                }
            }
        } else {
            pair = new Pair(zotVarAO2, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_GET_CALLING_PACKAGE);
        }
        zot zotVar = (zot) pair.first;
        return new hjy(zotVar, (amzo) pair.second, ((hef) hgsVar.n.io()).b(zotVar, bundle), ((hfy) aunnVar.io()).d(hgsVar.b, zotVar.b));
    }

    private final void y() {
        hgs hgsVar = this.e;
        if (hgsVar.E <= 0 || !((vxz) hgsVar.x.io()).l(55, 45857879L, false)) {
            return;
        }
        agrx agrxVar = agso.a;
        hgsVar.E = 0;
        hgsVar.B.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ez
    public final void a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        agrf agrfVar = hgs.a;
        agru agruVarC = agrfVar.c();
        agrx agrxVar = agso.a;
        ((agrc) ((agrc) agruVarC.i(agrxVar, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback$Callback", "onCommand", 952, "MusicMediaSessionCallback.java")).B("MSC: onCommand(). command: '%s' extras: %s", str, bundle);
        if (resultReceiver == null || str == null) {
            return;
        }
        hjy hjyVarX = x(bundle, false);
        hgs hgsVar = this.e;
        hgr hgrVar = new hgr(hgsVar, str, resultReceiver, hjyVarX, hgsVar.v);
        zot zotVar = hgrVar.d.b;
        String str2 = hgrVar.a;
        hgsVar.d("MSC: onCommand(). appPkg: '%s' command: '%s'", zotVar, str2);
        if (TextUtils.equals(str, "get_authentication_status")) {
            ((agrc) ((agrc) agrfVar.c().i(agrxVar, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "onCommandGetAuthenticationStatus", 298, "MusicMediaSessionCallback.java")).t("MSC: onCommandGetAuthenticationStatus().");
            if (TextUtils.equals(str2, "get_authentication_status")) {
                String str3 = true != ((zwb) hgsVar.t.io()).u() ? "signed_out" : "signed_in";
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("get_authentication_status", str3);
                hgrVar.b(bundle2);
                return;
            }
            return;
        }
        byte[] bArr = null;
        if (!((vxz) hgsVar.x.io()).l(5, 45671827L, false) || !TextUtils.equals(str, "get_consent_status")) {
            synchronized (hgrVar.c) {
                hgrVar.b.send(1, null);
                hgrVar.a(tau.MEDIA_SESSION_CUSTOM_COMMAND_COMPLETED);
            }
            return;
        }
        hgs hgsVar2 = this.e;
        ((agrc) ((agrc) hgs.a.c().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback", "onCommandGetConsentStatus", 314, "MusicMediaSessionCallback.java")).t("MSC: onCommandGetConsentStatus().");
        hfx hfxVar = (hfx) hgsVar2.w.io();
        hjy hjyVar = hgrVar.d;
        zot zotVar2 = hjyVar.b;
        if (!hfxVar.k(zotVar2)) {
            hgrVar.b(hgsVar2.a("not_needed", hjyVar));
            return;
        }
        afxd afxdVarF = afxd.f(((syn) hgsVar2.u.io()).n(((zwb) hgsVar2.t.io()).e()));
        gmv gmvVar = new gmv(hgsVar2, 15);
        aunn aunnVar = hgsVar2.y;
        taf.i(afxd.f(afxdVarF.g(gmvVar, (Executor) aunnVar.io())).h(new hba(zotVar2, 4), (Executor) aunnVar.io()), (Executor) aunnVar.io(), new gou(hgsVar2, hgrVar, 6, bArr), new gov(hgsVar2, hgrVar, 8, bArr), null);
    }

    @Override // defpackage.ez
    public final void b(String str, Bundle bundle) {
        acel acelVar;
        anaf anafVar;
        hjy hjyVarX = x(bundle, false);
        agrx agrxVar = agso.a;
        hjf hjfVar = (hjf) this.e.h.io();
        if (hjfVar.f.b || (acelVar = (acel) hjfVar.h.get(str)) == null || !acelVar.h()) {
            anafVar = hgg.e;
        } else {
            hjfVar.a.c();
            acelVar.i();
            if (((vxz) hjfVar.g.io()).l(11, 45691537L, false)) {
                hjfVar.b.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(xhb.b(acelVar.d())), null);
            }
            anafVar = hgg.a;
        }
        w(hjyVarX, str, anafVar, null);
    }

    @Override // defpackage.ez
    public final void c() {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        w(hjyVarX, "onFastForward()", ((hgy) this.e.f.io()).b(), null);
    }

    @Override // defpackage.ez
    public final void d() {
        y();
        hjy hjyVarX = x(null, false);
        zot zotVar = hjyVarX.b;
        hgs hgsVar = this.e;
        hgsVar.d("MSC: onPause(). appPkg: '%s'", zotVar);
        if (zotVar.equals(zny.a)) {
            ((abvk) hgsVar.e.io()).O();
        }
        w(hjyVarX, "onPause()", ((hgy) hgsVar.f.io()).c(), null);
    }

    @Override // defpackage.ez
    public final void e() {
        hjy hjyVarX = x(null, false);
        zot zotVar = hjyVarX.b;
        hgs hgsVar = this.e;
        hgsVar.d("MSC: onPlay(). appPkg: '%s'", zotVar);
        ((awku) ((hfn) hgsVar.s.io()).a).kk(zotVar.b);
        w(hjyVarX, "onPlay()", ((hgy) hgsVar.f.io()).d(), null);
    }

    @Override // defpackage.ez
    public final void f(String str, Bundle bundle) {
        ajwo ajwoVarB;
        anfb anfbVarC;
        amzw amzwVarA;
        hjy hjyVarX = x(bundle, true);
        zot zotVar = hjyVarX.b;
        String.format("MSC: onPlayFromMediaId(). appPkg: '%s' mediaId: '%s'", zotVar, str);
        agrx agrxVar = agso.a;
        hgs hgsVar = this.e;
        znf znfVar = znf.a;
        aunn aunnVar = hgsVar.z;
        znf znfVarAi = yno.ai(str);
        ajwo ajwoVar = null;
        if (((vxz) aunnVar.io()).l(162, 45640347L, false) && (anfbVarC = znfVarAi.c()) != null) {
            if (anfbVarC.c != 2 || (amzwVarA = amzw.a(((Integer) anfbVarC.d).intValue())) == null) {
                amzwVarA = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_UNSPECIFIED;
            }
            if (amzwVarA.equals(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON_OFFLINE) || amzwVarA.equals(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON)) {
                hhr hhrVar = (hhr) hgsVar.i.io();
                zne zneVar = hjyVarX.d;
                hiv hivVar = (hiv) hhrVar.c.io();
                hev hevVarB = hivVar.b(zneVar, ((hfy) hivVar.i.io()).d((Context) hivVar.e.io(), zotVar.b), new Bundle());
                hevVarB.A = 2;
                taf.i(((wqm) hivVar.g.io()).m(hevVarB), (Executor) hivVar.v.io(), new gtq(hivVar, 12), new gpq(5), null);
                return;
            }
        }
        zne zneVar2 = hjyVarX.d;
        Bundle bundleB = hgs.b(zneVar2, bundle);
        hgy hgyVar = (hgy) hgsVar.f.io();
        awlx awlxVar = new awlx();
        hhr hhrVar2 = (hhr) hgyVar.c.io();
        if (hhrVar2.n.l(6, 45680102L, false)) {
            hik hikVarA = hhrVar2.a(zneVar2);
            ReentrantLock reentrantLock = hikVarA.r;
            reentrantLock.lock();
            try {
                him himVarA = hikVarA.a(znfVarAi);
                if (((vxz) hikVarA.o.io()).l(21, 45791927L, false)) {
                    ajwoVarB = ((hht) hikVarA.i.io()).b(hjyVarX, himVarA);
                } else {
                    ajwoVarB = himVarA.c.a();
                    if (ajwoVarB == null) {
                        ReentrantLock reentrantLock2 = himVarA.d;
                        reentrantLock2.lock();
                        try {
                            amzx amzxVar = himVarA.e;
                            if (amzxVar != null) {
                                anfb anfbVar = amzxVar.f;
                                if (anfbVar == null) {
                                    anfbVar = anfb.a;
                                }
                                if (anfbVar != null && (ajwoVar = anfbVar.e) == null) {
                                    ajwoVar = ajwo.a;
                                }
                            }
                            reentrantLock2.unlock();
                            ajwoVarB = ajwoVar;
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } else {
            ajwoVarB = ((hir) hhrVar2.b.io()).a(hjyVarX.d).b(hjyVarX, znfVarAi);
        }
        hgyVar.n(awlxVar, ajwoVarB, bundleB);
        awlxVar.v((avmb) hgsVar.r.io()).D(new gto((Object) this, (Object) hjyVarX, (Object) znfVarAi, 2, (byte[]) null), new glg(18));
    }

    @Override // defpackage.ez
    public final void g(String str, Bundle bundle) {
        awlx awlxVar;
        hjy hjyVarX = x(bundle, false);
        String.format("MSC: onPlayFromSearch(). appPkg: '%s' query: '%s'", hjyVarX.b, str);
        agrx agrxVar = agso.a;
        hgs hgsVar = this.e;
        zne zneVar = hjyVarX.d;
        aunn aunnVar = hgsVar.f;
        Bundle bundleB = hgs.b(zneVar, bundle);
        hgy hgyVar = (hgy) aunnVar.io();
        awlx awlxVar2 = new awlx();
        StringBuilder sb = new StringBuilder();
        String string = bundleB.getString("android.intent.extra.artist");
        if (!TextUtils.isEmpty(string)) {
            sb.append(string);
            sb.append(' ');
        }
        String[] strArr = {"android.intent.extra.title", "android.intent.extra.album", "android.intent.extra.genre", "android.intent.extra.playlist", "android.intent.extra.radio_channel"};
        for (int i = 0; i < 5; i++) {
            String string2 = bundleB.getString(strArr[i]);
            if (!TextUtils.isEmpty(string2)) {
                sb.append(string2);
                break;
            }
        }
        String string3 = !TextUtils.isEmpty(sb) ? sb.toString() : "";
        if (!TextUtils.isEmpty(string3)) {
            str = string3;
        } else if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (hgyVar.t.i() && !txz.g(hgyVar.b)) {
            if (TextUtils.isEmpty(str)) {
                aihh aihhVar = (aihh) ajwo.a.createBuilder();
                aihf aihfVarCreateBuilder = arij.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                arij arijVar = (arij) aihfVarCreateBuilder.instance;
                arijVar.b |= 2;
                arijVar.e = "RDMM";
                aihhVar.e(arik.a, (arij) aihfVarCreateBuilder.build());
                hgyVar.n(awlxVar2, (ajwo) aihhVar.build(), Bundle.EMPTY);
            } else {
                awlxVar = new awlx();
                String str2 = hjyVarX.e;
                wqm wqmVar = hgyVar.u;
                hew hewVarK = wqmVar.k();
                hewVarK.d(zneVar, str2);
                hewVarK.e(str);
                hewVarK.a = 3;
                taf.i(wqmVar.n(hewVarK), MoreExecutors.directExecutor(), new gtq(awlxVar, 8), new gsu(hgyVar, awlxVar, bundleB, 11, (char[]) null), null);
            }
            awlxVar2.v((avmb) hgsVar.r.io()).D(new gkr(this, hjyVarX, 6), new glg(18));
        }
        awlxVar = new awlx();
        taf.i(hgyVar.v.c(str), MoreExecutors.directExecutor(), new gtq(awlxVar, 7), new gsu(hgyVar, awlxVar, bundleB, 10, (char[]) null), new gqd(5));
        awlxVar2 = awlxVar;
        awlxVar2.v((avmb) hgsVar.r.io()).D(new gkr(this, hjyVarX, 6), new glg(18));
    }

    @Override // defpackage.ez
    public final void h(Uri uri, Bundle bundle) {
        awlx awlxVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        hjy hjyVarX = x(bundle, false);
        zot zotVar = hjyVarX.b;
        String.format("MSC: onPlayFromUri(). appPkg: '%s' uri: '%s'", zotVar, uri);
        hgs hgsVar = this.e;
        agrx agrxVar = agso.a;
        String string = bundle.getString("android.intent.extra.youtube_click_tracking_id");
        byte[] bArrDecode = string != null ? Base64.decode(string, 8) : null;
        if (bArrDecode != null) {
            aunn aunnVar = hgsVar.l;
            ((xgn) aunnVar.io()).b(xhb.a(22678), null, null);
            xgj xgjVar = new xgj(bArrDecode);
            ((xgn) aunnVar.io()).d(xgjVar);
            ((xgn) aunnVar.io()).o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, xgjVar, null);
            ((abea) hgsVar.m.io()).n(new abec(((xgn) aunnVar.io()).i(), null));
        }
        bundle.putString("EXTRA_REFERRER_APP", zotVar.b);
        bundle.putBoolean("skip_entitlement_check", false);
        hgy hgyVar = (hgy) hgsVar.f.io();
        hgw hgwVar = new hgw(hgyVar, bundle, bArrDecode);
        String str = (String) bundle.get("EXTRA_REFERRER_APP");
        if (!txz.g(hgyVar.b) || bundle.getBoolean("wear_headphone_check")) {
            ((agrc) ((agrc) hgy.a.c().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "startPlaybackFromUri", 628, "MusicMediaSessionPlayerController.java")).w("startPlaybackFromUri referrerApp: %s", str);
            ((abi) hgyVar.j.io()).b(uri, str, null, hgwVar);
            awlxVar = hgwVar.a;
        } else {
            ((agrc) ((agrc) hgy.a.c().i(agso.a, "MediaSessionPlayerCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionPlayerController", "startPlaybackFromUri", 622, "MusicMediaSessionPlayerController.java")).w("startPlaybackFromUri routing to intent referrerApp: %s", str);
            awlxVar = new awlx();
            hgyVar.o.post(new gwb(hgyVar, awlxVar, uri, 4));
        }
        awlxVar.v((avmb) hgsVar.r.io()).D(new gkr(this, hjyVarX, 5), new glg(18));
    }

    @Override // defpackage.ez
    public final void i(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        x(bundle, false);
        agrx agrxVar = agso.a;
        bundle.putBoolean("EXTRA_START_PAUSED", true);
        f(str, bundle);
    }

    @Override // defpackage.ez
    public final void j(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        x(bundle, false);
        agrx agrxVar = agso.a;
        bundle.putBoolean("EXTRA_START_PAUSED", true);
        g(str, bundle);
    }

    @Override // defpackage.ez
    public final void k(Uri uri, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        x(bundle, false);
        agrx agrxVar = agso.a;
        bundle.putBoolean("EXTRA_START_PAUSED", true);
        h(uri, bundle);
    }

    @Override // defpackage.ez
    public final void l() {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        w(hjyVarX, "onRewind()", ((hgy) this.e.f.io()).e(), null);
    }

    @Override // defpackage.ez
    public final void m(long j) {
        anaf anafVar;
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        hgy hgyVar = (hgy) this.e.f.io();
        if (!hgyVar.q() && hgyVar.n.A()) {
            awmd awmdVar = hgyVar.e;
            long jA = acfz.a(((abvk) awmdVar.io()).h());
            if (!((abvk) awmdVar.io()).X() && jA > 0) {
                j = Math.min(j, jA - 1);
            }
            ((acdo) hgyVar.d.io()).i(j, appa.SEEK_SOURCE_ANDROID_MEDIA_SESSION);
            anafVar = hgg.a;
        } else {
            anafVar = hgg.e;
        }
        w(hjyVarX, "onSeekTo()", anafVar, null);
    }

    @Override // defpackage.ez
    public final void n(RatingCompat ratingCompat) {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        amlg amlgVar = amlg.INDIFFERENT;
        if (ratingCompat.c()) {
            amlgVar = ratingCompat.d() ? amlg.LIKE : amlg.DISLIKE;
        }
        hgs hgsVar = this.e;
        w(hjyVarX, "onSetRating()", ((hhd) hgsVar.g.io()).a(amlgVar, ((abvk) ((hgy) hgsVar.f.io()).e.io()).n()), null);
    }

    @Override // defpackage.ez
    public final void o(int i) {
        ibv ibvVar;
        anaf anafVar;
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        hgc hgcVar = (hgc) this.e.q.io();
        if (hgcVar.d.b) {
            anafVar = hgg.e;
        } else {
            if (i == -1) {
                ibvVar = ibv.LOOP_DISABLED;
            } else if (i != 1) {
                ibvVar = (i == 2 || i == 3) ? ibv.LOOP_ALL : ibv.LOOP_OFF;
            } else {
                ibvVar = ibv.LOOP_ONE;
            }
            aunn aunnVar = hgcVar.b;
            aesp aespVar = (aesp) aunnVar.io();
            Object obj = ((heg) aespVar.i).a;
            ibv ibvVar2 = ibv.LOOP_DISABLED;
            if (((ibv) obj).equals(ibvVar2) || ibvVar.equals(ibvVar2) || (((icj) aespVar.f).G() && ibvVar.equals(ibv.LOOP_ALL))) {
                anafVar = hgg.e;
            } else {
                aesp aespVar2 = (aesp) aunnVar.io();
                if (!((ibv) ((heg) aespVar2.i).a).equals(ibvVar2)) {
                    aespVar2.t(ibvVar, true);
                }
                anafVar = hgg.a;
            }
        }
        w(hjyVarX, "onSetRepeatMode()", anafVar, null);
    }

    @Override // defpackage.ez
    public final void p(int i) {
        icz iczVar;
        anaf anafVar;
        hjy hjyVarX = x(null, false);
        zot zotVar = hjyVarX.b;
        agrx agrxVar = agso.a;
        if (zotVar.equals(znn.a)) {
            return;
        }
        hgh hghVar = (hgh) this.e.p.io();
        if (hghVar.d.b) {
            anafVar = hgg.e;
        } else {
            aunn aunnVar = hghVar.b;
            icz iczVarB = ((jan) aunnVar.io()).b();
            if (i != -1) {
                iczVar = (i == 1 || i == 2) ? icz.b : icz.a;
            } else {
                iczVar = icz.c;
            }
            if (iczVarB == iczVar) {
                icz iczVar2 = icz.b;
                if (iczVarB == iczVar2) {
                    jan janVar = (jan) aunnVar.io();
                    if (janVar.b() == iczVar2) {
                        ((abjp) janVar.b).y();
                    }
                }
                anafVar = hgg.a;
            } else {
                icz iczVar3 = icz.c;
                if (iczVarB == iczVar3 || iczVar == iczVar3) {
                    anafVar = hgg.e;
                } else {
                    ((jan) aunnVar.io()).f();
                    anafVar = hgg.a;
                }
            }
        }
        w(hjyVarX, "onSetShuffleMode()", anafVar, null);
    }

    @Override // defpackage.ez
    public final void q() {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        hgs hgsVar = this.e;
        ((aceu) hgsVar.o.io()).e(true);
        w(hjyVarX, "onSkipToNext()", ((hgy) hgsVar.f.io()).f(), null);
    }

    @Override // defpackage.ez
    public final void r() {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        hgs hgsVar = this.e;
        ((aceu) hgsVar.o.io()).e(true);
        w(hjyVarX, "onSkipToPrevious()", ((hgy) hgsVar.f.io()).g(), null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c1  */
    @Override // defpackage.ez
    public final void s(long j) {
        anaf anafVarA;
        int i = 0;
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        hgy hgyVar = (hgy) this.e.f.io();
        if (hgyVar.h.a() && ((ycp) hgyVar.i.io()).e == null) {
            awmd awmdVar = hgyVar.g;
            if (((abjp) awmdVar.io()).b.isEmpty() || hgyVar.q()) {
                anafVarA = hgg.e;
            } else {
                anafVarA = hgyVar.a();
                if (!anafVarA.c) {
                    List listSubList = ((abjp) awmdVar.io()).b.subList(0, ((abjp) awmdVar.io()).b.size());
                    int size = ((abjp) awmdVar.io()).d(0).size();
                    int i2 = 0;
                    while (i2 < listSubList.size()) {
                        if (((hyz) listSubList.get(i2)).m() == j) {
                            if (i2 >= size) {
                                i2 -= size;
                                i = 1;
                            }
                            if (((abjp) awmdVar.io()).B(i, i2)) {
                                anafVarA = hgg.f;
                            } else {
                                ((abvc) hgyVar.f.io()).i(new abtu(abtt.JUMP, ((hyz) ((abjp) awmdVar.io()).o(i).get(i2)).n(), null, null));
                                anafVarA = hgg.a;
                            }
                        } else {
                            i2++;
                        }
                    }
                    anafVarA = hgg.e;
                }
            }
        } else {
            anafVarA = hgg.e;
        }
        w(hjyVarX, "onSkipToQueueItem()", anafVarA, null);
    }

    @Override // defpackage.ez
    public final void t() {
        y();
        hjy hjyVarX = x(null, false);
        zot zotVar = hjyVarX.b;
        hgs hgsVar = this.e;
        hgsVar.d("MSC: onStop(). appPkg: '%s'", zotVar);
        if (zotVar.equals(zny.a)) {
            ((abvk) hgsVar.e.io()).O();
        }
        w(hjyVarX, "onStop()", ((hgy) hgsVar.f.io()).i(), null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT] */
    @Override // defpackage.ez
    public final boolean u(Intent intent) {
        hjy hjyVarX = x(null, false);
        agrx agrxVar = agso.a;
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return false;
        }
        hgs hgsVar = this.e;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (keyCode != 79) {
            if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        if (keyEvent.getRepeatCount() > 0) {
                            hgsVar.E = 0;
                            hgsVar.B.removeCallbacksAndMessages(null);
                            return false;
                        }
                        if (action == 0) {
                            if (hgsVar.E == 0) {
                                hgsVar.B.postDelayed(new fuc(this, hjyVarX, 10), 400L);
                            }
                        } else if (action == 0) {
                        }
                        hgsVar.E++;
                        break;
                    case 86:
                        break;
                    case 87:
                        if (action == 1) {
                            if (!hgsVar.D) {
                                hgsVar.c();
                            }
                            hgsVar.D = false;
                        } else if (action == 0 && keyEvent.getRepeatCount() != 0) {
                            ((hgy) hgsVar.f.io()).b();
                            hgsVar.D = true;
                        }
                        break;
                    case 88:
                        if (action == 1) {
                            if (!hgsVar.D) {
                                hgsVar.e();
                            }
                            hgsVar.D = false;
                        } else if (action == 0 && keyEvent.getRepeatCount() != 0) {
                            ((hgy) hgsVar.f.io()).e();
                            hgsVar.D = true;
                        }
                        break;
                    default:
                        return super.u(intent);
                }
            }
            y();
            return super.u(intent);
        }
        if (keyEvent.getRepeatCount() > 0) {
            hgsVar.E = 0;
            hgsVar.B.removeCallbacksAndMessages(null);
            return false;
        }
        if (action == 0) {
            if (hgsVar.E == 0) {
                hgsVar.B.postDelayed(new fuc(this, hjyVarX, 10), 400L);
            }
        } else if (action == 0) {
        }
        hgsVar.E++;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:131:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x0156  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void w(hjy hjyVar, String str, anaf anafVar, znf znfVar) {
        int i;
        switch (str) {
            case "onRewind()":
                i = 9;
            case "thumbs_down_action":
                i = 15;
            case "start_radio_action":
                i = 21;
            case "onSetRepeatMode()":
                i = 25;
            case "onSetRating()":
                i = 13;
            case "onFastForward()":
                i = 11;
            case "fast_forward_action":
                i = 12;
            case "onSkipToNext()":
                i = 18;
            case "loop_mode_action":
                i = 26;
            case "togglePause":
                i = 7;
            case "onSeekTo()":
                i = 8;
            case "skip_previous_action":
                i = 17;
            case "skip_next_action":
                i = 19;
            case "onSetShuffleMode()":
                i = 23;
            case "waze.thumbDown":
                i = 29;
            case "onPlayFromMediaId()":
                i = 2;
                break;
            case "onSkipToPrevious()":
                i = 16;
            case "onPause()":
                i = 6;
            case "onPlayFromUri()":
                i = 4;
            case "rewind_action":
                i = 10;
            case "waze.thumbUp":
                i = 28;
            case "onPlayFromSearch()":
                i = 3;
                break;
            case "onPlay()":
                i = 5;
            case "playback_rate_action":
                i = 22;
            case "onStop()":
                i = 27;
            case "shuffle_action":
                i = 24;
            case "onSkipToQueueItem()":
                i = 20;
            case "thumbs_up_action":
                i = 14;
            default:
                i = 1;
        }
        hgs hgsVar = this.e;
        hjz hjzVar = new hjz(i, anafVar, hjyVar, (anafVar.c || !TextUtils.equals(str, "onPlayFromMediaId()") || znfVar == null) ? null : new hgo(hgsVar, hjyVar, znfVar, 0));
        if (!anafVar.c && (hgs.f(str) || hgs.g(str))) {
            hgsVar.F = hjyVar;
        }
        if (!hgs.f(str)) {
            hjy hjyVar2 = hgsVar.F;
            if (hjyVar2.c != amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE && hjyVar2.b.equals(hjyVar.b)) {
                switch (str.hashCode()) {
                    case -1427146494:
                        if (str.equals("onSetRepeatMode()")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                    case -947911881:
                        if (str.equals("loop_mode_action")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                    case -137261830:
                        if (str.equals("onSetShuffleMode()")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                    case 1439880785:
                        if (str.equals("playback_rate_action")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                    case 1506339650:
                        if (str.equals("onStop()")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                    case 1573132860:
                        if (str.equals("shuffle_action")) {
                            hgsVar.A.b(hjzVar, null);
                        }
                        break;
                }
            }
        } else {
            hgsVar.A.b(hjzVar, null);
        }
        if (hgs.g(str)) {
            hgsVar.A.a(hjzVar);
        }
        if (str.hashCode() == 1506339650 && str.equals("onStop()")) {
            hgsVar.F = hjy.a;
        }
        String str2 = String.format("MSC: appPkg: '%s' called '%s' with result '%s' and error code '%s'", hjyVar.b, str, true != anafVar.c ? "SUCCESS" : "ERROR", Integer.valueOf(anafVar.d));
        anaf anafVar2 = hgg.a;
        if (!anafVar.c && anafVar.d == 0) {
            agrx agrxVar = agso.a;
            if (str.equals("onSkipToNext()") || str.equals("onSkipToPrevious()")) {
                fg fgVar = (fg) hgsVar.d.io();
                PlaybackStateCompat playbackStateCompatO = ((fg) fgVar.a).o();
                fi fiVar = new fi(playbackStateCompatO);
                fiVar.e(playbackStateCompatO.a, 0L, playbackStateCompatO.d);
                fgVar.k(fiVar.a());
                return;
            }
            return;
        }
        ((agrc) ((agrc) hgs.a.b().i(agso.a, "MediaSessionCallback")).k("com/google/android/apps/youtube/music/mediabrowser/MusicMediaSessionCallback$Callback", "handleResult", 1211, "MusicMediaSessionCallback.java")).w("%s", str2);
        fg fgVar2 = (fg) hgsVar.d.io();
        PlaybackStateCompat playbackStateCompatO2 = ((fg) fgVar2.a).o();
        if (playbackStateCompatO2.a == 7 && anafVar.c) {
            fi fiVar2 = new fi();
            fiVar2.e(0, 0L, 1.0f);
            fiVar2.a = playbackStateCompatO2.e;
            fgVar2.k(fiVar2.a());
        }
        fi fiVar3 = new fi();
        int i2 = anafVar.d;
        fiVar3.c(i2, hgg.a(hgsVar.b, i2));
        fiVar3.a = playbackStateCompatO2.e;
        if (anafVar.c) {
            fiVar3.e(7, 0L, 1.0f);
        }
        fgVar2.k(fiVar3.a());
    }
}
