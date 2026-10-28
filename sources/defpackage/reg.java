package defpackage;

import com.google.android.libraries.video.mediaengine.textures.processors.SkiaTextureProcessor;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class reg extends rei {
    public final SkiaTextureProcessor a;
    final /* synthetic */ reh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reg(reh rehVar, SkiaTextureProcessor skiaTextureProcessor) {
        super(rehVar);
        this.b = rehVar;
        this.a = skiaTextureProcessor;
    }

    @Override // defpackage.rei
    public final boolean b(rjg rjgVar) {
        if (!rjgVar.b(rjf.l) && !rjgVar.b(rjf.i) && !rjgVar.b(rjf.h) && !rjgVar.b(rjf.v) && !rjgVar.b(rjf.k) && !rjgVar.b(rjf.n) && !rjgVar.b(rjf.o) && !rjgVar.b(rjf.p) && !rjgVar.b(rjf.m) && !rjgVar.b(rjf.b)) {
            return false;
        }
        SkiaTextureProcessor skiaTextureProcessor = this.a;
        reh rehVar = this.b;
        skiaTextureProcessor.j(rehVar.a);
        skiaTextureProcessor.i(rehVar.h());
        return true;
    }

    @Override // defpackage.rei
    protected final ren c(Duration duration) {
        return new ren(new ref(this));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.rei
    public final void a(Duration duration) {
    }
}
