package defpackage;

import android.content.Context;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class sdx implements sds {
    public final ajbd a;
    public final tqj b;
    public final awmd c;
    public final String d;
    public final boolean e;
    public final vwt f;
    private final Context g;
    private final String h;
    private final boolean i;
    private volatile boolean j;
    private final agfr k;
    private final abxu l;

    public sdx(Context context, String str, ajbd ajbdVar, vwt vwtVar, boolean z, tqj tqjVar, abxu abxuVar, awmd awmdVar) {
        context.getClass();
        str.getClass();
        vwtVar.getClass();
        tqjVar.getClass();
        abxuVar.getClass();
        awmdVar.getClass();
        this.g = context;
        this.h = str;
        this.a = ajbdVar;
        this.f = vwtVar;
        this.i = z;
        this.b = tqjVar;
        this.l = abxuVar;
        this.c = awmdVar;
        this.d = "a.".concat(str);
        int i = tqr.a;
        this.e = tqjVar.k(1073813997);
        agfr agfrVarAl = aguu.al(new agfr() { // from class: sdw
            /* JADX WARN: Code duplicated, block: B:20:0x0062  */
            @Override // defpackage.agfr
            public final Object io() {
                float f;
                oap oapVarA;
                sdx sdxVar = this.a;
                ajbd ajbdVar2 = sdxVar.a;
                long jA = ajbdVar2 == null ? -1L : ajbdVar2.k;
                tqj tqjVar2 = sdxVar.b;
                int i2 = tqr.a;
                if (tqjVar2.k(1073808284)) {
                    jA = tqjVar2.a(1073873822);
                }
                boolean zK = tqjVar2.k(1073808281);
                int i3 = (jA == 2 || zK) ? 3 : 2;
                boolean zK2 = tqjVar2.k(1073807934);
                long jAm = tym.am(tqjVar2);
                long jAl = tym.al(tqjVar2);
                int iA = tqjVar2.a(1074016900) & 2;
                if (tym.av(tqjVar2)) {
                    int iA2 = (tqjVar2.a(1074016900) >> 2) & 3;
                    if (iA2 == 1) {
                        f = 0.001f;
                    } else if (iA2 == 2) {
                        f = 0.01f;
                    } else if (iA2 != 3) {
                        f = 0.0f;
                    } else {
                        f = 0.1f;
                    }
                } else {
                    f = 0.0f;
                }
                String str2 = sdxVar.d;
                aihf aihfVarCreateBuilder = oaq.a.createBuilder();
                aihfVarCreateBuilder.getClass();
                aihfVarCreateBuilder.copyOnWrite();
                oaq oaqVar = (oaq) aihfVarCreateBuilder.instance;
                oaqVar.h = 2;
                oaqVar.b |= 64;
                aihfVarCreateBuilder.copyOnWrite();
                oaq oaqVar2 = (oaq) aihfVarCreateBuilder.instance;
                oaqVar2.c = i3 - 1;
                oaqVar2.b |= 1;
                aihfVarCreateBuilder.copyOnWrite();
                oaq oaqVar3 = (oaq) aihfVarCreateBuilder.instance;
                oaqVar3.b |= 4;
                oaqVar3.e = !zK;
                aihfVarCreateBuilder.copyOnWrite();
                oaq oaqVar4 = (oaq) aihfVarCreateBuilder.instance;
                oaqVar4.b |= 32;
                oaqVar4.g = str2;
                if (zK2) {
                    if (jAm != 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        oaq oaqVar5 = (oaq) aihfVarCreateBuilder.instance;
                        oaqVar5.b |= 1048576;
                        oaqVar5.u = true;
                        aihfVarCreateBuilder.copyOnWrite();
                        oaq oaqVar6 = (oaq) aihfVarCreateBuilder.instance;
                        oaqVar6.b |= SemanticState.ReadOnly;
                        oaqVar6.k = jAm;
                    }
                    if (jAl != 0) {
                        aihfVarCreateBuilder.copyOnWrite();
                        oaq oaqVar7 = (oaq) aihfVarCreateBuilder.instance;
                        oaqVar7.b |= 524288;
                        oaqVar7.t = jAl;
                    }
                }
                if (iA != 0) {
                    aihfVarCreateBuilder.copyOnWrite();
                    oaq oaqVar8 = (oaq) aihfVarCreateBuilder.instance;
                    oaqVar8.b |= 4194304;
                    oaqVar8.w = false;
                }
                if (f > 0.0f) {
                    aihf aihfVarCreateBuilder2 = oax.a.createBuilder();
                    aihfVarCreateBuilder2.getClass();
                    aihfVarCreateBuilder2.copyOnWrite();
                    oax oaxVar = (oax) aihfVarCreateBuilder2.instance;
                    oaxVar.b |= 2;
                    oaxVar.d = f;
                    aihn aihnVarBuild = aihfVarCreateBuilder2.build();
                    aihnVarBuild.getClass();
                    aihfVarCreateBuilder.copyOnWrite();
                    oaq oaqVar9 = (oaq) aihfVarCreateBuilder.instance;
                    oaqVar9.j = (oax) aihnVarBuild;
                    oaqVar9.b |= SemanticState.Hidden;
                }
                aihn aihnVarBuild2 = aihfVarCreateBuilder.build();
                aihnVarBuild2.getClass();
                oaq oaqVar10 = (oaq) aihnVarBuild2;
                boolean z2 = oaqVar10.u;
                long j = oaqVar10.k;
                long j2 = oaqVar10.t;
                oax oaxVar2 = oaqVar10.j;
                if (oaxVar2 == null) {
                    oaxVar2 = oax.a;
                }
                vwt vwtVar2 = sdxVar.f;
                float f2 = oaxVar2.d;
                if ((tqjVar2.a(1073960061) & 2) != 0) {
                    Object objIo = sdxVar.c.io();
                    objIo.getClass();
                    oapVarA = vwtVar2.ad((ExecutorService) objIo, oaqVar10);
                } else if (sdxVar.e) {
                    oapVarA = vwtVar2.ad(sdxVar.i(), oaqVar10);
                } else {
                    oapVarA = oap.a((Context) vwtVar2.a, Executors.newCachedThreadPool(), oaqVar10);
                    oapVarA.getClass();
                }
                oapVarA.a.a.b();
                return oapVarA;
            }
        });
        agfrVarAl.getClass();
        this.k = agfrVarAl;
    }

    protected static final boolean j(String str) {
        return str.length() <= 8;
    }

    @Override // defpackage.sds
    public ListenableFuture a(boolean z) {
        if (!z) {
            return new aher(g());
        }
        qoh qohVar = new qoh(this, 14);
        Executor executor = (Executor) this.l.t().c;
        long j = afwl.a;
        ahfo ahfoVar = new ahfo(new ahcz(afty.c(false), qohVar, 1));
        executor.execute(ahfoVar);
        ListenableFuture listenableFutureO = ahng.o(ahfoVar);
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    @Override // defpackage.sds
    public ListenableFuture b() {
        ListenableFuture listenableFutureO = ahng.o(ahno.ap(new qoh(this, 13), i()));
        listenableFutureO.getClass();
        return listenableFutureO;
    }

    @Override // defpackage.sds
    public final String c(String str) {
        if (this.i) {
            return "";
        }
        Object objIo = this.k.io();
        objIo.getClass();
        String strB = ((oap) objIo).a.b(this.g, str);
        strB.getClass();
        return strB;
    }

    @Override // defpackage.sds
    public String d() {
        return h();
    }

    @Override // defpackage.sds
    public final /* synthetic */ String e() {
        return "ms";
    }

    @Override // defpackage.sds
    public final String f() {
        return this.d;
    }

    public final Optional g() {
        jwa jwaVarE = null;
        try {
            jwaVarE = jwb.e(this.g);
        } catch (kmj unused) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequesterV2] GooglePlayServicesNotAvailableException. YouTube is not expected to be able to run without Google Play Services");
        } catch (kmk e) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequesterV2] GooglePlayServicesRepairableException: ".concat(String.valueOf(e.getMessage())));
        } catch (Throwable th) {
            zvp.a(zvn.b, zvm.a, "[DefaultAdSignalsRequesterV2] Unexpected unplanned exception: ".concat(String.valueOf(th.getMessage())));
        }
        return Optional.ofNullable(jwaVarE);
    }

    public final String h() {
        String strBi;
        try {
            Object objIo = this.k.io();
            objIo.getClass();
            strBi = ((oap) objIo).a.a(this.g);
            if (TextUtils.isEmpty(strBi)) {
                strBi = taq.bi(14);
            } else if (!this.j) {
                synchronized (this) {
                    this.j = true;
                }
            }
        } catch (Throwable th) {
            th.toString();
            strBi = taq.bi(13);
        }
        strBi.getClass();
        return strBi;
    }

    public final ExecutorService i() {
        if (!this.e || this.j) {
            Object obj = this.l.t().c;
            obj.getClass();
            return (ExecutorService) obj;
        }
        Object obj2 = this.l.t().f;
        obj2.getClass();
        return (ExecutorService) obj2;
    }
}
