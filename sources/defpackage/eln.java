package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eln extends ele {
    private eix A;
    private eix B;
    private eix C;
    private eix D;
    private final StringBuilder j;
    private final RectF k;
    private final Matrix l;
    private final Paint m;
    private final Paint n;
    private final Map o;
    private final agk p;
    private final List q;
    private final ejm r;
    private final ehm s;
    private final egy t;
    private eix u;
    private eix v;
    private eix w;
    private eix x;
    private eix y;
    private eix z;

    public eln(ehm ehmVar, elh elhVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super(ehmVar, elhVar);
        this.j = new StringBuilder(2);
        this.k = new RectF();
        this.l = new Matrix();
        this.m = new ell(null);
        this.n = new ell();
        this.o = new HashMap();
        this.p = new agk(10);
        this.q = new ArrayList();
        this.s = ehmVar;
        this.t = elhVar.b;
        ejm ejmVarA = elhVar.p.a();
        this.r = ejmVarA;
        ejmVarA.h(this);
        i(ejmVarA);
        jnm jnmVar = elhVar.x;
        if (jnmVar != null && (obj4 = jnmVar.a) != null) {
            eix eixVarA = ((ejz) obj4).a();
            this.u = eixVarA;
            eixVarA.h(this);
            i(this.u);
        }
        if (jnmVar != null && (obj3 = jnmVar.d) != null) {
            eix eixVarA2 = ((ejz) obj3).a();
            this.w = eixVarA2;
            eixVarA2.h(this);
            i(this.w);
        }
        if (jnmVar != null && (obj2 = jnmVar.b) != null) {
            eix eixVarA3 = ((eka) obj2).a();
            this.y = eixVarA3;
            eixVarA3.h(this);
            i(this.y);
        }
        if (jnmVar == null || (obj = jnmVar.c) == null) {
            return;
        }
        eix eixVarA4 = ((eka) obj).a();
        this.A = eixVarA4;
        eixVarA4.h(this);
        i(this.A);
    }

    private final elm s(int i) {
        List list = this.q;
        for (int size = list.size(); size < i; size++) {
            list.add(new elm());
        }
        return (elm) list.get(i - 1);
    }

    private final List t(String str, float f, ejt ejtVar, float f2, float f3, boolean z) {
        float f4;
        float fMeasureText;
        int i = 0;
        float f5 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f6 = 0.0f;
        int i4 = 0;
        float f7 = 0.0f;
        while (i < str.length()) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (z) {
                f4 = 0.0f;
                eju ejuVar = (eju) ahc.a(this.t.f, (((cCharAt * 31) + ((String) ejtVar.a).hashCode()) * 31) + ((String) ejtVar.c).hashCode());
                if (ejuVar != null) {
                    float f8 = ((float) ejuVar.b) * f2;
                    ThreadLocal threadLocal = enm.a;
                    fMeasureText = f8 * Resources.getSystem().getDisplayMetrics().density;
                }
                i = i5;
            } else {
                f4 = 0.0f;
                fMeasureText = this.m.measureText(str.substring(i, i5));
            }
            float f9 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f9;
            } else {
                if (z2) {
                    f6 = f9;
                    i4 = i;
                } else {
                    f6 += f9;
                }
                z2 = false;
            }
            f5 += f9;
            if (f > f4 && f5 >= f && cCharAt != ' ') {
                i2++;
                elm elmVarS = s(i2);
                if (i4 == i3) {
                    String strSubstring = str.substring(i3, i);
                    String strTrim = strSubstring.trim();
                    elmVarS.a(strTrim, (f5 - f9) - ((strTrim.length() - strSubstring.length()) * f7));
                    f5 = f9;
                    f6 = f5;
                    i3 = i;
                    i4 = i3;
                } else {
                    String strSubstring2 = str.substring(i3, i4 - 1);
                    String strTrim2 = strSubstring2.trim();
                    elmVarS.a(strTrim2, ((f5 - f6) - ((strSubstring2.length() - strTrim2.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
            i = i5;
        }
        if (f5 > 0.0f) {
            i2++;
            s(i2).a(str.substring(i3), f5);
        }
        return this.q.subList(0, i2);
    }

    private final boolean u(Canvas canvas, ejs ejsVar, int i, float f) {
        PointF pointF = ejsVar.k;
        PointF pointF2 = ejsVar.l;
        float fA = enm.a();
        float f2 = (i * ejsVar.e * fA) + (pointF == null ? 0.0f : (ejsVar.e * fA) + pointF.y);
        if (this.s.l && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + ejsVar.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = ejsVar.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            canvas.translate(f3, f2);
        } else if (i3 == 1) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i3 == 2) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
        return true;
    }

    private static final void v(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private static final void w(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static final List x(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // defpackage.ele, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.a) {
            eix eixVar = this.v;
            if (eixVar != null) {
                k(eixVar);
            }
            ejo ejoVar = new ejo(enpVar, null);
            this.v = ejoVar;
            ejoVar.h(this);
            i(this.v);
            return;
        }
        if (obj == ehr.b) {
            eix eixVar2 = this.x;
            if (eixVar2 != null) {
                k(eixVar2);
            }
            ejo ejoVar2 = new ejo(enpVar, null);
            this.x = ejoVar2;
            ejoVar2.h(this);
            i(this.x);
            return;
        }
        if (obj == ehr.s) {
            eix eixVar3 = this.z;
            if (eixVar3 != null) {
                k(eixVar3);
            }
            ejo ejoVar3 = new ejo(enpVar, null);
            this.z = ejoVar3;
            ejoVar3.h(this);
            i(this.z);
            return;
        }
        if (obj == ehr.t) {
            eix eixVar4 = this.B;
            if (eixVar4 != null) {
                k(eixVar4);
            }
            ejo ejoVar4 = new ejo(enpVar, null);
            this.B = ejoVar4;
            ejoVar4.h(this);
            i(this.B);
            return;
        }
        if (obj == ehr.F) {
            eix eixVar5 = this.C;
            if (eixVar5 != null) {
                k(eixVar5);
            }
            ejo ejoVar5 = new ejo(enpVar, null);
            this.C = ejoVar5;
            ejoVar5.h(this);
            i(this.C);
            return;
        }
        if (obj != ehr.M) {
            if (obj == ehr.O) {
                this.r.d = new ejl(new eno(), enpVar, new ejs());
                return;
            }
            return;
        }
        eix eixVar6 = this.D;
        if (eixVar6 != null) {
            k(eixVar6);
        }
        ejo ejoVar6 = new ejo(enpVar, null);
        this.D = ejoVar6;
        ejoVar6.h(this);
        i(this.D);
    }

    @Override // defpackage.ele, defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        egy egyVar = this.t;
        rectF.set(0.0f, 0.0f, egyVar.i.width(), egyVar.i.height());
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0377 A[PHI: r23
      0x0377: PHI (r23v1 int) = (r23v0 int), (r23v0 int), (r23v2 int), (r23v2 int), (r23v3 int), (r23v3 int), (r23v4 int), (r23v4 int) binds: [B:95:0x0308, B:97:0x0310, B:99:0x031a, B:101:0x0322, B:106:0x0337, B:108:0x033f, B:113:0x0354, B:115:0x035c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:153:0x042a  */
    /* JADX WARN: Code duplicated, block: B:154:0x042c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x042e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0431  */
    /* JADX WARN: Code duplicated, block: B:179:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:182:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:186:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:188:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:191:0x0504  */
    /* JADX WARN: Code duplicated, block: B:194:0x051a  */
    /* JADX WARN: Code duplicated, block: B:210:0x056b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0572  */
    /* JADX WARN: Code duplicated, block: B:213:0x057b A[LOOP:9: B:212:0x0579->B:213:0x057b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x059c  */
    /* JADX WARN: Code duplicated, block: B:218:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:236:0x05bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:54:0x0167  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:59:0x019b  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d2 A[LOOP:4: B:64:0x01d0->B:65:0x01d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x022b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0232  */
    /* JADX WARN: Code duplicated, block: B:77:0x025e  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, nxl] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, nxl] */
    @Override // defpackage.ele
    public final void j(Canvas canvas, Matrix matrix, int i) {
        float f;
        float f2;
        Object obj;
        Object obj2;
        int i2;
        int i3;
        float fFloatValue;
        float f3;
        List listX;
        int size;
        int i4;
        int i5;
        PointF pointF;
        float f4;
        List listT;
        int i6;
        elm elmVar;
        int i7;
        String str;
        int length;
        int iCodePointAt;
        int iCharCount;
        ejt ejtVar;
        agk agkVar;
        long j;
        StringBuilder sb;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        float fFloatValue2;
        float f5;
        int i8;
        int i9;
        PointF pointF2;
        float f6;
        float f7;
        int i10;
        List listT2;
        int i11;
        elm elmVar2;
        int i12;
        String str2;
        int i13;
        eju ejuVar;
        Map map;
        List list;
        int size2;
        ArrayList arrayList;
        int i14;
        List list2;
        int i15;
        Path pathI;
        eln elnVar = this;
        ejs ejsVar = (ejs) elnVar.r.e();
        egy egyVar = elnVar.t;
        ejt ejtVar2 = (ejt) egyVar.d.get(ejsVar.b);
        if (ejtVar2 != null) {
            canvas.save();
            canvas.concat(matrix);
            eix eixVar = elnVar.v;
            if (eixVar != null) {
                elnVar.m.setColor(((Integer) eixVar.e()).intValue());
            } else {
                eix eixVar2 = elnVar.u;
                Paint paint = elnVar.m;
                if (eixVar2 != null) {
                    paint.setColor(((Integer) eixVar2.e()).intValue());
                } else {
                    paint.setColor(ejsVar.g);
                }
            }
            eix eixVar3 = elnVar.x;
            if (eixVar3 != null) {
                elnVar.n.setColor(((Integer) eixVar3.e()).intValue());
            } else {
                eix eixVar4 = elnVar.w;
                Paint paint2 = elnVar.n;
                if (eixVar4 != null) {
                    paint2.setColor(((Integer) eixVar4.e()).intValue());
                } else {
                    paint2.setColor(ejsVar.h);
                }
            }
            eix eixVar5 = elnVar.g.e;
            int iIntValue = eixVar5 == null ? 100 : ((Integer) eixVar5.e()).intValue();
            Paint paint3 = elnVar.m;
            int i16 = (((iIntValue * 255) / 100) * i) / 255;
            paint3.setAlpha(i16);
            Paint paint4 = elnVar.n;
            paint4.setAlpha(i16);
            eix eixVar6 = elnVar.z;
            if (eixVar6 != null) {
                paint4.setStrokeWidth(((Float) eixVar6.e()).floatValue());
            } else {
                eix eixVar7 = elnVar.y;
                if (eixVar7 != null) {
                    paint4.setStrokeWidth(((Float) eixVar7.e()).floatValue());
                } else {
                    float f8 = ejsVar.i;
                    ThreadLocal threadLocal = enm.a;
                    paint4.setStrokeWidth(f8 * Resources.getSystem().getDisplayMetrics().density);
                }
            }
            ehm ehmVar = elnVar.s;
            if (ehmVar.a.f.c() > 0) {
                eix eixVar8 = elnVar.C;
                float fFloatValue3 = (eixVar8 != null ? ((Float) eixVar8.e()).floatValue() : ejsVar.c) / 100.0f;
                enm.b(matrix);
                List listX2 = x(ejsVar.a);
                float f9 = ejsVar.d / 10.0f;
                eix eixVar9 = elnVar.B;
                if (eixVar9 != null) {
                    fFloatValue2 = ((Float) eixVar9.e()).floatValue();
                } else {
                    eix eixVar10 = elnVar.A;
                    if (eixVar10 != null) {
                        fFloatValue2 = ((Float) eixVar10.e()).floatValue();
                    }
                    f5 = f9;
                    i8 = 0;
                    i9 = -1;
                    for (int size3 = listX2.size(); i8 < size3; size3 = i10) {
                        String str3 = (String) listX2.get(i8);
                        pointF2 = ejsVar.l;
                        if (pointF2 == null) {
                            f6 = 0.0f;
                        } else {
                            f6 = pointF2.x;
                        }
                        int i17 = i8;
                        f7 = fFloatValue3;
                        float f10 = f6;
                        i10 = size3;
                        listT2 = elnVar.t(str3, f10, ejtVar2, f7, f5, true);
                        i11 = 0;
                        while (i11 < listT2.size()) {
                            elmVar2 = (elm) listT2.get(i11);
                            i12 = i9 + 1;
                            canvas.save();
                            List list3 = listT2;
                            if (elnVar.u(canvas, ejsVar, i12, elmVar2.b)) {
                                str2 = elmVar2.a;
                                i13 = 0;
                                while (i13 < str2.length()) {
                                    String str4 = str2;
                                    ejuVar = (eju) ahc.a(egyVar.f, (((str2.charAt(i13) * 31) + ((String) ejtVar2.a).hashCode()) * 31) + ((String) ejtVar2.c).hashCode());
                                    if (ejuVar == null) {
                                        f5 = f5;
                                        i13 = i13;
                                        i10 = i10;
                                        i12 = i12;
                                    } else {
                                        map = elnVar.o;
                                        if (map.containsKey(ejuVar)) {
                                            list2 = (List) map.get(ejuVar);
                                        } else {
                                            list = ejuVar.a;
                                            size2 = list.size();
                                            arrayList = new ArrayList(size2);
                                            i14 = 0;
                                            while (i14 < size2) {
                                                arrayList.add(new eib(ehmVar, elnVar, (ekz) list.get(i14), egyVar));
                                                i14++;
                                                size2 = size2;
                                                list = list;
                                            }
                                            map.put(ejuVar, arrayList);
                                            list2 = arrayList;
                                        }
                                        i15 = 0;
                                        while (i15 < list2.size()) {
                                            pathI = ((eib) list2.get(i15)).i();
                                            pathI.computeBounds(elnVar.k, false);
                                            Matrix matrix2 = elnVar.l;
                                            matrix2.reset();
                                            List list4 = list2;
                                            matrix2.preTranslate(0.0f, (-ejsVar.f) * Resources.getSystem().getDisplayMetrics().density);
                                            matrix2.preScale(f7, f7);
                                            pathI.transform(matrix2);
                                            if (ejsVar.j) {
                                                w(pathI, paint3, canvas);
                                                w(pathI, paint4, canvas);
                                            } else {
                                                w(pathI, paint4, canvas);
                                                w(pathI, paint3, canvas);
                                            }
                                            i15++;
                                            list2 = list4;
                                        }
                                        canvas.translate((((float) ejuVar.b) * f7 * Resources.getSystem().getDisplayMetrics().density) + f5, 0.0f);
                                    }
                                    i13++;
                                    str2 = str4;
                                    f5 = f5;
                                    i10 = i10;
                                    i12 = i12;
                                }
                            }
                            canvas.restore();
                            i11++;
                            listT2 = list3;
                            f5 = f5;
                            i10 = i10;
                            i9 = i12;
                        }
                        i8 = i17 + 1;
                        fFloatValue3 = f7;
                    }
                }
                f9 += fFloatValue2;
                f5 = f9;
                i8 = 0;
                i9 = -1;
                while (i8 < size3) {
                    String str5 = (String) listX2.get(i8);
                    pointF2 = ejsVar.l;
                    if (pointF2 == null) {
                        f6 = 0.0f;
                    } else {
                        f6 = pointF2.x;
                    }
                    int i18 = i8;
                    f7 = fFloatValue3;
                    float f11 = f6;
                    i10 = size3;
                    listT2 = elnVar.t(str5, f11, ejtVar2, f7, f5, true);
                    i11 = 0;
                    while (i11 < listT2.size()) {
                        elmVar2 = (elm) listT2.get(i11);
                        i12 = i9 + 1;
                        canvas.save();
                        List list5 = listT2;
                        if (elnVar.u(canvas, ejsVar, i12, elmVar2.b)) {
                            str2 = elmVar2.a;
                            i13 = 0;
                            while (i13 < str2.length()) {
                                String str6 = str2;
                                ejuVar = (eju) ahc.a(egyVar.f, (((str2.charAt(i13) * 31) + ((String) ejtVar2.a).hashCode()) * 31) + ((String) ejtVar2.c).hashCode());
                                if (ejuVar == null) {
                                    f5 = f5;
                                    i13 = i13;
                                    i10 = i10;
                                    i12 = i12;
                                } else {
                                    map = elnVar.o;
                                    if (map.containsKey(ejuVar)) {
                                        list2 = (List) map.get(ejuVar);
                                    } else {
                                        list = ejuVar.a;
                                        size2 = list.size();
                                        arrayList = new ArrayList(size2);
                                        i14 = 0;
                                        while (i14 < size2) {
                                            arrayList.add(new eib(ehmVar, elnVar, (ekz) list.get(i14), egyVar));
                                            i14++;
                                            size2 = size2;
                                            list = list;
                                        }
                                        map.put(ejuVar, arrayList);
                                        list2 = arrayList;
                                    }
                                    i15 = 0;
                                    while (i15 < list2.size()) {
                                        pathI = ((eib) list2.get(i15)).i();
                                        pathI.computeBounds(elnVar.k, false);
                                        Matrix matrix3 = elnVar.l;
                                        matrix3.reset();
                                        List list6 = list2;
                                        matrix3.preTranslate(0.0f, (-ejsVar.f) * Resources.getSystem().getDisplayMetrics().density);
                                        matrix3.preScale(f7, f7);
                                        pathI.transform(matrix3);
                                        if (ejsVar.j) {
                                            w(pathI, paint3, canvas);
                                            w(pathI, paint4, canvas);
                                        } else {
                                            w(pathI, paint4, canvas);
                                            w(pathI, paint3, canvas);
                                        }
                                        i15++;
                                        list2 = list6;
                                    }
                                    canvas.translate((((float) ejuVar.b) * f7 * Resources.getSystem().getDisplayMetrics().density) + f5, 0.0f);
                                }
                                i13++;
                                str2 = str6;
                                f5 = f5;
                                i10 = i10;
                                i12 = i12;
                            }
                        }
                        canvas.restore();
                        i11++;
                        listT2 = list5;
                        f5 = f5;
                        i10 = i10;
                        i9 = i12;
                    }
                    i8 = i18 + 1;
                    fFloatValue3 = f7;
                }
            } else {
                eix eixVar11 = elnVar.D;
                if (eixVar11 == null || (obj = (Typeface) eixVar11.e()) == null) {
                    ejp ejpVarF = ehmVar.f();
                    Typeface typeface = null;
                    if (ejpVarF != null) {
                        Object obj3 = ejtVar2.a;
                        Object obj4 = ejtVar2.c;
                        ejy ejyVar = ejpVarF.a;
                        ejyVar.a = obj3;
                        ejyVar.b = obj4;
                        Map map2 = ejpVarF.b;
                        Typeface typeface2 = (Typeface) map2.get(ejyVar);
                        if (typeface2 == null) {
                            Map map3 = ejpVarF.c;
                            Object objCreate = (Typeface) map3.get(obj3);
                            if (objCreate != null) {
                                f = 10.0f;
                                f2 = 100.0f;
                                obj2 = obj4;
                            } else {
                                Object obj5 = ejtVar2.b;
                                f = 10.0f;
                                eol eolVar = ejpVarF.f;
                                if (eolVar != null) {
                                    String str7 = (String) obj4;
                                    f2 = 100.0f;
                                    String str8 = (String) obj5;
                                    String str9 = ahno.Z(str7).toLowerCase(Locale.ROOT) + ' ' + ahno.Z(str8).toLowerCase(Locale.ROOT);
                                    int i19 = 800;
                                    if (ket.X(str9, mia.a) || ket.X(str9, mia.b)) {
                                        i2 = i19;
                                    } else {
                                        i19 = 900;
                                        if (ket.X(str9, mia.c) || ket.X(str9, mia.d)) {
                                            i2 = i19;
                                        } else if (ket.X(str9, mia.e)) {
                                            i2 = 700;
                                        } else {
                                            i19 = 600;
                                            if (ket.X(str9, mia.f) || ket.X(str9, mia.g)) {
                                                i2 = i19;
                                            } else if (ket.X(str9, mia.h)) {
                                                i2 = 500;
                                            } else {
                                                i19 = 200;
                                                if (ket.X(str9, mia.i) || ket.X(str9, mia.j)) {
                                                    i2 = i19;
                                                } else if (ket.X(str9, mia.k)) {
                                                    i2 = 300;
                                                } else {
                                                    i2 = ket.X(str9, mia.l) ? 100 : 400;
                                                }
                                            }
                                        }
                                    }
                                    obj2 = obj4;
                                    String str10 = ahno.Z(str7).toLowerCase(Locale.ROOT) + ' ' + ahno.Z(str8).toLowerCase(Locale.ROOT);
                                    String str11 = (String) obj3;
                                    Typeface typefaceB = eolVar.b.b((Context) eolVar.a, str11, i2, ket.X(str10, mia.m) || ket.X(str10, mia.n));
                                    if (typefaceB == null) {
                                        typefaceB = Typeface.DEFAULT;
                                    }
                                    typeface = typefaceB;
                                    if (typeface == null) {
                                        eol eolVar2 = ejpVarF.f;
                                        Typeface typefaceB2 = eolVar2.b.b((Context) eolVar2.a, str11, 400, false);
                                        typeface = typefaceB2 == null ? Typeface.DEFAULT : typefaceB2;
                                    }
                                } else {
                                    f2 = 100.0f;
                                    obj2 = obj4;
                                }
                                Object obj6 = ejtVar2.d;
                                if (obj6 != null) {
                                    objCreate = obj6;
                                } else {
                                    Typeface typefaceCreateFromAsset = typeface == null ? Typeface.createFromAsset(ejpVarF.d, "fonts/" + ((String) obj3) + ejpVarF.e) : typeface;
                                    map3.put(obj3, typefaceCreateFromAsset);
                                    objCreate = typefaceCreateFromAsset;
                                }
                            }
                            String str12 = (String) obj2;
                            boolean zContains = str12.contains("Italic");
                            boolean zContains2 = str12.contains("Bold");
                            if (zContains) {
                                if (zContains2) {
                                    i3 = 3;
                                } else {
                                    zContains2 = false;
                                    if (zContains) {
                                        i3 = 2;
                                    } else if (zContains2) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                }
                            } else if (zContains) {
                                i3 = 2;
                            } else if (zContains2) {
                                i3 = 1;
                            } else {
                                i3 = 0;
                            }
                            Typeface typeface3 = (Typeface) objCreate;
                            if (typeface3.getStyle() != i3) {
                                objCreate = Typeface.create(typeface3, i3);
                            }
                            obj = objCreate;
                            map2.put(ejyVar, obj);
                        } else {
                            f = 10.0f;
                            f2 = 100.0f;
                            obj = typeface2;
                        }
                    } else {
                        f = 10.0f;
                        f2 = 100.0f;
                        obj = null;
                    }
                    if (obj == null) {
                        obj = ejtVar2.d;
                    }
                } else {
                    f = 10.0f;
                    f2 = 100.0f;
                }
                if (obj != null) {
                    String str13 = ejsVar.a;
                    paint3.setTypeface((Typeface) obj);
                    eix eixVar12 = elnVar.C;
                    float fFloatValue4 = eixVar12 != null ? ((Float) eixVar12.e()).floatValue() : ejsVar.c;
                    ThreadLocal threadLocal2 = enm.a;
                    paint3.setTextSize(Resources.getSystem().getDisplayMetrics().density * fFloatValue4);
                    paint4.setTypeface(paint3.getTypeface());
                    paint4.setTextSize(paint3.getTextSize());
                    float f12 = ejsVar.d / f;
                    eix eixVar13 = elnVar.B;
                    if (eixVar13 != null) {
                        fFloatValue = ((Float) eixVar13.e()).floatValue();
                    } else {
                        eix eixVar14 = elnVar.A;
                        if (eixVar14 != null) {
                            fFloatValue = ((Float) eixVar14.e()).floatValue();
                        }
                        f3 = ((f12 * Resources.getSystem().getDisplayMetrics().density) * fFloatValue4) / f2;
                        listX = x(str13);
                        size = listX.size();
                        i4 = 0;
                        i5 = -1;
                        while (i4 < size) {
                            String str14 = (String) listX.get(i4);
                            pointF = ejsVar.l;
                            if (pointF == null) {
                                f4 = 0.0f;
                            } else {
                                f4 = pointF.x;
                            }
                            listT = elnVar.t(str14, f4, ejtVar2, 0.0f, f3, false);
                            i6 = 0;
                            while (i6 < listT.size()) {
                                elmVar = (elm) listT.get(i6);
                                i7 = i5 + 1;
                                canvas.save();
                                if (elnVar.u(canvas, ejsVar, i7, elmVar.b)) {
                                    str = elmVar.a;
                                    length = 0;
                                    while (length < str.length()) {
                                        iCodePointAt = str.codePointAt(length);
                                        List list7 = listT;
                                        iCharCount = length + Character.charCount(iCodePointAt);
                                        int i20 = i6;
                                        while (true) {
                                            if (iCharCount < str.length()) {
                                                ejtVar = ejtVar2;
                                                break;
                                            }
                                            iCodePointAt2 = str.codePointAt(iCharCount);
                                            ejtVar = ejtVar2;
                                            if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                                break;
                                            }
                                            iCharCount += Character.charCount(iCodePointAt2);
                                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                            ejtVar2 = ejtVar;
                                        }
                                        agkVar = elnVar.p;
                                        float f13 = f3;
                                        int i21 = i7;
                                        j = iCodePointAt;
                                        if (agkVar.a(j) >= 0) {
                                            string = (String) agkVar.e(j);
                                        } else {
                                            sb = elnVar.j;
                                            sb.setLength(0);
                                            iCharCount2 = length;
                                            while (iCharCount2 < iCharCount) {
                                                int i22 = iCharCount;
                                                int iCodePointAt3 = str.codePointAt(iCharCount2);
                                                sb.appendCodePoint(iCodePointAt3);
                                                iCharCount2 += Character.charCount(iCodePointAt3);
                                                iCharCount = i22;
                                            }
                                            string = sb.toString();
                                            agkVar.i(j, string);
                                        }
                                        length += string.length();
                                        if (ejsVar.j) {
                                            v(string, paint3, canvas);
                                            v(string, paint4, canvas);
                                        } else {
                                            v(string, paint4, canvas);
                                            v(string, paint3, canvas);
                                        }
                                        canvas.translate(paint3.measureText(string) + f13, 0.0f);
                                        elnVar = this;
                                        listT = list7;
                                        f3 = f13;
                                        i6 = i20;
                                        i7 = i21;
                                        ejtVar2 = ejtVar;
                                    }
                                }
                                canvas.restore();
                                listT = listT;
                                i6++;
                                f3 = f3;
                                i5 = i7;
                                ejtVar2 = ejtVar2;
                                elnVar = this;
                            }
                            i4++;
                            elnVar = this;
                            ejtVar2 = ejtVar2;
                        }
                    }
                    f12 += fFloatValue;
                    f3 = ((f12 * Resources.getSystem().getDisplayMetrics().density) * fFloatValue4) / f2;
                    listX = x(str13);
                    size = listX.size();
                    i4 = 0;
                    i5 = -1;
                    while (i4 < size) {
                        String str15 = (String) listX.get(i4);
                        pointF = ejsVar.l;
                        if (pointF == null) {
                            f4 = 0.0f;
                        } else {
                            f4 = pointF.x;
                        }
                        listT = elnVar.t(str15, f4, ejtVar2, 0.0f, f3, false);
                        i6 = 0;
                        while (i6 < listT.size()) {
                            elmVar = (elm) listT.get(i6);
                            i7 = i5 + 1;
                            canvas.save();
                            if (elnVar.u(canvas, ejsVar, i7, elmVar.b)) {
                                str = elmVar.a;
                                length = 0;
                                while (length < str.length()) {
                                    iCodePointAt = str.codePointAt(length);
                                    List list8 = listT;
                                    iCharCount = length + Character.charCount(iCodePointAt);
                                    int i23 = i6;
                                    while (true) {
                                        if (iCharCount < str.length()) {
                                            ejtVar = ejtVar2;
                                            break;
                                        }
                                        iCodePointAt2 = str.codePointAt(iCharCount);
                                        ejtVar = ejtVar2;
                                        if (Character.getType(iCodePointAt2) == 16) {
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        ejtVar2 = ejtVar;
                                    }
                                    agkVar = elnVar.p;
                                    float f14 = f3;
                                    int i24 = i7;
                                    j = iCodePointAt;
                                    if (agkVar.a(j) >= 0) {
                                        string = (String) agkVar.e(j);
                                    } else {
                                        sb = elnVar.j;
                                        sb.setLength(0);
                                        iCharCount2 = length;
                                        while (iCharCount2 < iCharCount) {
                                            int i25 = iCharCount;
                                            int iCodePointAt4 = str.codePointAt(iCharCount2);
                                            sb.appendCodePoint(iCodePointAt4);
                                            iCharCount2 += Character.charCount(iCodePointAt4);
                                            iCharCount = i25;
                                        }
                                        string = sb.toString();
                                        agkVar.i(j, string);
                                    }
                                    length += string.length();
                                    if (ejsVar.j) {
                                        v(string, paint3, canvas);
                                        v(string, paint4, canvas);
                                    } else {
                                        v(string, paint4, canvas);
                                        v(string, paint3, canvas);
                                    }
                                    canvas.translate(paint3.measureText(string) + f14, 0.0f);
                                    elnVar = this;
                                    listT = list8;
                                    f3 = f14;
                                    i6 = i23;
                                    i7 = i24;
                                    ejtVar2 = ejtVar;
                                }
                            }
                            canvas.restore();
                            listT = listT;
                            i6++;
                            f3 = f3;
                            i5 = i7;
                            ejtVar2 = ejtVar2;
                            elnVar = this;
                        }
                        i4++;
                        elnVar = this;
                        ejtVar2 = ejtVar2;
                    }
                }
            }
            canvas.restore();
        }
    }
}
