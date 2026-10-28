package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class eti extends IOException {
    private static final long serialVersionUID = 1;
    public final int a;

    public eti(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
        this.a = i;
    }
}
