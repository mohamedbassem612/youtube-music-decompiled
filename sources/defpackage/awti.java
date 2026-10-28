package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class awti implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public awti(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.a, this.b);
        patternCompile.getClass();
        return new awtk(patternCompile);
    }
}
