package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tna implements tnz {
    private int a;
    private final int b;
    private int c;
    private final int d;
    private final float e;

    public tna() {
        this.a = 2500;
        this.d = 1;
        this.e = 1.0f;
        this.b = 60000;
    }

    @Override // defpackage.tnz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.tnz
    public final int b() {
        return this.c;
    }

    protected final boolean c() {
        return this.c <= this.d;
    }

    @Override // defpackage.tnz
    public final Duration d(toe toeVar) {
        this.c++;
        int i = this.a;
        int i2 = i + ((int) (i * this.e));
        this.a = i2;
        if (c()) {
            return Duration.ofMillis(i2);
        }
        return null;
    }

    @Override // defpackage.tnz
    public final void f(toe toeVar) throws toe {
        this.c++;
        int i = this.a;
        this.a = i + ((int) (i * this.e));
        if (!c()) {
            throw toeVar;
        }
    }

    public tna(int i) {
        this.a = i;
        this.d = 0;
        this.e = 0.0f;
        this.b = 60000;
    }

    public tna(int i, int i2) {
        this.a = i;
        this.d = 0;
        this.e = 0.0f;
        this.b = i2;
    }

    @Override // defpackage.tnz
    public final void g() {
    }
}
