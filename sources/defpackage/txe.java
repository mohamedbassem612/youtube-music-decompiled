package defpackage;

import com.google.android.libraries.youtube.common.util.MemoryMappedBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class txe implements AutoCloseable {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final int d;
    public final /* synthetic */ MemoryMappedBuffer e;

    public txe(MemoryMappedBuffer memoryMappedBuffer) {
        this.e = memoryMappedBuffer;
        boolean z = memoryMappedBuffer.h == 2;
        this.a = z;
        boolean z2 = z && memoryMappedBuffer.a == null;
        this.b = z2;
        this.d = memoryMappedBuffer.b;
        if (!z2) {
            this.c = 0L;
        } else {
            this.c = memoryMappedBuffer.f;
            memoryMappedBuffer.g = this;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        MemoryMappedBuffer memoryMappedBuffer = this.e;
        memoryMappedBuffer.m(this.c, this.d);
        memoryMappedBuffer.g = null;
    }
}
