package defpackage;

import com.google.android.libraries.elements.interfaces.JSCommandData;
import com.google.android.libraries.elements.interfaces.JSCommandResolver;
import com.google.android.libraries.elements.interfaces.JSPromiseResolver;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import io.grpc.Status;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhh extends JSCommandResolver {
    boolean a;
    private final WeakReference b;
    private final nry c;
    private final nrv d;

    public mhh(nry nryVar, nrv nrvVar, agev agevVar) {
        if (((Boolean) agevVar.e(Boolean.FALSE)).booleanValue()) {
            this.a = true;
            this.c = null;
            this.b = new WeakReference(nryVar);
        } else {
            this.a = false;
            this.c = nryVar;
            this.b = null;
        }
        this.d = nrvVar;
    }

    private final Status a(byte[] bArr, nrv nrvVar) {
        AtomicReference atomicReference = new AtomicReference(Status.OK);
        c(bArr, nrvVar).kp(new mhf(atomicReference));
        return (Status) atomicReference.get();
    }

    private final Status b(byte[] bArr, nrv nrvVar, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver == null) {
            return Status.d.withDescription("Failed to resolve command: resolver is null.");
        }
        c(bArr, nrvVar).kp(new mhg(jSPromiseResolver));
        return Status.OK;
    }

    private final avlb c(byte[] bArr, nrv nrvVar) {
        WeakReference weakReference;
        try {
            CommandOuterClass$Command commandOuterClass$Command = (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
            nry nryVar = (!this.a || (weakReference = this.b) == null) ? this.c : (nry) weakReference.get();
            return nryVar == null ? avlb.m(new nud("CommandResolver is null.")) : nryVar.c(commandOuterClass$Command, nrvVar, 1);
        } catch (aiik e) {
            throw new nud("Failed to parse command.", e);
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolve(byte[] bArr) {
        return a(bArr, this.d);
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver) {
        return b(bArr, this.d, jSPromiseResolver);
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolveAsyncWithData(byte[] bArr, JSCommandData jSCommandData, JSPromiseResolver jSPromiseResolver) {
        if (jSPromiseResolver == null) {
            return Status.d.withDescription("Failed to resolve command: resolver is null.");
        }
        return jSCommandData instanceof mhl ? b(bArr, ((mhl) jSCommandData).a, jSPromiseResolver) : Status.d.withDescription("Failed to resolve command: invalid event data supplied.");
    }

    @Override // com.google.android.libraries.elements.interfaces.JSCommandResolver
    public final Status resolveWithData(byte[] bArr, JSCommandData jSCommandData) {
        return jSCommandData instanceof mhl ? a(bArr, ((mhl) jSCommandData).a) : Status.d.withDescription("Failed to resolve command: invalid event data supplied.");
    }

    public mhh(nry nryVar, agev agevVar) {
        this(nryVar, nrv.d().a(), agevVar);
    }
}
