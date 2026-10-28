package defpackage;

import android.util.Pair;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aajq implements sxu {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public aajq(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj2;
        this.b = obj;
    }

    @Override // defpackage.sxu
    public final /* synthetic */ void b(Object obj, Object obj2) {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                abpj abpjVar = (abpj) this.b;
                abpjVar.f = null;
                abpjVar.h((wjf) obj2, abpjVar.k, null);
                return;
            }
            xvk xvkVar = (xvk) obj2;
            ((yar) this.b).g(xvkVar);
            ((syh) this.a).b((xwc) obj, xvkVar);
            return;
        }
        Pair pair = (Pair) obj2;
        if (pair != null) {
            if (pair.first != null) {
                Object obj3 = this.b;
                aamh aamhVar = (aamh) pair.first;
                if (aamhVar == null) {
                    throw new NullPointerException("Null offlinePlaylist");
                }
                ((aajr) obj3).c.kk(new aajb(aamhVar, null));
            }
            for (aamo aamoVar : (List) pair.second) {
                Object obj4 = this.b;
                acom acomVar = new acom();
                acomVar.b(aamoVar);
                ((aajr) obj4).c.kk(acomVar.a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, wjf] */
    @Override // defpackage.sxu
    public final /* synthetic */ void iT(Object obj, Exception exc) {
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) ((agrc) aajr.a.b()).j(exc)).k("com/google/android/libraries/youtube/offline/features/appsearch/indexing/DefaultAppSearchIncrementalIndexer$1", "onError", 165, "DefaultAppSearchIncrementalIndexer.java")).w("Error on calling getPlaylistAndVideos for playlistId: %s", ((aahj) this.a).a);
            return;
        }
        if (i == 1) {
            ((syh) this.a).iT((xwc) obj, exc);
            return;
        }
        abpj abpjVar = (abpj) this.b;
        abpjVar.f = null;
        String strG = this.a.G();
        abpjVar.m = null;
        abvr abvrVar = abpjVar.q;
        if (abvrVar != null) {
            abvrVar.g.g(new aboe(4, true, 1, abpjVar.c.b(exc), exc, strG, null, null));
        }
    }
}
