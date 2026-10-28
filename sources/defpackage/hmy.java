package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Pair;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.Optional;
import java.io.Closeable;
import java.io.File;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class hmy {
    public hmy() {
    }

    public static String A(anfa anfaVar) {
        return zls.a(anfaVar.toByteArray());
    }

    public static znf B(String str) {
        znf znfVar = znf.a;
        Object objAh = yno.ah(str);
        Throwable thA = awmn.a(objAh);
        if (thA != null) {
            ((agrc) ((agrc) him.a.c()).j(thA).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaItemData$Companion", "createMediaId$<anonymous>", 874, "MediaItemData.kt")).w("Could not create or ingest MediaId from: %s", str);
        }
        if (true == (objAh instanceof awmm)) {
            objAh = null;
        }
        return (znf) objAh;
    }

    public static List C(List list, ConcurrentMap concurrentMap, zne zneVar, mbc mbcVar, aunn aunnVar) {
        him himVarD;
        awoa awoaVar = new awoa(10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amzx amzxVar = (amzx) it.next();
            agrf agrfVar = him.a;
            znf znfVarG = G(amzxVar);
            amzl amzlVar = null;
            if (znfVarG == null) {
                himVarD = null;
            } else {
                himVarD = D(znfVarG, zneVar, concurrentMap);
                himVarD.s(amzxVar, mbcVar);
            }
            if (himVarD != null) {
                if (amzxVar.i.size() > 0) {
                    aiie aiieVar = amzxVar.i;
                    aiieVar.getClass();
                    if ((amzxVar.b & 32) != 0 && (amzlVar = amzxVar.j) == null) {
                        amzlVar = amzl.a;
                    }
                    himVarD.n(aiieVar, amzlVar, mbcVar, aunnVar);
                }
                awoaVar.add(himVarD);
            }
        }
        return awoaVar.f();
    }

    public static him D(znf znfVar, zne zneVar, ConcurrentMap concurrentMap) {
        znfVar.getClass();
        Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(concurrentMap, znfVar, new hfw(new hgo((Object) znfVar, (Object) zneVar, (Object) concurrentMap, 4, (byte[]) null), 6));
        if (objComputeIfAbsent != null) {
            return (him) objComputeIfAbsent;
        }
        throw new IllegalStateException("computeIfAbsent returned null for MediaItemData");
    }

    public static him E(zne zneVar, ConcurrentMap concurrentMap, mbc mbcVar) {
        Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.EL.computeIfAbsent(concurrentMap, zneVar.a(), new hfw(new hgo((Object) zneVar, (Object) concurrentMap, (Object) mbcVar, 3, (char[]) null), 5));
        if (objComputeIfAbsent != null) {
            return (him) objComputeIfAbsent;
        }
        throw new IllegalStateException("computeIfAbsent returned null for root MediaItemData");
    }

    public static boolean F(List list, List list2) {
        int i;
        if (list == null) {
            if (list2 == null) {
                return false;
            }
        } else if (list2 != null && (i = ((awoa) list).b) == ((awoa) list2).b) {
            for (int i2 = 0; i2 < i; i2++) {
                if (awrc.c(((him) list.get(i2)).c, ((him) list2.get(i2)).c)) {
                }
            }
            return false;
        }
        return true;
    }

    public static znf G(amzx amzxVar) {
        return B(amzxVar.e);
    }

    public static amzx H(List list, amzw amzwVar) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            znf znfVar = znf.a;
            if (yno.ai(((amzx) next).e).b() == amzwVar) {
                return (amzx) next;
            }
        }
        next = null;
        return (amzx) next;
    }

    public static void I(him himVar, hjn hjnVar) {
        himVar.v(new zng(hjnVar.i, hjnVar.d));
    }

    public static him J(Map map, znf znfVar) {
        if (znfVar == null) {
            return null;
        }
        return (him) map.get(znfVar);
    }

    public static ajwo L(xgt xgtVar, xgz xgzVar, ajwo ajwoVar, boolean z) {
        String str;
        argn argnVar = xgzVar != null ? ((xgx) xgzVar).a : null;
        aoar aoarVar = aoar.a;
        aihf aihfVarCreateBuilder = aoarVar.createBuilder();
        aihfVarCreateBuilder.getClass();
        if (xgtVar != null && (str = xgtVar.a) != null && str.length() > 0) {
            agvp.L(str, aihfVarCreateBuilder);
        }
        if (argnVar != null && (argnVar.b & 2) != 0) {
            agvp.N(((xgx) xgzVar).a.d, aihfVarCreateBuilder);
        }
        if (argnVar != null && (argnVar.b & 8) != 0) {
            agvp.M(((xgx) xgzVar).a.f, aihfVarCreateBuilder);
        }
        if (z && argnVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aoar aoarVar2 = (aoar) aihfVarCreateBuilder.instance;
            aoarVar2.j = argnVar;
            aoarVar2.b |= SemanticState.LiveRegion;
        }
        aoar aoarVarI = agvp.I(aihfVarCreateBuilder);
        aihf aihfVarCreateBuilder2 = aoarVar.createBuilder();
        aihfVarCreateBuilder2.getClass();
        boolean zC = awrc.c(aoarVarI, agvp.I(aihfVarCreateBuilder2));
        if (ajwoVar != null) {
            aihh aihhVar = (aihh) ajwoVar.toBuilder();
            aihhVar.getClass();
            if (!zC) {
                aihl aihlVar = aoaq.b;
                aihlVar.getClass();
                aihhVar.e(aihlVar, aoarVarI);
            }
            return atqp.W(aihhVar);
        }
        if (zC) {
            return null;
        }
        aihh aihhVar2 = (aihh) ajwo.a.createBuilder();
        aihhVar2.getClass();
        aihl aihlVar2 = aoaq.b;
        aihlVar2.getClass();
        aihhVar2.e(aihlVar2, aoarVarI);
        return atqp.W(aihhVar2);
    }

    public static List M(him himVar, List list) {
        Object next;
        List listM = himVar.m();
        if (listM == null) {
            listM = awno.a;
        }
        awoa awoaVar = new awoa(10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            znf znfVar = (znf) it.next();
            Iterator it2 = listM.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!awrc.c(((him) next).c, znfVar));
            him himVar2 = (him) next;
            if (himVar2 != null) {
                awoaVar.add(himVar2);
            }
        }
        return awoaVar.f();
    }

    public static boolean N(xgt xgtVar, xgt xgtVar2) {
        String str;
        if (xgtVar != null && (str = xgtVar.a) != null && str.length() > 0) {
            if (awrc.c(str, xgtVar2 != null ? xgtVar2.a : null)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ MediaBrowserCompat$MediaItem O(List list, znf znfVar) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) next;
            if (mediaBrowserCompat$MediaItem.a() != null && awrc.c(mediaBrowserCompat$MediaItem.a(), znfVar.l)) {
                return (MediaBrowserCompat$MediaItem) next;
            }
        }
        next = null;
        return (MediaBrowserCompat$MediaItem) next;
    }

    public static xir P(String str, xit xitVar) {
        xir xirVarN = xitVar.n(12);
        if (str != null) {
            aihf aihfVarCreateBuilder = amiu.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
            amiuVar.c |= 64;
            amiuVar.B = str;
            xirVarN.h((amiu) aihfVarCreateBuilder.build());
        }
        return xirVarN;
    }

    public static /* synthetic */ Pair Q(String str, Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        try {
            if (cursor == null) {
                Pair pair = new Pair(str, agpi.a);
                jku.b(null);
                return pair;
            }
            while (cursor.moveToNext()) {
                arrayList.add(Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("audio_id"))));
            }
            jku.b(cursor);
            return new Pair(str, agke.n(arrayList));
        } catch (Throwable th) {
            jku.b(cursor);
            throw th;
        }
    }

    public static /* synthetic */ agkz R(Cursor cursor) {
        agkx agkxVar = new agkx();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                agkxVar.c(Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id"))));
            }
        }
        return agkxVar.g();
    }

    public static /* synthetic */ aost S(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((Boolean) ahng.v((ListenableFuture) it.next())).booleanValue()) {
                i++;
            }
        }
        if (i == list.size()) {
            return aost.ALL;
        }
        return i > 0 ? aost.SOME : aost.NONE;
    }

    public static /* synthetic */ Boolean T(ListenableFuture listenableFuture) {
        return Boolean.valueOf(((Integer) ahng.v(this.a)).intValue() > 0);
    }

    public static /* synthetic */ Boolean U(ListenableFuture listenableFuture, ListenableFuture listenableFuture2) {
        ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
        Object objI = a.i(listenableFuture);
        Boolean bool = Boolean.TRUE;
        boolean zEquals = Objects.equals(objI, bool);
        ahno.R(listenableFuture2.isDone(), "Future was expected to be done: %s", listenableFuture2);
        boolean zEquals2 = Objects.equals(a.i(listenableFuture2), bool);
        boolean z = true;
        if (!zEquals && !zEquals2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* synthetic */ aihh V(iux iuxVar) {
        String strValueOf = String.valueOf(iuxVar.a);
        aihh aihhVar = (aihh) anuu.a.createBuilder();
        String strAD = kro.aD(strValueOf);
        aihhVar.copyOnWrite();
        anuu anuuVar = (anuu) aihhVar.instance;
        strAD.getClass();
        anuuVar.b |= 1;
        anuuVar.c = strAD;
        aihhVar.copyOnWrite();
        anuu anuuVar2 = (anuu) aihhVar.instance;
        String str = iuxVar.b;
        str.getClass();
        anuuVar2.b |= 2;
        anuuVar2.d = str;
        long size = iuxVar.c.size();
        aihhVar.copyOnWrite();
        anuu anuuVar3 = (anuu) aihhVar.instance;
        anuuVar3.b |= SemanticState.Focused;
        anuuVar3.k = size;
        String strAE = kro.aE(strValueOf);
        aihhVar.copyOnWrite();
        anuu anuuVar4 = (anuu) aihhVar.instance;
        strAE.getClass();
        anuuVar4.b |= SemanticState.Multiline;
        anuuVar4.r = strAE;
        String string = ixt.q(strValueOf).toString();
        aihhVar.copyOnWrite();
        anuu anuuVar5 = (anuu) aihhVar.instance;
        string.getClass();
        anuuVar5.b |= 131072;
        anuuVar5.v = string;
        return aihhVar;
    }

    public static boolean W(zrg zrgVar) {
        zrgVar.getClass();
        return zrgVar instanceof isd;
    }

    public static boolean X(Object obj) {
        return (obj instanceof apnx) || (obj instanceof alhu) || (obj instanceof anzi);
    }

    public static tpq Y(Context context, rrq rrqVar) {
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(context);
        qpqVar.c("musicofflinesettings");
        qpqVar.d("account_scoped_music_offline_settings.pb");
        Uri uriA = qpqVar.a();
        qrl qrlVarA = qrm.a();
        ailt ailtVar = ailt.a;
        qrlVarA.e(ailtVar);
        qrlVarA.f(uriA);
        return new tpn(omj.U(rrqVar.c(qrlVarA.a())), ailtVar);
    }

    public static anfv Z(Context context, anyx anyxVar) {
        aihf aihfVarCreateBuilder = anfv.a.createBuilder();
        aihf aihfVarCreateBuilder2 = anga.a.createBuilder();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihl aihlVar = aohd.b;
        aihf aihfVarCreateBuilder3 = aohd.a.createBuilder();
        String videoId = anyxVar.getVideoId();
        aihfVarCreateBuilder3.copyOnWrite();
        aohd aohdVar = (aohd) aihfVarCreateBuilder3.instance;
        videoId.getClass();
        aohdVar.d = 1;
        aohdVar.e = videoId;
        aihh aihhVar2 = (aihh) apji.a.createBuilder();
        aihhVar2.e(aoic.a, fhz.X(context));
        aihfVarCreateBuilder3.copyOnWrite();
        aohd aohdVar2 = (aohd) aihfVarCreateBuilder3.instance;
        apji apjiVar = (apji) aihhVar2.build();
        apjiVar.getClass();
        aohdVar2.g = apjiVar;
        aohdVar2.c |= 8;
        aihhVar.e(aihlVar, (aohd) aihfVarCreateBuilder3.build());
        aihfVarCreateBuilder2.copyOnWrite();
        anga angaVar = (anga) aihfVarCreateBuilder2.instance;
        ajwo ajwoVar = (ajwo) aihhVar.build();
        ajwoVar.getClass();
        angaVar.e = ajwoVar;
        angaVar.b |= 64;
        aihfVarCreateBuilder.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder.instance;
        anga angaVar2 = (anga) aihfVarCreateBuilder2.build();
        angaVar2.getClass();
        anfvVar.c = angaVar2;
        anfvVar.b = 66441155;
        return (anfv) aihfVarCreateBuilder.build();
    }

    public static /* synthetic */ agke a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((aajy) ahng.v((ListenableFuture) it.next()));
        }
        return agke.n(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006f  */
    static anfv aa(Context context, ajwo ajwoVar) {
        apcc apccVarA;
        apcc apccVar = apcc.MODE_UNSPECIFIED;
        aihl aihlVar = apzd.b;
        aihl aihlVarCheckIsLite = aihn.checkIsLite(aihlVar);
        ajwoVar.c(aihlVarCheckIsLite);
        if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
            aihl aihlVarCheckIsLite2 = aihn.checkIsLite(aihlVar);
            ajwoVar.c(aihlVarCheckIsLite2);
            Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
            apccVarA = apcc.a(((apzd) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).e);
            if (apccVarA == null) {
                apccVarA = apccVar;
            }
        } else {
            aihl aihlVarCheckIsLite3 = aihn.checkIsLite(apcb.b);
            ajwoVar.c(aihlVarCheckIsLite3);
            if (ajwoVar.j.n(aihlVarCheckIsLite3.d)) {
                aihl aihlVarCheckIsLite4 = aihn.checkIsLite(apcb.b);
                ajwoVar.c(aihlVarCheckIsLite4);
                Object objK2 = ajwoVar.j.k(aihlVarCheckIsLite4.d);
                apccVarA = apcc.a(((apcb) (objK2 == null ? aihlVarCheckIsLite4.b : aihlVarCheckIsLite4.c(objK2))).f);
                if (apccVarA == null) {
                    apccVarA = apccVar;
                }
            } else {
                apccVarA = apccVar;
            }
        }
        ahno.F(apccVarA != apccVar);
        aihf aihfVarCreateBuilder = anfw.a.createBuilder();
        if (apccVarA == apcc.INSERT_AFTER_CURRENT_VIDEO) {
            alay alayVarC = ackj.c(context.getString(R.string.queue_play_next));
            aihfVarCreateBuilder.copyOnWrite();
            anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
            alayVarC.getClass();
            anfwVar.c = alayVarC;
            anfwVar.b |= 1;
            aihh aihhVar = (aihh) alja.a.createBuilder();
            aliz alizVar = aliz.QUEUE_PLAY_NEXT;
            aihhVar.copyOnWrite();
            alja aljaVar = (alja) aihhVar.instance;
            aljaVar.c = alizVar.yN;
            aljaVar.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
            alja aljaVar2 = (alja) aihhVar.build();
            aljaVar2.getClass();
            anfwVar2.d = aljaVar2;
            anfwVar2.b |= 2;
        } else if (apccVarA == apcc.INSERT_AT_END) {
            alay alayVarC2 = ackj.c(context.getString(R.string.queue_add));
            aihfVarCreateBuilder.copyOnWrite();
            anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
            alayVarC2.getClass();
            anfwVar3.c = alayVarC2;
            anfwVar3.b |= 1;
            aihh aihhVar2 = (aihh) alja.a.createBuilder();
            aliz alizVar2 = aliz.ADD_TO_REMOTE_QUEUE;
            aihhVar2.copyOnWrite();
            alja aljaVar3 = (alja) aihhVar2.instance;
            aljaVar3.c = alizVar2.yN;
            aljaVar3.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            anfw anfwVar4 = (anfw) aihfVarCreateBuilder.instance;
            alja aljaVar4 = (alja) aihhVar2.build();
            aljaVar4.getClass();
            anfwVar4.d = aljaVar4;
            anfwVar4.b |= 2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar5 = (anfw) aihfVarCreateBuilder.instance;
        ajwoVar.getClass();
        anfwVar5.f = ajwoVar;
        anfwVar5.b |= 32;
        aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
        anfw anfwVar6 = (anfw) aihfVarCreateBuilder.build();
        anfwVar6.getClass();
        anfvVar.c = anfwVar6;
        anfvVar.b = 66441108;
        return (anfv) aihfVarCreateBuilder2.build();
    }

    public static anfv ab(Context context, String str, int i) {
        apze apzeVar;
        String string = context.getString(i);
        if (ish.q.match(Uri.parse(str)) == 1) {
            aihf aihfVarCreateBuilder = apze.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apze apzeVar2 = (apze) aihfVarCreateBuilder.instance;
            str.getClass();
            apzeVar2.b |= 1;
            apzeVar2.c = str;
            apzeVar = (apze) aihfVarCreateBuilder.build();
        } else {
            aihf aihfVarCreateBuilder2 = apze.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apze apzeVar3 = (apze) aihfVarCreateBuilder2.instance;
            str.getClass();
            apzeVar3.b |= 2;
            apzeVar3.d = str;
            apzeVar = (apze) aihfVarCreateBuilder2.build();
        }
        aihf aihfVarCreateBuilder3 = apzd.a.createBuilder();
        apcc apccVar = apcc.INSERT_AT_END;
        aihfVarCreateBuilder3.copyOnWrite();
        apzd apzdVar = (apzd) aihfVarCreateBuilder3.instance;
        apzdVar.e = apccVar.e;
        apzdVar.c |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        apzd apzdVar2 = (apzd) aihfVarCreateBuilder3.instance;
        apzeVar.getClass();
        apzdVar2.d = apzeVar;
        apzdVar2.c |= 1;
        aihfVarCreateBuilder3.cn(fhz.P(string));
        apzd apzdVar3 = (apzd) aihfVarCreateBuilder3.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apzd.b, apzdVar3);
        return aa(context, (ajwo) aihhVar.build());
    }

    public static anfv ac(Context context, String str, int i) {
        apze apzeVar;
        String string = context.getString(i);
        if (ish.q.match(Uri.parse(str)) == 1) {
            aihf aihfVarCreateBuilder = apze.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            apze apzeVar2 = (apze) aihfVarCreateBuilder.instance;
            str.getClass();
            apzeVar2.b |= 1;
            apzeVar2.c = str;
            apzeVar = (apze) aihfVarCreateBuilder.build();
        } else {
            aihf aihfVarCreateBuilder2 = apze.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            apze apzeVar3 = (apze) aihfVarCreateBuilder2.instance;
            str.getClass();
            apzeVar3.b |= 2;
            apzeVar3.d = str;
            apzeVar = (apze) aihfVarCreateBuilder2.build();
        }
        aihf aihfVarCreateBuilder3 = apzd.a.createBuilder();
        apcc apccVar = apcc.INSERT_AFTER_CURRENT_VIDEO;
        aihfVarCreateBuilder3.copyOnWrite();
        apzd apzdVar = (apzd) aihfVarCreateBuilder3.instance;
        apzdVar.e = apccVar.e;
        apzdVar.c |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        apzd apzdVar2 = (apzd) aihfVarCreateBuilder3.instance;
        apzeVar.getClass();
        apzdVar2.d = apzeVar;
        apzdVar2.c |= 1;
        aihfVarCreateBuilder3.cn(fhz.P(string));
        apzd apzdVar3 = (apzd) aihfVarCreateBuilder3.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apzd.b, apzdVar3);
        return aa(context, (ajwo) aihhVar.build());
    }

    public static anfv ad(Context context, String str) {
        aihf aihfVarCreateBuilder = anfw.a.createBuilder();
        alay alayVarD = ackj.d(context.getString(R.string.shuffle_play_button));
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar = (anfw) aihfVarCreateBuilder.instance;
        alayVarD.getClass();
        anfwVar.c = alayVarD;
        anfwVar.b |= 1;
        aihh aihhVar = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.SHUFFLE;
        aihhVar.copyOnWrite();
        alja aljaVar = (alja) aihhVar.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar2 = (anfw) aihfVarCreateBuilder.instance;
        alja aljaVar2 = (alja) aihhVar.build();
        aljaVar2.getClass();
        anfwVar2.d = aljaVar2;
        anfwVar2.b |= 2;
        ajwo ajwoVarO = hef.o("", str, -1, true);
        aihfVarCreateBuilder.copyOnWrite();
        anfw anfwVar3 = (anfw) aihfVarCreateBuilder.instance;
        ajwoVarO.getClass();
        anfwVar3.f = ajwoVarO;
        anfwVar3.b |= 32;
        anfw anfwVar4 = (anfw) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = anfv.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder2.instance;
        anfwVar4.getClass();
        anfvVar.c = anfwVar4;
        anfvVar.b = 66441108;
        return (anfv) aihfVarCreateBuilder2.build();
    }

    public static apji ae(Context context, String str, imi imiVar) {
        aihf aihfVarCreateBuilder = antp.a.createBuilder();
        aihf aihfVarCreateBuilder2 = antq.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        antq antqVar = (antq) aihfVarCreateBuilder2.instance;
        str.getClass();
        antqVar.b |= 1;
        antqVar.c = str;
        if (imiVar != null) {
            String str2 = imiVar.a;
            if (!TextUtils.isEmpty(str2)) {
                aihfVarCreateBuilder2.copyOnWrite();
                antq antqVar2 = (antq) aihfVarCreateBuilder2.instance;
                str2.getClass();
                antqVar2.b |= 2;
                antqVar2.d = str2;
            }
        }
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar = (antp) aihfVarCreateBuilder.instance;
        antq antqVar3 = (antq) aihfVarCreateBuilder2.build();
        antqVar3.getClass();
        antpVar.a();
        antpVar.g.add(antqVar3);
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar2 = (antp) aihfVarCreateBuilder.instance;
        antpVar2.c = 20;
        Boolean bool = Boolean.TRUE;
        antpVar2.d = bool;
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar3 = (antp) aihfVarCreateBuilder.instance;
        antpVar3.e = 21;
        antpVar3.f = bool;
        aihf aihfVarCreateBuilder3 = anpz.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar = (anpz) aihfVarCreateBuilder3.instance;
        anpzVar.f = 1;
        anpzVar.b |= 8;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar2 = (anpz) aihfVarCreateBuilder3.instance;
        anpzVar2.e = 1;
        anpzVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar4 = (antp) aihfVarCreateBuilder.instance;
        antpVar4.b |= 262144;
        antpVar4.j = true;
        anld anldVar = anld.a;
        aihf aihfVarCreateBuilder4 = anldVar.createBuilder();
        aihf aihfVarCreateBuilder5 = anlb.a.createBuilder();
        aihfVarCreateBuilder5.bL(context.getColor(R.color.ytm_color_black_at_0pct));
        aihfVarCreateBuilder5.bL(context.getColor(R.color.ytm_color_black_at_80pct));
        aihfVarCreateBuilder4.copyOnWrite();
        anld anldVar2 = (anld) aihfVarCreateBuilder4.instance;
        anlb anlbVar = (anlb) aihfVarCreateBuilder5.build();
        anlbVar.getClass();
        anldVar2.c = anlbVar;
        anldVar2.b = 2;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar3 = (anpz) aihfVarCreateBuilder3.instance;
        anld anldVar3 = (anld) aihfVarCreateBuilder4.build();
        anldVar3.getClass();
        anpzVar3.h = anldVar3;
        anpzVar3.b |= 64;
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(antr.a, (antp) aihfVarCreateBuilder.build());
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar4 = (anpz) aihfVarCreateBuilder3.instance;
        apji apjiVar2 = (apji) aihhVar.build();
        apjiVar2.getClass();
        anpzVar4.d = apjiVar2;
        anpzVar4.b |= 2;
        if (imiVar != null && imiVar.d != 1) {
            aihf aihfVarCreateBuilder6 = anldVar.createBuilder();
            aihf aihfVarCreateBuilder7 = anlc.a.createBuilder();
            aihfVarCreateBuilder7.bM(context.getColor(R.color.ytm_color_black_at_50pct));
            aihfVarCreateBuilder6.copyOnWrite();
            anld anldVar4 = (anld) aihfVarCreateBuilder6.instance;
            anlc anlcVar = (anlc) aihfVarCreateBuilder7.build();
            anlcVar.getClass();
            anldVar4.c = anlcVar;
            anldVar4.b = 1;
            aihfVarCreateBuilder3.copyOnWrite();
            anpz anpzVar5 = (anpz) aihfVarCreateBuilder3.instance;
            anld anldVar5 = (anld) aihfVarCreateBuilder6.build();
            anldVar5.getClass();
            anpzVar5.c = anldVar5;
            anpzVar5.b |= 1;
        }
        aihf aihfVarCreateBuilder8 = anldVar.createBuilder();
        aihf aihfVarCreateBuilder9 = anlc.a.createBuilder();
        aihfVarCreateBuilder9.bM(context.getColor(R.color.ytm_color_white_at_10pct));
        aihfVarCreateBuilder8.copyOnWrite();
        anld anldVar6 = (anld) aihfVarCreateBuilder8.instance;
        anlc anlcVar2 = (anlc) aihfVarCreateBuilder9.build();
        anlcVar2.getClass();
        anldVar6.c = anlcVar2;
        anldVar6.b = 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar6 = (anpz) aihfVarCreateBuilder3.instance;
        anld anldVar7 = (anld) aihfVarCreateBuilder8.build();
        anldVar7.getClass();
        anpzVar6.g = anldVar7;
        anpzVar6.b |= 16;
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anqa.a, (anpz) aihfVarCreateBuilder3.build());
        return (apji) aihhVar2.build();
    }

    public static apji af(String str) {
        aihf aihfVarCreateBuilder = annl.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        annl annlVar = (annl) aihfVarCreateBuilder.instance;
        str.getClass();
        annlVar.c = 1;
        annlVar.d = str;
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_IN_PROGRESS);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_ERROR);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_SYNC);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_WAITING);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_UNAVAILABLE);
        annl annlVar2 = (annl) aihfVarCreateBuilder.build();
        aihf aihfVarCreateBuilder2 = anpz.a.createBuilder();
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(annm.a, annlVar2);
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar = (anpz) aihfVarCreateBuilder2.instance;
        apji apjiVar2 = (apji) aihhVar.build();
        apjiVar2.getClass();
        anpzVar.d = apjiVar2;
        anpzVar.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar2 = (anpz) aihfVarCreateBuilder2.instance;
        anpzVar2.f = 1;
        anpzVar2.b |= 8;
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar3 = (anpz) aihfVarCreateBuilder2.instance;
        anpzVar3.e = 1;
        anpzVar3.b |= 4;
        anpz anpzVar4 = (anpz) aihfVarCreateBuilder2.build();
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anqa.a, anpzVar4);
        return (apji) aihhVar2.build();
    }

    public static agkj ag(String str, int i) {
        HashMap map = new HashMap();
        zh zhVar = new zh();
        zhVar.a = 1;
        map.put("display_context", zhVar.d());
        if (!TextUtils.isEmpty(str)) {
            acb acbVar = new acb((byte[]) null, (byte[]) null);
            acbVar.d(i);
            acbVar.c(str);
            map.put("container_context", acbVar.b());
        }
        return agkj.h(map);
    }

    public static anfv ah(Context context, String str) {
        aihf aihfVarCreateBuilder = apyo.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apyo apyoVar = (apyo) aihfVarCreateBuilder.instance;
        str.getClass();
        aiie aiieVar = apyoVar.c;
        if (!aiieVar.c()) {
            apyoVar.c = aihn.mutableCopy(aiieVar);
        }
        apyoVar.c.add(str);
        apyo apyoVar2 = (apyo) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) ajwo.a.createBuilder();
        aihhVar.e(apyo.b, apyoVar2);
        ajwo ajwoVar = (ajwo) aihhVar.build();
        aihf aihfVarCreateBuilder2 = anfw.a.createBuilder();
        alay alayVarC = ackj.c(context.getString(R.string.menu_save_to_playlist));
        aihfVarCreateBuilder2.copyOnWrite();
        anfw anfwVar = (anfw) aihfVarCreateBuilder2.instance;
        alayVarC.getClass();
        anfwVar.c = alayVarC;
        anfwVar.b |= 1;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.ADD_TO_PLAYLIST;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        anfw anfwVar2 = (anfw) aihfVarCreateBuilder2.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        anfwVar2.d = aljaVar2;
        anfwVar2.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        anfw anfwVar3 = (anfw) aihfVarCreateBuilder2.instance;
        ajwoVar.getClass();
        anfwVar3.f = ajwoVar;
        anfwVar3.b |= 32;
        anfw anfwVar4 = (anfw) aihfVarCreateBuilder2.build();
        aihf aihfVarCreateBuilder3 = anfv.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        anfv anfvVar = (anfv) aihfVarCreateBuilder3.instance;
        anfwVar4.getClass();
        anfvVar.c = anfwVar4;
        anfvVar.b = 66441108;
        return (anfv) aihfVarCreateBuilder3.build();
    }

    public static apji ai(aqmh aqmhVar, int i) {
        aihf aihfVarCreateBuilder = anyi.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        anyi anyiVar = (anyi) aihfVarCreateBuilder.instance;
        aqmhVar.getClass();
        anyiVar.c = aqmhVar;
        anyiVar.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        anyi anyiVar2 = (anyi) aihfVarCreateBuilder.instance;
        anyiVar2.e = 1;
        anyiVar2.b |= 4;
        aihfVarCreateBuilder.copyOnWrite();
        anyi anyiVar3 = (anyi) aihfVarCreateBuilder.instance;
        anyiVar3.d = i - 1;
        anyiVar3.b |= 2;
        anyi anyiVar4 = (anyi) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(anyj.a, anyiVar4);
        return (apji) aihhVar.build();
    }

    public static apji aj(Context context, int i, ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC = ackj.c(context.getString(R.string.default_play_button_label));
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar.m = alayVarC;
        ajnfVar.b |= 64;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.PLAY_ARROW;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        ajnfVar2.f = aljaVar2;
        ajnfVar2.e = 8;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = Integer.valueOf(i - 1);
        ajnfVar3.c = 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar.instance;
        ajnfVar4.i = 3;
        ajnfVar4.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar.instance;
        ajnfVar5.s = ajwoVar;
        ajnfVar5.b |= SemanticState.Multiline;
        aihf aihfVarCreateBuilder = aiqd.a.createBuilder();
        String upperCase = context.getString(R.string.accessibility_play_all).toUpperCase(Locale.getDefault());
        aihfVarCreateBuilder.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder.instance;
        upperCase.getClass();
        aiqdVar.b |= 2;
        aiqdVar.c = upperCase;
        aihhVar.copyOnWrite();
        ajnf ajnfVar6 = (ajnf) aihhVar.instance;
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder.build();
        aiqdVar2.getClass();
        ajnfVar6.u = aiqdVar2;
        ajnfVar6.b |= 131072;
        ajnf ajnfVar7 = (ajnf) aihhVar.build();
        aihh aihhVar3 = (aihh) apji.a.createBuilder();
        aihhVar3.e(ajnp.a, ajnfVar7);
        return (apji) aihhVar3.build();
    }

    public static apji ak(Context context, int i, ajwo ajwoVar) {
        aihh aihhVar = (aihh) ajnf.a.createBuilder();
        alay alayVarC = ackj.c(context.getString(R.string.shuffle_button));
        aihhVar.copyOnWrite();
        ajnf ajnfVar = (ajnf) aihhVar.instance;
        alayVarC.getClass();
        ajnfVar.m = alayVarC;
        ajnfVar.b |= 64;
        aihh aihhVar2 = (aihh) alja.a.createBuilder();
        aliz alizVar = aliz.SHUFFLE;
        aihhVar2.copyOnWrite();
        alja aljaVar = (alja) aihhVar2.instance;
        aljaVar.c = alizVar.yN;
        aljaVar.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar2 = (ajnf) aihhVar.instance;
        alja aljaVar2 = (alja) aihhVar2.build();
        aljaVar2.getClass();
        ajnfVar2.f = aljaVar2;
        ajnfVar2.e = 8;
        aihhVar.copyOnWrite();
        ajnf ajnfVar3 = (ajnf) aihhVar.instance;
        ajnfVar3.d = Integer.valueOf(i - 1);
        ajnfVar3.c = 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar4 = (ajnf) aihhVar.instance;
        ajnfVar4.i = 3;
        ajnfVar4.b |= 1;
        aihhVar.copyOnWrite();
        ajnf ajnfVar5 = (ajnf) aihhVar.instance;
        ajnfVar5.s = ajwoVar;
        ajnfVar5.b |= SemanticState.Multiline;
        aihf aihfVarCreateBuilder = aiqd.a.createBuilder();
        String string = context.getString(R.string.accessibility_music_shuffle);
        aihfVarCreateBuilder.copyOnWrite();
        aiqd aiqdVar = (aiqd) aihfVarCreateBuilder.instance;
        string.getClass();
        aiqdVar.b |= 2;
        aiqdVar.c = string;
        aihhVar.copyOnWrite();
        ajnf ajnfVar6 = (ajnf) aihhVar.instance;
        aiqd aiqdVar2 = (aiqd) aihfVarCreateBuilder.build();
        aiqdVar2.getClass();
        ajnfVar6.u = aiqdVar2;
        ajnfVar6.b |= 131072;
        ajnf ajnfVar7 = (ajnf) aihhVar.build();
        aihh aihhVar3 = (aihh) apji.a.createBuilder();
        aihhVar3.e(ajnp.a, ajnfVar7);
        return (apji) aihhVar3.build();
    }

    public static Optional al(String str, Class cls, agkj agkjVar) {
        Object obj = agkjVar.get(str);
        return cls.isInstance(obj) ? Optional.of(obj) : Optional.empty();
    }

    public static /* synthetic */ String am(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "OFFLINE";
        }
        return "SIDELOADED";
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static boolean an(Bundle bundle) {
        abnl abnlVar;
        ajwo ajwoVar;
        String str;
        if (Build.VERSION.SDK_INT >= 33) {
            if (bundle != null) {
                abnlVar = (abnl) bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor", abnl.class);
            } else {
                abnlVar = null;
            }
        } else if (bundle != null) {
            abnlVar = (abnl) bundle.getParcelable("com.google.android.apps.youtube.PlaybackStartDescriptor");
        } else {
            abnlVar = null;
        }
        if (abnlVar == null || (ajwoVar = abnlVar.b) == null) {
            return false;
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
        ajwoVar.c(aihlVarCheckIsLite);
        ajwo ajwoVar2 = true == ajwoVar.j.n(aihlVarCheckIsLite.d) ? ajwoVar : null;
        if (ajwoVar2 == null) {
            return false;
        }
        aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
        ajwoVar2.c(aihlVarCheckIsLite2);
        Object objK = ajwoVar2.j.k(aihlVarCheckIsLite2.d);
        apfp apfpVar = (apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK));
        return (apfpVar == null || (str = apfpVar.P) == null || str.length() <= 0) ? false : true;
    }

    public static umi ao() {
        return umi.a;
    }

    public static vxe ap(vxa vxaVar, jnm jnmVar, Map map, xgm xgmVar) {
        ArrayList arrayList = new ArrayList();
        tzk.T(map, arrayList);
        return new hdv(jnmVar.E(tzk.S(arrayList, vxaVar)), xgmVar);
    }

    public static aftj aq(aftj aftjVar) {
        aihf aihfVarCreateBuilder;
        aqjg aqjgVar = ((aqjj) aftjVar.b).i;
        if (aqjgVar == null) {
            aqjgVar = aqjg.a;
        }
        anxp anxpVar = aqjgVar.f;
        if (anxpVar == null) {
            anxpVar = anxp.a;
        }
        apji apjiVar = anxpVar.e;
        if (apjiVar == null) {
            apjiVar = apji.a;
        }
        Optional optionalH = kro.H(apjiVar, anlk.a);
        aqjg aqjgVar2 = ((aqjj) aftjVar.b).i;
        if (aqjgVar2 == null) {
            aqjgVar2 = aqjg.a;
        }
        anxp anxpVar2 = aqjgVar2.f;
        if (anxpVar2 == null) {
            anxpVar2 = anxp.a;
        }
        apji apjiVar2 = anxpVar2.e;
        if (apjiVar2 == null) {
            apjiVar2 = apji.a;
        }
        Optional optionalH2 = kro.H(apjiVar2, akrs.a);
        aqjg aqjgVar3 = ((aqjj) aftjVar.b).i;
        if (aqjgVar3 == null) {
            aqjgVar3 = aqjg.a;
        }
        anxp anxpVar3 = aqjgVar3.f;
        if (anxpVar3 == null) {
            anxpVar3 = anxp.a;
        }
        apji apjiVar3 = anxpVar3.d;
        if (apjiVar3 == null) {
            apjiVar3 = apji.a;
        }
        Optional optionalH3 = kro.H(apjiVar3, ajtd.a);
        aqjg aqjgVar4 = ((aqjj) aftjVar.b).i;
        if (aqjgVar4 == null) {
            aqjgVar4 = aqjg.a;
        }
        anxp anxpVar4 = aqjgVar4.f;
        if (anxpVar4 == null) {
            anxpVar4 = anxp.a;
        }
        apji apjiVar4 = anxpVar4.f;
        if (apjiVar4 == null) {
            apjiVar4 = apji.a;
        }
        Optional optionalH4 = kro.H(apjiVar4, apot.a);
        aqjg aqjgVar5 = ((aqjj) aftjVar.b).i;
        if (aqjgVar5 == null) {
            aqjgVar5 = aqjg.a;
        }
        anxp anxpVar5 = aqjgVar5.f;
        if (anxpVar5 == null) {
            anxpVar5 = anxp.a;
        }
        apji apjiVar5 = anxpVar5.g;
        if (apjiVar5 == null) {
            apjiVar5 = apji.a;
        }
        Optional optionalH5 = kro.H(apjiVar5, apot.a);
        if (optionalH4.isPresent()) {
            aihfVarCreateBuilder = apoq.a.createBuilder((apoq) optionalH4.get());
            aihfVarCreateBuilder.copyOnWrite();
            ((apoq) aihfVarCreateBuilder.instance).f = apoq.emptyProtobufList();
            aihfVarCreateBuilder.ch(((apoq) optionalH4.get()).f);
        } else {
            aihfVarCreateBuilder = apoq.a.createBuilder();
        }
        if (optionalH.isPresent()) {
            aihf aihfVarCreateBuilder2 = apox.a.createBuilder();
            anlj anljVar = (anlj) optionalH.get();
            aihfVarCreateBuilder2.copyOnWrite();
            apox apoxVar = (apox) aihfVarCreateBuilder2.instance;
            apoxVar.an = anljVar;
            apoxVar.c |= 67108864;
            aihfVarCreateBuilder.cj(aihfVarCreateBuilder2);
        } else if (optionalH2.isPresent()) {
            aihf aihfVarCreateBuilder3 = amgj.a.createBuilder();
            akrn akrnVar = (akrn) optionalH2.get();
            aihfVarCreateBuilder3.copyOnWrite();
            amgj amgjVar = (amgj) aihfVarCreateBuilder3.instance;
            amgjVar.dP = akrnVar;
            amgjVar.i |= SemanticState.LiveRegion;
            amgj amgjVar2 = (amgj) aihfVarCreateBuilder3.build();
            aihh aihhVar = (aihh) amgg.a.createBuilder();
            aihhVar.j(amgjVar2);
            amgg amggVar = (amgg) aihhVar.build();
            aihf aihfVarCreateBuilder4 = apox.a.createBuilder();
            aihfVarCreateBuilder4.copyOnWrite();
            apox apoxVar2 = (apox) aihfVarCreateBuilder4.instance;
            amggVar.getClass();
            apoxVar2.m = amggVar;
            apoxVar2.b |= 32;
            aihfVarCreateBuilder.cj(aihfVarCreateBuilder4);
        }
        if (optionalH5.isPresent()) {
            List listUnmodifiableList = DesugarCollections.unmodifiableList(((apoq) aihfVarCreateBuilder.instance).f);
            aihfVarCreateBuilder.copyOnWrite();
            ((apoq) aihfVarCreateBuilder.instance).f = apoq.emptyProtobufList();
            aihfVarCreateBuilder.ch(((apoq) optionalH5.get()).f);
            aihfVarCreateBuilder.ch(listUnmodifiableList);
        }
        if (optionalH3.isPresent()) {
            aihf aihfVarCreateBuilder5 = apoo.a.createBuilder();
            ajta ajtaVar = (ajta) optionalH3.get();
            aihfVarCreateBuilder5.copyOnWrite();
            apoo apooVar = (apoo) aihfVarCreateBuilder5.instance;
            apooVar.c = ajtaVar;
            apooVar.b = 90823135;
            aihfVarCreateBuilder.copyOnWrite();
            apoq apoqVar = (apoq) aihfVarCreateBuilder.instance;
            apoo apooVar2 = (apoo) aihfVarCreateBuilder5.build();
            apooVar2.getClass();
            apoqVar.h = apooVar2;
            apoqVar.c |= 2;
        }
        aihf aihfVarCreateBuilder6 = aqjj.a.createBuilder((aihn) aftjVar.b);
        aihf aihfVarCreateBuilder7 = aqjg.a.createBuilder();
        aihfVarCreateBuilder7.copyOnWrite();
        aqjg aqjgVar6 = (aqjg) aihfVarCreateBuilder7.instance;
        apoq apoqVar2 = (apoq) aihfVarCreateBuilder.build();
        apoqVar2.getClass();
        aqjgVar6.c = apoqVar2;
        aqjgVar6.b |= 1;
        aqjg aqjgVar7 = (aqjg) aihfVarCreateBuilder7.build();
        aihfVarCreateBuilder6.copyOnWrite();
        aqjj aqjjVar = (aqjj) aihfVarCreateBuilder6.instance;
        aqjgVar7.getClass();
        aqjjVar.i = aqjgVar7;
        aqjjVar.b |= 16384;
        return new aftj((aqjj) aihfVarCreateBuilder6.build());
    }

    public static vxc ar(qcb qcbVar, awmd awmdVar, jin jinVar) {
        return qcbVar.D(awmdVar, Optional.of(jinVar));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
    public static void as(xsc xscVar, zne zneVar, znf znfVar, tau tauVar) {
        apm apmVar = new apm(xscVar, zneVar, 16, null);
        int iOrdinal = tauVar.ordinal();
        if (iOrdinal == 65) {
            if (znfVar.e()) {
                apmVar.invoke(tau.MEDIA_BROWSER_LOAD_CHILDREN_HOME_MEDIA_ID_STARTED);
                return;
            } else if (awrc.c(znfVar, zneVar.a())) {
                apmVar.invoke(tau.MEDIA_BROWSER_LOAD_CHILDREN_ROOT_MEDIA_ID_STARTED);
                return;
            } else {
                apmVar.invoke(tauVar);
                return;
            }
        }
        switch (iOrdinal) {
            case 73:
                if (awrc.c(znfVar, zneVar.a())) {
                    apmVar.invoke(tau.MEDIA_BROWSER_LOAD_CHILDREN_ROOT_MEDIA_ID_COMPLETED);
                    return;
                }
                if (!znfVar.e()) {
                    apmVar.invoke(tauVar);
                    return;
                }
                zneVar.getClass();
                ?? r5 = xscVar.a;
                r5.lock();
                try {
                    xscVar.aC(zneVar, tau.MEDIA_BROWSER_LOAD_CHILDREN_HOME_MEDIA_ID_COMPLETED);
                    return;
                } finally {
                    r5.unlock();
                }
            case 74:
                if (znfVar.e()) {
                    apmVar.invoke(tau.MEDIA_BROWSER_GET_CHILDREN_HOME_MEDIA_ID_REQUEST_SENT);
                    return;
                } else {
                    apmVar.invoke(tauVar);
                    return;
                }
            case 75:
                if (znfVar.e()) {
                    apmVar.invoke(tau.MEDIA_BROWSER_GET_CHILDREN_HOME_MEDIA_ID_RESPONSE_RECEIVED);
                    return;
                } else {
                    apmVar.invoke(tauVar);
                    return;
                }
            default:
                apmVar.invoke(tauVar);
                return;
        }
    }

    private static int at(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        String lowerCase2 = str2.toLowerCase(Locale.getDefault());
        String lowerCase3 = str3.toLowerCase(Locale.getDefault());
        if (lowerCase2.contains(lowerCase) || lowerCase3.contains(lowerCase)) {
            return 4;
        }
        List<String> listH = agfm.d("\\s+").h(lowerCase);
        int i = 0;
        for (String str4 : listH) {
            if (lowerCase2.contains(str4) || lowerCase3.contains(str4)) {
                i++;
            }
        }
        if (i == listH.size()) {
            return 3;
        }
        return (i < listH.size() / 2 || i <= 0) ? 1 : 2;
    }

    public static /* synthetic */ Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity) && !(context instanceof Application) && !(context instanceof Service)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static /* synthetic */ void c(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    public static /* synthetic */ void d(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static /* synthetic */ ByteBuffer e(ByteBuffer byteBuffer, int i) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static /* synthetic */ void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void g(Spannable spannable, int i, int i2) {
        if (i < 0) {
            if (i2 >= 0) {
                Selection.setSelection(spannable, i2);
            }
        } else if (i2 < 0) {
            Selection.setSelection(spannable, i);
        } else {
            Selection.setSelection(spannable, i, i2);
        }
    }

    public static /* synthetic */ int h(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || length < i || i2 < 0) {
            return -1;
        }
        while (true) {
            boolean z = false;
            while (i2 != 0) {
                i--;
                if (i < 0) {
                    return !z ? 0 : -1;
                }
                char cCharAt = charSequence.charAt(i);
                if (z) {
                    if (!Character.isHighSurrogate(cCharAt)) {
                        return -1;
                    }
                    i2--;
                } else if (!Character.isSurrogate(cCharAt)) {
                    i2--;
                } else {
                    if (Character.isHighSurrogate(cCharAt)) {
                        return -1;
                    }
                    z = true;
                }
            }
            return i;
        }
    }

    public static /* synthetic */ int i(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i >= 0 && length >= i && i2 >= 0) {
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i < length) {
                        char cCharAt = charSequence.charAt(i);
                        if (z) {
                            if (Character.isLowSurrogate(cCharAt)) {
                                i++;
                                i2--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            i++;
                            i2--;
                        } else if (!Character.isLowSurrogate(cCharAt)) {
                            i++;
                            z = true;
                        }
                    } else if (!z) {
                        return length;
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ boolean j(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0015  */
    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x001b A[RETURN, SYNTHETIC] */
    public static int k(int i, int i2, aogf aogfVar) {
        if (i2 == 385) {
            return -6;
        }
        if (i2 != 28) {
            if (i2 != 24) {
                if (i2 == 120) {
                    return -1;
                }
                return 0;
            }
        } else if (i != 2 && i != 3) {
            i2 = 28;
            if (i2 != 24) {
                if (i2 == 120) {
                    return -1;
                }
                return 0;
            }
        }
        return aogfVar == aogf.OFFLINE_REQUEST_SOURCE_AUTO_OFFLINE ? -4 : -5;
    }

    public static Long l(anyo anyoVar, int i) {
        ArrayList arrayList = new ArrayList();
        if (m(1, i)) {
            if (anyoVar.getLastPlaybackTimestampMillis().longValue() == 0) {
                arrayList.add(anyoVar.getAddedTimestampMillis());
            } else {
                arrayList.add(anyoVar.getLastPlaybackTimestampMillis());
            }
        }
        if (m(2, i)) {
            arrayList.add(anyoVar.getAddedTimestampMillis());
        }
        return (Long) Collections.max(arrayList);
    }

    public static boolean m(int i, int i2) {
        return (i2 & i) == i;
    }

    public static String n(arbl arblVar) {
        alay alayVar = arblVar.c;
        if (alayVar == null) {
            alayVar = alay.a;
        }
        return ((alba) alayVar.c.get(0)).c;
    }

    public static long o(String str) {
        int i = agxm.b;
        agxj agxjVar = agxe.a;
        agxc agxcVar = (agxc) agxjVar;
        long jC = agxcVar.b(str.toString().getBytes(awtd.a)).c();
        int i2 = tqr.a;
        int i3 = tqg.a;
        long j = jC & 65535;
        if (j == 0) {
            return 1L;
        }
        return j;
    }

    public static int p(String str, Object obj) {
        if (obj instanceof anyx) {
            anyx anyxVar = (anyx) obj;
            return at(str, anyxVar.getTitle(), anyxVar.getArtistNames());
        }
        if (obj instanceof anuk) {
            anuk anukVar = (anuk) obj;
            return at(str, anukVar.getTitle(), anukVar.getOwnerDisplayName());
        }
        if (!(obj instanceof anjx)) {
            throw new IllegalArgumentException(String.format("Unsupported object to score: %s", obj.getClass().getName()));
        }
        anjx anjxVar = (anjx) obj;
        return at(str, anjxVar.getTitle(), anjxVar.getArtistDisplayName());
    }

    public static anfy q(anfy anfyVar) {
        aihf aihfVarCreateBuilder = anfy.a.createBuilder();
        if (anfyVar != null) {
            aihfVarCreateBuilder.bH(anfyVar.c);
            if ((anfyVar.b & 4) != 0) {
                ange angeVar = anfyVar.f;
                if (angeVar == null) {
                    angeVar = ange.a;
                }
                aihfVarCreateBuilder.copyOnWrite();
                anfy anfyVar2 = (anfy) aihfVarCreateBuilder.instance;
                angeVar.getClass();
                anfyVar2.f = angeVar;
                anfyVar2.b |= 4;
            }
        }
        return (anfy) aihfVarCreateBuilder.build();
    }

    public static apji r(String str) {
        str.getClass();
        aihf aihfVarCreateBuilder = annl.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        annl annlVar = (annl) aihfVarCreateBuilder.instance;
        annlVar.c = 2;
        annlVar.d = str;
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_COMPLETE);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_COMPLETE);
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_SYNC);
        annl annlVar2 = (annl) aihfVarCreateBuilder.build();
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(annm.a, annlVar2);
        return (apji) aihhVar.build();
    }

    public static apji s(String str, boolean z) {
        str.getClass();
        aihf aihfVarCreateBuilder = annl.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        annl annlVar = (annl) aihfVarCreateBuilder.instance;
        annlVar.c = 1;
        annlVar.d = str;
        aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_MANUAL_DOWNLOAD_COMPLETE);
        if (z) {
            aihfVarCreateBuilder.bN(annn.MUSIC_ITEM_DOWNLOAD_STATE_AUTO_OFFLINE_COMPLETE);
        }
        aihh aihhVar = (aihh) apji.a.createBuilder();
        aihhVar.e(annm.a, (annl) aihfVarCreateBuilder.build());
        return (apji) aihhVar.build();
    }

    public static apji t(Context context, String str, annn... annnVarArr) {
        aihf aihfVarCreateBuilder = annl.b.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        annl annlVar = (annl) aihfVarCreateBuilder.instance;
        str.getClass();
        annlVar.c = 2;
        annlVar.d = str;
        List listAsList = Arrays.asList(annnVarArr);
        aihfVarCreateBuilder.copyOnWrite();
        annl annlVar2 = (annl) aihfVarCreateBuilder.instance;
        annlVar2.a();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            annlVar2.e.h(((annn) it.next()).j);
        }
        aihf aihfVarCreateBuilder2 = anpz.a.createBuilder();
        aihf aihfVarCreateBuilder3 = anld.a.createBuilder();
        aihf aihfVarCreateBuilder4 = anlc.a.createBuilder();
        aihfVarCreateBuilder4.bM(context.getColor(R.color.ytm_color_black_at_40pct));
        aihfVarCreateBuilder3.copyOnWrite();
        anld anldVar = (anld) aihfVarCreateBuilder3.instance;
        anlc anlcVar = (anlc) aihfVarCreateBuilder4.build();
        anlcVar.getClass();
        anldVar.c = anlcVar;
        anldVar.b = 1;
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar = (anpz) aihfVarCreateBuilder2.instance;
        anld anldVar2 = (anld) aihfVarCreateBuilder3.build();
        anldVar2.getClass();
        anpzVar.c = anldVar2;
        anpzVar.b |= 1;
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(annm.a, (annl) aihfVarCreateBuilder.build());
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar2 = (anpz) aihfVarCreateBuilder2.instance;
        apji apjiVar2 = (apji) aihhVar.build();
        apjiVar2.getClass();
        anpzVar2.d = apjiVar2;
        anpzVar2.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar3 = (anpz) aihfVarCreateBuilder2.instance;
        anpzVar3.e = 1;
        anpzVar3.b |= 4;
        aihfVarCreateBuilder2.copyOnWrite();
        anpz anpzVar4 = (anpz) aihfVarCreateBuilder2.instance;
        anpzVar4.f = 1;
        anpzVar4.b |= 8;
        anpz anpzVar5 = (anpz) aihfVarCreateBuilder2.build();
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anqa.a, anpzVar5);
        return (apji) aihhVar2.build();
    }

    public static apji u(Context context, String str) {
        aihf aihfVarCreateBuilder = antp.a.createBuilder();
        aihf aihfVarCreateBuilder2 = antq.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        antq antqVar = (antq) aihfVarCreateBuilder2.instance;
        str.getClass();
        antqVar.b |= 2;
        antqVar.d = str;
        antq antqVar2 = (antq) aihfVarCreateBuilder2.build();
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar = (antp) aihfVarCreateBuilder.instance;
        antqVar2.getClass();
        antpVar.a();
        antpVar.g.add(antqVar2);
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar2 = (antp) aihfVarCreateBuilder.instance;
        antpVar2.c = 20;
        antpVar2.d = Boolean.TRUE;
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar3 = (antp) aihfVarCreateBuilder.instance;
        antpVar3.e = 21;
        antpVar3.f = Boolean.TRUE;
        aihfVarCreateBuilder.copyOnWrite();
        antp antpVar4 = (antp) aihfVarCreateBuilder.instance;
        antpVar4.b |= 262144;
        antpVar4.j = true;
        aihf aihfVarCreateBuilder3 = anpz.a.createBuilder();
        anld anldVar = anld.a;
        aihf aihfVarCreateBuilder4 = anldVar.createBuilder();
        anlc anlcVar = anlc.a;
        aihf aihfVarCreateBuilder5 = anlcVar.createBuilder();
        aihfVarCreateBuilder5.bM(context.getColor(R.color.ytm_color_black_at_50pct));
        aihfVarCreateBuilder4.copyOnWrite();
        anld anldVar2 = (anld) aihfVarCreateBuilder4.instance;
        anlc anlcVar2 = (anlc) aihfVarCreateBuilder5.build();
        anlcVar2.getClass();
        anldVar2.c = anlcVar2;
        anldVar2.b = 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar = (anpz) aihfVarCreateBuilder3.instance;
        anld anldVar3 = (anld) aihfVarCreateBuilder4.build();
        anldVar3.getClass();
        anpzVar.c = anldVar3;
        anpzVar.b |= 1;
        aihf aihfVarCreateBuilder6 = anldVar.createBuilder();
        aihf aihfVarCreateBuilder7 = anlcVar.createBuilder();
        aihfVarCreateBuilder7.bM(context.getColor(R.color.ytm_color_white_at_10pct));
        aihfVarCreateBuilder6.copyOnWrite();
        anld anldVar4 = (anld) aihfVarCreateBuilder6.instance;
        anlc anlcVar3 = (anlc) aihfVarCreateBuilder7.build();
        anlcVar3.getClass();
        anldVar4.c = anlcVar3;
        anldVar4.b = 1;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar2 = (anpz) aihfVarCreateBuilder3.instance;
        anld anldVar5 = (anld) aihfVarCreateBuilder6.build();
        anldVar5.getClass();
        anpzVar2.g = anldVar5;
        anpzVar2.b |= 16;
        apji apjiVar = apji.a;
        aihh aihhVar = (aihh) apjiVar.createBuilder();
        aihhVar.e(antr.a, (antp) aihfVarCreateBuilder.build());
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar3 = (anpz) aihfVarCreateBuilder3.instance;
        apji apjiVar2 = (apji) aihhVar.build();
        apjiVar2.getClass();
        anpzVar3.d = apjiVar2;
        anpzVar3.b |= 2;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar4 = (anpz) aihfVarCreateBuilder3.instance;
        anpzVar4.e = 1;
        anpzVar4.b |= 4;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar5 = (anpz) aihfVarCreateBuilder3.instance;
        anpzVar5.f = 1;
        anpzVar5.b |= 8;
        aihf aihfVarCreateBuilder8 = anldVar.createBuilder();
        aihf aihfVarCreateBuilder9 = anlb.a.createBuilder();
        aihfVarCreateBuilder9.bL(context.getColor(R.color.ytm_color_black_at_0pct));
        aihfVarCreateBuilder9.bL(context.getColor(R.color.ytm_color_black_at_80pct));
        aihfVarCreateBuilder8.copyOnWrite();
        anld anldVar6 = (anld) aihfVarCreateBuilder8.instance;
        anlb anlbVar = (anlb) aihfVarCreateBuilder9.build();
        anlbVar.getClass();
        anldVar6.c = anlbVar;
        anldVar6.b = 2;
        aihfVarCreateBuilder3.copyOnWrite();
        anpz anpzVar6 = (anpz) aihfVarCreateBuilder3.instance;
        anld anldVar7 = (anld) aihfVarCreateBuilder8.build();
        anldVar7.getClass();
        anpzVar6.h = anldVar7;
        anpzVar6.b |= 64;
        aihh aihhVar2 = (aihh) apjiVar.createBuilder();
        aihhVar2.e(anqa.a, (anpz) aihfVarCreateBuilder3.build());
        return (apji) aihhVar2.build();
    }

    public static void v(String str, Throwable th) {
        if (th != null) {
            ((agrc) ((agrc) hjn.a.c()).j(th).k("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult$Companion", "logSendResultWarning", 736, "LoadChildrenResult.kt")).w("MBS: LoadChildrenResult.sendResult() %s", str);
        } else {
            ((agrc) hjn.a.c().k("com/google/android/apps/youtube/music/mediabrowser/results/LoadChildrenResult$Companion", "logSendResultWarning", 738, "LoadChildrenResult.kt")).w("MBS: LoadChildrenResult.sendResult() %s", str);
        }
    }

    public static zne w(znf znfVar) {
        anfb anfbVarC = znfVar.c();
        if (anfbVarC == null) {
            return zmz.a;
        }
        int i = anfbVarC.g;
        int i2 = zne.c;
        int iT = agvp.T(i);
        if (iT == 0) {
            return zmz.a;
        }
        switch (iT - 1) {
            case 1:
                return zmf.a;
            case 2:
                return zmh.a;
            case 3:
                return zma.a;
            case 4:
                return zmb.a;
            case 5:
            case 6:
            case 14:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            default:
                return zmz.a;
            case 7:
                return zmm.a;
            case 8:
                return zmn.a;
            case 9:
                return zmt.a;
            case 10:
                return zlw.a;
            case 11:
                return zlz.a;
            case 12:
                return zly.a;
            case 13:
                return zlx.a;
            case 15:
                return zmd.a;
            case 16:
                return zlv.a;
            case 17:
                return zlt.a;
            case 18:
                return zlu.a;
            case 19:
                return zmk.a;
            case 20:
                return zmq.a;
            case 21:
                return zmp.a;
            case 22:
                return zms.a;
            case 23:
                return zmo.a;
            case 24:
                return zmr.a;
            case 25:
                return zmw.a;
            case 26:
                return zmx.a;
            case 27:
                return zmy.a;
            case 28:
                return zna.a;
            case 29:
                return zmc.a;
            case 30:
                return zmu.a;
            case 31:
                return znb.a;
            case 32:
                return znc.a;
            case 33:
                return znd.a;
            case 40:
                return zmg.a;
            case 41:
                return zme.a;
            case 42:
                return zml.a;
            case 43:
                return zmi.a;
            case 44:
                return zmv.a;
        }
    }

    public static Optional x(Context context, aqmh aqmhVar) {
        aqmg aqmgVar;
        aqmg aqmgVar2;
        int i;
        if (aqmhVar == null) {
            return Optional.empty();
        }
        if (aawb.O(aqmhVar)) {
            Iterator it = aqmhVar.c.iterator();
            aqmgVar = null;
            while (it.hasNext() && ((i = (aqmgVar2 = (aqmg) it.next()).d) <= 600 || aqmgVar2.e <= 600)) {
                if (i <= 600 && aqmgVar2.e <= 600) {
                    aqmgVar = aqmgVar2;
                }
            }
        } else {
            aqmgVar = null;
        }
        Uri uriD = aqmgVar != null ? tyu.d(aqmgVar.c) : null;
        if (uriD == null) {
            uriD = aawb.H(aqmhVar);
        }
        if (uriD == null || uriD.getPath() == null) {
            return Optional.empty();
        }
        String scheme = uriD.getScheme();
        String path = uriD.getPath();
        if (path == null || scheme == null || !TextUtils.equals(scheme, "file")) {
            return Optional.of(uriD);
        }
        File file = new File(path);
        if (!file.exists()) {
            return Optional.empty();
        }
        try {
            return Optional.of(avh.a(context, "com.google.android.apps.youtube.music.fileprovider", file));
        } catch (IllegalArgumentException unused) {
            return Optional.empty();
        }
    }

    public static String y(ajwo ajwoVar) {
        aihf aihfVarCreateBuilder = anfb.a.createBuilder();
        if (ajwoVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            anfb anfbVar = (anfb) aihfVarCreateBuilder.instance;
            anfbVar.e = ajwoVar;
            anfbVar.b |= 1;
        }
        return zls.b((anfb) aihfVarCreateBuilder.build());
    }

    public static String z(amzy amzyVar) {
        return zls.a(amzyVar.toByteArray());
    }

    public final him K(him himVar) {
        him himVarA = himVar.a();
        if (himVarA != null) {
            return himVarA.g() == null ? K(himVarA) : himVarA;
        }
        ((agrc) hht.a.b().k("com/google/android/apps/youtube/music/mediabrowser/content/InteractionLogger$Companion", "getFirstScreenEligibleParent", 584, "InteractionLogger.kt")).t("There should always be a root page.");
        return null;
    }

    public hmy(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }
}
