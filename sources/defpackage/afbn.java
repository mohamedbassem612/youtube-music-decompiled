package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class afbn extends afbt {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public afbn(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.afbt
    public final void a(Matrix matrix, afau afauVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((afbt) it.next()).a(this.b, afauVar, i, canvas);
        }
    }
}
