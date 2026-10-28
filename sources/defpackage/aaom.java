package defpackage;

import android.net.Uri;
import com.google.protos.youtube.api.innertube.StreamingDataOuterClass$StreamingData;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaom extends abpd {
    private static final long k;
    private final awmd l;
    private final awmd m;
    private final awmd n;
    private final vyo o;
    private final aauk p;
    private final mbc q;
    private final hno r;
    private final abfv s;
    private final grj t;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        k = 5000L;
    }

    public aaom(tbt tbtVar, abps abpsVar, abrg abrgVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, Executor executor, Executor executor2, Set set, vyo vyoVar, mbc mbcVar, grj grjVar, txp txpVar, abfv abfvVar, aauk aaukVar, abmt abmtVar, abpk abpkVar, abwj abwjVar, hno hnoVar) {
        super(tbtVar, abpsVar, abrgVar, executor, executor2, set, mbcVar, vyoVar, abmtVar, txpVar, abpkVar, abwjVar);
        this.l = awmdVar;
        this.m = awmdVar2;
        this.n = awmdVar3;
        this.o = vyoVar;
        this.t = grjVar;
        this.s = abfvVar;
        this.p = aaukVar;
        this.q = mbcVar;
        this.r = hnoVar;
    }

    private final wgs w(String str, wgs wgsVar) {
        aauk aaukVar = this.p;
        if (!aaukVar.b.m(20, 45368475L)) {
            return wgsVar;
        }
        wgs wgsVar2 = null;
        if (wgsVar != null) {
            abtd abtdVar = (abtd) this.n.io();
            mbc mbcVar = this.q;
            alaw alawVar = wgsVar.b;
            Uri uriG = isi.G(abtdVar, str, alawVar.e, alawVar.r, alawVar.q, alawVar.p, mbcVar.b() + 18000000);
            if (uriG != null || aaukVar.c().v) {
                aihh aihhVar = (aihh) alawVar.toBuilder();
                String string = uriG == null ? "" : uriG.toString();
                aihhVar.copyOnWrite();
                alaw alawVar2 = (alaw) aihhVar.instance;
                string.getClass();
                alawVar2.c |= 2;
                alawVar2.f = string;
                wgsVar2 = new wgs((alaw) aihhVar.build(), str, false, null);
            }
        }
        return wgsVar2 != null ? wgsVar2 : wgsVar;
    }

    private final aamt x(String str) {
        try {
            agev agevVar = (agev) ((aanb) this.l.io()).b().l().e(str).get(k, TimeUnit.MILLISECONDS);
            if (!agevVar.g()) {
                return null;
            }
            aamt aamtVar = (aamt) agevVar.c();
            if (((vxz) this.r.k).m(62, 45732724L) && aamtVar.o == aamn.EMERGENCY_BUFFER) {
                return null;
            }
            return aamtVar;
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    private static final boolean y(wjf wjfVar, wgs wgsVar) {
        wgs wgsVarF;
        return (wgsVar == null || wjfVar.g() == null || (wgsVarF = wjfVar.g().f(wgsVar.e(), wgsVar.C())) == null || wgsVarF.k() != wgsVar.k()) ? false : true;
    }

    @Override // defpackage.abpd
    protected final wjf a(String str, wjf wjfVar) {
        aamt aamtVarX;
        aams aamsVar;
        if (this.s.r()) {
            awmd awmdVar = this.l;
            if (((aanb) awmdVar.io()).g() && (aamtVarX = x(str)) != null) {
                aauk aaukVar = this.p;
                if (!aaukVar.c().u || ((aamsVar = aamtVarX.m) != null && aamsVar.g())) {
                    vyo vyoVar = this.o;
                    wgs wgsVarW = null;
                    if (vyoVar != null && vyoVar.b() != null) {
                        aoev aoevVar = vyoVar.b().i;
                        if (aoevVar == null) {
                            aoevVar = aoev.a;
                        }
                        if (aoevVar.h) {
                            aams aamsVar2 = aamtVarX.m;
                            aqmh aqmhVarC = (aamsVar2 == null || !aamsVar2.e() || aamsVar2.a() + aams.a > aamsVar2.f.f().toEpochMilli()) ? aamtVarX.a.c() : null;
                            if (aqmhVarC != null) {
                                wjfVar.ag(new abuz(aqmhVarC));
                            }
                        }
                    }
                    aaqn aaqnVarB = ((aanb) awmdVar.io()).b();
                    aadc aadcVarC = aaqnVarB.c();
                    aamm aammVarG = aaukVar.s() ? aaqnVarB.f().g(aamtVarX.b(), null) : aamtVarX.p;
                    if (aadcVarC != null && aammVarG != null) {
                        aapf aapfVarR = aagu.r(aamtVarX.b(), wjfVar.f().aR(), wjfVar.Q(), aammVarG, aadcVarC, this.t);
                        boolean z = aapfVarR.a;
                        wgs wgsVar = aapfVarR.b;
                        wgs wgsVar2 = aapfVarR.c;
                        boolean z2 = aapfVarR.d;
                        boolean z3 = aapfVarR.e;
                        boolean zY = y(wjfVar, wgsVar);
                        boolean zY2 = y(wjfVar, wgsVar2);
                        if (z) {
                            wgs wgsVarW2 = w(wjfVar.G(), wgsVar);
                            wgs wgsVarW3 = w(wjfVar.G(), wgsVar2);
                            wjb wjbVar = (wjb) this.m.io();
                            long jE = wjfVar.e();
                            StreamingDataOuterClass$StreamingData defaultInstance = wjfVar.u().h;
                            if (defaultInstance == null) {
                                defaultInstance = StreamingDataOuterClass$StreamingData.getDefaultInstance();
                            }
                            wjfVar = isi.I(wjfVar, wjbVar, wgsVarW2, wgsVarW3, jE, defaultInstance.d, false, aaukVar);
                        } else {
                            wgs wgsVarW4 = (zY && z2) ? w(wjfVar.G(), wgsVar) : null;
                            if (zY2 && z3) {
                                wgsVarW = w(wjfVar.G(), wgsVar2);
                            }
                            wgs wgsVar3 = wgsVarW;
                            if (wgsVarW4 != null || wgsVar3 != null) {
                                wjb wjbVar2 = (wjb) this.m.io();
                                long jE2 = wjfVar.e();
                                StreamingDataOuterClass$StreamingData defaultInstance2 = wjfVar.u().h;
                                if (defaultInstance2 == null) {
                                    defaultInstance2 = StreamingDataOuterClass$StreamingData.getDefaultInstance();
                                }
                                wjfVar = isi.I(wjfVar, wjbVar2, wgsVarW4, wgsVar3, jE2, defaultInstance2.d, true, aaukVar);
                            }
                        }
                        boolean z4 = !zY;
                        boolean z5 = !zY2;
                        tny tnyVar = wjfVar.k().d;
                        ainq ainqVarH = wjh.h(tnyVar);
                        if (ainqVarH != null) {
                            tnyVar.b(new acju(ainqVarH, z4, z5, 1));
                        }
                    }
                }
            }
        }
        return wjfVar;
    }
}
