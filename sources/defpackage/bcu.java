package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bcu extends bam {
    final /* synthetic */ bcv a;
    private final HashMap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcu(bcv bcvVar) {
        super(0);
        this.a = bcvVar;
        this.d = new HashMap();
    }

    private static final boolean e(ci ciVar) {
        return (ciVar.l() & 519) != 0;
    }

    @Override // defpackage.bam
    public final void a(bbn bbnVar, List list) {
        ArrayList arrayList;
        int size;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ci ciVar = (ci) list.get(size2);
            Integer num = (Integer) this.d.get(ciVar);
            if (num != null) {
                int iIntValue = num.intValue();
                float fG = ((bat) ciVar.a).g();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fG;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fG;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fG;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fG;
                }
            }
        }
        bcv bcvVar = this.a;
        bcv.a(bbnVar);
        ArrayList arrayList2 = bcvVar.b;
        int size3 = arrayList2.size();
        do {
            size3--;
            if (size3 < 0) {
                return;
            }
            arrayList = (ArrayList) ((acik) arrayList2.get(size3)).d;
            size = arrayList.size() - 1;
        } while (size < 0);
        throw null;
    }

    @Override // defpackage.bam
    public final void b(ci ciVar, bal balVar) {
        if (e(ciVar)) {
            avw avwVar = balVar.b;
            avw avwVar2 = balVar.a;
            int i = avwVar.b != avwVar2.b ? 1 : 0;
            if (avwVar.c != avwVar2.c) {
                i |= 2;
            }
            if (avwVar.d != avwVar2.d) {
                i |= 4;
            }
            if (avwVar.e != avwVar2.e) {
                i |= 8;
            }
            this.d.put(ciVar, Integer.valueOf(i));
        }
    }

    @Override // defpackage.bam
    public final void c(ci ciVar) {
        if (!e(ciVar)) {
            return;
        }
        this.d.remove(ciVar);
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            acik acikVar = (acik) arrayList.get(size);
            int i = acikVar.b;
            int i2 = i - 1;
            acikVar.b = i2;
            if (i > 0 && i2 == 0) {
                acikVar.b();
            }
        }
    }

    @Override // defpackage.bam
    public final void d(ci ciVar) {
        if (!e(ciVar)) {
            return;
        }
        ArrayList arrayList = this.a.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((acik) arrayList.get(size)).b++;
        }
    }
}
