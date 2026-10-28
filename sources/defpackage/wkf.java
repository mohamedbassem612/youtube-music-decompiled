package defpackage;

import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClickTrackingInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wkf {
    public volatile int A;
    public final int B;
    public volatile aihf C;
    private String a;
    private final Boolean b;
    private final abxv c;
    protected Map f;
    public byte[] g;
    public boolean h;
    public zwa k;
    public volatile boolean l;
    public ajgu m;
    public apcu n;
    public argn o;
    public volatile ListenableFuture q;
    public String r;
    public final String s;
    public final String t;
    public final zwa u;
    public final Optional v;
    public final boolean w;
    public tgs x;
    public tnr y;
    public volatile String z;
    public String i = "";
    public boolean j = false;
    public final Object p = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awmd, java.lang.Object] */
    public wkf(String str, abxv abxvVar, zwa zwaVar, int i, boolean z, Optional optional, String str2, Boolean bool, boolean z2, int i2) {
        this.A = 1;
        this.t = str;
        abxvVar.getClass();
        this.c = abxvVar;
        zwaVar.getClass();
        this.u = zwaVar;
        this.A = i;
        this.w = z;
        this.s = str2;
        this.b = bool;
        this.v = optional;
        this.l = z2;
        this.B = i2;
        ?? r1 = abxvVar.a;
        if (r1 != 0) {
            syy syyVar = ((wmr) r1.io()).b;
            if (syyVar.a()) {
                tqj tqjVar = syyVar.b;
                int i3 = tqr.a;
                if (tqjVar.k(1073830441)) {
                    ((wmr) abxvVar.a.io()).c();
                }
            }
        }
    }

    protected static final void A(String... strArr) {
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                i++;
            }
        }
        ahno.O(i == 1);
    }

    private static boolean a() {
        tqj tqjVar = tqi.a;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073840113)) {
                return true;
            }
        }
        return false;
    }

    protected static int f(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public static String j(String str) {
        return str == null ? "" : str;
    }

    protected static byte[] y(byte[] bArr) {
        return bArr == null ? vzh.a : bArr;
    }

    public final aihf B() {
        aihf aihfVar;
        Object obj = this.p;
        synchronized (obj) {
            if (this.C == null) {
                if (g().e(3)) {
                    synchronized (obj) {
                        try {
                            if (this.q == null) {
                                abxv abxvVar = this.c;
                                this.q = ahno.ar(abxvVar.n(h(), this.t), new vdm(this, 11), ((wkv) abxvVar.d).b);
                            }
                            this.C = (aihf) ahng.w(this.q);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    aihf aihfVarO = this.c.o(h(), this.t);
                    C(aihfVarO);
                    this.C = aihfVarO;
                }
            }
            aihfVar = this.C;
        }
        return aihfVar;
    }

    public final void C(aihf aihfVar) {
        alor alorVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).e;
        if (alorVar == null) {
            alorVar = alor.a;
        }
        aihf builder = alorVar.toBuilder();
        if (h().d()) {
            String strL = h().l();
            builder.copyOnWrite();
            alor alorVar2 = (alor) builder.instance;
            alorVar2.b |= 2;
            alorVar2.c = strL;
        }
        Boolean bool = this.b;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            builder.copyOnWrite();
            alor alorVar3 = (alor) builder.instance;
            alorVar3.b |= SemanticState.Hidden;
            alorVar3.e = zBooleanValue;
        }
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        alor alorVar4 = (alor) builder.build();
        alorVar4.getClass();
        innertubeContext$InnerTubeContext.e = alorVar4;
        innertubeContext$InnerTubeContext.b |= 4;
        if (this.o != null) {
            aihf aihfVarCreateBuilder = InnertubeContext$ClickTrackingInfo.a.createBuilder();
            argn argnVar = this.o;
            aguu.ak(argnVar);
            aihfVarCreateBuilder.copyOnWrite();
            InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo = (InnertubeContext$ClickTrackingInfo) aihfVarCreateBuilder.instance;
            innertubeContext$ClickTrackingInfo.d = argnVar;
            innertubeContext$ClickTrackingInfo.b |= 2;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext2 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo2 = (InnertubeContext$ClickTrackingInfo) aihfVarCreateBuilder.build();
            innertubeContext$ClickTrackingInfo2.getClass();
            innertubeContext$InnerTubeContext2.g = innertubeContext$ClickTrackingInfo2;
            innertubeContext$InnerTubeContext2.b |= 32;
        } else if (this.g != null) {
            aihf aihfVarCreateBuilder2 = InnertubeContext$ClickTrackingInfo.a.createBuilder();
            byte[] bArr = this.g;
            aigj aigjVar = aigj.d;
            try {
                aigj aigjVarH = aigj.H(bArr, 0, bArr.length);
                aihfVarCreateBuilder2.copyOnWrite();
                InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo3 = (InnertubeContext$ClickTrackingInfo) aihfVarCreateBuilder2.instance;
                aigjVarH.getClass();
                innertubeContext$ClickTrackingInfo3.b |= 1;
                innertubeContext$ClickTrackingInfo3.c = aigjVarH;
                aihfVar.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext3 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
                InnertubeContext$ClickTrackingInfo innertubeContext$ClickTrackingInfo4 = (InnertubeContext$ClickTrackingInfo) aihfVarCreateBuilder2.build();
                innertubeContext$ClickTrackingInfo4.getClass();
                innertubeContext$InnerTubeContext3.g = innertubeContext$ClickTrackingInfo4;
                innertubeContext$InnerTubeContext3.b |= 32;
            } catch (aiik e) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            }
        }
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext4 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            str.getClass();
            innertubeContext$InnerTubeContext4.b |= 64;
            innertubeContext$InnerTubeContext4.h = str;
        }
        InnertubeContext$ClientInfo defaultInstance = ((InnertubeContext$InnerTubeContext) aihfVar.instance).c;
        if (defaultInstance == null) {
            defaultInstance = InnertubeContext$ClientInfo.getDefaultInstance();
        }
        aihf builder2 = defaultInstance.toBuilder();
        String str2 = this.r;
        if (str2 != null) {
            builder2.copyOnWrite();
            InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) builder2.instance;
            innertubeContext$ClientInfo.b |= 4194304;
            innertubeContext$ClientInfo.m = str2;
        }
        aihfVar.copyOnWrite();
        InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext5 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
        InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) builder2.build();
        innertubeContext$ClientInfo2.getClass();
        innertubeContext$InnerTubeContext5.c = innertubeContext$ClientInfo2;
        innertubeContext$InnerTubeContext5.b |= 1;
        if (this.h) {
            aloo alooVar = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
            if (alooVar == null) {
                alooVar = aloo.a;
            }
            aihf builder3 = alooVar.toBuilder();
            builder3.copyOnWrite();
            aloo alooVar2 = (aloo) builder3.instance;
            alooVar2.b |= SemanticState.ReadOnly;
            alooVar2.c = true;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext6 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            aloo alooVar3 = (aloo) builder3.build();
            alooVar3.getClass();
            innertubeContext$InnerTubeContext6.f = alooVar3;
            innertubeContext$InnerTubeContext6.b |= 16;
        }
        if (this.m != null) {
            aloo alooVar4 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
            if (alooVar4 == null) {
                alooVar4 = aloo.a;
            }
            aihf builder4 = alooVar4.toBuilder();
            ajgu ajguVar = this.m;
            builder4.copyOnWrite();
            aloo alooVar5 = (aloo) builder4.instance;
            ajguVar.getClass();
            alooVar5.g = ajguVar;
            alooVar5.b |= 2097152;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext7 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            aloo alooVar6 = (aloo) builder4.build();
            alooVar6.getClass();
            innertubeContext$InnerTubeContext7.f = alooVar6;
            innertubeContext$InnerTubeContext7.b |= 16;
        }
        if (this.n != null) {
            aloo alooVar7 = ((InnertubeContext$InnerTubeContext) aihfVar.instance).f;
            if (alooVar7 == null) {
                alooVar7 = aloo.a;
            }
            aihf builder5 = alooVar7.toBuilder();
            apcu apcuVar = this.n;
            builder5.copyOnWrite();
            aloo alooVar8 = (aloo) builder5.instance;
            apcuVar.getClass();
            alooVar8.e = apcuVar;
            alooVar8.b |= 131072;
            aihfVar.copyOnWrite();
            InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext8 = (InnertubeContext$InnerTubeContext) aihfVar.instance;
            aloo alooVar9 = (aloo) builder5.build();
            alooVar9.getClass();
            innertubeContext$InnerTubeContext8.f = alooVar9;
            innertubeContext$InnerTubeContext8.b |= 16;
        }
    }

    protected final dov E() {
        dov dovVar = new dov((int[]) null);
        dovVar.F("serviceName", this.t);
        byte[] bArr = this.g;
        if (bArr == null) {
            bArr = vzh.b;
        }
        dovVar.H("clickTrackingParams", bArr);
        dovVar.F("identity", this.u.i());
        return dovVar;
    }

    public String Y() {
        return "NO_CACHE_KEY_VALUE";
    }

    public final String Z() {
        return this.z;
    }

    protected abstract void b();

    public final wkv g() {
        return (wkv) this.c.d;
    }

    public final zwa h() {
        zwa zwaVar = this.k;
        return zwaVar == null ? this.u : zwaVar;
    }

    public agke i() {
        return agpi.a;
    }

    public Map k() {
        if (this.f == null) {
            this.f = new HashMap();
        }
        return this.f;
    }

    protected final void l(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public final void m() {
        o(vzh.b);
    }

    public final void n(aigj aigjVar) {
        if (aigjVar == null) {
            throw new IllegalArgumentException();
        }
        this.g = aigjVar.G();
    }

    public final void o(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public final void p(String str) {
        typ.f(str);
        this.a = str;
    }

    @Deprecated
    public final void q(acjx acjxVar) {
        r(acjxVar.c());
        if (acjxVar.h() != null) {
            o(acjxVar.h());
        }
    }

    public final void r(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
    }

    public final void s(acjx acjxVar) {
        r(acjxVar.c());
        if (acjxVar.h() != null) {
            o(acjxVar.h());
        }
    }

    public final void t() {
        b();
        if (this.g == null) {
            throw new IllegalArgumentException("Must set clickTrackingParams.");
        }
    }

    public final boolean u() {
        return this.b != null;
    }

    public final boolean v() {
        return this.i != "";
    }

    public final boolean w() {
        return !a() && this.A == 3;
    }

    public final boolean x() {
        return (a() || this.A == 1) ? false : true;
    }

    public void z(int i) {
        this.A = 2;
    }

    public void D() {
    }
}
