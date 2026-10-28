package defpackage;

import java.util.IdentityHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axle {
    public Object a;
    public Object b;

    public axle(byte[] bArr, byte[] bArr2) {
        this.a = null;
        this.b = null;
    }

    public final auyo a() {
        if (this.b != null) {
            this.a = new auyo((IdentityHashMap) this.b);
            this.b = null;
        }
        return (auyo) this.a;
    }

    public final IdentityHashMap b(int i) {
        if (this.b == null) {
            Object obj = this.a;
            auyo auyoVar = auyo.a;
            IdentityHashMap identityHashMap = new IdentityHashMap(((auyo) obj).b.size() + i);
            this.b = identityHashMap;
            identityHashMap.putAll(((auyo) this.a).b);
            this.a = null;
        }
        return (IdentityHashMap) this.b;
    }

    public final void c(auyn auynVar, Object obj) {
        b(1).put(auynVar, obj);
    }

    public axle(auyo auyoVar) {
        this.a = auyoVar;
    }
}
