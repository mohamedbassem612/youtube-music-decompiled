package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zjy {
    private static final Pattern a = Pattern.compile("[\\.$]");

    @Deprecated
    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(10, stackTraceElementArr.length);
        for (int i = 1; i < iMin; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String strJoin = TextUtils.join(".", new String[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()});
            String string = Integer.toString(stackTraceElement.getLineNumber());
            String[] strArrSplit = a.split(strJoin);
            for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                if (strArrSplit[i2].length() > 4) {
                    strArrSplit[i2] = strArrSplit[i2].substring(0, 4);
                }
            }
            sb.append(TextUtils.join(".", strArrSplit));
            sb.append('.');
            sb.append(string);
            if (i != iMin - 1) {
                sb.append('-');
            }
        }
        return sb.toString();
    }
}
