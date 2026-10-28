package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.creation.common.ui.entrypoint.EntryPointView;
import com.google.android.libraries.youtube.creation.editor.image.mediagen.MediaGenInputView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class gki implements uim, uin, upq, upr, aupg {
    private final View a;
    private final ght b;
    private final gkg c;
    private final gjt d;

    public gki(ght ghtVar, gkg gkgVar, gjt gjtVar, View view) {
        this.b = ghtVar;
        this.c = gkgVar;
        this.d = gjtVar;
        this.a = view;
    }

    @Override // defpackage.uim
    public final uik a() {
        View view = this.a;
        if (!(view instanceof EntryPointView)) {
            throw new IllegalStateException(enb.d(view, uik.class, "Attempt to inject a View wrapper of type "));
        }
        EntryPointView entryPointView = (EntryPointView) view;
        entryPointView.getClass();
        vxe vxeVar = (vxe) this.d.i.io();
        ght ghtVar = this.b;
        return new uik(entryPointView, vxeVar, (tfq) ghtVar.cd.io());
    }

    @Override // defpackage.upq
    public final upo b() {
        View view = this.a;
        if (!(view instanceof MediaGenInputView)) {
            throw new IllegalStateException(enb.d(view, upo.class, "Attempt to inject a View wrapper of type "));
        }
        MediaGenInputView mediaGenInputView = (MediaGenInputView) view;
        mediaGenInputView.getClass();
        ght ghtVar = this.b;
        adxj adxjVar = (adxj) ghtVar.Ad.io();
        gjt gjtVar = this.d;
        aeda aedaVar = (aeda) gjtVar.W.io();
        vxe vxeVar = (vxe) gjtVar.i.io();
        xgn xgnVar = (xgn) ghtVar.kk.io();
        adhv adhvVar = (adhv) ghtVar.rB.io();
        vxz vxzVar = (vxz) ghtVar.um.io();
        gkg gkgVar = this.c;
        return new upo(mediaGenInputView, adxjVar, aedaVar, vxeVar, xgnVar, adhvVar, vxzVar, azu.f((bec) gkgVar.ap.io(), (awou) gkgVar.b.bn.io()));
    }

    @Override // defpackage.uin
    public final void c() {
    }

    @Override // defpackage.upr
    public final void d() {
    }
}
