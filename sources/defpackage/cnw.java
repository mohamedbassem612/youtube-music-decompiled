package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cnw implements cnk, cnj {
    private final cnk[] a;
    private final boolean[] b;
    private cnj f;
    private coy g;
    private final ArrayList d = new ArrayList();
    private final HashMap e = new HashMap();
    private coq i = ave.e();
    private final IdentityHashMap c = new IdentityHashMap();
    private cnk[] h = new cnk[0];

    public cnw(long[] jArr, cnk... cnkVarArr) {
        this.a = cnkVarArr;
        this.b = new boolean[cnkVarArr.length];
        for (int i = 0; i < cnkVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new cow(cnkVarArr[i], j);
            }
        }
    }

    @Override // defpackage.cnk
    public final long a(long j, cdv cdvVar) {
        cnk[] cnkVarArr = this.h;
        return (cnkVarArr.length > 0 ? cnkVarArr[0] : this.a[0]).a(j, cdvVar);
    }

    @Override // defpackage.cop
    public final /* bridge */ /* synthetic */ void b(coq coqVar) {
        cnj cnjVar = this.f;
        cnjVar.getClass();
        cnjVar.b(this);
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long d() {
        return this.i.d();
    }

    @Override // defpackage.cnk
    public final long e() {
        long j = -9223372036854775807L;
        for (cnk cnkVar : this.h) {
            long jE = cnkVar.e();
            if (jE == -9223372036854775807L) {
                if (j != -9223372036854775807L && cnkVar.f(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (cnk cnkVar2 : this.h) {
                    if (cnkVar2 == cnkVar) {
                        break;
                    }
                    if (cnkVar2.f(jE) != jE) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jE;
            } else if (jE != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // defpackage.cnk
    public final long f(long j) {
        long jF = this.h[0].f(j);
        int i = 1;
        while (true) {
            cnk[] cnkVarArr = this.h;
            if (i >= cnkVarArr.length) {
                return jF;
            }
            if (cnkVarArr[i].f(jF) != jF) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // defpackage.cnk
    public final long g(cqs[] cqsVarArr, boolean[] zArr, coo[] cooVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = cqsVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = cqsVarArr.length;
            if (i2 >= length) {
                break;
            }
            coo cooVar = cooVarArr[i2];
            Integer num = cooVar == null ? null : (Integer) this.c.get(cooVar);
            iArr[i2] = num == null ? -1 : num.intValue();
            cqs cqsVar = cqsVarArr[i2];
            if (cqsVar != null) {
                String str = cqsVar.d().b;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        IdentityHashMap identityHashMap = this.c;
        identityHashMap.clear();
        cnk[] cnkVarArr = this.a;
        coo[] cooVarArr2 = new coo[length];
        coo[] cooVarArr3 = new coo[length];
        cqs[] cqsVarArr2 = new cqs[length];
        ArrayList arrayList = new ArrayList(cnkVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < cnkVarArr.length) {
            int i4 = i;
            while (i4 < cqsVarArr.length) {
                cooVarArr3[i4] = iArr[i4] == i3 ? cooVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    cqs cqsVar2 = cqsVarArr[i4];
                    cqsVar2.getClass();
                    bto btoVar = (bto) this.e.get(cqsVar2.d());
                    btoVar.getClass();
                    cqsVarArr2[i4] = new cnv(cqsVar2, btoVar);
                } else {
                    cqsVarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr2;
            }
            int[] iArr3 = iArr2;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            long jG = cnkVarArr[i3].g(cqsVarArr2, zArr, cooVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jG;
            } else if (jG != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < cqsVarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    coo cooVar2 = cooVarArr3[i6];
                    cooVar2.getClass();
                    cooVarArr2[i6] = cooVar2;
                    identityHashMap.put(cooVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    ahno.O(cooVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(cnkVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            iArr2 = iArr3;
            i = 0;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(cooVarArr2, i7, cooVarArr, i7, length);
        this.h = (cnk[]) arrayList3.toArray(new cnk[i7]);
        this.i = new cmu(arrayList3, aguu.u(arrayList3, new cbs(4)));
        return j2;
    }

    @Override // defpackage.cnj
    public final void gp(cnk cnkVar) {
        ArrayList arrayList = this.d;
        arrayList.remove(cnkVar);
        if (arrayList.isEmpty()) {
            cnk[] cnkVarArr = this.a;
            int i = 0;
            for (cnk cnkVar2 : cnkVarArr) {
                i += cnkVar2.i().b;
            }
            bto[] btoVarArr = new bto[i];
            int i2 = 0;
            for (int i3 = 0; i3 < cnkVarArr.length; i3++) {
                coy coyVarI = cnkVarArr[i3].i();
                int i4 = coyVarI.b;
                int i5 = 0;
                while (i5 < i4) {
                    bto btoVarB = coyVarI.b(i5);
                    int i6 = btoVarB.a;
                    bse[] bseVarArr = new bse[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        bse bseVarB = btoVarB.b(i7);
                        bsd bsdVar = new bsd(bseVarB);
                        String str = bseVarB.a;
                        if (str == null) {
                            str = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        cnk[] cnkVarArr2 = cnkVarArr;
                        sb.append(':');
                        sb.append(str);
                        bsdVar.a = sb.toString();
                        String str2 = bseVarB.o;
                        if (str2 != null) {
                            bsdVar.m = i3 + ':' + str2;
                        }
                        bseVarArr[i7] = new bse(bsdVar);
                        i7++;
                        cnkVarArr = cnkVarArr2;
                    }
                    bto btoVar = new bto(i3 + ':' + btoVarB.b, bseVarArr);
                    this.e.put(btoVar, btoVarB);
                    btoVarArr[i2] = btoVar;
                    i5++;
                    i2++;
                    cnkVarArr = cnkVarArr;
                }
            }
            this.g = new coy(btoVarArr);
            cnj cnjVar = this.f;
            cnjVar.getClass();
            cnjVar.gp(this);
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final long gt() {
        return this.i.gt();
    }

    @Override // defpackage.cnk
    public final long h(long j) {
        int i = 0;
        boolean z = true;
        while (true) {
            cnk[] cnkVarArr = this.a;
            if (i >= cnkVarArr.length) {
                break;
            }
            z &= cnkVarArr[i].h(j) == j;
            i++;
        }
        if (z) {
            return j;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.cnk
    public final coy i() {
        coy coyVar = this.g;
        coyVar.getClass();
        return coyVar;
    }

    @Override // defpackage.cnk
    public final void j() {
        int i = 0;
        while (true) {
            cnk[] cnkVarArr = this.a;
            if (i >= cnkVarArr.length) {
                return;
            }
            cnkVarArr[i].j();
            i++;
        }
    }

    public final cnk k(int i) {
        boolean z = this.b[i];
        cnk[] cnkVarArr = this.a;
        return z ? ((cow) cnkVarArr[i]).a : cnkVarArr[i];
    }

    @Override // defpackage.cnk
    public final void l(cnj cnjVar, long j) {
        this.f = cnjVar;
        ArrayList arrayList = this.d;
        cnk[] cnkVarArr = this.a;
        Collections.addAll(arrayList, cnkVarArr);
        for (cnk cnkVar : cnkVarArr) {
            cnkVar.l(this, j);
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final void m(long j) {
        this.i.m(j);
    }

    @Override // defpackage.cnk
    public final void n() {
        int i = 0;
        while (true) {
            cnk[] cnkVarArr = this.a;
            if (i >= cnkVarArr.length) {
                return;
            }
            cnkVarArr[i].n();
            i++;
        }
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean o(ccy ccyVar) {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return this.i.o(ccyVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cnk) arrayList.get(i)).o(ccyVar);
        }
        return false;
    }

    @Override // defpackage.cnk, defpackage.coq
    public final boolean p() {
        return this.i.p();
    }

    @Override // defpackage.cnk
    public final void q(long j) {
        for (cnk cnkVar : this.h) {
            cnkVar.q(j);
        }
    }
}
