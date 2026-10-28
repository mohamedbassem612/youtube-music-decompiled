package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hiv {
    public static final Duration a = Duration.ofDays(1);
    public static final Duration b = Duration.ofDays(7);
    public static final Duration c = Duration.ofDays(30);
    public static final agrf d = agrf.h("com/google/android/apps/youtube/music/mediabrowser/content/RemoteContentFetcher");
    public ListenableFuture A;
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
    public final aunn q;
    public final awmd r;
    public final aunn s;
    public final aunn t;
    public final aunn u;
    public final aunn v;
    public final aunn w;
    public final aunn x;
    public final ConcurrentHashMap y = new ConcurrentHashMap();
    public String z;

    public hiv(aunn aunnVar, aunn aunnVar2, aunn aunnVar3, aunn aunnVar4, aunn aunnVar5, aunn aunnVar6, aunn aunnVar7, aunn aunnVar8, aunn aunnVar9, aunn aunnVar10, aunn aunnVar11, aunn aunnVar12, aunn aunnVar13, awmd awmdVar, aunn aunnVar14, aunn aunnVar15, aunn aunnVar16, aunn aunnVar17, aunn aunnVar18, aunn aunnVar19) {
        this.e = aunnVar;
        this.f = aunnVar2;
        this.g = aunnVar3;
        this.h = aunnVar4;
        this.i = aunnVar5;
        this.j = aunnVar6;
        this.k = aunnVar7;
        this.l = aunnVar8;
        this.m = aunnVar9;
        this.n = aunnVar10;
        this.o = aunnVar11;
        this.p = aunnVar12;
        this.q = aunnVar13;
        this.r = awmdVar;
        this.s = aunnVar14;
        this.t = aunnVar15;
        this.u = aunnVar16;
        this.v = aunnVar17;
        this.w = aunnVar18;
        this.x = aunnVar19;
    }

    public final hev a(hjn hjnVar) {
        Bundle bundle;
        Bundle bundle2 = hjnVar.c;
        if (bundle2 == null) {
            bundle = null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putAll(bundle2);
            bundle = bundle3;
        }
        String str = hjnVar.f;
        zne zneVar = hjnVar.i;
        bundle.getClass();
        return b(zneVar, str, bundle);
    }

    public final hev b(zne zneVar, String str, Bundle bundle) {
        hev hevVarJ = ((wqm) this.g.io()).j();
        hevVarJ.d(zneVar, str);
        if (bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.force_refresh")) {
            hevVarJ.A = true == bundle.getBoolean("com.google.android.apps.youtube.music.mediabrowser.force_refresh") ? 2 : 3;
            bundle.remove("com.google.android.apps.youtube.music.mediabrowser.force_refresh");
        } else {
            hevVarJ.A = 3;
        }
        Collection.EL.stream(bundle.keySet()).limit(10L).forEach(new hfo(hevVarJ, bundle, 4));
        if (bundle.keySet().size() > 10) {
            String.format(Locale.US, "MBS: Request bundle size too large for client %s with size %d", zneVar, Integer.valueOf(bundle.keySet().size()));
        }
        if (bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.extra_contextual_signals")) {
            ArrayList arrayListC = c(bundle);
            hir hirVar = (hir) this.f.io();
            synchronized (hirVar.d) {
                hirVar.i.put(zneVar, arrayListC);
            }
            if (!arrayListC.isEmpty()) {
                hevVarJ.a = arrayListC;
            }
        } else {
            hir hirVar2 = (hir) this.f.io();
            synchronized (hirVar2.d) {
                Map map = hirVar2.i;
                if (map.containsKey(zneVar)) {
                    map.put(zneVar, new ArrayList());
                }
            }
        }
        return hevVarJ;
    }

    final ArrayList c(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.google.android.apps.youtube.music.mediabrowser.extra_contextual_signals");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return new ArrayList();
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            List listH = agfm.b(':').h(str);
            if (listH.size() != 2) {
                ((agrc) ((agrc) d.c()).k("com/google/android/apps/youtube/music/mediabrowser/content/RemoteContentFetcher", "computeContextualSignals", 329, "RemoteContentFetcher.java")).w("Received an invalid contextual signal: %s", str);
            } else {
                try {
                    boolean z = Integer.parseInt((String) listH.get(1)) != 0;
                    aihf aihfVarCreateBuilder = amzn.a.createBuilder();
                    String str2 = (String) listH.get(0);
                    aihfVarCreateBuilder.copyOnWrite();
                    amzn amznVar = (amzn) aihfVarCreateBuilder.instance;
                    str2.getClass();
                    amznVar.b |= 1;
                    amznVar.c = str2;
                    aihfVarCreateBuilder.copyOnWrite();
                    amzn amznVar2 = (amzn) aihfVarCreateBuilder.instance;
                    amznVar2.b |= 2;
                    amznVar2.d = z;
                    arrayList.add((amzn) aihfVarCreateBuilder.build());
                } catch (NumberFormatException e) {
                    ((agrc) ((agrc) ((agrc) d.c()).j(e)).k("com/google/android/apps/youtube/music/mediabrowser/content/RemoteContentFetcher", "computeContextualSignals", (char) 340, "RemoteContentFetcher.java")).w("Received an invalid contextual signal: %s", str);
                }
            }
        }
        return arrayList;
    }
}
