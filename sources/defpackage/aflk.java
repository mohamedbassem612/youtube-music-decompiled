package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflk {
    public final long a;
    public final TimeUnit b;

    public aflk(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aflk) {
            aflk aflkVar = (aflk) obj;
            if (this.a == aflkVar.a && this.b.equals(aflkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((int) this.a) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + '}';
    }

    public aflk() {
        throw null;
    }
}
