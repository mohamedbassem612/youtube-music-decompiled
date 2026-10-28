package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qhy {
    public final long a;
    public long b;
    public long c;
    int d;
    int e;
    final String f;
    public String i;
    public int j;
    String k;
    public axhf l;
    public axgh m;
    public Integer n;
    int o;
    public int p;
    public qjj r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int q = -1;
    final String g = ahno.Y(null);
    final boolean h = false;

    public qhy(String str, String str2, boolean z, long j) {
        this.f = ahno.Y(str2);
        this.a = j;
    }

    public final void a(int i, int i2) {
        this.c = SystemClock.elapsedRealtime() - this.a;
        this.d = i;
        this.e = i2;
    }

    public final void b(String str) {
        if (ahno.aa(str)) {
            return;
        }
        this.k = str;
    }
}
