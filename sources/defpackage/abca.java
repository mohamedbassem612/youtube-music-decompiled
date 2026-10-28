package defpackage;

import android.opengl.Matrix;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abca {
    public float[] a;
    public float[] b;
    private float[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private abca h;
    private boolean j = true;
    private final List i = new LinkedList();
    private final float[] c = new float[16];

    private abca() {
    }

    public static abca a() {
        abca abcaVar = new abca();
        abcaVar.a = new float[16];
        abcaVar.d = new float[16];
        float[] fArr = new float[16];
        abcaVar.b = fArr;
        abcaVar.e = new float[16];
        abcaVar.g = new float[16];
        abcaVar.f = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(abcaVar.a, 0);
        Matrix.setIdentityM(abcaVar.d, 0);
        Matrix.setIdentityM(abcaVar.e, 0);
        Matrix.setIdentityM(abcaVar.g, 0);
        Matrix.setIdentityM(abcaVar.f, 0);
        return abcaVar;
    }

    public final void b() {
        Matrix.setIdentityM(this.d, 0);
        d();
    }

    public final void c(abca abcaVar) {
        if (abcaVar != null) {
            this.h = abcaVar;
            abcaVar.i.add(this);
            d();
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        abca abcaVar = new abca();
        abcaVar.a = (float[]) this.a.clone();
        abcaVar.d = (float[]) this.d.clone();
        abcaVar.b = (float[]) this.b.clone();
        abcaVar.e = (float[]) this.e.clone();
        abcaVar.g = (float[]) this.g.clone();
        abcaVar.f = (float[]) this.f.clone();
        abcaVar.c(this.h);
        abcaVar.j = this.j;
        return abcaVar;
    }

    public final void d() {
        float[] fArr = this.c;
        Matrix.multiplyMM(fArr, 0, this.d, 0, this.f, 0);
        Matrix.multiplyMM(this.a, 0, fArr, 0, this.g, 0);
        abca abcaVar = this.h;
        if (abcaVar != null && this.j) {
            Matrix.multiplyMM(fArr, 0, abcaVar.a, 0, this.a, 0);
            System.arraycopy(fArr, 0, this.a, 0, 16);
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((abca) it.next()).d();
        }
    }

    public final void e() {
        Matrix.multiplyMM(this.f, 0, this.b, 0, this.e, 0);
        d();
    }

    public final void f(float f, float f2, float f3) {
        Matrix.rotateM(this.d, 0, f, f2, f3, 0.0f);
        d();
    }
}
