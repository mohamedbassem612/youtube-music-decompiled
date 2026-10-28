package com.google.android.libraries.blocks.runtime;

import com.google.protobuf.ExtensionRegistryLite;
import defpackage.agek;
import defpackage.aiix;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeStreamReaderProxy implements ReaderProxy {
    private final aiix a;
    private final agek b;
    private final Consumer c;
    private final Consumer d;

    public RuntimeStreamReaderProxy(aiix aiixVar, Consumer consumer, Consumer consumer2, agek agekVar) {
        this.a = aiixVar;
        this.c = consumer;
        this.d = consumer2;
        this.b = agekVar;
    }

    @Override // com.google.android.libraries.blocks.runtime.ReaderProxy
    public final void onStreamData(byte[] bArr) {
        this.c.accept(this.b.apply(this.a.h(bArr, ExtensionRegistryLite.getGeneratedRegistry())));
    }

    @Override // com.google.android.libraries.blocks.runtime.ReaderProxy
    public final void onStreamFinished(Throwable th) {
        this.d.accept(th);
    }
}
