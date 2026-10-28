package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqo implements qqy {
    public final qqn a;
    private final qqm b;
    private final long c;
    private long d;

    public qqo(qqn qqnVar, qqm qqmVar, long j, TimeUnit timeUnit) {
        this.a = qqnVar;
        this.b = qqmVar;
        this.c = timeUnit.toMillis(j);
        this.d = qqmVar.a();
    }

    @Override // defpackage.qqy
    public final void a(int i) {
        qqn qqnVar = this.a;
        qqnVar.a(i);
        qqm qqmVar = this.b;
        if (qqmVar.a() - this.d >= this.c) {
            qqnVar.b();
            this.d = qqmVar.a();
        }
    }

    @Override // defpackage.qqy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b();
    }
}
