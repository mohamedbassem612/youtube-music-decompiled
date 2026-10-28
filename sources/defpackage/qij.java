package defpackage;

import android.os.Process;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qij extends qnl implements qfh, qdy {
    private final qeb a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final AtomicBoolean e;
    private final awmd f;
    private final awmd g;

    public qij(qeb qebVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, aunn aunnVar) {
        super((short[]) null);
        this.e = new AtomicBoolean();
        this.g = awmdVar4;
        this.a = qebVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.f = new glj(aunnVar, 8);
    }

    private static long b(Long l, long j) {
        return l != null ? Math.min(l.longValue(), j) : j;
    }

    private static axgy c(qie qieVar) {
        aihf aihfVarCreateBuilder = axgy.a.createBuilder();
        if (qieVar.a != null) {
            String str = qieVar.a;
            aihfVarCreateBuilder.copyOnWrite();
            axgy axgyVar = (axgy) aihfVarCreateBuilder.instance;
            str.getClass();
            axgyVar.b |= 1;
            axgyVar.c = str;
        }
        if (qieVar.b != null) {
            long j = qieVar.b.a;
            aihfVarCreateBuilder.copyOnWrite();
            axgy axgyVar2 = (axgy) aihfVarCreateBuilder.instance;
            axgyVar2.b |= 2;
            axgyVar2.d = j;
        }
        if (qieVar.c != null) {
            long j2 = qieVar.c.a;
            aihfVarCreateBuilder.copyOnWrite();
            axgy axgyVar3 = (axgy) aihfVarCreateBuilder.instance;
            axgyVar3.b |= 4;
            axgyVar3.e = j2;
        }
        if (qieVar.d != null) {
            long j3 = qieVar.d.a;
            aihfVarCreateBuilder.copyOnWrite();
            axgy axgyVar4 = (axgy) aihfVarCreateBuilder.instance;
            axgyVar4.b |= 8;
            axgyVar4.f = j3;
        }
        return (axgy) aihfVarCreateBuilder.build();
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        Long lValueOf;
        this.a.b(this);
        qih qihVar = qih.a;
        qfk qfkVar = qihVar.i;
        qfk qfkVar2 = qihVar.j;
        awmd awmdVar = this.f;
        ((Boolean) awmdVar.io()).booleanValue();
        if ((qfkVar == null || qfkVar.a <= 0) && (qfkVar2 == null || qfkVar2.a <= 0)) {
            return;
        }
        awmd awmdVar2 = this.g;
        qfk qfkVar3 = qihVar.c(((Long) awmdVar2.io()).longValue()) ? qihVar.b : qihVar.g;
        if (qfkVar3 != null) {
            long j = qfkVar3.a;
            if (j > 0) {
                if ((qfkVar == null || qfkVar.a < j) && (qfkVar2 == null || qfkVar2.a < j)) {
                    return;
                }
                ((Boolean) awmdVar.io()).booleanValue();
                aihf aihfVarCreateBuilder = axgz.a.createBuilder();
                boolean zC = qihVar.c(((Long) awmdVar2.io()).longValue());
                aihfVarCreateBuilder.copyOnWrite();
                axgz axgzVar = (axgz) aihfVarCreateBuilder.instance;
                axgzVar.b |= 65536;
                axgzVar.r = zC;
                int i = true != zC ? 3 : 2;
                aihfVarCreateBuilder.copyOnWrite();
                axgz axgzVar2 = (axgz) aihfVarCreateBuilder.instance;
                axgzVar2.s = i - 1;
                axgzVar2.b |= 131072;
                qfk qfkVar4 = qihVar.b;
                qfk qfkVar5 = null;
                if (qfkVar4 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar3 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar3.b |= 16;
                    long j2 = qfkVar4.a;
                    axgzVar3.f = j2;
                    lValueOf = Long.valueOf(j2);
                } else {
                    lValueOf = null;
                }
                qfk qfkVar6 = qihVar.c;
                if (qfkVar6 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar4 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar4.b |= SemanticState.Focused;
                    long j3 = qfkVar6.a;
                    axgzVar4.i = j3;
                    lValueOf = Long.valueOf(b(lValueOf, j3));
                }
                qfk qfkVar7 = qihVar.d;
                qfk qfkVar8 = qihVar.e;
                qfk qfkVar9 = qihVar.f;
                qfk qfkVar10 = qihVar.g;
                if (qfkVar10 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar5 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar5.b |= SemanticState.LiveRegion;
                    long j4 = qfkVar10.a;
                    axgzVar5.k = j4;
                    lValueOf = Long.valueOf(b(lValueOf, j4));
                }
                qfk qfkVar11 = qihVar.j;
                qfk qfkVar12 = qihVar.k;
                qfk qfkVar13 = qihVar.i;
                qfk qfkVar14 = qihVar.h;
                int iIntValue = ((Long) this.d.io()).intValue();
                if (iIntValue == 1) {
                    qfkVar5 = qfkVar11;
                } else if (iIntValue == 2) {
                    qfkVar5 = qfkVar12;
                } else if (iIntValue == 3) {
                    qfkVar5 = qfkVar13;
                } else if (iIntValue == 4) {
                    qfkVar5 = qfkVar14;
                }
                if (qfkVar5 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar6 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar6.b |= SemanticState.ReadOnly;
                    long j5 = qfkVar5.a;
                    axgzVar6.l = j5;
                    lValueOf = Long.valueOf(b(lValueOf, j5));
                }
                if (qfkVar13 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar7 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar7.b |= SemanticState.Multiline;
                    long j6 = qfkVar13.a;
                    axgzVar7.o = j6;
                    lValueOf = Long.valueOf(b(lValueOf, j6));
                }
                if (qfkVar14 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar8 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar8.b |= 16384;
                    long j7 = qfkVar14.a;
                    axgzVar8.p = j7;
                    lValueOf = Long.valueOf(b(lValueOf, j7));
                }
                if (qfkVar11 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar9 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar9.b |= SemanticState.Modal;
                    long j8 = qfkVar11.a;
                    axgzVar9.m = j8;
                    lValueOf = Long.valueOf(b(lValueOf, j8));
                }
                if (qfkVar12 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar10 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar10.b |= SemanticState.Obscured;
                    long j9 = qfkVar12.a;
                    axgzVar10.n = j9;
                    lValueOf = Long.valueOf(b(lValueOf, j9));
                }
                qfk qfkVar15 = qihVar.l;
                if (qfkVar15 != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar11 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar11.b |= 32768;
                    long j10 = qfkVar15.a;
                    axgzVar11.q = j10;
                    lValueOf = Long.valueOf(b(lValueOf, j10));
                }
                qie qieVar = qihVar.n;
                if (qieVar.b != null) {
                    axgy axgyVarC = c(qieVar);
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar12 = (axgz) aihfVarCreateBuilder.instance;
                    axgyVarC.getClass();
                    axgzVar12.u = axgyVarC;
                    axgzVar12.b |= 524288;
                    if ((axgyVarC.b & 2) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC.d));
                    }
                    if ((axgyVarC.b & 4) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC.e));
                    }
                    if ((axgyVarC.b & 8) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC.f));
                    }
                }
                qie qieVar2 = qihVar.o;
                if (qieVar2.b != null) {
                    axgy axgyVarC2 = c(qieVar2);
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar13 = (axgz) aihfVarCreateBuilder.instance;
                    axgyVarC2.getClass();
                    axgzVar13.v = axgyVarC2;
                    axgzVar13.b |= 1048576;
                    if ((axgyVarC2.b & 2) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC2.d));
                    }
                    if ((axgyVarC2.b & 4) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC2.e));
                    }
                    if ((axgyVarC2.b & 8) != 0) {
                        lValueOf = Long.valueOf(b(lValueOf, axgyVarC2.f));
                    }
                }
                agev agevVarA = qik.a;
                if (agevVarA == null) {
                    agevVarA = qik.a();
                    qik.a = agevVarA;
                }
                if (agevVarA.g()) {
                    Long l = (Long) agevVarA.c();
                    long jLongValue = l.longValue();
                    aihfVarCreateBuilder.copyOnWrite();
                    axgz axgzVar14 = (axgz) aihfVarCreateBuilder.instance;
                    axgzVar14.b |= 2;
                    axgzVar14.d = jLongValue;
                    lValueOf = Long.valueOf(b(lValueOf, l.longValue()));
                }
                long startElapsedRealtime = Process.getStartElapsedRealtime();
                aihfVarCreateBuilder.copyOnWrite();
                axgz axgzVar15 = (axgz) aihfVarCreateBuilder.instance;
                axgzVar15.b |= 4;
                axgzVar15.e = startElapsedRealtime;
                long jB = b(lValueOf, startElapsedRealtime);
                Long lValueOf2 = Long.valueOf(jB);
                aihfVarCreateBuilder.copyOnWrite();
                axgz axgzVar16 = (axgz) aihfVarCreateBuilder.instance;
                axgzVar16.b |= 262144;
                axgzVar16.t = true;
                lValueOf2.getClass();
                boolean zBooleanValue = ((Boolean) this.c.io()).booleanValue();
                if (jB != 0) {
                    if (!zBooleanValue) {
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar17 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar17.b |= 1;
                        axgzVar17.c = jB;
                    }
                    axgz axgzVar18 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar18.b & 16) != 0) {
                        long j11 = axgzVar18.f - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar19 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar19.b |= 16;
                        axgzVar19.f = j11;
                    }
                    axgz axgzVar20 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar20.b & SemanticState.Focused) != 0) {
                        long j12 = axgzVar20.i - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar21 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar21.b |= SemanticState.Focused;
                        axgzVar21.i = j12;
                    }
                    axgz axgzVar22 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar22.b & SemanticState.Hidden) != 0) {
                        long j13 = axgzVar22.j - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar23 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar23.b |= SemanticState.Hidden;
                        axgzVar23.j = j13;
                    }
                    axgz axgzVar24 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar24.b & 32) != 0) {
                        long j14 = axgzVar24.g - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar25 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar25.b |= 32;
                        axgzVar25.g = j14;
                    }
                    axgz axgzVar26 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar26.b & 64) != 0) {
                        long j15 = axgzVar26.h - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar27 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar27.b |= 64;
                        axgzVar27.h = j15;
                    }
                    axgz axgzVar28 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar28.b & SemanticState.LiveRegion) != 0) {
                        long j16 = axgzVar28.k - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar29 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar29.b |= SemanticState.LiveRegion;
                        axgzVar29.k = j16;
                    }
                    axgz axgzVar30 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar30.b & SemanticState.ReadOnly) != 0) {
                        long j17 = axgzVar30.l - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar31 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar31.b |= SemanticState.ReadOnly;
                        axgzVar31.l = j17;
                    }
                    axgz axgzVar32 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar32.b & SemanticState.Modal) != 0) {
                        long j18 = axgzVar32.m - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar33 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar33.b |= SemanticState.Modal;
                        axgzVar33.m = j18;
                    }
                    axgz axgzVar34 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar34.b & SemanticState.Obscured) != 0) {
                        long j19 = axgzVar34.n - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar35 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar35.b |= SemanticState.Obscured;
                        axgzVar35.n = j19;
                    }
                    axgz axgzVar36 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar36.b & SemanticState.Multiline) != 0) {
                        long j20 = axgzVar36.o - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar37 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar37.b |= SemanticState.Multiline;
                        axgzVar37.o = j20;
                    }
                    axgz axgzVar38 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar38.b & 16384) != 0) {
                        long j21 = axgzVar38.p - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar39 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar39.b |= 16384;
                        axgzVar39.p = j21;
                    }
                    axgz axgzVar40 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar40.b & 32768) != 0) {
                        long j22 = axgzVar40.q - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar41 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar41.b |= 32768;
                        axgzVar41.q = j22;
                    }
                    axgz axgzVar42 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar42.b & 524288) != 0) {
                        axgy axgyVar = axgzVar42.u;
                        if (axgyVar == null) {
                            axgyVar = axgy.a;
                        }
                        axgy axgyVarA = nrj.a(axgyVar, jB);
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar43 = (axgz) aihfVarCreateBuilder.instance;
                        axgyVarA.getClass();
                        axgzVar43.u = axgyVarA;
                        axgzVar43.b |= 524288;
                    }
                    axgz axgzVar44 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar44.b & 1048576) != 0) {
                        axgy axgyVar2 = axgzVar44.v;
                        if (axgyVar2 == null) {
                            axgyVar2 = axgy.a;
                        }
                        axgy axgyVarA2 = nrj.a(axgyVar2, jB);
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar45 = (axgz) aihfVarCreateBuilder.instance;
                        axgyVarA2.getClass();
                        axgzVar45.v = axgyVarA2;
                        axgzVar45.b |= 1048576;
                    }
                    axgz axgzVar46 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar46.b & 4) != 0) {
                        long j23 = axgzVar46.e - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar47 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar47.b |= 4;
                        axgzVar47.e = j23;
                    }
                    axgz axgzVar48 = (axgz) aihfVarCreateBuilder.instance;
                    if ((axgzVar48.b & 2) != 0) {
                        long j24 = axgzVar48.d - jB;
                        aihfVarCreateBuilder.copyOnWrite();
                        axgz axgzVar49 = (axgz) aihfVarCreateBuilder.instance;
                        axgzVar49.b |= 2;
                        axgzVar49.d = j24;
                    }
                }
                qci qciVar2 = qihVar.m;
                if (this.e.getAndSet(true)) {
                    ListenableFuture listenableFuture = aher.a;
                } else {
                    qii qiiVar = (qii) this.b.io();
                    ahng.s(new gwj(qiiVar, aihfVarCreateBuilder, 13), qiiVar.c);
                }
            }
        }
    }

    @Override // defpackage.qfh
    public final void k() {
        this.a.a(this);
    }

    @Override // defpackage.qdy
    public final /* synthetic */ void j(qci qciVar) {
    }
}
