package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fqw extends fgv {
    public final fqz a;
    public final BitSet d;
    private final String[] e;

    public fqw(fhd fhdVar, fqz fqzVar) {
        super(fhdVar, fqzVar);
        this.e = new String[]{"contentProps"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = fqzVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }
}
