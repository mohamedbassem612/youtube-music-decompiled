package defpackage;

import java.nio.ByteBuffer;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class aryx extends mew implements mes {
    static final mfc e = aryw.a.d(1);
    volatile ByteBuffer f;

    public aryx() {
        super(aryw.a);
    }

    public final ByteBuffer aR() {
        if (this.f == null) {
            if ((Memory.peekByte(this.c + 8) & 1) != 0) {
                this.f = cr(e.b);
            } else {
                this.f = ByteBuffer.allocate(0);
            }
        }
        return this.f.asReadOnlyBuffer();
    }
}
