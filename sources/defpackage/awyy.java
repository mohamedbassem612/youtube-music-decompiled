package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awyy extends axbi {
    private final awqk d;

    public awyy(awqk awqkVar, awou awouVar, int i, int i2) {
        super(awouVar, i, i2);
        this.d = awqkVar;
    }

    static /* synthetic */ Object c(awyy awyyVar, awyp awypVar, awoq awoqVar) {
        Object objInvoke = awyyVar.d.invoke(awypVar, awoqVar);
        return objInvoke != awox.a ? awmy.a : objInvoke;
    }

    @Override // defpackage.axbi
    public Object a(awyp awypVar, awoq awoqVar) {
        return c(this, awypVar, awoqVar);
    }

    @Override // defpackage.axbi
    protected axbi b(awou awouVar, int i, int i2) {
        return new awyy(this.d, awouVar, i, i2);
    }

    @Override // defpackage.axbi
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
