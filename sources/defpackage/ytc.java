package defpackage;

import com.google.android.libraries.youtube.media.interfaces.OnesieFetcher;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ytc implements ysz {
    private final OnesieFetcher a;
    private final ytb b;

    public ytc(OnesieFetcher onesieFetcher, avlh avlhVar, avlh avlhVar2, avmb avmbVar, long j, ytb ytbVar) {
        onesieFetcher.getClass();
        avlhVar.getClass();
        avlhVar2.getClass();
        avmbVar.getClass();
        this.a = onesieFetcher;
        this.b = ytbVar;
        ytbVar.a.e(avlhVar2.p().m(j, TimeUnit.MILLISECONDS, avmbVar).x(new wsh(new yta(0), 3)).ak(new xul(new yrc(this, 4), 19)), avlhVar.p().m(j, TimeUnit.MILLISECONDS, avmbVar).x(new wsh(new yta(2), 4)).ak(new xul(new yrc(this, 5), 20)));
    }

    @Override // defpackage.ysz
    public final void a() {
        this.b.a.dispose();
        synchronized (zik.class) {
            this.a.cancelFetch();
        }
    }

    @Override // defpackage.ysz
    public final void b(byi byiVar) {
        byiVar.getClass();
        zkf.a(false);
    }

    public final void c() {
        synchronized (zik.class) {
            this.a.onNetworkConnected();
        }
    }
}
