package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eib implements eic, eik, eis, ejw {
    public final List a;
    private final Matrix b;
    private final Path c;
    private final RectF d;
    private final String e;
    private final boolean f;
    private final ehm g;
    private List h;
    private ejn i;

    public eib(ehm ehmVar, ele eleVar, String str, boolean z, List list, ekj ekjVar) {
        new ehy();
        new RectF();
        this.b = new Matrix();
        this.c = new Path();
        this.d = new RectF();
        this.e = str;
        this.g = ehmVar;
        this.f = z;
        this.a = list;
        if (ekjVar != null) {
            ejn ejnVar = new ejn(ekjVar);
            this.i = ejnVar;
            ejnVar.c(eleVar);
            this.i.d(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            eia eiaVar = (eia) list.get(size);
            if (eiaVar instanceof eih) {
                arrayList.add((eih) eiaVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((eih) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        ejn ejnVar = this.i;
        if (ejnVar != null) {
            ejnVar.e(obj, enpVar);
        }
    }

    @Override // defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        ejn ejnVar = this.i;
        if (ejnVar != null) {
            matrix2.preConcat(ejnVar.a());
            eix eixVar = this.i.e;
            i = (int) (((((eixVar == null ? 100 : ((Integer) eixVar.e()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof eic) {
                ((eic) obj).b(canvas, matrix2, i);
            }
        }
    }

    @Override // defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        ejn ejnVar = this.i;
        if (ejnVar != null) {
            matrix2.preConcat(ejnVar.a());
        }
        RectF rectF2 = this.d;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            eia eiaVar = (eia) list.get(size);
            if (eiaVar instanceof eic) {
                ((eic) eiaVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // defpackage.eis
    public final void d() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        String str = this.e;
        if (!ejvVar.e(str, i) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            ejvVar2 = ejvVar2.b(str);
            if (ejvVar.d(str, i)) {
                list.add(ejvVar2.c(this));
            }
        }
        if (!ejvVar.f(str, i)) {
            return;
        }
        int iA = i + ejvVar.a(str, i);
        int i2 = 0;
        while (true) {
            List list2 = this.a;
            if (i2 >= list2.size()) {
                return;
            }
            eia eiaVar = (eia) list2.get(i2);
            if (eiaVar instanceof ejw) {
                ((ejw) eiaVar).e(ejvVar, iA, list, ejvVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        List list3 = this.a;
        ArrayList arrayList = new ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            eia eiaVar = (eia) list3.get(size);
            eiaVar.f(arrayList, list3.subList(0, size));
            arrayList.add(eiaVar);
        }
    }

    @Override // defpackage.eia
    public final String g() {
        throw null;
    }

    final Matrix h() {
        ejn ejnVar = this.i;
        if (ejnVar != null) {
            return ejnVar.a();
        }
        Matrix matrix = this.b;
        matrix.reset();
        return matrix;
    }

    @Override // defpackage.eik
    public final Path i() {
        Matrix matrix = this.b;
        matrix.reset();
        ejn ejnVar = this.i;
        if (ejnVar != null) {
            matrix.set(ejnVar.a());
        }
        Path path = this.c;
        path.reset();
        if (!this.f) {
            List list = this.a;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                eia eiaVar = (eia) list.get(size);
                if (eiaVar instanceof eik) {
                    path.addPath(((eik) eiaVar).i(), matrix);
                }
            }
        }
        return path;
    }

    final List j() {
        if (this.h == null) {
            this.h = new ArrayList();
            int i = 0;
            while (true) {
                List list = this.a;
                if (i >= list.size()) {
                    break;
                }
                eia eiaVar = (eia) list.get(i);
                if (eiaVar instanceof eik) {
                    this.h.add((eik) eiaVar);
                }
                i++;
            }
        }
        return this.h;
    }

    public eib(ehm ehmVar, ele eleVar, ekz ekzVar, egy egyVar) {
        ekj ekjVar;
        String str = ekzVar.a;
        boolean z = ekzVar.c;
        List list = ekzVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            eia eiaVarA = ((ekn) list.get(i)).a(ehmVar, egyVar, eleVar);
            if (eiaVarA != null) {
                arrayList.add(eiaVarA);
            }
        }
        List list2 = ekzVar.b;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            ekn eknVar = (ekn) list2.get(i2);
            if (eknVar instanceof ekj) {
                ekjVar = (ekj) eknVar;
                this(ehmVar, eleVar, str, z, arrayList, ekjVar);
            }
        }
        ekjVar = null;
        this(ehmVar, eleVar, str, z, arrayList, ekjVar);
    }
}
