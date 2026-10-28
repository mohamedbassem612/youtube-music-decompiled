package defpackage;

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aikf {
    final SparseArray a = new SparseArray();
    public int b = 0;

    private aikf() {
    }

    public static aikf a(aigm aigmVar, aiki aikiVar) {
        aikf aikfVar = new aikf();
        aikfVar.c(aigmVar, (aikh) aikiVar);
        return aikfVar;
    }

    private final void c(aigm aigmVar, aikh aikhVar) throws aiik {
        Long lValueOf;
        Long lValueOf2;
        Object obj;
        aigj aigjVarW;
        Integer numValueOf;
        while (true) {
            int iN = aigmVar.n();
            if (iN <= 0) {
                return;
            }
            int i = iN >>> 3;
            aikh aikhVarC = aikhVar.c(i);
            if (!aikhVarC.c.isEmpty() || aikhVarC.d) {
                this.b += (352 - (Integer.numberOfLeadingZeros(iN) * 9)) >>> 6;
                int i2 = iN & 7;
                if (i2 == 0) {
                    long jS = ((aigk) aigmVar).s();
                    this.b += (640 - (Long.numberOfLeadingZeros(jS) * 9)) >>> 6;
                    lValueOf = Long.valueOf(jS);
                } else if (i2 == 1) {
                    long jR = ((aigk) aigmVar).r();
                    this.b += 8;
                    lValueOf2 = Long.valueOf(jR);
                } else if (i2 == 2) {
                    aikh aikhVarC2 = aikhVar.c(i);
                    if (Objects.equals(aikhVarC2, aikh.b)) {
                        aigjVarW = aigmVar.w();
                        int i3 = this.b;
                        int iD = aigjVarW.d();
                        this.b = i3 + ((352 - (Integer.numberOfLeadingZeros(iD) * 9)) >>> 6) + iD;
                    } else {
                        int iK = aigmVar.k();
                        int iE = aigmVar.e();
                        int iF = aigmVar.f(iK);
                        aikf aikfVar = new aikf();
                        aikfVar.c(aigmVar, aikhVarC2);
                        ((aigk) aigmVar).B(iF);
                        int iE2 = aigmVar.e() - iE;
                        if (iE2 != iK) {
                            throw new aiij(a.bQ(iE2, iK, "Mismatched size: ", " != "));
                        }
                        int iNumberOfLeadingZeros = this.b + ((352 - (Integer.numberOfLeadingZeros(aikfVar.b) * 9)) >>> 6);
                        this.b = iNumberOfLeadingZeros;
                        this.b = iNumberOfLeadingZeros + aikfVar.b;
                        obj = aikfVar;
                    }
                } else {
                    if (i2 != 5) {
                        throw new aiij("Unexpected wire type");
                    }
                    int iJ = ((aigk) aigmVar).j();
                    this.b += 4;
                    numValueOf = Integer.valueOf(iJ);
                }
            } else {
                aigmVar.F(iN);
                obj = null;
            }
            if (obj != null) {
                obj = lValueOf;
                obj = lValueOf2;
                obj = aigjVarW;
                obj = numValueOf;
                SparseArray sparseArray = this.a;
                int iIndexOfKey = sparseArray.indexOfKey(iN);
                if (iIndexOfKey < 0) {
                    sparseArray.append(iN, obj);
                } else {
                    Object objValueAt = sparseArray.valueAt(iIndexOfKey);
                    if (objValueAt instanceof ArrayList) {
                        ((ArrayList) objValueAt).add(obj);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(objValueAt);
                        arrayList.add(obj);
                        sparseArray.append(iN, arrayList);
                    }
                }
            } else {
                obj = lValueOf;
                obj = lValueOf2;
                obj = aigjVarW;
                obj = numValueOf;
            }
        }
    }

    private final void d(int i, Object obj, aigs aigsVar) throws aiij, aigq {
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                d(i, arrayList.get(i2), aigsVar);
            }
            return;
        }
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            aigsVar.z(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            aigsVar.m(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 != 2) {
            if (i4 != 5) {
                throw new aiij("Unexpected wire type");
            }
            aigsVar.k(i3, ((Integer) obj).intValue());
        } else if (obj instanceof aigj) {
            aigsVar.i(i3, (aigj) obj);
        } else {
            if (!(obj instanceof aikf)) {
                throw new aiij("Unexpected WIRETYPE_LENGTH_DELIMITED value");
            }
            aikf aikfVar = (aikf) obj;
            ((aigo) aigsVar).y((i3 << 3) | 2);
            aigsVar.y(aikfVar.b);
            aikfVar.b(aigsVar);
        }
    }

    public final void b(aigs aigsVar) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.a;
            if (i >= sparseArray.size()) {
                return;
            }
            d(sparseArray.keyAt(i), sparseArray.valueAt(i), aigsVar);
            i++;
        }
    }
}
