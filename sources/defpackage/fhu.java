package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhu {
    public static final Map a = new HashMap();
    public fjq b;
    private fji c;
    private int d;

    private fhu() {
    }

    static synchronized fhu e(fji fjiVar, int i) {
        fhu fhuVar = new fhu();
        fjq fjqVarL = fjiVar.l();
        if (i >= fjqVarL.b()) {
            return null;
        }
        k(fjiVar.b, fjqVarL.q(i));
        fhuVar.c = fjiVar;
        fhuVar.b = fjiVar.l();
        fhuVar.d = i;
        if (fjqVarL.x == null) {
            fjqVarL.x = new HashSet();
        }
        fjqVarL.x.add(fhuVar);
        return fhuVar;
    }

    public static fhu f(ComponentTree componentTree) {
        fjc fjcVar = componentTree == null ? null : componentTree.x;
        fji fjiVar = fjcVar == null ? null : fjcVar.p;
        if (fjiVar != null) {
            return e(fjiVar, Math.max(0, fjiVar.l().b() - 1));
        }
        return null;
    }

    public static fhu g(fjw fjwVar) {
        return f(fjwVar.w);
    }

    public static String k(fhd fhdVar, String str) {
        return System.identityHashCode(fhdVar.g) + str;
    }

    private static int p(fji fjiVar) {
        if (fjiVar == null) {
            return 0;
        }
        return p(fjiVar.f) + fjiVar.h();
    }

    private static int q(fji fjiVar) {
        if (fjiVar == null) {
            return 0;
        }
        return q(fjiVar.f) + fjiVar.i();
    }

    public final Rect a() {
        if (this.d == 0) {
            fji fjiVar = this.c;
            if (fjiVar.f == null) {
                return new Rect(0, 0, fjiVar.g(), this.c.b());
            }
        }
        int iP = p(this.c);
        int iQ = q(this.c);
        return new Rect(iP, iQ, this.c.g() + iP, this.c.b() + iQ);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042 A[EDGE_INSN: B:23:0x0042->B:24:0x0043 BREAK  A[LOOP:0: B:13:0x0022->B:22:0x003f]] */
    public final View b() {
        Object obj;
        if (!n()) {
            obj = null;
            break;
        }
        ComponentTree componentTree = this.c.b.g;
        fjw lithoView = componentTree == null ? null : componentTree.getLithoView();
        fkb fkbVar = lithoView == null ? null : lithoView.x;
        if (fkbVar == null) {
            obj = null;
            break;
        }
        int iA = fkbVar.a();
        int i = 0;
        while (true) {
            if (i < iA) {
                fvi fviVarI = fkbVar.i(i);
                fgy fgyVar = fviVarI == null ? null : fja.a(fviVarI).c;
                if (fgyVar != null && fgyVar == this.b.e()) {
                    obj = fviVarI.a;
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    public final fgy c() {
        return this.b.c(this.d);
    }

    public final ComponentHost d() {
        fjw fjwVarH = h();
        fgy fgyVarC = c();
        if (fjwVarH == null) {
            return null;
        }
        fkb fkbVar = fjwVarH.x;
        int iA = fkbVar.a();
        for (int i = 0; i < iA; i++) {
            fvi fviVarI = fkbVar.i(i);
            fgy fgyVar = fviVarI == null ? null : fja.a(fviVarI).c;
            if (fgyVar != null) {
                boolean z = fna.a;
                if (fgyVar.g(fgyVarC)) {
                    return (ComponentHost) fviVarI.b;
                }
            }
        }
        return null;
    }

    public final fjw h() {
        ComponentTree componentTree = this.c.b.g;
        if (componentTree == null) {
            return null;
        }
        return componentTree.getLithoView();
    }

    public final fwo i() {
        return this.c.e;
    }

    public final Object j() {
        fgu fguVar = this.b.c(this.d).n;
        if (fguVar != null) {
            return fguVar.g;
        }
        return null;
    }

    public final String l() {
        fgu fguVar = this.b.c(this.d).n;
        if (fguVar == null || (fguVar.a & 2) == 0) {
            return null;
        }
        return fguVar.f;
    }

    public final List m() {
        fji fjiVar;
        if (!n()) {
            fhu fhuVarE = e(this.c, this.d - 1);
            return fhuVarE != null ? Collections.singletonList(fhuVarE) : Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int iA = this.c.a();
        int i = 0;
        while (true) {
            fjiVar = this.c;
            if (i >= iA) {
                break;
            }
            fji fjiVarK = fjiVar.k(i);
            fhu fhuVarE2 = e(fjiVarK, Math.max(0, fjiVarK.l().b() - 1));
            if (fhuVarE2 != null) {
                arrayList.add(fhuVarE2);
            }
            i++;
        }
        fji fjiVar2 = fjiVar instanceof fkd ? ((fkd) fjiVar).n : null;
        if (fjiVar2 != null) {
            int iA2 = fjiVar2.a();
            for (int i2 = 0; i2 < iA2; i2++) {
                fji fjiVarK2 = fjiVar2.k(i2);
                fhu fhuVarE3 = e(fjiVarK2, Math.max(0, fjiVarK2.l().b() - 1));
                if (fhuVarE3 != null) {
                    arrayList.add(fhuVarE3);
                }
            }
        }
        return arrayList;
    }

    public final boolean n() {
        return this.d == 0;
    }

    public final kyr o() {
        if (n()) {
            return new kyr(this.c);
        }
        return null;
    }
}
