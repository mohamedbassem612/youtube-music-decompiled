package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ord extends oqd {
    private LinearLayoutManager c;
    private final int d;

    public ord(atbv atbvVar, float f, float f2) {
        super(atbvVar.aW(), f, f2);
        this.d = atbvVar.bc();
    }

    private final boolean k() {
        return this.d != 2;
    }

    @Override // defpackage.oqd
    protected final LinearLayoutManager a(Context context) {
        LinearLayoutManager linearLayoutManager = this.c;
        if (linearLayoutManager != null) {
            return linearLayoutManager;
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(context, !f() ? 1 : 0, false);
        this.c = linearLayoutManager2;
        return linearLayoutManager2;
    }

    @Override // defpackage.oqd, defpackage.oqz
    public final boolean g(oqz oqzVar) {
        return super.g(oqzVar) && this.d == ((ord) oqzVar).d;
    }

    @Override // defpackage.oqz
    public final int h() {
        if (f() && k()) {
            return View.MeasureSpec.makeMeasureSpec((int) this.b, 1073741824);
        }
        return 0;
    }

    @Override // defpackage.oqz
    public final int i() {
        if (f() || !k()) {
            return 0;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.a, 1073741824);
    }

    @Override // defpackage.oqz
    public final oqy j() {
        return new orc(this);
    }
}
