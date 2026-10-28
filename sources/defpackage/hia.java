package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hia {
    private static final Duration J = Duration.ofSeconds(1);
    public static final Duration a = Duration.ofSeconds(3);
    public static final agrf b = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentFetcher");
    public avmn B;
    public avmn G;
    public boolean H;
    public final vxz I;
    private final aunn K;
    private final aunn L;
    private final aunn M;
    private final aunn N;
    private final vxz Q;
    public final Context c;
    public final aunn d;
    public final aunn e;
    public final aunn f;
    public final aunn g;
    public final aunn h;
    public final aunn i;
    public final avlh j;
    public final aunn k;
    public final aunn l;
    public final aunn m;
    public final aunn n;
    public final aunn o;
    public final Executor p;
    public final Executor q;
    public volatile ListenableFuture x;
    public ListenableFuture y;
    public avmn z;
    public final Object r = new Object();
    public final Object s = new Object();
    public final Object t = new Object();
    public final Set u = new HashSet();
    public final AtomicReference v = new AtomicReference(new ArrayList());
    public final Set w = new HashSet();
    public final avmm C = new avmm();
    private final avmm O = new avmm();
    private final avmm P = new avmm();
    public Optional D = Optional.empty();
    public Optional E = Optional.empty();
    public Optional F = Optional.empty();
    public final awkx A = new awkx();

    public hia(Context context, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, avlh avlhVar, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, aunn aunnVar14, Executor executor, Executor executor2, aunn aunnVar15, vxz vxzVar, vxz vxzVar2) {
        this.c = context;
        this.d = aunnVar;
        this.K = aunnVar2;
        this.L = aunnVar3;
        this.e = aunnVar4;
        this.f = aunnVar5;
        this.g = aunnVar6;
        this.h = aunnVar7;
        this.i = aunnVar8;
        this.j = avlhVar;
        this.M = aunnVar9;
        this.k = aunnVar10;
        this.l = aunnVar11;
        this.m = aunnVar12;
        this.n = aunnVar13;
        this.o = aunnVar14;
        this.p = executor;
        this.q = executor2;
        this.N = aunnVar15;
        this.Q = vxzVar;
        this.I = vxzVar2;
    }

    public static Map e(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            znf znfVar = znf.a;
            map2.put(yno.ai(str), (List) entry.getValue());
        }
        return map2;
    }

    public static Set f(agkz agkzVar, agkz agkzVar2) {
        return (Set) Collection.EL.stream(agkzVar2).filter(new gnh(agkzVar, 7)).collect(Collectors.toCollection(new hcd(4)));
    }

    public static Set g(agkz agkzVar, agkz agkzVar2) {
        return (Set) Collection.EL.stream(agkzVar).filter(new gnh(agkzVar2, 6)).collect(Collectors.toCollection(new hcd(4)));
    }

    private final MediaBrowserCompat$MediaItem q(String str, String str2, Uri uri) {
        aunn aunnVar = this.L;
        Bundle bundle = new Bundle();
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, str2, null, null, null, uri, bundle, null), 1);
        Context context = this.c;
        aunn aunnVar2 = this.N;
        String str3 = gzl.a;
        String string = context.getString(R.string.android_auto_offline_message);
        String string2 = context.getString(R.string.android_auto_offline_to_downloads_message);
        Uri uriR = ixt.r(context, ((adxj) aunnVar2.io()).b(arqz.gq));
        Bundle bundle2 = new Bundle();
        bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 = new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str3, string, string2, null, null, uriR, bundle2, null), 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaBrowserCompat$MediaItem2);
        int i = zne.c;
        zne zneVarAA = zik.aA(str);
        HashMap map = new HashMap();
        znf znfVar = znf.a;
        map.put(yno.ai(str), agke.n(arrayList));
        ((hir) this.d.io()).a(zneVarAA).m(agkj.h(map));
        return mediaBrowserCompat$MediaItem;
    }

    private final MediaBrowserCompat$MediaItem r(zne zneVar) {
        amzw amzwVar = amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_REFRESH_BUTTON_OFFLINE;
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        int i = zneVar.i() - 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
        anfbVar.b |= 4;
        anfbVar.g = i;
        aihfVarCreateBuilder.copyOnWrite();
        anfb anfbVar2 = (anfb) aihfVarCreateBuilder.instance;
        anfbVar2.d = Integer.valueOf(amzwVar.p);
        anfbVar2.c = 2;
        String strB = zls.b((anfb) aihfVarCreateBuilder.build());
        Context context = this.c;
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strB, context.getString(R.string.android_auto_offline_message), context.getString(R.string.android_auto_offline_refresh_app_message), null, null, ixt.r(context, ((adxj) this.N.io()).b(arqz.ep)), null, null), 2);
    }

    private final void s(String str) {
        int i = zne.c;
        aunn aunnVar = this.d;
        zne zneVarAA = zik.aA(str);
        hiq hiqVarA = ((hir) aunnVar.io()).a(zneVarAA);
        znf znfVar = znf.a;
        hiqVarA.c(yno.ai(str), r(zneVarAA));
    }

    private final boolean t(zne zneVar) {
        return this.Q.l(162, 45640347L, false) && hhs.a.contains(zneVar);
    }

    public final ListenableFuture a(final zne zneVar, final boolean z, final String str) {
        if (!hhs.b(zneVar)) {
            return ahng.n(Boolean.FALSE);
        }
        if (str == null) {
            str = zneVar.b;
        }
        return ahno.aq(new ahcx() { // from class: hhx
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                hia hiaVar = this.a;
                synchronized (hiaVar.r) {
                    boolean zB = ((hir) hiaVar.d.io()).b(gzl.f);
                    String str2 = str;
                    if (!zB || z) {
                        zne zneVar2 = zneVar;
                        ((agrc) ((agrc) hia.b.c()).k("com/google/android/apps/youtube/music/mediabrowser/content/LocalContentFetcher", "prepareOfflineTreeAsync", 495, "LocalContentFetcher.java")).t("Start fetching offline media items.");
                        return ahno.ar(((jgc) hiaVar.e.io()).f(), new hco(hiaVar, zneVar2, str2, 2, (byte[]) null), hiaVar.q);
                    }
                    ((jgc) hiaVar.e.io()).k(str2);
                    return ahng.n(Boolean.TRUE);
                }
            }
        }, this.q);
    }

    public final Optional b(List list, Optional optional) {
        agkz agkzVarN = agkz.n(list);
        if (optional.isEmpty()) {
            return Optional.of(agkzVarN);
        }
        agpr agprVar = agpr.a;
        Set setF = f((agkz) optional.orElse(agprVar), agkzVarN);
        Set setG = g((agkz) optional.orElse(agprVar), agkzVarN);
        synchronized (this.t) {
            this.u.removeAll(setG);
        }
        if (!setF.isEmpty()) {
            o(hhz.b);
        } else if (!setG.isEmpty()) {
            this.A.kk(hhz.b);
        }
        return Optional.of(agkzVarN);
    }

    public final synchronized List c() {
        return new ArrayList((java.util.Collection) this.v.get());
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        Context context = this.c;
        if (txz.g(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", context.getString(R.string.library_downloads_shelf_title));
            aunn aunnVar = this.L;
            arrayList.add(((hin) aunnVar.io()).b(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED_CHILDREN, bundle));
            arrayList.add(((hin) aunnVar.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SETTINGS));
        } else {
            arrayList.add(((hin) this.L.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_DOWNLOADED));
        }
        return arrayList;
    }

    public final void h() {
        this.H = false;
        ListenableFuture listenableFuture = this.y;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            this.y.cancel(false);
        }
        this.y = null;
        this.w.clear();
        ((List) this.v.get()).clear();
    }

    public final void i() {
        avmm avmmVar = this.O;
        avmmVar.b();
        avmmVar.e((avmn[]) Collection.EL.stream((agkz) this.F.orElse(agpr.a)).map(new hfw(this, 3)).toArray(new hhv(1)));
    }

    public final void j(Set set) {
        avmm avmmVar = this.P;
        avmmVar.b();
        avmmVar.e((avmn[]) Collection.EL.stream(set).map(new hfw(this, 4)).toArray(new hhv(0)));
    }

    public final void l(String str, Object... objArr) {
        String.format(str, objArr);
    }

    public final void m(zne zneVar) {
        ListenableFuture listenableFuture = this.y;
        if (listenableFuture == null || listenableFuture.isDone()) {
            return;
        }
        Set set = this.w;
        if (set.contains(zneVar)) {
            return;
        }
        listenableFuture.addListener(new hhy(this, zneVar, 0), this.p);
        set.add(zneVar);
    }

    public final void n() {
        avmm avmmVar = this.C;
        if (avmmVar.a() <= 0 || avmmVar.b) {
            aunn aunnVar = this.l;
            avlr avlrVarAv = gzj.av((hpy) aunnVar.io());
            Duration duration = J;
            long seconds = duration.toSeconds();
            aunn aunnVar2 = this.o;
            avlr avlrVarP = avlrVarAv.p(seconds, TimeUnit.SECONDS, (avmb) aunnVar2.io());
            aunn aunnVar3 = this.n;
            avmmVar.e(avlrVarP.O((avmb) aunnVar3.io()).af(new hgl(this, 15)), gzj.au((hpy) aunnVar.io()).p(duration.toSeconds(), TimeUnit.SECONDS, (avmb) aunnVar2.io()).O((avmb) aunnVar3.io()).af(new hgl(this, 16)), gzj.aq((hpy) aunnVar.io(), Optional.empty()).p(duration.toSeconds(), TimeUnit.SECONDS, (avmb) aunnVar2.io()).O((avmb) aunnVar3.io()).af(new hgl(this, 17)), ((hpy) aunnVar.io()).f(aqph.class).B(new gkq(9)).K(new gnw(11)).O((avmb) aunnVar3.io()).B(new hhw(this, 0)).af(new hgl(this, 18)));
        }
    }

    public final void o(hhz hhzVar) {
        if (this.x == null || this.x.isDone()) {
            zne zneVarA = ((hfy) this.K.io()).a();
            this.x = a(zneVarA, true, null);
            ahno.av(this.x).k(new egz((Object) this, (Object) hhzVar, (Object) zneVarA, 7, (byte[]) null), this.p);
        }
    }

    public final synchronized boolean p(zne zneVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        Context context = this.c;
        boolean zG = txz.g(context);
        avmn avmnVar = this.B;
        int i = 1;
        if (avmnVar == null || avmnVar.f()) {
            this.B = ((hpy) this.l.io()).g().O((avmb) this.n.io()).B(new gkq(8)).af(new abpy(this, zG, i));
        }
        n();
        AtomicReference atomicReference = this.v;
        ((List) atomicReference.get()).clear();
        if (t(zneVar)) {
            aunn aunnVar = this.N;
            ((List) atomicReference.get()).addAll(agke.s(q("__OFFLINE_MODE_HOME_TAB_MEDIA_ID__", context.getString(R.string.pivot_home), ixt.r(context, ((adxj) aunnVar.io()).b(arqz.id))), q("__OFFLINE_MODE_PODCASTS_TAB_MEDIA_ID__", context.getString(R.string.android_auto_offline_podcasts_tab_title), ixt.r(context, ((adxj) aunnVar.io()).b(arqz.kH))), q("__OFFLINE_MODE_LIBRARY_TAB_MEDIA_ID__", context.getString(R.string.pivot_library), ixt.r(context, ((adxj) aunnVar.io()).b(arqz.eU)))));
        }
        boolean zBooleanValue = ((Boolean) ahng.v(listenableFuture)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ahng.v(listenableFuture2)).booleanValue();
        if (zBooleanValue) {
            if (zBooleanValue2) {
                l("MBS: Offline tree prepared for client: %s", zneVar);
                l("MBS: Sideloaded tree prepared for client: %s", zneVar);
                aunn aunnVar2 = this.L;
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItemA = ((hin) aunnVar2.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_LOCAL_CONTENT_PARENT);
                ArrayList arrayList = new ArrayList();
                if (t(zneVar)) {
                    arrayList.add(r(zneVar));
                }
                arrayList.addAll(d());
                arrayList.add(((hin) aunnVar2.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED));
                HashMap map = new HashMap();
                String str = gzl.c;
                znf znfVar = znf.a;
                map.put(yno.ai(str), agke.n(arrayList));
                int i2 = zne.c;
                zne zneVarAA = zik.aA(str);
                if (map.containsKey(yno.ai(str))) {
                    ((hir) this.d.io()).a(zneVarAA).m(map);
                }
                ((List) atomicReference.get()).add(mediaBrowserCompat$MediaItemA);
            } else {
                l("MBS: Offline tree prepared for client: %s", zneVar);
                ((List) atomicReference.get()).addAll(d());
                if (t(zneVar)) {
                    s(gzl.a);
                }
            }
        } else if (zBooleanValue2) {
            l("MBS: Sideloaded tree prepared for client: %s", zneVar);
            ((List) atomicReference.get()).add(((hin) this.L.io()).a(amzw.MEDIA_BROWSER_LOCAL_CONTAINER_TYPE_SIDELOADED));
            if (t(zneVar)) {
                s(gzl.d);
            }
        }
        this.H = true;
        return zBooleanValue || zBooleanValue2;
    }
}
