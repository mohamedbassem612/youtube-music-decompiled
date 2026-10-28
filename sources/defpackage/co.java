package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class co extends qr {
    final /* synthetic */ dd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(dd ddVar) {
        super(false);
        this.a = ddVar;
    }

    @Override // defpackage.qr
    public final void a() {
        if (dd.aa(3)) {
            boolean z = dd.a;
            Objects.toString(this.a);
        }
        if (dd.a) {
            this.a.q();
        }
    }

    @Override // defpackage.qr
    public final void b() {
        int i;
        if (dd.aa(3)) {
            boolean z = dd.a;
            Objects.toString(this.a);
        }
        dd ddVar = this.a;
        ddVar.g = true;
        ddVar.am(true);
        ddVar.g = false;
        if (!dd.a || ddVar.f == null) {
            if (ddVar.h.b) {
                ddVar.ae(null, -1, 0);
                return;
            } else {
                ddVar.e.d();
                return;
            }
        }
        if (!ddVar.m.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(dd.ai(ddVar.f));
            ArrayList arrayList = ddVar.m;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                cx cxVar = (cx) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cxVar.hz();
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = ddVar.f.e;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            cc ccVar = ((dm) arrayList2.get(i3)).b;
            if (ccVar != null) {
                ccVar.mTransitioning = false;
            }
        }
        for (eb ebVar : ddVar.l(new ArrayList(Collections.singletonList(ddVar.f)), 0, 1)) {
            List list = ebVar.c;
            ebVar.h(list);
            ebVar.d(list);
        }
        ArrayList arrayList3 = ddVar.f.e;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            cc ccVar2 = ((dm) arrayList3.get(i4)).b;
            if (ccVar2 != null && ccVar2.mContainer == null) {
                ddVar.ap(ccVar2).i();
            }
        }
        ddVar.f = null;
        ddVar.V();
        if (dd.aa(3)) {
            boolean z2 = ddVar.h.b;
            Objects.toString(ddVar);
        }
    }

    @Override // defpackage.qr
    public final void c(pw pwVar) {
        if (dd.aa(2)) {
            boolean z = dd.a;
            Objects.toString(this.a);
        }
        dd ddVar = this.a;
        av avVar = ddVar.f;
        if (avVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(avVar));
            for (eb ebVar : ddVar.l(arrayList, 0, 1)) {
                if (dd.aa(2)) {
                    float f = pwVar.a;
                }
                List list = ebVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    atqq.aA(arrayList2, ((ea) it.next()).g);
                }
                List listAp = atqq.ap(atqq.aw(arrayList2));
                int size = listAp.size();
                for (int i = 0; i < size; i++) {
                    dy dyVar = (dy) listAp.get(i);
                    ViewGroup viewGroup = ebVar.a;
                    dyVar.e(pwVar);
                }
            }
            ArrayList arrayList3 = ddVar.m;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((cx) arrayList3.get(i2)).e();
            }
        }
    }

    @Override // defpackage.qr
    public final void d() {
        if (dd.aa(3)) {
            boolean z = dd.a;
            Objects.toString(this.a);
        }
        if (dd.a) {
            dd ddVar = this.a;
            ddVar.I();
            ddVar.J(new da(ddVar), false);
        }
    }
}
