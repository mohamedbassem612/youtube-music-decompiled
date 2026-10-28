package app.rive.core;

import app.rive.RenderBackend;
import defpackage.awqg;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class CommandQueue$Companion$createNativeCommandQueueResources$1 extends awrb implements awqg {
    public CommandQueue$Companion$createNativeCommandQueueResources$1(Object obj) {
        super(1, obj, CommandQueue.Companion.class, "createRenderContext", "createRenderContext(Lapp/rive/RenderBackend;)Lapp/rive/core/RenderContext;", 0);
    }

    @Override // defpackage.awqg
    public final RenderContext invoke(RenderBackend renderBackend) {
        renderBackend.getClass();
        return ((CommandQueue.Companion) this.receiver).createRenderContext(renderBackend);
    }
}
