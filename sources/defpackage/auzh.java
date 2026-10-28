package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auzh {
    static final Logger a = Logger.getLogger(auzh.class.getName());
    public static final auzh b = new auzh();

    private auzh() {
    }

    public static auzh b() {
        auzh auzhVarA = auzf.a.a();
        return auzhVarA == null ? b : auzhVarA;
    }

    public final auzh a() {
        auzh auzhVarB = auzf.a.b(this);
        return auzhVarB == null ? b : auzhVarB;
    }

    public final void c(auzh auzhVar) {
        if (auzhVar == null) {
            throw new NullPointerException("toAttach");
        }
        auzf.a.c(this, auzhVar);
    }
}
