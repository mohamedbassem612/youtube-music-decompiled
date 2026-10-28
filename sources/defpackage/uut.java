package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uut extends utz {
    private final int a;

    public uut(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.utz
    public final augy e(augy augyVar) {
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        augyVar2.b |= 4;
        augyVar2.g = this.a;
        return (augy) jrrVar.build();
    }
}
