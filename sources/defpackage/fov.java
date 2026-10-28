package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fov extends fod {
    final fow b;
    private final String[] c;
    private final BitSet d;

    public fov(fof fofVar, fow fowVar) {
        super(fofVar, fowVar);
        this.c = new String[]{"component"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.b = fowVar;
        bitSet.clear();
    }

    @Override // defpackage.fod
    public final /* bridge */ /* synthetic */ foe a() {
        hmy.c(1, this.d, this.c);
        return this.b;
    }

    public final void b(fgy fgyVar) {
        this.b.m = fgyVar == null ? null : fgyVar.l();
        this.d.set(0);
    }
}
