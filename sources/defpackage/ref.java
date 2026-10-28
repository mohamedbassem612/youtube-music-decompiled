package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ref implements rem {
    final /* synthetic */ reg a;

    public ref(reg regVar) {
        this.a = regVar;
    }

    @Override // defpackage.rem
    public final int a() {
        return ((quu) ((rcm) this.a.b.a.b)).a;
    }

    @Override // defpackage.rem
    public final void b(rfs rfsVar) {
        SkiaTextureProcessor skiaTextureProcessor = this.a.a;
        synchronized (skiaTextureProcessor.c) {
            if (!skiaTextureProcessor.l(rfsVar, true)) {
                throw new bvn("Failed to render the frame.");
            }
        }
        rgi.c("SkiaTextureProcessor.drawOnCurrentFrame");
    }
}
