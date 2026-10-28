package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aro {
    public final are a;
    public final are d;
    final ArrayList f;
    public asc g;
    private final arl h;
    public boolean b = true;
    public boolean c = true;
    public final ArrayList e = new ArrayList();

    public aro(are areVar) {
        new ArrayList();
        this.g = null;
        this.h = new arl();
        this.f = new ArrayList();
        this.a = areVar;
        this.d = areVar;
    }

    private final void e(arx arxVar, int i, ArrayList arrayList) {
        aro aroVar;
        arp arpVar = arxVar.h;
        for (arn arnVar : arpVar.j) {
            if (arnVar instanceof arp) {
                this.g((arp) arnVar, i, arxVar.i, arrayList, null);
            } else {
                this = this;
                int i2 = i;
                ArrayList arrayList2 = arrayList;
                if (arnVar instanceof arx) {
                    this.g(((arx) arnVar).h, i2, arxVar.i, arrayList2, null);
                    i = i2;
                } else {
                    i = i2;
                }
                arrayList = arrayList2;
            }
        }
        aro aroVar2 = this;
        int i3 = i;
        ArrayList arrayList3 = arrayList;
        for (arn arnVar2 : arxVar.i.j) {
            if (arnVar2 instanceof arp) {
                aroVar = aroVar2;
                aroVar.g((arp) arnVar2, i3, arpVar, arrayList3, null);
            } else if (arnVar2 instanceof arx) {
                aroVar = aroVar2;
                aroVar.g(((arx) arnVar2).i, i3, arpVar, arrayList3, null);
            }
            aroVar2 = aroVar;
        }
        if (i3 == 1) {
            for (arn arnVar3 : ((arv) arxVar).a.j) {
                if (arnVar3 instanceof arp) {
                    aroVar2.g((arp) arnVar3, 1, null, arrayList3, null);
                }
            }
        }
    }

    private final void f(ard ardVar, int i, int i2, int i3, int i4) {
        arl arlVar = this.h;
        arlVar.i = i;
        arlVar.j = i3;
        arlVar.a = i2;
        arlVar.b = i4;
        this.g.a(ardVar, arlVar);
        ardVar.C(arlVar.c);
        ardVar.x(arlVar.d);
        ardVar.F = arlVar.f;
        ardVar.u(arlVar.e);
    }

    private final void g(arp arpVar, int i, arp arpVar2, ArrayList arrayList, zg zgVar) {
        arx arxVar = arpVar.d;
        if (arxVar.l == null) {
            are areVar = this.a;
            if (arxVar == areVar.h || arxVar == areVar.i) {
                return;
            }
            if (zgVar == null) {
                zgVar = new zg(arxVar);
                arrayList.add(zgVar);
            }
            zg zgVar2 = zgVar;
            arxVar.l = zgVar2;
            ((ArrayList) zgVar2.a).add(arxVar);
            arp arpVar3 = arxVar.h;
            for (arn arnVar : arpVar3.j) {
                if (arnVar instanceof arp) {
                    g((arp) arnVar, i, arpVar2, arrayList, zgVar2);
                }
            }
            arp arpVar4 = arxVar.i;
            for (arn arnVar2 : arpVar4.j) {
                if (arnVar2 instanceof arp) {
                    g((arp) arnVar2, i, arpVar2, arrayList, zgVar2);
                }
            }
            if (i == 1 && (arxVar instanceof arv)) {
                for (arn arnVar3 : ((arv) arxVar).a.j) {
                    if (arnVar3 instanceof arp) {
                        g((arp) arnVar3, 1, arpVar2, arrayList, zgVar2);
                    }
                }
            }
            Iterator it = arpVar3.k.iterator();
            while (it.hasNext()) {
                g((arp) it.next(), i, arpVar2, arrayList, zgVar2);
            }
            Iterator it2 = arpVar4.k.iterator();
            while (it2.hasNext()) {
                g((arp) it2.next(), i, arpVar2, arrayList, zgVar2);
            }
            if (i == 1 && (arxVar instanceof arv)) {
                Iterator it3 = ((arv) arxVar).a.k.iterator();
                while (it3.hasNext()) {
                    g((arp) it3.next(), 1, arpVar2, arrayList, zgVar2);
                }
            }
        }
    }

    public final int a(are areVar, int i) {
        long jA;
        ArrayList arrayList;
        arp arpVar;
        arp arpVar2;
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            zg zgVar = (zg) arrayList2.get(i2);
            Object obj = zgVar.b;
            if (!(obj instanceof arm) ? !(i != 0 ? (obj instanceof arv) : (obj instanceof aru)) : ((arm) obj).f != i) {
                if (i == 0) {
                    arpVar = areVar.h.h;
                    arpVar2 = areVar.h.i;
                } else {
                    arpVar = areVar.i.h;
                    arpVar2 = areVar.i.i;
                }
                boolean zContains = ((arx) obj).h.k.contains(arpVar);
                boolean zContains2 = ((arx) zgVar.b).i.k.contains(arpVar2);
                long jA2 = ((arx) zgVar.b).a();
                if (!zContains) {
                    arrayList = arrayList2;
                    if (zContains2) {
                        arp arpVar3 = ((arx) zgVar.b).i;
                        jA = Math.max(-zgVar.a(arpVar3, arpVar3.e), ((long) (-((arx) zgVar.b).i.e)) + jA2);
                    } else {
                        arx arxVar = (arx) zgVar.b;
                        jA = (((long) arxVar.h.e) + arxVar.a()) - ((long) ((arx) zgVar.b).i.e);
                    }
                } else if (zContains2) {
                    long jB = zgVar.b(((arx) zgVar.b).h, j);
                    long jA3 = zgVar.a(((arx) zgVar.b).i, j);
                    long j2 = jB - jA2;
                    arx arxVar2 = (arx) zgVar.b;
                    int i3 = arxVar2.i.e;
                    arrayList = arrayList2;
                    long j3 = i3;
                    if (j2 >= (-i3)) {
                        j2 += j3;
                    }
                    long j4 = (-jA3) - jA2;
                    long j5 = arxVar2.h.e;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    ard ardVar = arxVar2.d;
                    float f = i == 0 ? ardVar.ae : ardVar.af;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j6 / f) + (j2 / f2)) : 0L;
                    jA = (j5 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j3;
                } else {
                    arrayList = arrayList2;
                    arp arpVar4 = ((arx) zgVar.b).h;
                    jA = Math.max(zgVar.b(arpVar4, arpVar4.e), ((long) ((arx) zgVar.b).h.e) + jA2);
                }
            } else {
                jA = j;
                arrayList = arrayList2;
            }
            jMax = Math.max(jMax, jA);
            i2++;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    public final void b() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        are areVar = this.d;
        areVar.h.d();
        areVar.i.d();
        arrayList.add(areVar.h);
        arrayList.add(areVar.i);
        ArrayList arrayList2 = areVar.aI;
        int size = arrayList2.size();
        HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            ard ardVar = (ard) arrayList2.get(i);
            if (ardVar instanceof arg) {
                arrayList.add(new ars(ardVar));
            } else {
                if (ardVar.H()) {
                    if (ardVar.f == null) {
                        ardVar.f = new arm(ardVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ardVar.f);
                } else {
                    arrayList.add(ardVar.h);
                }
                if (ardVar.I()) {
                    if (ardVar.g == null) {
                        ardVar.g = new arm(ardVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(ardVar.g);
                } else {
                    arrayList.add(ardVar.i);
                }
                if (ardVar instanceof arh) {
                    arrayList.add(new art(ardVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((arx) arrayList.get(i2)).d();
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arx arxVar = (arx) arrayList.get(i3);
            if (arxVar.d != areVar) {
                arxVar.b();
            }
        }
        ArrayList arrayList3 = this.f;
        arrayList3.clear();
        zg.c = 0;
        are areVar2 = this.a;
        e(areVar2.h, 0, arrayList3);
        e(areVar2.i, 1, arrayList3);
        this.b = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    public final void c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        aro aroVar;
        arq arqVar;
        ArrayList arrayList = this.a.aI;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            ard ardVar = (ard) arrayList.get(i3);
            if (ardVar.e) {
                aroVar = this;
            } else {
                int[] iArr = ardVar.aq;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = ardVar.s;
                int i7 = ardVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 == 3) {
                    z = i6 == 1;
                    i = 3;
                } else {
                    i = i4;
                    z = false;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 == 3) {
                    z2 = i7 == 1;
                    i2 = 3;
                } else {
                    i2 = i5;
                    z2 = false;
                }
                arq arqVar2 = ardVar.h.e;
                boolean z3 = arqVar2.i;
                arq arqVar3 = ardVar.i.e;
                boolean z4 = arqVar3.i;
                if (!z3) {
                    aroVar = this;
                    if (z4 && z) {
                        aroVar.f(ardVar, 2, arqVar2.f, 1, arqVar3.f);
                        if (i == 3) {
                            ardVar.h.e.m = ardVar.j();
                        } else {
                            ardVar.h.e.c(ardVar.j());
                            ardVar.e = true;
                        }
                    }
                } else if (z4) {
                    aroVar = this;
                    aroVar.f(ardVar, 1, arqVar2.f, 1, arqVar3.f);
                    ardVar.e = true;
                } else if (z2) {
                    aroVar = this;
                    aroVar.f(ardVar, 1, arqVar2.f, 2, arqVar3.f);
                    if (i2 == 3) {
                        ardVar.i.e.m = ardVar.h();
                    } else {
                        ardVar.i.e.c(ardVar.h());
                        ardVar.e = true;
                    }
                } else {
                    aroVar = this;
                    if (z4) {
                        aroVar.f(ardVar, 2, arqVar2.f, 1, arqVar3.f);
                        if (i == 3) {
                            ardVar.h.e.m = ardVar.j();
                        } else {
                            ardVar.h.e.c(ardVar.j());
                            ardVar.e = true;
                        }
                    }
                }
                if (ardVar.e && (arqVar = ardVar.i.b) != null) {
                    arqVar.c(ardVar.ab);
                }
            }
            i3++;
            this = aroVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[PHI: r7
      0x00af: PHI (r7v6 int) = (r7v3 int), (r7v2 int) binds: [B:56:0x00ad, B:52:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017e A[ADDED_TO_REGION] */
    public final void d(are areVar) {
        char c;
        int iJ;
        int iH;
        int i;
        int i2;
        float f;
        float f2;
        ArrayList arrayList = areVar.aI;
        int size = arrayList.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            ard ardVar = (ard) arrayList.get(i3);
            int[] iArr = ardVar.aq;
            int i4 = iArr[c2];
            int i5 = iArr[1];
            if (ardVar.ah == 8) {
                ardVar.e = true;
                c = c2;
            } else {
                float f3 = ardVar.x;
                int i6 = 2;
                if (f3 < 1.0f && i4 == 3) {
                    ardVar.s = 2;
                    i4 = 3;
                }
                float f4 = ardVar.A;
                if (f4 < 1.0f && i5 == 3) {
                    ardVar.t = 2;
                    i5 = 3;
                }
                if (ardVar.X > 0.0f) {
                    if (i4 == 3 && (i5 == 2 || i5 == 1)) {
                        ardVar.s = 3;
                    } else if (i5 == 3 && (i4 == 2 || i4 == 1)) {
                        ardVar.t = 3;
                    } else if (i4 == 3 && i5 == 3) {
                        if (ardVar.s == 0) {
                            ardVar.s = 3;
                        }
                        if (ardVar.t == 0) {
                            ardVar.t = 3;
                        }
                    }
                }
                if (i4 == 3 && ardVar.s == 1 && (ardVar.J.e == null || ardVar.L.e == null)) {
                    i4 = 2;
                }
                if (i5 == 3 && ardVar.t == 1 && (ardVar.K.e == null || ardVar.M.e == null)) {
                    i5 = 2;
                }
                aru aruVar = ardVar.h;
                aruVar.j = i4;
                int i7 = ardVar.s;
                aruVar.c = i7;
                arv arvVar = ardVar.i;
                arvVar.j = i5;
                c = c2;
                int i8 = ardVar.t;
                arvVar.c = i8;
                if (i4 == 4 || i4 == 1) {
                    if (i5 != 4 || i5 == 1) {
                        i6 = i5;
                    } else if (i5 != 2) {
                        if (i4 == 3 || !(i5 == 2 || i5 == 1)) {
                            i2 = i5;
                            f = f4;
                            f2 = 1.0f;
                        } else if (i7 == 3) {
                            if (i5 == 2) {
                                f(ardVar, 2, 0, 2, 0);
                            }
                            int iH2 = ardVar.h();
                            f(ardVar, 1, (int) ((iH2 * ardVar.X) + 0.5f), 1, iH2);
                            ardVar.h.e.c(ardVar.j());
                            ardVar.i.e.c(ardVar.h());
                            ardVar.e = true;
                        } else if (i7 == 1) {
                            f(ardVar, 2, 0, i5, 0);
                            ardVar.h.e.m = ardVar.j();
                        } else {
                            i2 = i5;
                            f = f4;
                            f2 = 1.0f;
                            if (i7 == 2) {
                                int i9 = areVar.aq[c];
                                if (i9 == 1 || i9 == 4) {
                                    f(ardVar, 1, (int) ((f3 * areVar.j()) + 0.5f), i2, ardVar.h());
                                    ardVar.h.e.c(ardVar.j());
                                    ardVar.i.e.c(ardVar.h());
                                    ardVar.e = true;
                                }
                            } else {
                                arc[] arcVarArr = ardVar.R;
                                if (arcVarArr[c].e == null || arcVarArr[1].e == null) {
                                    f(ardVar, 2, 0, i2, 0);
                                    ardVar.h.e.c(ardVar.j());
                                    ardVar.i.e.c(ardVar.h());
                                    ardVar.e = true;
                                }
                            }
                        }
                        if (i2 == 3 || !(i4 == 2 || i4 == 1)) {
                            if (i4 != 3 && i2 == 3) {
                                if (i7 == 1 || i8 == 1) {
                                    f(ardVar, 2, 0, 2, 0);
                                    ardVar.h.e.m = ardVar.j();
                                    ardVar.i.e.m = ardVar.h();
                                } else if (i8 == 2 && i7 == 2) {
                                    int[] iArr2 = areVar.aq;
                                    if (iArr2[c] == 1 && iArr2[1] == 1) {
                                        f(ardVar, 1, (int) ((f3 * areVar.j()) + 0.5f), 1, (int) ((f * areVar.h()) + 0.5f));
                                        ardVar.h.e.c(ardVar.j());
                                        ardVar.i.e.c(ardVar.h());
                                        ardVar.e = true;
                                    }
                                }
                            }
                        } else if (i8 == 3) {
                            if (i4 == 2) {
                                f(ardVar, 2, 0, 2, 0);
                            }
                            int iJ2 = ardVar.j();
                            float f5 = ardVar.X;
                            if (ardVar.Y == -1) {
                                f5 = f2 / f5;
                            }
                            f(ardVar, 1, iJ2, 1, (int) ((iJ2 * f5) + 0.5f));
                            ardVar.h.e.c(ardVar.j());
                            ardVar.i.e.c(ardVar.h());
                            ardVar.e = true;
                        } else if (i8 == 1) {
                            f(ardVar, i4, 0, 2, 0);
                            ardVar.i.e.m = ardVar.h();
                        } else if (i8 == 2) {
                            int i10 = areVar.aq[1];
                            if (i10 == 1 || i10 == 4) {
                                f(ardVar, i4, ardVar.j(), 1, (int) ((f * areVar.h()) + 0.5f));
                                ardVar.h.e.c(ardVar.j());
                                ardVar.i.e.c(ardVar.h());
                                ardVar.e = true;
                            } else if (i4 != 3) {
                            }
                        } else {
                            arc[] arcVarArr2 = ardVar.R;
                            if (arcVarArr2[2].e == null || arcVarArr2[3].e == null) {
                                f(ardVar, 2, 0, 3, 0);
                                ardVar.h.e.c(ardVar.j());
                                ardVar.i.e.c(ardVar.h());
                                ardVar.e = true;
                            } else if (i4 != 3) {
                            }
                        }
                    }
                    iJ = ardVar.j();
                    if (i4 == 4) {
                        iJ = (areVar.j() - ardVar.J.f) - ardVar.L.f;
                        i4 = 1;
                    }
                    int i11 = iJ;
                    iH = ardVar.h();
                    if (i6 == 4) {
                        iH = (areVar.h() - ardVar.K.f) - ardVar.M.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    f(ardVar, i4, i11, i, iH);
                    ardVar.h.e.c(ardVar.j());
                    ardVar.i.e.c(ardVar.h());
                    ardVar.e = true;
                } else if (i4 == 2) {
                    i4 = 2;
                    if (i5 != 4) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                    iJ = ardVar.j();
                    if (i4 == 4) {
                        iJ = (areVar.j() - ardVar.J.f) - ardVar.L.f;
                        i4 = 1;
                    }
                    int i12 = iJ;
                    iH = ardVar.h();
                    if (i6 == 4) {
                        iH = (areVar.h() - ardVar.K.f) - ardVar.M.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    f(ardVar, i4, i12, i, iH);
                    ardVar.h.e.c(ardVar.j());
                    ardVar.i.e.c(ardVar.h());
                    ardVar.e = true;
                } else if (i4 == 3) {
                    i2 = i5;
                    f = f4;
                    f2 = 1.0f;
                    if (i2 == 3) {
                        if (i4 != 3) {
                        }
                    } else if (i4 != 3) {
                    }
                } else {
                    i2 = i5;
                    f = f4;
                    f2 = 1.0f;
                    if (i2 == 3) {
                        if (i4 != 3) {
                        }
                    } else if (i4 != 3) {
                    }
                }
            }
            i3++;
            c2 = c;
        }
    }
}
