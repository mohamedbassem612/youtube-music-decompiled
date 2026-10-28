package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kjz {
    public final kiw a;
    public final Consumer b;
    public final Consumer c;
    public final boolean d;
    public final boolean e;

    public kjz(kiw kiwVar, Consumer consumer, Consumer consumer2, boolean z, boolean z2) {
        this.a = kiwVar;
        this.b = consumer;
        this.c = consumer2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjz) {
            kjz kjzVar = (kjz) obj;
            if (this.a.equals(kjzVar.a) && this.b.equals(kjzVar.b) && this.c.equals(kjzVar.c) && this.d == kjzVar.d && this.e == kjzVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        Consumer consumer = this.c;
        Consumer consumer2 = this.b;
        return "BatchingLogEvent{logEventParcelable=" + String.valueOf(this.a) + ", successResultSetter=" + String.valueOf(consumer2) + ", failedResultSetter=" + String.valueOf(consumer) + ", isRetryEvent=" + this.d + ", isLastRetryEvent=" + this.e + '}';
    }

    public kjz() {
        throw null;
    }
}
