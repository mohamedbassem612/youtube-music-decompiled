package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejn {
    public eix a;
    public eix b;
    public eix c;
    public eix d;
    public eix e;
    public ejb f;
    public ejb g;
    public eix h;
    public eix i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;
    private final boolean o;

    public ejn(ekj ekjVar) {
        ekd ekdVar = ekjVar.a;
        this.a = ekdVar == null ? null : ekdVar.a();
        ekk ekkVar = ekjVar.b;
        this.b = ekkVar == null ? null : ekkVar.a();
        ekf ekfVar = ekjVar.c;
        this.c = ekfVar == null ? null : ekfVar.a();
        eka ekaVar = ekjVar.d;
        this.d = ekaVar == null ? null : ekaVar.a();
        eka ekaVar2 = ekjVar.f;
        this.f = (ejb) (ekaVar2 == null ? null : ekaVar2.a());
        this.o = ekjVar.j;
        if (this.f != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        eka ekaVar3 = ekjVar.g;
        this.g = (ejb) (ekaVar3 == null ? null : ekaVar3.a());
        ekc ekcVar = ekjVar.e;
        if (ekcVar != null) {
            this.e = ekcVar.a();
        }
        eka ekaVar4 = ekjVar.h;
        if (ekaVar4 != null) {
            this.h = ekaVar4.a();
        } else {
            this.h = null;
        }
        eka ekaVar5 = ekjVar.i;
        if (ekaVar5 != null) {
            this.i = ekaVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        enq enqVar;
        PointF pointF2;
        Matrix matrix = this.j;
        matrix.reset();
        eix eixVar = this.b;
        if (eixVar != null && (pointF2 = (PointF) eixVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        if (!this.o) {
            eix eixVar2 = this.d;
            if (eixVar2 != null) {
                float fFloatValue = eixVar2 instanceof ejo ? ((Float) eixVar2.e()).floatValue() : ((ejb) eixVar2).k();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (eixVar != null) {
            float f = eixVar.c;
            PointF pointF3 = (PointF) eixVar.e();
            float f2 = pointF3.x;
            float f3 = pointF3.y;
            eixVar.j(1.0E-4f + f);
            PointF pointF4 = (PointF) eixVar.e();
            eixVar.j(f);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f3, pointF4.x - f2)));
        }
        ejb ejbVar = this.f;
        if (ejbVar != null) {
            ejb ejbVar2 = this.g;
            float fCos = ejbVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-ejbVar2.k()) + 90.0f));
            ejb ejbVar3 = this.g;
            float fSin = ejbVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-ejbVar3.k()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(ejbVar.k()));
            f();
            float[] fArr = this.n;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f4 = -fSin;
            fArr[3] = f4;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.k;
            matrix2.setValues(fArr);
            f();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.l;
            matrix3.setValues(fArr);
            f();
            fArr[0] = fCos;
            fArr[1] = f4;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.m;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        eix eixVar3 = this.c;
        if (eixVar3 != null && (enqVar = (enq) eixVar3.e()) != null) {
            float f5 = enqVar.a;
            if (f5 != 1.0f || enqVar.b != 1.0f) {
                matrix.preScale(f5, enqVar.b);
            }
        }
        eix eixVar4 = this.a;
        if (eixVar4 != null && (pointF = (PointF) eixVar4.e()) != null && (pointF.x != 0.0f || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f) {
        float f2;
        float f3;
        eix eixVar = this.b;
        PointF pointF = eixVar == null ? null : (PointF) eixVar.e();
        eix eixVar2 = this.c;
        enq enqVar = eixVar2 == null ? null : (enq) eixVar2.e();
        Matrix matrix = this.j;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (enqVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(enqVar.a, d), (float) Math.pow(enqVar.b, d));
        }
        eix eixVar3 = this.d;
        if (eixVar3 != null) {
            float fFloatValue = ((Float) eixVar3.e()).floatValue();
            eix eixVar4 = this.a;
            PointF pointF2 = eixVar4 != null ? (PointF) eixVar4.e() : null;
            float f4 = fFloatValue * f;
            if (pointF2 == null) {
                f3 = 0.0f;
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
                f3 = pointF2.y;
            }
            matrix.preRotate(f4, f2, f3);
        }
        return matrix;
    }

    public final void c(ele eleVar) {
        eleVar.i(this.e);
        eleVar.i(this.h);
        eleVar.i(this.i);
        eleVar.i(this.a);
        eleVar.i(this.b);
        eleVar.i(this.c);
        eleVar.i(this.d);
        eleVar.i(this.f);
        eleVar.i(this.g);
    }

    public final void d(eis eisVar) {
        eix eixVar = this.e;
        if (eixVar != null) {
            eixVar.h(eisVar);
        }
        eix eixVar2 = this.h;
        if (eixVar2 != null) {
            eixVar2.h(eisVar);
        }
        eix eixVar3 = this.i;
        if (eixVar3 != null) {
            eixVar3.h(eisVar);
        }
        eix eixVar4 = this.a;
        if (eixVar4 != null) {
            eixVar4.h(eisVar);
        }
        eix eixVar5 = this.b;
        if (eixVar5 != null) {
            eixVar5.h(eisVar);
        }
        eix eixVar6 = this.c;
        if (eixVar6 != null) {
            eixVar6.h(eisVar);
        }
        eix eixVar7 = this.d;
        if (eixVar7 != null) {
            eixVar7.h(eisVar);
        }
        ejb ejbVar = this.f;
        if (ejbVar != null) {
            ejbVar.h(eisVar);
        }
        ejb ejbVar2 = this.g;
        if (ejbVar2 != null) {
            ejbVar2.h(eisVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118 A[ORIG_RETURN, RETURN] */
    public final boolean e(Object obj, enp enpVar) {
        ejb ejbVar;
        ejb ejbVar2;
        eix eixVar;
        eix eixVar2;
        eix eixVar3;
        eix eixVar4;
        eix eixVar5;
        eix eixVar6;
        if (obj == ehr.f) {
            eix eixVar7 = this.a;
            if (eixVar7 == null) {
                this.a = new ejo(enpVar, new PointF());
            } else {
                eixVar7.d = enpVar;
            }
        } else if (obj == ehr.g) {
            eix eixVar8 = this.b;
            if (eixVar8 == null) {
                this.b = new ejo(enpVar, new PointF());
            } else {
                eixVar8.d = enpVar;
            }
        } else if (obj == ehr.h) {
            eix eixVar9 = this.b;
            if (eixVar9 instanceof ejk) {
                ejk ejkVar = (ejk) eixVar9;
                enp enpVar2 = ejkVar.e;
                ejkVar.e = enpVar;
            } else if (obj == ehr.i) {
                eixVar6 = this.b;
                if (eixVar6 instanceof ejk) {
                    ejk ejkVar2 = (ejk) eixVar6;
                    enp enpVar3 = ejkVar2.f;
                    ejkVar2.f = enpVar;
                } else if (obj == ehr.o) {
                    eixVar5 = this.c;
                    if (eixVar5 == null) {
                        this.c = new ejo(enpVar, new enq(1.0f, 1.0f));
                    } else {
                        eixVar5.d = enpVar;
                    }
                } else if (obj == ehr.p) {
                    eixVar4 = this.d;
                    if (eixVar4 == null) {
                        this.d = new ejo(enpVar, Float.valueOf(0.0f));
                    } else {
                        eixVar4.d = enpVar;
                    }
                } else if (obj == ehr.c) {
                    eixVar3 = this.e;
                    if (eixVar3 == null) {
                        this.e = new ejo(enpVar, 100);
                    } else {
                        eixVar3.d = enpVar;
                    }
                } else if (obj == ehr.C) {
                    eixVar2 = this.h;
                    if (eixVar2 == null) {
                        this.h = new ejo(enpVar, Float.valueOf(100.0f));
                    } else {
                        eixVar2.d = enpVar;
                    }
                } else if (obj == ehr.D) {
                    eixVar = this.i;
                    if (eixVar == null) {
                        this.i = new ejo(enpVar, Float.valueOf(100.0f));
                    } else {
                        eixVar.d = enpVar;
                    }
                } else if (obj == ehr.q) {
                    ejbVar2 = this.f;
                    if (ejbVar2 == null) {
                        ejbVar2 = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                        this.f = ejbVar2;
                    }
                    ejbVar2.d = enpVar;
                } else {
                    if (obj == ehr.r) {
                        return false;
                    }
                    ejbVar = this.g;
                    if (ejbVar == null) {
                        ejbVar = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                        this.g = ejbVar;
                    }
                    ejbVar.d = enpVar;
                }
            } else if (obj == ehr.o) {
                eixVar5 = this.c;
                if (eixVar5 == null) {
                    this.c = new ejo(enpVar, new enq(1.0f, 1.0f));
                } else {
                    eixVar5.d = enpVar;
                }
            } else if (obj == ehr.p) {
                eixVar4 = this.d;
                if (eixVar4 == null) {
                    this.d = new ejo(enpVar, Float.valueOf(0.0f));
                } else {
                    eixVar4.d = enpVar;
                }
            } else if (obj == ehr.c) {
                eixVar3 = this.e;
                if (eixVar3 == null) {
                    this.e = new ejo(enpVar, 100);
                } else {
                    eixVar3.d = enpVar;
                }
            } else if (obj == ehr.C) {
                eixVar2 = this.h;
                if (eixVar2 == null) {
                    this.h = new ejo(enpVar, Float.valueOf(100.0f));
                } else {
                    eixVar2.d = enpVar;
                }
            } else if (obj == ehr.D) {
                eixVar = this.i;
                if (eixVar == null) {
                    this.i = new ejo(enpVar, Float.valueOf(100.0f));
                } else {
                    eixVar.d = enpVar;
                }
            } else if (obj == ehr.q) {
                ejbVar2 = this.f;
                if (ejbVar2 == null) {
                    ejbVar2 = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                    this.f = ejbVar2;
                }
                ejbVar2.d = enpVar;
            } else {
                if (obj == ehr.r) {
                    return false;
                }
                ejbVar = this.g;
                if (ejbVar == null) {
                    ejbVar = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                    this.g = ejbVar;
                }
                ejbVar.d = enpVar;
            }
        } else if (obj == ehr.i) {
            eixVar6 = this.b;
            if (eixVar6 instanceof ejk) {
                ejk ejkVar3 = (ejk) eixVar6;
                enp enpVar4 = ejkVar3.f;
                ejkVar3.f = enpVar;
            } else if (obj == ehr.o) {
                eixVar5 = this.c;
                if (eixVar5 == null) {
                    this.c = new ejo(enpVar, new enq(1.0f, 1.0f));
                } else {
                    eixVar5.d = enpVar;
                }
            } else if (obj == ehr.p) {
                eixVar4 = this.d;
                if (eixVar4 == null) {
                    this.d = new ejo(enpVar, Float.valueOf(0.0f));
                } else {
                    eixVar4.d = enpVar;
                }
            } else if (obj == ehr.c) {
                eixVar3 = this.e;
                if (eixVar3 == null) {
                    this.e = new ejo(enpVar, 100);
                } else {
                    eixVar3.d = enpVar;
                }
            } else if (obj == ehr.C) {
                eixVar2 = this.h;
                if (eixVar2 == null) {
                    this.h = new ejo(enpVar, Float.valueOf(100.0f));
                } else {
                    eixVar2.d = enpVar;
                }
            } else if (obj == ehr.D) {
                eixVar = this.i;
                if (eixVar == null) {
                    this.i = new ejo(enpVar, Float.valueOf(100.0f));
                } else {
                    eixVar.d = enpVar;
                }
            } else if (obj == ehr.q) {
                ejbVar2 = this.f;
                if (ejbVar2 == null) {
                    ejbVar2 = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                    this.f = ejbVar2;
                }
                ejbVar2.d = enpVar;
            } else {
                if (obj == ehr.r) {
                    return false;
                }
                ejbVar = this.g;
                if (ejbVar == null) {
                    ejbVar = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                    this.g = ejbVar;
                }
                ejbVar.d = enpVar;
            }
        } else if (obj == ehr.o) {
            eixVar5 = this.c;
            if (eixVar5 == null) {
                this.c = new ejo(enpVar, new enq(1.0f, 1.0f));
            } else {
                eixVar5.d = enpVar;
            }
        } else if (obj == ehr.p) {
            eixVar4 = this.d;
            if (eixVar4 == null) {
                this.d = new ejo(enpVar, Float.valueOf(0.0f));
            } else {
                eixVar4.d = enpVar;
            }
        } else if (obj == ehr.c) {
            eixVar3 = this.e;
            if (eixVar3 == null) {
                this.e = new ejo(enpVar, 100);
            } else {
                eixVar3.d = enpVar;
            }
        } else if (obj == ehr.C) {
            eixVar2 = this.h;
            if (eixVar2 == null) {
                this.h = new ejo(enpVar, Float.valueOf(100.0f));
            } else {
                eixVar2.d = enpVar;
            }
        } else if (obj == ehr.D) {
            eixVar = this.i;
            if (eixVar == null) {
                this.i = new ejo(enpVar, Float.valueOf(100.0f));
            } else {
                eixVar.d = enpVar;
            }
        } else if (obj == ehr.q) {
            ejbVar2 = this.f;
            if (ejbVar2 == null) {
                ejbVar2 = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                this.f = ejbVar2;
            }
            ejbVar2.d = enpVar;
        } else {
            if (obj == ehr.r) {
                return false;
            }
            ejbVar = this.g;
            if (ejbVar == null) {
                ejbVar = new ejb(Collections.singletonList(new enn(Float.valueOf(0.0f))));
                this.g = ejbVar;
            }
            ejbVar.d = enpVar;
        }
        return true;
    }
}
