package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ooa {
    public Uri a;
    public String b;
    public ojv c;
    public agev d;
    public int e;
    public agke f;
    public String g;
    public agev h;
    public agev i;
    public boolean j;
    public boolean k;
    public aifv l;
    public byte m;

    public ooa() {
        agdf agdfVar = agdf.a;
        this.d = agdfVar;
        this.h = agdfVar;
        this.i = agdfVar;
    }

    public final void a(aifv aifvVar) {
        if (aifvVar == null) {
            throw new NullPointerException("Null customDownloaderMetadata");
        }
        this.l = aifvVar;
    }

    public final void b(agke agkeVar) {
        if (agkeVar == null) {
            throw new NullPointerException("Null extraHttpHeaders");
        }
        this.f = agkeVar;
    }

    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null notificationContentTitle");
        }
        this.g = str;
    }

    public final void d(boolean z) {
        this.j = z;
        this.m = (byte) (this.m | 4);
    }

    public final void e(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 8);
    }

    public final void f(int i) {
        this.e = i;
        this.m = (byte) (this.m | 1);
    }

    public final void g() {
        this.m = (byte) (this.m | 2);
    }
}
