package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class frd extends fgv {
    final fre a;
    public final BitSet d;
    private final String[] e;

    public frd(fhd fhdVar, fre freVar) {
        super(fhdVar, freVar);
        this.e = new String[]{"drawable"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = freVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fre a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }
}
