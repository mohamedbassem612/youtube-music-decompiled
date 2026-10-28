package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eid implements eik, eis, eii {
    private final String b;
    private final ehm c;
    private final eix d;
    private final eix e;
    private final ekm f;
    private boolean g;
    private final Path a = new Path();
    private final dov h = new dov((char[]) null, (byte[]) null);

    public eid(ehm ehmVar, ele eleVar, ekm ekmVar) {
        this.b = ekmVar.a;
        this.c = ehmVar;
        eix eixVarA = ekmVar.c.a();
        this.d = eixVarA;
        eix eixVarA2 = ekmVar.b.a();
        this.e = eixVarA2;
        this.f = ekmVar;
        eleVar.i(eixVarA);
        eleVar.i(eixVarA2);
        eixVarA.h(this);
        eixVarA2.h(this);
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        eix eixVar;
        if (obj == ehr.k) {
            eixVar = this.d;
        } else if (obj != ehr.n) {
            return;
        } else {
            eixVar = this.e;
        }
        eixVar.d = enpVar;
    }

    @Override // defpackage.eis
    public final void d() {
        this.g = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            eia eiaVar = (eia) list.get(i);
            if (eiaVar instanceof eir) {
                eir eirVar = (eir) eiaVar;
                if (eirVar.e == 1) {
                    this.h.o(eirVar);
                    eirVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.eia
    public final String g() {
        return this.b;
    }

    @Override // defpackage.eik
    public final Path i() {
        boolean z = this.g;
        Path path = this.a;
        if (!z) {
            path.reset();
            ekm ekmVar = this.f;
            if (ekmVar.e) {
                this.g = true;
                return path;
            }
            PointF pointF = (PointF) this.d.e();
            float f = pointF.x / 2.0f;
            float f2 = pointF.y / 2.0f;
            path.reset();
            float f3 = f2 * 0.55228f;
            float f4 = -f;
            float f5 = -f3;
            float f6 = f3 + 0.0f;
            float f7 = 0.55228f * f;
            float f8 = -f7;
            float f9 = f7 + 0.0f;
            float f10 = -f2;
            if (ekmVar.d) {
                path.moveTo(0.0f, f10);
                path.cubicTo(f8, f10, f4, f5, f4, 0.0f);
                path.cubicTo(f4, f6, f8, f2, 0.0f, f2);
                path.cubicTo(f9, f2, f, f6, f, 0.0f);
                path.cubicTo(f, f5, f9, f10, 0.0f, f10);
            } else {
                path.moveTo(0.0f, f10);
                path.cubicTo(f9, f10, f, f5, f, 0.0f);
                path.cubicTo(f, f6, f9, f2, 0.0f, f2);
                path.cubicTo(f8, f2, f4, f6, f4, 0.0f);
                path.cubicTo(f4, f5, f8, f10, 0.0f, f10);
            }
            PointF pointF2 = (PointF) this.e.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
            this.h.p(path);
            this.g = true;
        }
        return path;
    }
}
