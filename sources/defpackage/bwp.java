package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.cardboard.sdk.R;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwp {
    private static HashMap l;

    @Deprecated
    public static final int a = Build.VERSION.SDK_INT;

    @Deprecated
    public static final String b = Build.DEVICE;

    @Deprecated
    public static final String c = Build.MODEL;
    public static final String d = Build.DEVICE + ", " + Build.MODEL + ", " + Build.MANUFACTURER + ", " + Build.VERSION.SDK_INT;
    public static final byte[] e = new byte[0];
    public static final long[] f = new long[0];
    private static final Pattern i = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
    public static final Pattern g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern j = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final Pattern k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
    private static final String[] m = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] n = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] o = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] p = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
    public static final int[] h = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, R.styleable.AppCompatTheme_windowNoTitle, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, ModuleDescriptor.MODULE_VERSION, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, R.styleable.AppCompatTheme_windowMinWidthMinor, 122, 137, 142, 135, SemanticState.Focused, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, R.styleable.AppCompatTheme_windowMinWidthMajor, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    public static long A(String str) throws bsz {
        Matcher matcher = i.matcher(str);
        if (!matcher.matches()) {
            throw new bsz("Invalid date/time format: ".concat(String.valueOf(str)), null, true, 1);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i3 = Integer.parseInt(matcher.group(12)) * 60;
            String strGroup = matcher.group(13);
            if (strGroup != null) {
                i3 += Integer.parseInt(strGroup);
            }
            i2 = i3;
            if ("-".equals(matcher.group(11))) {
                i2 = -i2;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
    }

    public static long B(long j2, int i2) {
        return D(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long C(long j2, long j3, long j4) {
        return D(j2, j3, j4, RoundingMode.DOWN);
    }

    public static long D(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3) {
            if (j4 % j3 == 0) {
                return afxw.U(j2, afxw.U(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j3 % j4 == 0) {
            return afxw.X(j2, afxw.U(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 >= j2) {
            if (j4 % j2 == 0) {
                return afxw.U(j3, afxw.U(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
            }
        } else if (j2 % j4 == 0) {
            return afxw.X(j3, afxw.U(j2, j4, RoundingMode.UNNECESSARY));
        }
        return au(j2, j3, j4, roundingMode);
    }

    public static long E(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static long F(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    public static Point G(Context context) {
        Point point;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && ae(context)) {
            String strO = Build.VERSION.SDK_INT < 28 ? O("sys.display-size") : O("vendor.display-size");
            if (!TextUtils.isEmpty(strO)) {
                try {
                    String[] strArrSplit = strO.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                bvx.c("Util", "Invalid display size: ".concat(String.valueOf(strO)));
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                Display.Mode mode = display.getMode();
                point.x = mode.getPhysicalWidth();
                point.y = mode.getPhysicalHeight();
            }
        } else {
            point = new Point();
            Display.Mode mode2 = display.getMode();
            point.x = mode2.getPhysicalWidth();
            point.y = mode2.getPhysicalHeight();
        }
        return point;
    }

    public static Handler H(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, callback);
    }

    public static Looper I() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
    }

    public static bse J(int i2, int i3, int i4) {
        bsd bsdVar = new bsd();
        bsdVar.e("audio/raw");
        bsdVar.G = i3;
        bsdVar.I = i4;
        bsdVar.J = i2;
        return new bse(bsdVar);
    }

    public static String K(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String L(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String M(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, StandardCharsets.UTF_8);
    }

    public static String N(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static String O(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            bvx.d("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String P(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String Q(Context context, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamOpen;
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                String strL = L(agyi.b(inputStreamOpen));
                afxw.h(inputStreamOpen);
                return strL;
            } catch (Throwable th2) {
                th = th2;
                afxw.h(inputStreamOpen);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strAe = ahno.ae(str);
        int i2 = 0;
        String str2 = strAe.split("-", 2)[0];
        HashMap mapAv = l;
        if (mapAv == null) {
            mapAv = av();
            l = mapAv;
        }
        String str3 = (String) mapAv.get(str2);
        if (str3 != null) {
            strAe = str3.concat(String.valueOf(strAe.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strAe;
        }
        while (true) {
            String[] strArr = n;
            int length = strArr.length;
            if (i2 >= 18) {
                return strAe;
            }
            if (strAe.startsWith(strArr[i2])) {
                return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(strAe.substring(strArr[i2].length())));
            }
            i2 += 2;
        }
    }

    public static String S(int i2) {
        return new String(ahng.R(i2), StandardCharsets.US_ASCII);
    }

    public static String T(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 << 1);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = j.matcher(str);
        while (i2 > 0 && matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            char c2 = (char) Integer.parseInt(strGroup, 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static void U(List list, Object[] objArr) {
        ahno.O(list.size() == objArr.length);
        list.toArray(objArr);
    }

    public static void V(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                V(file2);
            }
        }
        file.delete();
    }

    public static void W(List list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static boolean X(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean Y(SparseBooleanArray sparseBooleanArray, int i2) {
        return sparseBooleanArray.indexOfKey(i2) >= 0;
    }

    public static boolean Z(bwb bwbVar, bwb bwbVar2, Inflater inflater) {
        boolean z = false;
        if (bwbVar.d() != 0) {
            if (bwbVar2.e() < bwbVar.d()) {
                bwbVar2.H(bwbVar.d() << 1);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(bwbVar.b, bwbVar.c, bwbVar.d());
            int iInflate = 0;
            while (true) {
                try {
                    iInflate += inflater.inflate(bwbVar2.b, iInflate, bwbVar2.e() - iInflate);
                    if (inflater.finished()) {
                        bwbVar2.O(iInflate);
                        z = true;
                        break;
                    }
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (iInflate == bwbVar2.e()) {
                        bwbVar2.H(bwbVar2.e() << 1);
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
            inflater.reset();
        }
        return z;
    }

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean aa(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean ab(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1895825408 || i2 == 1879048192 || i2 == 1912602624;
    }

    public static boolean ac(Context context) {
        if (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if ((Build.VERSION.SDK_INT == 30 && (ahno.ag(Build.MODEL, "moto g(20)") || ahno.ag(Build.MODEL, "moto e20") || ahno.ag(Build.MODEL, "rmx3231"))) || ahno.ag(Build.MODEL, "sm-a032f")) {
            return true;
        }
        return Build.VERSION.SDK_INT == 34 && ahno.ag(Build.MODEL, "sm-x200");
    }

    public static boolean ad(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean ae(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean af(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean ag(bwb bwbVar, bwb bwbVar2, Inflater inflater) {
        return bwbVar.d() > 0 && bwbVar.h() == 120 && Z(bwbVar, bwbVar2, inflater);
    }

    public static byte[] ah(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Object[] ai(Object[] objArr, int i2) {
        ahno.F(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] aj(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static long ak(long j2, long j3) {
        long jW = afxw.W(j2, j3);
        if ((jW != Long.MIN_VALUE || j2 + j3 == Long.MIN_VALUE) && jW != Long.MAX_VALUE) {
            return jW;
        }
        return Long.MAX_VALUE;
    }

    public static int al(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return !z ? i2 : iBinarySearch;
    }

    public static int am(List list, Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            return -(iBinarySearch + 2);
        }
        while (true) {
            int i2 = iBinarySearch - 1;
            if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(comparable) != 0) {
                break;
            }
            iBinarySearch = i2;
        }
        return iBinarySearch;
    }

    public static int an(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static double ao(double d2) {
        return Math.max(-1.0d, Math.min(d2, 1.0d));
    }

    public static Handler ap() {
        return new Handler(I(), null);
    }

    public static void aq(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    public static void ar(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jU = afxw.U(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = afxw.U(jArr[i2], jU, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jU2 = afxw.U(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = afxw.X(jArr[i2], jU2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 == 0) {
                j3 = j2;
            } else if (j2 >= j4) {
                if (j2 % j4 == 0) {
                    jArr[i3] = afxw.U(1000000L, afxw.U(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                    j3 = j2;
                } else {
                    j3 = j2;
                    jArr[i3] = au(j4, 1000000L, j3, roundingMode);
                }
            } else if (j4 % j2 == 0) {
                jArr[i3] = afxw.X(1000000L, afxw.U(j4, j2, RoundingMode.UNNECESSARY));
                j3 = j2;
            } else {
                j3 = j2;
                jArr[i3] = au(j4, 1000000L, j3, roundingMode);
            }
            i3++;
            j2 = j3;
        }
    }

    public static boolean as(SQLiteDatabase sQLiteDatabase) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0;
    }

    public static int at(zh zhVar, long j2) {
        int i2 = zhVar.a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (zhVar.a(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < zhVar.a && zhVar.a(i5) == j2) {
            return i5;
        }
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    private static long au(long j2, long j3, long j4, RoundingMode roundingMode) {
        long jX = afxw.X(j2, j3);
        if (jX != Long.MAX_VALUE && jX != Long.MIN_VALUE) {
            return afxw.U(jX, j4, roundingMode);
        }
        long jV = afxw.V(Math.abs(j3), Math.abs(j4));
        long jU = afxw.U(j3, jV, RoundingMode.UNNECESSARY);
        long jU2 = afxw.U(j4, jV, RoundingMode.UNNECESSARY);
        long jV2 = afxw.V(Math.abs(j2), Math.abs(jU2));
        long jU3 = afxw.U(j2, jV2, RoundingMode.UNNECESSARY);
        long jU4 = afxw.U(jU2, jV2, RoundingMode.UNNECESSARY);
        long jX2 = afxw.X(jU3, jU);
        if (jX2 != Long.MAX_VALUE && jX2 != Long.MIN_VALUE) {
            return afxw.U(jX2, jU4, roundingMode);
        }
        double d2 = jU3 * (jU / jU4);
        if (d2 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return ahbd.b(d2, roundingMode);
    }

    private static HashMap av() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = m.length;
        HashMap map = new HashMap(length + 88);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = m;
            int length3 = strArr.length;
            if (i2 >= 88) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int b(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static int c(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int d(int i2, int i3) {
        return (char) (((char) (i3 << 4)) ^ p[(i3 >> 12) ^ i2]);
    }

    public static int e(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[(i4 >>> 24) ^ (bArr[i2] & 255)] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int f(int i2) {
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Alert.DURATION_SHOW_INDEFINITELY;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int g(int i2) {
        int i3;
        int i4 = 6396;
        if (i2 != 10) {
            if (i2 == 16) {
                i3 = 205215996;
            } else if (i2 != 24) {
                switch (i2) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case 6:
                        return 252;
                    case 7:
                        return 1276;
                    case 8:
                        return 6396;
                    default:
                        switch (i2) {
                            case 12:
                                return 743676;
                            case 13:
                                i3 = 30136348;
                                break;
                            case 14:
                                i3 = 202070268;
                                break;
                            default:
                                return 0;
                        }
                        break;
                }
            } else {
                i3 = 67108860;
            }
            i4 = 0;
        } else {
            i3 = 737532;
        }
        return Build.VERSION.SDK_INT >= 32 ? i3 : i4;
    }

    public static int h(bse bseVar) {
        int i2 = bseVar.J;
        return i2 == -1 ? g(bseVar.I) : i2;
    }

    public static int i(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() != ByteOrder.BIG_ENDIAN ? Integer.reverseBytes(i3) : i3;
    }

    public static int j(int i2) {
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        if (i2 != 4) {
            if (i2 != 21) {
                if (i2 != 22) {
                    if (i2 == 268435456) {
                        return 2;
                    }
                    if (i2 != 1342177280) {
                        if (i2 != 1610612736) {
                            if (i2 != 1879048192) {
                                if (i2 != 1895825408) {
                                    if (i2 != 1912602624) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                            return 8;
                        }
                    }
                }
            }
            return 3;
        }
        return 4;
    }

    public static int k(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
                            case 15:
                                break;
                            case 16:
                            case 18:
                                break;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i2) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
            }
            return 6004;
        }
        return 6005;
    }

    public static int l(String str) {
        String[] strArrSplit;
        int length;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        try {
            str2.getClass();
            int i2 = Integer.parseInt(str2);
            return z ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int m(int i2) {
        return n(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static int n(int i2, ByteOrder byteOrder) {
        if (i2 == 32) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 4 : 1895825408;
        }
        if (i2 != 64) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 1879048192 : 1912602624;
    }

    public static int o(String str) {
        int iCharAt = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            iCharAt = (iCharAt << 8) | str.charAt(i2);
        }
        return iCharAt;
    }

    public static int p(int i2) {
        return q(i2, ByteOrder.LITTLE_ENDIAN);
    }

    public static int q(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r6.contains("format=m3u8-aapl") != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r(android.net.Uri r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwp.r(android.net.Uri, java.lang.String):int");
    }

    public static int s(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static long t(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long u(long j2, int i2) {
        return D(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static long v(long j2, float f2) {
        return f2 != 1.0f ? Math.round(j2 * ((double) f2)) : j2;
    }

    public static long w(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static long x(long j2, float f2) {
        return f2 != 1.0f ? Math.round(j2 / ((double) f2)) : j2;
    }

    public static long y(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long z(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000000;
    }
}
