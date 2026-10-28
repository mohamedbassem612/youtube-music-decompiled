package defpackage;

import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avhf extends atxy {
    private static final auzl H;
    private static final auza I;
    public static final Logger b = Logger.getLogger(avhf.class.getName());
    static final long c;
    public static final long d;
    public static final avhw e;
    static final Pattern f;
    public static final Method g;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    List E;
    public final avgj F;
    avjt G;
    public avhw h;
    public avhw i;
    public final List j;
    public avbw k;
    final List l;
    public final String m;
    public String n;
    String o;
    auzl p;
    auza q;
    public long r;
    int s;
    int t;
    long u;
    long v;
    public boolean w;
    auzw x;
    boolean y;
    public boolean z;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        c = 1800000L;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        d = 1000L;
        e = new avjx(avfp.m, 0);
        H = auzl.b;
        I = auza.a;
        f = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("avcr");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e2) {
            b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            b.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e3);
        }
        g = declaredMethod;
    }

    public avhf(SocketAddress socketAddress, String str, avgj avgjVar) {
        super(null);
        this.G = new avjt();
        avhw avhwVar = e;
        this.h = avhwVar;
        this.i = avhwVar;
        this.j = new ArrayList();
        this.k = avbw.b();
        this.l = new ArrayList();
        this.o = "pick_first";
        this.p = H;
        this.q = I;
        this.r = c;
        this.s = 5;
        this.t = 5;
        this.u = 16777216L;
        this.v = 1048576L;
        this.w = true;
        this.x = auzw.a;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = new ArrayList();
        this.m = u(socketAddress);
        this.F = avgjVar;
        avbw avbwVar = new avbw();
        avbwVar.e(new avhd(socketAddress, str));
        this.k = avbwVar;
        Iterator it = auzc.a().b().iterator();
        while (it.hasNext()) {
            ((auzb) it.next()).a();
        }
    }

    static String u(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", "/" + String.valueOf(socketAddress), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static axoz v(String str, avbw avbwVar) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        avbu avbuVarA = uri != null ? avbwVar.a(uri.getScheme()) : null;
        if (avbuVarA == null && !f.matcher(str).matches()) {
            try {
                URI uri2 = new URI(avbwVar.c(), "", "/" + str, null);
                uri = uri2;
                avbuVarA = avbwVar.a(uri2.getScheme());
            } catch (URISyntaxException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        if (avbuVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.cn((byte) 41, sb, " (") : ""));
        }
        return new axoz(new avkh(uri), avbuVarA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static axoz w(String str, avbw avbwVar) {
        char c2;
        avcm avcmVarA;
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        char c3 = 0;
        try {
            try {
                BitSet bitSet = avcm.a;
                try {
                    avcl avclVar = new avcl();
                    int length = str.length();
                    int i3 = 0;
                    while (true) {
                        i = -1;
                        if (i3 < length) {
                            char cCharAt = str.charAt(i3);
                            if (cCharAt == ':') {
                                break;
                            }
                            if (cCharAt != '/' && cCharAt != '?' && cCharAt != '#') {
                                i3++;
                            }
                            throw new URISyntaxException(str, e.getMessage());
                        }
                        i3 = -1;
                        break;
                    }
                    try {
                        if (i3 < 0) {
                            throw new IllegalArgumentException("Missing required scheme.");
                        }
                        avclVar.e(str.substring(0, i3));
                        int i4 = i3 + 1;
                        int i5 = i3 + 2;
                        if (i5 < length) {
                            c2 = 1;
                            try {
                                if (str.charAt(i4) == '/' && str.charAt(i5) == '/') {
                                    int i6 = i3 + 3;
                                    i4 = i6;
                                    while (i4 < length) {
                                        char cCharAt2 = str.charAt(i4);
                                        if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                                            break;
                                        }
                                        i4++;
                                    }
                                    String strSubstring = str.substring(i6, i4);
                                    if (strSubstring == null) {
                                        avclVar.f();
                                        avclVar.b(null);
                                        avclVar.c();
                                        c3 = 0;
                                    } else {
                                        int iIndexOf = strSubstring.indexOf(64);
                                        if (iIndexOf >= 0) {
                                            String strSubstring2 = strSubstring.substring(0, iIndexOf);
                                            c3 = 0;
                                            avcm.e(strSubstring2, "userInfo", avcm.f, null);
                                            avclVar.e = strSubstring2;
                                            i2 = iIndexOf + 1;
                                        } else {
                                            c3 = 0;
                                            avclVar.f();
                                            i2 = 0;
                                        }
                                        for (int length2 = strSubstring.length() - 1; length2 >= i2; length2--) {
                                            char cCharAt3 = strSubstring.charAt(length2);
                                            if (cCharAt3 == ':') {
                                                i = length2;
                                                break;
                                            }
                                            if (cCharAt3 == ']' || !avcm.a.get(cCharAt3)) {
                                                break;
                                            }
                                        }
                                        if (i < 0) {
                                            avclVar.d(strSubstring.substring(i2));
                                            avclVar.c();
                                        } else {
                                            avclVar.d(strSubstring.substring(i2, i));
                                            String strSubstring3 = strSubstring.substring(i + 1);
                                            if (strSubstring3 != null && !strSubstring3.isEmpty()) {
                                                try {
                                                    Integer.parseInt(strSubstring3);
                                                } catch (NumberFormatException e2) {
                                                    throw new IllegalArgumentException("Invalid port", e2);
                                                }
                                            }
                                            avclVar.g = strSubstring3;
                                        }
                                    }
                                } else {
                                    c3 = 0;
                                }
                            } catch (IllegalArgumentException e3) {
                                e = e3;
                            } catch (URISyntaxException e4) {
                                e = e4;
                                sb.append(e.getMessage());
                                avcmVarA = null;
                            }
                        } else {
                            c3 = 0;
                            c2 = 1;
                        }
                        int i7 = i4;
                        while (i7 < length) {
                            char cCharAt4 = str.charAt(i7);
                            if (cCharAt4 == '?' || cCharAt4 == '#') {
                                break;
                            }
                            i7++;
                        }
                        String strSubstring4 = str.substring(i4, i7);
                        ahno.G(strSubstring4 != null ? c2 : c3, "Path can be empty but not null");
                        avcm.d(strSubstring4, null);
                        avclVar.b = strSubstring4;
                        if (i7 < length && str.charAt(i7) == '?') {
                            int i8 = i7 + 1;
                            int i9 = i8;
                            while (i9 < length && str.charAt(i9) != '#') {
                                i9++;
                            }
                            String strSubstring5 = str.substring(i8, i9);
                            if (strSubstring5 != null) {
                                avcm.e(strSubstring5, "query", avcm.i, null);
                            }
                            avclVar.c = strSubstring5;
                            i7 = i9;
                        }
                        if (i7 < length && str.charAt(i7) == '#') {
                            String strSubstring6 = str.substring(i7 + 1);
                            if (strSubstring6 != null) {
                                avcm.e(strSubstring6, "fragment", avcm.j, null);
                            }
                            avclVar.d = strSubstring6;
                        }
                        avcmVarA = avclVar.a();
                        avbu avbuVarA = avcmVarA != null ? avbwVar.a(avcmVarA.k) : null;
                        if (avbuVarA == null && !f.matcher(str).matches()) {
                            String strC = avbwVar.c();
                            BitSet bitSet2 = avcm.a;
                            avcl avclVar2 = new avcl();
                            avclVar2.e(strC.toLowerCase(Locale.ROOT));
                            avclVar2.b("");
                            avclVar2.b = avcm.b("/".concat(String.valueOf(str)), avcm.h);
                            avcmVarA = avclVar2.a();
                            avbuVarA = avbwVar.a(avcmVarA.k);
                        }
                        if (avbuVarA != null) {
                            return new axoz(new avkg(avcmVarA), avbuVarA);
                        }
                        String strCn = sb.length() > 0 ? a.cn((byte) 41, sb, " (") : "";
                        Object[] objArr = new Object[2];
                        objArr[c3] = str;
                        objArr[c2] = strCn;
                        throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", objArr));
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                    }
                } catch (IllegalArgumentException e6) {
                    e = e6;
                }
                throw new URISyntaxException(str, e.getMessage());
            } catch (URISyntaxException e7) {
                e = e7;
            }
        } catch (URISyntaxException e8) {
            e = e8;
            c2 = 1;
        }
    }
}
