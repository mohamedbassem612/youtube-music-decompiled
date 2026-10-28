package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuj extends utz {
    private final Duration a;
    private final Duration c;

    public uuj(long j, Duration duration, Duration duration2) {
        super(j);
        this.a = duration;
        this.c = duration2;
    }

    @Override // defpackage.utz
    public final augy e(augy augyVar) {
        Duration durationAw;
        Duration duration = this.a;
        if (duration == null && this.c == null) {
            return augyVar;
        }
        jrr jrrVar = (jrr) augyVar.toBuilder();
        if (duration != null) {
            durationAw = duration;
        } else {
            aigu aiguVar = augyVar.i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            durationAw = ahng.aw(aiguVar);
        }
        Duration durationPlus = this.c;
        if (durationPlus == null) {
            aigu aiguVar2 = augyVar.i;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            Duration durationAw2 = ahng.aw(aiguVar2);
            aigu aiguVar3 = augyVar.j;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            durationPlus = durationAw2.plus(ahng.aw(aiguVar3));
        }
        if (durationPlus.compareTo(durationAw) < 0) {
            if (duration == null) {
                durationAw = durationPlus;
            }
            durationPlus = durationAw;
        }
        aigu aiguVarAu = ahng.au(durationAw);
        jrrVar.copyOnWrite();
        augy augyVar2 = (augy) jrrVar.instance;
        aiguVarAu.getClass();
        augyVar2.i = aiguVarAu;
        augyVar2.b |= 16;
        aigu aiguVarAu2 = ahng.au(durationPlus.minus(durationAw));
        jrrVar.copyOnWrite();
        augy augyVar3 = (augy) jrrVar.instance;
        aiguVarAu2.getClass();
        augyVar3.j = aiguVarAu2;
        augyVar3.b |= 32;
        return (augy) jrrVar.build();
    }
}
