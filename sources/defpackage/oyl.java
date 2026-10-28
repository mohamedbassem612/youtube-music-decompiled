package defpackage;

import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oyl implements oyh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ View a;

    public /* synthetic */ oyl(View view, int i) {
        this.$cid = i;
        this.a = view;
    }

    @Override // defpackage.oyh
    public final void a(Canvas canvas) {
        int i = this.$cid;
        View view = this.a;
        if (i != 0) {
            ((oyk) view).av(canvas);
        } else {
            ((oyn) view).J(canvas);
        }
    }
}
