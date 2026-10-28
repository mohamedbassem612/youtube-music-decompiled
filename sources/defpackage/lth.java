package defpackage;

import com.google.android.icing.IcingSearchEngineImpl;
import java.io.Closeable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lth implements Closeable {
    public final IcingSearchEngineImpl a;

    public lth(luf lufVar) {
        this.a = new IcingSearchEngineImpl(lufVar.n());
    }

    public static void e(int i) {
        IcingSearchEngineImpl.nativeSetLoggingLevel((short) (i - 1), (short) 0);
    }

    public final lub a(String str, String str2, luc lucVar) {
        IcingSearchEngineImpl icingSearchEngineImpl = this.a;
        byte[] bArrN = lucVar.n();
        icingSearchEngineImpl.a();
        byte[] bArrNativeGet = IcingSearchEngineImpl.nativeGet(icingSearchEngineImpl, str, str2, bArrN);
        int length = bArrN.length;
        int i = ltk.a;
        lxq lxqVar = (lxq) ltk.c(bArrNativeGet, lub.d(), new lti(2));
        lxqVar.s();
        lub lubVar = (lub) lxqVar.a;
        lubVar.bitField0_ |= 32;
        lubVar.requestBytes_ = length;
        if (bArrNativeGet != null) {
            lxqVar.s();
            lub lubVar2 = (lub) lxqVar.a;
            lubVar2.bitField0_ |= 64;
            lubVar2.responseBytes_ = bArrNativeGet.length;
        }
        return (lub) lxqVar.o();
    }

    public final lud b() {
        IcingSearchEngineImpl icingSearchEngineImpl = this.a;
        icingSearchEngineImpl.a();
        return ltk.a(IcingSearchEngineImpl.nativeGetSchema(icingSearchEngineImpl));
    }

    public final luh c() {
        IcingSearchEngineImpl icingSearchEngineImpl = this.a;
        icingSearchEngineImpl.a();
        byte[] bArrNativeInitialize = IcingSearchEngineImpl.nativeInitialize(icingSearchEngineImpl);
        int i = ltk.a;
        lyo lyoVarC = ltk.c(bArrNativeInitialize, luh.d(), new lti(5));
        if (bArrNativeInitialize != null) {
            lxq lxqVar = (lxq) lyoVarC;
            lxqVar.s();
            luh luhVar = (luh) lxqVar.a;
            luhVar.bitField0_ |= 32;
            luhVar.responseBytes_ = bArrNativeInitialize.length;
        }
        return (luh) ((lxq) lyoVarC).o();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final lwh d() {
        IcingSearchEngineImpl icingSearchEngineImpl = this.a;
        icingSearchEngineImpl.a();
        byte[] bArrNativeGetStorageInfo = IcingSearchEngineImpl.nativeGetStorageInfo(icingSearchEngineImpl);
        int i = ltk.a;
        lyo lyoVarC = ltk.c(bArrNativeGetStorageInfo, lwh.d(), new lti(3));
        if (bArrNativeGetStorageInfo != null) {
            lxq lxqVar = (lxq) lyoVarC;
            lxqVar.s();
            lwh lwhVar = (lwh) lxqVar.a;
            lwhVar.bitField0_ |= 16;
            lwhVar.responseBytes_ = bArrNativeGetStorageInfo.length;
        }
        return (lwh) ((lxq) lyoVarC).o();
    }
}
