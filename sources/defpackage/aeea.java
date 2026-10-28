package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeea extends qa {
    public final List a;
    public int b;
    public int c;
    public avgj d;
    private final nh e;
    private final boolean f;

    public aeea(nh nhVar) {
        super((byte[]) null);
        this.e = nhVar;
        this.f = nhVar.c;
        this.a = new ArrayList();
        nhVar.x(this);
        u();
    }

    private final void N(int i) {
        this.a.remove(i);
    }

    private final void O(int i, int i2) {
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((aedz) list.get(i)).b += i2;
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    private final void P(int i, int i2) {
        boolean zQ;
        avgj avgjVar;
        aedz aedzVar;
        List list = this.a;
        int i3 = (i2 + i) - 1;
        int iM = m(i3);
        if (iM == list.size()) {
            int i4 = iM - 1;
            zQ = Q(iM, list.isEmpty() ? i : Math.max(i, ((aedz) list.get(i4)).b + 1), i3);
            iM = i4;
        } else {
            zQ = false;
        }
        if (iM >= 0 && iM < list.size()) {
            Object obj = list.get(iM);
            while (true) {
                aedzVar = (aedz) obj;
                int i5 = aedzVar.b;
                if (i5 >= i) {
                    if (i5 <= i3) {
                        int iB = aedi.b(i5);
                        if (aedi.d(iB)) {
                            N(iM);
                        } else if (iB != aedzVar.a) {
                            aedzVar.a = iB;
                        } else if (iM > 0) {
                            zQ |= Q(iM, Math.max(i, ((aedz) list.get(iM - 1)).b + 1), aedzVar.b - 1);
                        }
                        zQ = true;
                        if (iM > 0) {
                            zQ |= Q(iM, Math.max(i, ((aedz) list.get(iM - 1)).b + 1), aedzVar.b - 1);
                        }
                    }
                    if (iM <= 0) {
                        break;
                    }
                    iM--;
                    obj = list.get(iM);
                } else {
                    break;
                }
            }
            int i6 = aedzVar.b;
            if (i < i6) {
                zQ |= Q(iM, i, Math.min(i3, i6 - 1));
            }
        }
        if (!zQ || (avgjVar = this.d) == null) {
            return;
        }
        avgjVar.h();
    }

    private final boolean Q(int i, int i2, int i3) {
        boolean z = false;
        while (i3 >= i2) {
            int iB = aedi.b(i3);
            if (!aedi.d(iB)) {
                this.a.add(i, new aedz(iB, i3, w(i3)));
                z = true;
            }
            i3--;
        }
        return z;
    }

    private final long w(int i) {
        if (this.f) {
            return this.e.c(i);
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        P(i, i2);
    }

    @Override // defpackage.qa
    public final void fQ() {
        t();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        P(i, i2);
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        boolean z;
        avgj avgjVar;
        List list = this.a;
        int iM = m(i);
        if (iM < list.size()) {
            O(iM, i2);
            z = true;
        } else {
            z = false;
        }
        if ((Q(iM, i, (i2 + i) - 1) || z) && (avgjVar = this.d) != null) {
            avgjVar.h();
        }
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        int i3;
        List list = this.a;
        int iM = m(i);
        int size = list.size();
        while (iM < list.size() && (i3 = ((aedz) list.get(iM)).b) >= i && i3 < i + i2) {
            N(iM);
        }
        if (iM < size) {
            O(iM, -i2);
            avgj avgjVar = this.d;
            if (avgjVar != null) {
                avgjVar.h();
            }
        }
    }

    public final int m(int i) {
        int iBinarySearch = Collections.binarySearch(this.a, new aedz(0, i, Long.MAX_VALUE));
        return iBinarySearch < 0 ? -(iBinarySearch + 1) : iBinarySearch;
    }

    public final int o() {
        int i = this.b;
        if (i == -1) {
            return 0;
        }
        return ((aedz) this.a.get(i)).a;
    }

    final int p() {
        List list = this.a;
        if (list.isEmpty()) {
            return -1;
        }
        return ((aedz) list.get(0)).b;
    }

    final int q() {
        int i = this.b;
        List list = this.a;
        if (i == -1) {
            if (list.isEmpty()) {
                return 0;
            }
            return ((aedz) list.get(0)).a;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            return ((aedz) list.get(i2)).a;
        }
        return 0;
    }

    final int r() {
        int i = this.b;
        if (i == -1) {
            return p();
        }
        int i2 = i + 1;
        List list = this.a;
        if (i2 < list.size()) {
            return ((aedz) list.get(i2)).b;
        }
        return -1;
    }

    public final long s() {
        int i = this.b;
        if (i == -1) {
            return Long.MAX_VALUE;
        }
        return ((aedz) this.a.get(i)).c;
    }

    public final void t() {
        List list = this.a;
        list.clear();
        for (int i = 0; i < this.e.a(); i++) {
            int iB = aedi.b(i);
            if (!aedi.d(iB)) {
                list.add(new aedz(iB, i, w(i)));
            }
        }
        avgj avgjVar = this.d;
        if (avgjVar != null) {
            avgjVar.h();
        }
    }

    public final void u() {
        this.b = -1;
        this.c = -1;
    }

    final boolean v() {
        return !this.a.isEmpty();
    }
}
