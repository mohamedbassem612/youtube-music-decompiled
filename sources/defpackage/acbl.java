package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acbl extends acfx {
    private final List a;
    private final twi b;

    public acbl(long j, long j2, List list, twi twiVar) {
        super(j, j2, 1, 1, null);
        this.a = list;
        this.b = twiVar;
    }

    @Override // defpackage.acfx
    public final void a(boolean z, boolean z2, boolean z3) {
        twi twiVar = this.b;
        if (twiVar != null) {
            twiVar.a(this.a);
        }
    }

    @Override // defpackage.acfx
    protected final void c(long j) {
    }
}
