package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.music.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jgc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public jgc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.k = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.l = awmdVar7;
        awmdVar8.getClass();
        this.e = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.h = awmdVar11;
        awmdVar12.getClass();
        this.c = awmdVar12;
    }

    public static String g(String str) {
        return hmy.y(s(null, str, true, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture m(boolean z) {
        ListenableFuture listenableFutureD;
        Object obj = this.b;
        if (z) {
            listenableFutureD = ((hps) obj).a(kro.aq());
        } else {
            listenableFutureD = ((hps) obj).d(kro.aq());
        }
        return afxd.f(listenableFutureD).h(new hoy(this, z, 5), this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture n(final boolean z, final Function function) {
        ListenableFuture listenableFutureD;
        Object obj = this.b;
        if (z) {
            listenableFutureD = ((hps) obj).a(kro.aq());
        } else {
            listenableFutureD = ((hps) obj).d(kro.aq());
        }
        return afxd.f(listenableFutureD).h(new ahcy() { // from class: htb
            @Override // defpackage.ahcy
            public final ListenableFuture a(Object obj2) {
                Optional optional = (Optional) obj2;
                if (optional.isEmpty()) {
                    return ahng.n(agpi.a);
                }
                Function function2 = function;
                boolean z2 = z;
                jgc jgcVar = this.c;
                annv annvVar = (annv) optional.get();
                if (z2) {
                    return ((hps) jgcVar.b).b((List) function2.apply(annvVar));
                }
                return ((hps) jgcVar.b).c((List) function2.apply(annvVar));
            }
        }, this.i).g(new hqt(8), MoreExecutors.directExecutor());
    }

    private final ListenableFuture o(boolean z) {
        return n(z, new hsw(7));
    }

    private final ListenableFuture p(boolean z) {
        return n(z, new hsw(6));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture q(boolean z) {
        return ahno.ar(p(z), new hrk(this, 8), this.i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final ListenableFuture r(boolean z) {
        return ahno.ar(o(z), new hrk(this, 10), this.i);
    }

    private static ajwo s(String str, String str2, boolean z, boolean z2) {
        ias iasVarG = hna.g();
        iasVarG.b = str2;
        iasVarG.k(z);
        iasVarG.f(z2);
        if (!TextUtils.isEmpty(str)) {
            iasVarG.a = str;
        }
        return iasVarG.a();
    }

    private final Uri t(aqmh aqmhVar, Set set) {
        Context context = (Context) this.e;
        Optional optionalX = hmy.x(context, aqmhVar);
        if (!optionalX.isPresent()) {
            return ixt.r(context, R.drawable.playlist_empty_state);
        }
        set.add(optionalX.get());
        return (Uri) optionalX.get();
    }

    public final int a() {
        if (((vxz) this.c).l(52, 45785190L, false)) {
            return (((Context) this.e).getResources().getConfiguration().uiMode & 48) == 16 ? R.drawable.shuffle_aa_black : R.drawable.shuffle_aa_white;
        }
        return R.drawable.shuffle_aa;
    }

    public final MediaBrowserCompat$MediaItem b(boolean z, List list) {
        Context context = (Context) this.e;
        return c(z, list, context.getString(R.string.offline_songs_detail_page_title), context.getResources().getQuantityString(R.plurals.offline_playlist_size, list.size(), Integer.valueOf(list.size())), "PPSV", "offline_PPSV", false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x010f  */
    /* JADX WARN: Code duplicated, block: B:25:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Set] */
    public final MediaBrowserCompat$MediaItem c(boolean z, List list, String str, String str2, String str3, String str4, boolean z2) {
        boolean z3;
        Uri uriT;
        list.getClass();
        ahno.O(!list.isEmpty());
        Context context = (Context) this.e;
        String string = context.getResources().getString(R.string.default_media_item_desc);
        String strG = z ? g(str3) : str4;
        Bundle bundle = new Bundle();
        if (txz.g(context)) {
            z3 = false;
            if (z2) {
                uriT = ixt.r(context, ((Integer) hlz.c.get(0)).intValue());
                ajwo ajwoVarS = s(null, str3, false, false);
                ArrayList<String> arrayList = new ArrayList<>();
                aihf aihfVarCreateBuilder = amzy.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar = (amzy) aihfVarCreateBuilder.instance;
                ajwoVarS.getClass();
                amzyVar.d = ajwoVarS;
                amzyVar.b |= 2;
                aihh aihhVar = (aihh) alja.a.createBuilder();
                aliz alizVar = aliz.PLAY_ARROW;
                aihhVar.copyOnWrite();
                alja aljaVar = (alja) aihhVar.instance;
                aljaVar.c = alizVar.yN;
                aljaVar.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar2 = (amzy) aihfVarCreateBuilder.instance;
                alja aljaVar2 = (alja) aihhVar.build();
                aljaVar2.getClass();
                amzyVar2.c = aljaVar2;
                amzyVar2.b |= 1;
                alay alayVarI = fhz.I(context, R.string.default_play_button_label);
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar3 = (amzy) aihfVarCreateBuilder.instance;
                alayVarI.getClass();
                amzyVar3.e = alayVarI;
                amzyVar3.b |= 4;
                arrayList.add(hmy.z((amzy) aihfVarCreateBuilder.build()));
                bundle.putStringArrayList("com.google.android.apps.youtube.music.mediabrowser.custom_actions", arrayList);
            }
            if (!txz.g(context)) {
                bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            }
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
            return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strG, str, str2, string, null, uriT, bundle, null), true == z ? 2 : 1);
        }
        z3 = z2;
        Optional optionalFindFirst = Collection.EL.stream(list).filter(new hod(19)).findFirst();
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = Optional.ofNullable(((anyx) optionalFindFirst.get()).getThumbnailDetails());
        }
        uriT = optionalFindFirst.isPresent() ? t((aqmh) optionalFindFirst.get(), this.h) : ixt.r(context, R.drawable.empty_state_cover_square);
        if (z3) {
            if (!txz.g(context)) {
                bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            }
        }
        bundle.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strG, str, str2, string, null, uriT, bundle, null), true == z ? 2 : 1);
    }

    public final MediaBrowserCompat$MediaItem d(String str, String str2, String str3, aqmh aqmhVar, Set set, String str4, String str5, boolean z, boolean z2) {
        Context context = (Context) this.e;
        ajwo ajwoVarS = s(str, (txz.g(context) || !str5.equals("PPSV")) ? str5 : "PPAD", !txz.g(context), z);
        String string = context.getResources().getString(R.string.default_media_item_desc);
        String strY = hmy.y(ajwoVarS);
        Uri uriT = (txz.g(context) && z2) ? null : t(aqmhVar, set);
        Bundle bundle = new Bundle();
        bundle.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str4);
        }
        if (txz.g(context)) {
            ArrayList<String> arrayList = new ArrayList<>();
            if (str5.equals("PPSV") || str5.equals("PPSE")) {
                amzy amzyVar = amzy.a;
                aihf aihfVarCreateBuilder = amzyVar.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar2 = (amzy) aihfVarCreateBuilder.instance;
                ajwoVarS.getClass();
                amzyVar2.d = ajwoVarS;
                amzyVar2.b |= 2;
                alja aljaVar = alja.a;
                aihh aihhVar = (aihh) aljaVar.createBuilder();
                aliz alizVar = aliz.PLAY_ARROW;
                aihhVar.copyOnWrite();
                alja aljaVar2 = (alja) aihhVar.instance;
                aljaVar2.c = alizVar.yN;
                aljaVar2.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar3 = (amzy) aihfVarCreateBuilder.instance;
                alja aljaVar3 = (alja) aihhVar.build();
                aljaVar3.getClass();
                amzyVar3.c = aljaVar3;
                amzyVar3.b |= 1;
                alay alayVarI = fhz.I(context, R.string.default_play_button_label);
                aihfVarCreateBuilder.copyOnWrite();
                amzy amzyVar4 = (amzy) aihfVarCreateBuilder.instance;
                alayVarI.getClass();
                amzyVar4.e = alayVarI;
                amzyVar4.b |= 4;
                arrayList.add(hmy.z((amzy) aihfVarCreateBuilder.build()));
                aihf aihfVarCreateBuilder2 = aohd.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                aohd aohdVar = (aohd) aihfVarCreateBuilder2.instance;
                str.getClass();
                aohdVar.d = 1;
                aohdVar.e = str;
                aihfVarCreateBuilder2.copyOnWrite();
                aohd aohdVar2 = (aohd) aihfVarCreateBuilder2.instance;
                aohdVar2.f = 2;
                aohdVar2.c |= 2;
                aihh aihhVar2 = (aihh) apji.a.createBuilder();
                aihhVar2.e(aoic.a, fhz.X(context));
                apji apjiVar = (apji) aihhVar2.build();
                aihfVarCreateBuilder2.copyOnWrite();
                aohd aohdVar3 = (aohd) aihfVarCreateBuilder2.instance;
                apjiVar.getClass();
                aohdVar3.g = apjiVar;
                aohdVar3.c |= 8;
                aohd aohdVar4 = (aohd) aihfVarCreateBuilder2.build();
                aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
                aihhVar3.e(aohd.b, aohdVar4);
                ajwo ajwoVar = (ajwo) aihhVar3.build();
                aihf aihfVarCreateBuilder3 = amzyVar.createBuilder();
                aihfVarCreateBuilder3.copyOnWrite();
                amzy amzyVar5 = (amzy) aihfVarCreateBuilder3.instance;
                ajwoVar.getClass();
                amzyVar5.d = ajwoVar;
                amzyVar5.b |= 2;
                aihh aihhVar4 = (aihh) aljaVar.createBuilder();
                aliz alizVar2 = aliz.DELETE;
                aihhVar4.copyOnWrite();
                alja aljaVar4 = (alja) aihhVar4.instance;
                aljaVar4.c = alizVar2.yN;
                aljaVar4.b |= 1;
                aihfVarCreateBuilder3.copyOnWrite();
                amzy amzyVar6 = (amzy) aihfVarCreateBuilder3.instance;
                alja aljaVar5 = (alja) aihhVar4.build();
                aljaVar5.getClass();
                amzyVar6.c = aljaVar5;
                amzyVar6.b |= 1;
                alay alayVarI2 = fhz.I(context, R.string.action_remove_from_offline_songs);
                aihfVarCreateBuilder3.copyOnWrite();
                amzy amzyVar7 = (amzy) aihfVarCreateBuilder3.instance;
                alayVarI2.getClass();
                amzyVar7.e = alayVarI2;
                amzyVar7.b |= 4;
                arrayList.add(hmy.z((amzy) aihfVarCreateBuilder3.build()));
            }
            bundle.putStringArrayList("com.google.android.apps.youtube.music.mediabrowser.custom_actions", arrayList);
            if (z) {
                aihf aihfVarCreateBuilder4 = anfa.a.createBuilder();
                aihf aihfVarCreateBuilder5 = anfc.a.createBuilder();
                aihfVarCreateBuilder5.copyOnWrite();
                anfc anfcVar = (anfc) aihfVarCreateBuilder5.instance;
                anfcVar.b |= 2;
                anfcVar.d = true;
                aihfVarCreateBuilder5.copyOnWrite();
                anfc anfcVar2 = (anfc) aihfVarCreateBuilder5.instance;
                anfcVar2.b |= 1;
                anfcVar2.c = true;
                anfc anfcVar3 = (anfc) aihfVarCreateBuilder5.build();
                aihfVarCreateBuilder4.copyOnWrite();
                anfa anfaVar = (anfa) aihfVarCreateBuilder4.instance;
                anfcVar3.getClass();
                anfaVar.c = anfcVar3;
                anfaVar.b = 2;
                bundle.putString("com.google.android.apps.youtube.music.mediabrowser.display_configuration", hmy.A((anfa) aihfVarCreateBuilder4.build()));
            }
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strY, str2, str3, string, null, uriT, bundle, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture e(LinkedHashMap linkedHashMap) {
        this.j.clear();
        return ahno.aq(afwl.c(new gwj(this, linkedHashMap, 4)), this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ListenableFuture f() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        this.d.clear();
        this.h.clear();
        boolean zG = txz.g((Context) this.e);
        Object obj = this.b;
        if (!zG) {
            ListenableFuture listenableFutureA = ((hps) obj).a(kro.aq());
            hrk hrkVar = new hrk(this, 7);
            ?? r5 = this.i;
            ListenableFuture listenableFutureAr = ahno.ar(listenableFutureA, hrkVar, r5);
            ListenableFuture listenableFutureAr2 = ahno.ar(p(true), new hrk(this, 12), r5);
            afxd afxdVarG = afxd.f(m(true)).g(new hrk(this, 9), this.k);
            ListenableFuture listenableFutureAr3 = ahno.ar(o(true), new hrk(this, 11), r5);
            return ahng.j(listenableFutureAr, listenableFutureAr2, afxdVarG, listenableFutureAr3).a(afwl.j(new hog(listenableFutureAr, arrayList, listenableFutureAr2, listenableFutureAr3, map, afxdVarG, 3)), MoreExecutors.directExecutor());
        }
        if (((hps) obj).i()) {
            afxd afxdVarH = afxd.f(m(true)).h(new hqj(this, 5), this.k);
            ListenableFuture listenableFutureQ = q(true);
            ListenableFuture listenableFutureR = r(true);
            return ahng.j(afxdVarH, listenableFutureQ, listenableFutureR).a(afwl.j(new hni(afxdVarH, arrayList, map, listenableFutureQ, listenableFutureR, 6, null)), MoreExecutors.directExecutor());
        }
        afxd afxdVarG2 = afxd.f(m(false)).g(new hrk(this, 13), this.i);
        ListenableFuture listenableFutureQ2 = q(false);
        ListenableFuture listenableFutureR2 = r(false);
        return ahng.j(afxdVarG2, listenableFutureQ2, listenableFutureR2).a(afwl.j(new hni((ListenableFuture) afxdVarG2, (List) arrayList, listenableFutureQ2, (Map) map, listenableFutureR2, 5)), MoreExecutors.directExecutor());
    }

    public final String h(List list) {
        Iterator it = list.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((anyx) it.next()).getLengthMs().longValue() / 1000;
        }
        int i = (int) (jLongValue / 3600);
        Object obj = this.e;
        int iRound = Math.round((jLongValue - (((long) i) * 3600)) / 60.0f);
        Context context = (Context) obj;
        String quantityString = context.getResources().getQuantityString(R.plurals.music_duration_minutes, iRound, Integer.valueOf(iRound));
        if (i <= 0) {
            return quantityString;
        }
        return context.getResources().getString(R.string.duration_hours_and_minutes, context.getResources().getQuantityString(R.plurals.duration_hours, i, Integer.valueOf(i)), quantityString);
    }

    public final List i(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list.size());
        int i = 1;
        if (!arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("com.google.android.apps.youtube.music.mediabrowser.pending_downloads", arrayList);
            arrayList2.add(new Pair(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat("__NO_OP_DOWNLOADS_PROGRESS_ID__", null, null, null, null, null, bundle, null), 1), agpi.a));
        }
        Collection.EL.stream(list).filter(new hud(i)).forEach(new hfo(this, arrayList2, 14, null));
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void j(String str) {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((Context) this.e).grantUriPermission(str, (Uri) it.next(), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final void k(String str) {
        ?? r0 = this.d;
        if (r0.contains(str)) {
            return;
        }
        r0.add(str);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((Context) this.e).grantUriPermission(str, (Uri) it.next(), 1);
        }
    }

    public final MediaBrowserCompat$MediaItem l(String str, String str2, String str3, abuz abuzVar, Set set, String str4, boolean z, boolean z2) {
        ajwo ajwoVarS = s(null, str, false, false);
        ajwo ajwoVarS2 = s(null, str, true, false);
        Context context = (Context) this.e;
        String string = context.getResources().getString(R.string.default_media_item_desc);
        String strY = hmy.y(ajwoVarS);
        Uri uriT = t(abuzVar != null ? abuzVar.l() : null, set);
        Bundle bundle = new Bundle();
        bundle.putLong("android.media.extra.DOWNLOAD_STATUS", 2L);
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str4);
        }
        if (txz.g(context)) {
            ArrayList<String> arrayList = new ArrayList<>();
            amzy amzyVar = amzy.a;
            aihf aihfVarCreateBuilder = amzyVar.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            amzy amzyVar2 = (amzy) aihfVarCreateBuilder.instance;
            ajwoVarS2.getClass();
            amzyVar2.d = ajwoVarS2;
            amzyVar2.b |= 2;
            alja aljaVar = alja.a;
            aihh aihhVar = (aihh) aljaVar.createBuilder();
            aliz alizVar = aliz.SHUFFLE;
            aihhVar.copyOnWrite();
            alja aljaVar2 = (alja) aihhVar.instance;
            aljaVar2.c = alizVar.yN;
            aljaVar2.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            amzy amzyVar3 = (amzy) aihfVarCreateBuilder.instance;
            alja aljaVar3 = (alja) aihhVar.build();
            aljaVar3.getClass();
            amzyVar3.c = aljaVar3;
            amzyVar3.b |= 1;
            alay alayVarI = fhz.I(context, R.string.accessibility_music_shuffle);
            aihfVarCreateBuilder.copyOnWrite();
            amzy amzyVar4 = (amzy) aihfVarCreateBuilder.instance;
            alayVarI.getClass();
            amzyVar4.e = alayVarI;
            amzyVar4.b |= 4;
            arrayList.add(hmy.z((amzy) aihfVarCreateBuilder.build()));
            aihf aihfVarCreateBuilder2 = aofx.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            aofx aofxVar = (aofx) aihfVarCreateBuilder2.instance;
            str.getClass();
            aofxVar.c |= 1;
            aofxVar.d = str;
            aihfVarCreateBuilder2.copyOnWrite();
            aofx aofxVar2 = (aofx) aihfVarCreateBuilder2.instance;
            aofxVar2.e = 2;
            aofxVar2.c |= 2;
            aihh aihhVar2 = (aihh) apji.a.createBuilder();
            aihhVar2.e(aoic.a, fhz.X(context));
            apji apjiVar = (apji) aihhVar2.build();
            aihfVarCreateBuilder2.copyOnWrite();
            aofx aofxVar3 = (aofx) aihfVarCreateBuilder2.instance;
            apjiVar.getClass();
            aofxVar3.f = apjiVar;
            aofxVar3.c |= 8;
            aofx aofxVar4 = (aofx) aihfVarCreateBuilder2.build();
            aihh aihhVar3 = (aihh) ajwo.a.createBuilder();
            aihhVar3.e(aofx.b, aofxVar4);
            ajwo ajwoVar = (ajwo) aihhVar3.build();
            aihf aihfVarCreateBuilder3 = amzyVar.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            amzy amzyVar5 = (amzy) aihfVarCreateBuilder3.instance;
            ajwoVar.getClass();
            amzyVar5.d = ajwoVar;
            amzyVar5.b |= 2;
            aihh aihhVar4 = (aihh) aljaVar.createBuilder();
            aliz alizVar2 = aliz.DELETE;
            aihhVar4.copyOnWrite();
            alja aljaVar4 = (alja) aihhVar4.instance;
            aljaVar4.c = alizVar2.yN;
            aljaVar4.b |= 1;
            aihfVarCreateBuilder3.copyOnWrite();
            amzy amzyVar6 = (amzy) aihfVarCreateBuilder3.instance;
            alja aljaVar5 = (alja) aihhVar4.build();
            aljaVar5.getClass();
            amzyVar6.c = aljaVar5;
            amzyVar6.b |= 1;
            alay alayVarI2 = fhz.I(context, R.string.action_remove_playlist_from_offline);
            aihfVarCreateBuilder3.copyOnWrite();
            amzy amzyVar7 = (amzy) aihfVarCreateBuilder3.instance;
            alayVarI2.getClass();
            amzyVar7.e = alayVarI2;
            amzyVar7.b |= 4;
            arrayList.add(hmy.z((amzy) aihfVarCreateBuilder3.build()));
            bundle.putStringArrayList("com.google.android.apps.youtube.music.mediabrowser.custom_actions", arrayList);
        }
        if (txz.g(context)) {
            if (z) {
                return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strY, str2, str3, string, null, uriT, bundle, null), 3);
            }
        } else if (z && z2) {
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
            return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strY, str2, str3, string, null, uriT, bundle, null), 1);
        }
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(strY, str2, str3, string, null, uriT, bundle, null), 2);
    }

    public jgc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, byte[] bArr, byte[] bArr2) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.k = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.l = awmdVar7;
        awmdVar8.getClass();
        this.e = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.h = awmdVar11;
        awmdVar12.getClass();
        this.c = awmdVar12;
    }

    public jgc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, char[] cArr) {
        this.b = awmdVar;
        awmdVar2.getClass();
        this.i = awmdVar2;
        awmdVar3.getClass();
        this.f = awmdVar3;
        awmdVar4.getClass();
        this.a = awmdVar4;
        awmdVar5.getClass();
        this.k = awmdVar5;
        awmdVar6.getClass();
        this.g = awmdVar6;
        awmdVar7.getClass();
        this.l = awmdVar7;
        awmdVar8.getClass();
        this.e = awmdVar8;
        awmdVar9.getClass();
        this.d = awmdVar9;
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.h = awmdVar11;
        awmdVar12.getClass();
        this.c = awmdVar12;
    }

    public jgc(Context context, hps hpsVar, hpb hpbVar, Executor executor, Executor executor2, hbf hbfVar, vxz vxzVar, rmw rmwVar) {
        this.e = context;
        this.b = hpsVar;
        this.f = hpbVar;
        this.i = executor;
        this.k = executor2;
        this.l = hbfVar;
        this.c = vxzVar;
        this.g = rmwVar;
        this.a = new hlg(3, true, vxzVar);
        this.d = ConcurrentHashMap.newKeySet();
        this.h = ConcurrentHashMap.newKeySet();
        this.j = ConcurrentHashMap.newKeySet();
    }

    public jgc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, byte[] bArr) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.f = awmdVar2;
        awmdVar3.getClass();
        this.e = awmdVar3;
        this.g = awmdVar4;
        this.h = awmdVar5;
        this.c = awmdVar6;
        this.i = awmdVar7;
        this.b = awmdVar8;
        this.j = awmdVar9;
        this.d = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
    }

    public jgc(awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12) {
        awmdVar.getClass();
        this.a = awmdVar;
        awmdVar2.getClass();
        this.b = awmdVar2;
        this.c = awmdVar3;
        this.d = awmdVar4;
        this.e = awmdVar5;
        awmdVar6.getClass();
        this.f = awmdVar6;
        this.g = awmdVar7;
        this.h = awmdVar8;
        this.i = awmdVar9;
        this.j = awmdVar10;
        awmdVar11.getClass();
        this.k = awmdVar11;
        awmdVar12.getClass();
        this.l = awmdVar12;
    }
}
