package defpackage;

import android.content.Context;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fjq implements Cloneable {
    protected boolean A;
    public boolean B;
    public fwl E;
    public fkc F;
    public long G;
    protected int H;
    protected int I;
    protected int J;
    protected int K;
    public int L;
    public gzj M;
    private fik O;
    private boolean[] P;
    private boolean R;
    private boolean S;
    public final Context a;
    public fkl f;
    protected fip g;
    protected fip h;
    protected fip i;
    protected fip j;
    protected fip k;
    protected fip l;
    protected Drawable m;
    protected Drawable n;
    protected PathEffect o;
    public fik p;
    public String q;
    protected String r;
    protected fln s;
    public ArrayList t;
    public ArrayList u;
    public ArrayList v;
    public String w;
    public List y;
    public boolean z;
    private List N = new ArrayList(4);
    public final List b = new ArrayList(2);
    protected final int[] c = new int[4];
    protected final int[] d = new int[4];
    protected final float[] e = new float[4];
    public int C = -1;
    public int D = 0;
    private boolean Q = false;
    public Set x = new HashSet();

    public fjq(fhd fhdVar) {
        this.a = fhdVar.a;
    }

    static void A(fjd fjdVar, fjq fjqVar) {
        int iA = fjqVar.a();
        z(fjdVar, fjqVar);
        for (int i = 0; i < iA; i++) {
            A(fjdVar, fjqVar.j(i));
        }
    }

    public static void C(fjq fjqVar, fjq fjqVar2) {
        if (fjqVar.R) {
            return;
        }
        if (fjqVar2 == null) {
            fjqVar.R = true;
        } else {
            if (fjqVar2.D == 8) {
                fjqVar.O(4);
            }
            fkl fklVar = fjqVar2.f;
            if (fklVar != null && fklVar.G == 2) {
                fjqVar.l().o(false);
            }
            fjqVar.R = true;
        }
        for (int i = 0; i < fjqVar.a(); i++) {
            C(fjqVar.j(i), fjqVar);
        }
    }

    protected static void E(fme fmeVar, Drawable drawable) {
        Rect rect = new Rect();
        drawable.getPadding(rect);
        if (rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) {
            rect = null;
        }
        if (rect != null) {
            fmeVar.z(1, rect.left);
            fmeVar.z(2, rect.top);
            fmeVar.z(3, rect.right);
            fmeVar.z(4, rect.bottom);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [fiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [fiz, java.lang.Object] */
    public static fwo W(ci ciVar, fjq fjqVar, fwo fwoVar) {
        fib fibVar;
        fkj fkjVar = fkk.a;
        fwp fwpVar = new fwp(fkk.b);
        fjqVar.p(fwpVar);
        Object obj = fwoVar != null ? ((YogaNodeJNIBase) fwoVar).d : null;
        fjd fjdVar = (fjd) ciVar.a;
        fji fjiVar = (fji) obj;
        fji fjiVarH = fjqVar.h(fjdVar, fwpVar, fjiVar);
        if (fjdVar.b != null) {
            if (obj == null) {
                if (fgy.Y(fjqVar.d()) && fjdVar.c) {
                    fibVar = fjdVar.i;
                    fjdVar.i = null;
                    fjdVar.c = false;
                } else {
                    fibVar = fjdVar.h;
                }
            } else if (fjiVar.m != null) {
                fjq fjqVarL = fjiVar.l();
                int size = fjqVarL.N.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        i = -1;
                        break;
                    }
                    if (fjqVarL.N.get(i) == fjqVar) {
                        break;
                    }
                    i++;
                }
                if (i == -1 || i >= fjiVar.m.i.size()) {
                    fibVar = null;
                } else {
                    fibVar = (fib) fjiVar.m.i.get(i);
                }
            } else {
                fibVar = null;
            }
            if (fibVar != null) {
                fgy fgyVarE = fjqVar.e();
                if (gzj.bA(fjqVar.e(), fibVar.d) || (obj != null && fgy.Y(fgyVarE))) {
                    fjiVarH.m = fibVar;
                    fgy fgyVarE2 = fjqVar.e();
                    fhd fhdVarG = fjqVar.g();
                    Map map = fgy.h;
                    try {
                        fkt fktVar = fibVar.j;
                        if (!fgyVarE2.ad(fktVar != null ? fktVar.b : null, fibVar.d, fhdVarG, fgyVarE2)) {
                            fkt fktVarN = fjqVar.n();
                            fkt fktVar2 = fibVar.j;
                            fktVar2.getClass();
                            fgyVarE.E(fjiVarH.l, fibVar.k);
                            fgyVarE.F(fktVarN.d, fktVar2.d);
                            fjiVarH.g = true;
                        }
                    } catch (Exception e) {
                        gzj.bw(fhdVarG, fgyVarE2, e);
                    }
                }
            }
        }
        fwpVar.d = fjiVarH;
        for (int i2 = 0; i2 < fjqVar.a(); i2++) {
            fwo fwoVarW = W(ciVar, fjqVar.j(i2), fwpVar);
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) fwoVarW;
            if (yogaNodeJNIBase.a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (fwpVar.b == null) {
                fwpVar.b = new ArrayList(4);
            }
            fwpVar.b.add(i2, fwoVarW);
            yogaNodeJNIBase.a = fwpVar;
            YogaNative.jni_YGNodeInsertChildJNI(fwpVar.c, yogaNodeJNIBase.c, i2);
            Object obj2 = yogaNodeJNIBase.d;
            ((fji) obj2).f = fjiVarH;
            fjiVarH.d.add(obj2);
        }
        return fwpVar;
    }

    private static fip X(fip fipVar, fip fipVar2) {
        if (fipVar == null) {
            return fipVar2;
        }
        if (fipVar2 == null) {
            return fipVar;
        }
        if (!(fipVar instanceof fie)) {
            return new fie(fipVar, fipVar2);
        }
        fie fieVar = (fie) fipVar;
        fieVar.a.add(fipVar2);
        return fieVar;
    }

    public static fjq k(fjd fjdVar, fhd fhdVar, fjq fjqVar, fgy fgyVar, fkt fktVar, String str, Set set) {
        fhd fhdVar2 = fktVar.b;
        if (!(fjqVar instanceof fkc)) {
            List list = fjqVar.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!set.contains(((fkt) list.get(i)).b.m())) {
                }
            }
            String strR = fjqVar.r();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).startsWith(strR)) {
                    boolean zBm = gzj.bm();
                    if (zBm) {
                        fgyVar.c();
                        boolean z = fna.a;
                    }
                    fjq fjqVarClone = fjqVar.clone();
                    fjqVarClone.N = new ArrayList(fjqVar.a());
                    fjqVarClone.x = null;
                    z(fjdVar, fjqVar);
                    fhd fhdVarG = fjqVarClone.g();
                    int iA = fjqVar.a();
                    int i2 = 0;
                    while (i2 < iA) {
                        fjq fjqVarJ = fjqVar.j(i2);
                        int iMax = Math.max(0, fjqVarJ.b() - 1);
                        fjd fjdVar2 = fjdVar;
                        fjqVarClone.x(k(fjdVar2, fhdVarG, fjqVarJ, fjqVarJ.c(iMax), (fkt) fjqVarJ.b.get(iMax), fjqVarJ.q(iMax), set));
                        i2++;
                        fjdVar = fjdVar2;
                    }
                    if (zBm) {
                        boolean z2 = fna.a;
                    }
                    return fjqVarClone;
                }
            }
            A(fjdVar, fjqVar);
            return fjqVar;
        }
        return gzj.bd(fjdVar, fhdVar, fgyVar, true, str);
    }

    public static void v(fjd fjdVar, fjq fjqVar) {
        if (fna.a) {
            fhd fhdVarG = fjqVar.g();
            Map map = fhu.a;
            if (fjqVar.b() != 0) {
                fht fhtVar = (fht) fhu.a.get(fhu.k(fhdVarG, fjqVar.q(0)));
                if (fhtVar != null) {
                    fhtVar.b();
                }
            }
            int iA = fjqVar.a();
            for (int i = 0; i < iA; i++) {
                v(fjdVar, fjqVar.j(i));
            }
        }
    }

    static void z(fjd fjdVar, fjq fjqVar) {
        for (fkt fktVar : fjqVar.b) {
            fkz fkzVarA = fjdVar.a();
            fgy fgyVar = fktVar.a;
            if (!fgyVar.e()) {
                fkzVarA.n(fktVar.b.m());
            } else if (fgyVar.S()) {
                fkzVarA.g(fktVar.b.m(), fktVar.c);
            }
        }
    }

    public final void B(fip fipVar) {
        this.G |= 2097152;
        this.h = X(this.h, fipVar);
    }

    public final void D(fip fipVar) {
        this.G |= 4194304;
        this.j = X(this.j, fipVar);
    }

    public final void F(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.G |= 134217728;
        this.q = str;
        this.r = str2;
    }

    public final void G(fln flnVar) {
        this.G |= 4294967296L;
        this.s = flnVar;
    }

    public final void H(fip fipVar) {
        this.G |= 16777216;
        this.i = X(this.i, fipVar);
    }

    public final void I(fip fipVar) {
        this.G |= 2147483648L;
        this.l = X(this.l, fipVar);
    }

    public final void J(fip fipVar) {
        this.G |= 1048576;
        this.g = X(this.g, fipVar);
    }

    public final void K() {
        this.B = true;
    }

    public final boolean L() {
        return !TextUtils.isEmpty(this.q);
    }

    public final boolean M() {
        fwl fwlVar = this.E;
        return fwlVar == null || fwlVar == fwl.INHERIT;
    }

    public final void N() {
        this.G |= 8589934592L;
    }

    public final void O(int i) {
        this.G |= 128;
        this.D = i;
    }

    public final void P(fip fipVar) {
        this.G |= 8388608;
        this.k = X(this.k, fipVar);
    }

    public final void Q(int i) {
        if (i != -1) {
            this.C = 0;
        }
    }

    public final void R() {
        this.G |= 536870912;
        K();
    }

    public final void S() {
        this.G |= 1073741824;
        K();
    }

    public void T(int[] iArr, int[] iArr2, float[] fArr) {
        this.G |= 268435456;
        System.arraycopy(iArr, 0, this.c, 0, 4);
        System.arraycopy(iArr2, 0, this.d, 0, 4);
        System.arraycopy(fArr, 0, this.e, 0, 4);
        this.o = null;
    }

    public final void U() {
        this.G |= 256;
        this.A = false;
    }

    public final void V() {
        this.G |= 524288;
        this.n = null;
    }

    public final int a() {
        return this.N.size();
    }

    public final int b() {
        return this.b.size();
    }

    public final fgy c(int i) {
        return m(i).a;
    }

    public final fgy d() {
        List list = this.b;
        return ((fkt) list.get(list.size() - 1)).a;
    }

    public final fgy e() {
        return ((fkt) this.b.get(0)).a;
    }

    public final fhd f(int i) {
        return m(i).b;
    }

    public final fhd g() {
        return ((fkt) this.b.get(0)).b;
    }

    public fji h(fjd fjdVar, fwo fwoVar, fji fjiVar) {
        return new fji(fjdVar, g(), this, fwoVar, fjiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final fjq clone() {
        try {
            fjq fjqVar = (fjq) super.clone();
            fjqVar.Q = true;
            return fjqVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final fjq j(int i) {
        return (fjq) this.N.get(i);
    }

    public final fkl l() {
        fkl fklVar;
        if (this.S) {
            fklVar = this.f;
            if (fklVar == null) {
                fklVar = new fkl();
            }
            return fklVar;
        }
        this.S = true;
        fklVar = new fkl();
        fkl fklVar2 = this.f;
        if (fklVar2 != null) {
            fklVar2.c(fklVar);
        }
        this.f = fklVar;
        return fklVar;
    }

    public final fkt m(int i) {
        return (fkt) this.b.get(i);
    }

    public final fkt n() {
        return (fkt) this.b.get(0);
    }

    protected fme o(fwo fwoVar) {
        return new fme(fwoVar);
    }

    public fme p(fwo fwoVar) {
        int i;
        int i2;
        fme fmeVarO = o(fwoVar);
        fwl fwlVar = this.E;
        if (fwlVar != null) {
            fwoVar.e(fwlVar);
        }
        int i3 = this.L;
        if (i3 != 0) {
            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(((YogaNodeJNIBase) fwoVar).c, i3 - 1);
        }
        int i4 = this.H;
        if (i4 != 0) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(((YogaNodeJNIBase) fwoVar).c, i4 - 1);
        }
        int i5 = this.I;
        if (i5 != 0) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(((YogaNodeJNIBase) fwoVar).c, i5 - 1);
        }
        int i6 = this.J;
        if (i6 != 0) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(((YogaNodeJNIBase) fwoVar).c, i6 - 1);
        }
        int i7 = this.K;
        if (i7 != 0) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(((YogaNodeJNIBase) fwoVar).c, i7 - 1);
        }
        gzj gzjVar = this.M;
        if (gzjVar != null) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) fwoVar;
            yogaNodeJNIBase.e = gzjVar;
            YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.c, true);
        }
        Iterator it = this.b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            fgy fgyVar = ((fkt) it.next()).a;
            if (this.F == null || !fgy.Y(fgyVar)) {
                fgu fguVar = fgyVar.n;
                if (fguVar != null) {
                    Drawable drawable = fguVar.e;
                    if (drawable != null) {
                        E(fmeVarO, drawable);
                    }
                    fgs fgsVar = fguVar.d;
                    if (fgsVar != null) {
                        if ((fgsVar.a & 1) != 0) {
                            fmeVarO.s(fgsVar.b);
                        }
                        if ((fgsVar.a & 2) != 0) {
                            fmeVarO.r(fgsVar.c);
                        }
                        if ((fgsVar.a & 4) != 0) {
                            fmeVarO.q(fgsVar.d);
                        }
                        if ((fgsVar.a & 8) != 0) {
                            fmeVarO.p(fgsVar.e);
                        }
                        if ((fgsVar.a & 16) != 0) {
                            fmeVarO.m(fgsVar.f);
                        }
                        if ((fgsVar.a & 32) != 0) {
                            fmeVarO.l(fgsVar.g);
                        }
                        if ((fgsVar.a & 64) != 0) {
                            fmeVarO.h(fgsVar.h);
                        }
                        if ((fgsVar.a & SemanticState.Focused) != 0) {
                            fmeVarO.g(fgsVar.i);
                        }
                        if ((fgsVar.a & SemanticState.Hidden) != 0) {
                            fmeVarO.o(fgsVar.j);
                        }
                        if ((fgsVar.a & SemanticState.LiveRegion) != 0) {
                            fmeVarO.n(fgsVar.k);
                        }
                        if ((fgsVar.a & SemanticState.ReadOnly) != 0) {
                            fmeVarO.k(fgsVar.l);
                        }
                        if ((fgsVar.a & SemanticState.Modal) != 0) {
                            fmeVarO.j(fgsVar.m);
                        }
                        if ((fgsVar.a & SemanticState.Obscured) != 0) {
                            fmeVarO.i(fgsVar.s);
                        }
                        if ((fgsVar.a & SemanticState.Multiline) != 0) {
                            fmeVarO.t(fgsVar.C);
                        }
                        if ((fgsVar.a & 16384) != 0) {
                            fmeVarO.C();
                        }
                        if ((fgsVar.a & 32768) != 0) {
                            fmeVarO.e(fgsVar.n);
                        }
                        if ((fgsVar.a & 65536) != 0) {
                            fmeVarO.f(fgsVar.o);
                        }
                        if ((fgsVar.a & 131072) != 0) {
                            fmeVarO.d(fgsVar.p);
                        }
                        if ((fgsVar.a & 262144) != 0) {
                            fmeVarO.c(fgsVar.q);
                        }
                        if ((fgsVar.a & 524288) != 0) {
                            fmeVarO.b(fgsVar.r);
                        }
                        if ((fgsVar.a & 1048576) != 0) {
                            fmeVarO.u(fgsVar.D);
                        }
                        if ((fgsVar.a & 2097152) != 0) {
                            for (int i8 = 0; i8 < 9; i8++) {
                                float fC = fgsVar.t.c(i8);
                                if (!kro.bg(fC)) {
                                    fmeVarO.B(kro.bf(i8), (int) fC);
                                }
                            }
                        }
                        if ((fgsVar.a & 4194304) != 0) {
                            for (int i9 = 0; i9 < 9; i9++) {
                                float fC2 = fgsVar.y.c(i9);
                                if (!kro.bg(fC2)) {
                                    fmeVarO.A(kro.bf(i9), fC2);
                                }
                            }
                        }
                        if ((fgsVar.a & 8388608) != 0) {
                            for (int i10 = 0; i10 < 9; i10++) {
                                float fC3 = fgsVar.w.c(i10);
                                if (!kro.bg(fC3)) {
                                    fmeVarO.z(kro.bf(i10), (int) fC3);
                                }
                            }
                        }
                        if ((fgsVar.a & 16777216) != 0) {
                            for (int i11 = 0; i11 < 9; i11++) {
                                float fC4 = fgsVar.x.c(i11);
                                if (!kro.bg(fC4)) {
                                    fmeVarO.y(kro.bf(i11), fC4);
                                }
                            }
                        }
                        if ((fgsVar.a & 33554432) != 0) {
                            for (int i12 = 0; i12 < 9; i12++) {
                                float fC5 = fgsVar.u.c(i12);
                                if (!kro.bg(fC5)) {
                                    fmeVarO.x(kro.bf(i12), (int) fC5);
                                }
                            }
                        }
                        if ((fgsVar.a & 67108864) != 0) {
                            while (i < 9) {
                                float fC6 = fgsVar.v.c(i);
                                if (!kro.bg(fC6)) {
                                    fmeVarO.w(kro.bf(i), fC6);
                                }
                                i++;
                            }
                        }
                        if (!kro.bg(fgsVar.z)) {
                            fmeVarO.v(1, fgsVar.z);
                        }
                        if (!kro.bg(fgsVar.A)) {
                            fmeVarO.v(2, fgsVar.A);
                        }
                        if (!kro.bg(fgsVar.B)) {
                            fmeVarO.v(3, fgsVar.B);
                        }
                    }
                }
            } else {
                fkc fkcVar = this.F;
                fkl fklVar = fkcVar.f;
                if (fklVar != null) {
                    u(fklVar);
                }
                if ((this.G & 128) == 0 || this.D == 0) {
                    O(fkcVar.D);
                }
                if ((fkcVar.G & 256) != 0) {
                    boolean z = fkcVar.A;
                    U();
                }
                if ((fkcVar.G & 8589934592L) != 0) {
                    N();
                }
                if ((fkcVar.G & 262144) != 0) {
                    w(fkcVar.m);
                }
                if ((fkcVar.G & 524288) != 0) {
                    Drawable drawable2 = fkcVar.n;
                    V();
                }
                if (fkcVar.B) {
                    K();
                }
                if ((fkcVar.G & 1048576) != 0) {
                    J(fkcVar.g);
                }
                if ((fkcVar.G & 2097152) != 0) {
                    B(fkcVar.h);
                }
                if ((fkcVar.G & 4194304) != 0) {
                    D(fkcVar.j);
                }
                if ((fkcVar.G & 8388608) != 0) {
                    P(fkcVar.k);
                }
                if ((fkcVar.G & 16777216) != 0) {
                    H(fkcVar.i);
                }
                if ((fkcVar.G & 2147483648L) != 0) {
                    I(fkcVar.l);
                }
                String str = fkcVar.w;
                if (str != null) {
                    this.w = str;
                }
                int[] iArr = fkcVar.N;
                if (iArr != null) {
                    int[] iArr2 = fkcVar.d;
                    float[] fArr = fkcVar.e;
                    PathEffect pathEffect = fkcVar.o;
                    T(iArr, iArr2, fArr);
                }
                if ((fkcVar.G & 134217728) != 0) {
                    F(fkcVar.q, fkcVar.r);
                }
                if ((fkcVar.G & 4294967296L) != 0) {
                    G(fkcVar.s);
                }
                if ((fkcVar.G & 536870912) != 0) {
                    R();
                }
                if ((fkcVar.G & 1073741824) != 0) {
                    S();
                }
                if (fkcVar.C != -1) {
                    Q(0);
                }
                fik fikVar = fkcVar.O;
                boolean[] zArr = fkcVar.P;
                this.O = fikVar;
                this.P = zArr;
                Drawable drawable3 = this.m;
                if (drawable3 != null) {
                    E(fmeVarO, drawable3);
                }
            }
        }
        if ((this.G & 268435456) != 0) {
            int i13 = 0;
            while (i13 < 4) {
                if (i13 == 0) {
                    i2 = 1;
                } else if (i13 != 1) {
                    i2 = i13 != 2 ? 4 : 3;
                } else {
                    i2 = 2;
                }
                fmeVarO.a(i2, this.c[i13]);
                i13++;
            }
        }
        if (this.O != null) {
            while (i < 9) {
                float fC7 = this.O.c(i);
                if (!kro.bg(fC7)) {
                    int iBf = kro.bf(i);
                    boolean[] zArr2 = this.P;
                    if (zArr2 == null || !zArr2[iBf - 1]) {
                        fmeVarO.z(iBf, (int) fC7);
                    } else {
                        fmeVarO.y(iBf, fC7);
                    }
                }
                i++;
            }
        }
        this.z = fmeVarO.e;
        return fmeVarO;
    }

    public final String q(int i) {
        return f(i).m();
    }

    public final String r() {
        List list = this.b;
        return ((fkt) list.get(list.size() - 1)).b.m();
    }

    public final String s() {
        return ((fkt) this.b.get(0)).b.m();
    }

    public final void t(fgy fgyVar) {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(fgyVar);
    }

    public final void u(fkl fklVar) {
        if (this.S || this.f != null) {
            fklVar.c(l());
        } else {
            this.f = fklVar;
        }
    }

    public final void w(Drawable drawable) {
        this.G |= 262144;
        this.m = drawable;
    }

    public final void x(fjq fjqVar) {
        if (fjqVar != null) {
            this.N.add(this.N.size(), fjqVar);
        }
    }

    public final void y(fjd fjdVar, fhd fhdVar, fgy fgyVar) {
        if (fgyVar != null) {
            x(gzj.bd(fjdVar, fhdVar, fgyVar, false, null));
        }
    }
}
