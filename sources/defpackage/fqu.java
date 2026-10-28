package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqu implements frj {
    public final GridLayoutManager a;
    public frh b;
    private final fqq c;

    public fqu(Context context, int i, int i2) {
        fqs fqsVar = new fqs(context, i, i2);
        this.a = fqsVar;
        fqq fqqVar = new fqq(this);
        this.c = fqqVar;
        fqsVar.g = fqqVar;
    }

    @Override // defpackage.frj
    public final int a(int i, int i2, int i3, int i4) {
        GridLayoutManager gridLayoutManager = this.a;
        return ((int) (gridLayoutManager.getOrientation() != 0 ? Math.ceil(((double) i4) / ((double) i2)) : Math.ceil(((double) i3) / ((double) i)))) * gridLayoutManager.b;
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
    public final int f(int i, ftg ftgVar) {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.getOrientation() != 0) {
            return 0;
        }
        Integer num = (Integer) ftgVar.f("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (ftgVar.j()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(ftgVar.a() * (((View.MeasureSpec.getSize(i) - gridLayoutManager.getPaddingTop()) - gridLayoutManager.getPaddingBottom()) / gridLayoutManager.b), 1073741824);
    }

    @Override // defpackage.frj
    public final int g(int i, ftg ftgVar) {
        GridLayoutManager gridLayoutManager = this.a;
        if (gridLayoutManager.getOrientation() == 0) {
            return 0;
        }
        Integer num = (Integer) ftgVar.f("OVERRIDE_SIZE");
        if (num != null) {
            return View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        if (ftgVar.j()) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(ftgVar.a() * (((View.MeasureSpec.getSize(i) - gridLayoutManager.getPaddingLeft()) - gridLayoutManager.getPaddingRight()) / gridLayoutManager.b), 1073741824);
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
        return new fqt(i, i2, i(), this.a.b);
    }

    @Override // defpackage.frj
    public final void l(int i, int i2) {
        this.a.scrollToPositionWithOffset(i, i2);
    }

    @Override // defpackage.frj
    public final void m(frh frhVar) {
        this.b = frhVar;
    }

    public fqu(GridLayoutManager gridLayoutManager, mm mmVar) {
        this.a = gridLayoutManager;
        gridLayoutManager.g = mmVar;
        this.c = null;
    }
}
