package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.runtime.NodeTreeProcessorImpl;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ulc implements Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;

    public /* synthetic */ ulc(int i, int i2) {
        this.$cid = i2;
        this.a = i;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void r(Object obj) {
        long jDecrementAndGet;
        int i = this.$cid;
        int i2 = 3;
        if (i == 0) {
            ulh ulhVar = (ulh) obj;
            agrf agrfVar = uld.a;
            int i3 = this.a - 1;
            if (i3 == 0) {
                i2 = 1;
            } else if (i3 != 1) {
                i2 = i3 != 2 ? 4 : 2;
            }
            ulhVar.f(i2);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                final int i4 = this.a;
                tym.h((View) obj, new tyh() { // from class: uos
                    @Override // defpackage.tyh
                    public final boolean a(ViewGroup.LayoutParams layoutParams) {
                        ((asb) layoutParams).width = i4;
                        return true;
                    }
                }, asb.class);
                return;
            } else if (i != 3) {
                ((urc) obj).s(this.a);
                return;
            } else {
                ((View) obj).setTranslationY(this.a);
                return;
            }
        }
        NodeTreeProcessorImpl nodeTreeProcessorImpl = (NodeTreeProcessorImpl) obj;
        AtomicLong atomicLong = nodeTreeProcessorImpl.d;
        long j = atomicLong.get();
        while (true) {
            if ((j & 4611686018427387904L) != 0 || j <= 0) {
                return;
            }
            if (atomicLong.compareAndSet(j, 1 + j)) {
                try {
                    NodeTreeProcessorImpl.jniSetColorContrastMode(nodeTreeProcessorImpl.c, this.a - 1);
                    if (jDecrementAndGet == j) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (nodeTreeProcessorImpl.d.decrementAndGet() == 4611686018427387904L) {
                        nodeTreeProcessorImpl.a.z().execute(new ooz(nodeTreeProcessorImpl, 14));
                    }
                }
            }
            j = atomicLong.get();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return Consumer$CC.$default$andThen(this, consumer);
        }
        if (i != 2) {
            return i != 3 ? Consumer$CC.$default$andThen(this, consumer) : Consumer$CC.$default$andThen(this, consumer);
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
