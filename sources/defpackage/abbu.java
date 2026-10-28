package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbu extends abbf {
    public final abdb e;
    public final abbp f;
    public final Set g;
    public final Set h;
    public boolean i;
    public int j;
    private final abca k;
    private final abca l;
    private final abca m;
    private final float[] n;
    private final Set o;
    private float p;
    private float q;
    private float r;
    private final ahud s;

    public abbu(Handler handler, abdh abdhVar, abby abbyVar, float f, ahud ahudVar, abce abceVar) {
        abca abcaVarA = abca.a();
        this.k = abcaVarA;
        abca abcaVarA2 = abca.a();
        this.l = abcaVarA2;
        this.m = abca.a();
        this.n = new float[16];
        this.g = ConcurrentHashMap.newKeySet();
        this.h = new HashSet();
        this.o = new HashSet();
        this.j = 1;
        handler.getClass();
        this.s = ahudVar;
        abdb abdbVar = new abdb(abdhVar, abceVar);
        this.e = abdbVar;
        Matrix.translateM(abcaVarA.b, 0, 0.0f, 0.0f, -76.8f);
        abcaVarA.e();
        abcaVarA.d();
        abcaVarA.c(abcaVarA2);
        abbp abbpVar = new abbp(handler, abcaVarA2, abbyVar, this, abdbVar, abceVar);
        this.f = abbpVar;
        f(f);
        int size = this.b.size();
        if (this.b.contains(abbpVar)) {
            ((agrc) ((agrc) abbf.a.c()).k("com/google/android/libraries/youtube/player/features/gl/GroupNode", "addChild", 171, "GroupNode.java")).B("%s NOT adding child - already has been added %s", this.c, abbpVar.getClass().getSimpleName());
        } else {
            abbpVar.getClass().getSimpleName();
            this.b.add(size, abbpVar);
            abbpVar.d = this;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
    }

    private final void k() {
        abbp abbpVar = this.f;
        wiz wizVar = abbpVar.i;
        if (wizVar == wiz.a || wizVar == wiz.d) {
            abbpVar.k = true;
            abbpVar.k(wizVar, abbpVar.m);
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((abbt) it.next()).f();
        }
    }

    @Override // defpackage.abbf, defpackage.abbl
    public final void a() {
        this.e.b();
        super.a();
    }

    @Override // defpackage.abbf, defpackage.abbl
    public final void b(ahgb ahgbVar) {
        abbw abbwVar = (abbw) ahgbVar.e;
        float f = abbwVar.a + abbwVar.c;
        float f2 = abbwVar.b + abbwVar.d;
        if (!abbz.b(f, this.p, 0.1f) && !abbz.b(f2, this.q, 0.1f)) {
            this.p = f;
            this.q = f2;
            j();
            k();
        }
        super.b(ahgbVar);
    }

    @Override // defpackage.abbf, defpackage.abbl
    public final void d(grj grjVar) {
        float fAtan2;
        if (this.i) {
            float[] fArr = (float[]) grjVar.a;
            float f = fArr[6];
            if (Math.sqrt(1.0f - (f * f)) >= 0.009999999776482582d) {
                fAtan2 = (float) Math.atan2(-fArr[2], fArr[10]);
            } else {
                fAtan2 = 0.0f;
            }
            float degrees = (float) Math.toDegrees(-fAtan2);
            float degrees2 = (float) Math.toDegrees(-Math.asin(fArr[6]));
            abca abcaVar = this.l;
            abcaVar.b();
            abcaVar.f(degrees, 0.0f, 1.0f);
            abcaVar.f(degrees2, 1.0f, 0.0f);
            abca abcaVar2 = this.m;
            abcaVar2.b();
            abcaVar2.f(degrees, 0.0f, 1.0f);
            this.i = false;
        }
        super.d(grjVar);
        float[] fArr2 = this.n;
        Matrix.invertM(fArr2, 0, (float[]) grjVar.a, 0);
        this.s.u(fArr2);
        GLES20.glClear(16640);
    }

    public final void f(float f) {
        this.r = f;
        j();
        k();
    }

    public final void g() {
        this.f.g();
    }

    public final void h(int i) {
        abcc abccVar;
        abbp abbpVar = this.f;
        if (i != abbpVar.g.j()) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                abccVar = abbpVar.e;
            } else {
                if (i2 != 1) {
                    throw new RuntimeException(null, null);
                }
                abccVar = abbpVar.f;
            }
            abbpVar.g = abccVar;
            abbpVar.g.g();
            abbpVar.k = true;
        }
    }

    private final void j() {
    }
}
