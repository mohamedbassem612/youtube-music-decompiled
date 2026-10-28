package defpackage;

import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class xyi {
    public final boolean a;
    private final Instant b;
    private final Instant c;
    private final Instant d;

    public /* synthetic */ xyi(Instant instant, Instant instant2, Instant instant3, boolean z, int i) {
        if ((i & 1) != 0) {
            instant = Instant.EPOCH;
            instant.getClass();
        }
        if ((i & 2) != 0) {
            instant2 = Instant.EPOCH;
            instant2.getClass();
        }
        if ((i & 4) != 0) {
            instant3 = Instant.EPOCH;
            instant3.getClass();
        }
        boolean z2 = (i & 8) == 0;
        instant.getClass();
        instant2.getClass();
        instant3.getClass();
        this.b = instant;
        this.c = instant2;
        this.d = instant3;
        this.a = z2 & z;
    }

    public final long a() {
        return this.c.toEpochMilli();
    }

    public final long b() {
        return this.b.toEpochMilli();
    }

    public final long c() {
        return this.d.toEpochMilli();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xyi) {
            xyi xyiVar = (xyi) obj;
            if (awrc.c(this.b, xyiVar.b) && awrc.c(this.c, xyiVar.c) && awrc.c(this.d, xyiVar.d) && this.a == xyiVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.aj(this.a);
    }

    public final String toString() {
        return "ConnectedSessionInfo(lastConnectedTime=" + this.b + ", firstConnectedTime=" + this.c + ", recoveryExpirationTime=" + this.d + ", shouldSkipRecoveryExpiration=" + this.a + ')';
    }

    public xyi() {
        this(null, null, null, false, 15);
    }
}
