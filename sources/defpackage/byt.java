package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class byt extends byf {
    public final byi b;
    public final int c;

    public byt(String str, IOException iOException, byi byiVar, int i) {
        super(str, iOException, b(i, 1));
        this.b = byiVar;
        this.c = 1;
    }

    private static int b(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public static byt jD(IOException iOException, byi byiVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !ahno.ae(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new bys(iOException, byiVar) : new byt(iOException, byiVar, i2, i);
    }

    public byt(IOException iOException, byi byiVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = byiVar;
        this.c = i2;
    }

    public byt(String str, byi byiVar, int i, int i2) {
        super(str, b(i, i2));
        this.b = byiVar;
        this.c = i2;
    }

    public byt(byi byiVar, int i, int i2) {
        super(b(i, i2));
        this.b = byiVar;
        this.c = i2;
    }
}
