package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class axax extends axbg {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.axbg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(axaw.a);
        return true;
    }

    @Override // defpackage.axbg
    public final /* bridge */ /* synthetic */ awoq[] b(Object obj) {
        this.a.set(null);
        return axbf.a;
    }
}
