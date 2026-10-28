package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agqz {
    public final int a;
    public final TimeUnit b;

    public agqz(int i, TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agqz)) {
            return false;
        }
        agqz agqzVar = (agqz) obj;
        return this.a == agqzVar.a && this.b == agqzVar.b;
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a + ' ' + this.b.toString();
    }
}
