package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avks {
    static final auyp a;

    static {
        Logger.getLogger(avks.class.getName());
        if (!ahno.aa(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE");
        }
        a = new auyp("internal-stub-type", null);
    }

    private avks() {
    }

    public static avkw a(auyt auytVar, avkw avkwVar) {
        avkwVar.getClass();
        avkp avkpVar = new avkp(auytVar);
        avkq avkqVar = new avkq(avkwVar, avkpVar);
        auytVar.a(avkqVar, new avbe());
        avkqVar.b.d();
        return avkpVar;
    }
}
