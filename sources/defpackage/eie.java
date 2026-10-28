package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eie implements eic, eis, eii {
    float a;
    private final Path b;
    private final Paint c;
    private final ele d;
    private final String e;
    private final boolean f;
    private final List g;
    private final eix h;
    private final eix i;
    private eix j;
    private final ehm k;
    private eix l;
    private eja m;

    public eie(ehm ehmVar, ele eleVar, eky ekyVar) {
        Path path = new Path();
        this.b = path;
        ehy ehyVar = new ehy(1);
        this.c = ehyVar;
        this.g = new ArrayList();
        this.d = eleVar;
        this.e = ekyVar.b;
        this.f = ekyVar.e;
        this.k = ehmVar;
        if (eleVar.q() != null) {
            eix eixVarA = ((eka) eleVar.q().a).a();
            this.l = eixVarA;
            eixVarA.h(this);
            eleVar.i(this.l);
        }
        if (eleVar.r() != null) {
            this.m = new eja(this, eleVar, eleVar.r());
        }
        if (ekyVar.c == null) {
            this.h = null;
            this.i = null;
            return;
        }
        int i = eleVar.c.v - 1;
        int i2 = 0;
        if (i != 0) {
            if (i == 16) {
                i2 = 13;
            } else if (i == 2) {
                i2 = 15;
            } else if (i == 3) {
                i2 = 16;
            } else if (i == 4) {
                i2 = 17;
            } else if (i == 5) {
                i2 = 18;
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ehyVar.setBlendMode(gb$$ExternalSyntheticApiModelOutline0.m(i2 != 0 ? aup.k(i2) : null));
        } else if (i2 != 0) {
            PorterDuff.Mode modeE = auq.e(i2);
            ehyVar.setXfermode(modeE != null ? new PorterDuffXfermode(modeE) : null);
        } else {
            ehyVar.setXfermode(null);
        }
        path.setFillType(ekyVar.a);
        eix eixVarA2 = ekyVar.c.a();
        this.h = eixVarA2;
        eixVarA2.h(this);
        eleVar.i(eixVarA2);
        eix eixVarA3 = ekyVar.d.a();
        this.i = eixVarA3;
        eixVarA3.h(this);
        eleVar.i(eixVarA3);
    }

    @Override // defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        eja ejaVar;
        eja ejaVar2;
        eja ejaVar3;
        eja ejaVar4;
        eja ejaVar5;
        eix eixVar;
        if (obj == ehr.a) {
            eixVar = this.h;
        } else {
            if (obj != ehr.d) {
                if (obj == ehr.K) {
                    eix eixVar2 = this.j;
                    if (eixVar2 != null) {
                        this.d.k(eixVar2);
                    }
                    ejo ejoVar = new ejo(enpVar, null);
                    this.j = ejoVar;
                    ejoVar.h(this);
                    this.d.i(this.j);
                    return;
                }
                if (obj == ehr.j) {
                    eix eixVar3 = this.l;
                    if (eixVar3 != null) {
                        eixVar3.d = enpVar;
                        return;
                    }
                    ejo ejoVar2 = new ejo(enpVar, null);
                    this.l = ejoVar2;
                    ejoVar2.h(this);
                    this.d.i(this.l);
                    return;
                }
                if (obj == ehr.e && (ejaVar5 = this.m) != null) {
                    ejaVar5.b(enpVar);
                    return;
                }
                if (obj == ehr.G && (ejaVar4 = this.m) != null) {
                    ejaVar4.f(enpVar);
                    return;
                }
                if (obj == ehr.H && (ejaVar3 = this.m) != null) {
                    ejaVar3.c(enpVar);
                    return;
                }
                if (obj == ehr.I && (ejaVar2 = this.m) != null) {
                    ejaVar2.e(enpVar);
                    return;
                } else {
                    if (obj != ehr.J || (ejaVar = this.m) == null) {
                        return;
                    }
                    ejaVar.g(enpVar);
                    return;
                }
            }
            eixVar = this.i;
        }
        eixVar.d = enpVar;
    }

    @Override // defpackage.eic
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.f) {
            return;
        }
        eix eixVar = this.h;
        eix eixVar2 = this.i;
        int iK = ((eiy) eixVar).k();
        float fIntValue = ((Integer) eixVar2.e()).intValue();
        Paint paint = this.c;
        int i2 = enh.a;
        int iMin = Math.min(255, (int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f));
        int i3 = 0;
        paint.setColor((Math.max(0, iMin) << 24) | (iK & 16777215));
        eix eixVar3 = this.j;
        if (eixVar3 != null) {
            paint.setColorFilter((ColorFilter) eixVar3.e());
        }
        eix eixVar4 = this.l;
        if (eixVar4 != null) {
            float fFloatValue = ((Float) eixVar4.e()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(this.d.h(fFloatValue));
            }
            this.a = fFloatValue;
        }
        eja ejaVar = this.m;
        if (ejaVar != null) {
            ejaVar.a(paint);
        }
        Path path = this.b;
        path.reset();
        while (true) {
            List list = this.g;
            if (i3 >= list.size()) {
                canvas.drawPath(path, paint);
                return;
            } else {
                path.addPath(((eik) list.get(i3)).i(), matrix);
                i3++;
            }
        }
    }

    @Override // defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            List list = this.g;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((eik) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.eis
    public final void d() {
        this.k.invalidateSelf();
    }

    @Override // defpackage.ejw
    public final void e(ejv ejvVar, int i, List list, ejv ejvVar2) {
        enh.d(ejvVar, i, list, ejvVar2, this);
    }

    @Override // defpackage.eia
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            eia eiaVar = (eia) list2.get(i);
            if (eiaVar instanceof eik) {
                this.g.add((eik) eiaVar);
            }
        }
    }

    @Override // defpackage.eia
    public final String g() {
        return this.e;
    }
}
