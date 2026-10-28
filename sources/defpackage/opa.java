package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.accessibility.AccessibilityProcessor;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeImpl;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class opa {
    public final ooy a;
    public final Runnable c;
    public final rbm e;
    public long b = 0;
    public boolean d = false;

    public opa(ooy ooyVar) {
        this.a = ooyVar;
        this.c = new ooz(ooyVar, 0);
        this.e = new rbm(ooyVar);
    }

    public final void a() {
        rbm rbmVar = this.e;
        ooy ooyVar = this.a;
        rbmVar.f(ooyVar);
        this.b = 0L;
        ooyVar.removeCallbacks(this.c);
        this.d = false;
    }

    public final void b(NodeTreeProcessor nodeTreeProcessor) {
        try {
            AtomicLong atomicLong = ((NodeTreeProcessorImpl) nodeTreeProcessor).d;
            for (long j = atomicLong.get(); (j & 4611686018427387904L) == 0 && j > 0; j = atomicLong.get()) {
                if (atomicLong.compareAndSet(j, 1 + j)) {
                    try {
                        NodeTreeImpl nodeTreeImpl = new NodeTreeImpl(NodeTreeProcessorImpl.jniGetSnapshot(((NodeTreeProcessorImpl) nodeTreeProcessor).c));
                        if (((NodeTreeProcessorImpl) nodeTreeProcessor).d.decrementAndGet() == 4611686018427387904L) {
                            ((NodeTreeProcessorImpl) nodeTreeProcessor).a.z().execute(new ooz(nodeTreeProcessor, 14));
                        }
                        try {
                            ooy ooyVar = this.a;
                            Context context = ooyVar.getContext();
                            long[] jArrJniProcessAccessibility = AccessibilityProcessor.jniProcessAccessibility(nodeTreeImpl.a);
                            grj grjVar = new grj(jArrJniProcessAccessibility == null ? asvd.a : new asvf(ksy.aB(jArrJniProcessAccessibility[1], asve.a, jArrJniProcessAccessibility[0])));
                            this.e.g(ooyVar, new opr(context, ooyVar, grjVar.n("65535"), grjVar));
                            nodeTreeImpl.close();
                            return;
                        } catch (Throwable th) {
                            try {
                                nodeTreeImpl.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (((NodeTreeProcessorImpl) nodeTreeProcessor).d.decrementAndGet() == 4611686018427387904L) {
                            ((NodeTreeProcessorImpl) nodeTreeProcessor).a.z().execute(new ooz(nodeTreeProcessor, 14));
                        }
                        throw th3;
                    }
                }
            }
            throw new opk();
        } catch (Exception e) {
            Log.e("ElementsViewAccessibilityApplier", "Failed to apply accessibility", e);
        }
    }
}
