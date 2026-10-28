package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbk {
    public static volatile kbk b;
    public final Context c;
    public final kcr d;
    public final kbv e;
    public final kbn f;
    public final kgw g;
    public final kdl h;
    public final kdz i;
    public kjc j;
    private final kdx l;
    private final kdv m;
    private final List n;
    private final kbz o;
    private axfd p;
    private static final khn k = new khn("CastContext", (String) null);
    public static final Object a = new Object();

    public kbk(Context context, kbn kbnVar, List list, kdx kdxVar, kgw kgwVar) {
        kcd kccVar;
        kcj kciVar;
        LinkProperties linkProperties;
        this.c = context;
        this.f = kbnVar;
        this.l = kdxVar;
        this.g = kgwVar;
        this.n = list;
        this.m = new kdv(context);
        this.i = kdxVar.e;
        f();
        HashMap map = new HashMap();
        axfd axfdVar = this.p;
        if (axfdVar != null) {
            map.put(axfdVar.d, axfdVar.c);
        }
        int i = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axfd axfdVar2 = (axfd) it.next();
                if (axfdVar2 == null) {
                    throw new NullPointerException("Additional SessionProvider must not be null.");
                }
                Object obj = axfdVar2.d;
                kro.j((String) obj, "Category for SessionProvider must not be null or empty string.");
                kro.d(!map.containsKey(obj), String.format("SessionProvider for category %s already added", obj));
                map.put(obj, axfdVar2.c);
            }
        }
        kbnVar.q = new kbm(1);
        try {
            kbz kbzVarG = kdm.a(context).g(new kun(context.getApplicationContext()), kbnVar, kdxVar, map);
            this.o = kbzVarG;
            try {
                int i2 = 6;
                Parcel parcelD = kbzVarG.d(6, kbzVarG.c());
                IBinder strongBinder = parcelD.readStrongBinder();
                if (strongBinder == null) {
                    kccVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    kccVar = iInterfaceQueryLocalInterface instanceof kcd ? (kcd) iInterfaceQueryLocalInterface : new kcc(strongBinder);
                }
                parcelD.recycle();
                this.e = new kbv(kccVar);
                try {
                    Parcel parcelD2 = kbzVarG.d(5, kbzVarG.c());
                    IBinder strongBinder2 = parcelD2.readStrongBinder();
                    if (strongBinder2 == null) {
                        kciVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        kciVar = iInterfaceQueryLocalInterface2 instanceof kcj ? (kcj) iInterfaceQueryLocalInterface2 : new kci(strongBinder2);
                    }
                    parcelD2.recycle();
                    kcr kcrVar = new kcr(kciVar, context);
                    this.d = kcrVar;
                    kdz kdzVar = this.i;
                    if (kdzVar != null) {
                        kdzVar.e = kcrVar;
                        kdzVar.c.post(new kcx(kdzVar, i2));
                    }
                    khy khyVar = new khy(context, MoreExecutors.a(Executors.newFixedThreadPool(3)));
                    new khn("BaseNetUtils", (String) null);
                    Build.TYPE.equals("user");
                    if (!khyVar.e && khyVar.b != null && avg.c(khyVar.f, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = khyVar.b.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = khyVar.b.getLinkProperties(activeNetwork)) != null) {
                            khyVar.a(activeNetwork, linkProperties);
                        }
                        NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
                        if (khyVar.h) {
                            builderAddTransportType.setIncludeOtherUidNetworks(true);
                        } else {
                            khyVar.f.registerReceiver(khyVar.i, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                        }
                        khyVar.b.registerNetworkCallback(builderAddTransportType.build(), khyVar.a);
                        khyVar.e = true;
                    }
                    kdl kdlVar = new kdl();
                    this.h = kdlVar;
                    try {
                        Parcel parcelC = kbzVarG.c();
                        ClassLoader classLoader = gdc.a;
                        parcelC.writeStrongBinder(kdlVar);
                        kbzVarG.e(3, parcelC);
                        kdlVar.e(this.m.b);
                        if (!kbnVar.a().isEmpty()) {
                            k.a("Setting Route Discovery for appIds: ".concat(String.valueOf(String.valueOf(this.f.a()))), new Object[0]);
                            kdv kdvVar = this.m;
                            List listA = this.f.a();
                            listA.size();
                            Build.TYPE.equals("user");
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = listA.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(ahno.af((String) it2.next()));
                            }
                            String.valueOf(kdvVar.c.keySet());
                            Build.TYPE.equals("user");
                            HashMap map2 = new HashMap();
                            synchronized (kdvVar.c) {
                                for (String str : linkedHashSet) {
                                    kyr kyrVar = (kyr) kdvVar.c.get(ahno.af(str));
                                    if (kyrVar != null) {
                                        map2.put(str, kyrVar);
                                    }
                                }
                                kdvVar.c.clear();
                                kdvVar.c.putAll(map2);
                            }
                            String.valueOf(kdvVar.c.keySet());
                            Build.TYPE.equals("user");
                            synchronized (kdvVar.d) {
                                kdvVar.d.clear();
                                kdvVar.d.addAll(linkedHashSet);
                            }
                            kdvVar.H();
                        }
                        kgwVar.a(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).q(new low() { // from class: kbi
                            @Override // defpackage.low
                            public final void e(Object obj2) {
                                agzl agzlVarB;
                                Bundle bundle = (Bundle) obj2;
                                if (kcw.a) {
                                    kbk kbkVar = this.a;
                                    final kcw kcwVar = new kcw(kbkVar.c, kbkVar.g, kbkVar.d, kbkVar.i, kbkVar.h);
                                    int i3 = 0;
                                    final int i4 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
                                    boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
                                    boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
                                    kcw.a = z2;
                                    if (i4 == 0) {
                                        if (!z && !z2) {
                                            return;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    long j = bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L);
                                    Context context2 = kcwVar.b;
                                    kcwVar.i = new kec(context2, j);
                                    final String packageName = context2.getPackageName();
                                    String str2 = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
                                    long j2 = 0;
                                    kcwVar.j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") != 0 ? 2 : 1;
                                    jsh.b(context2);
                                    kcwVar.k = jsh.a().c().a("CAST_SENDER_SDK", new jsa(), new kcu(i3));
                                    if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                                        kcwVar.h = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
                                    }
                                    final SharedPreferences sharedPreferences = context2.getApplicationContext().getSharedPreferences(str2, 0);
                                    if (i4 != 0) {
                                        kcwVar.c.c(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}).q(new low() { // from class: kct
                                            /* JADX WARN: Code duplicated, block: B:8:0x0027  */
                                            @Override // defpackage.low
                                            public final void e(Object obj3) {
                                                aepb aepbVar;
                                                int i5 = i4;
                                                Bundle bundle2 = (Bundle) obj3;
                                                String str3 = packageName;
                                                kcw kcwVar2 = kcwVar;
                                                kcr kcrVar2 = kcwVar2.d;
                                                kdz kdzVar2 = kcwVar2.e;
                                                if (i5 == 3) {
                                                    aepbVar = new aepb(kcwVar2, kcwVar2.f, str3);
                                                    kcrVar2.c(new kdg(aepbVar), kbu.class);
                                                    if (kdzVar2 != null) {
                                                        kdzVar2.c(new kdh(aepbVar));
                                                    }
                                                } else if (i5 == 2) {
                                                    i5 = 2;
                                                    aepbVar = new aepb(kcwVar2, kcwVar2.f, str3);
                                                    kcrVar2.c(new kdg(aepbVar), kbu.class);
                                                    if (kdzVar2 != null) {
                                                        kdzVar2.c(new kdh(aepbVar));
                                                    }
                                                }
                                                if (i5 == 1 || i5 == 2) {
                                                    kda kdaVar = new kda(sharedPreferences, kcwVar2, kcwVar2.f, bundle2, str3);
                                                    kcrVar2.c(new kcy(kdaVar), kbu.class);
                                                    if (kdzVar2 != null) {
                                                        kdzVar2.c(new kcz(kdaVar));
                                                    }
                                                }
                                            }
                                        });
                                    }
                                    if (z) {
                                        if (sharedPreferences == null) {
                                            throw new NullPointerException("null reference");
                                        }
                                        kdd kddVarA = kdd.a(sharedPreferences, kcwVar, packageName);
                                        SharedPreferences sharedPreferences2 = kddVarA.c;
                                        String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                                        String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                                        Set set = kddVarA.g;
                                        set.clear();
                                        Set set2 = kddVarA.h;
                                        set2.clear();
                                        kddVarA.i = 0L;
                                        String str3 = kdd.a;
                                        if (str3.equals(string) && kddVarA.d.equals(string2)) {
                                            kddVarA.i = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            HashSet hashSet = new HashSet();
                                            for (String str4 : sharedPreferences2.getAll().keySet()) {
                                                if (str4.startsWith("feature_usage_timestamp_")) {
                                                    long j3 = sharedPreferences2.getLong(str4, j2);
                                                    if (j3 == j2 || jCurrentTimeMillis - j3 <= 1209600000) {
                                                        if (str4.startsWith("feature_usage_timestamp_reported_feature_")) {
                                                            agzl agzlVarB2 = kdd.b(str4.substring(41));
                                                            if (agzlVarB2 != null) {
                                                                set2.add(agzlVarB2);
                                                                set.add(agzlVarB2);
                                                            }
                                                        } else if (str4.startsWith("feature_usage_timestamp_detected_feature_") && (agzlVarB = kdd.b(str4.substring(41))) != null) {
                                                            set.add(agzlVarB);
                                                        }
                                                        j2 = 0;
                                                    } else {
                                                        hashSet.add(str4);
                                                    }
                                                }
                                            }
                                            kddVarA.f(hashSet);
                                            Handler handler = kddVarA.f;
                                            if (kddVarA.e == null) {
                                                throw new NullPointerException("null reference");
                                            }
                                            kddVarA.g();
                                        } else {
                                            HashSet hashSet2 = new HashSet();
                                            for (String str5 : sharedPreferences2.getAll().keySet()) {
                                                if (str5.startsWith("feature_usage_timestamp_")) {
                                                    hashSet2.add(str5);
                                                }
                                            }
                                            hashSet2.add("feature_usage_last_report_time");
                                            kddVarA.f(hashSet2);
                                            sharedPreferences2.edit().putString("feature_usage_sdk_version", str3).putString("feature_usage_package_name", kddVarA.d).apply();
                                        }
                                        kdd.e(agzl.CAST_CONTEXT);
                                    }
                                    if (kcw.a) {
                                        xsc.an(kcwVar, packageName);
                                    }
                                }
                            }
                        });
                        kgwVar.b(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}).q(new ahsw(this, i));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e2) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e2);
                }
            } catch (RemoteException e3) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e3);
            }
        } catch (RemoteException e4) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public static int a(int i) {
        Integer num;
        if (b == null) {
            return 0;
        }
        kjc kjcVar = b.j;
        if (kjcVar == null) {
            k.d("castReasonCodes hasn't been initialized yet", new Object[0]);
            return 0;
        }
        ?? r0 = kjcVar.a;
        if (r0 == 0) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (!r0.containsKey(numValueOf) || (num = (Integer) r0.get(numValueOf)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static kbk b() {
        kro.f("Must be called from the main thread.");
        return b;
    }

    public static lpa e(Context context, Executor executor) {
        kro.f("Must be called from the main thread.");
        if (b != null) {
            kbk kbkVar = b;
            lpf lpfVar = new lpf();
            lpfVar.t(kbkVar);
            return lpfVar;
        }
        final Context applicationContext = context.getApplicationContext();
        final kcm kcmVarH = h(i(applicationContext));
        final kbn castOptions = kcmVarH.getCastOptions(applicationContext);
        final kgw kgwVar = new kgw(applicationContext);
        final kdx kdxVar = new kdx(applicationContext, dij.b(applicationContext), castOptions, kgwVar);
        return mda.k(executor, new Callable() { // from class: kbj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                kcm kcmVar = kcmVarH;
                Context context2 = applicationContext;
                kdx kdxVar2 = kdxVar;
                kbn kbnVar = castOptions;
                kgw kgwVar2 = kgwVar;
                synchronized (kbk.a) {
                    if (kbk.b == null) {
                        kbk.b = new kbk(context2, kbnVar, kcmVar.getAdditionalSessionProviders(context2), kdxVar2, kgwVar2);
                    }
                }
                return kbk.b;
            }
        });
    }

    public static kbk g(Context context) {
        kro.f("Must be called from the main thread.");
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    kcm kcmVarH = h(i(applicationContext));
                    kbn castOptions = kcmVarH.getCastOptions(applicationContext);
                    kgw kgwVar = new kgw(applicationContext);
                    try {
                        b = new kbk(applicationContext, castOptions, kcmVarH.getAdditionalSessionProviders(applicationContext), new kdx(applicationContext, dij.b(applicationContext), castOptions, kgwVar), kgwVar);
                    } catch (kcl e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return b;
    }

    private static kcm h(String str) {
        try {
            if (str != null) {
                return (kcm) Class.forName(str).asSubclass(kcm.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to initialize CastContext with manifest options.", e);
        }
    }

    private static String i(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfoF = kte.a.a(context).f(context.getPackageName(), SemanticState.Focused);
            if (applicationInfoF == null || (bundle = applicationInfoF.metaData) == null) {
                return null;
            }
            return bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final kbn c() {
        kro.f("Must be called from the main thread.");
        return this.f;
    }

    public final kcr d() {
        kro.f("Must be called from the main thread.");
        return this.d;
    }

    public final void f() {
        kbn kbnVar = this.f;
        if (TextUtils.isEmpty(kbnVar.d)) {
            this.p = null;
        } else {
            this.p = new axfd(this.c, kbnVar, this.l);
        }
    }
}
