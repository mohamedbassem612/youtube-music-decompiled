package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aiik extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public aiik(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public aiik(String str) {
        super(str);
    }

    public aiik(String str, IOException iOException) {
        super(str, iOException);
    }
}
