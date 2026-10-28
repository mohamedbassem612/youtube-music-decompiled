package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class auza {
    public static final auza a = new auza(new auyx(1), auyx.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public auza(auyz... auyzVarArr) {
        for (int i = 0; i < 2; i++) {
            auyz auyzVar = auyzVarArr[i];
            this.b.put(auyzVar.b(), auyzVar);
        }
    }
}
