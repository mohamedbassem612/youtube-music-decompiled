package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afqp {
    public final Map a;
    public boolean b;

    public /* synthetic */ afqp(byte[] bArr) {
        this.a = new LinkedHashMap();
        this.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof afqp) {
            afqp afqpVar = (afqp) obj;
            if (awrc.c(this.a, afqpVar.a) && this.b == afqpVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.aj(this.b);
    }

    public final String toString() {
        return "StreamMixinState(flowIds=" + this.a + ", acceptingNewChannels=" + this.b + ')';
    }

    public afqp() {
        this(null);
    }
}
