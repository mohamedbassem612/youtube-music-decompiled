package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elf extends ele {
    public float j;
    public boolean k;
    private eix l;
    private final List m;
    private final RectF n;
    private final RectF o;

    public elf(ehm ehmVar, elh elhVar, List list, egy egyVar) {
        ele eleVar;
        ele elfVar;
        String str;
        super(ehmVar, elhVar);
        this.m = new ArrayList();
        this.n = new RectF();
        this.o = new RectF();
        new Paint();
        this.k = true;
        eka ekaVar = elhVar.q;
        if (ekaVar != null) {
            eix eixVarA = ekaVar.a();
            this.l = eixVarA;
            i(eixVarA);
            this.l.h(this);
        } else {
            this.l = null;
        }
        agk agkVar = new agk(egyVar.h.size());
        int size = list.size() - 1;
        ele eleVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < agkVar.c(); i++) {
                    ele eleVar3 = (ele) agkVar.e(agkVar.d(i));
                    if (eleVar3 != null && (eleVar = (ele) agkVar.e(eleVar3.c.e)) != null) {
                        eleVar3.f = eleVar;
                    }
                }
                return;
            }
            elh elhVar2 = (elh) list.get(size);
            int i2 = elhVar2.t;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                elfVar = new elf(ehmVar, elhVar2, (List) egyVar.a.get(elhVar2.f), egyVar);
            } else if (i3 == 1) {
                elfVar = new elk(ehmVar, elhVar2);
            } else if (i3 == 2) {
                elfVar = new elg(ehmVar, elhVar2);
            } else if (i3 == 3) {
                elfVar = new eli(ehmVar, elhVar2);
            } else if (i3 == 4) {
                elfVar = new elj(ehmVar, elhVar2, this, egyVar);
            } else if (i3 != 5) {
                switch (i2) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    default:
                        str = "UNKNOWN";
                        break;
                }
                ((end) ene.a).a("Unknown layer type ".concat(str), null);
                elfVar = null;
            } else {
                elfVar = new eln(ehmVar, elhVar2);
            }
            if (elfVar != null) {
                agkVar.i(elfVar.c.d, elfVar);
                if (eleVar2 != null) {
                    eleVar2.e = elfVar;
                    eleVar2 = null;
                } else {
                    this.m.add(0, elfVar);
                    int i4 = elhVar2.u;
                    int i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 1 || i5 == 2) {
                        eleVar2 = elfVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.ele, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.E) {
            ejo ejoVar = new ejo(enpVar, null);
            this.l = ejoVar;
            ejoVar.h(this);
            i(this.l);
        }
    }

    @Override // defpackage.ele, defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.n;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ele) list.get(size)).c(rectF2, this.a, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.ele
    public final void j(Canvas canvas, Matrix matrix, int i) throws Throwable {
        elh elhVar = this.c;
        float f = elhVar.n;
        RectF rectF = this.o;
        rectF.set(0.0f, 0.0f, f, elhVar.o);
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                return;
            } else if ((!this.k && "__container".equals(elhVar.c)) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((ele) list.get(size)).b(canvas, matrix, i);
            }
        }
    }

    @Override // defpackage.ele
    public final void l(ejv ejvVar, int i, List list, ejv ejvVar2) {
        int i2 = 0;
        while (true) {
            List list2 = this.m;
            if (i2 >= list2.size()) {
                return;
            }
            ((ele) list2.get(i2)).e(ejvVar, i, list, ejvVar2);
            i2++;
        }
    }

    @Override // defpackage.ele
    public final void m(float f) {
        this.j = f;
        super.m(f);
        if (this.l != null) {
            float fB = this.b.a.b() + 0.01f;
            egy egyVar = this.c.b;
            f = ((((Float) this.l.e()).floatValue() * egyVar.l) - egyVar.j) / fB;
        }
        if (this.l == null) {
            elh elhVar = this.c;
            f -= elhVar.m / elhVar.b.b();
        }
        elh elhVar2 = this.c;
        float f2 = elhVar2.l;
        if (f2 != 0.0f && !"__container".equals(elhVar2.c)) {
            f /= f2;
        }
        List list = this.m;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((ele) list.get(size)).m(f);
            }
        }
    }
}
