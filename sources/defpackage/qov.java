package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qov implements qox {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private final boolean c(String str, boolean z) {
        String str2 = (String) ConcurrentMap.EL.computeIfAbsent(this.a, str, new rmm(1));
        return !str2.isEmpty() ? str2.equals("true") : z;
    }

    @Override // defpackage.qox
    public final boolean a(omj omjVar) {
        return c((String) omjVar.a, false);
    }

    @Override // defpackage.qox
    public final boolean b(omj omjVar) {
        if (c("debug.social", true)) {
            return c((String) omjVar.a, true);
        }
        return false;
    }
}
