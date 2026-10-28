package pl.droidsonroids.gif;

import defpackage.axsr;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class GifIOException extends IOException {
    private static final long serialVersionUID = 13038402904505L;
    public final axsr a;
    private final String b;

    GifIOException(int i, String str) {
        for (axsr axsrVar : axsr.values()) {
            if (axsrVar.w == i) {
                this.a = axsrVar;
                this.b = str;
            }
        }
        axsrVar = axsr.UNKNOWN;
        this.a = axsrVar;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.b;
        axsr axsrVar = this.a;
        if (str == null) {
            return axsrVar.a();
        }
        return axsrVar.a() + ": " + str;
    }
}
