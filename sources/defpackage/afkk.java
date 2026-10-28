package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afkk implements Runnable {
    final List a = new ArrayList();
    Runnable b;

    @Override // java.lang.Runnable
    public final void run() {
        qpj.c();
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
