package app.rive;

import app.rive.core.CommandQueue;
import defpackage.awoq;
import defpackage.awql;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class AssetsKt$rememberAudio$1$1 extends awrb implements awql {
    public AssetsKt$rememberAudio$1$1(Object obj) {
        super(3, obj, AudioAsset.Companion.class, "create", "create(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.awql
    public final Object invoke(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
        return ((AudioAsset.Companion) this.receiver).create(commandQueue, bArr, awoqVar);
    }
}
