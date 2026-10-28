package defpackage;

import android.util.SparseArray;
import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xfe extends xet implements tul {
    private final awmd b;
    private final awmd c;
    private final zwb d;
    private final xfg e;
    private final int f;
    private final long[] g;
    private volatile int h;

    public xfe(zwb zwbVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, xfg xfgVar, tqj tqjVar) {
        this.d = zwbVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.e = xfgVar;
        int i = tqr.a;
        this.f = tqjVar.a(1073894468);
        this.g = new long[SemanticState.Hidden];
        ((tun) awmdVar3.io()).b(this);
    }

    @Override // defpackage.xet
    public final long b(long j) {
        int i = this.h;
        for (int i2 = 0; i2 < 256; i2++) {
            long j2 = this.g[i];
            if (j2 <= j) {
                if (j2 > 0) {
                    return j - j2;
                }
                return -1L;
            }
            i = i <= 0 ? 255 : i - 1;
        }
        return -2L;
    }

    @Override // defpackage.zsz
    public final String c() {
        return "must_log_events";
    }

    @Override // defpackage.zsz
    public final boolean i() {
        int i = this.f;
        return i == 2 || i == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zsz
    public final zsx j(zty ztyVar) {
        aihf aihfVarCreateBuilder;
        long j;
        int i;
        zup zupVar;
        wrg wrgVar = (wrg) this.b.io();
        zwb zwbVar = this.d;
        zui zuiVar = this.j;
        zwa zwaVarF = zwbVar.f(ztyVar.e);
        long j2 = 1;
        if (zwaVarF == null) {
            if (ztyVar.g) {
                String str = ztf.K;
                return new zsx(zsw.b, new zsy(new wvr(zuiVar, 20), new jmj(zuiVar, 4)));
            }
            aihf aihfVar = zuiVar.f;
            zwa zwaVar = zvz.a;
            long j3 = ((akkq) aihfVar.instance).ak + 1;
            aihfVar.copyOnWrite();
            akkq akkqVar = (akkq) aihfVar.instance;
            akkqVar.d |= 8388608;
            akkqVar.ak = j3;
            zwaVarF = zwaVar;
        }
        boolean z = ztyVar.g;
        if (z && !zwaVarF.m()) {
            String str2 = ztf.K;
            return new zsx(zsw.b, new zsy(new xfd(zuiVar, 1), new jmj(zuiVar, 5)));
        }
        wrf wrfVarA = wrgVar.a(zwaVarF, ztyVar.f, z);
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        agqs agqsVarListIterator = ztyVar.c().listIterator(0);
        int i2 = 0;
        int i3 = 0;
        while (agqsVarListIterator.hasNext()) {
            zuq zuqVar = (zuq) agqsVarListIterator.next();
            alos alosVar = (alos) alou.a.createBuilder();
            try {
                aigj aigjVar = zuqVar.a;
                int iD = i2 + aigjVar.d();
                try {
                    alosVar.m54mergeFrom(aigjVar, generatedRegistry);
                    xfg xfgVar = this.e;
                    j = j2;
                    try {
                        int i4 = alot.a(((alou) alosVar.instance).c).jH;
                        i = iD;
                        try {
                            if ((xfgVar.c & (j << (i4 & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i4)) == null) {
                                zupVar = xfgVar.f;
                            }
                            if (zupVar.d.d) {
                                if (((alou) alosVar.instance).e == 0) {
                                    long j4 = zuqVar.b;
                                    alosVar.copyOnWrite();
                                    alou alouVar = (alou) alosVar.instance;
                                    alouVar.b |= 1;
                                    alouVar.e = j4;
                                }
                                wrfVarA.F((alou) alosVar.build());
                                i3++;
                            } else {
                                zuiVar.d();
                            }
                            j2 = j;
                            i2 = i;
                        } catch (Throwable unused) {
                            i2 = i;
                            zuiVar.e();
                            j2 = j;
                        }
                    } catch (Throwable unused2) {
                        i = iD;
                        i2 = i;
                        zuiVar.e();
                        j2 = j;
                    }
                } catch (Throwable unused3) {
                    j = j2;
                }
            } catch (Throwable unused4) {
                j = j2;
            }
        }
        ztyVar.o = i2;
        ztyVar.p = i3;
        if (wrfVarA.e()) {
            return new zsx(zsw.b, new zsy(new xfd(zuiVar, 0), new jmj(zuiVar, 6)));
        }
        aigj aigjVar2 = ztyVar.c.g(ztyVar.b).b;
        if (aigjVar2 != null) {
            try {
                aihfVarCreateBuilder = atow.a.createBuilder();
                aihfVarCreateBuilder.m54mergeFrom(aigjVar2, ExtensionRegistryLite.getGeneratedRegistry());
            } catch (aiik unused5) {
                aihfVarCreateBuilder = null;
            }
        } else {
            aihfVarCreateBuilder = null;
        }
        if (aihfVarCreateBuilder != null) {
            atow atowVar = (atow) aihfVarCreateBuilder.instance;
            wrfVarA.G(atowVar.c, atowVar.d);
        }
        wrfVarA.c = ztyVar.d();
        zuiVar.c(i3);
        aihf aihfVarCreateBuilder2 = alow.a.createBuilder();
        int i5 = ztyVar.j;
        if (i5 > 0) {
            aihfVarCreateBuilder2.copyOnWrite();
            alow alowVar = (alow) aihfVarCreateBuilder2.instance;
            alowVar.b |= SemanticState.LiveRegion;
            alowVar.h = i5;
            int i6 = ztyVar.t;
            aihfVarCreateBuilder2.copyOnWrite();
            alow alowVar2 = (alow) aihfVarCreateBuilder2.instance;
            alowVar2.b |= SemanticState.ReadOnly;
            alowVar2.i = i6;
            int i7 = ztyVar.v;
            if (i7 != 1) {
                aihfVarCreateBuilder2.copyOnWrite();
                alow alowVar3 = (alow) aihfVarCreateBuilder2.instance;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                alowVar3.k = i8;
                alowVar3.b |= SemanticState.Obscured;
            }
        }
        aihfVarCreateBuilder2.copyOnWrite();
        alow alowVar4 = (alow) aihfVarCreateBuilder2.instance;
        alowVar4.b |= SemanticState.Modal;
        alowVar4.j = i2;
        int i9 = ztyVar.r;
        int i10 = i9 & 16384;
        int i11 = i9 & SemanticState.Multiline;
        int i12 = i10 == 0 ? 0 : 1;
        if (i11 != 0) {
            i12 |= 2;
        }
        if ((i9 & 32768) != 0) {
            i12 |= 4;
        }
        if (i12 != 0) {
            aihfVarCreateBuilder2.copyOnWrite();
            alow alowVar5 = (alow) aihfVarCreateBuilder2.instance;
            alowVar5.b |= SemanticState.Multiline;
            alowVar5.l = i12;
        }
        int i13 = ztyVar.s;
        aihfVarCreateBuilder2.copyOnWrite();
        alow alowVar6 = (alow) aihfVarCreateBuilder2.instance;
        alowVar6.b |= 16384;
        alowVar6.m = i13;
        wrfVarA.d = (alow) aihfVarCreateBuilder2.build();
        taf.i(wrgVar.b(wrfVarA), MoreExecutors.directExecutor(), new wuy(ztyVar, 3), new ixb(ztyVar, 15), null);
        return new zsx(zsw.c, null);
    }

    @Override // defpackage.zsz
    public final int jc() {
        return 2;
    }

    @Override // defpackage.zsz
    protected final aigj jd(zsv zsvVar) {
        axmq axmqVarE = ((xdz) this.c.io()).e(zsvVar.a);
        if (axmqVarE == null) {
            return null;
        }
        aihf aihfVarCreateBuilder = atow.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        atow atowVar = (atow) aihfVarCreateBuilder.instance;
        Object obj = axmqVarE.b;
        obj.getClass();
        atowVar.b |= 1;
        atowVar.c = (String) obj;
        aihfVarCreateBuilder.copyOnWrite();
        atow atowVar2 = (atow) aihfVarCreateBuilder.instance;
        atowVar2.b |= 2;
        atowVar2.d = axmqVarE.a;
        return ((atow) aihfVarCreateBuilder.build()).toByteString();
    }

    @Override // defpackage.zsz
    protected final void je(szi sziVar) {
        while (sziVar.a != null) {
            szg next = sziVar.next();
            if (next instanceof xff) {
                xff xffVar = (xff) next;
                int i = this.f;
                if (i == 1) {
                    int i2 = xffVar.i;
                    if (i2 == 1) {
                        zta ztaVar = xffVar.k;
                        if (ztaVar instanceof xeu) {
                        }
                    } else if (i2 == 2) {
                        sziVar.remove();
                    }
                } else if (i == 2) {
                    int i3 = xffVar.i;
                    if (i3 == 1) {
                        zta ztaVar2 = xffVar.k;
                        if (ztaVar2 instanceof xeu) {
                        }
                    } else if (i3 == 2) {
                    }
                    sziVar.remove();
                }
            }
        }
    }

    @Override // defpackage.tul
    public final void jn(long j) {
        if (j > 0) {
            long[] jArr = this.g;
            int i = this.h;
            int i2 = i >= 255 ? 0 : i + 1;
            jArr[i2] = j;
            this.h = i2;
        }
    }

    @Override // defpackage.zsz
    protected final void k(ztz ztzVar, long j) {
        long j2;
        zup zupVar;
        Object obj = ztzVar.e;
        byte[] bArr = null;
        if (true == (obj instanceof Throwable)) {
            obj = null;
        }
        if (obj instanceof alox) {
            alox aloxVar = (alox) obj;
            ((xdz) this.c.io()).b(aloxVar.d, ztzVar.f.e);
            xfg xfgVar = this.e;
            aiie aiieVar = aloxVar.c;
            int i = 0;
            if (aiieVar.isEmpty()) {
                SparseArray sparseArray = xfgVar.a;
                SparseArray sparseArray2 = xfgVar.b;
                if (sparseArray != sparseArray2) {
                    xfgVar.e = new zup[0];
                    xfgVar.a = sparseArray2;
                    xfgVar.c = xfgVar.d;
                    i = 2;
                }
                j2 = 1;
            } else {
                int i2 = aiieVar.size() >= 32 ? 4 : 0;
                int i3 = i2 | 1;
                if (xfgVar.e.length != aiieVar.size()) {
                    j2 = 1;
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i4 < aiieVar.size()) {
                            zup zupVar2 = xfgVar.e[i4];
                            aloy aloyVar = (aloy) aiieVar.get(i4);
                            j2 = 1;
                            if (aloyVar.c == zupVar2.b) {
                                akwf akwfVar = aloyVar.b;
                                if (akwfVar == null) {
                                    akwfVar = akwf.a;
                                }
                                if (akwfVar.equals(zupVar2.a)) {
                                    xfgVar.e[i4].a(xfgVar.h, j);
                                    i4++;
                                }
                            }
                        } else {
                            j2 = 1;
                            i = i3;
                        }
                    }
                }
                xfgVar.e = new zup[aiieVar.size()];
                ArrayList arrayList = new ArrayList();
                zvb zvbVar = (zvb) xfgVar.g.io();
                int i5 = 0;
                while (i5 < aiieVar.size()) {
                    aloy aloyVar2 = (aloy) aiieVar.get(i5);
                    akwf akwfVar2 = aloyVar2.b;
                    if (akwfVar2 == null) {
                        akwfVar2 = akwf.a;
                    }
                    int i6 = akwfVar2.c;
                    if ((xfgVar.c & (j2 << (i6 & 63))) == 0 || (zupVar = (zup) xfgVar.a.get(i6)) == null) {
                        zupVar = xfgVar.f;
                    }
                    zup[] zupVarArr = xfgVar.e;
                    int i7 = zup.g;
                    axng axngVar = new axng(bArr);
                    zup zupVar3 = zupVar.c;
                    akwf akwfVar3 = aloyVar2.b;
                    if (akwfVar3 == null) {
                        akwfVar3 = akwf.a;
                    }
                    axngVar.e = akwfVar3;
                    ArrayList arrayList2 = arrayList;
                    axngVar.a = aloyVar2.c;
                    int i8 = zupVar3.a.c;
                    ahno.O(i8 == -1 || ((akwf) axngVar.e).c == i8);
                    axngVar.d = zupVar3;
                    axngVar.c(zvbVar);
                    zupVarArr[i5] = axngVar.a().a(xfgVar.h, j);
                    arrayList = arrayList2;
                    arrayList.add(xfgVar.e[i5]);
                    i5++;
                    bArr = null;
                }
                xfgVar.a(arrayList);
                i = i2 | 3;
            }
            zui zuiVar = this.j;
            if ((i & 1) != 0) {
                aihf aihfVar = zuiVar.f;
                long j3 = ((akkq) aihfVar.instance).aJ + j2;
                aihfVar.copyOnWrite();
                akkq akkqVar = (akkq) aihfVar.instance;
                akkqVar.e |= 262144;
                akkqVar.aJ = j3;
            }
            if ((i & 2) != 0) {
                aihf aihfVar2 = zuiVar.f;
                long j4 = ((akkq) aihfVar2.instance).aK + j2;
                aihfVar2.copyOnWrite();
                akkq akkqVar2 = (akkq) aihfVar2.instance;
                akkqVar2.e |= 524288;
                akkqVar2.aK = j4;
            }
            if ((i & 4) != 0) {
                aihf aihfVar3 = zuiVar.f;
                long j5 = ((akkq) aihfVar3.instance).aL + j2;
                aihfVar3.copyOnWrite();
                akkq akkqVar3 = (akkq) aihfVar3.instance;
                akkqVar3.e |= 1048576;
                akkqVar3.aL = j5;
            }
        }
    }
}
