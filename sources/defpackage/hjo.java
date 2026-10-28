package defpackage;

import android.os.Bundle;
import android.util.Pair;
import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hjo {
    private static final agrf e = agrf.h("com/google/android/apps/youtube/music/mediabrowser/results/SearchResult");
    public final String a;
    public final zot b;
    public final amzo c;
    public final zne d;
    private final mbc f;
    private final bra g;
    private final Object h;
    private final Instant i;
    private final xir j;
    private List k;

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:20:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cb  */
    public hjo(mbc mbcVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3, String str, bra braVar, Bundle bundle, brf brfVar) {
        zne zneVarA;
        Pair pair;
        Pair pair2;
        zne zneVarA2;
        mbcVar.getClass();
        aunnVar.getClass();
        aunnVar2.getClass();
        aunnVar3.getClass();
        this.f = mbcVar;
        this.a = str;
        this.g = braVar;
        this.h = new Object();
        Instant instantF = mbcVar.f();
        instantF.getClass();
        this.i = instantF;
        xir xirVarN = ((xit) aunnVar.io()).n(80);
        xirVarN.f(tau.MEDIA_BROWSER_SEARCH_STARTED);
        this.j = xirVarN;
        if (brfVar != null && zik.aP(brfVar.a())) {
            pair = new Pair(zik.aO(brfVar.a()), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_CURRENT_BROWSER_INFO);
        } else if (bundle == null || !bundle.containsKey("com.google.android.apps.youtube.music.mediabrowser.caller_package_name")) {
            zneVarA = ((hfy) aunnVar2.io()).a();
            zneVarA.getClass();
            if (zneVarA.h()) {
                pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
            } else {
                pair2 = new Pair(zik.aO(zneVarA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT);
                pair = pair2;
            }
        } else {
            String string = bundle.getString("com.google.android.apps.youtube.music.mediabrowser.caller_package_name");
            string = string == null ? "" : string;
            if (zik.aP(string)) {
                pair2 = new Pair(zik.aO(string), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_BUNDLE);
            } else {
                zneVarA = ((hfy) aunnVar2.io()).a();
                zneVarA.getClass();
                if (zneVarA.h()) {
                    pair2 = new Pair(zik.aO(zneVarA.b), amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_LAST_CONNECTED_BROWSE_CLIENT);
                } else {
                    pair = new Pair(zol.a, amzo.MEDIA_BROWSER_PACKAGE_NAME_SOURCE_NONE);
                }
            }
            pair = pair2;
        }
        Object obj = pair.first;
        obj.getClass();
        zot zotVar = (zot) obj;
        this.b = zotVar;
        Object obj2 = pair.second;
        obj2.getClass();
        amzo amzoVar = (amzo) obj2;
        this.c = amzoVar;
        if (zotVar.b()) {
            zneVarA2 = ((hfy) aunnVar2.io()).a();
            zneVarA2.getClass();
        } else {
            zneVarA2 = ((hef) aunnVar3.io()).b(zotVar, bundle);
            if (zneVarA2.h()) {
                zneVarA2 = ((hfy) aunnVar2.io()).a();
                zneVarA2.getClass();
            }
        }
        zne zneVar = zneVarA2;
        this.d = zneVar;
        xirVarN.h(hgm.g(80, zotVar, amzoVar, zneVar, null, null));
    }

    public final void a(tau tauVar) {
        this.j.f(tauVar);
    }

    public final void b(List list) {
        synchronized (this.h) {
            if (this.k == null) {
                this.g.c(list);
                a(tau.MEDIA_BROWSER_SEARCH_COMPLETED);
                Duration durationBetween = Duration.between(this.i, this.f.f());
                durationBetween.getClass();
                durationBetween.toMillis();
                hgm.f(list);
                this.k = list;
            } else {
                ((agrc) e.c().k("com/google/android/apps/youtube/music/mediabrowser/results/SearchResult", "sendResult$<anonymous>", 163, "SearchResult.kt")).t("MBS: SearchResult.sendResult() called multiple times.");
                a(tau.MEDIA_BROWSER_SEARCH_COMPLETED);
            }
        }
    }
}
