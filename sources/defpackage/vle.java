package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vle implements vlc {
    public static final String b = "[a-zA-Z\\d\\p{Punct}\\p{Sc} \t\n+×÷√π¬=≈~±<>≤≥^∑∆|µΠΩ`•˚¡®©™…✓˚∆∂ƒß˙°∞←↑↓→♥♦♠♣♪¶]*";

    private static final void b(String str) {
        zvp.a(zvn.b, zvm.M, "SimpleDetectLanguageImpl regex failed to match. ".concat(str));
    }

    private static final String c(String str) {
        try {
            Pattern.compile(b);
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (!Character.isWhitespace(cCharAt)) {
                    try {
                        if (Character.toString(cCharAt).matches(b)) {
                            i++;
                        } else {
                            i2++;
                        }
                    } catch (PatternSyntaxException e) {
                        b("Cannot match char: ".concat(String.valueOf(e.getMessage())));
                    }
                }
            }
            return ((float) i) / ((float) (i + i2)) >= 0.9f ? "en" : "und";
        } catch (PatternSyntaxException e2) {
            b("Cannot compile regex: ".concat(String.valueOf(e2.getMessage())));
            return "und";
        }
    }

    @Override // defpackage.vlc
    public final ListenableFuture a(String str) {
        return ahng.n(agke.q(new vld(c(str))));
    }
}
