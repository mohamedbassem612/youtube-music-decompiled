package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rbn {
    private final Object a = new Object();
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public rbn() {
        Optional.empty();
    }

    public final void a() {
        synchronized (this.a) {
            this.c++;
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.d++;
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.e++;
        }
    }

    public final void d(Duration duration) {
        synchronized (this.a) {
            this.b++;
            Optional.of(duration);
        }
    }
}
