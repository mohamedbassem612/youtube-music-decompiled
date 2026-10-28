package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fos extends fod {
    public final fot b;
    public final BitSet c;
    private final String[] d;

    public fos(fof fofVar, fot fotVar) {
        super(fofVar, fotVar);
        this.d = new String[]{"data"};
        BitSet bitSet = new BitSet(1);
        this.c = bitSet;
        this.b = fotVar;
        bitSet.clear();
    }

    @Override // defpackage.fod
    public final /* bridge */ /* synthetic */ foe a() {
        hmy.c(1, this.c, this.d);
        return this.b;
    }
}
