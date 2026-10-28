package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahgm {
    public static final Logger a = Logger.getLogger(ahgm.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private ahgm() {
    }

    public static boolean a() {
        return b.get();
    }
}
