package defpackage;

import app.rive.semantics.SemanticState;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rik {
    public final Object a;
    public int b;

    public rik(int i, qcb qcbVar) {
        this.a = new WeakReference(qcbVar);
        this.b = i;
    }

    final void a() {
        synchronized (this.a) {
        }
    }

    public final long b(cvj cvjVar) {
        int i;
        bwb bwbVar = (bwb) this.a;
        cvb cvbVar = (cvb) cvjVar;
        int i2 = 0;
        cvbVar.n(bwbVar.b, 0, 1, false);
        int i3 = bwbVar.b[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = SemanticState.Focused;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        cvbVar.n(bwbVar.b, 1, i5, false);
        while (i2 < i5) {
            i2++;
            i6 = (i6 << 8) + (bwbVar.b[i2] & 255);
        }
        this.b += i;
        return i6;
    }

    public final boolean c(qcb qcbVar) {
        return qcbVar != null && ((WeakReference) this.a).get() == qcbVar;
    }

    public rik(char[] cArr) {
        this.a = new ReentrantLock();
    }

    public rik() {
        this.a = new Object();
    }

    public rik(byte[] bArr) {
        this.a = new bwb(8);
    }
}
