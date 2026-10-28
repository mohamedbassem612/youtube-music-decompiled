package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vxu {
    public final avmc a;
    public final wll b;
    private final avmc c;
    private final ListenableFuture d = ape.f(new tzc(this, 2));
    private volatile ajvu e;
    private volatile ajbd f;

    public vxu(avmc avmcVar, avmc avmcVar2, wll wllVar) {
        this.a = avmcVar.w(new vup(15));
        this.c = avmcVar2.w(new vup(16));
        this.b = wllVar;
    }

    public final ListenableFuture a() {
        return ahng.o(this.d);
    }

    public final ajbd b() {
        if (this.f == null) {
            avmc avmcVar = this.c;
            synchronized (avmcVar) {
                if (this.f == null) {
                    this.f = (ajbd) avmcVar.E();
                }
            }
        }
        return this.f;
    }

    public final ajvu c() {
        return this.e == null ? d() : this.e;
    }

    public final ajvu d() {
        avmc avmcVar = this.a;
        synchronized (avmcVar) {
            if (this.e == null) {
                this.e = (ajvu) avmcVar.E();
            }
        }
        return this.e;
    }

    public final String e() {
        return this.b.g.a;
    }
}
