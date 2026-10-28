package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zej extends zem {
    private final zen a;
    private final long b;
    private final zsf c;
    private final int d;
    private final zlo e;
    private final Object f;

    public zej(zen zenVar, long j, zsf zsfVar, int i, zlo zloVar, Object obj) {
        this.a = zenVar;
        this.b = j;
        if (zsfVar == null) {
            throw new NullPointerException("Null playerType");
        }
        this.c = zsfVar;
        this.d = i;
        this.e = zloVar;
        this.f = obj;
    }

    @Override // defpackage.zem
    public final int a() {
        return this.d;
    }

    @Override // defpackage.zem
    public final long b() {
        return this.b;
    }

    @Override // defpackage.zem
    public final zen c() {
        return this.a;
    }

    @Override // defpackage.zem
    public final zlo d() {
        return this.e;
    }

    @Override // defpackage.zem
    public final zsf e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zem) {
            zem zemVar = (zem) obj;
            if (this.a.equals(zemVar.c()) && this.b == zemVar.b() && this.c.equals(zemVar.e()) && this.d == zemVar.a() && this.e.equals(zemVar.d())) {
                Object obj2 = this.f;
                if (obj2 == null) {
                    if (zemVar.f() == null) {
                        return true;
                    }
                } else if (obj2.equals(zemVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zem
    public final Object f() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        int iHashCode2 = (((((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
        Object obj = this.f;
        return (iHashCode2 * 1000003) ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        Object obj = this.f;
        zlo zloVar = this.e;
        zsf zsfVar = this.c;
        return "Event{eventType=" + this.a.toString() + ", elapsedMillis=" + this.b + ", playerType=" + zsfVar.toString() + ", surfaceHashCode=" + this.d + ", mediaViewType=" + zloVar.toString() + ", additionalInfo=" + String.valueOf(obj) + '}';
    }
}
