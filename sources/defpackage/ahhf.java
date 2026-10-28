package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhf {
    private final Map c = new HashMap();
    private static final ahgw b = new ahjz();
    public static final ahhf a = b();

    private static ahhf b() {
        ahhf ahhfVar = new ahhf();
        try {
            ahhfVar.a(b, ahhd.class);
            return ahhfVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(ahgw ahgwVar, Class cls) {
        Map map = this.c;
        ahgw ahgwVar2 = (ahgw) map.get(cls);
        if (ahgwVar2 != null && !ahgwVar2.equals(ahgwVar)) {
            throw new GeneralSecurityException(a.cs(cls, "Different key creator for parameters class ", " already inserted"));
        }
        map.put(cls, ahgwVar);
    }
}
