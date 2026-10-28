package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class caf extends byt {
    public final int d;

    @Deprecated
    public caf(byi byiVar, byte[] bArr) {
        super("OnesieRetryingDataSource time out.", byiVar, 2000, 1);
        this.d = -1;
    }

    @Deprecated
    public caf(IOException iOException, byi byiVar) {
        super(iOException, byiVar, 2000, 1);
        this.d = -1;
    }

    public caf(IOException iOException, byi byiVar, int i, int i2) {
        super(iOException, byiVar, i, 1);
        this.d = i2;
    }

    public caf(byi byiVar) {
        super(byiVar, 2008, 1);
        this.d = 14;
    }

    public caf(byi byiVar, char[] cArr) {
        super("HTTP request with non-empty body must set Content-Type", byiVar, 1004, 1);
        this.d = 0;
    }
}
