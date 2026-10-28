package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qxn {
    public final /* synthetic */ qxp a;
    private final long b;

    public qxn(qxp qxpVar, long j) {
        this.a = qxpVar;
        this.b = j;
    }

    public final void a() {
        qxp qxpVar = this.a;
        if (Thread.currentThread() != qxpVar.a.getThread()) {
            throw new IllegalStateException("Audio renderer is accessed on the wrong thread.");
        }
        long j = this.b;
        Map map = qxpVar.c;
        Long lValueOf = Long.valueOf(j);
        int iIntValue = ((Integer) j$.util.Map.EL.getOrDefault(map, lValueOf, 0)).intValue();
        if (iIntValue == 1) {
            map.remove(lValueOf);
        } else if (iIntValue > 1) {
            map.put(lValueOf, Integer.valueOf(iIntValue - 1));
        }
        qxpVar.c();
    }
}
