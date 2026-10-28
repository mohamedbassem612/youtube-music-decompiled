package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ffa implements ett {
    private final int b;
    private final ett c;

    public ffa(int i, ett ettVar) {
        this.b = i;
        this.c = ettVar;
    }

    @Override // defpackage.ett
    public final void a(MessageDigest messageDigest) {
        this.c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.ett
    public final boolean equals(Object obj) {
        if (!(obj instanceof ffa)) {
            return false;
        }
        ffa ffaVar = (ffa) obj;
        return this.b == ffaVar.b && this.c.equals(ffaVar.c);
    }

    @Override // defpackage.ett
    public final int hashCode() {
        return ffs.c(this.c, this.b);
    }
}
