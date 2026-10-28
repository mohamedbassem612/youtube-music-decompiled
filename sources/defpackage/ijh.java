package defpackage;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ijh extends qa {
    private final ijm a;
    private final admo b;
    private final RecyclerView c;
    private final Map d;
    private final awku e;

    public ijh(ijm ijmVar, admo admoVar, RecyclerView recyclerView, Map map, awku awkuVar) {
        super((byte[]) null);
        this.a = ijmVar;
        admoVar.getClass();
        this.b = admoVar;
        recyclerView.getClass();
        this.c = recyclerView;
        map.getClass();
        this.d = map;
        this.e = awkuVar;
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        admf admfVar;
        admo admoVar = this.b;
        adkz adkzVar = admoVar.f;
        int iA = adkzVar.a();
        ijm ijmVar = this.a;
        int iL = ijmVar.L(adkzVar, 0, iA);
        Map map = this.d;
        if (iL == 0) {
            map.clear();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getValue()).intValue();
            if (iIntValue > i) {
                entry.setValue(Integer.valueOf(iIntValue - i2));
            }
        }
        int iMin = Math.min(admoVar.a() - 1, ijmVar.M());
        int i3 = iMin;
        int i4 = 0;
        while (true) {
            RecyclerView recyclerView = this.c;
            if (i4 >= recyclerView.getChildCount()) {
                break;
            }
            View childAt = recyclerView.getChildAt(i4);
            if ((recyclerView.j(childAt) instanceof admf) && (admfVar = (admf) recyclerView.j(childAt)) != null) {
                adma admaVar = admfVar.s;
                int iB = admfVar.b();
                if (admaVar instanceof jfu) {
                    ((jfu) admaVar).m(ijmVar.K(admoVar.f, iB));
                } else if (admaVar instanceof jfv) {
                    ((jfv) admaVar).n(ijmVar.K(admoVar.f, iB));
                }
                i3 = iB;
            }
            i4++;
        }
        if (iMin > 0 && iMin < admoVar.a()) {
            admoVar.j(0, iMin);
        }
        if (i3 < 0 || i3 >= admoVar.a() - 1) {
            return;
        }
        admoVar.j(i3 + 1, (admoVar.a() - i3) - 1);
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        for (int iMin = Math.min(i, i2); iMin < Math.max(i, i2) + 1; iMin++) {
            admf admfVar = (admf) this.c.hG(iMin);
            if (admfVar != null) {
                adma admaVar = admfVar.s;
                if (admaVar instanceof jfu) {
                    ((jfu) admaVar).m(this.a.K(this.b.f, iMin));
                } else if (admaVar instanceof jfv) {
                    ((jfv) admaVar).n(this.a.K(this.b.f, iMin));
                }
            }
        }
        Map map = this.d;
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getValue()).intValue();
            if (i <= iIntValue && iIntValue <= i2) {
                entry.setValue(Integer.valueOf(iIntValue - 1));
            } else if (i2 <= iIntValue && iIntValue <= i) {
                entry.setValue(Integer.valueOf(iIntValue + 1));
            }
        }
        String strP = this.a.P(i2);
        if (!TextUtils.isEmpty(strP)) {
            map.put(strP, Integer.valueOf(i2));
        }
        awku awkuVar = this.e;
        if (awkuVar == null || map.isEmpty()) {
            return;
        }
        awkuVar.kk(Boolean.TRUE);
    }
}
