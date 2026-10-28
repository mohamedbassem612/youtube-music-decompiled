package com.google.android.libraries.blocks.runtime;

import com.google.android.libraries.blocks.StatusException;
import com.google.net.util.proto2api.Status$StatusProto;
import com.google.protobuf.MessageLite;
import defpackage.agek;
import defpackage.ahxw;
import defpackage.aihf;
import defpackage.aiov;
import defpackage.mbb;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class RuntimeStreamWriter implements AutoCloseable, mbb {
    public final NativeStreamWriter a;
    private final agek b;

    public RuntimeStreamWriter(long j, agek agekVar) {
        this.a = new NativeStreamWriter(j);
        this.b = agekVar;
    }

    private native void nativeOnClosed(long j, Consumer consumer);

    private native void nativeOnRead(long j, Runnable runnable);

    @Override // defpackage.mbb
    public final void a(Consumer consumer) {
        NativeStreamWriter nativeStreamWriter = this.a;
        nativeStreamWriter.nativeOnClosed(nativeStreamWriter.a, consumer);
    }

    @Override // defpackage.mbb
    public final void b() {
        close();
    }

    @Override // defpackage.mbb
    public final void c(Throwable th) {
        Status status;
        if (th == null) {
            close();
            return;
        }
        NativeStreamWriter nativeStreamWriter = this.a;
        if (th instanceof StatusException) {
            StatusException statusException = (StatusException) th;
            status = new Status(statusException.c, statusException.getMessage(), statusException.b);
        } else {
            status = new Status(ahxw.INTERNAL, th.getMessage(), null);
        }
        aihf aihfVarCreateBuilder = Status$StatusProto.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        Status$StatusProto status$StatusProto = (Status$StatusProto) aihfVarCreateBuilder.instance;
        status$StatusProto.b |= 1;
        status$StatusProto.c = status.a.s;
        aihfVarCreateBuilder.copyOnWrite();
        Status$StatusProto status$StatusProto2 = (Status$StatusProto) aihfVarCreateBuilder.instance;
        status$StatusProto2.b |= 2;
        status$StatusProto2.d = "generic";
        String str = status.b;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            Status$StatusProto status$StatusProto3 = (Status$StatusProto) aihfVarCreateBuilder.instance;
            status$StatusProto3.b |= 4;
            status$StatusProto3.e = str;
        }
        aiov aiovVar = status.c;
        if (aiovVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            Status$StatusProto status$StatusProto4 = (Status$StatusProto) aihfVarCreateBuilder.instance;
            status$StatusProto4.g = aiovVar;
            status$StatusProto4.b |= 16;
        }
        nativeStreamWriter.nativeWritesDoneWithError(nativeStreamWriter.a, ((Status$StatusProto) aihfVarCreateBuilder.build()).toByteArray());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeStreamWriter nativeStreamWriter = this.a;
        nativeStreamWriter.nativeWritesDone(nativeStreamWriter.a);
    }

    @Override // defpackage.mbb
    public final boolean d(Object obj) {
        byte[] byteArray = ((MessageLite) this.b.apply(obj)).toByteArray();
        NativeStreamWriter nativeStreamWriter = this.a;
        return nativeStreamWriter.nativeWrite(nativeStreamWriter.a, byteArray);
    }
}
