package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awio extends AtomicBoolean implements Runnable, avmn {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable a;

    public awio(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        lazySet(true);
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
            lazySet(true);
        }
    }
}
