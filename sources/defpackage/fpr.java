package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpr {
    private static final agkh a = new agkh(4);
    private final StringBuffer b;

    public fpr(String str) {
        this.b = new StringBuffer(str);
    }

    public static Map a(fhd fhdVar) {
        fly flyVar = fhdVar.f;
        if (flyVar == null) {
            return a.d(true);
        }
        fpr fprVar = (fpr) flyVar.c(fpr.class);
        if (fprVar == null) {
            return a.d(true);
        }
        agkh agkhVar = new agkh(4);
        agkhVar.e("Component name", fprVar.b.toString());
        return agkhVar.d(true);
    }

    public static synchronized void b(fhd fhdVar, String str) {
        fly flyVar = fhdVar.f;
        if (flyVar == null) {
            fly flyVar2 = new fly();
            flyVar2.d(fpr.class, new fpr(str));
            fhdVar.f = flyVar2;
            return;
        }
        fpr fprVar = (fpr) flyVar.c(fpr.class);
        if (fprVar == null) {
            flyVar.d(fpr.class, new fpr(str));
            return;
        }
        StringBuffer stringBuffer = fprVar.b;
        stringBuffer.append("|");
        stringBuffer.append(str);
        flyVar.d(fpr.class, fprVar);
    }
}
