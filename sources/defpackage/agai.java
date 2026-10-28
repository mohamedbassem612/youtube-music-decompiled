package defpackage;

import com.google.android.libraries.blocks.runtime.InstanceProxy;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ExtensionRegistryLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agai extends InstanceProxy {
    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final /* bridge */ /* synthetic */ mew a() {
        return null;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final ListenableFuture b(int i, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '419837186'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final void c(int i, long j, byte[] bArr) {
        throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '419837186'."));
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final boolean d(int i) {
        return i == 846025404;
    }

    @Override // com.google.android.libraries.blocks.runtime.InstanceProxy
    public final byte[] e(int i, byte[] bArr) {
        Optional optionalOf;
        Optional optionalOf2;
        aigv aigvVar;
        if (i != 846025404) {
            throw new IllegalArgumentException(a.bP(i, "No method found with identifier '", "' on block '419837186'."));
        }
        asfs asfsVar = (asfs) aihn.parseFrom(asfs.a, bArr, ExtensionRegistryLite.getGeneratedRegistry());
        ajtv ajtvVarA = ajtv.a(asfsVar.c);
        if (ajtvVarA == null) {
            ajtvVarA = ajtv.ERROR_LEVEL_UNKNOWN;
        }
        int iOrdinal = ajtvVarA.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            optionalOf = Optional.of(zvn.a);
        } else {
            optionalOf = iOrdinal != 3 ? Optional.empty() : Optional.of(zvn.b);
        }
        zvn zvnVar = (zvn) optionalOf.orElse(null);
        int iAu = afxw.au(asfsVar.d);
        switch ((iAu != 0 ? iAu : 1) - 1) {
            case 1:
                optionalOf2 = Optional.of(zvm.a);
                break;
            case 2:
                optionalOf2 = Optional.of(zvm.b);
                break;
            case 3:
                optionalOf2 = Optional.of(zvm.c);
                break;
            case 4:
                optionalOf2 = Optional.of(zvm.x);
                break;
            case 5:
                optionalOf2 = Optional.of(zvm.d);
                break;
            case 6:
                optionalOf2 = Optional.of(zvm.q);
                break;
            case 7:
                optionalOf2 = Optional.of(zvm.s);
                break;
            case 8:
                optionalOf2 = Optional.of(zvm.e);
                break;
            case 9:
                optionalOf2 = Optional.of(zvm.o);
                break;
            case 10:
                optionalOf2 = Optional.of(zvm.u);
                break;
            case 11:
                optionalOf2 = Optional.of(zvm.A);
                break;
            case 12:
                optionalOf2 = Optional.of(zvm.m);
                break;
            case 13:
                optionalOf2 = Optional.of(zvm.z);
                break;
            case 14:
                optionalOf2 = Optional.of(zvm.v);
                break;
            case 15:
                optionalOf2 = Optional.of(zvm.f);
                break;
            case 16:
                optionalOf2 = Optional.of(zvm.n);
                break;
            case 17:
                optionalOf2 = Optional.of(zvm.w);
                break;
            case 18:
                optionalOf2 = Optional.of(zvm.i);
                break;
            case 19:
                optionalOf2 = Optional.of(zvm.l);
                break;
            case 20:
                optionalOf2 = Optional.of(zvm.k);
                break;
            case 21:
                optionalOf2 = Optional.of(zvm.p);
                break;
            case 22:
                optionalOf2 = Optional.of(zvm.y);
                break;
            case 23:
            case 29:
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 41:
            case 42:
            case 43:
            case 57:
            case 66:
            case 67:
            default:
                optionalOf2 = Optional.empty();
                break;
            case 24:
                optionalOf2 = Optional.of(zvm.t);
                break;
            case 25:
                optionalOf2 = Optional.of(zvm.r);
                break;
            case 26:
                optionalOf2 = Optional.of(zvm.j);
                break;
            case 27:
                optionalOf2 = Optional.of(zvm.h);
                break;
            case 28:
                optionalOf2 = Optional.of(zvm.B);
                break;
            case 30:
                optionalOf2 = Optional.of(zvm.D);
                break;
            case 32:
                optionalOf2 = Optional.of(zvm.F);
                break;
            case 33:
                optionalOf2 = Optional.of(zvm.G);
                break;
            case 39:
                optionalOf2 = Optional.of(zvm.M);
                break;
            case 40:
                optionalOf2 = Optional.of(zvm.N);
                break;
            case 44:
                optionalOf2 = Optional.of(zvm.T);
                break;
            case 45:
                optionalOf2 = Optional.of(zvm.U);
                break;
            case 46:
                optionalOf2 = Optional.of(zvm.V);
                break;
            case 47:
                optionalOf2 = Optional.of(zvm.W);
                break;
            case 48:
                optionalOf2 = Optional.of(zvm.X);
                break;
            case 49:
                optionalOf2 = Optional.of(zvm.Y);
                break;
            case 50:
                optionalOf2 = Optional.of(zvm.Z);
                break;
            case 51:
                optionalOf2 = Optional.of(zvm.P);
                break;
            case 52:
                optionalOf2 = Optional.of(zvm.aa);
                break;
            case 53:
                optionalOf2 = Optional.of(zvm.ab);
                break;
            case 54:
                optionalOf2 = Optional.of(zvm.ac);
                break;
            case 55:
                optionalOf2 = Optional.of(zvm.ad);
                break;
            case 56:
                optionalOf2 = Optional.of(zvm.ae);
                break;
            case 58:
                optionalOf2 = Optional.of(zvm.ag);
                break;
            case 59:
                optionalOf2 = Optional.of(zvm.aj);
                break;
            case 60:
                optionalOf2 = Optional.of(zvm.ai);
                break;
            case 61:
                optionalOf2 = Optional.of(zvm.ah);
                break;
            case 62:
                optionalOf2 = Optional.of(zvm.ak);
                break;
            case 63:
                optionalOf2 = Optional.of(zvm.al);
                break;
            case 64:
                optionalOf2 = Optional.of(zvm.am);
                break;
            case 65:
                optionalOf2 = Optional.of(zvm.an);
                break;
            case 68:
                optionalOf2 = Optional.of(zvm.ap);
                break;
            case 69:
                optionalOf2 = Optional.of(zvm.aq);
                break;
            case 70:
                optionalOf2 = Optional.of(zvm.ar);
                break;
            case 71:
                optionalOf2 = Optional.of(zvm.as);
                break;
            case 72:
                optionalOf2 = Optional.of(zvm.at);
                break;
            case 73:
                optionalOf2 = Optional.of(zvm.au);
                break;
            case 74:
                optionalOf2 = Optional.of(zvm.av);
                break;
            case 75:
                optionalOf2 = Optional.of(zvm.O);
                break;
        }
        zvm zvmVar = (zvm) optionalOf2.orElse(null);
        if (zvnVar == null || zvmVar == null) {
            aigvVar = aigv.a;
        } else {
            if ((asfsVar.b & 4) != 0) {
                zvp.a(zvnVar, zvmVar, asfsVar.e);
            } else {
                zvp.a(zvnVar, zvmVar, null);
            }
            aigvVar = aigv.a;
        }
        return aigvVar.toByteArray();
    }
}
