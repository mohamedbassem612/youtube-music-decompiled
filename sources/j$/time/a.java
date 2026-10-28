package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Clock implements Serializable {
    public static final a c;
    private static final long serialVersionUID = 6740630888130243051L;
    public final ZoneId b;

    static {
        System.currentTimeMillis();
        c = new a(ZoneOffset.UTC);
    }

    public a(ZoneId zoneId) {
        this.b = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.Clock
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.b.equals(((a) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() + 1;
    }

    @Override // j$.time.Clock
    public final Instant instant() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    public final String toString() {
        return j$.desugar.sun.nio.fs.i.a("SystemClock[", String.valueOf(this.b), "]");
    }
}
