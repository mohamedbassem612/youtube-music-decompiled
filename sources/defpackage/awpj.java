package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class awpj extends awpi implements awqz {
    private final int arity;

    public awpj(int i, awoq awoqVar) {
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

    public awpj(int i) {
        this(i, null);
    }
}
