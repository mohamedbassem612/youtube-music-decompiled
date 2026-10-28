package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflm {
    public final Class a;
    public final dyn b;
    public final agev c;
    public final aflk d;
    public final agev e;
    public final dyp f;
    public final agev g;
    public final agev h;
    public final agkz i;
    public final agev j;
    public final agev k;
    public final agev l;

    public aflm(Class cls, dyn dynVar, agev agevVar, aflk aflkVar, agev agevVar2, dyp dypVar, agev agevVar3, agev agevVar4, agkz agkzVar, agev agevVar5, agev agevVar6, agev agevVar7) {
        this.a = cls;
        this.b = dynVar;
        this.c = agevVar;
        this.d = aflkVar;
        this.e = agevVar2;
        this.f = dypVar;
        this.g = agevVar3;
        this.h = agevVar4;
        this.i = agkzVar;
        this.j = agevVar5;
        this.k = agevVar6;
        this.l = agevVar7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aflm) {
            aflm aflmVar = (aflm) obj;
            if (this.a.equals(aflmVar.a) && this.b.equals(aflmVar.b) && this.c.equals(aflmVar.c) && this.d.equals(aflmVar.d) && this.e.equals(aflmVar.e) && this.f.equals(aflmVar.f) && this.g.equals(aflmVar.g) && this.h.equals(aflmVar.h) && this.i.equals(aflmVar.i) && this.j.equals(aflmVar.j) && this.k.equals(aflmVar.k) && this.l.equals(aflmVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.l.hashCode();
    }

    public final String toString() {
        agev agevVar = this.l;
        agev agevVar2 = this.k;
        agev agevVar3 = this.j;
        agkz agkzVar = this.i;
        agev agevVar4 = this.h;
        agev agevVar5 = this.g;
        dyp dypVar = this.f;
        agev agevVar6 = this.e;
        aflk aflkVar = this.d;
        agev agevVar7 = this.c;
        dyn dynVar = this.b;
        return "TikTokWorkSpec{workerClass=" + String.valueOf(this.a) + ", constraints=" + String.valueOf(dynVar) + ", expedited=" + String.valueOf(agevVar7) + ", initialDelay=" + String.valueOf(aflkVar) + ", nextScheduleTimeOverride=" + String.valueOf(agevVar6) + ", inputData=" + String.valueOf(dypVar) + ", periodic=" + String.valueOf(agevVar5) + ", unique=" + String.valueOf(agevVar4) + ", tags=" + String.valueOf(agkzVar) + ", backoffPolicy=" + String.valueOf(agevVar3) + ", backoffDelayDuration=" + String.valueOf(agevVar2) + ", targetProcess=" + String.valueOf(agevVar) + '}';
    }

    public aflm() {
        throw null;
    }
}
