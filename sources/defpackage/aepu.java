package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aepu implements qic {
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final agke f;

    static {
        Pattern patternCompile = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)");
        a = patternCompile;
        Pattern patternCompile2 = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?");
        b = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)");
        c = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback");
        d = patternCompile4;
        Pattern patternCompile5 = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback");
        e = patternCompile5;
        f = agke.u(new aeps(patternCompile, "rpc"), new aeps(patternCompile3, "googleapis"), new aeps(patternCompile2, "yt"), new aept(patternCompile4, "onesie-initplayback"), new aept(patternCompile5, "videoplayback"));
    }

    @Override // defpackage.qic
    public final String a(String str) {
        agke agkeVar = f;
        int i = ((agpi) agkeVar).d;
        int i2 = 0;
        while (i2 < i) {
            String strA = ((aeps) agkeVar.get(i2)).a(str);
            i2++;
            if (strA != null) {
                return strA;
            }
        }
        return str;
    }
}
