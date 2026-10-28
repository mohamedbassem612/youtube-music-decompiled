package defpackage;

import android.os.Handler;
import android.widget.ListView;
import androidx.car.app.model.CarIconStyle;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aae {
    public final int a;
    public final Object b;
    public final Object c;

    public aae(IconCompat iconCompat, CarIconStyle carIconStyle) {
        adf adfVar = adf.a;
        iconCompat.getClass();
        adfVar.b(iconCompat);
        this.a = 1;
        this.b = iconCompat;
        carIconStyle.getClass();
        this.c = carIconStyle;
    }

    public final ListView a() {
        return ((mx) this.b).e;
    }

    public final void b(bvh bvhVar) {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new cfv(bvhVar, obj, 11, null));
        }
    }

    public final void c(cni cniVar) {
        b(new dbg(this, cniVar, 1));
    }

    public final void d(int i, bse bseVar, int i2, Object obj, long j) {
        c(new cni(1, i, bseVar, i2, obj, bwp.F(j), -9223372036854775807L));
    }

    public final void e(cnd cndVar, cni cniVar) {
        b(new cnr(this, cndVar, cniVar, 0));
    }

    public final void f(cnd cndVar, int i, int i2, bse bseVar, int i3, Object obj, long j, long j2) {
        e(cndVar, new cni(i, i2, bseVar, i3, obj, bwp.F(j), bwp.F(j2)));
    }

    public final void g(cnd cndVar, cni cniVar) {
        b(new cnr(this, cndVar, cniVar, 1));
    }

    public final void h(cnd cndVar, int i, int i2, bse bseVar, int i3, Object obj, long j, long j2) {
        g(cndVar, new cni(i, i2, bseVar, i3, obj, bwp.F(j), bwp.F(j2)));
    }

    public final void i(final cnd cndVar, final cni cniVar, final IOException iOException, final boolean z) {
        b(new bvh() { // from class: cnq
            @Override // defpackage.bvh
            public final void a(Object obj) {
                aae aaeVar = this.e;
                ((cns) obj).h(aaeVar.a, (cnm) aaeVar.b, cndVar, cniVar, iOException, z);
            }
        });
    }

    public final void j(cnd cndVar, int i, int i2, bse bseVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        i(cndVar, new cni(i, i2, bseVar, i3, obj, bwp.F(j), bwp.F(j2)), iOException, z);
    }

    public final void k(final cnd cndVar, final cni cniVar, final int i) {
        b(new bvh() { // from class: cnp
            @Override // defpackage.bvh
            public final void a(Object obj) {
                aae aaeVar = this.d;
                ((cns) obj).i(aaeVar.a, (cnm) aaeVar.b, cndVar, cniVar, i);
            }
        });
    }

    public final void l(cnd cndVar, int i, int i2, bse bseVar, int i3, Object obj, long j, long j2, int i4) {
        k(cndVar, new cni(i, i2, bseVar, i3, obj, bwp.F(j), bwp.F(j2)), i4);
    }

    public final void m(cni cniVar) {
        Object obj = this.b;
        obj.getClass();
        b(new cnr(this, (cnm) obj, cniVar, 2));
    }

    public final void n(int i, long j, long j2) {
        m(new cni(1, i, null, 3, null, bwp.F(j), bwp.F(j2)));
    }

    public final void o() {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new cfv(this, obj, 9, null));
        }
    }

    public final void p(int i) {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new qd(this, obj, i, 6, (byte[]) null));
        }
    }

    public final void q(Exception exc) {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new bf((Object) this, obj, (Object) exc, 11, (byte[]) null));
        }
    }

    public final void r() {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new cfv(this, obj, 10, null));
        }
    }

    public final void s(auq auqVar) {
        for (eol eolVar : (CopyOnWriteArrayList) this.c) {
            Object obj = eolVar.b;
            bwp.aq((Handler) eolVar.a, new bf((Object) this, obj, (Object) auqVar, 12, (byte[]) null));
        }
    }

    public final aae t(int i, cnm cnmVar) {
        return new aae((CopyOnWriteArrayList) this.c, i, cnmVar);
    }

    public final aae u(int i, cnm cnmVar) {
        return new aae((CopyOnWriteArrayList) this.c, i, cnmVar);
    }

    public aae(Object obj, Object obj2, int i) {
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    public aae(List list, Optional optional, int i) {
        this.c = list;
        this.b = optional;
        this.a = i;
    }

    public aae(CopyOnWriteArrayList copyOnWriteArrayList, int i, cnm cnmVar) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = cnmVar;
    }

    public aae() {
        this(new CopyOnWriteArrayList(), 0, (cnm) null);
    }

    public aae(bse bseVar, int i, String str) {
        this.b = bseVar;
        this.a = i;
        this.c = str;
    }
}
