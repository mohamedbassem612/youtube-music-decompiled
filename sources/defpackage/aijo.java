package defpackage;

import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aijo {
    public static final String[] a = new String[SemanticState.Focused];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\%03o", Integer.valueOf(i));
        }
        String[] strArr = a;
        strArr[127] = "\\177";
        strArr[34] = "\\\"";
        strArr[39] = "\\'";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        strArr[7] = "\\a";
        strArr[11] = "\\v";
    }

    static String a(aigj aigjVar) {
        return a.ad(aigjVar.G());
    }
}
