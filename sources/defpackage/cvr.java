package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cvr {
    public static final /* synthetic */ int c = 0;
    private static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            try {
                String strGroup = matcher.group(1);
                int i = bwp.a;
                int i2 = Integer.parseInt(strGroup, 16);
                int i3 = Integer.parseInt(matcher.group(2), 16);
                if (i2 > 0 || i3 > 0) {
                    this.a = i2;
                    this.b = i3;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final void b(bsx bsxVar) {
        agke agkeVarF = bsxVar.f(cyd.class, new bym(2));
        int i = ((agpi) agkeVarF).d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zC = c(((cyd) agkeVarF.get(i3)).c);
            i3++;
            if (zC) {
                return;
            }
        }
        agke agkeVarF2 = bsxVar.f(cyj.class, new bym(3));
        int i4 = ((agpi) agkeVarF2).d;
        while (i2 < i4) {
            boolean zC2 = c(((cyj) agkeVarF2.get(i2)).c);
            i2++;
            if (zC2) {
                return;
            }
        }
    }
}
