package defpackage;

import android.widget.FrameLayout;
import com.google.android.libraries.youtube.creation.common.ui.entrypoint.EntryPointView;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class upk implements afph {
    private final /* synthetic */ int $cid;
    final /* synthetic */ FrameLayout a;

    public upk(FrameLayout frameLayout, int i) {
        this.$cid = i;
        this.a = frameLayout;
    }

    @Override // defpackage.afph
    public final void a(Object obj) {
        if (this.$cid != 0) {
            EntryPointView entryPointView = (EntryPointView) this.a;
            entryPointView.a = (uik) obj;
            entryPointView.a.f = entryPointView;
        } else {
            MediaGenInputView mediaGenInputView = (MediaGenInputView) this.a;
            mediaGenInputView.a = (upo) obj;
            mediaGenInputView.a.p = mediaGenInputView;
        }
    }
}
