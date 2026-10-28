package defpackage;

import android.content.DialogInterface;
import android.widget.EditText;
import com.google.android.apps.youtube.music.playlist.privacy.PlaylistPrivacySpinner;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class gth implements DialogInterface.OnClickListener {
    public final Object a;
    final /* synthetic */ gti b;
    private final ajwo c;

    public gth(gti gtiVar, ajwo ajwoVar, Object obj) {
        this.b = gtiVar;
        this.c = ajwoVar;
        this.a = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        gti gtiVar = this.b;
        wsg wsgVar = gtiVar.b;
        wsa wsaVarG = wsgVar.g();
        ajwo ajwoVar = this.c;
        wsaVarG.n(ajwoVar.c);
        PlaylistPrivacySpinner playlistPrivacySpinner = gtiVar.g;
        if (playlistPrivacySpinner != null) {
            wsaVarG.d = playlistPrivacySpinner.d();
        }
        EditText editText = gtiVar.f;
        if (editText != null) {
            wsaVarG.F(editText.getText().toString().trim());
        }
        aihl aihlVarCheckIsLite = aihn.checkIsLite(akgk.b);
        ajwoVar.c(aihlVarCheckIsLite);
        Object objK = ajwoVar.j.k(aihlVarCheckIsLite.d);
        akgk akgkVar = (akgk) (objK == null ? aihlVarCheckIsLite.b : aihlVarCheckIsLite.c(objK));
        Iterator it = akgkVar.f.iterator();
        while (it.hasNext()) {
            wsaVarG.e((String) it.next());
        }
        int i2 = akgkVar.c;
        if ((i2 & 1) != 0) {
            wsaVarG.b = akgkVar.g;
        }
        if ((i2 & 4) != 0) {
            wsaVarG.c = akgkVar.h;
        }
        wsgVar.i(wsaVarG, new gtg(this, 0));
        gtiVar.d.c(new haz(true, null));
    }
}
