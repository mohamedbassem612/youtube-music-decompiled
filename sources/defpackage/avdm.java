package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avdm {
    static final Logger a = Logger.getLogger(auys.class.getName());
    public final Object b = new Object();
    public final avaa c;

    public avdm(avaa avaaVar, long j, String str) {
        avaaVar.getClass();
        this.c = avaaVar;
        auzt auztVar = new auzt();
        auztVar.a = str.concat(" created");
        auztVar.b = auzu.b;
        auztVar.b(j);
        b(auztVar.a());
    }

    static void a(avaa avaaVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + avaaVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(auzv auzvVar) {
        Level level;
        int iOrdinal = auzvVar.b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, auzvVar.a);
    }
}
