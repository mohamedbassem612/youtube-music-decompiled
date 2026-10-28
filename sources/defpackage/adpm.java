package defpackage;

import app.rive.ImageAsset;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class adpm implements awqg {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ adpm(int i, hik hikVar, hjn hjnVar, znf znfVar, int i2) {
        this.$cid = i2;
        this.a = i;
        this.b = hikVar;
        this.c = hjnVar;
        this.d = znfVar;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) {
        if (this.$cid == 0) {
            ImageAsset imageAsset = (ImageAsset) obj;
            imageAsset.getClass();
            awqm awqmVar = ((adps) this.b).j;
            if (awqmVar != null) {
                awqmVar.a(this.c, Integer.valueOf(this.a), this.d, imageAsset);
            }
            return awmy.a;
        }
        Throwable th = (Throwable) obj;
        th.getClass();
        int i = this.a;
        Object obj2 = this.c;
        if (i >= 3) {
            Object obj3 = this.d;
            ((hjn) obj2).b(tau.MEDIA_BROWSER_GET_CHILDREN_REQUEST_FAILED);
            ((agrc) ((agrc) hik.a.c()).j(th).k("com/google/android/apps/youtube/music/mediabrowser/content/MediaClientContentSupplier", "fetchAndIngestChildrenFromMbfe$<anonymous>", 454, "MediaClientContentSupplier.kt")).w("GetMediaItemChildrenRequest failed for parentId=%s", ((znf) obj3).l);
            return ahng.m(th);
        }
        Object obj4 = this.b;
        ReentrantLock reentrantLock = ((hik) obj4).r;
        reentrantLock.lock();
        try {
            return ((hik) obj4).d((hjn) obj2, i + 1);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ adpm(adps adpsVar, String str, int i, String str2, int i2) {
        this.$cid = i2;
        this.b = adpsVar;
        this.c = str;
        this.a = i;
        this.d = str2;
    }
}
