package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class txo {
    private static final tyn b = new txm();
    public static final tyn a = new txn();

    public static String a(String str) {
        int i;
        int iIndexOf;
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i2 = tqr.a;
            if (tqjVar.k(1073830508)) {
                int iIndexOf2 = str.indexOf(59);
                while (iIndexOf2 >= 0) {
                    int i3 = iIndexOf2 + 1;
                    int length = str.length();
                    int i4 = i3;
                    while (i4 < length && str.charAt(i4) == ' ') {
                        i4++;
                    }
                    if (str.startsWith("codecs=\"", i4) && (iIndexOf = str.indexOf(34, (i = i4 + 8))) >= 0) {
                        return str.substring(i, iIndexOf);
                    }
                    iIndexOf2 = str.indexOf(59, i3);
                }
                return null;
            }
        }
        Matcher matcher = ((Pattern) b.io()).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static String b(String str) {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830508)) {
                int iIndexOf = str.indexOf(59);
                return iIndexOf >= 0 ? str.substring(0, iIndexOf) : str;
            }
        }
        return c(str);
    }

    public static String c(String str) {
        return str.split(";", 2)[0];
    }

    public static boolean d(String str) {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830508)) {
                int iIndexOf = str.indexOf(59);
                if (iIndexOf < 0) {
                    iIndexOf = str.length();
                }
                return iIndexOf >= 4 && str.regionMatches(iIndexOf + (-4), "webm", 0, 4);
            }
        }
        return c(str).endsWith("webm");
    }
}
