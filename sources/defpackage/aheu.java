package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aheu {
    private final agga a = new agga();
    private final String b;
    private volatile Logger c;

    public aheu(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.c;
        if (logger == null) {
            synchronized (this.a) {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    logger = logger2;
                } else {
                    this.c = Logger.getLogger(this.b);
                    logger = this.c;
                }
            }
        }
        return logger;
    }
}
