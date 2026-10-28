package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ejk extends eix {
    protected enp e;
    protected enp f;
    private final PointF g;
    private final PointF h;
    private final eix i;
    private final eix j;

    public ejk(eix eixVar, eix eixVar2) {
        super(Collections.EMPTY_LIST);
        this.g = new PointF();
        this.h = new PointF();
        this.i = eixVar;
        this.j = eixVar2;
        j(this.c);
    }

    @Override // defpackage.eix
    public final /* synthetic */ Object e() {
        return k(0.0f);
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        return k(f);
    }

    @Override // defpackage.eix
    public final void j(float f) {
        eix eixVar = this.i;
        eixVar.j(f);
        eix eixVar2 = this.j;
        eixVar2.j(f);
        this.g.set(((Float) eixVar.e()).floatValue(), ((Float) eixVar2.e()).floatValue());
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((eis) list.get(i)).d();
            i++;
        }
    }

    final PointF k(float f) {
        float f2;
        Float f3;
        eix eixVar;
        enn ennVarD;
        eix eixVar2;
        enn ennVarD2;
        Float f4 = null;
        if (this.e == null || (ennVarD2 = (eixVar2 = this.i).d()) == null) {
            f2 = f;
            f3 = null;
        } else {
            float fB = eixVar2.b();
            Float f5 = ennVarD2.h;
            f2 = f;
            f3 = (Float) this.e.b(ennVarD2.g, f5 == null ? ennVarD2.g : f5.floatValue(), (Float) ennVarD2.b, (Float) ennVarD2.c, f, f, fB);
        }
        if (this.f != null && (ennVarD = (eixVar = this.j).d()) != null) {
            float fB2 = eixVar.b();
            Float f6 = ennVarD.h;
            f4 = (Float) this.f.b(ennVarD.g, f6 == null ? ennVarD.g : f6.floatValue(), (Float) ennVarD.b, (Float) ennVarD.c, f2, f2, fB2);
        }
        PointF pointF = this.h;
        if (f3 == null) {
            pointF.set(this.g.x, 0.0f);
        } else {
            pointF.set(f3.floatValue(), 0.0f);
        }
        PointF pointF2 = this.h;
        if (f4 == null) {
            pointF2.set(pointF2.x, this.g.y);
        } else {
            pointF2.set(pointF2.x, f4.floatValue());
        }
        return this.h;
    }
}
