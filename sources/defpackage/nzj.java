package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzj implements fvd {
    private final nuc a;

    public nzj(nuc nucVar) {
        this.a = nucVar;
    }

    @Override // defpackage.fvd
    public final void a(int i, String str, Throwable th, Map map) {
        String str2;
        nsl nslVarA;
        int i2 = i - 1;
        aslh aslhVar = (i2 == 1 || i2 == 2) ? aslh.LOG_TYPE_INTERNAL_ERROR : aslh.LOG_LEVEL_WARN;
        if (th == null) {
            th = new RuntimeException(str);
        }
        Throwable th2 = th;
        nuc nucVar = this.a;
        if (map == null || !map.containsKey("Component name") || (str2 = (String) map.get("Component name")) == null) {
            nslVarA = nsl.a;
        } else {
            nsk nskVarB = nsl.b();
            nskVarB.f = new StringBuilder(str2);
            nslVarA = nskVarB.a();
        }
        nucVar.f(aslhVar, nslVarA, th2, "Error reporter: %s", str);
    }
}
