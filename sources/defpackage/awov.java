package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awov implements Serializable, awou {
    public static final awov a = new awov();
    private static final long serialVersionUID = 0;

    private awov() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.awou
    public final awos get(awot awotVar) {
        awotVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.awou
    public final awou minusKey(awot awotVar) {
        awotVar.getClass();
        return this;
    }

    @Override // defpackage.awou
    public final awou plus(awou awouVar) {
        awouVar.getClass();
        return awouVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.awou
    public final Object fold(Object obj, awqk awqkVar) {
        return obj;
    }
}
