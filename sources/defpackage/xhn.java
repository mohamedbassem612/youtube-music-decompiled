package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xhn {
    public final long a;

    public xhn(amud amudVar) {
        long j;
        if (amudVar == null || (amudVar.c & 2) == 0) {
            j = 0;
        } else {
            argh arghVar = amudVar.e;
            j = (arghVar == null ? argh.a : arghVar).c;
        }
        this.a = j;
    }

    private static boolean c(long j, amec amecVar) {
        return (j & ((long) amecVar.i)) > 0;
    }

    public final amec a() {
        long j = this.a;
        amec amecVar = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_HIDDEN;
        if (c(j, amecVar)) {
            return amecVar;
        }
        amec amecVar2 = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_HIDDEN;
        return !c(j, amecVar2) ? amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN : amecVar2;
    }

    public final amec b() {
        long j = this.a;
        amec amecVar = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_SHOWN;
        if (c(j, amecVar)) {
            return amecVar;
        }
        amec amecVar2 = amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_LOG_WHEN_FIRST_SHOWN;
        return !c(j, amecVar2) ? amec.INTERACTION_LOGGING_VISIBILITY_EVENT_TYPE_UNKNOWN : amecVar2;
    }

    public xhn(long j) {
        this.a = j;
    }
}
