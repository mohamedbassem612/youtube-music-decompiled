package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kkz {
    public final int a;
    public final int b;
    public final Bundle c;
    final kjc d = new kjc((byte[]) null, (byte[]) null, (byte[]) null);

    public kkz(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(kla klaVar) {
        this.d.w(klaVar);
    }

    final void d(Object obj) {
        this.d.x(obj);
    }

    public final String toString() {
        return "Request { what=" + this.b + " id=" + this.a + " oneWay=" + b() + '}';
    }
}
