package defpackage;

import com.google.android.libraries.multiplatform.elements.ElementsRetainedState;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import com.google.android.libraries.multiplatform.elements.runtime.RenderNextCrashReporter;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ovr implements Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ NodeTreeProcessorImpl a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ElementsRetainedState d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ovr(NodeTreeProcessorImpl nodeTreeProcessorImpl, Object obj, int i, int i2, ElementsRetainedState elementsRetainedState, long j, boolean z, int i3) {
        this.$cid = i3;
        this.a = nodeTreeProcessorImpl;
        this.g = obj;
        this.b = i;
        this.c = i2;
        this.d = elementsRetainedState;
        this.e = j;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid == 0) {
            boolean z = this.f;
            long j = this.e;
            ElementsRetainedState elementsRetainedState = this.d;
            int i = this.c;
            this.a.R((atgg) this.g, this.b, i, elementsRetainedState, j, z);
            return;
        }
        NodeTreeProcessorImpl nodeTreeProcessorImpl = this.a;
        boolean z2 = this.f;
        long j2 = this.e;
        ElementsRetainedState elementsRetainedState2 = this.d;
        int i2 = this.c;
        int i3 = this.b;
        AtomicLong atomicLong = nodeTreeProcessorImpl.d;
        for (long j3 = atomicLong.get(); (j3 & 4611686018427387904L) == 0 && j3 > 0; j3 = atomicLong.get()) {
            if (atomicLong.compareAndSet(j3, 1 + j3)) {
                try {
                    ElementsRetainedState elementsRetainedState3 = (ElementsRetainedState) nodeTreeProcessorImpl.g.getAndSet(elementsRetainedState2);
                    if (elementsRetainedState3 != elementsRetainedState2) {
                        nodeTreeProcessorImpl.L(elementsRetainedState3);
                    }
                    boolean zO = nodeTreeProcessorImpl.O(i3, i2, j2);
                    Object obj = this.g;
                    if (zO) {
                        NodeTreeProcessorImpl.jniSetElementAndDimensions(nodeTreeProcessorImpl.c, (byte[]) obj, elementsRetainedState2.a(), i3, i2, z2);
                        nodeTreeProcessorImpl.K(j2);
                    } else {
                        NodeTreeProcessorImpl.jniSetElement(nodeTreeProcessorImpl.c, (byte[]) obj, elementsRetainedState2.a());
                    }
                    if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                        nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, 14));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    try {
                        nodeTreeProcessorImpl.a.n().c(aslh.LOG_TYPE_INTERNAL_ERROR, NodeTreeProcessorImpl.jniGetRichDiagnostics(), th);
                        RenderNextCrashReporter.interceptFatalCrash(th);
                        throw th;
                    } catch (Throwable th2) {
                        if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                            nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, 14));
                        }
                        throw th2;
                    }
                }
            }
        }
    }
}
