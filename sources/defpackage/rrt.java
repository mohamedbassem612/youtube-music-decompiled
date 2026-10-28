package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarCollections;
import j$.util.stream.IntStream;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rrt implements tdk {
    public final avlh a;
    public volatile aobj b;
    public final AtomicBoolean c;
    public final List d;
    public final vxz e;
    private final mbc g;
    private final awkx h;
    private final avlh i;
    private final avlh j;
    private final avlh k;
    private final avmb l;
    private final avmm m;
    private final tfq n;

    public rrt(vxz vxzVar, avlh avlhVar, avlh avlhVar2, avlh avlhVar3, mbc mbcVar, tfq tfqVar, avmb avmbVar) {
        awkx awkxVar = new awkx();
        this.h = awkxVar;
        this.a = awkxVar;
        this.c = new AtomicBoolean(true);
        this.b = aobj.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        this.e = vxzVar;
        this.g = mbcVar;
        this.n = tfqVar;
        this.i = avlhVar;
        this.j = avlhVar2;
        this.k = avlhVar3;
        this.l = avmbVar;
        this.d = new ArrayList();
        this.m = new avmm();
        if (vxzVar.l(10, 45422870L, false)) {
            return;
        }
        f();
    }

    private final void f() {
        vxz vxzVar = this.e;
        if (vxzVar.l(0, 45371409L, false)) {
            this.m.c(this.i.ac(this.j, new jnx(2)).L(this.l).ak(new rlb(this, 4)));
        }
        if (vxzVar.l(6, 45413863L, false)) {
            this.m.c(this.k.ac(this.j, new jnx(3)).L(this.l).ak(new rlb(this, 5)));
        }
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void a() {
        nsi.m(this);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02df  */
    public final void d(aobj aobjVar) {
        double d;
        long j;
        Map mapUnmodifiableMap;
        double dO;
        List list = this.d;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            mbc mbcVar = this.g;
            vxz vxzVar = this.e;
            boolean zL = vxzVar.l(1, 45371413L, false);
            long jC = vxzVar.c(2, 45371414L, 0L);
            long jB = mbcVar.b();
            aihf aihfVarCreateBuilder = aobe.a.createBuilder();
            synchronized (list) {
                try {
                    int iMin = ((toi) list.get(0)).a;
                    int iMax = ((toi) list.get(0)).a;
                    Iterator it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        int i2 = ((toi) it.next()).a;
                        iMin = Math.min(iMin, i2);
                        iMax = Math.max(iMax, i2);
                        i += i2;
                    }
                    long j2 = ((toi) list.get(0)).b;
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar.b |= 2;
                    aobeVar.c = j2;
                    long j3 = ((toi) aguu.K(list)).b;
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar2 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar2.b |= 4;
                    aobeVar2.d = j3;
                    long size = list.size();
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar3 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar3.b |= 8;
                    aobeVar3.e = size;
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar4 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar4.b |= 16;
                    aobeVar4.f = iMin;
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar5 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar5.b |= SemanticState.Focused;
                    aobeVar5.i = iMax;
                    int size2 = i / list.size();
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar6 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar6.b |= 32;
                    aobeVar6.g = size2;
                    if (zL || jC > 0) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.ensureCapacity(list.size());
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((toi) it2.next()).a));
                        }
                        if (zL) {
                            afxw.P(1, 2);
                            double[] dArrA = ahbl.a(arrayList);
                            int length = dArrA.length;
                            ahno.G(length > 0, "Cannot calculate quantiles of an empty dataset");
                            if (afxw.S(dArrA)) {
                                dO = Double.NaN;
                                d = Double.NaN;
                            } else {
                                int i3 = length - 1;
                                long j4 = i3;
                                d = Double.NaN;
                                int iU = (int) afxw.U(j4, 2L, RoundingMode.DOWN);
                                afxw.R(iU, dArrA, 0, i3);
                                int i4 = (int) (j4 - (((long) iU) << 1));
                                if (i4 == 0) {
                                    dO = dArrA[iU];
                                } else {
                                    int i5 = iU + 1;
                                    afxw.R(i5, dArrA, i5, i3);
                                    dO = afxw.O(dArrA[iU], dArrA[i5], i4, 2.0d);
                                }
                            }
                            aihfVarCreateBuilder.copyOnWrite();
                            aobe aobeVar7 = (aobe) aihfVarCreateBuilder.instance;
                            aobeVar7.b |= 64;
                            aobeVar7.h = (int) dO;
                        } else {
                            d = Double.NaN;
                        }
                        if (jC > 0) {
                            int i6 = (int) jC;
                            agke agkeVar = (agke) IntStream.CC.rangeClosed(0, i6).boxed().collect(aghu.a);
                            ahno.G(i6 > 0, "Quantile scale must be positive");
                            int[] iArrS = ahng.S(agkeVar);
                            for (int i7 : iArrS) {
                                afxw.P(i7, i6);
                            }
                            int length2 = iArrS.length;
                            ahno.G(length2 > 0, "Indexes must be a non empty array");
                            double[] dArrA2 = ahbl.a(arrayList);
                            ahno.G(dArrA2.length > 0, "Cannot calculate quantiles of an empty dataset");
                            if (afxw.S(dArrA2)) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (int i8 : iArrS) {
                                    linkedHashMap.put(Integer.valueOf(i8), Double.valueOf(d));
                                }
                                mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
                                j = jB;
                            } else {
                                int[] iArr = new int[length2];
                                int[] iArr2 = new int[length2];
                                int[] iArr3 = new int[length2 << 1];
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < iArrS.length) {
                                    long j5 = jB;
                                    long length3 = ((long) (dArrA2.length - 1)) * ((long) iArrS[i9]);
                                    int[] iArr4 = iArr;
                                    int[] iArr5 = iArr2;
                                    long j6 = i6;
                                    int i11 = i9;
                                    int iU2 = (int) afxw.U(length3, j6, RoundingMode.DOWN);
                                    iArr4[i11] = iU2;
                                    int i12 = (int) (length3 - (((long) iU2) * j6));
                                    iArr5[i11] = i12;
                                    iArr3[i10] = iU2;
                                    int i13 = i10 + 1;
                                    if (i12 != 0) {
                                        iArr3[i13] = iU2 + 1;
                                        i10 += 2;
                                    } else {
                                        i10 = i13;
                                    }
                                    i9 = i11 + 1;
                                    iArr = iArr4;
                                    jB = j5;
                                    iArr2 = iArr5;
                                }
                                j = jB;
                                int[] iArr6 = iArr;
                                int[] iArr7 = iArr2;
                                Arrays.sort(iArr3, 0, i10);
                                afxw.Q(iArr3, 0, i10 - 1, dArrA2, 0, dArrA2.length - 1);
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                for (int i14 = 0; i14 < iArrS.length; i14++) {
                                    int i15 = iArr6[i14];
                                    int i16 = iArr7[i14];
                                    if (i16 == 0) {
                                        linkedHashMap2.put(Integer.valueOf(iArrS[i14]), Double.valueOf(dArrA2[i15]));
                                    } else {
                                        linkedHashMap2.put(Integer.valueOf(iArrS[i14]), Double.valueOf(afxw.O(dArrA2[i15], dArrA2[i15 + 1], i16, i6)));
                                    }
                                }
                                mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap2);
                            }
                            agqs agqsVarListIterator = agkeVar.listIterator(0);
                            while (agqsVarListIterator.hasNext()) {
                                Double d2 = (Double) mapUnmodifiableMap.get((Integer) agqsVarListIterator.next());
                                if (d2 != null) {
                                    aihf aihfVarCreateBuilder2 = aobd.a.createBuilder();
                                    int iIntValue = d2.intValue();
                                    aihfVarCreateBuilder2.copyOnWrite();
                                    aobd aobdVar = (aobd) aihfVarCreateBuilder2.instance;
                                    aobdVar.b |= 1;
                                    aobdVar.c = iIntValue;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    aobe aobeVar8 = (aobe) aihfVarCreateBuilder.instance;
                                    aobd aobdVar2 = (aobd) aihfVarCreateBuilder2.build();
                                    aobdVar2.getClass();
                                    aiie aiieVar = aobeVar8.j;
                                    if (!aiieVar.c()) {
                                        aobeVar8.j = aihn.mutableCopy(aiieVar);
                                    }
                                    aobeVar8.j.add(aobdVar2);
                                }
                            }
                        } else {
                            j = jB;
                        }
                    } else {
                        j = jB;
                    }
                    long jB2 = mbcVar.b() - j;
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar9 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar9.b |= SemanticState.Hidden;
                    aobeVar9.k = (int) jB2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (aobjVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aobe aobeVar10 = (aobe) aihfVarCreateBuilder.instance;
                aobeVar10.l = aobjVar.g;
                aobeVar10.b |= SemanticState.LiveRegion;
            }
            tfq tfqVar = this.n;
            if (tfqVar != null) {
                int iL = tfqVar.l();
                aihfVarCreateBuilder.copyOnWrite();
                aobe aobeVar11 = (aobe) aihfVarCreateBuilder.instance;
                aobeVar11.m = iL - 1;
                aobeVar11.b |= SemanticState.ReadOnly;
                ajuf ajufVarA = ajuf.a(tfqVar.a());
                if (ajufVarA != null) {
                    aihfVarCreateBuilder.copyOnWrite();
                    aobe aobeVar12 = (aobe) aihfVarCreateBuilder.instance;
                    aobeVar12.n = ajufVarA.p;
                    aobeVar12.b |= SemanticState.Modal;
                }
            }
            this.h.kk(aihfVarCreateBuilder);
        }
    }

    public final void e(toi toiVar) {
        List list = this.d;
        synchronized (list) {
            list.clear();
            list.add(toiVar);
        }
    }

    @Override // defpackage.tdh
    public final /* synthetic */ void gY() {
        nsi.n(this);
    }

    @Override // defpackage.bnu
    public final void onStart(bog bogVar) {
        if (this.e.l(10, 45422870L, false)) {
            f();
        }
    }

    @Override // defpackage.bnu
    public final void onStop(bog bogVar) {
        List list = this.d;
        synchronized (list) {
            if (!list.isEmpty()) {
                d(this.b);
                list.clear();
            }
        }
        if (this.e.l(10, 45422870L, false)) {
            this.m.b();
        }
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }
}
