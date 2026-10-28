package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class frl implements frj {
    private final LinearLayoutManager a;

    public frl(Context context, int i) {
        frk frkVar = new frk(context, i);
        this.a = frkVar;
        frkVar.setMeasurementCacheEnabled(false);
    }

    @Override // defpackage.frj
    public final int a(int i, int i2, int i3, int i4) {
        int iCeil = (int) (this.a.getOrientation() != 0 ? Math.ceil(i4 / i2) : Math.ceil(i3 / i));
        int i5 = 2;
        if (iCeil >= 2) {
            i5 = 10;
            if (iCeil <= 10) {
                return iCeil;
            }
        }
        return i5;
    }

    @Override // defpackage.fux
    public final int b() {
        return this.a.findFirstCompletelyVisibleItemPosition();
    }

    @Override // defpackage.fux
    public final int c() {
        return this.a.findFirstVisibleItemPosition();
    }

    @Override // defpackage.fux
    public final int d() {
        return this.a.findLastCompletelyVisibleItemPosition();
    }

    @Override // defpackage.fux
    public final int e() {
        return this.a.findLastVisibleItemPosition();
    }

    @Override // defpackage.frj
    public int f(int i, ftg ftgVar) {
        if (this.a.getOrientation() != 0) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.frj
    public final int g(int i, ftg ftgVar) {
        if (this.a.getOrientation() == 0) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.fux
    public final int h() {
        return this.a.getItemCount();
    }

    @Override // defpackage.frj
    public final int i() {
        return this.a.getOrientation();
    }

    @Override // defpackage.frj
    public final np j() {
        return this.a;
    }

    @Override // defpackage.frj
    public final /* bridge */ /* synthetic */ fri k(int i, int i2) {
        return new mor(i, i2, i(), 1);
    }

    @Override // defpackage.frj
    public final void l(int i, int i2) {
        this.a.scrollToPositionWithOffset(i, i2);
    }

    public frl(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // defpackage.frj
    public final void m(frh frhVar) {
    }
}
