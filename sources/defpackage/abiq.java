package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abiq extends acfx {
    final /* synthetic */ abir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abiq(abir abirVar, long j, long j2) {
        super(j, j2, 1, 1, null);
        this.a = abirVar;
    }

    @Override // defpackage.acfx
    public final void a(boolean z, boolean z2, boolean z3) {
        abir abirVar = this.a;
        if (z) {
            abirVar.b = false;
        } else {
            abirVar.b = true;
            abirVar.a();
        }
    }

    @Override // defpackage.acfx
    protected final void c(long j) {
        this.a.b = false;
    }
}
