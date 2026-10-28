package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sry {
    public Object a;
    public Object b;

    public sry() {
        agpr agprVar = agpr.a;
        this.a = agprVar;
        this.b = agprVar;
    }

    public final void a(srx srxVar) {
        agkx agkxVar = new agkx();
        agkxVar.k(((agkz) this.a).iterator());
        agkxVar.c(srxVar);
        this.a = agkxVar.g();
    }

    public final void b(alnr alnrVar) {
        agqr it = ((agkz) this.a).iterator();
        while (it.hasNext()) {
            ((srx) it.next()).h(alnrVar);
        }
    }

    public final void c(alnu alnuVar) {
        agqr it = ((agkz) this.b).iterator();
        while (it.hasNext()) {
            ((srp) it.next()).B(alnuVar);
        }
    }

    public final void d(srx srxVar) {
        agkx agkxVar = new agkx();
        agqr it = ((agkz) this.a).iterator();
        while (it.hasNext()) {
            srx srxVar2 = (srx) it.next();
            if (srxVar2 != srxVar) {
                agkxVar.c(srxVar2);
            }
        }
        this.a = agkxVar.g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jsk] */
    public final quo e() {
        ?? r0 = this.a;
        if (r0 != 0) {
            return new quo(r0, (Optional) this.b);
        }
        throw new IllegalStateException("Missing required properties: cache");
    }

    public sry(byte[] bArr) {
    }

    public sry(char[] cArr) {
        this.b = Optional.empty();
    }
}
