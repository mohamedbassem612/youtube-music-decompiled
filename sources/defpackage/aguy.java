package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aguy extends AbstractMap {
    public static final Comparator a = new cru(15);
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aguy, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public aguy(aguy aguyVar, aguy aguyVar2) {
        int i;
        Object objC;
        Object[] objArr;
        aguy abstractMap = new AbstractMap();
        abstractMap.d = new agux(abstractMap, -1);
        abstractMap.e = null;
        abstractMap.f = null;
        int size = aguyVar.size() + aguyVar2.size();
        int iB = aguyVar.b() + aguyVar2.b();
        int i2 = size + 1;
        Object[] objArr2 = new Object[iB];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryC = aguyVar.c(0);
        Map.Entry entryC2 = aguyVar2.c(0);
        int i4 = 0;
        int i5 = 0;
        int iA = size;
        Map.Entry entryC3 = entryC;
        int i6 = 0;
        while (true) {
            int i7 = 1;
            if (entryC3 == null && entryC2 == null) {
                break;
            }
            i6++;
            if (entryC3 != null) {
                if (entryC2 != null) {
                    int iCompareTo = ((String) entryC3.getKey()).compareTo((String) entryC2.getKey());
                    if (iCompareTo == 0) {
                        int i8 = i4 + 1;
                        int i9 = i5 + 1;
                        objArr2[i6] = abstractMap.d((String) entryC3.getKey(), i6);
                        agux aguxVar = (agux) entryC3.getValue();
                        agux aguxVar2 = (agux) entryC2.getValue();
                        int i10 = 0;
                        int i11 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i10 >= aguxVar.size() && i11 >= aguxVar2.size()) {
                                break;
                            }
                            int iCompare = i10 == aguxVar.size() ? i7 : i11 == aguxVar2.size() ? -1 : 0;
                            iCompare = iCompare == 0 ? agva.a.compare(aguxVar.c(i10), aguxVar2.c(i11)) : iCompare;
                            if (iCompare < 0) {
                                i = i10 + 1;
                                objC = aguxVar.c(i10);
                            } else {
                                int i12 = i11 + 1;
                                Object objC2 = aguxVar2.c(i11);
                                i11 = i12;
                                i = iCompare == 0 ? i10 + 1 : i10;
                                objC = objC2;
                            }
                            objArr2[iA] = objC;
                            i10 = i;
                            iA++;
                            i7 = 1;
                            abstractMap = this;
                        }
                        iArr[i6] = iA;
                        entryC3 = aguyVar.c(i8);
                        entryC2 = aguyVar2.c(i9);
                        i5 = i9;
                        i4 = i8;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i4++;
                iA = a(entryC3, i6, iA, objArr2, iArr);
                entryC3 = aguyVar.c(i4);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryC3;
            i5++;
            int iA2 = a(entryC2, i6, iA, objArr2, iArr);
            entryC2 = aguyVar2.c(i5);
            iA = iA2;
            entryC3 = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i13 = iArr[i3];
        int i14 = i13 - i6;
        if (i14 != 0) {
            for (int i15 = i3; i15 <= i6; i15++) {
                iArr[i15] = iArr[i15] - i14;
            }
            int i16 = iArr[i6];
            int i17 = i16 - i6;
            if (e(iB, i16)) {
                objArr = new Object[i16];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i13, objArr, i6, i17);
            objArr2 = objArr;
        }
        abstractMap.b = objArr2;
        int i18 = iArr[i3] + 1;
        abstractMap.c = e(i2, i18) ? Arrays.copyOf(iArr, i18) : iArr;
    }

    private final int a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        agux aguxVar = (agux) entry.getValue();
        int iA = aguxVar.a() - aguxVar.b();
        System.arraycopy(aguxVar.b.b, aguxVar.b(), objArr, i2, iA);
        objArr[i] = d((String) entry.getKey(), i);
        int i3 = i2 + iA;
        iArr[i + 1] = i3;
        return i3;
    }

    private final int b() {
        return this.c[size()];
    }

    private final Map.Entry c(int i) {
        if (i < this.c[0]) {
            return (Map.Entry) this.b[i];
        }
        return null;
    }

    private final Map.Entry d(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new agux(this, i));
    }

    private static boolean e(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer numValueOf = this.e;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.hashCode());
            this.e = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f = string;
        return string;
    }

    public aguy(List list) {
        this.d = new agux(this, -1);
        this.e = null;
        this.f = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.b = e(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.c = iArr;
                return;
            }
            Object obj = ((ahub) it2.next()).a;
            throw null;
        }
        Object obj2 = ((ahub) it.next()).a;
        throw null;
    }
}
