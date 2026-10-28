package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cro extends IOException {
    public cro(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
    }
}
