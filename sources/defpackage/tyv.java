package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyv implements Comparable {
    public final int[] a;
    private final String b;
    private final int c;
    private final int d;

    public tyv(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt >= '0' && cCharAt <= '9') {
                    i3 = i4 + 1;
                    i2 += i == 0 ? 1 : 0;
                    i++;
                } else if (cCharAt != '.' || i <= 0) {
                    break;
                } else {
                    i = 0;
                }
            }
            int i5 = (i2 << 16) | i3;
            if (i5 != 0) {
                this.d = (char) i5;
                int i6 = i5 >> 16;
                this.c = i6;
                this.b = str;
                this.a = new int[i6];
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    char cCharAt2 = i7 == this.d ? (char) 0 : str.charAt(i7);
                    if (cCharAt2 < '0' || cCharAt2 > '9') {
                        int i10 = i8 + 1;
                        this.a[i8] = i9;
                        if (i10 == this.c) {
                            return;
                        }
                        i9 = 0;
                        i8 = i10;
                    } else {
                        i9 = (i9 * 10) + (cCharAt2 - '0');
                    }
                    i7++;
                }
            }
        }
        this.d = 0;
        this.c = 0;
        this.a = new int[0];
        this.b = "";
    }

    public final int[] a() {
        int[] iArr;
        int length;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.a;
            length = iArr.length;
            if (i >= length) {
                break;
            }
            if (iArr[i] != 0) {
                i2 = i;
            }
            i++;
        }
        int i3 = i2 + 1;
        return i3 == length ? iArr : Arrays.copyOf(iArr, i3);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int[] iArrA = a();
        int[] iArrA2 = ((tyv) obj).a();
        int iMin = Math.min(iArrA.length, iArrA2.length);
        for (int i = 0; i < iMin; i++) {
            int i2 = iArrA[i] - iArrA2[i];
            if (i2 != 0) {
                return i2;
            }
        }
        return iArrA.length - iArrA2.length;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tyv) && Arrays.equals(a(), ((tyv) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(a()) + 527;
    }

    public final String toString() {
        String str;
        String strSubstring;
        int i = this.c;
        if (i <= 3) {
            StringBuilder sb = new StringBuilder(this.b.substring(0, this.d));
            while (i < 3) {
                if (i > 0) {
                    sb.append('.');
                }
                sb.append('0');
                i++;
            }
            strSubstring = sb.toString();
        } else {
            int i2 = 0;
            int iIndexOf = 0;
            while (true) {
                str = this.b;
                if (i2 >= 3) {
                    break;
                }
                iIndexOf = str.indexOf(46, iIndexOf + 1);
                i2++;
            }
            strSubstring = str.substring(0, iIndexOf);
        }
        return String.valueOf(strSubstring).concat(String.valueOf(this.b.substring(this.d)));
    }
}
