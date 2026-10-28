package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agdf extends agev {
    public static final agdf a = new agdf();
    private static final long serialVersionUID = 0;

    private agdf() {
    }

    public static agev b() {
        return a;
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.agev
    public final agev a(agek agekVar) {
        return a;
    }

    @Override // defpackage.agev
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.agev
    public final Object d(agfr agfrVar) {
        Object objIo = agfrVar.io();
        objIo.getClass();
        return objIo;
    }

    @Override // defpackage.agev
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.agev
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.agev
    public final Object f() {
        return null;
    }

    @Override // defpackage.agev
    public final boolean g() {
        return false;
    }

    @Override // defpackage.agev
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
