package defpackage;

import android.app.Notification;
import android.content.Intent;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class atv {
    static Notification.Style a() {
        return new Notification.DecoratedCustomViewStyle();
    }

    public static Object b(Intent intent, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return intent.getParcelableExtra(str, cls);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (cls.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }

    public static Uri c(String str, String str2) {
        return Uri.parse(d(str, str2));
    }

    public static String d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrM = m(str2);
        if (iArrM[0] != -1) {
            sb.append(str2);
            l(sb, iArrM[1], iArrM[2]);
            return sb.toString();
        }
        if (str == null) {
            str = "";
        }
        int[] iArrM2 = m(str);
        if (iArrM[3] == 0) {
            sb.append((CharSequence) str, 0, iArrM2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM[2] == 0) {
            sb.append((CharSequence) str, 0, iArrM2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrM[1] != 0) {
            int i = iArrM2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return l(sb, iArrM[1] + i, i + iArrM[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, iArrM2[1]);
            sb.append(str2);
            int i2 = iArrM2[1];
            return l(sb, i2, iArrM[2] + i2);
        }
        int i3 = iArrM2[0] + 2;
        int i4 = iArrM2[1];
        if (i3 >= i4 || i4 != iArrM2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrM2[2] - 1);
            int i5 = iLastIndexOf == -1 ? iArrM2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return l(sb, iArrM2[1], i5 + iArrM[2]);
        }
        sb.append((CharSequence) str, 0, i4);
        sb.append('/');
        sb.append(str2);
        int i6 = iArrM2[1];
        return l(sb, i6, iArrM[2] + i6 + 1);
    }

    public static boolean e(String str) {
        return (str == null || m(str)[0] == -1) ? false : true;
    }

    public static int f(MediaFormat mediaFormat, String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaFormat.getInteger(str, i);
        }
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static void g(MediaFormat mediaFormat, bru bruVar) {
        if (bruVar != null) {
            h(mediaFormat, "color-transfer", bruVar.d);
            h(mediaFormat, "color-standard", bruVar.b);
            h(mediaFormat, "color-range", bruVar.c);
            byte[] bArr = bruVar.e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void h(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void i(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(a.bR(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static float j(MediaFormat mediaFormat) {
        int integer;
        if (!mediaFormat.containsKey("frame-rate")) {
            return -1.0f;
        }
        if (Build.VERSION.SDK_INT < 29) {
            try {
                return mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            if (mediaFormat.getValueTypeForKey("frame-rate") == 3) {
                return mediaFormat.getFloat("frame-rate");
            }
            integer = mediaFormat.getInteger("frame-rate");
        }
        return integer;
    }

    public static void k(MediaFormat mediaFormat, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
    }

    private static String l(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            if (sb.charAt(i) == '/') {
                i++;
            }
            int i5 = i;
            int iLastIndexOf = i5;
            while (i5 <= i2) {
                if (i5 == i2) {
                    i3 = i5;
                } else {
                    i3 = i5 + 1;
                    if (sb.charAt(i5) != '/') {
                        i5 = i3;
                    }
                }
                int i6 = iLastIndexOf + 1;
                if (i5 == i6 && sb.charAt(iLastIndexOf) == '.') {
                    sb.delete(iLastIndexOf, i3);
                    i4 = i3 - iLastIndexOf;
                } else {
                    if (i5 == iLastIndexOf + 2 && sb.charAt(iLastIndexOf) == '.' && sb.charAt(i6) == '.') {
                        iLastIndexOf = sb.lastIndexOf("/", iLastIndexOf - 2) + 1;
                        int i7 = iLastIndexOf > i ? iLastIndexOf : i;
                        sb.delete(i7, i3);
                        i4 = i3 - i7;
                    } else {
                        iLastIndexOf = i5 + 1;
                    }
                    i5 = iLastIndexOf;
                }
                i2 -= i4;
                i5 = iLastIndexOf;
            }
        }
        return sb.toString();
    }

    private static int[] m(String str) {
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(35);
            if (iIndexOf != -1) {
                length = iIndexOf;
            }
            int iIndexOf2 = str.indexOf(63);
            if (iIndexOf2 == -1 || iIndexOf2 > length) {
                iIndexOf2 = length;
            }
            int iIndexOf3 = str.indexOf(47);
            if (iIndexOf3 == -1 || iIndexOf3 > iIndexOf2) {
                iIndexOf3 = iIndexOf2;
            }
            int iIndexOf4 = str.indexOf(58);
            if (iIndexOf4 > iIndexOf3) {
                iIndexOf4 = -1;
            }
            int i = iIndexOf4 + 2;
            int iIndexOf5 = iIndexOf4 + 1;
            if (i < iIndexOf2 && str.charAt(iIndexOf5) == '/' && str.charAt(i) == '/' && ((iIndexOf5 = str.indexOf(47, iIndexOf4 + 3)) == -1 || iIndexOf5 > iIndexOf2)) {
                iIndexOf5 = iIndexOf2;
            }
            iArr[0] = iIndexOf4;
            iArr[1] = iIndexOf5;
            iArr[2] = iIndexOf2;
            iArr[3] = length;
        }
        return iArr;
    }
}
