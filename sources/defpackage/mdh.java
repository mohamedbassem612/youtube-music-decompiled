package defpackage;

import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdh {
    public final String a;
    public final int b;
    public final boolean c;
    public final mdj d;

    public mdh(String str, int i, boolean z, mdj mdjVar) {
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = mdjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mdh) {
            mdh mdhVar = (mdh) obj;
            if (this.a.equals(mdhVar.a) && this.b == mdhVar.b && this.c == mdhVar.c && this.d.equals(mdhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ Alert.DURATION_SHOW_INDEFINITELY) * 1000003) ^ 1231) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadPoolConfig{name=" + this.a + ", numThreads=" + this.b + ", maxThreadSize=2147483647, maxQueueSize=2147483647, enableStats=true, enabledMetrics=" + this.c + ", listener=" + this.d.toString() + '}';
    }

    public mdh() {
        throw null;
    }
}
