package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class r {

    @Deprecated
    public final q a;

    @Deprecated
    public final q b;

    @Deprecated
    public r(q qVar, q qVar2) {
        if (qVar.b == qVar2.b) {
            this.a = qVar;
            this.b = qVar2;
            return;
        }
        throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + qVar.toString() + '~' + qVar2.toString());
    }

    @Deprecated
    public final String toString() {
        q qVar = this.b;
        q qVar2 = this.a;
        return qVar2.toString().concat(qVar == qVar2 ? "" : "~".concat(qVar.toString()));
    }
}
