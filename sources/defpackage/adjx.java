package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adjx implements View.OnDragListener {
    final /* synthetic */ adjy a;

    public adjx(adjy adjyVar) {
        this.a = adjyVar;
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 3) {
            dragEvent.getY();
            return true;
        }
        if (action != 4) {
            return true;
        }
        int y = (int) dragEvent.getY();
        adjy adjyVar = this.a;
        int i = adjyVar.d ? y - 30 : y - 60;
        if (i < 36) {
            i = 36;
        }
        adjyVar.a.setPadding(0, i, 0, 0);
        return true;
    }
}
