package defpackage;

import android.content.res.Resources;
import com.google.android.apps.youtube.music.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class typ {
    public static final /* synthetic */ int a = 0;
    private static final agfr b = aguu.al(new jxp(17));
    private static final agfr c = aguu.al(new jxp(18));

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public static String c(String str) {
        return str == null ? "" : str;
    }

    public static String d(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static List e(String str, int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < (str.length() / i) + 1) {
            int i3 = i2 * i;
            i2++;
            int length = i2 * i;
            if (length >= str.length()) {
                length = str.length();
            }
            arrayList.add(str.substring(i3, length));
        }
        return arrayList;
    }

    public static void f(String str) {
        if (ahno.aa(str)) {
            throw new IllegalArgumentException();
        }
    }

    public static String g(Resources resources, long j) {
        String str;
        String string;
        NumberFormat numberFormat = (NumberFormat) c.io();
        if (j >= 1073741824) {
            str = numberFormat.format(Math.min(Math.ceil(j / 1.073741824E9d), 999.0d));
        } else {
            str = j >= 1048576 ? numberFormat.format(Math.ceil(j / 1048576.0d)) : numberFormat.format(Math.ceil(j / 1024.0d));
        }
        if (j >= 1073741824) {
            string = resources.getString(R.string.byte_unit_gb);
        } else {
            string = j >= 1048576 ? resources.getString(R.string.byte_unit_mb) : resources.getString(R.string.byte_unit_kb);
        }
        return ((axg) b.io()).b(resources.getString(R.string.num_bytes_with_unit, str, string));
    }

    public static String h(Resources resources, long j) {
        agfr agfrVar = b;
        return j < 1024 ? resources.getString(R.string.num_bytes_with_unit, ((axg) agfrVar.io()).b(String.valueOf(j)), resources.getString(R.string.byte_unit_mb)) : resources.getString(R.string.num_bytes_with_unit, ((axg) agfrVar.io()).b(String.valueOf(new DecimalFormat("#.##").format(j / 1024.0f))), resources.getString(R.string.byte_unit_gb));
    }

    public static String i(long j, int i) {
        String string;
        int i2;
        int i3;
        long j2;
        boolean z;
        int iA;
        long j3 = j;
        int iMax = i;
        tqj tqjVar = tqi.a;
        int i4 = 1;
        if (tqjVar != null) {
            int i5 = tqr.a;
            if (tqjVar.k(1073830472)) {
                axg axgVar = two.a;
                if (j3 == Long.MIN_VALUE) {
                    return two.a.b(iMax > 4 ? "--2562047788015215:-153722867280912930:-8" : "--153722867280912930:-8");
                }
                int i6 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                int iA2 = i6 >>> 31;
                if (i6 < 0) {
                    j3 = -j3;
                }
                if (j3 < 4000000000L) {
                    long j4 = (j3 * 2290649225L) >>> 37;
                    j2 = (2290649225L * j4) >>> 37;
                    i2 = (int) (j4 - (60 * j2));
                    i3 = (int) (j3 - (j4 * 60));
                } else {
                    long j5 = j3 / 60;
                    i2 = (int) (j5 % 60);
                    i3 = (int) (j3 % 60);
                    j2 = j5 / 60;
                }
                if (j2 > 0) {
                    z = true;
                } else if (iMax > 4) {
                    iMax = 5;
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = j2 > 0 || iMax > 3;
                if (z) {
                    if (j2 < 10) {
                        iA2 += 2;
                    } else {
                        iA2 = j2 < 100 ? iA2 + 3 : iA2 + two.a(j2) + 1;
                    }
                }
                char[] cArr = new char[((z2 || i2 >= 10) ? iA2 + 3 : iA2 + 2) + 2];
                if (i6 < 0) {
                    cArr[0] = '-';
                } else {
                    i4 = 0;
                }
                if (z) {
                    long j6 = 48;
                    if (j2 < 10) {
                        iA = i4 + 1;
                        cArr[i4] = (char) (j2 + 48);
                    } else if (j2 < 100) {
                        int i7 = (int) j2;
                        int i8 = (i7 * 103) >>> 10;
                        cArr[i4] = (char) (i8 + 48);
                        cArr[i4 + 1] = (char) ((i7 - (i8 * 10)) + 48);
                        iA = i4 + 2;
                    } else {
                        iA = two.a(j2) + i4;
                        int i9 = iA - 1;
                        while (i9 >= i4) {
                            long j7 = j6;
                            cArr[i9] = (char) ((j2 % 10) + j7);
                            j2 /= 10;
                            i9--;
                            j6 = j7;
                        }
                    }
                    i4 = iA + 1;
                    cArr[iA] = ':';
                }
                int i10 = i4 + 1;
                if (z2 || i2 >= 10) {
                    int i11 = (i2 * 103) >>> 10;
                    cArr[i4] = (char) (i11 + 48);
                    cArr[i10] = (char) ((i2 - (i11 * 10)) + 48);
                    i10 = i4 + 2;
                } else {
                    cArr[i4] = (char) (i2 + 48);
                }
                cArr[i10] = ':';
                int i12 = (i3 * 103) >>> 10;
                cArr[i10 + 1] = (char) (i12 + 48);
                cArr[i10 + 2] = (char) ((i3 - (i12 * 10)) + 48);
                return two.a.b(new String(cArr));
            }
        }
        StringBuilder sb = new StringBuilder(j3 < 0 ? "-" : "");
        long jAbs = Math.abs(j3);
        long j8 = jAbs / 60;
        long j9 = j8 / 60;
        if (j9 > 0) {
            j8 %= 60;
            iMax = Math.max(iMax, 5);
        }
        String string2 = Long.toString(jAbs % 60);
        if (string2.length() == 1) {
            string2 = "0".concat(String.valueOf(string2));
        }
        String string3 = Long.toString(j8);
        if (string3.length() == 1 && iMax > 3) {
            string3 = "0".concat(String.valueOf(string3));
        }
        if (iMax > 4) {
            sb.append(j9);
            sb.append(':');
            sb.append(string3);
            sb.append(':');
            sb.append(string2);
            string = sb.toString();
        } else {
            sb.append(string3);
            sb.append(':');
            sb.append(string2);
            string = sb.toString();
        }
        return ((axg) b.io()).b(string);
    }
}
