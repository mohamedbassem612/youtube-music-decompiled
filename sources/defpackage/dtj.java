package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class dtj extends dtp {
    final Matrix a;
    final ArrayList b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public dtj(dtj dtjVar, afv afvVar) {
        dtk dthVar;
        super(null);
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = dtjVar.c;
        this.d = dtjVar.d;
        this.e = dtjVar.e;
        this.f = dtjVar.f;
        this.g = dtjVar.g;
        this.h = dtjVar.h;
        this.i = dtjVar.i;
        int[] iArr = dtjVar.l;
        this.l = null;
        String str = dtjVar.m;
        this.m = str;
        int i = dtjVar.k;
        this.k = 0;
        if (str != null) {
            afvVar.put(str, this);
        }
        matrix.set(dtjVar.j);
        ArrayList arrayList = dtjVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof dtj) {
                this.b.add(new dtj((dtj) obj, afvVar));
            } else {
                if (obj instanceof dti) {
                    dthVar = new dti((dti) obj);
                } else {
                    if (!(obj instanceof dth)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    dthVar = new dth((dth) obj);
                }
                this.b.add(dthVar);
                Object obj2 = dthVar.n;
                if (obj2 != null) {
                    afvVar.put(obj2, dthVar);
                }
            }
        }
    }

    public final void a() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.dtp
    public final boolean b() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((dtp) arrayList.get(i)).b()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.dtp
    public final boolean c(int[] iArr) {
        int i = 0;
        boolean zC = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zC;
            }
            zC |= ((dtp) arrayList.get(i)).c(iArr);
            i++;
        }
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public dtj() {
        super(null);
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }
}
