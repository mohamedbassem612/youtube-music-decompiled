package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awgk extends AtomicBoolean implements avmn {
    private static final long serialVersionUID = 7514387411091976596L;
    final avmd a;
    final awgl b;

    public awgk(avmd avmdVar, awgl awglVar) {
        this.a = avmdVar;
        this.b = awglVar;
    }

    @Override // defpackage.avmn
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.b.I(this);
        }
    }

    @Override // defpackage.avmn
    public final boolean f() {
        return get();
    }
}
