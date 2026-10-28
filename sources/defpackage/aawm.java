package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawm {
    public static final /* synthetic */ int a = 0;
    private static final qci[] b = {new qci(",SEQ=1"), new qci(",SEQ=2")};
    private static final qci c = new qci(",SEQ=null");
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private static final int[] e;
    private static final ahto[] f;

    static {
        ahto[] ahtoVarArr = new ahto[2];
        for (int i = 0; i < 2; i++) {
            qci qciVar = b[i];
            qciVar.getClass();
            ahtoVarArr[i] = new ahto(qciVar);
        }
        f = ahtoVarArr;
        e = new int[]{0};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public static final qci a(qci qciVar, String str) {
        tqj tqjVar = tqi.a;
        if (tqjVar == null) {
            return qciVar;
        }
        int i = tqr.a;
        if (!tqjVar.k(1073829096)) {
            return qciVar;
        }
        ahto ahtoVarC = c(str);
        if (ahtoVarC == null) {
            ConcurrentHashMap concurrentHashMap = d;
            qci qciVarA = (qci) concurrentHashMap.get(qciVar);
            if (qciVarA == null) {
                qciVarA = qci.a(qciVar, c);
                concurrentHashMap.put(qciVar, qciVarA);
            }
            return qciVarA;
        }
        ?? r0 = ahtoVarC.b;
        qci qciVar2 = (qci) ((ConcurrentHashMap) r0).get(qciVar);
        if (qciVar2 != null) {
            return qciVar2;
        }
        qci qciVarA2 = qci.a(qciVar, (qci) ahtoVarC.a);
        r0.put(qciVar, qciVarA2);
        return qciVarA2;
    }

    public static final qci b(String str, String str2) {
        return a(new qci(str), str2);
    }

    private static final synchronized ahto c(String str) {
        if (str == null) {
            return null;
        }
        int[] iArr = e;
        int i = iArr[0];
        ahto[] ahtoVarArr = f;
        ahto ahtoVar = ahtoVarArr[i];
        if (!awrc.c(str, ahtoVar.c)) {
            int i2 = i ^ 1;
            ahto ahtoVar2 = ahtoVarArr[i2];
            if (awrc.c(str, ahtoVar2.c)) {
                iArr[0] = i2;
            } else if (ahtoVar.c == null) {
                ahtoVar.c = str;
            } else {
                ahtoVar2.c = str;
                iArr[0] = i2;
            }
            return ahtoVar2;
        }
        return ahtoVar;
    }
}
