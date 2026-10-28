package com.google.android.apps.youtube.music.mediabrowser;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.mediabrowser.androidautoprojected.AndroidAutoCarAppServices;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.abrp;
import defpackage.abvn;
import defpackage.abwr;
import defpackage.acdq;
import defpackage.aceo;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.agrx;
import defpackage.agso;
import defpackage.ahno;
import defpackage.aigj;
import defpackage.aiik;
import defpackage.aink;
import defpackage.amiu;
import defpackage.amzo;
import defpackage.atqq;
import defpackage.aunn;
import defpackage.aupm;
import defpackage.avlh;
import defpackage.avlr;
import defpackage.avmb;
import defpackage.avmm;
import defpackage.avmn;
import defpackage.avnr;
import defpackage.awka;
import defpackage.awku;
import defpackage.awkx;
import defpackage.awrc;
import defpackage.blq;
import defpackage.bqn;
import defpackage.bqo;
import defpackage.bqs;
import defpackage.bra;
import defpackage.brf;
import defpackage.fg;
import defpackage.ght;
import defpackage.giv;
import defpackage.gkq;
import defpackage.glg;
import defpackage.gnw;
import defpackage.grj;
import defpackage.hbr;
import defpackage.hef;
import defpackage.hfb;
import defpackage.hfo;
import defpackage.hfx;
import defpackage.hfy;
import defpackage.hfz;
import defpackage.hgb;
import defpackage.hgf;
import defpackage.hgk;
import defpackage.hgl;
import defpackage.hgm;
import defpackage.hgn;
import defpackage.hhn;
import defpackage.hho;
import defpackage.hhp;
import defpackage.hhq;
import defpackage.hhr;
import defpackage.hhw;
import defpackage.hia;
import defpackage.hjn;
import defpackage.hjo;
import defpackage.hwm;
import defpackage.ibg;
import defpackage.ied;
import defpackage.iir;
import defpackage.isw;
import defpackage.jnm;
import defpackage.mbc;
import defpackage.qcb;
import defpackage.tau;
import defpackage.tbt;
import defpackage.twu;
import defpackage.txz;
import defpackage.tym;
import defpackage.ugm;
import defpackage.vxz;
import defpackage.vyf;
import defpackage.vyl;
import defpackage.xeu;
import defpackage.xir;
import defpackage.xit;
import defpackage.xsc;
import defpackage.yno;
import defpackage.yu;
import defpackage.zik;
import defpackage.zlv;
import defpackage.zlw;
import defpackage.zlx;
import defpackage.zmc;
import defpackage.zmd;
import defpackage.zmm;
import defpackage.zmz;
import defpackage.zne;
import defpackage.znf;
import defpackage.znp;
import defpackage.zoa;
import defpackage.zob;
import defpackage.zoc;
import defpackage.zod;
import defpackage.zoe;
import defpackage.zon;
import defpackage.zot;
import defpackage.zvm;
import defpackage.zvn;
import defpackage.zvp;
import j$.lang.Iterable$EL;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicBrowserService extends hfz {
    private static final agrf A = agrf.h("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService");
    private avmn C;
    public mbc i;
    public aunn j;
    public aunn k;
    public aunn l;
    public aunn m;
    public aunn n;
    public aunn o;
    public aunn p;
    public aunn q;
    public aunn r;
    public aunn s;
    public aunn t;
    public aunn u;
    public aunn v;
    public aunn w;
    public aunn x;
    public qcb y;
    public qcb z;
    private final avmm B = new avmm();
    private final avmm D = new avmm();
    private final awkx E = new awkx();
    private final awkx F = new awkx();
    private boolean G = false;

    private final brf k() {
        try {
            return this.g.a();
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) A.c()).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService", "getBrowserInfo", (char) 427, "MusicBrowserService.java")).t("MBS: getCurrentBrowserInfo() failed.");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:101:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:103:0x0308  */
    /* JADX WARN: Code duplicated, block: B:109:0x0328  */
    /* JADX WARN: Code duplicated, block: B:111:0x0330  */
    /* JADX WARN: Code duplicated, block: B:113:0x0338  */
    /* JADX WARN: Code duplicated, block: B:122:0x0358  */
    /* JADX WARN: Code duplicated, block: B:123:0x035b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0367  */
    /* JADX WARN: Code duplicated, block: B:130:0x0373  */
    /* JADX WARN: Code duplicated, block: B:131:0x0376  */
    /* JADX WARN: Code duplicated, block: B:134:0x0384  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:159:0x0407  */
    /* JADX WARN: Code duplicated, block: B:160:0x040f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0315 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0210  */
    /* JADX WARN: Code duplicated, block: B:77:0x0258  */
    /* JADX WARN: Code duplicated, block: B:85:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:87:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x02da  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ed  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    @Override // defpackage.bre
    public final bqo a(String str, int i, Bundle bundle) {
        bqo bqoVar;
        boolean zContains;
        hef hefVar;
        Bundle bundle2;
        boolean z;
        ?? r3;
        Context context;
        Intent action;
        String action2;
        ComponentName component;
        String dataString;
        String dataString2;
        Uri data;
        String[] strArrSplit;
        String str2;
        String[] strArrSplit2;
        List<String> queryParameters;
        int i2;
        PendingIntent broadcast;
        String packageName;
        ComponentName component2;
        Instant instantF = this.i.f();
        ((agrc) ((agrc) A.c()).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService", "onGetRoot", SemanticState.Hidden, "MusicBrowserService.java")).w("MBS: onGetRoot(). appPkg: '%s'", str);
        bqo bqoVar2 = null;
        if (this.j.io() == null) {
            return null;
        }
        if (str == null) {
            zvp.a(zvn.b, zvm.n, "clientPackageName was null in onGetRoot");
            return null;
        }
        zot zotVarAO = zik.aO(str);
        hgk hgkVar = (hgk) this.j.io();
        zne zneVarB = ((hef) hgkVar.e.io()).b(zotVarAO, bundle);
        ArrayList arrayList = new ArrayList();
        arrayList.add(((xit) hgkVar.j.io()).n(299));
        xsc xscVar = (xsc) hgkVar.p.io();
        zneVarB.getClass();
        ?? r7 = xscVar.a;
        r7.lock();
        try {
            xscVar.aB(zneVarB);
            xir xirVarN = ((xit) xscVar.b.io()).n(355);
            xscVar.c.put(zneVarB, xirVarN);
            xirVarN.f(tau.MEDIA_BROWSER_CONNECTION_STARTED);
            r7.unlock();
            if (zneVarB.e()) {
                xir xirVar = hgkVar.r;
                if (xirVar != null) {
                    xirVar.f(tau.MEDIA_BROWSER_CONNECTION_STARTED);
                    hgkVar.r = null;
                }
                hgkVar.r = ((xit) hgkVar.j.io()).n(81);
                hgkVar.r.f(tau.MEDIA_BROWSER_CONNECTION_STARTED);
                arrayList.add(hgkVar.r);
            }
            Iterable$EL.forEach(arrayList, new hfo(zotVarAO, zneVarB, 2));
            xsc xscVar2 = (xsc) hgkVar.p.io();
            amiu amiuVarG = hgm.g(355, zotVarAO, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CALLBACK_ARGUMENT, zneVarB, null, null);
            zneVarB.getClass();
            ?? r9 = xscVar2.a;
            r9.lock();
            try {
                xir xirVar2 = (xir) ((ConcurrentHashMap) xscVar2.c).get(zneVarB);
                if (xirVar2 != null) {
                    xirVar2.h(amiuVarG);
                }
                r9.unlock();
                aunn aunnVar = hgkVar.f;
                if (!((hfx) aunnVar.io()).g(zotVarAO, zneVarB, i)) {
                    hgkVar.b("MBS: getRoot() failed. Client not allowlisted: %s", zneVarB);
                    hgkVar.h(null, zneVarB, zotVarAO, arrayList, instantF);
                    return null;
                }
                if ((zotVarAO.equals(znp.a) || zotVarAO.equals(zon.a)) && bundle != null && bundle.getBoolean("android.service.media.extra.RECENT", false)) {
                    hgkVar.a("MBS: getRoot() called by system.ui requesting recent playback by client: %s", zneVarB);
                    if (((jnm) hgkVar.g.io()).C()) {
                        hgkVar.a("MBS: getRoot() for recents succeeded for: %s", zneVarB);
                        if (ibg.c((acdq) hgkVar.n.io())) {
                            hgkVar.a("MBS: getRoot() for recents is returning an empty root", new Object[0]);
                            bqoVar = new bqo("__EMPTY_ROOT_ID__", null);
                        } else {
                            hgkVar.a("MBS: getRoot() for recents is returning recently played root", new Object[0]);
                            bqoVar2 = new bqo("__MY_RECENTS_ROOT_ID__", bundle);
                        }
                        hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                    } else {
                        hgkVar.a("MBS: getRoot() call from system.ui for recent playback but account was non-premium", new Object[0]);
                    }
                    bqoVar = bqoVar2;
                    hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                } else {
                    hgkVar.f(8);
                    if ((zneVarB.equals(zmc.a) && !((jnm) hgkVar.g.io()).C()) || awrc.c(zotVarAO, zoa.a) || awrc.c(zotVarAO, zod.a) || awrc.c(zotVarAO, zoc.a) || awrc.c(zotVarAO, zob.a) || awrc.c(zotVarAO, zoe.a)) {
                        boolean zG = hgkVar.g();
                        if (zG) {
                            hgkVar.b("MBS: getRoot() Succeeded for: %s", zneVarB);
                            hefVar = (hef) hgkVar.e.io();
                            bundle2 = new Bundle();
                            if (zneVarB.equals(zlw.a)) {
                                Intent intent = new Intent();
                                Object obj = hefVar.b;
                                context = (Context) obj;
                                action = intent.setComponent(new ComponentName(context, (Class<?>) AndroidAutoCarAppServices.class)).setAction("com.google.android.apps.youtube.music.mediabrowser.androidautoprojected.SETTINGS_INTENT_ACTION");
                                obj.getClass();
                                action.getClass();
                                String packageName2 = context.getPackageName();
                                action2 = action.getAction();
                                component = action.getComponent();
                                z = true;
                                if (component == null) {
                                    if (Objects.equals(action2, "androidx.car.app.action.NAVIGATE")) {
                                        if (action.getDataString() == null) {
                                            dataString2 = "";
                                        } else {
                                            dataString2 = action.getDataString();
                                        }
                                        if (!dataString2.startsWith("geo:")) {
                                            throw new InvalidParameterException("Navigation intent has a malformed uri");
                                        }
                                        data = action.getData();
                                        if (data.isHierarchical()) {
                                            queryParameters = data.getQueryParameters("q");
                                            if (queryParameters.isEmpty()) {
                                                str2 = null;
                                            } else {
                                                str2 = queryParameters.get(0);
                                            }
                                        } else {
                                            strArrSplit = data.getEncodedSchemeSpecificPart().split("q=");
                                            if (strArrSplit.length < 2) {
                                                str2 = null;
                                            } else {
                                                str2 = strArrSplit[1].split("&")[0];
                                            }
                                        }
                                        if (str2 == null) {
                                            strArrSplit2 = data.getEncodedSchemeSpecificPart().split(",");
                                            if (strArrSplit2.length == 2) {
                                                Double.parseDouble(strArrSplit2[0]);
                                                Double.parseDouble(strArrSplit2[1]);
                                            }
                                            throw new InvalidParameterException("Navigation intent has neither a location nor a query string");
                                        }
                                    } else {
                                        if ("android.intent.action.DIAL".equals(action2)) {
                                        }
                                        if (action.getDataString() == null) {
                                            dataString = "";
                                        } else {
                                            dataString = action.getDataString();
                                        }
                                        if (!dataString.startsWith("tel:")) {
                                            throw new InvalidParameterException("Phone intent data is not properly formatted");
                                        }
                                        if (action.getComponent() != null) {
                                            throw new SecurityException("Phone intent cannot have a component");
                                        }
                                    }
                                } else if (Objects.equals(action2, "androidx.car.app.action.NAVIGATE")) {
                                    if (action.getDataString() == null) {
                                        dataString2 = "";
                                    } else {
                                        dataString2 = action.getDataString();
                                    }
                                    if (!dataString2.startsWith("geo:")) {
                                        throw new InvalidParameterException("Navigation intent has a malformed uri");
                                    }
                                    data = action.getData();
                                    if (data.isHierarchical()) {
                                        queryParameters = data.getQueryParameters("q");
                                        if (queryParameters.isEmpty()) {
                                            str2 = queryParameters.get(0);
                                        } else {
                                            str2 = null;
                                        }
                                    } else {
                                        strArrSplit = data.getEncodedSchemeSpecificPart().split("q=");
                                        if (strArrSplit.length < 2) {
                                            str2 = null;
                                        } else {
                                            str2 = strArrSplit[1].split("&")[0];
                                        }
                                    }
                                    if (str2 == null) {
                                        strArrSplit2 = data.getEncodedSchemeSpecificPart().split(",");
                                        if (strArrSplit2.length == 2) {
                                            Double.parseDouble(strArrSplit2[0]);
                                            Double.parseDouble(strArrSplit2[1]);
                                        }
                                        throw new InvalidParameterException("Navigation intent has neither a location nor a query string");
                                    }
                                } else {
                                    if ("android.intent.action.DIAL".equals(action2)) {
                                    }
                                    if (action.getDataString() == null) {
                                        dataString = "";
                                    } else {
                                        dataString = action.getDataString();
                                    }
                                    if (!dataString.startsWith("tel:")) {
                                        throw new InvalidParameterException("Phone intent data is not properly formatted");
                                    }
                                    if (action.getComponent() != null) {
                                        throw new SecurityException("Phone intent cannot have a component");
                                    }
                                }
                                if (Build.VERSION.SDK_INT >= 34) {
                                    i2 = 50331648;
                                } else {
                                    i2 = 33554432;
                                }
                                if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    packageName = context.getPackageName();
                                    component2 = action.getComponent();
                                    if (component2 != null) {
                                        action.setClassName(packageName, "androidx.car.app.activity.CarAppActivity");
                                    }
                                    broadcast = PendingIntent.getActivity(context, 0, action, i2);
                                } else {
                                    action.putExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY", action.getComponent());
                                    action.setClass(context, CarAppNotificationBroadcastReceiver.class);
                                    broadcast = PendingIntent.getBroadcast(context, 0, action, i2);
                                }
                                bundle2.putParcelable("androidx.media.BrowserRoot.Extras.APPLICATION_PREFERENCES_USING_CAR_APP_LIBRARY_INTENT", broadcast);
                            } else {
                                z = true;
                            }
                            if (zneVarB.equals(zmm.a)) {
                                bundle2.putBoolean("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement", ((jnm) hgkVar.g.io()).C());
                            } else {
                                bundle2.putBoolean("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement", ((jnm) hgkVar.g.io()).C());
                            }
                            if (zneVarB.equals(zlw.a)) {
                                boolean z2 = z;
                                bundle2.putBoolean("android.media.browse.AUTO_TABS_OPT_IN_HINT", z2);
                                r3 = z2;
                            } else {
                                r3 = z;
                            }
                            bundle2.putBoolean("android.media.browse.SEARCH_SUPPORTED", r3);
                            bundle2.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", r3);
                            bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", r3);
                            bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
                            bqoVar = new bqo(zneVarB.b, bundle2);
                            hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                        } else {
                            hgkVar.b("MBS: getRoot() returning empty for: %s\nisBrowsable: %b", zneVarB, Boolean.valueOf(((hfx) hgkVar.f.io()).h(zneVarB)));
                            bqoVar = new bqo("__EMPTY_ROOT_ID__", null);
                            hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                        }
                    } else {
                        if (((hfx) aunnVar.io()).g(zotVarAO, zneVarB, i)) {
                            Set set = ((hfx) aunnVar.io()).g;
                            synchronized (set) {
                                zContains = set.contains(zneVarB);
                            }
                            if (!zContains) {
                                if (!((hfx) hgkVar.f.io()).h(zneVarB)) {
                                    hgkVar.b("MBS: getRoot() returning empty for: %s\nisBrowsable: %b", zneVarB, Boolean.valueOf(((hfx) hgkVar.f.io()).h(zneVarB)));
                                    bqoVar = new bqo("__EMPTY_ROOT_ID__", null);
                                    hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                                }
                            }
                        } else if (!((hfx) hgkVar.f.io()).h(zneVarB)) {
                            hgkVar.b("MBS: getRoot() returning empty for: %s\nisBrowsable: %b", zneVarB, Boolean.valueOf(((hfx) hgkVar.f.io()).h(zneVarB)));
                            bqoVar = new bqo("__EMPTY_ROOT_ID__", null);
                            hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                        }
                        hgkVar.b("MBS: getRoot() Succeeded for: %s", zneVarB);
                        hefVar = (hef) hgkVar.e.io();
                        bundle2 = new Bundle();
                        if (zneVarB.equals(zlw.a)) {
                            Intent intent2 = new Intent();
                            Object obj2 = hefVar.b;
                            context = (Context) obj2;
                            action = intent2.setComponent(new ComponentName(context, (Class<?>) AndroidAutoCarAppServices.class)).setAction("com.google.android.apps.youtube.music.mediabrowser.androidautoprojected.SETTINGS_INTENT_ACTION");
                            obj2.getClass();
                            action.getClass();
                            String packageName3 = context.getPackageName();
                            action2 = action.getAction();
                            component = action.getComponent();
                            z = true;
                            if (component == null && Objects.equals(component.getPackageName(), packageName3)) {
                                try {
                                    ((Context) obj2).getPackageManager().getServiceInfo(component, SemanticState.Focused);
                                } catch (PackageManager.NameNotFoundException unused) {
                                    java.util.Objects.toString(action);
                                    throw new InvalidParameterException("Intent does not have the CarAppService's ComponentName as its target".concat(action.toString()));
                                }
                            } else if (Objects.equals(action2, "androidx.car.app.action.NAVIGATE")) {
                                if (action.getDataString() == null) {
                                    dataString2 = "";
                                } else {
                                    dataString2 = action.getDataString();
                                }
                                if (!dataString2.startsWith("geo:")) {
                                    throw new InvalidParameterException("Navigation intent has a malformed uri");
                                }
                                data = action.getData();
                                if (data.isHierarchical()) {
                                    queryParameters = data.getQueryParameters("q");
                                    if (queryParameters.isEmpty()) {
                                        str2 = queryParameters.get(0);
                                    } else {
                                        str2 = null;
                                    }
                                } else {
                                    strArrSplit = data.getEncodedSchemeSpecificPart().split("q=");
                                    if (strArrSplit.length < 2) {
                                        str2 = null;
                                    } else {
                                        str2 = strArrSplit[1].split("&")[0];
                                    }
                                }
                                if (str2 == null) {
                                    strArrSplit2 = data.getEncodedSchemeSpecificPart().split(",");
                                    if (strArrSplit2.length == 2) {
                                        try {
                                            Double.parseDouble(strArrSplit2[0]);
                                            Double.parseDouble(strArrSplit2[1]);
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    throw new InvalidParameterException("Navigation intent has neither a location nor a query string");
                                }
                            } else {
                                if ("android.intent.action.DIAL".equals(action2) && !"android.intent.action.CALL".equals(action2)) {
                                    if (component == null) {
                                        throw new InvalidParameterException("The intent is not for a supported action");
                                    }
                                    throw new SecurityException("Explicitly starting a separate app is not supported");
                                }
                                if (action.getDataString() == null) {
                                    dataString = "";
                                } else {
                                    dataString = action.getDataString();
                                }
                                if (!dataString.startsWith("tel:")) {
                                    throw new InvalidParameterException("Phone intent data is not properly formatted");
                                }
                                if (action.getComponent() != null) {
                                    throw new SecurityException("Phone intent cannot have a component");
                                }
                            }
                            if (Build.VERSION.SDK_INT >= 34) {
                                i2 = 50331648;
                            } else {
                                i2 = 33554432;
                            }
                            if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                packageName = context.getPackageName();
                                component2 = action.getComponent();
                                if (component2 != null && Objects.equals(component2.getPackageName(), packageName)) {
                                    action.setClassName(packageName, "androidx.car.app.activity.CarAppActivity");
                                }
                                broadcast = PendingIntent.getActivity(context, 0, action, i2);
                            } else {
                                action.putExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY", action.getComponent());
                                action.setClass(context, CarAppNotificationBroadcastReceiver.class);
                                broadcast = PendingIntent.getBroadcast(context, 0, action, i2);
                            }
                            bundle2.putParcelable("androidx.media.BrowserRoot.Extras.APPLICATION_PREFERENCES_USING_CAR_APP_LIBRARY_INTENT", broadcast);
                        } else {
                            z = true;
                        }
                        if ((zneVarB.equals(zmm.a) || zneVarB.equals(zmd.a) || zneVarB.equals(zlv.a)) && bundle != null && bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.should_include_premium_entitlement_status", false)) {
                            bundle2.putBoolean("com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement", ((jnm) hgkVar.g.io()).C());
                        }
                        if (zneVarB.equals(zlw.a)) {
                            boolean z3 = z;
                            bundle2.putBoolean("android.media.browse.AUTO_TABS_OPT_IN_HINT", z3);
                            r3 = z3;
                        } else {
                            r3 = z;
                        }
                        bundle2.putBoolean("android.media.browse.SEARCH_SUPPORTED", r3);
                        bundle2.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", r3);
                        bundle2.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", r3);
                        bundle2.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2);
                        bqoVar = new bqo(zneVarB.b, bundle2);
                        hgkVar.h(bqoVar, zneVarB, zotVarAO, arrayList, instantF);
                    }
                }
                return bqoVar;
            } catch (Throwable th) {
                r9.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            r7.unlock();
            throw th2;
        }
    }

    @Override // defpackage.bre
    public final void b(String str, bra braVar) {
        c(str, braVar, new Bundle());
    }

    @Override // defpackage.bre
    public final void c(String str, bra braVar, Bundle bundle) {
        ght ghtVar = ((giv) this.z.a).a;
        znf znfVar = znf.a;
        hjn hjnVar = new hjn((Context) ghtVar.v.io(), (mbc) ghtVar.l.io(), aupm.b(ghtVar.Fe), aupm.b(ghtVar.Fi), (xit) ghtVar.fa.io(), aupm.b(ghtVar.Fg), aupm.b(ghtVar.Fm), aupm.b(ghtVar.cv), (hfx) ghtVar.cw.io(), (yu) ghtVar.Fw.io(), (hfy) ghtVar.cy.io(), (xeu) ghtVar.aZ.io(), (hef) ghtVar.zZ.io(), yno.ai(str), braVar, bundle, k());
        try {
            braVar.b();
            if (bundle != null && !bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.locale")) {
                bundle.putString("com.google.android.apps.youtube.music.mediabrowser.locale", getApplicationContext().getResources().getConfiguration().getLocales().get(0).toLanguageTag());
            }
            if (this.G) {
                this.E.kk(hjnVar);
            } else {
                ((hgk) this.j.io()).c(hjnVar);
            }
        } catch (NullPointerException unused) {
            ((agrc) ((agrc) A.b()).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService", "onLoadChildren", 315, "MusicBrowserService.java")).t("MBS: onLoadChildren() threw an NPE.");
            zvp.a(zvn.b, zvm.n, "MBS: onLoadChildren() threw an NPE.");
        }
    }

    @Override // defpackage.bre
    public final void d(String str, bra braVar) {
        if (str != null) {
            braVar.h = 2;
            braVar.c(null);
        }
    }

    @Override // defpackage.bre
    public final void e(String str, Bundle bundle, bra braVar) {
        ght ghtVar = ((giv) this.y.a).a;
        hjo hjoVar = new hjo((mbc) ghtVar.l.io(), aupm.b(ghtVar.fa), aupm.b(ghtVar.cy), aupm.b(ghtVar.zZ), str, braVar, bundle, k());
        try {
            braVar.b();
            if (this.G) {
                this.F.kk(hjoVar);
            } else {
                ((hgk) this.j.io()).d(hjoVar);
            }
        } catch (NullPointerException unused) {
            ((agrc) ((agrc) A.b()).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService", "onSearch", 349, "MusicBrowserService.java")).t("MBS: onSearch() threw an NPE.");
            zvp.a(zvn.b, zvm.n, "MBS: onSearch() threw an NPE.");
        }
    }

    @Override // defpackage.bre
    public final void h(Bundle bundle, bra braVar) {
        if (bundle == null) {
            new Bundle();
        }
        if (braVar.f || braVar.g) {
            Object obj = braVar.e;
            java.util.Objects.toString(obj);
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj)));
        }
        braVar.g = true;
        ((bqn) braVar).a.b(-1, null);
    }

    public final void j() {
        ((hgb) this.o.io()).d(this);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.j.io() != null) {
            hgk hgkVar = (hgk) this.j.io();
            if (txz.d(getApplicationContext())) {
                hgkVar.e(zlx.a);
            }
        }
    }

    @Override // defpackage.hfz, defpackage.bre, android.app.Service
    public final void onCreate() {
        avlr avlrVarR;
        avmn avmnVar;
        super.onCreate();
        ((abrp) this.k.io()).b();
        isw iswVar = (isw) this.q.io();
        iswVar.g();
        iswVar.b = awku.aC(znf.a);
        iswVar.a = new awku();
        hgk hgkVar = (hgk) this.j.io();
        ((jnm) hgkVar.g.io()).y(hgkVar);
        hfx hfxVar = (hfx) hgkVar.f.io();
        avmm avmmVar = hfxVar.i;
        avmmVar.c(hfxVar.f.c(new gnw(8)).ag(new hbr(hfxVar, 17), new glg(15)));
        vxz vxzVar = hfxVar.j;
        boolean z = true;
        z = true;
        int i = 0;
        byte[] bArr = new byte[0];
        if (vxzVar.c + 1 >= 0) {
            vyl.d();
        }
        vyl.d();
        int i2 = 10;
        if (vxzVar.a == null) {
            vyf vyfVar = vyf.a;
            Object objInvoke = aink.a;
            try {
                aigj aigjVarV = aigj.v(bArr);
                aigjVarV.getClass();
                ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
                generatedRegistry.getClass();
                objInvoke = vyfVar.invoke(aigjVarV, generatedRegistry);
            } catch (aiik e) {
                twu.d("ExperimentFlagUtil", 6, "Unable to parse default value of proto typed experiment flag: ".concat(String.valueOf(e.getMessage())), null);
            }
            objInvoke.getClass();
            avlrVarR = avlr.J(objInvoke);
        } else {
            avlrVarR = vxzVar.a.d().K(new ugm(bArr, 10)).r();
        }
        avmmVar.c(avlrVarR.ag(new hbr(hfxVar, 18), new glg(15)));
        aunn aunnVar = hgkVar.o;
        yu yuVar = (yu) aunnVar.io();
        Object obj = yuVar.a;
        if (obj != null) {
            ((awku) obj).kn();
        }
        yuVar.a = awku.aC(zmz.a);
        ((tbt) hgkVar.k.io()).f(hgkVar);
        avmm avmmVar2 = hgkVar.q;
        int i3 = 2;
        avmn[] avmnVarArr = new avmn[2];
        int i4 = 20;
        avmnVarArr[0] = ((avlh) ((grj) hgkVar.l.io()).a).P().p().i(new abwr(1)).al(new hbr(hgkVar, 20), new glg(16));
        Optional optionalOfNullable = Optional.ofNullable(((yu) aunnVar.io()).a);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((awku) optionalOfNullable.get()).N());
        }
        avmnVarArr[1] = ((avlh) optionalOfNullable.get()).al(new hgl(hgkVar, z ? 1 : 0), new glg(16));
        avmmVar2.e(avmnVarArr);
        hhr hhrVar = (hhr) hgkVar.c.io();
        hhrVar.l.e(((avlh) hhrVar.i.io()).p().al(new hgl(new hho(hhrVar, 0), i2), new hgl(hhp.a, 11)), ((iir) hhrVar.j.io()).c.P().L((avmb) hhrVar.k.io()).x(new hhw(new hhn(0), 1)).al(new hgl(new hho((Object) hhrVar, 2, (char[]) null), 12), new hgl(hhq.a, 9)));
        hia hiaVar = (hia) hhrVar.d.io();
        avmn avmnVar2 = hiaVar.z;
        if (avmnVar2 == null || avmnVar2.f()) {
            hiaVar.z = hiaVar.j.i(new abwr(1)).al(new hgl(hiaVar, i4), new glg(19));
        }
        avmn avmnVar3 = hiaVar.G;
        if (avmnVar3 == null || avmnVar3.f()) {
            hiaVar.G = hiaVar.A.N().aA(hia.a.toSeconds(), TimeUnit.SECONDS).al(new hgl(hiaVar, 13), new glg(19));
        }
        hgb hgbVar = (hgb) this.o.io();
        agrx agrxVar = agso.a;
        Context context = hgbVar.a;
        tym.aC(context, "ExternalDeviceNotifications", context.getString(R.string.mbs_notification_channel_title), 2, false, true);
        fg fgVarC = ((aceo) this.l.io()).c();
        fgVarC.h(((hgn) this.s.io()).d());
        if (((Boolean) this.x.io()).booleanValue()) {
            hgf hgfVar = (hgf) this.r.io();
            if (hgfVar.b.a()) {
                ((aceo) hgfVar.d.io()).i();
            } else {
                ListenableFuture listenableFuture = hgfVar.g;
                if ((listenableFuture == null || listenableFuture.isDone()) && (hgfVar.e.io() instanceof hwm)) {
                    hgfVar.g = ((ibg) hgfVar.c.io()).a();
                    ahno.at(hgfVar.g, new hfb(hgfVar, 2), hgfVar.f);
                }
            }
        }
        MediaSessionCompat$Token mediaSessionCompat$TokenC = fgVarC.c();
        if (mediaSessionCompat$TokenC == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f = mediaSessionCompat$TokenC;
        bqs bqsVar = this.g;
        bqsVar.d.e.a(new blq(bqsVar, mediaSessionCompat$TokenC, 4, (char[]) null));
        if (((isw) this.q.io()).f().isPresent() && ((avmnVar = this.C) == null || avmnVar.f())) {
            this.C = ((avlh) ((isw) this.q.io()).f().get()).i(new abwr(1)).al(new hgl(this, 5), new glg(17));
        }
        if (!txz.g(getApplicationContext()) && !((vxz) this.v.io()).l(10, 45362313L, false)) {
            z = false;
        }
        this.G = z;
        if (z) {
            avmm avmmVar3 = this.D;
            avmmVar3.c(this.E.N().L((avmb) this.t.io()).al(new hgl(this, i), new glg(17)));
            avmmVar3.c(this.F.N().L((avmb) this.t.io()).al(new hgl(this, i3), new glg(17)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    @Override // defpackage.bre, android.app.Service
    public final void onDestroy() {
        boolean z;
        this.e.a = null;
        avmn avmnVar = this.C;
        if (avmnVar != null && !avmnVar.f()) {
            awka.f((AtomicReference) this.C);
        }
        avmm avmmVar = this.D;
        if (avmmVar != null && !avmmVar.b) {
            avmmVar.dispose();
        }
        if (this.q.io() != null) {
            ((isw) this.q.io()).g();
        }
        if (this.j.io() != null) {
            hgk hgkVar = (hgk) this.j.io();
            hfy hfyVar = (hfy) hgkVar.i.io();
            hfyVar.d.clear();
            hfyVar.e.clear();
            agrx agrxVar = agso.a;
            awku awkuVar = hfyVar.f;
            zmz zmzVar = zmz.a;
            awkuVar.kk(zmzVar);
            hfyVar.g.kk(zmzVar);
            ((jnm) hgkVar.g.io()).z(hgkVar);
            ((hfx) hgkVar.f.io()).i.b();
            hhr hhrVar = (hhr) hgkVar.c.io();
            hhrVar.b();
            hia hiaVar = (hia) hhrVar.d.io();
            hiaVar.h();
            avmn avmnVar2 = hiaVar.z;
            if (avmnVar2 != null && !avmnVar2.f()) {
                awka.f((AtomicReference) hiaVar.z);
            }
            avmn avmnVar3 = hiaVar.G;
            if (avmnVar3 != null && !avmnVar3.f()) {
                awka.f((AtomicReference) hiaVar.G);
            }
            avmn avmnVar4 = hiaVar.B;
            if (avmnVar4 != null && !avmnVar4.f()) {
                avnr.b((AtomicReference) hiaVar.B);
            }
            hiaVar.w.clear();
            synchronized (hiaVar.t) {
                hiaVar.u.clear();
            }
            hiaVar.C.b();
            hiaVar.D = Optional.empty();
            hiaVar.E = Optional.empty();
            hiaVar.F = Optional.empty();
            hhrVar.l.b();
            ((tbt) hgkVar.k.io()).l(hgkVar);
            ((yu) hgkVar.m.io()).a = "";
            hgkVar.q.b();
            yu yuVar = (yu) hgkVar.o.io();
            Object obj = yuVar.a;
            if (obj != null) {
                ((awku) obj).kn();
            }
            yuVar.a = null;
        }
        avmm avmmVar2 = this.B;
        if (avmmVar2 != null && !avmmVar2.b) {
            avmmVar2.dispose();
        }
        if (this.o.io() != null) {
            ((hgb) this.o.io()).d(this);
        }
        if (this.k != null) {
            try {
                z = ((abvn) this.n.io()).h().i;
            } catch (Exception e) {
                ((agrc) ((agrc) ((agrc) A.c()).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/MusicBrowserService", "onDestroy", (char) 220, "MusicBrowserService.java")).t("Failed to fetch 'isInBackground'.");
                z = false;
            }
            ((abrp) this.k.io()).c(z);
        }
        if (this.p.io() != null) {
        }
        xsc xscVar = (xsc) this.w.io();
        ?? r1 = xscVar.a;
        r1.lock();
        try {
            Set setKeySet = ((ConcurrentHashMap) xscVar.c).keySet();
            setKeySet.getClass();
            for (Object obj2 : atqq.ap(setKeySet)) {
                obj2.getClass();
                xscVar.aB((zne) obj2);
            }
            r1.unlock();
        } catch (Throwable th) {
            r1.unlock();
            throw th;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        avmn[] avmnVarArr = {((abvn) this.n.io()).G().i(new abwr(1)).al(new hgl(this, 6), new glg(17))};
        avmm avmmVar = this.B;
        avmmVar.e(avmnVarArr);
        avmmVar.c(((ied) this.m.io()).a().x(new gkq(5)).at().x(10000L, TimeUnit.MILLISECONDS).s((avmb) this.u.io()).C(new hgl(this, 3), new hgl(this, 4)));
        hgb hgbVar = (hgb) this.o.io();
        if (hgbVar.b.l(140, 45625798L, false)) {
            agrx agrxVar = agso.a;
            startForeground(16, hgbVar.a());
        } else {
            hgbVar.c(this);
        }
        fg fgVar = ((aceo) this.l.io()).a;
        if (fgVar != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ((fg) fgVar.a).q((KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        }
        return super.onStartCommand(intent, i, i2);
    }
}
