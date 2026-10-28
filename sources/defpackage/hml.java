package defpackage;

import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hml implements aaui {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public hml(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [aaui, java.lang.Object] */
    @Override // defpackage.aaui
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            Object obj = this.a;
            ((hmm) obj).g.a(ixt.A());
            return;
        }
        if (i == 1) {
            this.a.run();
            return;
        }
        if (i == 2) {
            hmt hmtVar = (hmt) this.a;
            hmtVar.k.c(hmtVar.m.d());
            return;
        }
        if (i == 3) {
            this.a.a();
            return;
        }
        if (i != 4) {
            Object obj2 = this.a;
            if (i != 5) {
                hmp hmpVar = (hmp) obj2;
                hmpVar.a.c(hmpVar.b);
                return;
            } else {
                hmp hmpVar2 = (hmp) obj2;
                hmpVar2.a.c(hmpVar2.b);
                return;
            }
        }
        mqd mqdVar = (mqd) this.a;
        hmm hmmVar = (hmm) mqdVar.b;
        if (!hmmVar.n.i()) {
            hmmVar.e.a();
            return;
        }
        huf hufVar = hmmVar.h;
        Object obj3 = mqdVar.a;
        if (hufVar.k((String) obj3, hmmVar.o.b(), true, hmmVar.i.intValue())) {
            hmmVar.j.b(R.string.sync_playlist_start);
        }
    }
}
