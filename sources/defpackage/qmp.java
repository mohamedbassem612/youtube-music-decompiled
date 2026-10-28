package defpackage;

import java.io.File;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qmp {
    public static final /* synthetic */ int a = 0;
    private static final qsa b = new qsa(qll.a);
    private static final Object c = new Object();
    private static volatile rrq d = null;

    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public static boolean a(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            boolean z = true;
            for (File file2 : fileArrListFiles) {
                z = z && a(file2);
            }
            if (z) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    public static qrx b(qkh qkhVar) {
        qrl qrlVarA = qrm.a();
        Pattern pattern = qpr.a;
        qpq qpqVar = new qpq(qkhVar.c);
        qpqVar.c("phenotype");
        qpqVar.d("all_accounts.pb");
        qrlVarA.f(qpqVar.a());
        qrlVarA.e(qll.a);
        qrlVarA.d(b);
        qrlVarA.c();
        qrm qrmVarA = qrlVarA.a();
        rrq rrqVar = d;
        if (rrqVar == null) {
            synchronized (c) {
                rrqVar = d;
                if (rrqVar == null) {
                    qsb qsbVar = qsb.a;
                    HashMap map = new HashMap();
                    ahey aheyVarB = qkhVar.b();
                    ayq ayqVar = (ayq) qkhVar.e.io();
                    rmp.C(qrr.a, map);
                    rrq rrqVar2 = new rrq(aheyVarB, ayqVar, qsbVar, map);
                    d = rrqVar2;
                    rrqVar = rrqVar2;
                }
            }
        }
        return rrqVar.c(qrmVarA);
    }
}
