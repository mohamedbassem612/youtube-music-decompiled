package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class avwa extends AtomicReference implements Runnable, avni {
    private static final long serialVersionUID = -4552101107598366241L;
    final avwc a;
    avmn b;
    long c;
    boolean d;
    boolean e;

    public avwa(avwc avwcVar) {
        this.a = avwcVar;
    }

    @Override // defpackage.avni
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avmn avmnVar = (avmn) obj;
        avnr.g(this, avmnVar);
        avwc avwcVar = this.a;
        synchronized (avwcVar) {
            if (this.e) {
                ((avnu) avwcVar.b).kr(avmnVar);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this);
    }
}
