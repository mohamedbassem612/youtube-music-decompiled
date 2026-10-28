package defpackage;

import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uyh extends uhv {
    private final cc b;
    private final vqv c;
    private final vxz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyh(cc ccVar, vqv vqvVar, vxz vxzVar) {
        super(ccVar, true);
        ccVar.getClass();
        vqvVar.getClass();
        this.b = ccVar;
        this.c = vqvVar;
        this.d = vxzVar;
    }

    @Override // defpackage.uhv
    public final void j(View view) {
        View viewFindViewById;
        if (!this.d.l(599, 45838846L, false) || (viewFindViewById = view.findViewById(R.id.shorts_edit_player_view)) == null) {
            return;
        }
        vqv vqvVar = this.c;
        cc ccVar = this.b;
        vqvVar.e(ccVar.getLifecycle(), viewFindViewById);
        vqvVar.d = ccVar.getResources().getDimensionPixelSize(R.dimen.shorts_editor_shrunk_view_bottom_padding);
    }
}
