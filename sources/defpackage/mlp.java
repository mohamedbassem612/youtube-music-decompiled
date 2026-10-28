package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mlp extends fgv {
    final mlr a;
    public final BitSet d;
    private final String[] e;

    public mlp(fhd fhdVar, mlr mlrVar) {
        super(fhdVar, mlrVar);
        this.e = new String[]{"controllerSupplier", "conversionContext"};
        BitSet bitSet = new BitSet(2);
        this.d = bitSet;
        this.a = mlrVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mlr a() {
        hmy.c(2, this.d, this.e);
        return this.a;
    }
}
