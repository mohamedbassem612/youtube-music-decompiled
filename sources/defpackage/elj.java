package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elj extends ele {
    private final eib j;
    private final elf k;

    public elj(ehm ehmVar, elh elhVar, elf elfVar, egy egyVar) {
        super(ehmVar, elhVar);
        this.k = elfVar;
        eib eibVar = new eib(ehmVar, this, new ekz("__container", elhVar.a, false), egyVar);
        this.j = eibVar;
        eibVar.f(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    @Override // defpackage.ele, defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.ele
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.ele
    public final void l(ejv ejvVar, int i, List list, ejv ejvVar2) {
        this.j.e(ejvVar, i, list, ejvVar2);
    }

    @Override // defpackage.ele
    public final dov q() {
        dov dovVarQ = super.q();
        return dovVarQ == null ? this.k.q() : dovVarQ;
    }

    @Override // defpackage.ele
    public final axfd r() {
        axfd axfdVarR = super.r();
        return axfdVarR == null ? this.k.r() : axfdVarR;
    }
}
