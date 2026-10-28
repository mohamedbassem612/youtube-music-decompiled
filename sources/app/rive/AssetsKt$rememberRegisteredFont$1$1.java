package app.rive;

import app.rive.core.CommandQueue;
import defpackage.awoq;
import defpackage.awql;
import defpackage.awrb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class AssetsKt$rememberRegisteredFont$1$1 extends awrb implements awql {
    public AssetsKt$rememberRegisteredFont$1$1(Object obj) {
        super(3, obj, FontAsset.Companion.class, "create", "create(Lapp/rive/core/CommandQueue;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.awql
    public final Object invoke(CommandQueue commandQueue, byte[] bArr, awoq awoqVar) {
        return ((FontAsset.Companion) this.receiver).create(commandQueue, bArr, awoqVar);
    }
}
