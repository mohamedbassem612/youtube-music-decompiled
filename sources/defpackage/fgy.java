package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fgy implements Cloneable, fvm, fiu, fin, fir, fil {
    private SparseArray c;
    public final int i;
    public int j = b.getAndIncrement();
    public String k;
    public String l;
    public boolean m;
    public fgu n;
    public Context o;
    public static final gzj p = new gzj();
    public static final Map h = new HashMap();
    private static final AtomicInteger a = new AtomicInteger();
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final hee[] d = new hee[0];

    protected fgy() {
        int iIntValue;
        Map map = h;
        Class<?> cls = getClass();
        synchronized (map) {
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                int iIncrementAndGet = a.incrementAndGet();
                map.put(cls, Integer.valueOf(iIncrementAndGet));
                iIntValue = iIncrementAndGet;
            }
        }
        this.i = iIntValue;
    }

    public static boolean X(fgy fgyVar) {
        return fgyVar != null && fgyVar.af() == 1;
    }

    public static boolean Y(fgy fgyVar) {
        return fgyVar != null && fgyVar.af() == 1 && fgyVar.O();
    }

    public static boolean aa(fgy fgyVar) {
        return (fgyVar == null || fgyVar.af() == 1) ? false : true;
    }

    protected static final fko al(fhd fhdVar) {
        return fhdVar.i().d;
    }

    protected static void as(fhd fhdVar, nyc nycVar) {
        fkt fktVarI = fhdVar.i();
        if (fktVarI.g == null) {
            fktVarI.g = new ArrayList();
        }
        fktVarI.g.add(new xsc(nycVar, fktVarI));
    }

    public static fip o(Class cls, String str, fhd fhdVar, int i, Object[] objArr) {
        fip fipVar;
        fgy fgyVar = fhdVar.c;
        if (fgyVar == null) {
            gzj.br(3, "Creating event handler without scope.");
            return fkh.a;
        }
        if (cls != fgyVar.getClass()) {
            fgyVar.c();
            gzj.bs(2, String.format("A Event handler from %s was created using a context from %s. Event Handlers must be created using a ComponentContext from its Component.", str, fhdVar.c.c()), fpr.a(fhdVar));
        }
        fgy fgyVar2 = fhdVar.c;
        if (fgyVar2 == null) {
            gzj.br(3, "Creating event handler without scope.");
            fipVar = fkh.a;
        } else {
            fipVar = new fip(fgyVar2, i, objArr);
        }
        ComponentTree componentTree = fhdVar.g;
        if (componentTree == null) {
            return fipVar;
        }
        componentTree.K.L(fhdVar.m(), fipVar);
        return fipVar;
    }

    public static fiq p(fhd fhdVar, int i, String str) {
        fiq fiqVarB;
        if (fhdVar.c == null) {
            return null;
        }
        ComponentTree componentTree = fhdVar.g;
        String str2 = fhdVar.m() + i + str;
        gat gatVar = componentTree.H;
        synchronized (gatVar) {
            fiqVarB = gatVar.b(str2);
        }
        return fiqVarB;
    }

    public static fiq q(fhd fhdVar, fgy fgyVar, int i) {
        return fhdVar.v(i, fgyVar.D());
    }

    protected Object A(fip fipVar, Object obj) {
        if (fipVar.c != -1048037474) {
            return null;
        }
        Object[] objArr = fipVar.d;
        azs.l(objArr);
        fip fipVar2 = ((fhd) objArr[0]).i().f;
        azs.l(fipVar2);
        fipVar2.gK((isw) obj);
        return null;
    }

    @Override // defpackage.fvm
    public final Object B() {
        return getClass();
    }

    protected Object C(Context context) {
        throw new RuntimeException("Trying to mount a MountSpec that doesn't implement @OnCreateMountContent");
    }

    public final String D() {
        String str = this.l;
        if (str != null) {
            return str;
        }
        if (!this.m) {
            String string = Integer.toString(this.i);
            this.l = string;
            return string;
        }
        throw new IllegalStateException("Should not have null manual key! (" + c() + ')');
    }

    public final void H(fhd fhdVar, Object obj, fiz fizVar) {
        if (fhdVar != null) {
            fhdVar.b = "mount";
        }
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        if (zAJ) {
            c();
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        try {
            try {
                L(fhdVar, obj, fizVar);
                if (fhdVar != null) {
                    fhdVar.p();
                }
                if (!zAJ) {
                    return;
                }
            } catch (Exception e) {
                if (fhdVar == null) {
                    throw e;
                }
                gzj.bv(fhdVar, e);
                fhdVar.p();
                if (!zAJ) {
                    return;
                }
            }
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
        } catch (Throwable th) {
            if (fhdVar != null) {
                fhdVar.p();
            }
            if (zAJ) {
                gzj gzjVar4 = fvp.b;
                boolean z3 = fvn.a;
            }
            throw th;
        }
    }

    public boolean O() {
        return false;
    }

    public boolean P() {
        return false;
    }

    public boolean Q() {
        return false;
    }

    public boolean R() {
        SparseArray sparseArray = this.c;
        return sparseArray != null && sparseArray.size() > 0;
    }

    public boolean S() {
        return false;
    }

    public boolean T() {
        return false;
    }

    public boolean U() {
        return false;
    }

    protected boolean V() {
        return false;
    }

    protected boolean W(fhd fhdVar, fhd fhdVar2) {
        return true;
    }

    public boolean Z() {
        return false;
    }

    @Override // defpackage.fil
    public final /* synthetic */ boolean a(Object obj) {
        boolean z = fna.a;
        return g((fgy) obj);
    }

    public hee[] aA() {
        return d;
    }

    public ci aB(fhd fhdVar, int i, int i2) {
        throw new RuntimeException("Render should not be called on a component which hasn't implemented render! ".concat(c()));
    }

    protected boolean ab() {
        return false;
    }

    @Override // defpackage.fvm
    public boolean ac() {
        return false;
    }

    public final boolean ad(fhd fhdVar, fgy fgyVar, fhd fhdVar2, fgy fgyVar2) {
        fky fkyVar = null;
        fky fkyVar2 = (fgyVar == null || fhdVar == null) ? null : fhdVar.i().c;
        if (fgyVar2 != null && fhdVar2 != null) {
            fkyVar = fhdVar2.i().c;
        }
        boolean zAe = ae(fgyVar, fkyVar2, fgyVar2, fkyVar);
        if (V()) {
            return zAe;
        }
        return zAe || !(fhdVar == null || fhdVar2 == null || fgyVar == null || fgyVar.W(fhdVar, fhdVar2));
    }

    protected boolean ae(fgy fgyVar, fky fkyVar, fgy fgyVar2, fky fkyVar2) {
        return (ab() && fgyVar != null && fgyVar.g(fgyVar2) && gzj.bz(fkyVar, fkyVar2)) ? false : true;
    }

    public int af() {
        return 1;
    }

    protected void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        throw new IllegalStateException("You must override onMeasure() if you return true in canMeasure(), Component is: ".concat(toString()));
    }

    protected int aj(int i, int i2, fiz fizVar) {
        return Integer.MIN_VALUE;
    }

    protected int ak(fiz fizVar) {
        return 0;
    }

    public final void am(fhd fhdVar, int i, int i2, fkw fkwVar) {
        fgy fgyVar;
        fhd fhdVar2;
        int i3;
        int i4;
        fjc fjcVar;
        if (fhdVar.g() == null) {
            throw new IllegalStateException(c().concat(": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
        }
        fjc fjcVarG = fhdVar.g();
        fji fjiVarE = fjcVarG.e(this);
        if (fjiVarE != null && gzj.aY(fjiVarE.h, i, fjiVarE.g()) && gzj.aY(fjiVarE.i, i2, fjiVarE.b())) {
            fhdVar2 = fhdVar;
        } else {
            fjcVarG.j(this);
            fjd fjdVarD = fjcVarG.d();
            fjq fjqVar = null;
            try {
                boolean z = fna.a;
                fgyVar = this;
                fhdVar2 = fhdVar;
                i3 = i;
                i4 = i2;
                fjq fjqVarBe = gzj.be(fjdVarD, fhdVar2, i3, i4, fgyVar, true, false, null);
                if ((fjqVarBe == null || !fjdVarD.c()) && (fjcVar = fjdVarD.b) != null) {
                    fjcVar.H = false;
                }
                if (fjqVarBe == null) {
                    fjiVarE = null;
                } else if (fjdVarD.c()) {
                    fjiVarE = null;
                    fjqVar = fjqVarBe;
                } else {
                    fjiVarE = gzj.bi(fjdVarD, fjqVarBe, i3, i4);
                }
            } catch (Exception e) {
                fgyVar = this;
                fhdVar2 = fhdVar;
                i3 = i;
                i4 = i2;
                gzj.bw(fhdVar2, fgyVar, e);
            }
            if (gzj.aZ(fjqVar) || fjiVarE == null) {
                return;
            }
            fjcVarG.l.put(Integer.valueOf(fgyVar.j), fjiVarE);
            if (X(fgyVar)) {
                fjiVarE.h = i3;
                fjiVarE.i = i4;
                fjiVarE.j = fjiVarE.g();
                fjiVarE.k = fjiVarE.b();
            }
        }
        fkwVar.a = fjiVarE.g();
        fkwVar.b = fjiVarE.b();
        if (fna.i) {
            fia.b(fjcVarG.x, fhdVar2.a);
        }
    }

    @Override // defpackage.fir
    public final void at(fiq fiqVar, Object obj) throws Exception {
        try {
            ax(fiqVar, obj);
        } catch (Exception e) {
            fhd fhdVar = fiqVar.b;
            if (fhdVar == null) {
                throw e;
            }
            gzj.bv(fhdVar, e);
        }
    }

    public final void aw(fhd fhdVar, Object obj) {
        gzj gzjVar = fvp.b;
        if (gzj.aJ()) {
            c();
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        try {
            try {
                ar(fhdVar, obj);
            } catch (Exception e) {
                gzj.bv(fhdVar, e);
            }
        } finally {
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    public void ay(Object obj) {
        throw new RuntimeException("Components that have dynamic Props must override this method");
    }

    public fjq b(fjd fjdVar, fhd fhdVar) {
        return gzj.bd(fjdVar, fhdVar, this, false, null);
    }

    public String c() {
        throw null;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean g(fgy fgyVar) {
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar == null || getClass() != fgyVar.getClass()) {
            return false;
        }
        if (this.j != fgyVar.j) {
            return gzj.by(this, fgyVar);
        }
        return true;
    }

    protected int h() {
        return 3;
    }

    public SparseArray i() {
        return this.c;
    }

    public final SparseArray j() {
        SparseArray sparseArray = this.c;
        if (sparseArray != null) {
            return sparseArray;
        }
        SparseArray sparseArray2 = new SparseArray();
        this.c = sparseArray2;
        return sparseArray2;
    }

    public final fgu k() {
        fgu fguVar = this.n;
        if (fguVar != null) {
            return fguVar;
        }
        fgu fguVar2 = new fgu();
        this.n = fguVar2;
        return fguVar2;
    }

    public fgy l() {
        try {
            return (fgy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final fgy m() {
        fgy fgyVarL = l();
        fgyVarL.j = b.getAndIncrement();
        return fgyVarL;
    }

    protected fiz r() {
        return null;
    }

    protected fjy s() {
        getClass().getSimpleName();
        return new fid(h());
    }

    protected fko t() {
        return null;
    }

    public final String toString() {
        return c();
    }

    protected fky u() {
        return null;
    }

    @Override // defpackage.fvm
    public final fvj w() {
        return s();
    }

    public final Object x(Context context) {
        if (fna.w) {
            c();
        }
        return C(context);
    }

    @Override // defpackage.fvm
    public final Object y(Context context) {
        Object objX = x(context);
        if (objX != null) {
            return objX;
        }
        throw new RuntimeException("Component created null mount content, but mount content must never be null! Component: ".concat(c()));
    }

    @Override // defpackage.fin
    public final Object z(fip fipVar, Object obj) {
        Object objA;
        boolean z = fna.a;
        if (fipVar.c == -1048037474) {
            return A(fipVar, obj);
        }
        fio fioVar = gzj.e;
        try {
            try {
                objA = A(fipVar, obj);
            } catch (Exception e) {
                Object[] objArr = fipVar.d;
                if (objArr != null) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof fhd) {
                        gzj.bv((fhd) obj2, e);
                        objA = null;
                    }
                }
                throw e;
            }
            fio fioVar2 = gzj.e;
            return objA;
        } catch (Throwable th) {
            fio fioVar3 = gzj.e;
            throw th;
        }
    }

    public void ai() {
    }

    public void an() {
    }

    protected void av() {
    }

    @Override // defpackage.fiu
    @Deprecated
    public final fin n() {
        return this;
    }

    public void G(fhd fhdVar) {
    }

    public void I(fhd fhdVar) {
    }

    public void K(fhd fhdVar) {
    }

    public void M(fhd fhdVar) {
    }

    public void au(fiz fizVar) {
    }

    protected void E(fiz fizVar, fiz fizVar2) {
    }

    protected void F(fko fkoVar, fko fkoVar2) {
    }

    public void N(fky fkyVar, fky fkyVar2) {
    }

    protected void ao(View view, bbz bbzVar) {
    }

    protected void aq(fhd fhdVar, Object obj) {
    }

    protected void ar(fhd fhdVar, Object obj) {
    }

    protected void ax(fiq fiqVar, Object obj) {
    }

    public void az(fhd fhdVar, gat gatVar) {
    }

    public fly v(fhd fhdVar, fly flyVar) {
        return flyVar;
    }

    protected void J(fhd fhdVar, Object obj, fiz fizVar) {
    }

    protected void L(fhd fhdVar, Object obj, fiz fizVar) {
    }

    public void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
    }

    protected void ap(bbz bbzVar, int i, int i2, int i3, fiz fizVar) {
    }
}
