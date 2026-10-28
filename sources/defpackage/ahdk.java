package defpackage;

import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdk {
    final AtomicReference a = new AtomicReference(ahdl.a);
    public final ahde b;
    public final aheo c;

    public ahdk(aheo aheoVar, ahde ahdeVar) {
        this.c = aheoVar;
        this.b = ahdeVar;
    }

    final void a(ahde ahdeVar) {
        b(ahdl.a, ahdl.b);
        ahdeVar.b(this.b, MoreExecutors.directExecutor());
    }

    public final void b(ahdl ahdlVar, ahdl ahdlVar2) {
        ahno.U(c(ahdlVar, ahdlVar2), "Expected status to be %s, but it was %s", ahdlVar, ahdlVar2);
    }

    final boolean c(ahdl ahdlVar, ahdl ahdlVar2) {
        return a.av(this.a, ahdlVar, ahdlVar2);
    }

    final aheo d() {
        ahdk ahdkVar;
        if (c(ahdl.a, ahdl.c)) {
            ahdkVar = this;
            ahdm.a.a().logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture$State", "finishToFuture", "will close {0}", ahdkVar);
            ahdkVar.c.addListener(new acem(ahdkVar, 17), MoreExecutors.directExecutor());
        } else {
            ahdkVar = this;
            int iOrdinal = ((ahdl) ahdkVar.a.get()).ordinal();
            if (iOrdinal == 0) {
                throw new AssertionError();
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return ahdkVar.c;
    }

    public final String toString() {
        ageu ageuVar = new ageu("ClosingFuture");
        ageuVar.b("status", this.a.get());
        ageuVar.a(this.c);
        return ageuVar.toString();
    }
}
