package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class aeps {
    final Pattern a;
    final String b;

    public aeps(Pattern pattern, String str) {
        this.a = pattern;
        this.b = str;
    }

    public String a(String str) {
        Matcher matcher = this.a.matcher(str);
        if (!matcher.find() || matcher.groupCount() != 2) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        return this.b + '-' + strGroup + '-' + strGroup2.replace("/", "-");
    }
}
