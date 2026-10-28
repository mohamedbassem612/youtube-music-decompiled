package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ktu {
    private final ktt a;
    private long b;
    private final ksr c;
    private final aihf d;

    private ktu(ktu ktuVar) {
        this.a = ktuVar.a;
        this.c = ktuVar.c;
        this.d = ktuVar.d.mo53clone();
        this.b = ktuVar.b;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized ktu clone() {
        return new ktu(this);
    }

    public final synchronized agcy b() {
        return (agcy) this.d.build();
    }

    public final void c(int i, ktt kttVar) {
        if (kttVar == ktt.a) {
            throw new IllegalArgumentException("Cannot record an event with granularity NOTHING");
        }
        if (kttVar.compareTo(this.a) <= 0) {
            synchronized (this) {
                aihf aihfVarCreateBuilder = agcx.a.createBuilder();
                aihfVarCreateBuilder.copyOnWrite();
                agcx agcxVar = (agcx) aihfVarCreateBuilder.instance;
                agcxVar.c = i - 1;
                agcxVar.b |= 1;
                long jNanoTime = System.nanoTime();
                long j = this.b;
                if (j >= 0) {
                    long millis = Duration.ofNanos(jNanoTime - j).toMillis();
                    aihfVarCreateBuilder.copyOnWrite();
                    agcx agcxVar2 = (agcx) aihfVarCreateBuilder.instance;
                    agcxVar2.b |= 2;
                    agcxVar2.d = millis;
                }
                this.b = jNanoTime;
                aihf aihfVar = this.d;
                aihfVar.copyOnWrite();
                agcy agcyVar = (agcy) aihfVar.instance;
                agcx agcxVar3 = (agcx) aihfVarCreateBuilder.build();
                agcy agcyVar2 = agcy.a;
                agcxVar3.getClass();
                aiie aiieVar = agcyVar.b;
                if (!aiieVar.c()) {
                    agcyVar.b = aihn.mutableCopy(aiieVar);
                }
                agcyVar.b.add(agcxVar3);
            }
        }
    }

    public ktu(ktt kttVar) {
        ksr ksrVar = ksr.a;
        this.a = kttVar;
        this.c = ksrVar;
        this.d = agcy.a.createBuilder();
        this.b = -1L;
    }
}
