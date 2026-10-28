package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbt extends ldz {
    public String a;
    public lbs b;
    public Boolean c;
    private Boolean d;

    public lbt(ldr ldrVar) {
        super(ldrVar);
        this.b = new lbr();
    }

    public static final long A() {
        return ((Long) lcl.X.b(null)).longValue();
    }

    public static final long u() {
        return ((Long) lcl.e.b(null)).longValue();
    }

    public static final int v() {
        return Math.max(0, ((Integer) lcl.j.b(null)).intValue());
    }

    public static final long w() {
        return ((Integer) lcl.l.b(null)).intValue();
    }

    public static final long x() {
        return ((Long) lcl.ac.b(null)).longValue();
    }

    public static final long z() {
        return Math.max(0L, ((Long) lcl.W.b(null)).longValue());
    }

    public final String B(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            if (str2 != null) {
                return str2;
            }
            throw new NullPointerException("null reference");
        } catch (ClassNotFoundException e) {
            aT().c.b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            aT().c.b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            aT().c.b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            aT().c.b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final int C(String str, adam adamVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) adamVar.b(null)).intValue();
        }
        String strA = this.b.a(str, (String) adamVar.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) adamVar.b(null)).intValue();
        }
        try {
            return ((Integer) adamVar.b(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) adamVar.b(null)).intValue();
        }
    }

    public final int D(String str, adam adamVar, int i, int i2) {
        return Math.max(Math.min(C(str, adamVar), i2), i);
    }

    public final long E(String str, adam adamVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) adamVar.b(null)).longValue();
        }
        String strA = this.b.a(str, (String) adamVar.a);
        if (TextUtils.isEmpty(strA)) {
            return ((Long) adamVar.b(null)).longValue();
        }
        try {
            return ((Long) adamVar.b(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) adamVar.b(null)).longValue();
        }
    }

    public final boolean F(String str, adam adamVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) adamVar.b(null)).booleanValue();
        }
        String strA = this.b.a(str, (String) adamVar.a);
        return TextUtils.isEmpty(strA) ? ((Boolean) adamVar.b(null)).booleanValue() : ((Boolean) adamVar.b(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final int a(String str) {
        return C(str, lcl.o);
    }

    final int b(String str) {
        return D(str, lcl.ah, 500, 2000);
    }

    public final int c(String str, boolean z) {
        if (z) {
            return D(str, lcl.ar, 100, 500);
        }
        return 500;
    }

    final int d(String str, boolean z) {
        return Math.max(c(str, z), SemanticState.Hidden);
    }

    public final int e() {
        return L().ar(201500000) ? 100 : 25;
    }

    public final int f(String str) {
        return D(str, lcl.ai, 25, 100);
    }

    public final int g(String str) {
        return Math.max(1, C(str, lcl.k));
    }

    public final int h(String str) {
        return C(str, lcl.p);
    }

    final long i(String str) {
        return E(str, lcl.b);
    }

    final Bundle j() {
        Bundle bundle = null;
        try {
            if (aS().getPackageManager() == null) {
                aT().c.a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo applicationInfoF = kte.a.a(aS()).f(aS().getPackageName(), SemanticState.Focused);
                if (applicationInfoF == null) {
                    aT().c.a("Failed to load metadata: ApplicationInfo is null");
                } else {
                    bundle = applicationInfoF.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            aT().c.b("Failed to load metadata: Package name not found", e);
        }
        return bundle;
    }

    public final lge k(String str, boolean z) {
        Object obj;
        kro.i(str);
        Bundle bundleJ = j();
        if (bundleJ == null) {
            aT().c.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleJ.get(str);
        }
        if (obj == null) {
            return lge.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return lge.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return lge.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return lge.POLICY;
        }
        aT().f.b("Invalid manifest metadata for", str);
        return lge.UNINITIALIZED;
    }

    final Boolean l(String str) {
        kro.i(str);
        Bundle bundleJ = j();
        if (bundleJ == null) {
            aT().c.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleJ.containsKey(str)) {
            return Boolean.valueOf(bundleJ.getBoolean(str));
        }
        return null;
    }

    public final boolean m() {
        Boolean boolL = l("google_analytics_adid_collection_enabled");
        return boolL == null || boolL.booleanValue();
    }

    public final boolean n(String str) {
        return "1".equals(this.b.a(str, "gaia_collection_enabled"));
    }

    public final boolean p() {
        Boolean boolL = l("google_analytics_automatic_screen_reporting_enabled");
        return boolL == null || boolL.booleanValue();
    }

    public final boolean q() {
        Boolean boolL = l("firebase_analytics_collection_deactivated");
        return boolL != null && boolL.booleanValue();
    }

    public final boolean r(String str) {
        return "1".equals(this.b.a(str, "measurement.event_sampling_enabled"));
    }

    final boolean s() {
        Boolean boolL = this.d;
        if (boolL == null) {
            boolL = l("app_measurement_lite");
            this.d = boolL;
            if (boolL == null) {
                boolL = Boolean.FALSE;
                this.d = boolL;
            }
        }
        return boolL.booleanValue() || !this.t.b;
    }

    public final boolean t() {
        Boolean boolL = l("google_analytics_sgtm_upload_enabled");
        if (boolL == null) {
            return false;
        }
        return boolL.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[Catch: NotFoundException -> 0x0040, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0040, blocks: (B:10:0x0029, B:12:0x003b), top: B:17:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    final List y() {
        Integer numValueOf;
        String[] stringArray;
        kro.i("analytics.safelisted_events");
        Bundle bundleJ = j();
        if (bundleJ != null) {
            if (bundleJ.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleJ.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                return null;
            }
            try {
                stringArray = aS().getResources().getStringArray(numValueOf.intValue());
                if (stringArray != null) {
                    return Arrays.asList(stringArray);
                }
                return null;
            } catch (Resources.NotFoundException e) {
                aT().c.b("Failed to load string array from metadata: resource not found", e);
                return null;
            }
        }
        aT().c.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            return null;
        }
        stringArray = aS().getResources().getStringArray(numValueOf.intValue());
        if (stringArray != null) {
            return Arrays.asList(stringArray);
        }
        return null;
    }
}
