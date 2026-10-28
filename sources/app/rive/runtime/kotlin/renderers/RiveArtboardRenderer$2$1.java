package app.rive.runtime.kotlin.renderers;

import defpackage.awmy;
import defpackage.awrb;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class RiveArtboardRenderer$2$1 extends awrb implements Function0 {
    public RiveArtboardRenderer$2$1(Object obj) {
        super(0, obj, RiveArtboardRenderer.class, "start", "start()V", 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m597invoke() {
        ((RiveArtboardRenderer) this.receiver).start();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m597invoke();
        return awmy.a;
    }
}
