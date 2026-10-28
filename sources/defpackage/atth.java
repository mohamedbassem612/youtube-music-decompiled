package defpackage;

import com.google.research.aimatter.drishti.DrishtiCache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class atth {
    public final long a;
    public final DrishtiCache b;
    public final agke c;
    public final attk d;

    public atth(long j, DrishtiCache drishtiCache, agke agkeVar, attk attkVar) {
        this.a = j;
        this.b = drishtiCache;
        this.c = agkeVar;
        this.d = attkVar;
    }

    public static atvx a() {
        atvx atvxVar = new atvx();
        atvxVar.f(0L);
        atvxVar.g(agpi.a);
        return atvxVar;
    }

    public final boolean equals(Object obj) {
        DrishtiCache drishtiCache;
        if (obj == this) {
            return true;
        }
        if (obj instanceof atth) {
            atth atthVar = (atth) obj;
            if (this.a == atthVar.a && ((drishtiCache = this.b) != null ? drishtiCache.equals(atthVar.b) : atthVar.b == null) && aguu.v(this.c, atthVar.c)) {
                attk attkVar = this.d;
                if (attkVar == null) {
                    if (atthVar.d == null) {
                        return true;
                    }
                } else if (attkVar.equals(atthVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        DrishtiCache drishtiCache = this.b;
        int iHashCode = drishtiCache == null ? 0 : drishtiCache.hashCode();
        long j = this.a;
        int iHashCode2 = ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ this.c.hashCode();
        attk attkVar = this.d;
        return (iHashCode2 * 1000003) ^ (attkVar != null ? attkVar.hashCode() : 0);
    }

    public final String toString() {
        attk attkVar = this.d;
        agke agkeVar = this.c;
        return "ExternalGraphComponents{parentGlContextHandle=" + this.a + ", drishtiCache=" + String.valueOf(this.b) + ", servicePacketHandles=" + String.valueOf(agkeVar) + ", gpuBufferPoolOptions=" + String.valueOf(attkVar) + '}';
    }

    public atth() {
        throw null;
    }
}
