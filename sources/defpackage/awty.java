package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awty extends awtt implements awxa {
    public final Thread b;
    public final awvo c;

    public awty(awou awouVar, Thread thread, awvo awvoVar) {
        super(awouVar, true, true);
        this.b = thread;
        this.c = awvoVar;
    }

    @Override // defpackage.awph
    public final /* bridge */ awph getCallerFrame() {
        int i;
        if (!awxc.a || kI()) {
            return null;
        }
        List listAL = atqq.aL(this.b.getStackTrace());
        if (kI()) {
            return null;
        }
        Iterator it = listAL.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (avkz.u((StackTraceElement) it.next())) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return null;
        }
        int size = listAL.size();
        do {
            i2++;
            if (i2 < size) {
            }
            return avkz.t(listAL, i);
        } while (avkz.u((StackTraceElement) listAL.get(i2)));
        i = i2;
        return avkz.t(listAL, i);
    }

    @Override // defpackage.awph
    public final /* bridge */ StackTraceElement getStackTraceElement() {
        return awxb.a(this);
    }

    @Override // defpackage.awwk
    protected final boolean k() {
        return true;
    }

    @Override // defpackage.awwk
    protected final void kH(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.b;
        if (awrc.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }

    @Override // defpackage.awxd
    public final /* bridge */ StackTraceElement kz() {
        return awxc.e;
    }
}
