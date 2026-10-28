package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    public d(ArrayList arrayList, boolean z) {
        this((e[]) arrayList.toArray(new e[arrayList.size()]), z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // j$.time.format.e
    public final boolean h(t tVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            tVar.c++;
        }
        try {
            for (e eVar : this.a) {
                if (!eVar.h(tVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                tVar.c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int k(r rVar, CharSequence charSequence, int i) {
        ArrayList arrayList = rVar.d;
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (!z) {
            int length = eVarArr.length;
            while (i2 < length) {
                i = eVarArr[i2].k(rVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        w wVarC = rVar.c();
        wVarC.getClass();
        w wVar = new w();
        wVar.a.putAll(wVarC.a);
        wVar.b = wVarC.b;
        wVar.c = wVarC.c;
        wVar.d = wVarC.d;
        arrayList.add(wVar);
        int length2 = eVarArr.length;
        int iK = i;
        while (i2 < length2) {
            iK = eVarArr[i2].k(rVar, charSequence, iK);
            if (iK < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i;
            }
            i2++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iK;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }
}
