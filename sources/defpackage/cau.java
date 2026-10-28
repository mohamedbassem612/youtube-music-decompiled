package defpackage;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cau extends btn {
    public static final /* synthetic */ int e = 0;
    public final int b;
    public final btn[] c;
    public final Object[] d;
    private final int f;
    private final int g;
    private final int[] h;
    private final int[] i;
    private final HashMap j;
    private final ayq k;

    public cau(btn[] btnVarArr, Object[] objArr, ayq ayqVar) {
        this.k = ayqVar;
        this.f = ayqVar.s();
        this.c = btnVarArr;
        int length = btnVarArr.length;
        this.h = new int[length];
        this.i = new int[length];
        this.d = objArr;
        this.j = new HashMap();
        int i = 0;
        int iC = 0;
        int iB = 0;
        int i2 = 0;
        while (i < btnVarArr.length) {
            btn btnVar = btnVarArr[i];
            this.c[i2] = btnVar;
            this.i[i2] = iC;
            this.h[i2] = iB;
            iC += btnVar.c();
            iB += this.c[i2].b();
            this.j.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.b = iC;
        this.g = iB;
    }

    public static Object p(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object q(Object obj) {
        return ((Pair) obj).first;
    }

    private final int y(int i, boolean z) {
        if (!z) {
            if (i < this.f - 1) {
                return i + 1;
            }
            return -1;
        }
        ayq ayqVar = this.k;
        int i2 = ((int[]) ayqVar.c)[i] + 1;
        int[] iArr = (int[]) ayqVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private final int z(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return (-1) + i;
            }
            return -1;
        }
        ayq ayqVar = this.k;
        int i2 = ((int[]) ayqVar.c)[i] - 1;
        if (i2 >= 0) {
            return ((int[]) ayqVar.b)[i2];
        }
        return -1;
    }

    @Override // defpackage.btn
    public final int a(Object obj) {
        int iA;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object objQ = q(obj);
        Object objP = p(obj);
        int iR = r(objQ);
        if (iR == -1 || (iA = w(iR).a(objP)) == -1) {
            return -1;
        }
        return u(iR) + iA;
    }

    @Override // defpackage.btn
    public final int b() {
        return this.g;
    }

    @Override // defpackage.btn
    public final int c() {
        return this.b;
    }

    @Override // defpackage.btn
    public final btl d(int i, btl btlVar, boolean z) {
        int iS = s(i);
        int iV = v(iS);
        w(iS).d(i - u(iS), btlVar, z);
        btlVar.c += iV;
        if (z) {
            Object objX = x(iS);
            Object obj = btlVar.b;
            obj.getClass();
            btlVar.b = Pair.create(objX, obj);
        }
        return btlVar;
    }

    @Override // defpackage.btn
    public final btm e(int i, btm btmVar, long j) {
        int iT = t(i);
        int iV = v(iT);
        int iU = u(iT);
        w(iT).e(i - iV, btmVar, j);
        Object objX = x(iT);
        if (!btm.a.equals(btmVar.b)) {
            objX = Pair.create(objX, btmVar.b);
        }
        btmVar.b = objX;
        btmVar.o += iU;
        btmVar.p += iU;
        return btmVar;
    }

    @Override // defpackage.btn
    public final Object f(int i) {
        int iS = s(i);
        return Pair.create(x(iS), w(iS).f(i - u(iS)));
    }

    @Override // defpackage.btn
    public final int g(boolean z) {
        if (this.f == 0) {
            return -1;
        }
        int iY = 0;
        if (z) {
            int[] iArr = (int[]) this.k.b;
            iY = iArr.length > 0 ? iArr[0] : -1;
        }
        while (w(iY).n()) {
            iY = y(iY, z);
            if (iY == -1) {
                return -1;
            }
        }
        return v(iY) + w(iY).g(z);
    }

    @Override // defpackage.btn
    public final int h(boolean z) {
        int iZ;
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        if (z) {
            int[] iArr = (int[]) this.k.b;
            int length = iArr.length;
            iZ = length > 0 ? iArr[length - 1] : -1;
        } else {
            iZ = i - 1;
        }
        while (w(iZ).n()) {
            iZ = z(iZ, z);
            if (iZ == -1) {
                return -1;
            }
        }
        return v(iZ) + w(iZ).h(z);
    }

    @Override // defpackage.btn
    public final int j(int i, int i2, boolean z) {
        int iT = t(i);
        int iV = v(iT);
        int iJ = w(iT).j(i - iV, i2 == 2 ? 0 : i2, z);
        if (iJ != -1) {
            return iV + iJ;
        }
        int iY = y(iT, z);
        while (iY != -1 && w(iY).n()) {
            iY = y(iY, z);
        }
        if (iY != -1) {
            return v(iY) + w(iY).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.btn
    public final btl m(Object obj, btl btlVar) {
        Object objQ = q(obj);
        Object objP = p(obj);
        int iR = r(objQ);
        int iV = v(iR);
        w(iR).m(objP, btlVar);
        btlVar.c += iV;
        btlVar.b = obj;
        return btlVar;
    }

    @Override // defpackage.btn
    public final int o(int i, int i2) {
        int iT = t(i);
        int iV = v(iT);
        int iO = w(iT).o(i - iV, i2 == 2 ? 0 : i2);
        if (iO != -1) {
            return iV + iO;
        }
        int iZ = z(iT, false);
        while (iZ != -1 && w(iZ).n()) {
            iZ = z(iZ, false);
        }
        if (iZ != -1) {
            return v(iZ) + w(iZ).h(false);
        }
        if (i2 == 2) {
            return h(false);
        }
        return -1;
    }

    protected final int r(Object obj) {
        Integer num = (Integer) this.j.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected final int s(int i) {
        return bwp.b(this.h, i + 1, false, false);
    }

    protected final int t(int i) {
        return bwp.b(this.i, i + 1, false, false);
    }

    protected final int u(int i) {
        return this.h[i];
    }

    protected final int v(int i) {
        return this.i[i];
    }

    protected final btn w(int i) {
        return this.c[i];
    }

    protected final Object x(int i) {
        return this.d[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public cau(Collection collection, ayq ayqVar) {
        btn[] btnVarArr = new btn[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            btnVarArr[i2] = ((cdd) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((cdd) it2.next()).b();
            i++;
        }
        this(btnVarArr, objArr, ayqVar);
    }
}
