package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjn {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult");
    public final znf b;
    public final Bundle c;
    public final brf d;
    public final zot e;
    public final String f;
    public final amzo g;
    public final awmi h;
    public final zne i;
    public final znf j;
    public final boolean k;
    private final mbc l;
    private final aunn m;
    private final aunn n;
    private final aunn o;
    private final aunn p;
    private final aunn q;
    private final bra r;
    private final Object s;
    private final Instant t;
    private final xir u;
    private Instant v;
    private List w;
    private final awmi x;
    private final awmi y;

    /* JADX WARN: Code duplicated, block: B:16:0x00da  */
    /* JADX WARN: Code duplicated, block: B:18:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:21:0x0101  */
    /* JADX WARN: Code duplicated, block: B:22:0x010f  */
    /* JADX WARN: Code duplicated, block: B:24:0x011c  */
    /* JADX WARN: Code duplicated, block: B:25:0x012a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0171  */
    /* JADX WARN: Code duplicated, block: B:34:0x0177  */
    /* JADX WARN: Code duplicated, block: B:36:0x0183  */
    public hjn(Context context, mbc mbcVar, aunn aunnVar, aunn aunnVar2, xit xitVar, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, hfx hfxVar, yu yuVar, hfy hfyVar, xeu xeuVar, hef hefVar, znf znfVar, bra braVar, Bundle bundle, brf brfVar) {
        zne zneVarW;
        zne zneVarAA;
        zne zneVarA;
        Pair pair;
        zne zneVarA2;
        znf znfVarAi;
        anfb anfbVarC;
        String str;
        context.getClass();
        mbcVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        xitVar.getClass();
        aunnVar3.getClass();
        aunnVar4.getClass();
        aunnVar5.getClass();
        hfxVar.getClass();
        yuVar.getClass();
        hfyVar.getClass();
        xeuVar.getClass();
        hefVar.getClass();
        this.l = mbcVar;
        this.m = aunnVar;
        this.n = aunnVar2;
        this.o = aunnVar3;
        this.p = aunnVar4;
        this.q = aunnVar5;
        this.b = znfVar;
        this.r = braVar;
        this.c = bundle;
        this.d = brfVar;
        this.s = new Object();
        this.h = new awmp(new qf(this, 15));
        this.x = new awmp(new qf(this, 16));
        this.y = new awmp(new qf(this, 17));
        Instant instantF = mbcVar.f();
        instantF.getClass();
        this.t = instantF;
        xir xirVarN = xitVar.n(79);
        tau tauVar = tau.MEDIA_BROWSER_LOAD_CHILDREN_STARTED;
        xirVarN.f(tauVar);
        this.u = xirVarN;
        if (brfVar != null && zik.aP(brfVar.a())) {
            pair = new Pair(zik.aO(brfVar.a()), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_BROWSER_INFO);
        } else if (bundle == null || !bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.caller_package_name")) {
            zneVarW = hmy.w(znfVar);
            zneVarW.getClass();
            if (zneVarW.h()) {
                zneVarAA = zik.aA(znfVar.l);
                if (hfxVar.i(zneVarAA)) {
                    pair = new Pair(zik.aO(zneVarAA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_ROOT_MEDIA_ID);
                } else {
                    zneVarA = hfyVar.a();
                    zneVarA.getClass();
                    if (zneVarA.h()) {
                        pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                    } else {
                        pair = new Pair(zik.aO(zneVarA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT);
                    }
                }
            } else {
                pair = new Pair(zik.aO(zneVarW.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_MEDIA_ID);
            }
        } else {
            String string = bundle.getString("com.google.android.apps.youtube.music.mediabrowser.caller_package_name");
            string = string == null ? "" : string;
            if (zik.aP(string)) {
                pair = new Pair(zik.aO(string), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE);
            } else {
                zneVarW = hmy.w(znfVar);
                zneVarW.getClass();
                if (zneVarW.h()) {
                    pair = new Pair(zik.aO(zneVarW.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_MEDIA_ID);
                } else {
                    zneVarAA = zik.aA(znfVar.l);
                    if (hfxVar.i(zneVarAA)) {
                        pair = new Pair(zik.aO(zneVarAA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_ROOT_MEDIA_ID);
                    } else {
                        zneVarA = hfyVar.a();
                        zneVarA.getClass();
                        if (zneVarA.h()) {
                            pair = new Pair(zik.aO(zneVarA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT);
                        } else {
                            pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                        }
                    }
                }
            }
        }
        Object obj = pair.first;
        obj.getClass();
        zot zotVar = (zot) obj;
        this.e = zotVar;
        Object obj2 = pair.second;
        obj2.getClass();
        amzo amzoVar = (amzo) obj2;
        this.g = amzoVar;
        String strD = hfyVar.d(context, zotVar.b);
        strD.getClass();
        this.f = strD;
        if (!hgm.c(amzoVar)) {
            zneVarA2 = hmy.w(znfVar);
            zneVarA2.getClass();
            if (zneVarA2.h()) {
                zneVarA2 = zik.aA(znfVar.l);
                if (!hfxVar.i(zneVarA2)) {
                    if (zotVar.b()) {
                        zneVarA2 = hfyVar.a();
                        zneVarA2.getClass();
                    } else {
                        zneVarA2 = hefVar.b(zotVar, bundle);
                        if (zneVarA2.h()) {
                            zneVarA2 = hfyVar.a();
                            zneVarA2.getClass();
                        }
                    }
                }
            }
        } else if (zotVar.b()) {
            zneVarA2 = hefVar.b(zotVar, bundle);
            if (zneVarA2.h()) {
                zneVarA2 = hfyVar.a();
                zneVarA2.getClass();
            }
        } else {
            zneVarA2 = hfyVar.a();
            zneVarA2.getClass();
        }
        this.i = zneVarA2;
        Object objIo = aunnVar3.io();
        objIo.getClass();
        hmy.as((xsc) objIo, zneVarA2, znfVar, tauVar);
        String str2 = znfVar.l;
        if (awrc.c(znfVar, znf.e)) {
            ((agrc) a.c().k("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult$Companion", "createTransformedParentMediaId", 633, "LoadChildrenResult.kt")).t("problematic parentMediaId: OFFLINE_CHILDREN_ROOT_ID");
            znfVarAi = yno.ai(gzl.a);
        } else {
            yuVar.a = str2;
            znfVarAi = znfVar;
        }
        this.j = znfVarAi;
        boolean zI = hfxVar.i(zik.aA(znfVar.l));
        this.k = zI;
        if (zI && !zneVarA2.c(znfVar.l)) {
            ((agrc) a.c().k("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult", "<init>", 227, "LoadChildrenResult.kt")).B("Root mediaId request being made by '%s' using parentMediaId (mediaClientName) '%s'", zotVar, znfVar.l);
        }
        aihf aihfVarCreateBuilder = anac.a.createBuilder();
        String str3 = zotVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        anac anacVar = (anac) aihfVarCreateBuilder.instance;
        anacVar.b |= 2;
        anacVar.d = str3;
        aihfVarCreateBuilder.copyOnWrite();
        anac anacVar2 = (anac) aihfVarCreateBuilder.instance;
        anacVar2.e = amzoVar.l;
        anacVar2.b |= 4;
        int i = zneVarA2.i();
        aihfVarCreateBuilder.copyOnWrite();
        anac anacVar3 = (anac) aihfVarCreateBuilder.instance;
        anacVar3.f = i - 1;
        anacVar3.b |= 8;
        boolean zC = hgm.c(amzoVar);
        aihfVarCreateBuilder.copyOnWrite();
        anac anacVar4 = (anac) aihfVarCreateBuilder.instance;
        anacVar4.b |= 16;
        anacVar4.g = zC;
        if (!znfVar.d()) {
            if (!((vxz) aunnVar5.io()).l(53, 45850459L, false) || (anfbVarC = znfVar.c()) == null || (anfbVarC.b & 1) == 0) {
                str = znfVar.l;
            } else {
                aihf builder = anfbVarC.toBuilder();
                builder.getClass();
                builder.copyOnWrite();
                anfb anfbVar = (anfb) builder.instance;
                anfbVar.e = null;
                anfbVar.b &= -2;
                str = yno.ai(zls.b(agvp.Q(builder))).l;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anac anacVar5 = (anac) aihfVarCreateBuilder.instance;
            anacVar5.b |= 1;
            anacVar5.c = str;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        anac anacVar6 = (anac) aihfVarCreateBuilder.build();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        anacVar6.getClass();
        alouVar.d = anacVar6;
        alouVar.c = 140;
        aihn aihnVarBuild = alosVar.build();
        aihnVarBuild.getClass();
        xeuVar.b((alou) aihnVarBuild);
        xirVarN.h(hgm.g(xirVarN.q(), zotVar, amzoVar, zneVarA2, znfVar, null));
    }

    public final hjy a() {
        return (hjy) this.x.a();
    }

    public final void b(tau tauVar) {
        this.u.f(tauVar);
        Object objIo = this.o.io();
        objIo.getClass();
        hmy.as((xsc) objIo, this.i, this.b, tauVar);
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02ba A[Catch: all -> 0x02bf, TRY_LEAVE, TryCatch #3 {all -> 0x02bf, blocks: (B:6:0x000a, B:8:0x0010, B:9:0x0019, B:11:0x001f, B:13:0x0033, B:18:0x0041, B:17:0x003d, B:20:0x0044, B:21:0x0048, B:22:0x0049, B:24:0x0058, B:25:0x0069, B:27:0x006d, B:29:0x0074, B:33:0x0086, B:35:0x008d, B:36:0x0099, B:39:0x00ae, B:40:0x00bb, B:42:0x00c1, B:45:0x00d6, B:47:0x00dd, B:89:0x01eb, B:87:0x01e7, B:88:0x01ea, B:90:0x01ee, B:93:0x0200, B:94:0x0204, B:96:0x020a, B:98:0x0216, B:100:0x021e, B:102:0x0224, B:104:0x022a, B:105:0x0238, B:107:0x0246, B:108:0x025e, B:30:0x007b, B:32:0x0081, B:109:0x0270, B:121:0x02a6, B:123:0x02ba, B:114:0x0279, B:116:0x0283, B:118:0x0289, B:120:0x02a3, B:12:0x002c, B:16:0x0038, B:49:0x00f2, B:51:0x00f7, B:53:0x00fd, B:55:0x0105, B:56:0x011e, B:58:0x0124, B:60:0x012e, B:61:0x0147, B:62:0x0152, B:64:0x0158, B:65:0x0162, B:67:0x0169, B:68:0x016c, B:70:0x0178, B:80:0x01cf, B:81:0x01d5, B:83:0x01db, B:71:0x0192, B:73:0x0198, B:74:0x01b2, B:77:0x01b9, B:79:0x01be), top: B:133:0x000a, inners: #0, #1 }] */
    public final void c(List list, him himVar) {
        int iDataSize;
        String strA;
        ArrayList arrayList;
        synchronized (this.s) {
            int i = 0;
            if (list != null) {
                try {
                    if (list.size() > 10) {
                        int i2 = 0;
                        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : atqq.an(list, 10)) {
                            Parcel parcelObtain = Parcel.obtain();
                            parcelObtain.getClass();
                            try {
                                try {
                                    mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
                                    iDataSize = parcelObtain.dataSize();
                                    parcelObtain.recycle();
                                } catch (Throwable th) {
                                    parcelObtain.recycle();
                                    throw th;
                                }
                            } catch (Exception e) {
                                hmy.v("getMediaItemSize() failed to parcel media item.", e);
                                parcelObtain.recycle();
                                iDataSize = 10;
                            }
                            i2 += iDataSize;
                        }
                        int iMax = Math.max(1, i2 / 10);
                        int i3 = 419840 / iMax;
                        if (i3 < list.size()) {
                            hmy.v(a.cj(iMax, i3, "truncating to ", " items based on average size of ", " from first 10 items."), null);
                            list = atqq.an(list, i3);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.v == null) {
                this.r.c(list);
                if (list == null) {
                    b(tau.MEDIA_BROWSER_LOAD_CHILDREN_RETURNED_NULL);
                    list = null;
                } else if (list.isEmpty()) {
                    b(tau.MEDIA_BROWSER_LOAD_CHILDREN_RETURNED_EMPTY);
                }
                b(tau.MEDIA_BROWSER_LOAD_CHILDREN_COMPLETED);
                if (himVar != null) {
                    himVar.v(new zng(this.i, this.d));
                }
                aunn aunnVar = this.q;
                if (((vxz) aunnVar.io()).l(21, 45791927L, false)) {
                    if (list != null) {
                        arrayList = new ArrayList(atqq.N(list, 10));
                        for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 : list) {
                            znf znfVar = znf.a;
                            Object objAh = yno.ah(mediaBrowserCompat$MediaItem2.a());
                            if (true == (objAh instanceof awmm)) {
                                objAh = null;
                            }
                            arrayList.add((znf) objAh);
                        }
                    } else {
                        arrayList = null;
                    }
                    hht hhtVar = (hht) this.n.io();
                    zne zneVar = this.i;
                    zneVar.getClass();
                    ReentrantLock reentrantLock = hhtVar.b;
                    reentrantLock.lock();
                    if (arrayList != null) {
                        try {
                            arrayList.size();
                            if (himVar != null) {
                                if (!himVar.u(zneVar)) {
                                    if (!hhtVar.f(himVar)) {
                                        hhtVar.e(himVar, zneVar);
                                    }
                                    List listM = hmy.M(himVar, arrayList);
                                    xgz xgzVarF = himVar.f();
                                    if (xgzVarF == null) {
                                        ((agrc) hht.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "handleBrowseClick", 251, "InteractionLogger.kt")).w("logClick: ve is null: %s", himVar.c);
                                    } else if (hhtVar.f(himVar)) {
                                        xhc xhcVarG = himVar.g();
                                        boolean z = xhcVarG != null;
                                        hhtVar.i(xgzVarF, z);
                                        if (z) {
                                            xgt xgtVarD = himVar.d();
                                            himVar.c();
                                            hhtVar.h(xhcVarG, hmy.L(xgtVarD, xgzVarF, null, false), himVar, listM, zneVar);
                                            hhtVar.a();
                                        }
                                    } else {
                                        ((agrc) hht.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "handleBrowseClick", SemanticState.Hidden, "InteractionLogger.kt")).w("logClick: incorrect screen: %s", himVar.c);
                                    }
                                    ListIterator listIterator = ((awoa) listM).listIterator(0);
                                    while (listIterator.hasNext()) {
                                        hhtVar.d((him) listIterator.next());
                                    }
                                } else if (!himVar.u(zneVar)) {
                                    ((agrc) hht.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "handleRootMediaItemDataGetChildrenFulfillment", 316, "InteractionLogger.kt")).t("Invalid handleRootMediaItemDataGetChildrenFulfillment()");
                                } else if (himVar.c() == null) {
                                    List listM2 = hmy.M(himVar, arrayList);
                                    xhc xhcVarG2 = himVar.g();
                                    if (xhcVarG2 == null) {
                                        ((agrc) hht.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger", "handleRootMediaItemDataGetChildrenFulfillment", 331, "InteractionLogger.kt")).t("pageVeType is null");
                                    } else {
                                        hhtVar.h(xhcVarG2, null, himVar, listM2, zneVar);
                                        ListIterator listIterator2 = ((awoa) listM2).listIterator(0);
                                        while (listIterator2.hasNext()) {
                                            hhtVar.d((him) listIterator2.next());
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            reentrantLock.unlock();
                            throw th3;
                        }
                    }
                    reentrantLock.unlock();
                }
                if (((vxz) aunnVar.io()).l(6, 45680102L, false) && list != null) {
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem3 : list) {
                        Bundle bundle = mediaBrowserCompat$MediaItem3.a.f;
                        if (bundle != null && bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.IS_PROMOTION", false) && (strA = mediaBrowserCompat$MediaItem3.a()) != null && strA.length() != 0) {
                            ((hja) this.p.io()).e(this.i, strA);
                        }
                    }
                }
                Instant instantF = this.l.f();
                this.v = instantF;
                this.w = list;
                if (instantF == null) {
                    ((agrc) a.b().k("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult", "logCompletion$<anonymous>", 387, "LoadChildrenResult.kt")).t("MBS: LoadChildrenResult.logCompletion() called before sentTime was set.");
                } else {
                    Duration durationBetween = Duration.between(this.t, instantF);
                    durationBetween.getClass();
                    durationBetween.toMillis();
                    hgm.f(this.w);
                }
            } else {
                List list2 = this.w;
                if (list2 == null) {
                    if (list != null) {
                        ((isw) this.m.io()).h(this.b);
                        b(tau.MEDIA_BROWSER_GET_CHILDREN_COMPLETED);
                        if (list != null) {
                            list.size();
                        }
                    }
                } else if (list == null || list2.size() != list.size()) {
                    ((isw) this.m.io()).h(this.b);
                    b(tau.MEDIA_BROWSER_GET_CHILDREN_COMPLETED);
                    if (list != null) {
                        list.size();
                    }
                } else {
                    while (true) {
                        if (i < list2.size()) {
                            if (!TextUtils.equals(((MediaBrowserCompat$MediaItem) list2.get(i)).a(), ((MediaBrowserCompat$MediaItem) list.get(i)).a())) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    ((isw) this.m.io()).h(this.b);
                    b(tau.MEDIA_BROWSER_GET_CHILDREN_COMPLETED);
                    if (list != null) {
                        list.size();
                    }
                }
            }
        }
    }

    public final boolean d() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    public final String toString() {
        boolean zD = d();
        Instant instant = this.v;
        StringBuilder sb = new StringBuilder("LoadChildrenResult(parentMediaId=");
        sb.append(this.b.l);
        sb.append(", callingPackageName=");
        sb.append(this.e.b);
        sb.append(", mediaClientName=");
        sb.append(this.i.b);
        sb.append(", isForceRefreshEnabled=");
        sb.append(zD);
        sb.append(", resultSent=");
        sb.append(instant != null);
        sb.append(')');
        return sb.toString();
    }
}
