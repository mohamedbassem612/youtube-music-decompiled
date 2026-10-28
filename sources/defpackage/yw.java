package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class yw {
    public Object a;

    public final hmw a() {
        Object obj = this.a;
        if (obj != null) {
            return new hmz(obj, null);
        }
        throw new IllegalStateException("Missing required properties: entity");
    }

    public final void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null entity");
        }
        this.a = obj;
    }

    public final hle c() {
        if (this.a != null) {
            return new hle((akna) this.a);
        }
        throw new IllegalStateException("Missing required properties: continuationToken");
    }

    public final void d(akna aknaVar) {
        if (aknaVar == null) {
            throw new NullPointerException("Null continuationToken");
        }
        this.a = aknaVar;
    }
}
