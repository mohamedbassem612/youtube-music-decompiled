package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agea extends ageb implements Serializable {
    public static final agea a = new agea();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ageb
    public final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.ageb
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
