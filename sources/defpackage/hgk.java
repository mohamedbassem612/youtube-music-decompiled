package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hgk implements gzh {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserController");
    public final Context b;
    public final aunn c;
    public final aunn d;
    public final aunn e;
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
    public final avmm q = new avmm();
    public xir r = null;
    private final mbc s;
    private final aunn t;
    private final aunn u;
    private final aunn v;
    private final aunn w;
    private final aunn x;
    private final Executor y;

    public hgk(Context context, mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19, Executor executor) {
        this.b = context;
        this.s = mbcVar;
        this.c = aunnVar;
        this.t = aunnVar2;
        this.d = aunnVar3;
        this.e = aunnVar4;
        this.f = aunnVar5;
        this.g = aunnVar6;
        this.h = aunnVar7;
        this.u = aunnVar8;
        this.i = aunnVar9;
        this.v = aunnVar10;
        this.j = aunnVar11;
        this.w = aunnVar12;
        this.k = aunnVar13;
        this.l = aunnVar14;
        this.m = aunnVar15;
        this.n = aunnVar16;
        this.x = aunnVar17;
        this.o = aunnVar18;
        this.y = executor;
        this.p = aunnVar19;
    }

    private final ListenableFuture i(zot zotVar) {
        afxd afxdVarF = afxd.f(((syn) this.u.io()).n(((zwb) this.h.io()).e()));
        gmv gmvVar = new gmv(this, 14);
        Executor executor = this.y;
        return afxd.f(afxdVarF.g(gmvVar, executor)).h(new hba(zotVar, 3), executor);
    }

    private final void j(String str, Object... objArr) {
        String.format(str, objArr);
    }

    private final boolean k(zot zotVar) {
        return ((vxz) this.x.io()).l(5, 45671827L, false) && ((hfx) this.f.io()).k(zotVar);
    }

    public final void a(String str, Object... objArr) {
        agrx agrxVar = agso.a;
        String.format(str, objArr);
        j(str, objArr);
    }

    public final void b(String str, Object... objArr) {
        ((agrc) ((agrc) a.c().i(agso.a, "MusicBrowserCtlr")).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserController", "logAtWarning", 945, "MusicBrowserController.java")).w("%s", String.format(str, objArr));
        j(str, objArr);
    }

    public final void c(hjn hjnVar) {
        int i;
        agke agkeVarQ;
        wgg wggVarK;
        xir xirVar;
        zne zneVar = hjnVar.i;
        byte[] bArr = null;
        if (zneVar.e() && (xirVar = this.r) != null) {
            xirVar.f(tau.MEDIA_BROWSER_LOAD_CHILDREN_STARTED);
            this.r = null;
        }
        String str = hjnVar.j.l;
        if (TextUtils.equals(str, "__MY_RECENTS_ROOT_ID__")) {
            a("MBS: onLoadChildren() called for recent playback (presumably from system.ui)", new Object[0]);
            acdq acdqVar = (acdq) this.n.io();
            if (ibg.c(acdqVar)) {
                agrx agrxVar = agso.a;
                agkeVarQ = agpi.a;
            } else {
                agrx agrxVar2 = agso.a;
                Bundle bundle = new Bundle();
                bundle.putLong("android.media.metadata.DURATION", acdqVar.n());
                agkeVarQ = agke.q(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat("PLACEHOLDER_RECENTLY_PLAYED_MEDIA_ID", acdqVar.u(), acdqVar.t(), acdqVar.s(), null, (!acdqVar.L().m() || (wggVarK = acdqVar.L().k()) == null) ? null : wggVarK.a(), bundle, null), 2));
            }
            hjnVar.c(agkeVarQ, null);
            return;
        }
        if (!((zwb) this.h.io()).u()) {
            if (Boolean.TRUE.equals(((awku) ((grj) this.l.io()).a).aD())) {
                return;
            }
            hjnVar.b(tau.MEDIA_BROWSER_LOAD_CHILDREN_USER_SIGNED_OUT);
            hjnVar.c(null, null);
            PlaybackStateCompat playbackStateCompatO = ((fg) ((fg) this.t.io()).a).o();
            if (playbackStateCompatO == null || (i = playbackStateCompatO.a) == 0 || i == 7) {
                ((hef) this.e.io()).c(3);
                return;
            }
            return;
        }
        if (((Boolean) hjnVar.h.a()).booleanValue() && !((hfx) this.f.io()).h(zneVar)) {
            b("MBS: onLoadChildren() failed. Client not allowlisted for browsing: %s", zneVar);
            hjnVar.b(tau.MEDIA_BROWSER_LOAD_CHILDREN_NOT_BROWSABLE);
            hjnVar.c(null, null);
        } else {
            if (TextUtils.equals(str, "__EMPTY_ROOT_ID__")) {
                hjnVar.b(tau.MEDIA_BROWSER_LOAD_CHILDREN_EMPTY_ROOT);
                hjnVar.c(agpi.a, null);
                return;
            }
            zot zotVar = hjnVar.e;
            if (k(zotVar)) {
                taf.i(i(zotVar), this.y, new gou(zotVar, hjnVar, 4, bArr), new gsu(this, hjnVar, zotVar, 9), null);
            } else {
                ((hhr) this.c.io()).d(hjnVar);
            }
        }
    }

    public final void d(hjo hjoVar) {
        zne zneVar = hjoVar.d;
        j("MBS: onSearch() for client: %s", zneVar);
        byte[] bArr = null;
        if (hgm.c(hjoVar.c) && !((hfx) this.f.io()).h(zneVar)) {
            b("MBS: onSearch() failed. Client not allowlisted for browsing: %s", zneVar);
            hjoVar.a(tau.MEDIA_BROWSER_SEARCH_NOT_BROWSABLE);
            hjoVar.b(null);
        } else {
            zot zotVar = hjoVar.b;
            if (k(zotVar)) {
                taf.i(i(zotVar), this.y, new gou(zotVar, hjoVar, 5, bArr), new gsu(this, hjoVar, zotVar, 8), null);
            } else {
                ((hhr) this.c.io()).f(hjoVar);
            }
        }
    }

    public final void e(zne zneVar) {
        if (((hfx) this.f.io()).h(zneVar)) {
            ((hhr) this.c.io()).b();
            f(7);
            ((isw) this.d.io()).h(zneVar.a());
        }
    }

    public final void f(int i) {
        aunn aunnVar = this.t;
        PlaybackStateCompat playbackStateCompatO = ((fg) ((fg) aunnVar.io()).a).o();
        if (playbackStateCompatO == null || playbackStateCompatO.a != i) {
            return;
        }
        fi fiVar = new fi();
        fiVar.e(0, 0L, 1.0f);
        ((fg) aunnVar.io()).k(fiVar.a());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, zwb] */
    public final boolean g() {
        int i;
        anaf anafVar;
        jnm jnmVar = (jnm) this.g.io();
        if (jnmVar.d.u()) {
            i = !jnmVar.C() ? 2 : 3;
        } else {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 != 0) {
            anafVar = i2 != 1 ? hgg.a : hgg.d;
        } else {
            anafVar = hgg.c;
        }
        if (anafVar.c) {
            ((hef) this.e.io()).c(anafVar.d);
            return false;
        }
        f(7);
        return true;
    }

    public final void h(bqo bqoVar, zne zneVar, zot zotVar, List list, Instant instant) {
        int i = 0;
        boolean z = bqoVar != null;
        if (z) {
            hfy hfyVar = (hfy) this.i.io();
            zne zneVar2 = zneVar == null ? zmz.a : zneVar;
            ConcurrentHashMap concurrentHashMap = hfyVar.d;
            ahbw ahbwVar = hfyVar.c;
            concurrentHashMap.put(zneVar2, ahbwVar.a());
            agrx agrxVar = agso.a;
            hfyVar.f.kk(zneVar2);
            if (((hfx) hfyVar.b.io()).h(zneVar2)) {
                hfyVar.g.kk(zneVar2);
            }
            hfyVar.e.put(zotVar.b, ahbwVar.a());
        } else {
            aunn aunnVar = this.p;
            ((xsc) aunnVar.io()).aC(zneVar, tau.MEDIA_BROWSER_CONNECTION_FAILED);
            ((xsc) aunnVar.io()).aB(zneVar);
        }
        aihf aihfVarCreateBuilder = anad.a.createBuilder();
        String str = zotVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        anad anadVar = (anad) aihfVarCreateBuilder.instance;
        anadVar.b |= 1;
        anadVar.c = str;
        amzo amzoVar = amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CALLBACK_ARGUMENT;
        aihfVarCreateBuilder.copyOnWrite();
        anad anadVar2 = (anad) aihfVarCreateBuilder.instance;
        anadVar2.d = amzoVar.l;
        anadVar2.b |= 2;
        int i2 = zneVar.i();
        aihfVarCreateBuilder.copyOnWrite();
        anad anadVar3 = (anad) aihfVarCreateBuilder.instance;
        anadVar3.e = i2 - 1;
        anadVar3.b |= 4;
        int i3 = true != z ? 3 : 2;
        aihfVarCreateBuilder.copyOnWrite();
        anad anadVar4 = (anad) aihfVarCreateBuilder.instance;
        anadVar4.f = i3 - 1;
        anadVar4.b |= 8;
        aunn aunnVar2 = this.v;
        if (((xeu) aunnVar2.io()).b) {
            xff xffVarA = ((xeu) aunnVar2.io()).a(aihfVarCreateBuilder, alot.MBS_CONNECTION_INITIATED);
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
        } else {
            alos alosVar = (alos) alou.a.createBuilder();
            anad anadVar5 = (anad) aihfVarCreateBuilder.build();
            alosVar.copyOnWrite();
            alou alouVar = (alou) alosVar.instance;
            anadVar5.getClass();
            alouVar.d = anadVar5;
            alouVar.c = 138;
            ((xeu) aunnVar2.io()).b((alou) alosVar.build());
        }
        Iterable$EL.forEach(list, new hgi(i));
        ((xsc) this.p.io()).aC(zneVar, tau.MEDIA_BROWSER_CONNECTION_COMPLETED);
        a("MBS: onGetRoot() completed. connected: %b duration: %s", Boolean.valueOf(z), Duration.between(instant, this.s.f()));
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        ((hhr) this.c.io()).b();
        f(7);
        Iterable$EL.forEach(((hfy) this.i.io()).c(), new gmk(this, 9));
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        ((hhr) this.c.io()).b();
        f(7);
        Iterable$EL.forEach(((hfy) this.i.io()).c(), new gmk(this, 10));
    }

    @Override // defpackage.gzh
    public final void v(zwa zwaVar) {
    }

    @Override // defpackage.gzh
    public final void w(zwa zwaVar, jnm jnmVar) {
    }
}
