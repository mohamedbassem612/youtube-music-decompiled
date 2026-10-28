package defpackage;

import j$.util.Objects;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzo {
    public final long a;
    public final MessageDigest b;
    public final agev c;
    private final long d = 0;
    private final boolean e = false;

    public atzo(atzn atznVar) {
        this.a = atznVar.a;
        this.b = (MessageDigest) atznVar.b;
        this.c = (agev) atznVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atzo) {
            atzo atzoVar = (atzo) obj;
            if (this.a == atzoVar.a) {
                long j = atzoVar.d;
                if (Objects.equals(this.b, atzoVar.b) && this.c.equals(atzoVar.c)) {
                    boolean z = atzoVar.e;
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0L, this.b, this.c, Boolean.FALSE});
    }

    public final String toString() {
        return String.format(Locale.US, "TransferOptions[idleTimeout %d sec, resumableTransferThreshold=%d, digest=%s, crc32c=%s, forceMultipart=%s]", Long.valueOf(this.a), 0L, this.b, agdf.a, Boolean.FALSE);
    }
}
