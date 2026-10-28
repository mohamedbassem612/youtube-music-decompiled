package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxq {
    private static final String[][] a;

    static {
        float[] fArr = {0.0f, 12.0f, 14.0f, 16.0f};
        float[] fArr2 = {100.0f, 200.0f, 300.0f, 400.0f, 500.0f, 600.0f, 700.0f, 800.0f, 900.0f, 1000.0f};
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, 4, 10);
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                strArr[i][i2] = c(fArr2[i2], 100.0f, 0.0f, 0.0f, 0.0f, fArr[i]);
            }
        }
        a = strArr;
    }

    public static String a(float f) {
        if (f <= 0.0f || !yno.G(f)) {
            return "";
        }
        if (f == 14.0f) {
            return "'opsz' 14";
        }
        if (f == 12.0f) {
            return "'opsz' 12";
        }
        if (f == 16.0f) {
            return "'opsz' 16";
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("'opsz' ");
        d(sb, f);
        return sb.toString();
    }

    public static String b(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f3 == 0.0f && f2 == 100.0f && f4 == 0.0f && f5 == 0.0f) {
            int i = (int) f;
            byte b = -1;
            int i2 = (((float) i) != f || i < 100 || i > 1000 || i % 100 != 0) ? -1 : (i / 100) - 1;
            if (f6 == 0.0f) {
                b = 0;
            } else if (f6 == 12.0f) {
                b = 1;
            } else if (f6 == 14.0f) {
                b = 2;
            } else if (f6 == 16.0f) {
                b = 3;
            }
            if (i2 >= 0 && b >= 0) {
                return a[b][i2];
            }
        }
        return c(f, f2, f3, f4, f5, f6);
    }

    private static String c(float f, float f2, float f3, float f4, float f5, float f6) {
        StringBuilder sb = new StringBuilder(80);
        if (f6 > 0.0f && yno.G(f6)) {
            sb.append("'opsz' ");
            d(sb, f6);
            sb.append(", ");
        }
        sb.append("'slnt' ");
        d(sb, f3);
        sb.append(", 'wdth' ");
        d(sb, f2);
        sb.append(", 'wght' ");
        d(sb, f);
        sb.append(", 'GRAD' ");
        d(sb, f4);
        sb.append(", 'ROND' ");
        d(sb, f5);
        return sb.toString();
    }

    private static void d(StringBuilder sb, float f) {
        if (!yno.G(f)) {
            sb.append(0);
            return;
        }
        long j = (long) f;
        if (f == j) {
            sb.append(j);
        } else {
            sb.append(f);
        }
    }
}
