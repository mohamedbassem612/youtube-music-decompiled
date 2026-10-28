package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bja extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public bja(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public bja(String str) {
        super(str);
    }

    public bja(IOException iOException, byte[] bArr) {
        super("Unable to parse map entry.", iOException);
    }
}
