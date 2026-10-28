package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qu implements boe {
    final /* synthetic */ qq a;
    final /* synthetic */ boc b;

    public qu(qq qqVar, boc bocVar) {
        this.a = qqVar;
        this.b = bocVar;
    }

    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        int iOrdinal = boaVar.ordinal();
        if (iOrdinal == 1) {
            this.a.d(true);
            return;
        }
        if (iOrdinal == 4) {
            this.a.d(false);
        } else if (iOrdinal == 5) {
            this.a.f();
            this.b.c(this);
        }
    }
}
