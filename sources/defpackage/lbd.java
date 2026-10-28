package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lbd {
    private boolean A;
    private boolean B;
    private Boolean C;
    private long D;
    private List E;
    private String F;
    private boolean G;
    private long H;
    private long I;
    private int J;
    private boolean K;
    private Long L;
    private Long M;
    private String N;
    private String O;
    private byte[] P;
    private int Q;
    private long R;
    private long S;
    private boolean T;
    private long U;
    private long V;
    private long W;
    public final ldr a;
    public final String b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public String n;
    public boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private long t;
    private long u;
    private String v;
    private long w;
    private String x;
    private long y;
    private long z;

    public lbd(ldr ldrVar, String str) {
        kro.l(ldrVar);
        kro.i(str);
        this.a = ldrVar;
        this.b = str;
        ldrVar.r();
    }

    static /* synthetic */ byte[] az(HttpURLConnection httpURLConnection) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[SemanticState.ReadOnly];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (inputStream != null) {
                    inputStream.close();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public final String A() {
        this.a.r();
        return this.s;
    }

    public final String B() {
        this.a.r();
        return this.q;
    }

    public final String C() {
        this.a.r();
        return this.r;
    }

    public final String D() {
        this.a.r();
        return this.O;
    }

    public final String E() {
        this.a.r();
        return this.F;
    }

    public final String F() {
        this.a.r();
        return this.N;
    }

    public final List G() {
        this.a.r();
        return this.E;
    }

    public final void H(long j) {
        ldr ldrVar = this.a;
        ldrVar.r();
        long j2 = this.c + j;
        if (j2 > 2147483647L) {
            ldrVar.aT().f.b("Bundle index overflow. appId", lcz.a(this.b));
            j2 = (-1) + j;
        }
        long j3 = this.g + 1;
        if (j3 > 2147483647L) {
            ldrVar.aT().f.b("Delivery index overflow. appId", lcz.a(this.b));
            j3 = 0;
        }
        this.o = true;
        this.c = j2;
        this.g = j3;
    }

    public final void I(byte[] bArr) {
        this.a.r();
        this.o |= this.P != bArr;
        this.P = bArr;
    }

    public final void J(int i) {
        this.a.r();
        this.o |= this.J != i;
        this.J = i;
    }

    public final void K(boolean z) {
        this.a.r();
        this.o |= this.B != z;
        this.B = z;
    }

    public final void L(boolean z) {
        this.a.r();
        this.o |= this.T != z;
        this.T = z;
    }

    public final void M(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.p, str);
        this.p = str;
    }

    public final void N(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.x, str);
        this.x = str;
    }

    public final void O(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.v, str);
        this.v = str;
    }

    public final void P(long j) {
        this.a.r();
        this.o |= this.w != j;
        this.w = j;
    }

    public final void Q(int i) {
        this.a.r();
        this.o |= this.Q != i;
        this.Q = i;
    }

    public final void R(long j) {
        this.a.r();
        this.o |= this.V != j;
        this.V = j;
    }

    public final void S(long j) {
        this.a.r();
        this.o |= this.z != j;
        this.z = j;
    }

    public final void T(long j) {
        this.a.r();
        this.o |= this.D != j;
        this.D = j;
    }

    public final void U(long j) {
        this.a.r();
        this.o |= this.W != j;
        this.W = j;
    }

    public final void V(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.s, str);
        this.s = str;
    }

    public final void W(String str) {
        this.a.r();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.o |= !Objects.equals(this.q, str);
        this.q = str;
    }

    public final void X(long j) {
        this.a.r();
        this.o |= this.y != j;
        this.y = j;
    }

    public final void Y(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.n, str);
        this.n = str;
    }

    public final void Z(long j) {
        this.a.r();
        this.o |= this.u != j;
        this.u = j;
    }

    public final int a() {
        this.a.r();
        return this.J;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final void aa(long j) {
        kro.c(((j > 0L ? 1 : (j == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        this.a.r();
        this.o |= this.c != j;
        this.c = j;
    }

    public final void ab(long j) {
        this.a.r();
        this.o |= this.t != j;
        this.t = j;
    }

    public final void ac(long j) {
        this.a.r();
        this.o |= this.R != j;
        this.R = j;
    }

    public final void ad(long j) {
        this.a.r();
        this.o |= this.S != j;
        this.S = j;
    }

    public final void ae(boolean z) {
        this.a.r();
        this.o |= this.A != z;
        this.A = z;
    }

    public final void af(Boolean bool) {
        this.a.r();
        this.o |= !Objects.equals(this.C, bool);
        this.C = bool;
    }

    public final void ag(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.r, str);
        this.r = str;
    }

    public final void ah(List list) {
        this.a.r();
        if (Objects.equals(this.E, list)) {
            return;
        }
        this.o = true;
        this.E = list != null ? new ArrayList(list) : null;
    }

    public final void ai(String str) {
        this.a.r();
        this.o |= this.O != str;
        this.O = str;
    }

    public final void aj(String str) {
        this.a.r();
        this.o |= !Objects.equals(this.F, str);
        this.F = str;
    }

    public final void ak(long j) {
        this.a.r();
        this.o |= this.I != j;
        this.I = j;
    }

    public final void al(long j) {
        this.a.r();
        this.o |= this.U != j;
        this.U = j;
    }

    public final void am(String str) {
        this.a.r();
        this.o |= this.N != str;
        this.N = str;
    }

    public final void an(boolean z) {
        this.a.r();
        this.o |= this.G != z;
        this.G = z;
    }

    public final void ao(long j) {
        this.a.r();
        this.o |= this.H != j;
        this.H = j;
    }

    public final void ap(boolean z) {
        this.a.r();
        this.o |= this.K != z;
        this.K = z;
    }

    public final void aq(Long l) {
        this.a.r();
        this.o |= !Objects.equals(this.L, l);
        this.L = l;
    }

    public final void ar(Long l) {
        this.a.r();
        this.o |= !Objects.equals(this.M, l);
        this.M = l;
    }

    public final boolean as() {
        this.a.r();
        return this.B;
    }

    public final boolean at() {
        this.a.r();
        return this.T;
    }

    public final boolean au() {
        this.a.r();
        return this.A;
    }

    public final boolean av() {
        this.a.r();
        return this.o;
    }

    public final boolean aw() {
        this.a.r();
        return this.G;
    }

    public final boolean ax() {
        this.a.r();
        return this.K;
    }

    public final byte[] ay() {
        this.a.r();
        return this.P;
    }

    public final int b() {
        this.a.r();
        return this.Q;
    }

    public final long c() {
        this.a.r();
        return this.w;
    }

    public final long d() {
        this.a.r();
        return this.d;
    }

    public final long e() {
        this.a.r();
        return this.V;
    }

    public final long f() {
        this.a.r();
        return this.z;
    }

    public final long g() {
        this.a.r();
        return this.D;
    }

    public final long h() {
        this.a.r();
        return this.W;
    }

    public final long i() {
        this.a.r();
        return this.y;
    }

    public final long j() {
        this.a.r();
        return this.g;
    }

    public final long k() {
        this.a.r();
        return this.u;
    }

    public final long l() {
        this.a.r();
        return this.c;
    }

    public final long m() {
        this.a.r();
        return this.t;
    }

    public final long n() {
        this.a.r();
        return this.R;
    }

    public final long o() {
        this.a.r();
        return this.S;
    }

    public final long p() {
        this.a.r();
        return this.I;
    }

    public final long q() {
        this.a.r();
        return this.U;
    }

    public final long r() {
        this.a.r();
        return this.H;
    }

    public final Boolean s() {
        this.a.r();
        return this.C;
    }

    public final Long t() {
        this.a.r();
        return this.L;
    }

    public final Long u() {
        this.a.r();
        return this.M;
    }

    public final String v() {
        this.a.r();
        String str = this.n;
        Y(null);
        return str;
    }

    public final String w() {
        this.a.r();
        return this.b;
    }

    public final String x() {
        this.a.r();
        return this.p;
    }

    public final String y() {
        this.a.r();
        return this.x;
    }

    public final String z() {
        this.a.r();
        return this.v;
    }
}
