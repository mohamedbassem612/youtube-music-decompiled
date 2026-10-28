package defpackage;

import com.google.android.libraries.elements.interfaces.JSControllerInitializationMode;
import j$.util.Optional;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhn {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final JSControllerInitializationMode a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final byte[] i;
    public final boolean j;
    public final int k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;
    public final Optional p;
    public final boolean q;
    public final long r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public mhn(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, String str, byte[] bArr, boolean z6, int i2, int i3, String str2, int i4, boolean z7, Optional optional, boolean z8, long j, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22) {
        this.a = jSControllerInitializationMode;
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = str;
        this.i = bArr;
        this.j = z6;
        this.k = i2;
        this.l = i3;
        this.m = str2;
        this.n = i4;
        this.o = z7;
        this.p = optional;
        this.q = z8;
        this.r = j;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = z13;
        this.x = z14;
        this.y = z15;
        this.z = z16;
        this.A = z17;
        this.B = z18;
        this.C = z19;
        this.D = z20;
        this.E = z21;
        this.F = z22;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhn) {
            mhn mhnVar = (mhn) obj;
            if (this.a.equals(mhnVar.a) && this.b == mhnVar.b && this.c == mhnVar.c && this.d == mhnVar.d && this.e == mhnVar.e && this.f == mhnVar.f && this.g == mhnVar.g && this.h.equals(mhnVar.h)) {
                if (Arrays.equals(this.i, mhnVar instanceof mhn ? mhnVar.i : mhnVar.i) && this.j == mhnVar.j && this.k == mhnVar.k && this.l == mhnVar.l && this.m.equals(mhnVar.m) && this.n == mhnVar.n && this.o == mhnVar.o && this.p.equals(mhnVar.p) && this.q == mhnVar.q && this.r == mhnVar.r && this.s == mhnVar.s && this.t == mhnVar.t && this.u == mhnVar.u && this.v == mhnVar.v && this.w == mhnVar.w && this.x == mhnVar.x && this.y == mhnVar.y && this.z == mhnVar.z && this.A == mhnVar.A && this.B == mhnVar.B && this.C == mhnVar.C && this.D == mhnVar.D && this.E == mhnVar.E && this.F == mhnVar.F) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * (-721379959)) ^ this.h.hashCode()) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ this.p.hashCode();
        boolean z = this.q;
        long j = this.r;
        int i = ((((((((((((((iHashCode * 1000003) ^ (true != z ? 1237 : 1231)) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ (true != this.s ? 1237 : 1231)) * 1000003) ^ (true != this.t ? 1237 : 1231)) * 1000003) ^ (true != this.u ? 1237 : 1231)) * 1000003) ^ (true != this.v ? 1237 : 1231)) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003;
        int i2 = true != this.x ? 1237 : 1231;
        return ((((((((((((((((i ^ i2) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ (true != this.z ? 1237 : 1231)) * 1000003) ^ (true != this.A ? 1237 : 1231)) * 1000003) ^ (true != this.B ? 1237 : 1231)) * 1000003) ^ (true != this.C ? 1237 : 1231)) * 1000003) ^ (true != this.D ? 1237 : 1231)) * 1000003) ^ (true != this.E ? 1237 : 1231)) * 1000003) ^ (true == this.F ? 1231 : 1237);
    }

    public final String toString() {
        Optional optional = this.p;
        byte[] bArr = this.i;
        String strValueOf = String.valueOf(this.a);
        String string = Arrays.toString(bArr);
        String strValueOf2 = String.valueOf(optional);
        StringBuilder sb = new StringBuilder("JavaScriptConfig{initializationMode=");
        sb.append(strValueOf);
        sb.append(", enableVmContextLru=");
        sb.append(this.b);
        sb.append(", vmContextLruSize=");
        sb.append(this.c);
        sb.append(", shouldLockVmIsolate=");
        sb.append(this.d);
        sb.append(", shouldUseDirectJsObjectCreation=");
        sb.append(this.e);
        sb.append(", runOnLoadModuleHookOnBackgroundThread=");
        sb.append(this.f);
        sb.append(", jsClientErrorLoggerEnabled=");
        sb.append(this.g);
        sb.append(", jsEngineSelection=0, extraVmFlags=");
        sb.append(this.h);
        sb.append(", platformDetails=");
        sb.append(string);
        sb.append(", individualModuleLoading=");
        sb.append(this.j);
        sb.append(", compiledModuleCacheSize=");
        sb.append(this.k);
        sb.append(", compiledModuleDiskCacheSize=");
        sb.append(this.l);
        sb.append(", diskCachePath=");
        sb.append(this.m);
        sb.append(", diskCacheAppVersion=");
        sb.append(this.n);
        sb.append(", useLogJsSpanBinding=");
        sb.append(this.o);
        sb.append(", executorName=");
        sb.append(strValueOf2);
        sb.append(", pumpMessageLoop=");
        sb.append(this.q);
        sb.append(", idleMessageMicroseconds=");
        sb.append(this.r);
        sb.append(", enableAsyncInit=");
        sb.append(this.s);
        sb.append(", controllerDisposeLifecycleFix=");
        sb.append(this.t);
        sb.append(", controllerBackgroundDispose=");
        sb.append(this.u);
        boolean z = this.F;
        boolean z2 = this.E;
        boolean z3 = this.D;
        boolean z4 = this.C;
        boolean z5 = this.B;
        boolean z6 = this.A;
        boolean z7 = this.z;
        boolean z8 = this.y;
        boolean z9 = this.x;
        boolean z10 = this.w;
        boolean z11 = this.v;
        sb.append(", enableMultiLanguageStackTraceError=");
        sb.append(z11);
        sb.append(", enableControllerDisposalEarlyExit=");
        sb.append(z10);
        sb.append(", enableSwapProtoKernel=");
        sb.append(z9);
        sb.append(", asyncCallingThreadDispose=");
        sb.append(z8);
        sb.append(", executeCommandCallbackDispatch=");
        sb.append(z7);
        sb.append(", executeJsFunctionCommandAsync=");
        sb.append(z6);
        sb.append(", executeJsFunctionCommandAsyncAllCalls=");
        sb.append(z5);
        sb.append(", blocksEnableSignalsCallbackDispatch=");
        sb.append(z4);
        sb.append(", enableThreadSafeControllerExecutor=");
        sb.append(z3);
        sb.append(", useScopedCommandResolver=");
        sb.append(z2);
        sb.append(", enableControllerStateHolderDeadlockFix=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public mhn() {
        throw null;
    }
}
