package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axey extends awvv {
    private final String a;
    private final axev b;

    public axey(int i, int i2, long j, String str) {
        this.a = str;
        this.b = new axev(i, i2, j, str);
    }

    @Override // defpackage.awuq
    public final void a(awou awouVar, Runnable runnable) {
        this.b.a(runnable, false, false);
    }

    public final void c(Runnable runnable, boolean z) {
        this.b.a(runnable, true, z);
    }

    public void close() {
        this.b.f();
    }

    @Override // defpackage.awvv
    public final Executor h() {
        return this.b;
    }

    @Override // defpackage.awuq
    public final void i(awou awouVar, Runnable runnable) {
        this.b.a(runnable, false, true);
    }
}
