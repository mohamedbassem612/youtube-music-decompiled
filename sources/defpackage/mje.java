package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mje extends fkx {

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int A;

    @fmt(a = 6)
    @fmu(a = fmv.a)
    List a;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Drawable b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean c;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    boolean d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Float e;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Float f;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Float g;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    String q;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float r;

    @fmt(a = 13)
    @fmu(a = fmv.i)
    public Float s;

    @fmt(a = 13)
    @fmu(a = fmv.i)
    public Float t;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float u;

    @fmt(a = 13)
    @fmu(a = fmv.g)
    public Integer v;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int w;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int x;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    int z;

    public mje() {
        super("Container");
    }

    public static mjd aE(fhd fhdVar) {
        return new mjd(fhdVar, new mje());
    }

    @Override // defpackage.fkx
    protected final fgy aC(fhd fhdVar) {
        fgq fgqVar;
        fgw fgwVar;
        float fFloatValue;
        fkr fkrVar;
        fkr fkrVar2;
        fgq fgqVar2;
        int i = this.A;
        List list = this.a;
        ntt nttVar = (ntt) fhdVar.k(ntt.class);
        int i2 = i - 1;
        Drawable drawable = this.b;
        int i3 = this.x;
        int i4 = this.z;
        int i5 = this.y;
        int i6 = this.w;
        Integer num = this.v;
        float f = this.u;
        float f2 = this.r;
        Float f3 = this.s;
        Float f4 = this.t;
        String str = this.q;
        Float f5 = this.f;
        Float f6 = this.g;
        Float f7 = this.e;
        boolean z = this.c;
        boolean z2 = this.d;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            int i7 = fgr.g;
            fgqVar = new fgq(fhdVar, new fgr());
            fgqVar.a.b = true;
        } else if (i2 == 2) {
            int i8 = fks.g;
            fkrVar = new fkr(fhdVar, new fks());
        } else if (i2 != 3) {
            int i9 = fgr.g;
            fgqVar2 = new fgq(fhdVar, new fgr());
        } else {
            int i10 = fks.g;
            fkrVar2 = new fkr(fhdVar, new fks());
            fkrVar2.aa();
        }
        if (list != null) {
            fgwVar = fgqVar;
            fgwVar = fkrVar;
            fgwVar = fkrVar2;
            fgwVar = fgqVar2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fgwVar.f(((fgy) it.next()).l());
            }
        }
        if (i3 != 0) {
            fgwVar.d(i3);
        }
        if (i4 != 0) {
            fgwVar.h(i4);
        }
        if (i5 != 0) {
            fgwVar.g(i5);
        }
        if (i6 != 0) {
            fgwVar.c(i6);
        }
        if (f5 != null) {
            fgwVar.i(1, f5.floatValue());
        }
        if (f6 != null) {
            fgwVar.i(2, f6.floatValue());
        }
        if (f7 != null) {
            fgwVar.i(3, f7.floatValue());
        }
        if (str != null && nttVar != null) {
            nttVar.c = str;
        }
        if (drawable != null) {
            fgwVar.o(drawable);
        }
        if (f <= 0.5f) {
            return fgwVar.a();
        }
        int i11 = fgr.g;
        fgq fgqVar3 = new fgq(fhdVar, new fgr());
        fgqVar3.j(fgwVar);
        fpy fpyVar = new fpy(fhdVar, new fpz());
        int iIntValue = num != null ? num.intValue() : 922746880;
        fpz fpzVar = fpyVar.a;
        fpzVar.g = iIntValue;
        fpzVar.e = 50331648;
        fpzVar.a = f2;
        fpzVar.f = f;
        fpzVar.b = z2;
        fpyVar.U(3);
        fpyVar.T(9, 0);
        if (f3 == null) {
            if (f4 == null) {
                double d = f;
                double d2 = 1.5d * d;
                if (z) {
                    fgwVar.Q(7, (int) Math.ceil(d));
                    double d3 = f / 2.0f;
                    fgwVar.Q(2, (int) Math.ceil(d3));
                    fgwVar.Q(4, (int) Math.ceil(d2));
                    int i12 = drawable instanceof mqr ? ((mqr) drawable).a : 0;
                    fgq fgqVar4 = new fgq(fhdVar, new fgr());
                    fun funVar = new fun(fhdVar, new fuo());
                    funVar.Q(7, (int) Math.ceil(d));
                    funVar.Q(2, (int) Math.ceil(d3));
                    funVar.Q(4, (int) Math.ceil(d2));
                    fuo fuoVar = funVar.a;
                    fuoVar.a = i12;
                    fuoVar.b = f2;
                    funVar.U(3);
                    funVar.T(9, 0);
                    fgqVar4.j(funVar);
                    fgqVar4.j(fgwVar);
                    fgqVar4.j(fpyVar);
                    return fgqVar4.a;
                }
                fpyVar = fpyVar;
                fgqVar3.Q(7, (int) Math.ceil(d));
                fgqVar3.Q(2, (int) Math.ceil(f / 2.0f));
                fgqVar3.Q(4, (int) Math.ceil(d2));
            } else {
                fFloatValue = 0.0f;
            }
            fgq fgqVar5 = new fgq(fhdVar, new fgr());
            fgqVar5.j(fgqVar3);
            fgqVar5.j(fpyVar);
            return fgqVar5.a;
        }
        fFloatValue = f3.floatValue();
        float fFloatValue2 = f4 != null ? f4.floatValue() : 0.0f;
        fgqVar3.Q(1, fqa.b(f, fFloatValue));
        fgqVar3.Q(3, fqa.c(f, fFloatValue));
        fgqVar3.Q(2, fqa.d(f, fFloatValue2));
        fgqVar3.Q(4, fqa.a(f, fFloatValue2));
        fpzVar.c = fFloatValue;
        fpzVar.d = fFloatValue2;
        fgq fgqVar6 = new fgq(fhdVar, new fgr());
        fgqVar6.j(fgqVar3);
        fgqVar6.j(fpyVar);
        return fgqVar6.a;
    }
}
