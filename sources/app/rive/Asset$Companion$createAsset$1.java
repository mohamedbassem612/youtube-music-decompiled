package app.rive;

import defpackage.awoq;
import defpackage.awpg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class Asset$Companion$createAsset$1 extends awpg {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Asset.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Asset$Companion$createAsset$1(Asset.Companion companion, awoq awoqVar) {
        super(awoqVar);
        this.this$0 = companion;
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createAsset$third_party_java_android_libs_rive_rive_android(null, null, null, this);
    }
}
