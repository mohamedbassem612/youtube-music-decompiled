package defpackage;

import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqq {
    static final /* synthetic */ zqq a = new zqq();

    public static final UUID a(zqs zqsVar) {
        zqr zqrVar = (zqr) atqq.ac(zqsVar.e());
        UUID uuid = zqrVar != null ? zqrVar.a : null;
        return uuid == null ? zqsVar.i() : uuid;
    }

    public static final List b(zqs zqsVar) {
        return zqsVar.f(a(zqsVar));
    }
}
