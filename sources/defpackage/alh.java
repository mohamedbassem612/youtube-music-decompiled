package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alh {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void c(dow dowVar) {
        boc lifecycle = dowVar.getLifecycle();
        bob bobVarA = lifecycle.a();
        if (bobVarA == bob.b || bobVarA.a(bob.d)) {
            dowVar.getSavedStateRegistry().c(bor.class);
        } else {
            lifecycle.b(new bpb(dowVar, 0));
        }
    }

    public static final Object d(boc bocVar, bob bobVar, awqk awqkVar, awoq awoqVar) {
        Object objJ;
        if (bobVar != bob.b) {
            return (bocVar.a() == bob.a || (objJ = awrc.J(new ybe(bocVar, bobVar, awqkVar, (awoq) null, 1), awoqVar)) != awox.a) ? awmy.a : objJ;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }
}
