package com.google.android.libraries.blocks.runtime;

import defpackage.agek;
import defpackage.aiix;
import defpackage.mba;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeStreamReader implements AutoCloseable, mba {
    private final NativeStreamReader a;
    private final aiix b;
    private final agek c;

    public RuntimeStreamReader(long j, aiix aiixVar, agek agekVar) {
        this.a = new NativeStreamReader(j);
        this.b = aiixVar;
        this.c = agekVar;
    }

    @Override // defpackage.mba
    public final void a(Consumer consumer, Consumer consumer2) {
        RuntimeStreamReaderProxy runtimeStreamReaderProxy = new RuntimeStreamReaderProxy(this.b, consumer, consumer2, this.c);
        NativeStreamReader nativeStreamReader = this.a;
        nativeStreamReader.nativeSetReader(nativeStreamReader.a, runtimeStreamReaderProxy);
    }

    @Override // java.lang.AutoCloseable, defpackage.mba
    public final void close() {
        NativeStreamReader nativeStreamReader = this.a;
        nativeStreamReader.nativeReadsDone(nativeStreamReader.a);
    }
}
