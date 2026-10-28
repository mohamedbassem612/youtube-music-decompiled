package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vpc {
    private static final vpb f = new vpa();
    public final vog b;
    public final axsp c;
    public final vxz e;
    private final aunn g;
    public vpb d = f;
    public final ArrayDeque a = new ArrayDeque();

    /* JADX WARN: Type inference failed for: r2v1, types: [axsp, java.lang.Object] */
    public vpc(vog vogVar, ahto ahtoVar, aunn aunnVar, vxz vxzVar) {
        this.b = vogVar;
        this.c = ahtoVar.a;
        this.g = aunnVar;
        this.e = vxzVar;
    }

    public static int k(vot votVar) {
        akuj akujVarU = votVar.b.u();
        if (akujVarU == null || (akujVarU.c & 64) == 0) {
            return 1;
        }
        akug akugVar = akujVarU.l;
        if (akugVar == null) {
            akugVar = akug.a;
        }
        int iAS = a.aS(akugVar.c);
        if (iAS == 0) {
            iAS = 1;
        }
        return iAS + (-1) == 2 ? 2 : 1;
    }

    public final int a() {
        Iterator it = this.a.iterator();
        int iH = 0;
        while (it.hasNext()) {
            iH += ((xsc) it.next()).h();
        }
        return iH;
    }

    public final int b() {
        return this.a.size();
    }

    public final agev c() {
        return agev.h((xsc) this.a.peek()).a(new sdp(17));
    }

    public final agev d() {
        agev agevVarE = e();
        return agevVarE.g() ? agev.i((xsc) agevVarE.c()).a(new sdp(17)) : agdf.a;
    }

    public final agev e() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return agdf.a;
        }
        xsc xscVar = (xsc) arrayDeque.pop();
        xsc xscVar2 = (xsc) arrayDeque.peek();
        arrayDeque.push(xscVar);
        return agev.h(xscVar2);
    }

    public final agev f() {
        xsc xscVar = (xsc) this.a.peek();
        if (xscVar == null) {
            return agdf.a;
        }
        if (xscVar.h() <= 1) {
            return d();
        }
        ArrayDeque<vot> arrayDeque = (ArrayDeque) xscVar.c;
        if (arrayDeque.size() <= 1) {
            return agdf.a;
        }
        int i = 0;
        for (vot votVar : arrayDeque) {
            i++;
            if (i == 2) {
                return agev.i(votVar);
            }
        }
        return agdf.a;
    }

    public final agev g() {
        xsc xscVar = (xsc) this.a.peek();
        if (xscVar != null) {
            Iterator it = ((ArrayDeque) xscVar.c).iterator();
            while (it.hasNext()) {
                vob vobVar = ((vot) it.next()).b;
                if (vobVar.v().isPresent()) {
                    return agev.i((ajwo) vobVar.v().get());
                }
            }
        }
        return agdf.a;
    }

    public final void h() {
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((xsc) it.next()).k();
        }
        arrayDeque.clear();
        this.c.kk(agdf.a);
    }

    public final void i() {
        ArrayDeque arrayDeque = this.a;
        int size = arrayDeque.size();
        while (true) {
            size--;
            if (size < 0) {
                this.c.kk(agdf.a);
                return;
            }
            ((xsc) arrayDeque.pop()).l();
        }
    }

    public final boolean j() {
        xsc xscVar = (xsc) this.a.peek();
        return xscVar != null && xscVar.h() > 1;
    }

    public final boolean l(int i) {
        ArrayDeque arrayDeque = this.a;
        xsc xscVar = (xsc) arrayDeque.peek();
        if (xscVar == null || (arrayDeque.size() == 1 && xscVar.h() <= 1)) {
            return false;
        }
        if (xscVar.h() == 0) {
            arrayDeque.pop();
            return l(i);
        }
        if (xscVar.h() == 1) {
            return m(i);
        }
        agev agevVarJ = xscVar.j();
        vot votVarI = xscVar.i();
        vog vogVar = this.b;
        vogVar.e();
        if (i == 1 && agevVarJ.g()) {
            vogVar.j((vot) agevVarJ.c(), votVarI, 3);
        } else {
            vogVar.h(votVarI);
        }
        votVarI.b(2);
        return true;
    }

    public final boolean m(int i) {
        vob vobVar;
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.size() <= 1) {
            return false;
        }
        xsc xscVar = (xsc) arrayDeque.pop();
        xsc xscVar2 = (xsc) arrayDeque.peek();
        if (xscVar2 != null) {
            vog vogVar = this.b;
            vogVar.e();
            if (i == 1) {
                vogVar.j(xscVar.i(), xscVar2.i(), k((vot) xscVar.b));
            } else {
                vot votVarI = xscVar2.i();
                vogVar.i();
                FrameLayout frameLayout = (FrameLayout) vogVar.q.a;
                vob vobVar2 = votVarI.b;
                if (frameLayout.indexOfChild(vobVar2.c()) >= 0) {
                    vogVar.f(false);
                } else if (((FrameLayout) vogVar.o.a).indexOfChild(vobVar2.c()) >= 0) {
                    vogVar.g(false);
                } else {
                    vogVar.h(votVarI);
                }
            }
            vot votVar = (vot) ((ArrayDeque) xscVar2.c).peek();
            if (votVar != null) {
                votVar.b(2);
            }
            xscVar.l();
            vobVar = ((vot) xscVar2.b).b;
        } else {
            vobVar = null;
        }
        this.c.kk(agev.h(vobVar));
        return true;
    }

    public final void n(xsc xscVar) {
        Iterator it = ((ArrayDeque) xscVar.c).iterator();
        while (it.hasNext()) {
            vob vobVar = ((vot) it.next()).b;
            vun vunVar = ((vuk) this.g.io()).u;
        }
    }
}
