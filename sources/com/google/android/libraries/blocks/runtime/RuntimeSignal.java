package com.google.android.libraries.blocks.runtime;

import com.google.protobuf.MessageLite;
import defpackage.avlh;
import defpackage.avmm;
import defpackage.avmn;
import defpackage.avni;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RuntimeSignal {
    private final int a;
    private final ClientCreatorProxy b;
    private final avmm c = new avmm();

    public RuntimeSignal(int i, ClientCreatorProxy clientCreatorProxy) {
        this.a = i;
        this.b = clientCreatorProxy;
    }

    public final avmn a(avlh avlhVar) {
        final ClientCreatorProxy clientCreatorProxy = this.b;
        final int i = this.a;
        avmn avmnVarAk = avlhVar.ak(new avni() { // from class: com.google.android.libraries.blocks.runtime.RuntimeSignal$$ExternalSyntheticLambda0
            @Override // defpackage.avni
            public final void a(Object obj) {
                clientCreatorProxy.a(((MessageLite) obj).toByteArray(), i);
            }
        });
        this.c.c(avmnVarAk);
        return avmnVarAk;
    }

    public final void b(MessageLite messageLite) {
        this.b.a(messageLite.toByteArray(), this.a);
    }

    protected final void finalize() {
        this.c.dispose();
    }
}
