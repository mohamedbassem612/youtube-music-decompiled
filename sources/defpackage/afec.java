package defpackage;

import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class afec implements aexy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ LinearLayout a;

    public /* synthetic */ afec(LinearLayout linearLayout, int i) {
        this.$cid = i;
        this.a = linearLayout;
    }

    @Override // defpackage.aexy
    public final void a() {
        int i = this.$cid;
        if (i == 0) {
            afef afefVar = (afef) this.a;
            aewp.j(afefVar.d, afefVar.d());
            return;
        }
        LinearLayout linearLayout = this.a;
        if (i == 1) {
            CheckableImageButton checkableImageButton = ((afef) linearLayout).b;
            aewp.j(checkableImageButton, checkableImageButton.getContentDescription());
        } else {
            afeo afeoVar = (afeo) linearLayout;
            aewp.j(afeoVar.c, afeoVar.b());
        }
    }
}
