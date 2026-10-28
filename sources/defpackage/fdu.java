package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import app.rive.semantics.SemanticState;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fdu implements Cloneable {
    public Drawable d;
    public int e;
    public Drawable f;
    public int g;
    public boolean l;
    public Resources.Theme p;
    public boolean q;
    public boolean s;
    private int t;
    private Drawable v;
    private int w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float a = 1.0f;
    public evs b = evs.d;
    public esf c = esf.c;
    public boolean h = true;
    public int i = -1;
    public int j = -1;
    public ett k = ffc.b;
    private boolean u = true;
    public ety m = new ety();
    public Map n = new ffg();
    public Class o = Object.class;
    public boolean r = true;

    public fdu A(etg etgVar) {
        return G(fap.a, etgVar).G(fck.a, etgVar);
    }

    public fdu B(int i, int i2) {
        if (this.q) {
            return clone().B(i, i2);
        }
        this.j = i;
        this.i = i2;
        this.t |= SemanticState.LiveRegion;
        S();
        return this;
    }

    public fdu C(int i) {
        if (this.q) {
            return clone().C(i);
        }
        this.g = i;
        int i2 = this.t | SemanticState.Focused;
        this.f = null;
        this.t = i2 & (-65);
        S();
        return this;
    }

    public fdu D(Drawable drawable) {
        if (this.q) {
            return clone().D(drawable);
        }
        this.f = drawable;
        int i = this.t | 64;
        this.g = 0;
        this.t = i & (-129);
        S();
        return this;
    }

    public fdu E(esf esfVar) {
        if (this.q) {
            return clone().E(esfVar);
        }
        this.c = esfVar;
        this.t |= 8;
        S();
        return this;
    }

    final fdu F(etx etxVar) {
        if (this.q) {
            return clone().F(etxVar);
        }
        this.m.b.remove(etxVar);
        S();
        return this;
    }

    public fdu G(etx etxVar, Object obj) {
        if (this.q) {
            return clone().G(etxVar, obj);
        }
        if (etxVar == null) {
            throw new NullPointerException("Argument must not be null");
        }
        this.m.d(etxVar, obj);
        S();
        return this;
    }

    public fdu H(ett ettVar) {
        if (this.q) {
            return clone().H(ettVar);
        }
        this.k = ettVar;
        this.t |= SemanticState.ReadOnly;
        S();
        return this;
    }

    public fdu I(boolean z) {
        if (this.q) {
            return clone().I(true);
        }
        this.h = !z;
        this.t |= SemanticState.Hidden;
        S();
        return this;
    }

    public fdu J(Resources.Theme theme) {
        if (this.q) {
            return clone().J(theme);
        }
        this.p = theme;
        int i = this.t;
        if (theme != null) {
            this.t = i | 32768;
            return G(fca.a, theme);
        }
        this.t = i & (-32769);
        return F(fca.a);
    }

    public fdu K(euc eucVar) {
        return P(eucVar);
    }

    final fdu L(fam famVar, euc eucVar) {
        if (this.q) {
            return clone().L(famVar, eucVar);
        }
        x(famVar);
        return K(eucVar);
    }

    public final boolean M(fdu fduVar) {
        if (Float.compare(fduVar.a, this.a) == 0 && this.e == fduVar.e) {
            Drawable drawable = this.d;
            Drawable drawable2 = fduVar.d;
            char[] cArr = ffs.a;
            if (afxw.l(drawable, drawable2) && this.g == fduVar.g && afxw.l(this.f, fduVar.f)) {
                int i = fduVar.w;
                Drawable drawable3 = fduVar.v;
                if (afxw.l(null, null) && this.h == fduVar.h && this.i == fduVar.i && this.j == fduVar.j && this.l == fduVar.l && this.u == fduVar.u) {
                    boolean z = fduVar.y;
                    boolean z2 = fduVar.z;
                    if (this.b.equals(fduVar.b) && this.c == fduVar.c && this.m.equals(fduVar.m) && this.n.equals(fduVar.n) && this.o.equals(fduVar.o) && afxw.l(this.k, fduVar.k) && afxw.l(this.p, fduVar.p)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean N(int i) {
        return (this.t & i) != 0;
    }

    public final boolean O() {
        return ffs.i(this.j, this.i);
    }

    public final fdu P(euc eucVar) {
        if (this.q) {
            return clone().P(eucVar);
        }
        fas fasVar = new fas(eucVar);
        Q(Bitmap.class, eucVar);
        Q(Drawable.class, fasVar);
        Q(BitmapDrawable.class, fasVar);
        Q(fce.class, new fch(eucVar));
        S();
        return this;
    }

    final fdu Q(Class cls, euc eucVar) {
        if (this.q) {
            return clone().Q(cls, eucVar);
        }
        this.n.put(cls, eucVar);
        int i = this.t;
        this.u = true;
        this.r = false;
        this.t = i | 198656;
        this.l = true;
        S();
        return this;
    }

    public fdu R() {
        if (this.q) {
            return clone().R();
        }
        this.s = true;
        this.t |= 1048576;
        S();
        return this;
    }

    protected final void S() {
        if (this.x) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public void T() {
        this.x = true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof fdu) {
            return M((fdu) obj);
        }
        return false;
    }

    public int hashCode() {
        float f = this.a;
        char[] cArr = ffs.a;
        return ffs.c(this.p, ffs.c(this.k, ffs.c(this.o, ffs.c(this.n, ffs.c(this.m, ffs.c(this.c, ffs.c(this.b, ((((((((((ffs.c(null, ffs.c(this.f, (ffs.c(this.d, ((Float.floatToIntBits(f) + 527) * 31) + this.e) * 31) + this.g) * 31) * 31) + (this.h ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.l ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 961)))))));
    }

    public fdu l(fdu fduVar) {
        if (this.q) {
            return clone().l(fduVar);
        }
        int i = fduVar.t;
        if ((i & 2) != 0) {
            this.a = fduVar.a;
        }
        if ((262144 & i) != 0) {
            boolean z = fduVar.y;
            this.y = false;
        }
        if ((1048576 & i) != 0) {
            this.s = fduVar.s;
        }
        if ((i & 4) != 0) {
            this.b = fduVar.b;
        }
        if ((i & 8) != 0) {
            this.c = fduVar.c;
        }
        if ((i & 16) != 0) {
            this.d = fduVar.d;
            this.e = 0;
            this.t &= -33;
        }
        if ((fduVar.t & 32) != 0) {
            this.e = fduVar.e;
            this.d = null;
            this.t &= -17;
        }
        if ((fduVar.t & 64) != 0) {
            this.f = fduVar.f;
            this.g = 0;
            this.t &= -129;
        }
        if ((fduVar.t & SemanticState.Focused) != 0) {
            this.g = fduVar.g;
            this.f = null;
            this.t &= -65;
        }
        int i2 = fduVar.t;
        if ((i2 & SemanticState.Hidden) != 0) {
            this.h = fduVar.h;
        }
        if ((i2 & SemanticState.LiveRegion) != 0) {
            this.j = fduVar.j;
            this.i = fduVar.i;
        }
        if ((i2 & SemanticState.ReadOnly) != 0) {
            this.k = fduVar.k;
        }
        if ((i2 & SemanticState.Obscured) != 0) {
            this.o = fduVar.o;
        }
        if ((i2 & SemanticState.Multiline) != 0) {
            Drawable drawable = fduVar.v;
            this.v = null;
            this.w = 0;
            this.t &= -16385;
        }
        if ((fduVar.t & 16384) != 0) {
            int i3 = fduVar.w;
            this.w = 0;
            this.v = null;
            this.t &= -8193;
        }
        int i4 = fduVar.t;
        if ((32768 & i4) != 0) {
            this.p = fduVar.p;
        }
        if ((65536 & i4) != 0) {
            this.u = fduVar.u;
        }
        if ((131072 & i4) != 0) {
            this.l = fduVar.l;
        }
        if ((i4 & SemanticState.Modal) != 0) {
            this.n.putAll(fduVar.n);
            this.r = fduVar.r;
        }
        if ((fduVar.t & 524288) != 0) {
            boolean z2 = fduVar.z;
            this.z = false;
        }
        if (!this.u) {
            this.n.clear();
            int i5 = this.t;
            this.l = false;
            this.t = i5 & (-133121);
            this.r = true;
        }
        this.t |= fduVar.t;
        this.m.c(fduVar.m);
        S();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public fdu clone() {
        try {
            fdu fduVar = (fdu) super.clone();
            ety etyVar = new ety();
            fduVar.m = etyVar;
            etyVar.c(this.m);
            ffg ffgVar = new ffg();
            fduVar.n = ffgVar;
            ffgVar.putAll(this.n);
            fduVar.x = false;
            fduVar.q = false;
            return fduVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public fdu r() {
        if (this.x && !this.q) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.q = true;
        T();
        return this;
    }

    public fdu s() {
        return L(fam.d, new ezy());
    }

    public fdu t(Class cls) {
        if (this.q) {
            return clone().t(cls);
        }
        this.o = cls;
        this.t |= SemanticState.Obscured;
        S();
        return this;
    }

    public fdu u() {
        return G(fap.d, Boolean.FALSE);
    }

    public fdu v(evs evsVar) {
        if (this.q) {
            return clone().v(evsVar);
        }
        this.b = evsVar;
        this.t |= 4;
        S();
        return this;
    }

    public fdu w() {
        if (this.q) {
            return clone().w();
        }
        this.n.clear();
        int i = this.t;
        this.l = false;
        this.u = false;
        this.t = (i & (-133121)) | 65536;
        this.r = true;
        S();
        return this;
    }

    public fdu x(fam famVar) {
        etx etxVar = fam.g;
        if (famVar != null) {
            return G(etxVar, famVar);
        }
        throw new NullPointerException("Argument must not be null");
    }

    public fdu y(int i) {
        if (this.q) {
            return clone().y(i);
        }
        this.e = i;
        int i2 = this.t | 32;
        this.d = null;
        this.t = i2 & (-17);
        S();
        return this;
    }

    public fdu z(Drawable drawable) {
        if (this.q) {
            return clone().z(drawable);
        }
        this.d = drawable;
        int i = this.t | 16;
        this.e = 0;
        this.t = i & (-33);
        S();
        return this;
    }
}
