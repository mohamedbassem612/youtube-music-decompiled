package com.google.android.libraries.blocks.runtime;

import defpackage.mba;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class InPlaceStreamReader implements AutoCloseable, mba {
    private final InPlaceStream a;

    public InPlaceStreamReader(InPlaceStream inPlaceStream) {
        this.a = inPlaceStream;
    }

    @Override // defpackage.mba
    public final void a(Consumer consumer, Consumer consumer2) {
        InPlaceStreamReaderProxy inPlaceStreamReaderProxy = new InPlaceStreamReaderProxy(consumer, consumer2);
        Object obj = InPlaceStream.a;
        InPlaceStream inPlaceStream = this.a;
        synchronized (obj) {
            if (inPlaceStream.f != InPlaceStream.ReadState.a) {
                throw new IllegalStateException("Attempted to open already open or closed stream.");
            }
            inPlaceStream.b = inPlaceStreamReaderProxy;
            Runnable runnable = inPlaceStream.c;
            inPlaceStream.f = InPlaceStream.ReadState.b;
            inPlaceStream.b();
        }
    }

    @Override // java.lang.AutoCloseable, defpackage.mba
    public final void close() {
        Object obj = InPlaceStream.a;
        InPlaceStream inPlaceStream = this.a;
        synchronized (obj) {
            InPlaceStream.ReadState readState = inPlaceStream.f;
            InPlaceStream.ReadState readState2 = InPlaceStream.ReadState.c;
            if (readState != readState2 && inPlaceStream.g != InPlaceStream.WriteState.c) {
                inPlaceStream.f = readState2;
                inPlaceStream.g = InPlaceStream.WriteState.b;
                Consumer consumer = inPlaceStream.d;
                if (consumer != null) {
                    consumer.accept(null);
                }
                inPlaceStream.d = null;
                inPlaceStream.c = null;
            }
            inPlaceStream.b();
        }
    }

    protected final void finalize() {
        close();
    }
}
