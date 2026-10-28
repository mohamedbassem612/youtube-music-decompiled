package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fji {
    public final fjd a;
    public final fhd b;
    public final fjq c;
    public final fwo e;
    public fji f;
    public boolean g;
    public final Object l;
    public fib m;
    public final List d = new ArrayList();
    public int h = -1;
    public int i = -1;
    public float j = -1.0f;
    public float k = -1.0f;

    public fji(fjd fjdVar, fhd fhdVar, fjq fjqVar, fwo fwoVar, fji fjiVar) {
        this.a = fjdVar;
        this.b = fhdVar;
        this.c = fjqVar;
        this.e = fwoVar;
        this.f = fjiVar;
        fgy fgyVarE = fjqVar.e();
        Map map = fgy.h;
        this.l = fgyVarE.r();
    }

    public static boolean q(fji fjiVar) {
        fjq fjqVar = fjiVar.c;
        fgy fgyVarE = fjiVar.l().e();
        return fgyVarE != null && fgyVarE.af() == 3;
    }

    public final int a() {
        return this.d.size();
    }

    public final int b() {
        return (int) this.e.a();
    }

    public final int c() {
        return rpi.p(this.e.l(4));
    }

    public final int d() {
        return rpi.p(this.e.l(1));
    }

    public final int e() {
        return rpi.p(this.e.l(3));
    }

    public final int f() {
        return rpi.p(this.e.l(2));
    }

    public final int g() {
        return (int) this.e.b();
    }

    public final int h() {
        float[] fArr = ((YogaNodeJNIBase) this.e).arr;
        return (int) (fArr != null ? fArr[3] : 0.0f);
    }

    public final int i() {
        float[] fArr = ((YogaNodeJNIBase) this.e).arr;
        return (int) (fArr != null ? fArr[4] : 0.0f);
    }

    public final Drawable j() {
        return this.c.m;
    }

    public final fji k(int i) {
        return (fji) this.d.get(i);
    }

    public fjq l() {
        return this.c;
    }

    public final fwl m() {
        return this.e.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [fiz, java.lang.Object] */
    public void n(int i, int i2, fkw fkwVar) {
        fjq fjqVar = this.c;
        boolean z = fna.w;
        fgy fgyVarE = fjqVar.e();
        fhd fhdVarG = fjqVar.g();
        fib fibVar = this.g ? this.m : null;
        if (fibVar != null && fibVar.g == i && fibVar.h == i2) {
            fgyVarE.av();
            fkwVar.a = (int) fibVar.e;
            fkwVar.b = (int) fibVar.f;
        } else {
            if (z) {
                fgyVarE.c();
            }
            fgyVarE.ah(fhdVarG, this, i, i2, fkwVar, this.l);
        }
    }

    public final boolean o() {
        fkl fklVar;
        fjq fjqVar = this.c;
        return (fjqVar.p == null || (fklVar = fjqVar.f) == null || !fklVar.H()) ? false : true;
    }

    public final boolean p() {
        for (int i = 0; i < 4; i++) {
            if (this.c.d[i] != 0) {
                fwo fwoVar = this.e;
                return (fwoVar.j(1) == 0.0f && fwoVar.j(2) == 0.0f && fwoVar.j(3) == 0.0f && fwoVar.j(4) == 0.0f) ? false : true;
            }
        }
        return false;
    }

    public final float r(fik fikVar, int i) {
        fwl fwlVarC = this.e.c();
        fwl fwlVar = fwl.RTL;
        int i2 = i - 1;
        int i3 = 6;
        int i4 = 5;
        if (i2 == 0) {
            i4 = 6;
            i3 = 5;
        } else if (i2 != 2) {
            throw new IllegalArgumentException("Not an horizontal padding edge: ".concat(kro.be(i)));
        }
        if (fwlVarC == fwlVar) {
            i3 = i4;
        }
        byte b = fikVar.b(i3 - 1);
        float f = b == 15 ? Float.NaN : fikVar.b[b];
        return kro.bg(f) ? fikVar.d(i) : f;
    }

    public final int s(int i) {
        return rpi.p(this.e.j(i));
    }
}
