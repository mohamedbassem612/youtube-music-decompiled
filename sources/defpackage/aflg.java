package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflg {
    public final agev a;
    private final agev b;
    private final agev c;
    private final agev d;
    private final agev e;
    private final agev f;
    private final agev g;
    private final agev h;
    private final agev i;

    public aflg(agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, agev agevVar8, agev agevVar9) {
        this.b = agevVar;
        this.c = agevVar2;
        this.d = agevVar3;
        this.a = agevVar4;
        this.e = agevVar5;
        this.f = agevVar6;
        this.g = agevVar7;
        this.h = agevVar8;
        this.i = agevVar9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aflg) {
            aflg aflgVar = (aflg) obj;
            if (this.b.equals(aflgVar.b) && this.c.equals(aflgVar.c) && this.d.equals(aflgVar.d) && this.a.equals(aflgVar.a) && this.e.equals(aflgVar.e) && this.f.equals(aflgVar.f) && this.g.equals(aflgVar.g) && this.h.equals(aflgVar.h) && this.i.equals(aflgVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ (-2127709203)) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        agev agevVar = this.i;
        agev agevVar2 = this.h;
        agev agevVar3 = this.g;
        agev agevVar4 = this.f;
        agev agevVar5 = this.e;
        agev agevVar6 = this.a;
        agev agevVar7 = this.d;
        agev agevVar8 = this.c;
        return "TikTokWorkManagerClientConfiguration{jobSchedulerJobIdRange=" + String.valueOf(this.b) + ", minimumLoggingLevel=" + String.valueOf(agevVar8) + ", initializationExceptionHandler=" + String.valueOf(agevVar7) + ", defaultProcessName=" + String.valueOf(agevVar6) + ", useRemoteWorkManager=false, maxSchedulerLimit=" + String.valueOf(agevVar5) + ", schedulingExceptionHandler=" + String.valueOf(agevVar4) + ", workerExecutionExceptionHandler=" + String.valueOf(agevVar3) + ", markingJobsAsImportantWhileForeground=" + String.valueOf(agevVar2) + ", isRemoteCancellationPropagationFixEnabled=" + String.valueOf(agevVar) + '}';
    }

    public aflg() {
        throw null;
    }
}
