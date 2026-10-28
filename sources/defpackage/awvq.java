package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awvq extends awvr {
    private final Runnable a;

    public awvq(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.awvr
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
