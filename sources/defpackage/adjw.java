package defpackage;

import android.content.ClipData;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adjw implements View.OnLongClickListener {
    private final /* synthetic */ int $cid;

    public adjw(int i) {
        this.$cid = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.$cid == 0) {
            view.startDrag(new ClipData("", new String[0], new ClipData.Item("")), new View.DragShadowBuilder(view), view, 0);
        }
        return true;
    }
}
