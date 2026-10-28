package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class axiw {
    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int iIndexOf = str.indexOf("reload_token_");
        return iIndexOf == -1 ? "" : str.substring(iIndexOf + 13);
    }
}
