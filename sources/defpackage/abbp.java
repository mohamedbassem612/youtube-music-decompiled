package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import com.google.cardboard.sdk.CardboardView;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbp extends abbr {
    final abca a;
    final abca b;
    final abca c;
    public final abbk e;
    public final abbv f;
    public abcc g;
    volatile abbr h;
    public wiz i;
    public boolean j;
    public boolean k;
    public abcy l;
    public int m;
    private final abdb n;
    private final float[] o;
    private final AtomicReference p;
    private abce q;
    private yia r;
    private yib s;
    private yib t;
    private int u;
    private final abbu v;

    /* JADX WARN: Type inference failed for: r4v5, types: [abcy, java.lang.Object] */
    public abbp(Handler handler, abca abcaVar, abby abbyVar, abbu abbuVar, abdb abdbVar, abce abceVar) {
        wiz wizVar = wiz.e;
        this.i = wizVar;
        this.m = 1;
        this.k = true;
        this.b = abca.a();
        this.p = new AtomicReference();
        this.c = abcaVar;
        this.a = abca.a();
        this.v = abbuVar;
        this.n = abdbVar;
        this.q = abceVar;
        abbk abbkVar = new abbk(handler, abbyVar);
        this.e = abbkVar;
        this.f = new abbv(handler);
        abbkVar.g();
        this.g = abbkVar;
        this.j = true;
        k(wizVar, 1);
        this.o = new float[16];
        this.l = new abda(abdbVar, this.g.j(), 2).io();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [abcy, java.lang.Object] */
    private final void l(int i) {
        int iJ = this.g.j();
        abdb abdbVar = this.n;
        int i2 = 2;
        this.l = new abda(abdbVar, iJ, 2).io();
        float[] fArr = new float[9600];
        float[] fArr2 = new float[6400];
        int i3 = 0;
        while (true) {
            if (i3 >= 40) {
                afee afeeVar = new afee(fArr, fArr2, 5);
                abcc abccVar = this.g;
                this.h = new abbg(afeeVar, afeeVar, abccVar, i, this.a, new abda(abdbVar, abccVar.j(), i2), this.q);
                return;
            }
            int i4 = i3 + 1;
            float f = i3 / 40.0f;
            double d = f * 3.1415927f;
            float fSin = (float) Math.sin(d);
            float f2 = i4 / 40.0f;
            double d2 = f2 * 3.1415927f;
            int i5 = i2;
            float fSin2 = (float) Math.sin(d2);
            float fCos = (float) Math.cos(d);
            float fCos2 = (float) Math.cos(d2);
            int i6 = i3 * 240;
            int i7 = i3 * 160;
            int i8 = 0;
            for (int i9 = 40; i8 < i9; i9 = 40) {
                float f3 = fSin2 * 76.8f;
                float f4 = 76.8f * fSin;
                float f5 = i8 / 39.0f;
                int i10 = i8 << 1;
                int i11 = i6 + (i10 * 3);
                int i12 = i10 + 1;
                int i13 = i6 + (i12 * 3);
                float f6 = fSin2;
                int i14 = i8;
                double d3 = (f5 + f5) * 3.1415927f;
                fArr[i11] = ((float) Math.sin(d3)) * f4;
                fArr[i13] = ((float) Math.sin(d3)) * f3;
                fArr[i11 + 1] = fCos * 76.8f;
                fArr[i13 + 1] = fCos2 * 76.8f;
                fArr[i11 + 2] = f4 * ((float) Math.cos(d3));
                fArr[i13 + 2] = f3 * ((float) Math.cos(d3));
                int i15 = (i14 << 2) + i7;
                int i16 = i7 + (i12 << 1);
                float f7 = 1.0f - f5;
                fArr2[i15] = f7;
                fArr2[i16] = f7;
                fArr2[i15 + 1] = 1.0f - f;
                fArr2[i16 + 1] = 1.0f - f2;
                i8 = i14 + 1;
                fSin2 = f6;
            }
            i3 = i4;
            i2 = i5;
        }
    }

    @Override // defpackage.abbl
    public final void a() {
        abbr abbrVar = this.h;
        if (abbrVar != null) {
            abbrVar.a();
        }
        abbk abbkVar = this.e;
        SurfaceTexture surfaceTexture = abbkVar.d;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            abbkVar.d = null;
            GLES20.glDeleteTextures(1, new int[]{abbkVar.b}, 0);
        }
        int[] iArr = this.f.a;
        GLES20.glDeleteTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            iArr[i] = 0;
        }
    }

    @Override // defpackage.abbl
    public final void b(ahgb ahgbVar) {
        if (this.k) {
            k(this.i, this.m);
        }
        if (this.j) {
            if (wiz.f.equals(this.i)) {
                Object obj = ahgbVar.d;
                float[] fArr = this.o;
                System.arraycopy(obj, 0, fArr, 0, 16);
                fArr[12] = 0.0f;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                Object obj2 = ahgbVar.a;
                float[] fArr2 = (float[]) obj2;
                ahgbVar = new ahgb(fArr, fArr2, (abbw) ahgbVar.e, (CardboardView.Eye) ahgbVar.c);
            }
            abbr abbrVar = this.h;
            if (abbrVar != null) {
                abbrVar.b(ahgbVar);
            }
        }
    }

    @Override // defpackage.abbr, defpackage.abbl
    public final void d(grj grjVar) {
        abbr abbrVar = this.h;
        if (abbrVar != null) {
            abbrVar.d(grjVar);
        }
    }

    @Override // defpackage.abbr
    public final void f(abce abceVar) {
        this.q = abceVar;
        abbr abbrVar = this.h;
        if (abbrVar != null) {
            abbrVar.f(abceVar);
        }
    }

    @Override // defpackage.abbr
    public final void g() {
        abbr abbrVar = this.h;
        this.h = null;
        if (abbrVar != null) {
            abbrVar.g();
        }
    }

    public final void h(yia yiaVar, yib yibVar, int i, yib yibVar2) {
        this.r = yiaVar;
        this.s = yibVar;
        this.u = i;
        this.t = yibVar2;
        this.l.a(yiaVar, yibVar, i, yibVar2);
    }

    public final void j(zlp zlpVar) {
        this.p.set(zlpVar);
        this.k = true;
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [abcy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [abcy, java.lang.Object] */
    public final void k(wiz wizVar, int i) {
        abca abcaVar;
        if (wizVar == this.i && i == this.m && !this.k) {
            return;
        }
        this.k = false;
        this.i = wizVar;
        this.m = i;
        abbr abbrVar = this.h;
        this.h = null;
        if (abbrVar != null) {
            abbrVar.a();
            abbrVar.g();
        }
        int i2 = this.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            abcaVar = this.c;
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new RuntimeException(null, null);
            }
            abcaVar = this.b;
        }
        abca abcaVar2 = this.a;
        abcaVar2.c(abcaVar);
        Matrix.setIdentityM(abcaVar2.b, 0);
        abcaVar2.e();
        int iOrdinal = wizVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                l(0);
            } else if (iOrdinal == 2) {
                l(1);
            } else if (iOrdinal == 3) {
                this.h = new abbi(new abda(this.n, this.g.j(), 1), this.g, this.q);
            } else if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    throw new UnsupportedOperationException("VideoScene type not supported");
                }
                zlp zlpVar = (zlp) this.p.get();
                if (zlpVar != null) {
                    abdb abdbVar = this.n;
                    this.l = new abda(abdbVar, this.g.j(), 2).io();
                    twp twpVarU = zlpVar.c.u();
                    afee afeeVar = new afee((float[]) twpVarU.c, (float[]) twpVarU.b, twpVarU.a);
                    elq elqVar = zlpVar.d;
                    if (elqVar != null) {
                        twp twpVarU2 = elqVar.u();
                        afee afeeVar2 = new afee((float[]) twpVarU2.c, (float[]) twpVarU2.b, twpVarU2.a);
                        abcc abccVar = this.g;
                        this.h = new abbg(afeeVar, afeeVar2, abccVar, zlpVar.b, abcaVar2, new abda(abdbVar, abccVar.j(), 2), this.q);
                    } else {
                        abcc abccVar2 = this.g;
                        this.h = new abbg(afeeVar, afeeVar, abccVar2, zlpVar.b, abcaVar2, new abda(abdbVar, abccVar2.j(), 2), this.q);
                    }
                }
            }
        }
        if (this.h == null) {
            abdb abdbVar2 = this.n;
            this.l = new abda(abdbVar2, this.g.j(), 0).io();
            this.h = new abbh(new abda(abdbVar2, this.g.j(), 0), this.g, this.q);
        }
        Iterator it = this.v.h.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.l.b(true, null, 0L, 0L);
        this.l.a(this.r, this.s, this.u, this.t);
    }
}
