package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agfa extends agev {
    private static final long serialVersionUID = 0;
    public final Object a;

    public agfa(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.agev
    public final agev a(agek agekVar) {
        Object objApply = agekVar.apply(this.a);
        objApply.getClass();
        return new agfa(objApply);
    }

    @Override // defpackage.agev
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.agev
    public final Object d(agfr agfrVar) {
        agfrVar.getClass();
        return this.a;
    }

    @Override // defpackage.agev
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.agev
    public final boolean equals(Object obj) {
        if (obj instanceof agfa) {
            return this.a.equals(((agfa) obj).a);
        }
        return false;
    }

    @Override // defpackage.agev
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.agev
    public final boolean g() {
        return true;
    }

    @Override // defpackage.agev
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ')';
    }
}
