package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cpe implements cwj {
    public bse a;
    private final int b;
    private final int c;
    private final bse d;
    private final cvf e = new cvf();
    private cwj f;
    private long g;

    public cpe(int i, int i2, bse bseVar) {
        this.b = i;
        this.c = i2;
        this.d = bseVar;
    }

    @Override // defpackage.cwj
    public final /* synthetic */ int a(brv brvVar, int i, boolean z) {
        return g(brvVar, i, z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:79:0x012e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0140 A[LOOP:2: B:78:0x012c->B:81:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108 A[EDGE_INSN: B:92:0x0108->B:70:0x0108 BREAK  A[LOOP:0: B:63:0x00f1->B:68:0x0100], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0151 A[EDGE_INSN: B:97:0x0151->B:84:0x0151 BREAK  A[LOOP:2: B:78:0x012c->B:81:0x0140], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0145 A[SYNTHETIC] */
    @Override // defpackage.cwj
    public final void b(bse bseVar) {
        String str;
        String str2;
        String str3;
        bsx bsxVar;
        bsx bsxVarE;
        bsa bsaVar;
        bsa bsaVar2;
        ArrayList arrayList;
        String str4;
        bsa bsaVar3;
        int size;
        brz[] brzVarArr;
        int length;
        int i;
        brz brzVar;
        int i2;
        int i3;
        String str5;
        UUID uuid;
        int i4;
        brz[] brzVarArr2;
        int length2;
        int i5;
        brz brzVar2;
        String string;
        bse bseVar2 = bseVar;
        bse bseVar3 = this.d;
        if (bseVar3 != null && bseVar2 != bseVar3) {
            int iB = bsy.b(bseVar2.q);
            String str6 = bseVar3.a;
            float f = bseVar3.g;
            int i6 = bseVar3.Q;
            int i7 = bseVar3.R;
            String str7 = bseVar3.b;
            if (str7 == null) {
                str7 = bseVar2.b;
            }
            List list = bseVar3.c;
            if (list.isEmpty()) {
                list = bseVar2.c;
            }
            String str8 = bseVar2.d;
            if (iB == 3) {
                str = bseVar3.d;
                if (str != null) {
                    str8 = str;
                }
            } else if (iB == 1) {
                iB = 1;
                str = bseVar3.d;
                if (str != null) {
                    str8 = str;
                }
            }
            int i8 = bseVar2.i;
            if (i8 == -1) {
                i8 = bseVar3.i;
            }
            int i9 = bseVar2.j;
            if (i9 == -1) {
                i9 = bseVar3.j;
            }
            String str9 = bseVar2.l;
            if (str9 == null) {
                String[] strArrAj = bwp.aj(bseVar3.l);
                int length3 = strArrAj.length;
                if (length3 == 0) {
                    string = null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    int i10 = 0;
                    while (i10 < length3) {
                        int i11 = length3;
                        String str10 = strArrAj[i10];
                        int i12 = i10;
                        if (iB == bsy.b(bsy.d(str10))) {
                            if (sb.length() > 0) {
                                sb.append(',');
                            }
                            sb.append(str10);
                        }
                        i10 = i12 + 1;
                        length3 = i11;
                    }
                    if (sb.length() > 0) {
                        string = sb.toString();
                    } else {
                        string = null;
                    }
                }
                if (bwp.aj(string).length == 1) {
                    str2 = string;
                }
                str3 = bseVar2.o;
                if (str3 == null) {
                    str3 = bseVar3.o;
                }
                bsxVar = bseVar2.m;
                if (bsxVar == null) {
                    bsxVarE = bseVar3.m;
                } else {
                    bsxVarE = bsxVar.e(bseVar3.m);
                }
                float f2 = bseVar2.A;
                float f3 = (f2 == -1.0f || iB != 2) ? f2 : bseVar3.A;
                int i13 = bseVar2.e | bseVar3.e;
                int i14 = bseVar2.f | bseVar3.f;
                bsaVar = bseVar3.u;
                bsaVar2 = bseVar2.u;
                float f4 = f3;
                arrayList = new ArrayList();
                String str11 = str3;
                if (bsaVar != null) {
                    brzVarArr2 = bsaVar.a;
                    length2 = brzVarArr2.length;
                    i5 = 0;
                    while (true) {
                        str4 = bsaVar.b;
                        if (i5 < length2) {
                            break;
                        }
                        brzVar2 = brzVarArr2[i5];
                        if (brzVar2.b()) {
                            arrayList.add(brzVar2);
                        }
                        i5++;
                    }
                } else {
                    str4 = null;
                }
                if (bsaVar2 != null) {
                    if (str4 == null) {
                        str4 = bsaVar2.b;
                    }
                    size = arrayList.size();
                    brzVarArr = bsaVar2.a;
                    length = brzVarArr.length;
                    i = 0;
                    while (i < length) {
                        brz[] brzVarArr3 = brzVarArr;
                        brzVar = brzVarArr3[i];
                        if (brzVar.b()) {
                            i3 = length;
                            uuid = brzVar.a;
                            str5 = str4;
                            i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    i2 = size;
                                    arrayList.add(brzVar);
                                    break;
                                } else {
                                    i2 = size;
                                    if (!((brz) arrayList.get(i4)).a.equals(uuid)) {
                                        break;
                                    }
                                    i4++;
                                    size = i2;
                                }
                            }
                        } else {
                            i2 = size;
                            i3 = length;
                            str5 = str4;
                        }
                        i++;
                        brzVarArr = brzVarArr3;
                        length = i3;
                        str4 = str5;
                        size = i2;
                    }
                }
                if (arrayList.isEmpty()) {
                    bsaVar3 = null;
                } else {
                    bsaVar3 = new bsa(str4, arrayList);
                }
                bsd bsdVar = new bsd(bseVar2);
                bsdVar.a = str6;
                bsdVar.b = str7;
                bsdVar.d(list);
                bsdVar.d = str8;
                bsdVar.e = i13;
                bsdVar.f = i14;
                bsdVar.g = f;
                bsdVar.i = i8;
                bsdVar.j = i9;
                bsdVar.k = str2;
                bsdVar.l = bsxVarE;
                bsdVar.m = str11;
                bsdVar.s = bsaVar3;
                bsdVar.b(f4);
                bsdVar.O = i6;
                bsdVar.P = i7;
                bseVar2 = new bse(bsdVar);
            }
            str2 = str9;
            str3 = bseVar2.o;
            if (str3 == null) {
                str3 = bseVar3.o;
            }
            bsxVar = bseVar2.m;
            if (bsxVar == null) {
                bsxVarE = bseVar3.m;
            } else {
                bsxVarE = bsxVar.e(bseVar3.m);
            }
            float f5 = bseVar2.A;
            if (f5 == -1.0f) {
            }
            int i15 = bseVar2.e | bseVar3.e;
            int i16 = bseVar2.f | bseVar3.f;
            bsaVar = bseVar3.u;
            bsaVar2 = bseVar2.u;
            float f6 = f3;
            arrayList = new ArrayList();
            String str12 = str3;
            if (bsaVar != null) {
                brzVarArr2 = bsaVar.a;
                length2 = brzVarArr2.length;
                i5 = 0;
                while (true) {
                    str4 = bsaVar.b;
                    if (i5 < length2) {
                        break;
                        break;
                    }
                    brzVar2 = brzVarArr2[i5];
                    if (brzVar2.b()) {
                        arrayList.add(brzVar2);
                    }
                    i5++;
                }
            } else {
                str4 = null;
            }
            if (bsaVar2 != null) {
                if (str4 == null) {
                    str4 = bsaVar2.b;
                }
                size = arrayList.size();
                brzVarArr = bsaVar2.a;
                length = brzVarArr.length;
                i = 0;
                while (i < length) {
                    brz[] brzVarArr4 = brzVarArr;
                    brzVar = brzVarArr4[i];
                    if (brzVar.b()) {
                        i3 = length;
                        uuid = brzVar.a;
                        str5 = str4;
                        i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                i2 = size;
                                arrayList.add(brzVar);
                                break;
                                break;
                            } else {
                                i2 = size;
                                if (!((brz) arrayList.get(i4)).a.equals(uuid)) {
                                    break;
                                    break;
                                } else {
                                    i4++;
                                    size = i2;
                                }
                            }
                        }
                    } else {
                        i2 = size;
                        i3 = length;
                        str5 = str4;
                    }
                    i++;
                    brzVarArr = brzVarArr4;
                    length = i3;
                    str4 = str5;
                    size = i2;
                }
            }
            if (arrayList.isEmpty()) {
                bsaVar3 = null;
            } else {
                bsaVar3 = new bsa(str4, arrayList);
            }
            bsd bsdVar2 = new bsd(bseVar2);
            bsdVar2.a = str6;
            bsdVar2.b = str7;
            bsdVar2.d(list);
            bsdVar2.d = str8;
            bsdVar2.e = i15;
            bsdVar2.f = i16;
            bsdVar2.g = f;
            bsdVar2.i = i8;
            bsdVar2.j = i9;
            bsdVar2.k = str2;
            bsdVar2.l = bsxVarE;
            bsdVar2.m = str12;
            bsdVar2.s = bsaVar3;
            bsdVar2.b(f6);
            bsdVar2.O = i6;
            bsdVar2.P = i7;
            bseVar2 = new bse(bsdVar2);
        }
        this.a = bseVar2;
        cwj cwjVar = this.f;
        int i17 = bwp.a;
        cwjVar.b(this.a);
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void c(bwb bwbVar, int i) {
        d(bwbVar, i, 0);
    }

    @Override // defpackage.cwj
    public final void d(bwb bwbVar, int i, int i2) {
        cwj cwjVar = this.f;
        int i3 = bwp.a;
        cwjVar.c(bwbVar, i);
    }

    @Override // defpackage.cwj
    public final void e(long j, int i, int i2, int i3, cwi cwiVar) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.e;
        }
        cwj cwjVar = this.f;
        int i4 = bwp.a;
        cwjVar.e(j, i, i2, i3, cwiVar);
    }

    @Override // defpackage.cwj
    public final int g(brv brvVar, int i, boolean z) {
        cwj cwjVar = this.f;
        int i2 = bwp.a;
        return cwjVar.a(brvVar, i, z);
    }

    public final void h(cph cphVar, long j) {
        if (cphVar == null) {
            this.f = this.e;
            return;
        }
        this.g = j;
        cwj cwjVarA = cphVar.a(this.b, this.c);
        this.f = cwjVarA;
        bse bseVar = this.a;
        if (bseVar != null) {
            cwjVarA.b(bseVar);
        }
    }

    @Override // defpackage.cwj
    public final /* synthetic */ void f() {
    }
}
