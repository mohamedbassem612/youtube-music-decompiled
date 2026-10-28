package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awqs implements Serializable {
    public static final awqs a = new awqs();

    private awqs() {
    }

    private Object readResolve() {
        return a;
    }
}
