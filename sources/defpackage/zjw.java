package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zjw implements zse {
    private final Map b;
    private zsf c;

    public zjw() {
        int i = zic.a;
        this.b = new zib(8, 8);
        this.c = null;
    }

    @Override // defpackage.zse
    public final synchronized zsf a(String str) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return str != null ? (zsf) this.b.get(str) : this.c;
    }

    public final synchronized void b() {
        this.c = null;
    }

    public final synchronized void c(String str, zsf zsfVar) {
        this.c = zsfVar;
        this.b.put(str, zsfVar);
    }
}
