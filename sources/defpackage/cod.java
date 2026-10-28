package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cod {
    public long b;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int a = 1;
    public long c = -9223372036854775807L;

    public final void a() {
        int i = this.a;
        if (i != 3) {
            if (i == 7 || i == 6 || g()) {
                return;
            }
            this.a = i != 2 ? 8 : 7;
        }
    }

    public final boolean b() {
        int i = this.a;
        return i == 3 || i == 7;
    }

    public final boolean c() {
        return this.a == 7;
    }

    public final boolean d() {
        return this.a == 8;
    }

    public final boolean e() {
        return this.a == 5;
    }

    public final boolean f() {
        int i = this.a;
        return i == 4 || i == 8;
    }

    public final boolean g() {
        return this.c != -9223372036854775807L;
    }

    public final boolean h() {
        return this.e || g();
    }
}
