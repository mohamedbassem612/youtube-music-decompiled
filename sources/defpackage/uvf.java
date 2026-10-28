package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uvf extends uuw {
    private final Duration a;

    /* JADX WARN: Illegal instructions before constructor call */
    public uvf(long j, Duration duration) {
        aihl aihlVar = auft.b;
        aihlVar.getClass();
        super(j, aihlVar);
        this.a = duration;
    }

    @Override // defpackage.uuw
    public final /* synthetic */ Object e(Object obj) {
        auft auftVar = (auft) obj;
        if (auftVar == null) {
            return null;
        }
        aihf builder = auftVar.toBuilder();
        builder.getClass();
        aigu aiguVarU = aext.u(this.a);
        builder.copyOnWrite();
        auft auftVar2 = (auft) builder.instance;
        auftVar2.e = aiguVarU;
        auftVar2.c |= 2;
        return atqn.q(builder);
    }
}
