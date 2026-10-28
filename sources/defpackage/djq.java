package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djq {
    public final axaf a = new axav(djr.a);
    public final awnm b;
    public final awnm c;
    public djm d;
    public int e;
    public djp f;
    private final axaf g;
    private final axat h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private final ags o;
    private final ags p;
    private final ags q;

    public djq() {
        axav axavVar = new axav(new djn(null));
        this.g = axavVar;
        this.h = new axag(axavVar, null);
        this.b = new awnm();
        this.c = new awnm();
        int i = agt.a;
        this.o = new ags(6);
        this.p = new ags(6);
        this.q = new ags(6);
    }

    public final djm a(int i) {
        Object next;
        Object next2;
        awnm awnmVar = this.b;
        Object obj = null;
        if (i != -1) {
            Iterator<E> it = awnmVar.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!((djm) next2).e);
            djm djmVar = (djm) next2;
            if (djmVar != null) {
                return djmVar;
            }
            for (Object obj2 : this.c) {
                if (((djm) obj2).e) {
                    obj = obj2;
                    break;
                }
            }
            return (djm) obj;
        }
        Iterator<E> it2 = awnmVar.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((djm) next).e);
        djm djmVar2 = (djm) next;
        if (djmVar2 != null) {
            return djmVar2;
        }
        for (Object obj3 : this.c) {
            if (((djm) obj3).e) {
                obj = obj3;
                break;
            }
        }
        return (djm) obj;
    }

    public final void b(djl djlVar, djp djpVar, int i) {
        ags agsVar;
        boolean z;
        if (i != 0) {
            agsVar = i != 1 ? this.o : this.p;
        } else {
            agsVar = this.q;
        }
        int iA = agsVar.a(djpVar);
        agsVar.b[iA] = djpVar;
        long[] jArr = agsVar.c;
        int i2 = agsVar.d;
        jArr[iA] = (((long) i2) & 2147483647L) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & (-4611686016279904257L)) | ((((long) iA) & 2147483647L) << 31);
        }
        agsVar.d = iA;
        if (agsVar.e == Integer.MAX_VALUE) {
            agsVar.e = iA;
        }
        djl djlVar2 = djpVar.c;
        if (djlVar2 != null) {
            throw new IllegalArgumentException("Input '" + djpVar + "' is already added to dispatcher " + djlVar2 + '.');
        }
        djpVar.c = djlVar;
        ((djn) this.h.c()).getClass();
        if (i != 0) {
            z = i != 1 ? this.n : this.j;
        } else {
            z = this.l;
        }
        djpVar.c(z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x0164  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b2 A[LOOP:5: B:126:0x01bd->B:125:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x01cc A[LOOP:6: B:130:0x01d7->B:129:0x01cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01e8 A[LOOP:7: B:132:0x01e6->B:133:0x01e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x01f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    public final void c() {
        boolean z;
        boolean z2;
        long j;
        Object[] objArr;
        long[] jArr;
        int i;
        djp djpVar;
        Object[] objArr2;
        long[] jArr2;
        int i2;
        djp djpVar2;
        boolean z3;
        djm djmVarA;
        djm djmVarA2;
        djn djnVar;
        axaf axafVar;
        Object[] objArr3;
        long[] jArr3;
        int i3;
        Object[] objArr4;
        long[] jArr4;
        int i4;
        Object[] objArr5;
        long[] jArr5;
        int i5;
        awnm<djm> awnmVar = this.b;
        if (awnmVar.isEmpty()) {
            z = false;
            break;
        }
        Iterator<E> it = awnmVar.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((djm) it.next()).e) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!awnmVar.isEmpty()) {
            for (djm djmVar : awnmVar) {
            }
        }
        awnm<djm> awnmVar2 = this.c;
        if (awnmVar2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator<E> it2 = awnmVar2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((djm) it2.next()).e) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!awnmVar2.isEmpty()) {
            for (djm djmVar2 : awnmVar2) {
            }
        }
        boolean z4 = z || z2;
        boolean z5 = this.k != z;
        boolean z6 = this.l != z;
        boolean z7 = this.i != z2;
        boolean z8 = this.j != z2;
        boolean z9 = this.m != z4;
        boolean z10 = this.n != z4;
        if (z5) {
            j = 2147483647L;
            ags agsVar = this.q;
            objArr = agsVar.b;
            jArr = agsVar.c;
            i = agsVar.e;
            for (int i6 = Alert.DURATION_SHOW_INDEFINITELY; i != i6; i6 = Alert.DURATION_SHOW_INDEFINITELY) {
                long[] jArr6 = jArr;
                long j2 = (jArr[i] >> 31) & 2147483647L;
                djpVar = (djp) objArr[i];
                if (z5) {
                    djpVar.a();
                }
                if (z6) {
                    djpVar.c(z);
                }
                i = (int) j2;
                jArr = jArr6;
            }
        } else if (z6) {
            z6 = true;
            j = 2147483647L;
            ags agsVar2 = this.q;
            objArr = agsVar2.b;
            jArr = agsVar2.c;
            i = agsVar2.e;
            while (i != i6) {
                long[] jArr7 = jArr;
                long j3 = (jArr[i] >> 31) & 2147483647L;
                djpVar = (djp) objArr[i];
                if (z5) {
                    djpVar.a();
                }
                if (z6) {
                    djpVar.c(z);
                }
                i = (int) j3;
                jArr = jArr7;
            }
        } else {
            j = 2147483647L;
        }
        if (z7) {
            ags agsVar3 = this.p;
            objArr2 = agsVar3.b;
            jArr2 = agsVar3.c;
            i2 = agsVar3.e;
            while (i2 != Integer.MAX_VALUE) {
                long j4 = (jArr2[i2] >> 31) & j;
                djpVar2 = (djp) objArr2[i2];
                if (z7) {
                    djpVar2.a();
                }
                if (z8) {
                    djpVar2.c(z2);
                }
                i2 = (int) j4;
            }
        } else if (z8) {
            z8 = true;
            ags agsVar4 = this.p;
            objArr2 = agsVar4.b;
            jArr2 = agsVar4.c;
            i2 = agsVar4.e;
            while (i2 != Integer.MAX_VALUE) {
                long j5 = (jArr2[i2] >> 31) & j;
                djpVar2 = (djp) objArr2[i2];
                if (z7) {
                    djpVar2.a();
                }
                if (z8) {
                    djpVar2.c(z2);
                }
                i2 = (int) j5;
            }
        }
        if (!z9) {
            if (z10) {
                z3 = true;
            }
            this.k = z;
            this.l = z;
            this.i = z2;
            this.j = z2;
            this.m = z4;
            this.n = z4;
            djmVarA = this.d;
            if (djmVarA == null) {
                djmVarA = a(0);
            }
            djmVarA2 = this.d;
            if (djmVarA2 == null) {
                djmVarA2 = a(0);
            }
            if (awrc.c(djmVarA2, djmVarA)) {
                if (djmVarA2 == null) {
                    djnVar = new djn(null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (djm djmVar3 : awnmVar) {
                        if (djmVar3.e) {
                            List list = djmVar3.c;
                        }
                    }
                    for (djm djmVar4 : awnmVar2) {
                        if (djmVar4.e) {
                            List list2 = djmVar4.c;
                        }
                    }
                    djnVar = new djn(djmVarA2.b, arrayList, djmVarA2.d, arrayList.size());
                }
                axafVar = this.g;
                if (awrc.c((djn) axafVar.c(), djnVar)) {
                }
                axafVar.d(djnVar);
                ags agsVar5 = this.q;
                objArr3 = agsVar5.b;
                jArr3 = agsVar5.c;
                i3 = agsVar5.e;
                while (i3 != Integer.MAX_VALUE) {
                    long j6 = (jArr3[i3] >> 31) & j;
                    i3 = (int) j6;
                }
                ags agsVar6 = this.p;
                objArr4 = agsVar6.b;
                jArr4 = agsVar6.c;
                i4 = agsVar6.e;
                while (i4 != Integer.MAX_VALUE) {
                    long j7 = (jArr4[i4] >> 31) & j;
                    i4 = (int) j7;
                }
                ags agsVar7 = this.o;
                objArr5 = agsVar7.b;
                jArr5 = agsVar7.c;
                i5 = agsVar7.e;
                while (i5 != Integer.MAX_VALUE) {
                    long j8 = (jArr5[i5] >> 31) & j;
                    i5 = (int) j8;
                }
            }
        }
        z3 = z10;
        ags agsVar8 = this.o;
        Object[] objArr6 = agsVar8.b;
        long[] jArr8 = agsVar8.c;
        int i7 = agsVar8.e;
        while (i7 != Integer.MAX_VALUE) {
            long j9 = (jArr8[i7] >> 31) & j;
            djp djpVar3 = (djp) objArr6[i7];
            if (z9) {
                djpVar3.a();
            }
            if (z3) {
                djpVar3.c(z4);
            }
            i7 = (int) j9;
        }
        this.k = z;
        this.l = z;
        this.i = z2;
        this.j = z2;
        this.m = z4;
        this.n = z4;
        djmVarA = this.d;
        if (djmVarA == null) {
            djmVarA = a(0);
        }
        djmVarA2 = this.d;
        if (djmVarA2 == null) {
            djmVarA2 = a(0);
        }
        if (awrc.c(djmVarA2, djmVarA)) {
            if (djmVarA2 == null) {
                djnVar = new djn(null);
            } else {
                ArrayList arrayList2 = new ArrayList();
                while (r1.hasNext()) {
                    if (djmVar3.e) {
                        List list3 = djmVar3.c;
                    }
                }
                while (r1.hasNext()) {
                    if (djmVar4.e) {
                        List list4 = djmVar4.c;
                    }
                }
                djnVar = new djn(djmVarA2.b, arrayList2, djmVarA2.d, arrayList2.size());
            }
            axafVar = this.g;
            if (awrc.c((djn) axafVar.c(), djnVar)) {
                axafVar.d(djnVar);
                ags agsVar9 = this.q;
                objArr3 = agsVar9.b;
                jArr3 = agsVar9.c;
                i3 = agsVar9.e;
                while (i3 != Integer.MAX_VALUE) {
                    long j10 = (jArr3[i3] >> 31) & j;
                    i3 = (int) j10;
                }
                ags agsVar10 = this.p;
                objArr4 = agsVar10.b;
                jArr4 = agsVar10.c;
                i4 = agsVar10.e;
                while (i4 != Integer.MAX_VALUE) {
                    long j11 = (jArr4[i4] >> 31) & j;
                    i4 = (int) j11;
                }
                ags agsVar11 = this.o;
                objArr5 = agsVar11.b;
                jArr5 = agsVar11.c;
                i5 = agsVar11.e;
                while (i5 != Integer.MAX_VALUE) {
                    long j12 = (jArr5[i5] >> 31) & j;
                    i5 = (int) j12;
                }
            }
        }
    }
}
