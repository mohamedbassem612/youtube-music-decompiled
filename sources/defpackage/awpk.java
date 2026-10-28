package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awpk extends awpg implements awqz {
    private final int arity;

    public awpk(int i, awoq awoqVar) {
        super(awoqVar);
        this.arity = i;
    }

    @Override // defpackage.awqz
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.awpe
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strA = awrn.a(this);
        strA.getClass();
        return strA;
    }

    public awpk(int i) {
        this(i, null);
    }
}
