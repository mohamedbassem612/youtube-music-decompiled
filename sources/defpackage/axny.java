package defpackage;

import app.rive.semantics.SemanticState;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axny implements axoi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ axoa a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ axny(axoa axoaVar, boolean z, int i) {
        this.$cid = i;
        this.a = axoaVar;
        this.b = z;
    }

    @Override // defpackage.axoi
    public final void a() throws IOException {
        int i = this.$cid;
        axoa axoaVar = this.a;
        if (i != 0) {
            axox axoxVar = axoaVar.c;
            long length = axoxVar.getLength();
            axoaVar.e = length;
            if (length == 0) {
                axoaVar.f();
                return;
            }
            if (length <= 0 || length >= 8192) {
                axoaVar.d = ByteBuffer.allocateDirect(SemanticState.Multiline);
            } else {
                axoaVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            }
            long j = axoaVar.e;
            if (j > 0) {
                axoaVar.h.setFixedLengthStreamingMode(j);
            } else {
                axoaVar.h.setChunkedStreamingMode(SemanticState.Multiline);
            }
            if (this.b) {
                axoaVar.c();
                return;
            } else {
                axoaVar.a.set(1);
                axoxVar.rewind(axoaVar);
                return;
            }
        }
        long j2 = axoaVar.e;
        if (j2 != -1 && j2 - axoaVar.f < axoaVar.d.remaining()) {
            axoaVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(axoaVar.f + ((long) axoaVar.d.remaining())), Long.valueOf(axoaVar.e))));
            return;
        }
        boolean z = this.b;
        if (axoaVar.d.remaining() == 0 && !z) {
            axoaVar.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = axoaVar.f;
        ByteBuffer byteBuffer = axoaVar.d;
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += axoaVar.i.write(byteBuffer);
        }
        axoaVar.j.flush();
        long j4 = j3 + ((long) iWrite);
        axoaVar.f = j4;
        long j5 = axoaVar.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                axoaVar.f();
                return;
            } else if (j5 == j4) {
                axoaVar.f();
                return;
            } else {
                axoaVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(axoaVar.f), Long.valueOf(axoaVar.e))));
                return;
            }
        }
        axoaVar.a.set(0);
        axoaVar.b();
    }
}
