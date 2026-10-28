package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbg extends abbr {
    private final abcc a;
    private final awmd b;
    private final abca c;
    private final float[] e;
    private final int f;
    private abce g;
    private float h;
    private final afee i;
    private final afee j;

    public abbg(afee afeeVar, afee afeeVar2, abcc abccVar, int i, abca abcaVar, awmd awmdVar, abce abceVar) {
        this.i = afeeVar;
        this.j = afeeVar2;
        abccVar.getClass();
        this.a = abccVar;
        this.b = awmdVar;
        this.f = i;
        this.c = abcaVar;
        this.e = new float[16];
        this.g = abceVar;
    }

    @Override // defpackage.abbl
    public final void a() {
        afee afeeVar = this.i;
        afeeVar.a();
        afee afeeVar2 = this.j;
        if (afeeVar2 != afeeVar) {
            afeeVar2.a();
        }
    }

    @Override // defpackage.abbl
    public final void b(ahgb ahgbVar) {
        Object objIo = this.b.io();
        abcz abczVar = (abcz) objIo;
        abczVar.h();
        int i = this.f;
        if (i != 1) {
            if (i != 2) {
                abde abdeVar = (abde) objIo;
                GLES20.glUniform2f(abdeVar.g, 1.0f, 1.0f);
                GLES20.glUniform2f(abdeVar.h, 0.0f, 0.0f);
            } else if (ahgbVar.c() == 2 || ahgbVar.c() == 0) {
                abde abdeVar2 = (abde) objIo;
                GLES20.glUniform2f(abdeVar2.g, 0.5f, 1.0f);
                GLES20.glUniform2f(abdeVar2.h, 0.0f, 0.0f);
            } else {
                abde abdeVar3 = (abde) objIo;
                GLES20.glUniform2f(abdeVar3.g, 0.5f, 1.0f);
                GLES20.glUniform2f(abdeVar3.h, 0.5f, 0.0f);
            }
        } else if (ahgbVar.c() == 2 || ahgbVar.c() == 0) {
            abde abdeVar4 = (abde) objIo;
            GLES20.glUniform2f(abdeVar4.g, 1.0f, 0.5f);
            GLES20.glUniform2f(abdeVar4.h, 0.0f, 0.5f);
        } else {
            abde abdeVar5 = (abde) objIo;
            GLES20.glUniform2f(abdeVar5.g, 1.0f, 0.5f);
            GLES20.glUniform2f(abdeVar5.h, 0.0f, 0.0f);
        }
        abcv abcvVar = (abcv) objIo;
        int i2 = abcvVar.a;
        GLES20.glEnableVertexAttribArray(i2);
        abdf abdfVar = (abdf) objIo;
        int i3 = abdfVar.j;
        GLES20.glEnableVertexAttribArray(i3);
        abde abdeVar6 = (abde) objIo;
        int i4 = abdeVar6.i;
        abcc abccVar = this.a;
        GLES20.glUniformMatrix4fv(i4, 1, false, abccVar.i(), 0);
        abccVar.f();
        abdeVar6.e.e(abccVar);
        float f = this.h;
        abce abceVar = this.g;
        abdeVar6.f.b(f, abceVar.a, abceVar.b);
        float[] fArr = this.e;
        Matrix.multiplyMM(fArr, 0, (float[]) ahgbVar.b, 0, this.c.a, 0);
        GLES20.glUniform1f(abdfVar.k, 1.0f);
        GLES20.glUniform1f(abcvVar.c, 1.0f);
        GLES20.glUniformMatrix4fv(abcvVar.b, 1, false, fArr, 0);
        abczVar.f();
        if (ahgbVar.c() == 1) {
            abdfVar.i(this.j);
        } else {
            abdfVar.i(this.i);
        }
        GLES20.glDisableVertexAttribArray(i2);
        GLES20.glDisableVertexAttribArray(i3);
    }

    @Override // defpackage.abbr, defpackage.abbl
    public final void d(grj grjVar) {
        if (this.g.a() && !this.g.b()) {
            this.h = (float) Math.random();
        }
        this.a.h();
    }

    @Override // defpackage.abbr, defpackage.abbl
    public final boolean e(grj grjVar) {
        return false;
    }

    @Override // defpackage.abbr
    public final void f(abce abceVar) {
        this.g = abceVar;
    }

    @Override // defpackage.abbr
    public final void g() {
    }

    @Override // defpackage.abbr, defpackage.abbl
    public final void c(boolean z, grj grjVar) {
    }
}
