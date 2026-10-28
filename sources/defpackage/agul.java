package defpackage;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agul extends agsw {
    private static volatile boolean a = false;
    private final Logger b;

    public agul(Logger logger) {
        this.b = logger;
    }

    private static void f(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler handler : logger.getHandlers()) {
            handler.publish(logRecord);
        }
        if (!logger.getUseParentHandlers() || (parent = logger.getParent()) == null) {
            return;
        }
        f(parent, logRecord);
    }

    @Override // defpackage.agsw
    public final String a() {
        return this.b.getName();
    }

    @Override // defpackage.agsw
    public final void b(RuntimeException runtimeException, agsu agsuVar) {
        e(new agun(runtimeException, agsuVar, agtu.f()), agsuVar.J());
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        e(new agun(agsuVar, agtu.f(), (byte[]) null), agsuVar.J());
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        return this.b.isLoggable(level);
    }

    public final void e(LogRecord logRecord, boolean z) {
        if (z) {
            Logger logger = this.b;
            if (!logger.isLoggable(logRecord.getLevel())) {
                Filter filter = logger.getFilter();
                if (filter != null) {
                    filter.isLoggable(logRecord);
                }
                if (logger.getClass() == Logger.class || a) {
                    f(this.b, logRecord);
                    return;
                }
                Logger logger2 = Logger.getLogger(String.valueOf(logger.getName()).concat(".__forced__"));
                try {
                    logger2.setLevel(Level.ALL);
                    logger2.log(logRecord);
                    return;
                } catch (SecurityException unused) {
                    a = true;
                    Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger subclasses.\n");
                    f(this.b, logRecord);
                    return;
                }
            }
        }
        this.b.log(logRecord);
    }
}
