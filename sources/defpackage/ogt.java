package defpackage;

import android.view.Choreographer;
import j$.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ogt implements Choreographer.FrameCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ ogt(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        mbc mbcVar;
        int i = this.$cid;
        if (i == 0) {
            ((ogu) this.a).a(j);
            return;
        }
        ?? r4 = this.a;
        if (i == 1) {
            r4.run();
            return;
        }
        aeqq aeqqVar = (aeqq) r4;
        aeqqVar.a = false;
        if (aeqqVar.g) {
            if (aeqqVar.i) {
                aeqqVar.d();
            }
            int i2 = aeqqVar.c;
            if (i2 > 0) {
                long j2 = aeqqVar.d;
                if (j2 > 0) {
                    aeqqVar.h++;
                    if (ThreadLocalRandom.current().nextInt(i2) == 0) {
                        if (aeqqVar.k == 2 && (mbcVar = aeqqVar.j) != null) {
                            while (mbcVar.b() < mbcVar.b() + j2) {
                            }
                        } else {
                            try {
                                Thread.sleep(j2);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        }
    }
}
