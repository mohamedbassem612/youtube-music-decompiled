package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rev extends res {
    private static final Duration a = Duration.ofMillis(100);

    @Override // defpackage.res
    protected final Duration e() {
        return a;
    }

    @Override // defpackage.res
    protected final /* synthetic */ rei f() {
        UUID uuid = this.b.a;
        req reqVar = this.c;
        ria riaVar = new ria(uuid, reqVar.t(), reqVar);
        riaVar.i(((quw) this.b.b).c);
        rgn rgnVar = new rgn(new rgo());
        rgnVar.i(riaVar);
        riaVar.d(reqVar.q());
        riaVar.h(Duration.ZERO, reqVar.n());
        return new reu(this, riaVar, rgnVar);
    }
}
