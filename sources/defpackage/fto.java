package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class fto extends od {
    final /* synthetic */ ftp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fto(ftp ftpVar, Context context) {
        super(context);
        this.a = ftpVar;
    }

    @Override // defpackage.od
    protected final float a(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.od
    protected final int b(int i) {
        return Math.min(100, super.b(i));
    }

    @Override // defpackage.od
    protected final void c(View view, ob obVar) {
        ftp ftpVar = this.a;
        int[] iArrC = ftpVar.c(ftpVar.b.n, view);
        int i = iArrC[0];
        int i2 = iArrC[1];
        int iJ = j(Math.max(Math.abs(i), Math.abs(i2)));
        if (iJ > 0) {
            obVar.b(i, i2, iJ, this.j);
        }
    }
}
