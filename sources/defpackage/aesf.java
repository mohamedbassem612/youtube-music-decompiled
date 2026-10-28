package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aesf {
    public long b;
    public final tqv e;
    public long a = -1;
    public long c = -1;
    public Queue d = new ArrayDeque();
    public int f = 1;
    public int g = 1;

    public aesf(long j, tqv tqvVar) {
        this.b = j;
        this.e = tqvVar;
    }

    public final long a() {
        return Math.max(0L, this.a - this.c);
    }

    public final Long b() {
        return (Long) this.d.peek();
    }

    public final void c(long j) {
        this.b = Math.min(this.b, j);
    }
}
