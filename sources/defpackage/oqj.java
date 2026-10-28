package defpackage;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oqj extends nh {
    public final List a;
    public final awmd e;
    public final boolean f;
    public final Set g;
    public final Set h;
    public agke i;
    public oqz j;
    public oon k;
    public oqu l;
    private final ElementsServices m;
    private final oph n;
    private final boolean o;
    private final boolean p;
    private final AtomicBoolean q;
    private orf r;

    public oqj(ElementsServices elementsServices, oph ophVar, oqz oqzVar, oon oonVar, List list) {
        int i = 0;
        boolean z = Memory.peekByte(FlagServices.b().c + 62) != 0;
        this.f = z;
        this.o = Memory.peekByte(FlagServices.b().c + 87) != 0;
        this.p = Memory.peekByte(FlagServices.b().c + 95) != 0;
        this.g = ahng.ak();
        this.h = ahng.ak();
        this.q = new AtomicBoolean(false);
        this.m = elementsServices;
        this.n = ophVar;
        this.j = oqzVar;
        this.k = oonVar;
        this.a = list;
        this.e = new oqe(elementsServices, i);
        if (z) {
            while (i < list.size()) {
                zj zjVar = (zj) list.get(i);
                if (zjVar.c != null) {
                    this.g.add(zjVar);
                }
                i++;
            }
        }
    }

    public static final xuc I(ViewGroup viewGroup) {
        return new xuc(new ooy(viewGroup.getContext(), 2));
    }

    private final void J(agke agkeVar) {
        hp hpVarA = hs.a(new oqh(this, agkeVar), true);
        this.i = agkeVar;
        hpVarA.a(new oqi(this));
    }

    private final void K(int i) {
        List list = this.a;
        if (i >= list.size()) {
            for (int size = list.size(); size <= i; size++) {
                list.add(size, new zj(this.k.b(size)));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oov] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    private final void L(zj zjVar, boolean z) {
        if (this.f) {
            this.h.remove(zjVar);
            this.g.add(zjVar);
        }
        if (zjVar.c == null) {
            opl oplVarA = opl.a(this.m.L().io().b(this.n));
            if (z) {
                oplVarA.c().E((atgg) zjVar.b, this.j.i(), this.j.h(), zjVar.a());
            } else {
                oplVarA.c().F((atgg) zjVar.b, this.j.i(), this.j.h(), zjVar.a());
            }
            zjVar.c = oplVarA;
        }
    }

    public final void A(int i, int i2) {
        K(i2);
        while (i <= i2) {
            L((zj) this.a.get(i), true);
            i++;
        }
        orf orfVar = this.r;
        if (orfVar == null || orfVar.b < 0 || orfVar.size() - (i2 + 1) > this.r.b || !this.q.compareAndSet(false, true)) {
            return;
        }
        orf orfVar2 = this.r;
        mew mewVar = orfVar2.g;
        if (mewVar != null) {
            this.m.l().d(mewVar, ors.b().a());
        } else {
            orfVar2.loadMore();
        }
    }

    public final void B(int i, int i2) {
        List list = this.a;
        int iMin = Math.min(i2, list.size() - 1);
        while (i <= iMin) {
            G((zj) list.get(i), false);
            i++;
        }
    }

    public final void C(orf orfVar) {
        this.r = orfVar;
        this.q.set(false);
    }

    public final void D() {
        List list = this.a;
        int size = list.size();
        while (true) {
            size--;
            if (size < this.k.a()) {
                break;
            } else {
                G((zj) list.remove(size), true);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            zj zjVar = (zj) list.get(i);
            zjVar.b = this.k.b(i);
            H(zjVar);
        }
        jW();
    }

    public final void E(oqz oqzVar, oon oonVar, agke agkeVar) {
        oqz oqzVar2 = this.j;
        this.j = oqzVar;
        this.k = oonVar;
        if (!this.p) {
            J(agkeVar);
            return;
        }
        agke agkeVar2 = this.i;
        boolean zG = oqzVar2.g(oqzVar);
        if (agkeVar2 != null && zG) {
            J(agkeVar);
            return;
        }
        this.i = agkeVar;
        if (!zG) {
            D();
        }
        K(oonVar.a() - 1);
    }

    public final void F() {
        this.q.set(false);
    }

    public final void G(zj zjVar, boolean z) {
        if (this.f) {
            this.g.remove(zjVar);
            this.h.remove(zjVar);
        }
        zjVar.b(this.e, z);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    public final void H(zj zjVar) {
        Object obj = zjVar.c;
        if (obj != null) {
            ((opl) obj).c().E((atgg) zjVar.b, this.j.i(), this.j.h(), zjVar.a());
        }
    }

    @Override // defpackage.nh
    public final int a() {
        oon oonVar = this.k;
        if (oonVar == null) {
            return 0;
        }
        return oonVar.a();
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ oh e(ViewGroup viewGroup, int i) {
        return I(viewGroup);
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.libraries.multiplatform.elements.NodeTreeProcessor, java.lang.AutoCloseable] */
    @Override // defpackage.nh
    public final /* synthetic */ void o(oh ohVar, int i) {
        Size sizeH;
        oqz oqzVar;
        xuc xucVar = (xuc) ohVar;
        K(i);
        zj zjVar = (zj) this.a.get(i);
        Object obj = zjVar.c;
        L(zjVar, false);
        Object obj2 = zjVar.c;
        if (obj == null) {
            sizeH = this.l != null ? ((opl) obj2).c().g() : null;
        } else {
            sizeH = ((opl) obj2).c().h(this.j.i(), this.j.h());
        }
        oqu oquVar = this.l;
        if (oquVar != null && sizeH != null && oquVar.s == 2 && (oqzVar = oquVar.i) != null) {
            int height = oqzVar.f() ? sizeH.getHeight() : sizeH.getWidth();
            Integer num = oquVar.j;
            if (num == null || height > num.intValue()) {
                oquVar.j = Integer.valueOf(height);
                oqq oqqVar = new oqq(oquVar.j.intValue());
                NodeTreeProcessor nodeTreeProcessor = oquVar.w;
                if (nodeTreeProcessor != null) {
                    nodeTreeProcessor.r(oquVar.A, oqqVar);
                }
            }
        }
        View view = xucVar.s;
        if (this.o) {
            int mode = View.MeasureSpec.getMode(this.j.i());
            int mode2 = View.MeasureSpec.getMode(this.j.h());
            ooy ooyVar = (ooy) view;
            ViewGroup.LayoutParams layoutParams = ooyVar.getLayoutParams();
            int i2 = mode == 1073741824 ? -1 : -2;
            int i3 = mode2 != 1073741824 ? -2 : -1;
            if (layoutParams == null) {
                ooyVar.setLayoutParams(new nq(i2, i3));
            } else if (layoutParams.width != i2 || layoutParams.height != i3) {
                layoutParams.width = i2;
                layoutParams.height = i3;
                ooyVar.setLayoutParams(layoutParams);
            }
        }
        ooy ooyVar2 = (ooy) view;
        opl oplVar = (opl) obj2;
        if (!Objects.equals(oplVar.c(), ooyVar2.h())) {
            ooyVar2.z(oplVar.b());
        }
        if (this.j.f()) {
            ooyVar2.x(0, i);
        } else {
            ooyVar2.x(i, 0);
        }
    }

    @Override // defpackage.nh
    public final /* bridge */ /* synthetic */ void s(oh ohVar) {
        ((ooy) ((xuc) ohVar).s).n();
    }

    public final void z() {
        if (this.f) {
            this.g.clear();
            this.h.clear();
        }
        List list = this.a;
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        list.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zj) arrayList.get(i)).b(this.e, true);
        }
    }
}
