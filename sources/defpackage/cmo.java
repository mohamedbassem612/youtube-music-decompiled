package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmo extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public cmo(int i, long j, long j2) {
        String strCr;
        if (i != 0) {
            if (i != 1) {
                ahno.O((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                strCr = a.cr(j2, j, "start exceeds end. Start time: ", ", End time: ");
            } else {
                strCr = "not seekable to start";
            }
        } else {
            strCr = "invalid period count";
        }
        super("Illegal clipping: ".concat(strCr));
    }
}
