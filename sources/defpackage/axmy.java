package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.base.AndroidInfo;
import org.chromium.net.ApiVersion;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.VersionSafeProxyOptions;
import org.chromium.net.impl.ImplVersion;
import org.chromium.url.IDNStringUtil;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class axmy extends ICronetEngineBuilder {
    protected final axnk b;
    public final Context c;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public boolean f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public axmx l;
    public long m;
    public String n;
    public boolean o;
    public VersionSafeProxyOptions p;
    private final axnh r;
    private static final Pattern q = Pattern.compile("^[0-9\\.]*$");
    static final int a = AndroidInfo.h();

    /* JADX WARN: Multi-variable type inference failed */
    public axmy(Context context, axnh axnhVar) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext;
        this.r = axnhVar;
        this.b = axnl.a(applicationContext, axnhVar);
        boolean z = false;
        Object[] objArr = 0;
        int i = 0;
        Object[] objArr2 = 0;
        boolean z2 = true;
        try {
            this.i = z2;
            this.j = z2;
            this.k = objArr2 == true ? 1 : 0;
            f(i, 0L);
            this.o = objArr == true ? 1 : 0;
            this.f = z2;
        } finally {
            i(jUptimeMillis, z, axnhVar);
        }
    }

    private final void i(long j, boolean z, axnh axnhVar) {
        if (a < 30) {
            axnf axnfVar = new axnf();
            axnfVar.d = Boolean.FALSE;
            try {
                axnfVar.h = 2;
                axnfVar.g = Process.myUid();
                axnfVar.f = new axnj(ImplVersion.getCronetVersion());
                axnfVar.c = axnhVar;
                axnfVar.e = new axnj(ApiVersion.getCronetVersion());
                axnfVar.a = getLogCronetInitializationRef();
                axnfVar.d = Boolean.valueOf(z);
            } finally {
                axnfVar.b = (int) (SystemClock.uptimeMillis() - j);
                this.b.d(axnfVar);
            }
        }
    }

    public final int a() {
        return this.l.e;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        d(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        e(str, i, i2);
        return this;
    }

    public final String b() {
        return this.i ? String.valueOf(this.c.getPackageName()).concat(" Cronet/156.0.8078.25") : "";
    }

    public final axne c() {
        int i;
        int i2;
        boolean z = this.f;
        boolean z2 = this.i;
        boolean z3 = this.j;
        boolean z4 = this.k;
        int iOrdinal = this.l.ordinal();
        if (iOrdinal != 0) {
            i = 3;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    i2 = 2;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("Unknown internal builder cache mode");
                    }
                    i2 = 1;
                }
            }
            return new axne(z, z2, z3, z4, i2, this.n, this.o, getLogCronetInitializationRef());
        }
        i = 0;
        i2 = i;
        return new axne(z, z2, z3, z4, i2, this.n, this.o, getLogCronetInitializationRef());
    }

    public final void d(String str, Set set, boolean z, Date date) {
        str.getClass();
        set.getClass();
        date.getClass();
        if (q.matcher(str).matches()) {
            throw new IllegalArgumentException(a.bT(str, "Hostname ", " is illegal. A hostname should not consist of digits and/or dots only."));
        }
        if (str.length() > 253) {
            throw new IllegalArgumentException(a.bT(str, "Hostname ", " is too long. The name of the host does not comply with RFC 1122 and RFC 1123."));
        }
        try {
            String strA = IDNStringUtil.a(str);
            HashMap map = new HashMap();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                if (bArr == null || bArr.length != 32) {
                    throw new IllegalArgumentException("Public key pin is invalid");
                }
                map.put(Base64.encodeToString(bArr, 0), bArr);
            }
            this.e.add(new eqf(strA, (byte[][]) map.values().toArray(new byte[map.size()][]), z, date));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(a.bT(str, "Hostname ", " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123."), e);
        }
    }

    public final void e(String str, int i, int i2) {
        if (str.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: ".concat(String.valueOf(str)));
        }
        this.d.add(new qx(str, i, i2));
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.k = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.j = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        f(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.o = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.i = z;
        return this;
    }

    public final void f(int i, long j) {
        axmx axmxVar;
        axmx axmxVar2 = axmx.DISABLED;
        if (i == 0) {
            axmxVar = axmx.DISABLED;
        } else if (i == 1) {
            axmxVar = axmx.MEMORY;
        } else if (i == 2) {
            axmxVar = axmx.DISK_NO_HTTP;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("Unknown public builder cache mode");
            }
            axmxVar = axmx.DISK;
        }
        if (axmxVar.e == 1 && this.h == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.l = axmxVar;
        this.m = j;
    }

    public final void g(ProxyOptions proxyOptions) {
        this.p = new VersionSafeProxyOptions(proxyOptions);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return axos.a(this.c, this.r, ImplVersion.getCronetVersion());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    public final void h(String str) {
        if (!new File(str).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.h = str;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.n = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        g(proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        h(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.g = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    @Deprecated
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
