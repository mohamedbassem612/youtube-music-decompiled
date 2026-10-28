package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dda {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final bwb c = new bwb();
    public final StringBuilder d = new StringBuilder();

    public static String a(bwb bwbVar, StringBuilder sb) {
        char c;
        sb.setLength(0);
        int i = bwbVar.c;
        int i2 = bwbVar.d;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (i < i2 && !z) {
                    c = (char) bwbVar.b[i];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            i++;
        }
        bwbVar.Q(i - bwbVar.c);
        return sb.toString();
    }

    static String b(bwb bwbVar, StringBuilder sb) {
        c(bwbVar);
        if (bwbVar.d() == 0) {
            return null;
        }
        String strA = a(bwbVar, sb);
        return !strA.isEmpty() ? strA : String.valueOf((char) bwbVar.n());
    }

    static void c(bwb bwbVar) {
        while (true) {
            for (boolean z = true; bwbVar.d() > 0 && z; z = false) {
                int i = bwbVar.c;
                byte[] bArr = bwbVar.b;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    bwbVar.Q(1);
                } else {
                    int i2 = bwbVar.d;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                bwbVar.Q(i2 - bwbVar.c);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
