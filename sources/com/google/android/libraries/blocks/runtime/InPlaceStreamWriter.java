package com.google.android.libraries.blocks.runtime;

import defpackage.mbb;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class InPlaceStreamWriter implements AutoCloseable, mbb {
    private final InPlaceStream a;

    public InPlaceStreamWriter(InPlaceStream inPlaceStream) {
        this.a = inPlaceStream;
    }

    @Override // defpackage.mbb
    public final void a(Consumer consumer) {
        this.a.d = consumer;
    }

    @Override // defpackage.mbb
    public final void b() {
        this.a.c(null);
    }

    @Override // defpackage.mbb
    public final void c(Throwable th) {
        this.a.c(th);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // defpackage.mbb
    public final /* bridge */ /* synthetic */ boolean d(Object obj) {
        Object obj2 = InPlaceStream.a;
        InPlaceStream inPlaceStream = this.a;
        synchronized (obj2) {
            if (inPlaceStream.g != InPlaceStream.WriteState.a) {
                return false;
            }
            inPlaceStream.e.add(obj);
            inPlaceStream.b();
            return true;
        }
    }

    protected final void finalize() {
        b();
    }
}
