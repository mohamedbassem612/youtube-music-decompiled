package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fot extends foe {
    public static final /* synthetic */ int s = 0;

    @fmt(a = 5)
    @fmu(a = fmv.a)
    public List m;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Boolean n;
    public fip o;
    public fip p;
    public fip q;
    public fip r;

    public fot() {
        super("DataDiffSection");
    }

    @Override // defpackage.foe
    /* JADX INFO: renamed from: f */
    public final boolean a(foe foeVar) {
        if (this == foeVar) {
            return true;
        }
        if (foeVar != null && getClass() == foeVar.getClass()) {
            fot fotVar = (fot) foeVar;
            List list = this.m;
            if (list == null ? fotVar.m == null : list.equals(fotVar.m)) {
                Boolean bool = this.n;
                if (bool != null) {
                    if (bool.equals(fotVar.n)) {
                        return true;
                    }
                } else if (fotVar.n == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.foh
    protected final String h(fof fofVar) {
        List list = this.m;
        if (list != null) {
            return fhz.k(list, new fou(fofVar, null, list));
        }
        return null;
    }

    @Override // defpackage.foh
    public final boolean k() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x020a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Code duplicated, block: B:84:0x0217  */
    /* JADX WARN: Code duplicated, block: B:87:0x0228  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [ftg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [ftg, java.lang.Object] */
    @Override // defpackage.foh
    protected final void r(fof fofVar, afts aftsVar, foe foeVar, foe foeVar2) {
        List list;
        int size;
        int i;
        Object obj;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        fot fotVar = (fot) foeVar;
        fot fotVar2 = (fot) foeVar2;
        fif fifVar = new fif(fotVar == null ? null : fotVar.m, fotVar2 == null ? null : fotVar2.m);
        fif fifVar2 = new fif(null, null);
        fif fifVar3 = new fif(null, null);
        Object obj2 = new fif(fotVar == null ? null : fotVar.n, fotVar2 == null ? null : fotVar2.n).b;
        if (obj2 == null || !((Boolean) obj2).booleanValue()) {
            List list2 = (List) fifVar.a;
            List list3 = (List) fifVar.b;
            elr elrVar = new elr(fofVar.A() == null ? null : ((fot) fofVar.A()).q, (byte[]) null);
            elr elrVar2 = new elr(aftsVar, (byte[]) null);
            boolean zBm = gzj.bm();
            fou fouVar = new fou(fofVar, list2, (List) fifVar.b);
            omj omjVarW = fofVar.w();
            fkn fknVarBN = omjVarW == null ? null : gzj.bN(omjVarW, fofVar.n(), omjVarW.p(fofVar, 12), fofVar.e);
            if (list3 != null) {
                Object obj3 = fifVar3.b;
                if (obj3 == null ? fna.a : ((Boolean) obj3).booleanValue()) {
                    fhz.k(list3, fouVar);
                }
            }
            if (zBm) {
                boolean z4 = fna.a;
            }
            Object obj4 = fifVar2.b;
            int i3 = 0;
            hp hpVarA = hs.a(fouVar, obj4 == null || ((Boolean) obj4).booleanValue());
            if (zBm) {
                boolean z5 = fna.a;
            }
            if (fknVarBN != null) {
                omj.r(fknVarBN);
            }
            ftb ftbVar = new ftb(list2, list3, elrVar, elrVar2);
            hpVarA.a(ftbVar);
            List list4 = ftbVar.c;
            boolean zBm2 = gzj.bm();
            if (list4 != null) {
                List list5 = ftbVar.e;
                if (list4.size() != list5.size()) {
                    StringBuilder sb = new StringBuilder("Inconsistent size between mPlaceholders(");
                    sb.append(list5.size());
                    sb.append(") and mNextData(");
                    sb.append(list4.size());
                    sb.append("); mOperations: [");
                    List list6 = ftbVar.d;
                    int size2 = list6.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        fta ftaVar = (fta) list6.get(i4);
                        sb.append("[type=");
                        sb.append(ftaVar.a);
                        sb.append(", index=");
                        sb.append(ftaVar.b);
                        sb.append(", toIndex=");
                        sb.append(ftaVar.c);
                        List list7 = ftaVar.d;
                        if (list7 != null) {
                            sb.append(", count=");
                            sb.append(list7.size());
                        }
                        sb.append("], ");
                    }
                    sb.append("]; mNextData: [");
                    int size3 = list4.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        sb.append('[');
                        sb.append(list4.get(i5));
                        sb.append("], ");
                    }
                    sb.append(']');
                    gzj.br(2, sb.toString());
                    list6.clear();
                    List list8 = ftbVar.f;
                    list8.clear();
                    list5.clear();
                    ArrayList arrayList = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        i2 = ftbVar.a;
                        if (i6 >= i2) {
                            break;
                        }
                        arrayList.add(new fif(ftbVar.b.get(i6), null));
                        i6++;
                    }
                    list8.addAll(arrayList);
                    list6.add(new fta(2, 0, i2, null, arrayList));
                    int size4 = list4.size();
                    ArrayList arrayList2 = new ArrayList(size4);
                    ArrayList arrayList3 = new ArrayList(size4);
                    for (int i7 = 0; i7 < size4; i7++) {
                        Object obj5 = list4.get(i7);
                        if (zBm2) {
                            ftb.e(obj5);
                            boolean z6 = fna.a;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        ftg ftgVarD = ftbVar.h.d(obj5, i7);
                        if (z3) {
                            boolean z7 = fna.a;
                        }
                        arrayList2.add(i7, new fsz(ftgVarD, false));
                        arrayList3.add(new fif(null, obj5));
                    }
                    list5.addAll(arrayList2);
                    list8.addAll(arrayList3);
                    list6.add(new fta(0, 0, -1, arrayList2, arrayList3));
                } else {
                    list = ftbVar.e;
                    size = list.size();
                    for (i = 0; i < size; i++) {
                        if (((fsz) list.get(i)).a) {
                            obj = list4.get(i);
                            if (zBm2) {
                                ftb.e(obj);
                                boolean z8 = fna.a;
                                z = true;
                            } else {
                                z = false;
                            }
                            ((fsz) list.get(i)).b = ftbVar.h.d(obj, i);
                            if (z) {
                                boolean z9 = fna.a;
                            }
                            ((fif) ftbVar.f.get(i)).b = obj;
                        }
                    }
                }
            } else {
                list = ftbVar.e;
                size = list.size();
                while (i < size) {
                    if (((fsz) list.get(i)).a) {
                        obj = list4.get(i);
                        if (zBm2) {
                            ftb.e(obj);
                            boolean z10 = fna.a;
                            z = true;
                        } else {
                            z = false;
                        }
                        ((fsz) list.get(i)).b = ftbVar.h.d(obj, i);
                        if (z) {
                            boolean z11 = fna.a;
                        }
                        ((fif) ftbVar.f.get(i)).b = obj;
                    }
                }
            }
            if (zBm2) {
                boolean z12 = fna.a;
                z2 = true;
            } else {
                z2 = false;
            }
            elr elrVar3 = ftbVar.g;
            List list9 = ftbVar.d;
            int size5 = list9.size();
            int i8 = 0;
            while (i8 < size5) {
                fta ftaVar2 = (fta) list9.get(i8);
                List list10 = ftaVar2.d;
                List list11 = ftaVar2.e;
                int size6 = list10 == null ? 1 : list10.size();
                int i9 = ftaVar2.a;
                if (i9 == 0) {
                    int i10 = size6;
                    if (i10 == 1) {
                        ((afts) elrVar3.a).r(ftaVar2.b, ((fsz) list10.get(i3)).b, fofVar.j(), ((fif) list11.get(i3)).b);
                    } else {
                        List listA = elr.a(i10, list10);
                        Object obj6 = elrVar3.a;
                        int i11 = ftaVar2.b;
                        fly flyVarJ = fofVar.j();
                        List listB = elr.b(list11);
                        afts aftsVar2 = (afts) obj6;
                        if (aftsVar2.d != null) {
                            int size7 = listA.size();
                            for (int i12 = i3; i12 < size7; i12++) {
                                ((ftg) listA.get(i12)).n(((foe) aftsVar2.d).k);
                            }
                        }
                        aftsVar2.p(new fnz(-1, i11, -1, i10, null, afts.o(listA, flyVarJ), null, listB));
                    }
                } else if (i9 != 1) {
                    if (i9 != 2) {
                        ((afts) elrVar3.a).p(fnz.a(ftaVar2.b, ftaVar2.c, ((fif) list11.get(i3)).b));
                    } else {
                        int i13 = ftaVar2.c;
                        if (i13 == 1) {
                            ((afts) elrVar3.a).q(ftaVar2.b, ((fif) list11.get(i3)).a);
                        } else {
                            ((afts) elrVar3.a).p(new fnz(-3, ftaVar2.b, -1, i13, null, fnz.a, elr.c(list11), null));
                        }
                    }
                } else if (size6 == 1) {
                    ((afts) elrVar3.a).s(ftaVar2.b, ((fsz) list10.get(i3)).b, fofVar.j(), ((fif) list11.get(i3)).a, ((fif) list11.get(i3)).b);
                } else {
                    ((afts) elrVar3.a).p(new fnz(-2, ftaVar2.b, -1, size6, null, afts.o(elr.a(size6, list10), fofVar.j()), elr.c(list11), elr.b(list11)));
                }
                i8++;
                i3 = 0;
            }
            if (z2) {
                boolean z13 = fna.a;
            }
            fip fipVar = fofVar.A() == null ? null : ((fot) fofVar.A()).r;
            if (fipVar != null) {
                fipVar.b.n().z(fipVar, new fhz());
            }
        }
    }
}
