package defpackage;

import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fru extends fgv {
    public final frw a;
    public final BitSet d;
    private final String[] e;

    public fru(fhd fhdVar, frw frwVar) {
        super(fhdVar, frwVar);
        this.e = new String[]{"binder"};
        BitSet bitSet = new BitSet(1);
        this.d = bitSet;
        this.a = frwVar;
        bitSet.clear();
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ fgy a() {
        hmy.c(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.fgv
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void r(boolean z) {
        this.a.c = z;
    }

    public final void c(boolean z) {
        this.a.d = z;
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ void s() {
        c(false);
    }

    @Override // defpackage.fgv
    public final /* bridge */ /* synthetic */ void t(CharSequence charSequence) {
        super.t(charSequence);
        this.a.e = charSequence;
    }
}
