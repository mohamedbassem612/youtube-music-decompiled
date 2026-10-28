package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bbb {
    private final bbn a;
    avw[] b;
    Rect[][] c;
    Rect[][] d;

    public bbb(bbn bbnVar) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = bbnVar;
        h(bbnVar);
    }

    public bbn a() {
        i();
        return this.a;
    }

    public void g(int i, avw avwVar) {
        if (this.b == null) {
            this.b = new avw[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[azu.d(i2)] = avwVar;
            }
        }
    }

    public void h(bbn bbnVar) {
        int i = 1;
        while (i <= 512) {
            bbk bbkVar = bbnVar.b;
            List listF = bbkVar.f(i);
            int iD = azu.d(i);
            this.c[iD] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List listG = bbkVar.g(i);
                this.d[iD] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            } else {
                i = 8;
            }
            i <<= 1;
        }
    }

    protected final void i() {
        avw[] avwVarArr = this.b;
        if (avwVarArr != null) {
            avw avwVarF = avwVarArr[azu.d(1)];
            avw avwVarF2 = this.b[azu.d(2)];
            if (avwVarF2 == null) {
                avwVarF2 = this.a.f(2);
            }
            if (avwVarF == null) {
                avwVarF = this.a.f(1);
            }
            c(avw.b(avwVarF, avwVarF2));
            avw avwVar = this.b[azu.d(16)];
            if (avwVar != null) {
                e(avwVar);
            }
            avw avwVar2 = this.b[azu.d(32)];
            if (avwVar2 != null) {
                d(avwVar2);
            }
            avw avwVar3 = this.b[azu.d(64)];
            if (avwVar3 != null) {
                f(avwVar3);
            }
        }
    }

    public bbb() {
        this(new bbn((bbn) null));
    }

    public void b(avw avwVar) {
    }

    public void c(avw avwVar) {
    }

    public void d(avw avwVar) {
    }

    public void e(avw avwVar) {
    }

    public void f(avw avwVar) {
    }
}
