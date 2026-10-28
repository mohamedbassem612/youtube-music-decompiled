package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bsz extends IOException {
    public final boolean a;
    public final int b;

    public bsz(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.a = z;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        return (message != null ? message.concat(" ") : "") + "{contentIsMalformed=" + this.a + ", dataType=" + this.b + '}';
    }
}
