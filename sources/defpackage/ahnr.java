package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahnr {
    public static final Object a = new Object();
    public static final Map b = new afv();
    public final ahoq c;
    public final ahrs e;
    private final Context g;
    private final String h;
    private final ahnv i;
    private final ahox k;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean j = new AtomicBoolean();
    public final List f = new CopyOnWriteArrayList();

    /* JADX WARN: Code duplicated, block: B:14:0x0070  */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba A[LOOP:0: B:24:0x00b3->B:26:0x00ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x019b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[EDGE_INSN: B:38:0x00c9->B:27:0x00c9 BREAK  A[LOOP:0: B:24:0x00b3->B:26:0x00ba], SYNTHETIC] */
    protected ahnr(Context context, String str, ahnv ahnvVar) {
        Bundle bundle;
        List arrayList;
        Iterator it;
        int i;
        ArrayList arrayList2;
        int i2 = 0;
        new CopyOnWriteArrayList();
        this.g = context;
        kro.i(str);
        this.h = str;
        this.i = ahnvVar;
        ahnw ahnwVar = FirebaseInitProvider.a;
        ArrayList arrayList3 = new ArrayList();
        byte[] bArr = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), SemanticState.Focused);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str2.substring(31));
                        }
                    }
                }
                it = arrayList.iterator();
                while (true) {
                    i = 1;
                    if (it.hasNext()) {
                        break;
                    } else {
                        arrayList3.add(new ahop((String) it.next(), i));
                    }
                }
                ahpp ahppVar = ahpp.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList4.addAll(arrayList3);
                arrayList4.add(new ahop(new FirebaseCommonRegistrar(), i2));
                arrayList4.add(new ahop(new ExecutorsRegistrar(), i2));
                ahoj ahojVar = new ahoj(Context.class, new Class[0]);
                ahojVar.b = new ahoi(context, i2);
                arrayList2.add(ahojVar.a());
                ahoj ahojVar2 = new ahoj(ahnr.class, new Class[0]);
                ahojVar2.b = new ahoi(this, i2);
                arrayList2.add(ahojVar2.a());
                ahoj ahojVar3 = new ahoj(ahnv.class, new Class[0]);
                ahojVar3.b = new ahoi(ahnvVar, i2);
                arrayList2.add(ahojVar3.a());
                ahui ahuiVar = new ahui();
                if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.b.get()) {
                    ahoj ahojVar4 = new ahoj(ahnw.class, new Class[0]);
                    ahojVar4.b = new ahoi(ahnwVar, i2);
                    arrayList2.add(ahojVar4.a());
                }
                ahoq ahoqVar = new ahoq(ahppVar, arrayList4, arrayList2, ahuiVar);
                this.c = ahoqVar;
                this.k = new ahox(new ahoo(this, context, i));
                this.e = ahoqVar.a(new ahpd(ahpc.class, ahqz.class));
                hhb hhbVar = new hhb(this, bArr);
                l();
                if (this.d.get()) {
                    knx.a.c();
                }
                this.f.add(hhbVar);
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
            while (true) {
                i = 1;
                if (it.hasNext()) {
                    break;
                    break;
                }
                arrayList3.add(new ahop((String) it.next(), i));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            while (r5.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
        }
        it = arrayList.iterator();
        ahpp ahppVar2 = ahpp.INSTANCE;
        ArrayList arrayList5 = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList5.addAll(arrayList3);
        arrayList5.add(new ahop(new FirebaseCommonRegistrar(), i2));
        arrayList5.add(new ahop(new ExecutorsRegistrar(), i2));
        ahoj ahojVar5 = new ahoj(Context.class, new Class[0]);
        ahojVar5.b = new ahoi(context, i2);
        arrayList2.add(ahojVar5.a());
        ahoj ahojVar6 = new ahoj(ahnr.class, new Class[0]);
        ahojVar6.b = new ahoi(this, i2);
        arrayList2.add(ahojVar6.a());
        ahoj ahojVar7 = new ahoj(ahnv.class, new Class[0]);
        ahojVar7.b = new ahoi(ahnvVar, i2);
        arrayList2.add(ahojVar7.a());
        ahui ahuiVar2 = new ahui();
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            ahoj ahojVar8 = new ahoj(ahnw.class, new Class[0]);
            ahojVar8.b = new ahoi(ahnwVar, i2);
            arrayList2.add(ahojVar8.a());
        }
        ahoq ahoqVar2 = new ahoq(ahppVar2, arrayList5, arrayList2, ahuiVar2);
        this.c = ahoqVar2;
        this.k = new ahox(new ahoo(this, context, i));
        this.e = ahoqVar2.a(new ahpd(ahpc.class, ahqz.class));
        hhb hhbVar2 = new hhb(this, bArr);
        l();
        if (this.d.get()) {
            knx.a.c();
        }
        this.f.add(hhbVar2);
    }

    public static ahnr b() {
        ahnr ahnrVar;
        synchronized (a) {
            ahnrVar = (ahnr) b.get("[DEFAULT]");
            if (ahnrVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ksx.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((ahqz) ahnrVar.e.a()).c();
        }
        return ahnrVar;
    }

    public static ahnr c(Context context) {
        synchronized (a) {
            if (b.containsKey("[DEFAULT]")) {
                return b();
            }
            if (context == null) {
                throw new NullPointerException("null reference");
            }
            Resources resources = context.getResources();
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            String strAj = ksy.aj("google_app_id", resources, resourcePackageName);
            ahnv ahnvVar = TextUtils.isEmpty(strAj) ? null : new ahnv(strAj, ksy.aj("google_api_key", resources, resourcePackageName), ksy.aj("firebase_database_url", resources, resourcePackageName), ksy.aj("ga_trackingId", resources, resourcePackageName), ksy.aj("gcm_defaultSenderId", resources, resourcePackageName), ksy.aj("google_storage_bucket", resources, resourcePackageName), ksy.aj("recaptcha_site_key", resources, resourcePackageName), ksy.aj("project_id", resources, resourcePackageName));
            if (ahnvVar != null) {
                return d(context, ahnvVar, "[DEFAULT]");
            }
            Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    public static ahnr d(Context context, ahnv ahnvVar, String str) {
        ahnr ahnrVar;
        AtomicReference atomicReference = ahnp.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = ahnp.a;
            if (atomicReference2.get() == null) {
                ahnp ahnpVar = new ahnp();
                if (a.ap(atomicReference2, ahnpVar)) {
                    knx.b(application);
                    knx.a.a(ahnpVar);
                }
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            boolean zContainsKey = map.containsKey(strTrim);
            String strBT = a.bT(strTrim, "FirebaseApp name ", " already exists!");
            if (zContainsKey) {
                throw new IllegalStateException(strBT);
            }
            if (context == null) {
                throw new NullPointerException("Application context cannot be null.");
            }
            ahnrVar = new ahnr(context, strTrim, ahnvVar);
            map.put(strTrim, ahnrVar);
        }
        ahnrVar.i();
        return ahnrVar;
    }

    private final void l() {
        if (this.j.get()) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
    }

    public final Context a() {
        l();
        return this.g;
    }

    public final ahnv e() {
        l();
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahnr) {
            return this.h.equals(((ahnr) obj).g());
        }
        return false;
    }

    public final Object f(Class cls) {
        l();
        return ahno.b(this.c, new ahpd(ahpc.class, cls));
    }

    public final String g() {
        l();
        return this.h;
    }

    public final String h() {
        byte[] bytes = g().getBytes(Charset.defaultCharset());
        String strEncodeToString = bytes == null ? null : Base64.encodeToString(bytes, 11);
        byte[] bytes2 = e().b.getBytes(Charset.defaultCharset());
        return a.cl(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null, (byte) 43, strEncodeToString);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final void i() {
        HashMap map;
        Context context = this.g;
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            g();
            ahoq ahoqVar = this.c;
            boolean zK = k();
            if (a.ap(ahoqVar.b, Boolean.valueOf(zK))) {
                synchronized (ahoqVar) {
                    map = new HashMap(ahoqVar.a);
                }
                ahoqVar.g(map, zK);
            }
            ((ahqz) this.e.a()).c();
            return;
        }
        g();
        AtomicReference atomicReference = ahnq.a;
        if (atomicReference.get() == null) {
            ahnq ahnqVar = new ahnq(context);
            if (a.ap(atomicReference, ahnqVar)) {
                context.registerReceiver(ahnqVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean j() {
        l();
        return ((ahsm) this.k.a()).a();
    }

    public final boolean k() {
        return "[DEFAULT]".equals(g());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        kro.p("name", this.h, arrayList);
        kro.p("options", this.i, arrayList);
        return kro.o(arrayList, this);
    }
}
