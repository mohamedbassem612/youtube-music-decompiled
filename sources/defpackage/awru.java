package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awru implements Serializable {
    public static final awru a = new awru();
    private static final long serialVersionUID = 0;

    private awru() {
    }

    private final Object readResolve() {
        return awrw.a;
    }
}
