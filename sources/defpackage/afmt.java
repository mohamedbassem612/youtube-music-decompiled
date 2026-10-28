package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afmt {
    public static final afmt a = new afmt(null, Instant.EPOCH, false);
    public final afms b;
    private final Object c;

    public afmt(Object obj, Instant instant, boolean z) {
        this.c = obj;
        this.b = new afms(instant, obj != null, z);
    }

    public final boolean a() {
        return this.b.b;
    }

    public final boolean b() {
        ahno.P(a(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.b.c;
    }

    public final String toString() {
        afms afmsVar = this.b;
        if (!afmsVar.b) {
            return "CacheResult.cacheMiss";
        }
        boolean z = afmsVar.c;
        Object obj = this.c;
        if (!z) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(obj) + '}';
        }
        Instant instant = afmsVar.a;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + instant.toString() + '}';
    }
}
