package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class mfe implements meq {
    private final int[] a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();

    public mfe(ahuj ahujVar) {
        agkx agkxVar = new agkx();
        ahuj ahujVar2 = new ahuj();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iB = ahujVar.b(4);
            if (i2 >= (iB != 0 ? ahujVar.d(iB) : 0)) {
                break;
            }
            int iB2 = ahujVar.b(4);
            if (iB2 != 0) {
                ahujVar2.f(ahujVar.a(ahujVar.c(iB2) + (i2 << 2)), ahujVar.b);
            }
            int iK = ahujVar2.k();
            if (iK != 0) {
                agkxVar.c(Integer.valueOf(iK));
            }
            int iL = ahujVar2.l();
            if (iL == 1) {
                Map map = this.c;
                Integer numValueOf = Integer.valueOf(iK);
                if (!map.containsKey(numValueOf)) {
                    this.c.put(numValueOf, ahujVar2.g(6));
                }
            } else if (iL == 2) {
                Map map2 = this.d;
                Integer numValueOf2 = Integer.valueOf(iK);
                List list = (List) map2.get(numValueOf2);
                if (list != null) {
                    list.add(ahujVar2.g(6));
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(ahujVar2.g(6));
                    this.d.put(numValueOf2, arrayList);
                }
            }
            i2++;
        }
        agkz agkzVarG = agkxVar.g();
        int[] iArr = new int[agkzVarG.size()];
        agqr it = agkzVarG.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        this.a = iArr;
    }

    @Override // defpackage.meq
    public final int a() {
        int[] iArr = this.a;
        if (iArr.length != 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // defpackage.meq
    public final agke b(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            ByteBuffer byteBuffer = (ByteBuffer) this.c.get(numValueOf);
            if (byteBuffer != null) {
                return agke.q(byteBuffer);
            }
            List list = (List) this.d.get(numValueOf);
            return list != null ? agke.n(list) : agpi.a;
        }
        throw new IllegalArgumentException(getClass().getSimpleName() + ": field number " + i + " is a previously retrieved extension.");
    }

    @Override // defpackage.meq
    public final int[] c() {
        return this.a;
    }

    @Override // defpackage.mes
    public final met d(mep mepVar) {
        Integer numValueOf = Integer.valueOf(mepVar.a);
        Map map = this.b;
        met metVarB = mepVar.b((met) map.get(numValueOf));
        if (metVarB != null) {
            return metVarB;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.c.get(numValueOf);
        if (byteBuffer == null) {
            return null;
        }
        met metVarA = mepVar.b.a(byteBuffer);
        map.put(numValueOf, metVarA);
        return metVarA;
    }

    @Override // defpackage.mes
    public final boolean e(mep mepVar) {
        return this.c.containsKey(Integer.valueOf(mepVar.a));
    }

    @Override // defpackage.met
    public final byte[] f() {
        throw new UnsupportedOperationException("Cannot serialize to proto bytes for ".concat(String.valueOf(getClass().getSimpleName())));
    }
}
