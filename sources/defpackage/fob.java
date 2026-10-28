package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fob {
    public static final /* synthetic */ int a = 0;
    private static final List b = new ArrayList();

    public static afts a(fof fofVar, foe foeVar, foe foeVar2, List list, dov dovVar, String str, String str2, String str3, String str4, boolean z) {
        afts aftsVarV;
        List list2;
        List list3;
        int i;
        List list4;
        boolean z2 = z;
        boolean z3 = foeVar2 == null;
        boolean z4 = foeVar == null;
        if (z4 && z3) {
            throw new IllegalStateException("Both currentRoot and newRoot are null.");
        }
        if (z3) {
            int i2 = foeVar.i;
            list.add(foeVar);
            aftsVarV = afts.u(foeVar.i, foeVar2, z2);
            for (int i3 = 0; i3 < i2; i3++) {
                aftsVarV.p(fnz.c(0, null));
            }
        } else {
            String strC = c(foeVar, str2);
            String strC2 = c(foeVar2, str3);
            if (!z4 && !foh.o(foeVar, foeVar2)) {
                afts aftsVarU = afts.u(foeVar.i, foeVar2, z2);
                foeVar2.i = aftsVarU.a;
                dovVar.A(str, foeVar, foeVar2, strC, strC2, Boolean.FALSE, str4);
                return aftsVarU;
            }
            dovVar.A(str, foeVar, foeVar2, strC, strC2, Boolean.TRUE, str4);
            if (foeVar2.k()) {
                if (fna.w && !z4) {
                    String str5 = foeVar.l;
                }
                afts aftsVarU2 = afts.u(z4 ? 0 : foeVar.i, foeVar2, z2);
                foeVar2.r(foeVar2.c, aftsVarU2, foeVar != null ? foeVar : null, foeVar2);
                foeVar2.i = aftsVarU2.a;
                return aftsVarU2;
            }
            afts aftsVarU3 = afts.u(0, foeVar2, z2);
            Map mapD = foe.d(foeVar);
            Map mapD2 = foe.d(foeVar2);
            List arrayList = (foeVar == null || (list4 = foeVar.j) == null) ? b : new ArrayList(list4);
            List list5 = foeVar2.j;
            if (list5 == null) {
                list5 = b;
            }
            int i4 = 0;
            int i5 = -1;
            int iB = -1;
            while (i4 < list5.size()) {
                String str6 = ((foe) list5.get(i4)).k;
                if (mapD.containsKey(str6)) {
                    axq axqVar = (axq) mapD.get(str6);
                    foe foeVar3 = (foe) axqVar.a;
                    int iIntValue = ((Integer) axqVar.b).intValue();
                    list3 = list5;
                    i = i4;
                    if (i5 > iIntValue) {
                        for (int i6 = 0; i6 < foeVar3.i; i6++) {
                            aftsVarU3.p(fnz.a(b(arrayList, str6), iB, null));
                        }
                        arrayList.remove(iIntValue);
                        arrayList.add(i5, foeVar3);
                        int i7 = 0;
                        for (int size = arrayList.size(); i7 < size; size = size) {
                            foe foeVar4 = (foe) arrayList.get(i7);
                            axq axqVar2 = (axq) mapD.get(foeVar4.k);
                            if (((Integer) axqVar2.b).intValue() != i7) {
                                mapD.put(foeVar4.k, new axq((foe) axqVar2.a, Integer.valueOf(i7)));
                            }
                            i7++;
                        }
                    } else if (iIntValue > i5) {
                        iB = (b(arrayList, str6) + ((foe) arrayList.get(iIntValue)).i) - 1;
                        i5 = iIntValue;
                    }
                } else {
                    list3 = list5;
                    i = i4;
                }
                i4 = i + 1;
                list5 = list3;
            }
            List list6 = list5;
            SparseArray sparseArray = new SparseArray();
            int i8 = 0;
            while (i8 < arrayList.size()) {
                String str7 = ((foe) arrayList.get(i8)).k;
                foe foeVar5 = (foe) arrayList.get(i8);
                if (mapD2.get(str7) == null) {
                    sparseArray.put(i8, a(fofVar, foeVar5, null, list, dovVar, str, strC, strC2, str4, z2));
                }
                i8++;
                mapD2 = mapD2;
                z2 = z;
                arrayList = arrayList;
            }
            List list7 = arrayList;
            int i9 = 0;
            int i10 = 0;
            while (i10 < list6.size()) {
                List list8 = list6;
                foe foeVar6 = (foe) list8.get(i10);
                axq axqVar3 = (axq) mapD.get(foeVar6.k);
                int iIntValue2 = axqVar3 != null ? ((Integer) axqVar3.b).intValue() : -1;
                if (iIntValue2 < 0) {
                    list2 = list8;
                    int i11 = i9;
                    sparseArray.put(i11, afts.v((afts) sparseArray.get(i9), a(fofVar, null, foeVar6, list, dovVar, str, strC, strC2, str4, z)));
                    i9 = i11;
                } else {
                    list2 = list8;
                    int i12 = iIntValue2;
                    sparseArray.put(i12, afts.v((afts) sparseArray.get(iIntValue2), a(fofVar, (foe) list7.get(iIntValue2), foeVar6, list, dovVar, str, strC, strC2, str4, z)));
                    i9 = i12;
                }
                i10++;
                aftsVarU3 = aftsVarU3;
                list6 = list2;
            }
            int size2 = sparseArray.size();
            aftsVarV = aftsVarU3;
            for (int i13 = 0; i13 < size2; i13++) {
                aftsVarV = afts.v(aftsVarV, (afts) sparseArray.valueAt(i13));
            }
            foeVar2.i = aftsVarV.a;
        }
        return aftsVarV;
    }

    private static int b(List list, String str) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            foe foeVar = (foe) it.next();
            if (foeVar.k.equals(str)) {
                break;
            }
            i += foeVar.i;
        }
        return i;
    }

    private static String c(foe foeVar, String str) {
        if (foeVar == null) {
            return "";
        }
        foe foeVar2 = foeVar.a;
        Class<?> cls = foeVar.getClass();
        if (foeVar2 == null) {
            return cls.getSimpleName();
        }
        return str + "->" + cls.getSimpleName();
    }
}
