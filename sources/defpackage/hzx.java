package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzx implements aaqj {
    private final aaqj a;
    private hzy b;

    public hzx(aunn aunnVar) {
        this.a = (aaqj) aunnVar.io();
    }

    private final synchronized aaqk c() {
        hzy hzyVar;
        hzyVar = this.b;
        if (hzyVar == null) {
            hzy hzyVar2 = new hzy(this.a);
            this.b = hzyVar2;
            hzyVar = hzyVar2;
        }
        return hzyVar;
    }

    @Override // defpackage.aaqj
    public final aaqk a(String str, String str2) {
        return c();
    }

    public final synchronized void b() {
        this.b = null;
    }
}
