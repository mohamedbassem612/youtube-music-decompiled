package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bod implements awut, boe {
    public final boc a;
    private final awou b;

    public bod(boc bocVar, awou awouVar) {
        awouVar.getClass();
        this.a = bocVar;
        this.b = awouVar;
        if (bocVar.a() == bob.a) {
            awro.z(awouVar, null);
        }
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        boc bocVar = this.a;
        if (bocVar.a().compareTo(bob.a) <= 0) {
            bocVar.c(this);
            awro.z(this.b, null);
        }
    }

    @Override // defpackage.awut
    public final awou b() {
        return this.b;
    }

    public bod() {
        throw null;
    }
}
