package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lga extends lea {
    private SecureRandom d;
    private final AtomicLong e;
    private int f;
    private Integer g;
    private static final String[] c = {"firebase_", "google_", "ga_"};
    public static final List a = Arrays.asList("currency", "transaction_id", "value");
    public static final String[] b = {"_err"};

    public lga(ldr ldrVar) {
        super(ldrVar);
        this.g = null;
        this.e = new AtomicLong(0L);
    }

    static MessageDigest A() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList D(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lbq lbqVar = (lbq) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", lbqVar.a);
            bundle.putString("origin", lbqVar.b);
            bundle.putLong("creation_timestamp", lbqVar.d);
            bundle.putString("name", lbqVar.c.b);
            Object objA = lbqVar.c.a();
            kro.l(objA);
            lqd.e(bundle, objA);
            bundle.putBoolean("active", lbqVar.e);
            String str = lbqVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            lcd lcdVar = lbqVar.g;
            if (lcdVar != null) {
                bundle.putString("timed_out_event_name", lcdVar.a);
                lcc lccVar = lcdVar.b;
                if (lccVar != null) {
                    bundle.putBundle("timed_out_event_params", lccVar.a());
                }
            }
            bundle.putLong("trigger_timeout", lbqVar.h);
            lcd lcdVar2 = lbqVar.i;
            if (lcdVar2 != null) {
                bundle.putString("triggered_event_name", lcdVar2.a);
                lcc lccVar2 = lcdVar2.b;
                if (lccVar2 != null) {
                    bundle.putBundle("triggered_event_params", lccVar2.a());
                }
            }
            bundle.putLong("triggered_timestamp", lbqVar.c.c);
            bundle.putLong("time_to_live", lbqVar.j);
            lcd lcdVar3 = lbqVar.k;
            if (lcdVar3 != null) {
                bundle.putString("expired_event_name", lcdVar3.a);
                lcc lccVar3 = lcdVar3.b;
                if (lccVar3 != null) {
                    bundle.putBundle("expired_event_params", lccVar3.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void N(lhf lhfVar, Bundle bundle, boolean z) {
        if (lhfVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = lhfVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = lhfVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", lhfVar.c);
                return;
            }
            z = false;
        }
        if (lhfVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final String aA(String str, int i, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i) {
                return str;
            }
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
        }
        return null;
    }

    static final boolean aB(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
            return true;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            String host = new URL(stringExtra).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static final byte[] aC(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    static final boolean aD(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (zIsEmpty || zIsEmpty2) {
            return false;
        }
        if (str != null) {
            return !str.equals(str2);
        }
        throw new NullPointerException("null reference");
    }

    private final void aE(Bundle bundle, int i, String str, Object obj) {
        if (av(bundle, i)) {
            bundle.putString("_ev", aA(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    private static final String aF(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 14) {
                        if (i != 17) {
                            if (i != 25) {
                                if (i != 28) {
                                    switch (i) {
                                        case 20:
                                        case 21:
                                            break;
                                        case 22:
                                        case 23:
                                            break;
                                        default:
                                            return "";
                                    }
                                }
                            }
                        }
                    }
                }
                return "too_many_params";
            }
            return "invalid_param_value";
        }
        return "invalid_param_name";
    }

    private final Object aG(int i, Object obj, boolean z, boolean z2) {
        if (obj != null) {
            if ((obj instanceof Long) || (obj instanceof Double)) {
                return obj;
            }
            if (obj instanceof Integer) {
                return Long.valueOf(((Integer) obj).intValue());
            }
            if (obj instanceof Byte) {
                return Long.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Long.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Boolean) {
                return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).doubleValue());
            }
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return aA(obj.toString(), i, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle bundleAt = at((Bundle) parcelable);
                        if (!bundleAt.isEmpty()) {
                            arrayList.add(bundleAt);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    private static final int aH(String str) {
        if ("_ldl".equals(str)) {
            return SemanticState.Modal;
        }
        if ("_id".equals(str)) {
            return SemanticState.Hidden;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    public static boolean ab(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean am(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean an(String str) {
        kro.i(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean ao(Context context) {
        ActivityInfo receiverInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean au(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    static final boolean av(Bundle bundle, int i) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i);
        return true;
    }

    static final Uri ax(String str) {
        return Uri.parse("https://google.com/search?".concat(String.valueOf(str)));
    }

    public static final boolean ay(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static final boolean az(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    static long l(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("null reference");
        }
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i = 0;
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
        }
        return j;
    }

    public final SecureRandom B() {
        o();
        SecureRandom secureRandom = this.d;
        if (secureRandom != null) {
            return secureRandom;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        this.d = secureRandom2;
        return secureRandom2;
    }

    public final void E(Bundle bundle, Uri uri, boolean z) {
        if (uri != null) {
            String strY = y(uri);
            if (!TextUtils.isEmpty(strY)) {
                bundle.putString("_dlurl", strY.substring(0, Math.min(500, strY.length())));
            }
            String query = uri.getQuery();
            if (query == null) {
                query = "";
            }
            if (!TextUtils.isEmpty(query)) {
                bundle.putString("_dlqp", query.substring(0, Math.min(500, query.length())));
            }
            if (z) {
                return;
            }
            bundle.putLong("_dlee", 1L);
        }
    }

    public final void F(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            aT().f.b("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong("_et", j + j2);
    }

    public final void O(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    L().S(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void P(String str, double d) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = aS().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d));
            if (editorEdit.commit()) {
                rpi.D(aS(), new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (RuntimeException e) {
            aT().c.b("Failed to persist Deferred Deep Link. exception", e);
        }
    }

    final void Q(lda ldaVar, int i) {
        Bundle bundle = ldaVar.e;
        int i2 = 0;
        boolean z = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (an(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    aT().e.c(a.bP(i, "Event can't contain more than ", " params"), I().c(ldaVar.a), I().b(bundle));
                    av(bundle, 5);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final void R(lfz lfzVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        av(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        lfzVar.a(str, "_err", bundle);
    }

    public final void S(Bundle bundle, String str, Object obj) {
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            aT().h.c("Not putting event parameter. Invalid value type. name, type", I().d(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void T(kzm kzmVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning boolean value to wrapper", e);
        }
    }

    public final void U(kzm kzmVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning bundle list to wrapper", e);
        }
    }

    public final void V(kzm kzmVar, Bundle bundle) {
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning bundle value to wrapper", e);
        }
    }

    public final void W(kzm kzmVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning byte array to wrapper", e);
        }
    }

    public final void X(kzm kzmVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning int value to wrapper", e);
        }
    }

    public final void Y(kzm kzmVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning long value to wrapper", e);
        }
    }

    public final void Z(kzm kzmVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            kzmVar.a(bundle);
        } catch (RemoteException e) {
            this.t.aT().f.b("Error returning string value to wrapper", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    final int a(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z, boolean z2, lgv lgvVar) {
        int i;
        int size;
        o();
        if (!ay(obj)) {
            i = 0;
        } else {
            if (!z2) {
                return 21;
            }
            if (!ab(str3, led.c)) {
                return 20;
            }
            lff lffVarK = this.t.k();
            lffVarK.o();
            lffVarK.a();
            if (lffVarK.T() && lffVarK.L().k() < 200900) {
                return 25;
            }
            boolean z3 = obj instanceof Parcelable[];
            if (z3) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i = 0;
            }
            if (size > 200) {
                aT().h.d("Parameter array is too long; discarded. Value kind, name, array length", "param", str3, Integer.valueOf(size));
                if (z3) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str3, (Parcelable[]) Arrays.copyOf(parcelableArr, 200));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str3, new ArrayList<>(arrayList.subList(0, 200)));
                    }
                }
                i = 17;
            } else {
                i = 0;
            }
        }
        if (!af("param", str3, (am(str2) || am(str3)) ? G().d(null, false) : G().c(null, false), obj)) {
            if (z2) {
                if (obj instanceof Bundle) {
                    aa(str, str2, str3, (Bundle) obj, list, z, lgvVar);
                } else if (obj instanceof Parcelable[]) {
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            aa(str, str2, str3, (Bundle) parcelable, list, z, lgvVar);
                        } else {
                            aT().h.c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str3);
                        }
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Object obj2 = arrayList2.get(i2);
                        if (obj2 instanceof Bundle) {
                            aa(str, str2, str3, (Bundle) obj2, list, z, lgvVar);
                        } else {
                            aT().h.c("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str3);
                        }
                    }
                }
            }
            return 4;
        }
        return i;
    }

    @Override // defpackage.lea
    protected final void aX() {
        o();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                aT().f.a("Utils falling back to Random for random id");
            }
        }
        this.e.set(jNextLong);
    }

    final void aa(String str, String str2, String str3, Bundle bundle, List list, boolean z, lgv lgvVar) {
        int i;
        int iA;
        list = list;
        if (bundle != null) {
            String str4 = null;
            boolean zF = G().F(null, lcl.aT);
            int i2 = true != G().L().ar(231100000) ? 0 : 35;
            int i3 = 0;
            boolean z2 = false;
            for (String str5 : new TreeSet(bundle.keySet())) {
                if (list == null || !list.contains(str5)) {
                    i = !z ? i(str5) : 0;
                    if (i == 0) {
                        i = g(str5);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    aE(bundle, i, str5, i == 3 ? str5 : str4);
                    bundle.remove(str5);
                    if (zF) {
                        lgvVar.e(str, aF(i));
                    }
                } else {
                    if (ay(bundle.get(str5))) {
                        aT().h.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                        iA = 22;
                    } else {
                        iA = a(str, str2, str5, bundle.get(str5), bundle, list, z, false, lgvVar);
                    }
                    if (iA == 0 || Objects.equals("_ev", str5)) {
                        if (an(str5) && !ab(str5, led.d)) {
                            int i4 = i3 + 1;
                            if (!ar(231100000)) {
                                aT().e.c("Item array not supported on client's version of Google Play Services (Android Only)", I().c(str2), I().b(bundle));
                                av(bundle, 23);
                                bundle.remove(str5);
                                if (zF) {
                                    lgvVar.e(str, aF(23));
                                }
                            } else if (i4 > i2) {
                                if (!z2) {
                                    aT().e.c(a.bP(i2, "Item can't contain more than ", " item-scoped custom params"), I().c(str2), I().b(bundle));
                                }
                                av(bundle, 28);
                                bundle.remove(str5);
                                if (zF) {
                                    lgvVar.e(str, aF(28));
                                }
                                i3 = i4;
                                z2 = true;
                            }
                            i3 = i4;
                        }
                        str4 = null;
                    } else {
                        aE(bundle, iA, str5, bundle.get(str5));
                        bundle.remove(str5);
                        if (zF) {
                            lgvVar.e(str, aF(iA));
                        }
                    }
                }
                str4 = null;
            }
        }
    }

    final boolean ac(String str) {
        if (TextUtils.isEmpty(str)) {
            aT().e.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        if (str == null) {
            throw new NullPointerException("null reference");
        }
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        aT().e.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", lcz.a(str));
        return false;
    }

    final boolean ad(String str, int i, String str2) {
        if (str2 == null) {
            aT().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        }
        aT().e.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
        return false;
    }

    final boolean ae(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            aT().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = c;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                aT().e.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !ab(str2, strArr) || (strArr2 != null && ab(str2, strArr2))) {
            return true;
        }
        aT().e.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean af(String str, String str2, int i, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) <= i) {
                return true;
            }
            aT().h.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
        }
        return false;
    }

    final boolean ag(String str, String str2) {
        if (str2 == null) {
            aT().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            aT().e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            aT().e.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                aT().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean ah(String str, String str2) {
        if (str2 == null) {
            aT().e.b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            aT().e.b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            aT().e.c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                aT().e.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    final boolean ai(String str) {
        o();
        if (kte.a.a(aS()).e(str) == 0) {
            return true;
        }
        aT().j.b("Permission not granted", str);
        return false;
    }

    public final boolean aj(String str) {
        return az((String) lcl.aG.b(null), str);
    }

    public final boolean ak(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return G().B("debug.firebase.analytics.app").equals(str);
    }

    final boolean al(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoG = kte.a.a(context).g(str, 64);
            if (packageInfoG != null && packageInfoG.signatures != null && packageInfoG.signatures.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfoG.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (PackageManager.NameNotFoundException e) {
            aT().c.b("Package name not found", e);
        } catch (CertificateException e2) {
            aT().c.b("Error obtaining certificate", e2);
        }
        return true;
    }

    public final boolean ap(String str) {
        List<ResolveInfo> listQueryIntentActivities;
        return (TextUtils.isEmpty(str) || (listQueryIntentActivities = aS().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || listQueryIntentActivities.isEmpty()) ? false : true;
    }

    public final lcd aq(String str, String str2, Bundle bundle, String str3, long j, long j2, boolean z, lgv lgvVar) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (d(str2) != 0) {
            aT().c.b("Invalid conditional property event name", I().e(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleU = u(str, str2, bundle2, Collections.singletonList("_o"), true, lgvVar);
        if (z) {
            bundleU = at(bundleU);
        }
        return new lcd(str2, new lcc(bundleU), str3, j, j2);
    }

    public final boolean ar(int i) {
        Boolean bool = this.t.k().c;
        if (k() < i / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int as() {
        return klu.d.m(aS(), 12451000);
    }

    final Bundle at(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objV = v(str, bundle.get(str));
                if (objV == null) {
                    aT().h.b("Param value can't be null", I().d(str));
                } else {
                    S(bundle2, str, objV);
                }
            }
        }
        return bundle2;
    }

    public final URL aw(String str, String str2, long j, String str3) {
        try {
            kro.i(str2);
            kro.i(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 192008L, Integer.valueOf(k())), str2, str, Long.valueOf(j));
            if (str.equals(G().B("debug.deferred.deeplink"))) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException | MalformedURLException e) {
            aT().c.b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final int c(String str, Object obj) {
        return "_ldl".equals(str) ? af("user property referrer", str, aH(str), obj) : af("user property", str, aH(str), obj) ? 0 : 7;
    }

    final int d(String str) {
        if (!ag("event", str)) {
            return 2;
        }
        if (ae("event", lec.a, lec.b, str)) {
            return ad("event", 40, str) ? 0 : 2;
        }
        return 13;
    }

    @Override // defpackage.lea
    protected final boolean e() {
        return true;
    }

    final int g(String str) {
        if (!ag("event param", str)) {
            return 3;
        }
        if (ae("event param", null, null, str)) {
            return ad("event param", 40, str) ? 0 : 3;
        }
        return 14;
    }

    final int i(String str) {
        if (!ah("event param", str)) {
            return 3;
        }
        if (ae("event param", null, null, str)) {
            return ad("event param", 40, str) ? 0 : 3;
        }
        return 14;
    }

    final int j(String str) {
        if (!ag("user property", str)) {
            return 6;
        }
        if (ae("user property", lee.a, null, str)) {
            return ad("user property", 24, str) ? 0 : 6;
        }
        return 15;
    }

    public final int k() {
        Integer numValueOf = this.g;
        if (numValueOf == null) {
            int i = klu.c;
            numValueOf = Integer.valueOf(kml.a(aS()) / 1000);
            this.g = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final long s() {
        long andIncrement;
        AtomicLong atomicLong = this.e;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
                int i = this.f + 1;
                this.f = i;
                andIncrement = jNextLong + ((long) i);
            }
        } else {
            AtomicLong atomicLong2 = this.e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
        }
        return andIncrement;
    }

    public final Bundle t(Uri uri) {
        Bundle bundle;
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle2 = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle2.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle2.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle2.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle2.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle2.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle2.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle2.putString("term", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle2.putString("content", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle2.putString("aclid", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle2.putString("cp1", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle2.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle2.putString("campaign_id", queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle2.putString("dclid", queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle2.putString("source_platform", queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle2.putString("creative_format", queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle2.putString("marketing_tactic", queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle2.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle2.putString("sfmc_id", queryParameter9);
                }
                for (String str : uri.getQueryParameterNames()) {
                    if (str.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle2.putString(str, queryParameter19);
                        }
                    }
                }
                String string = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                int iD = G().d(null, false);
                if (string.length() > iD) {
                    string = aA(string, iD - 3, true);
                }
                if (TextUtils.isEmpty(string)) {
                    return bundle2;
                }
                bundle2.putString("deep_link_url", string);
                return bundle2;
            } catch (UnsupportedOperationException e) {
                bundle = null;
                aT().f.b("Install referrer url isn't a hierarchical URI", e);
            }
        } else {
            bundle = null;
        }
        return bundle;
    }

    public final Bundle u(String str, String str2, Bundle bundle, List list, boolean z, lgv lgvVar) {
        int i;
        int i2;
        int i3;
        Bundle bundle2 = new Bundle(bundle);
        int iE = G().e();
        boolean zF = G().F(null, lcl.aT);
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList, new xsi(a, 1));
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i4 < size) {
            String str3 = (String) arrayList.get(i4);
            boolean zAb = ab(str2, lec.e);
            if (list == 0 || !list.contains(str3)) {
                int i6 = !z ? i(str3) : 0;
                if (i6 == 0) {
                    i6 = g(str3);
                }
                i = i6;
            } else {
                i = 0;
            }
            if (i != 0) {
                aE(bundle2, i, str3, i == 3 ? str3 : null);
                bundle2.remove(str3);
                if (zF) {
                    lgvVar.e(str, aF(i));
                }
                i3 = size;
                i2 = i4;
            } else {
                i2 = i4;
                i3 = size;
                int iA = a(str, str2, str3, bundle.get(str3), bundle2, list, z, zAb, lgvVar);
                if (iA == 17) {
                    aE(bundle2, 17, str3, Boolean.FALSE);
                } else if (iA != 0 && !"_ev".equals(str3)) {
                    aE(bundle2, iA, iA == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                    if (zF) {
                        lgvVar.e(str, aF(iA));
                    }
                }
                if (an(str3)) {
                    int i7 = i5 + 1;
                    if (i7 > iE) {
                        if (!z2) {
                            aT().e.c(a.bP(iE, "Event can't contain more than ", " params"), I().c(str2), I().b(bundle));
                        }
                        av(bundle2, 5);
                        bundle2.remove(str3);
                        if (zF) {
                            lgvVar.e(str, aF(5));
                        }
                        i5 = i7;
                        z2 = true;
                    } else {
                        i5 = i7;
                    }
                }
            }
            i4 = i2 + 1;
            size = i3;
        }
        return bundle2;
    }

    final Object v(String str, Object obj) {
        if ("_ev".equals(str)) {
            return aG(G().d(null, false), obj, true, true);
        }
        return aG(am(str) ? G().d(null, false) : G().c(null, false), obj, false, true);
    }

    final Object w(String str, Object obj) {
        boolean zEquals = "_ldl".equals(str);
        int iAH = aH(str);
        return zEquals ? aG(iAH, obj, true, false) : aG(iAH, obj, false, false);
    }

    final String x() {
        byte[] bArr = new byte[16];
        B().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String y(Uri uri) {
        try {
            if (!uri.isHierarchical() || uri.getScheme() == null || uri.getAuthority() == null) {
                return "";
            }
            return uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
        } catch (UnsupportedOperationException e) {
            aT().f.b("Install referrer url isn't a hierarchical URI", e);
            return "";
        }
    }
}
