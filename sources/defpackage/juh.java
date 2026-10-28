package defpackage;

import android.util.LruCache;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class juh extends LruCache {
    final /* synthetic */ jui a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juh(jui juiVar, int i) {
        super(i);
        this.a = juiVar;
    }

    protected final void a(String str, aeiv aeivVar) {
        zhq zhqVar = zhq.ABR;
        try {
            ixe ixeVar = new ixe(aeivVar.b, 19);
            jui juiVar = this.a;
            ahng.q(ixeVar, juiVar.c).get(juiVar.a.s(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zhr.c(zhq.CODEC_REUSE, e, "Interrupted while releasing codec %s.", str);
            Thread.currentThread().interrupt();
            this.a.d.c(e);
        } catch (ExecutionException e2) {
            e = e2;
            zhr.c(zhq.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.d.c(e);
        } catch (TimeoutException e3) {
            e = e3;
            zhr.c(zhq.CODEC_REUSE, e, "Failed while releasing codec %s.", str);
            this.a.d.c(e);
        }
    }

    @Override // android.util.LruCache
    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a((String) obj, (aeiv) obj2);
    }
}
