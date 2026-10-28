package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class jsi extends IOException implements zjs {
    public jsi(String str) {
        super(str);
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return "cache.exception";
    }

    @Override // defpackage.zjs
    public final String b() {
        return "m.".concat(String.valueOf(getMessage()));
    }

    public jsi(String str, Throwable th) {
        super(str, th);
    }

    public jsi(Throwable th) {
        super(th);
    }
}
