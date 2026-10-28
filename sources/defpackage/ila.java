package defpackage;

import android.text.Editable;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ila implements afkj {
    final /* synthetic */ ilc a;

    public ila(ilc ilcVar) {
        this.a = ilcVar;
    }

    @Override // defpackage.afkj
    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
        ilc ilcVar = this.a;
        ((agrc) ((agrc) ilcVar.a.b()).j(th).k("com/google/android/apps/youtube/music/playlistfiltersearch/PlaylistFilterSearchInputFragment$fetchMetadataCallback$<anonymous>", "onFailure", 114, "PlaylistFilterSearchInputFragment.kt")).t("Error fetching playlist filter search metadata");
        ilcVar.h();
    }

    @Override // defpackage.afkj
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ilc ilcVar = this.a;
        EditText editText = ilcVar.b;
        if (editText == null) {
            awrc.b("searchEditText");
            editText = null;
        }
        Editable text = editText.getText();
        ilcVar.i(text != null ? text.toString() : null);
    }

    @Override // defpackage.afkj
    public final /* synthetic */ void b(Object obj) {
    }
}
