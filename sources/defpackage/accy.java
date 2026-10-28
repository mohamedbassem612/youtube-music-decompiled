package defpackage;

import android.view.accessibility.CaptioningManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class accy extends CaptioningManager.CaptioningChangeListener {
    final /* synthetic */ acda a;

    public accy(acda acdaVar) {
        this.a = acdaVar;
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onFontScaleChanged(float f) {
        super.onFontScaleChanged(f);
        this.a.c(f);
    }

    @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
    public final void onUserStyleChanged(CaptioningManager.CaptionStyle captionStyle) {
        super.onUserStyleChanged(captionStyle);
        acda acdaVar = this.a;
        acdaVar.d(new accp(captionStyle, (vxz) acdaVar.e));
    }
}
