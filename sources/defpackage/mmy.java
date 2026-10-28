package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmy extends fgv {
    public final mmz a;
    public final BitSet d;
    private final String[] e;

    public mmy(fhd fhdVar, mmz mmzVar) {
        super(fhdVar, mmzVar);
        this.e = new String[]{"column", "content", "row"};
        BitSet bitSet = new BitSet(3);
        this.d = bitSet;
        this.a = mmzVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final mmz a() {
        hmy.c(3, this.d, this.e);
        return this.a;
    }
}
