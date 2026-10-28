package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lyh extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    public boolean a;

    public lyh(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    final void a() {
        this.a = true;
    }

    public lyh(String str) {
        super(str);
    }
}
