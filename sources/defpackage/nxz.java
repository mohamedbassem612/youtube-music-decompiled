package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxz implements nso {
    private static final nxz a = new nxz(true);
    private static final nxz b = new nxz(false);
    private final boolean c;

    private nxz(boolean z) {
        this.c = z;
    }

    public static nxz d(boolean z) {
        return z ? a : b;
    }

    @Override // defpackage.nso
    public final nay a(byte[] bArr, boolean z) throws IOException {
        if (z) {
            try {
                try {
                    asmv asmvVar = (asmv) aihn.parseFrom(asmv.a, bArr, ExtensionRegistryLite.a);
                    asod asodVar = asmvVar.d;
                    if (asodVar == null) {
                        asodVar = asod.a;
                    }
                    aihh aihhVar = (aihh) asodVar.toBuilder();
                    aihl aihlVar = asri.b;
                    aihf aihfVarCreateBuilder = asri.a.createBuilder();
                    aihfVarCreateBuilder.copyOnWrite();
                    asri asriVar = (asri) aihfVarCreateBuilder.instance;
                    asriVar.c |= 2;
                    asriVar.d = ":0";
                    aihhVar.e(aihlVar, (asri) aihfVarCreateBuilder.build());
                    aihh aihhVar2 = (aihh) asmvVar.toBuilder();
                    aihhVar2.copyOnWrite();
                    asmv asmvVar2 = (asmv) aihhVar2.instance;
                    asod asodVar2 = (asod) aihhVar.build();
                    asodVar2.getClass();
                    asmvVar2.d = asodVar2;
                    asmvVar2.b |= 2;
                    bArr = ((asmv) aihhVar2.build()).toByteArray();
                } catch (aiik unused) {
                }
            } catch (RuntimeException e) {
                if (e.getMessage() == null || !e.getMessage().contains("Cannot decode upb message")) {
                    throw e;
                }
                throw new IOException("Failed to decode UPB Element", e);
            }
        }
        nkl nklVar = new nkl();
        nklVar.bH(bArr);
        return nklVar;
    }

    @Override // defpackage.nso
    public final ByteBuffer b(nay nayVar) {
        return ByteBuffer.wrap(nayVar.f());
    }

    @Override // defpackage.nso
    public final mxc c(mxc mxcVar) {
        if (this.c) {
            if (mxcVar instanceof ngf) {
                try {
                    nge ngeVarAR = ((ngf) mxcVar).aR();
                    ngeVarAR.aS();
                    return ngeVarAR.aR();
                } catch (RuntimeException e) {
                    throw new nud("Failed to mutate AttributedString", e);
                }
            }
            try {
                nge ngeVarAR2 = ngf.aS(mxcVar.f()).aR();
                ngeVarAR2.aS();
                return ngeVarAR2.aR();
            } catch (RuntimeException e2) {
                throw new nud("Failed to parse AttributedString", e2);
            }
        }
        try {
            byte[] bArrF = mxcVar.f();
            asxe asxeVar = new asxe();
            asxeVar.bH(bArrF);
            asxb asxbVar = new asxb(asxeVar.b);
            AtomicReference atomicReference = asxeVar.m;
            if (atomicReference.get() != null) {
                asxbVar.m.set((ArrayList) atomicReference.get());
                asxbVar.n = asxeVar.n;
                asxbVar.e = true;
            }
            AtomicReference atomicReference2 = asxeVar.o;
            if (atomicReference2.get() != null) {
                asxbVar.o.set((ArrayList) atomicReference2.get());
                asxbVar.p = asxeVar.p;
                asxbVar.f = true;
            }
            AtomicReference atomicReference3 = asxeVar.q;
            if (atomicReference3.get() != null) {
                asxbVar.q.set((ArrayList) atomicReference3.get());
                asxbVar.r = asxeVar.r;
                asxbVar.g = true;
            }
            AtomicReference atomicReference4 = asxeVar.s;
            if (atomicReference4.get() != null) {
                asxbVar.s.set((ArrayList) atomicReference4.get());
                asxbVar.t = asxeVar.t;
                asxbVar.h = true;
            }
            AtomicReference atomicReference5 = asxeVar.v;
            if (atomicReference5.get() != null) {
                asxbVar.v.set((ArrayList) atomicReference5.get());
                asxbVar.w = asxeVar.w;
                asxbVar.i = true;
            }
            AtomicReference atomicReference6 = asxeVar.x;
            if (atomicReference6.get() != null) {
                asxbVar.x.set((ArrayList) atomicReference6.get());
                asxbVar.y = asxeVar.y;
                asxbVar.j = true;
            }
            if (asxeVar.z != null) {
                asxbVar.z = asxeVar.z;
                asxbVar.u = asxeVar.u;
            }
            asxbVar.d = true;
            asxbVar.aZ("…");
            return ngf.aS(asxbVar.ba().f());
        } catch (RuntimeException e3) {
            throw new nud("Failed to parse AttributedString", e3);
        }
    }
}
