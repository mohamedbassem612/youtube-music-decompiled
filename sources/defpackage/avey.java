package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avey extends avbt {
    public static final Logger b;
    public static final Set c;
    static final boolean d;
    static final boolean e;
    protected static final boolean f;
    public static final avex g;
    private static final String s;
    private static final String t;
    private static final String u;
    private static String v;
    private atxy A;
    public final String j;
    public final int k;
    public final long l;
    public final avcj m;
    public final avbs n;
    public final agfp o;
    public boolean p;
    public boolean q;
    private final String w;
    private final avhw x;
    private boolean y;
    private Executor z;
    public final Random h = new Random();
    protected volatile int r = 1;
    public final AtomicReference i = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(avey.class.getName());
        b = logger;
        c = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        s = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        t = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        u = property3;
        d = Boolean.parseBoolean(property);
        e = Boolean.parseBoolean(property2);
        f = Boolean.parseBoolean(property3);
        avex avexVar = null;
        try {
            try {
                try {
                    avex avexVar2 = (avex) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, avey.class.getClassLoader()).asSubclass(avex.class).getConstructor(null).newInstance(null);
                    if (avexVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", avexVar2.b());
                    } else {
                        avexVar = avexVar2;
                    }
                } catch (Exception e2) {
                    b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            b.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        g = avexVar;
    }

    protected avey(String str, avbo avboVar, avjv avjvVar, agfp agfpVar, boolean z) {
        long nanos;
        avboVar.getClass();
        str.getClass();
        URI uriCreate = URI.create("//".concat(str));
        ahno.K(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        authority.getClass();
        this.w = authority;
        this.j = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.k = 443;
        } else {
            this.k = uriCreate.getPort();
        }
        Executor executor = avboVar.e;
        if (executor != null) {
            this.x = new avjx(executor, 1);
        } else {
            this.x = new avjx(avjvVar, 0);
        }
        if (z) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            nanos = 30000000000L;
        } else {
            String property = System.getProperty("networkaddress.cache.ttl");
            if (property != null) {
                try {
                    nanos = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    b.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                    nanos = 30;
                }
            } else {
                nanos = 30;
            }
            if (nanos > 0) {
                nanos = TimeUnit.SECONDS.toNanos(nanos);
            }
        }
        this.l = nanos;
        this.o = agfpVar;
        this.m = avboVar.b;
        this.n = avboVar.c;
    }

    public static String e() {
        String str = v;
        if (str != null) {
            return str;
        }
        try {
            String hostName = InetAddress.getLocalHost().getHostName();
            v = hostName;
            return hostName;
        } catch (UnknownHostException e2) {
            throw new RuntimeException(e2);
        }
    }

    private final void f() {
        if (this.q || this.y) {
            return;
        }
        if (this.p) {
            long j = this.l;
            if (j != 0 && (j <= 0 || this.o.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.q = true;
        this.z.execute(new avev(this, this.A));
    }

    @Override // defpackage.avbt
    public final String a() {
        return this.w;
    }

    @Override // defpackage.avbt
    public final void b() {
        ahno.P(this.A != null, "not started");
        f();
    }

    @Override // defpackage.avbt
    public final void c() {
        if (this.y) {
            return;
        }
        this.y = true;
        Executor executor = this.z;
        if (executor != null) {
            this.x.b(executor);
            this.z = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.avbt
    public final void d(atxy atxyVar) {
        ahno.P(this.A == null, "already started");
        this.z = this.x.a();
        this.A = atxyVar;
        f();
    }
}
