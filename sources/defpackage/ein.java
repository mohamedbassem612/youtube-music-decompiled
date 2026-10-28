package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ein implements eic, eik, eih, eis, eii {
    private final Matrix a = new Matrix();
    private final Path b = new Path();
    private final ehm c;
    private final ele d;
    private final String e;
    private final boolean f;
    private final eix g;
    private final eix h;
    private final ejn i;
    private eib j;

    public ein(ehm ehmVar, ele eleVar, ekv ekvVar) {
        this.c = ehmVar;
        this.d = eleVar;
        this.e = ekvVar.a;
        this.f = ekvVar.e;
        eix eixVarA = ekvVar.b.a();
        this.g = eixVarA;
        eleVar.i(eixVarA);
        eixVarA.h(this);
        eix eixVarA2 = ekvVar.c.a();
        this.h = eixVarA2;
        eleVar.i(eixVarA2);
        eixVarA2.h(this);
        ejn ejnVar = new ejn(ekvVar.d);
        this.i = ejnVar;
        ejnVar.c(eleVar);
        ejnVar.d(this);
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        eix eixVar;
        if (this.i.e(obj, enpVar)) {
            return;
        }
        if (obj == ehr.u) {
            eixVar = this.g;
        } else if (obj != ehr.v) {
            return;
        } else {
            eixVar = this.h;
        }
        eixVar.d = enpVar;
    }

    @Override // defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        ejn ejnVar = this.i;
        float fFloatValue3 = ((Float) ejnVar.h.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) ejnVar.i.e()).floatValue() / 100.0f;
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(ejnVar.b(f + fFloatValue2));
            int i3 = enh.a;
            this.j.b(canvas, matrix2, (int) (i * (((f / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.j.c(rectF, matrix, z);
    }

    @Override // defpackage.eis
    public final void d() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
        for (int i2 = 0; i2 < this.j.a.size(); i2++) {
            eia eiaVar = (eia) this.j.a.get(i2);
            if (eiaVar instanceof eii) {
                enh.d(ejvVar, i, list, ejvVar2, (eii) eiaVar);
            }
        }
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        this.j.f(list, list2);
    }

    @Override // defpackage.eia
    public final String g() {
        return this.e;
    }

    @Override // defpackage.eih
    public final void h(ListIterator listIterator) {
        if (this.j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((eia) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.j = new eib(this.c, this.d, "Repeater", this.f, arrayList, null);
        }
    }

    @Override // defpackage.eik
    public final Path i() {
        Path pathI = this.j.i();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        int i = (int) fFloatValue;
        while (true) {
            i--;
            if (i < 0) {
                return path;
            }
            Matrix matrix = this.a;
            matrix.set(this.i.b(i + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
