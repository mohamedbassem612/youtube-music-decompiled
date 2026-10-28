package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lxf extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public lxf(int i, int i2, int i3, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(i), Long.valueOf(i2), Integer.valueOf(i3)))), th);
    }

    public lxf(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
