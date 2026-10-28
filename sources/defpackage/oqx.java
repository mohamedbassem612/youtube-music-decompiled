package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqx extends oqd {
    public final int c;
    private GridLayoutManager d;

    public oqx(atbv atbvVar, athk athkVar, float f, float f2) {
        super(atbvVar.aW(), f, f2);
        this.c = Memory.peekInt(athkVar.c + 12, false);
    }

    @Override // defpackage.oqd
    protected final /* bridge */ /* synthetic */ LinearLayoutManager a(Context context) {
        GridLayoutManager gridLayoutManager = this.d;
        if (gridLayoutManager != null) {
            return gridLayoutManager;
        }
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, this.c, !f() ? 1 : 0);
        this.d = gridLayoutManager2;
        return gridLayoutManager2;
    }

    @Override // defpackage.oqd, defpackage.oqz
    public final boolean g(oqz oqzVar) {
        return super.g(oqzVar) && this.c == ((oqx) oqzVar).c;
    }

    @Override // defpackage.oqz
    public final int h() {
        if (f()) {
            return View.MeasureSpec.makeMeasureSpec((int) (this.b / this.c), 1073741824);
        }
        return 0;
    }

    @Override // defpackage.oqz
    public final int i() {
        if (f()) {
            return 0;
        }
        return View.MeasureSpec.makeMeasureSpec((int) (this.a / this.c), 1073741824);
    }

    @Override // defpackage.oqz
    public final oqy j() {
        return new oqw(this);
    }
}
