package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class pgw {
    public boolean a;
    public byte b;
    public Object c;

    public final void a(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final ojv b() {
        if (this.c == null) {
            this.c = agpr.a;
        }
        if (this.b == 1) {
            return new ojv(this.a, (agkz) this.c);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    public final void c(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void d(Set set) {
        this.c = agkz.n(set);
    }

    public final void e(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }
}
