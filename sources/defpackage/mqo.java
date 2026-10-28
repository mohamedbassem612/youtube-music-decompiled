package defpackage;

import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.ByteStore;
import com.google.android.libraries.elements.interfaces.CommandRunContext;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import com.google.android.libraries.elements.interfaces.LoggingDelegate;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class mqo extends CommandRunContext {
    public final nrv a;
    private final ByteStore b;
    private final mqp c;
    private final DebuggerClient d;

    public mqo(ByteStore byteStore, nrv nrvVar, DebuggerClient debuggerClient, mqp mqpVar) {
        this.b = byteStore;
        this.a = nrvVar;
        this.d = debuggerClient;
        this.c = mqpVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final BlockRegistryProvider blockRegistryProvider() {
        return this.a.i.H;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final String blockRegistryRef() {
        return this.a.i.G;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final ByteStore byteStore() {
        return this.b;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final DebuggerClient debuggerClient() {
        return this.d;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final boolean enableV2() {
        return false;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final LoggingDelegate logger() {
        return this.c;
    }

    @Override // com.google.android.libraries.elements.interfaces.CommandRunContext
    public final SenderStateOuterClass$SenderState senderState() {
        SenderStateOuterClass$SenderState senderStateOuterClass$SenderState = this.a.f;
        return senderStateOuterClass$SenderState == null ? SenderStateOuterClass$SenderState.getDefaultInstance() : senderStateOuterClass$SenderState;
    }
}
