package defpackage;

import android.util.SparseArray;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fny implements fop {
    public static final boolean a = fna.a;
    public final fop b;
    public final String d;
    public final dov h;
    public final SparseArray c = new SparseArray();
    public int e = Alert.DURATION_SHOW_INDEFINITELY;
    public int f = -1;
    public int g = -1;

    public fny(fop fopVar, dov dovVar, String str) {
        this.b = fopVar;
        this.h = dovVar;
        this.d = str;
    }

    private static List h(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = i; i3 < i + i2; i3++) {
            ftg ftgVar = (ftg) sparseArray.get(i3);
            if (ftgVar == null) {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", Integer.valueOf(i3)));
            }
            arrayList.add(ftgVar);
        }
        return arrayList;
    }

    @Override // defpackage.fop
    public final void a(int i, int i2) {
        throw null;
    }

    final void b() {
        int i = this.e;
        if (i != Integer.MAX_VALUE) {
            if (i == 1) {
                int i2 = this.f;
                int i3 = this.g;
                SparseArray sparseArray = this.c;
                List listH = h(i2, i3, sparseArray);
                int i4 = this.g;
                fop fopVar = this.b;
                if (i4 > 1) {
                    fopVar.f(this.f, listH);
                    if (a) {
                        c(this.f, listH);
                    }
                } else {
                    int i5 = this.f;
                    ftg ftgVar = (ftg) sparseArray.get(i5);
                    fpp fppVar = (fpp) fopVar;
                    if (fppVar.b) {
                        fsy fsyVar = fppVar.a;
                        fsyVar.y();
                        if (ftj.a) {
                            fsyVar.hashCode();
                            ftgVar.s();
                        }
                        if (ftgVar == null) {
                            throw new RuntimeException("Received null RenderInfo to insert/update!");
                        }
                        fsm fsmVarV = fsyVar.v(i5, ftgVar);
                        synchronized (fsyVar) {
                            fsyVar.L = true;
                            fsyVar.c.add(i5, fsmVarV.b);
                            fsyVar.J(fsmVarV);
                        }
                    } else {
                        fsy fsyVar2 = fppVar.a;
                        gzj.aS();
                        if (ftj.a) {
                            fsyVar2.hashCode();
                            ftgVar.s();
                        }
                        if (ftgVar == null) {
                            throw new RuntimeException("Received null RenderInfo to insert/update!");
                        }
                        fqh fqhVarT = fsyVar2.t(ftgVar);
                        synchronized (fsyVar2) {
                            if (fsyVar2.L) {
                                throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                            }
                            fsyVar2.b.add(i5, fqhVarT);
                            fsyVar2.Q.b(ftgVar);
                        }
                        fsyVar2.f.h(i5);
                        fuz fuzVar = fsyVar2.N;
                        fuzVar.c(fuzVar.f(i5, fsyVar2.I));
                    }
                    if (a) {
                        dov dovVar = this.h;
                        String str = this.d;
                        int i6 = this.f;
                        dovVar.y(str, i6, (ftg) sparseArray.get(i6), Thread.currentThread().getName());
                    }
                }
            } else if (i == 2) {
                int i7 = this.f;
                int i8 = this.g;
                SparseArray sparseArray2 = this.c;
                List listH2 = h(i7, i8, sparseArray2);
                int i9 = this.g;
                fop fopVar2 = this.b;
                if (i9 > 1) {
                    fopVar2.g(this.f, listH2);
                    if (a) {
                        d(this.f, listH2);
                    }
                } else {
                    int i10 = this.f;
                    ftg ftgVar2 = (ftg) sparseArray2.get(i10);
                    fpp fppVar2 = (fpp) fopVar2;
                    if (fppVar2.b) {
                        fsy fsyVar3 = fppVar2.a;
                        fsyVar3.y();
                        if (ftj.a) {
                            fsyVar3.hashCode();
                        }
                        synchronized (fsyVar3) {
                            fsyVar3.w(new fsq(i10, ftgVar2));
                        }
                    } else {
                        fppVar2.a.Q(i10, ftgVar2);
                    }
                    if (a) {
                        dov dovVar2 = this.h;
                        String str2 = this.d;
                        int i11 = this.f;
                        dovVar2.B(str2, i11, (ftg) sparseArray2.get(i11), Thread.currentThread().getName());
                    }
                }
            } else if (i == 3) {
                int i12 = this.g;
                fop fopVar3 = this.b;
                if (i12 > 1) {
                    fopVar3.a(this.f, i12);
                    if (a) {
                        int i13 = this.f;
                        int i14 = this.g;
                        for (int i15 = 0; i15 < i14; i15++) {
                            this.h.x(this.d, i13 + i15, Thread.currentThread().getName());
                        }
                    }
                } else {
                    int i16 = this.f;
                    fpp fppVar3 = (fpp) fopVar3;
                    if (fppVar3.b) {
                        fsy fsyVar4 = fppVar3.a;
                        fsyVar4.y();
                        if (ftj.a) {
                            fsyVar4.hashCode();
                        }
                        fso fsoVar = new fso(i16);
                        synchronized (fsyVar4) {
                            fsyVar4.L = true;
                            fsyVar4.c.remove(i16);
                            fsyVar4.w(fsoVar);
                        }
                    } else {
                        fppVar3.a.L(i16);
                    }
                    if (a) {
                        this.h.x(this.d, this.f, Thread.currentThread().getName());
                    }
                }
            }
            this.e = Alert.DURATION_SHOW_INDEFINITELY;
            this.c.clear();
        }
    }

    public final void c(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.h.y(this.d, i + i2, (ftg) list.get(i2), Thread.currentThread().getName());
        }
    }

    public final void d(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.h.B(this.d, i + i2, (ftg) list.get(i2), Thread.currentThread().getName());
        }
    }

    @Override // defpackage.fop
    public final void e(int i) {
        fsy fsyVar = ((fpp) this.b).a;
        if (fsyVar.C == null) {
            fsyVar.D = i;
            fsyVar.H = 0;
        } else {
            fsyVar.e.l(i, 0);
        }
        if (a) {
            SparseArray sparseArray = this.c;
            if (sparseArray.size() != 0) {
                this.h.C(this.d, i, (ftg) sparseArray.get(i), Thread.currentThread().getName());
            }
        }
    }

    @Override // defpackage.fop
    public final void f(int i, List list) {
        throw null;
    }

    @Override // defpackage.fop
    public final void g(int i, List list) {
        throw null;
    }
}
