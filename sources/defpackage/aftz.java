package defpackage;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aftz {
    public static final aftz a;
    private final UUID b;
    private final AtomicLong c;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            a = new aftz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public aftz(UUID uuid, long j) {
        this.b = uuid;
        this.c = new AtomicLong((j ^ 25214903917L) & 281474976710655L);
    }

    final long a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        long j3;
        do {
            atomicLong = this.c;
            j = atomicLong.get();
            j2 = ((j * 25214903917L) + 11) & 281474976710655L;
            j3 = ((25214903917L * j2) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j, j3));
        return (((long) ((int) (j2 >>> 16))) << 32) + ((long) ((int) (j3 >>> 16)));
    }

    public final UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.b;
        return new UUID(uuid.getMostSignificantBits() ^ jA, uuid.getLeastSignificantBits() ^ jA2);
    }
}
