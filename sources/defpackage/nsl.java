package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import com.google.android.libraries.elements.interfaces.ClientDataObservable;
import com.google.android.libraries.elements.interfaces.ContextSubscriptionInput;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nsl {
    public static final nsl a = b().a();
    public final AtomicReference A;
    public final MaterializationResult B;
    public final String C;
    public final String D;
    public final boolean E;
    public final ClientDataObservable F;
    public final String G;
    public final BlockRegistryProvider H;
    public final nrv I;
    public final agfr J;
    public final ContextSubscriptionInput K;
    public final mhc L;
    public final adfx M;
    public final WeakReference b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final int f;
    public final int g;
    public final nwy h;
    public final avnq i;
    public final float j;
    public final nt k;
    public final boolean l;
    public final StringBuilder m;
    public final String n;
    public final String o;
    public final WeakReference p;
    public final WeakReference q;
    public final agke r;
    public final agke s;
    public final ntg t;
    public final String u;
    public final String v;
    public final boolean w;
    public final ntx x;
    public final boolean y;
    public final int z;

    public nsl(WeakReference weakReference, Integer num, Integer num2, int i, int i2, int i3, nwy nwyVar, avnq avnqVar, float f, mhc mhcVar, nt ntVar, boolean z, StringBuilder sb, String str, String str2, WeakReference weakReference2, WeakReference weakReference3, adfx adfxVar, agke agkeVar, agke agkeVar2, ntg ntgVar, String str3, String str4, boolean z2, ntx ntxVar, boolean z3, int i4, AtomicReference atomicReference, MaterializationResult materializationResult, String str5, String str6, boolean z4, ClientDataObservable clientDataObservable, String str7, BlockRegistryProvider blockRegistryProvider, nrv nrvVar, agfr agfrVar, ContextSubscriptionInput contextSubscriptionInput) {
        this.b = weakReference;
        this.c = num;
        this.d = num2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = nwyVar;
        this.i = avnqVar;
        this.j = f;
        this.L = mhcVar;
        this.k = ntVar;
        this.l = z;
        this.m = sb;
        this.n = str;
        this.o = str2;
        this.p = weakReference2;
        this.q = weakReference3;
        this.M = adfxVar;
        this.r = agkeVar;
        this.s = agkeVar2;
        this.t = ntgVar;
        this.u = str3;
        this.v = str4;
        this.w = z2;
        this.x = ntxVar;
        this.y = z3;
        this.z = i4;
        this.A = atomicReference;
        this.B = materializationResult;
        this.C = str5;
        this.D = str6;
        this.E = z4;
        this.F = clientDataObservable;
        this.G = str7;
        this.H = blockRegistryProvider;
        this.I = nrvVar;
        this.J = agfrVar;
        this.K = contextSubscriptionInput;
    }

    public static nsk b() {
        nsk nskVar = new nsk();
        nskVar.c(true);
        nskVar.w = (short) (nskVar.w | 32);
        nskVar.p(true);
        nskVar.c = nwy.a;
        nskVar.f = new StringBuilder();
        nskVar.i(0.0f);
        nskVar.c(false);
        nskVar.k(false);
        nskVar.e(true);
        nskVar.h = "";
        nskVar.d(0);
        nskVar.h(-1);
        nskVar.g(-1);
        nskVar.f(-1);
        nskVar.g = "";
        agfr agfrVarAl = aguu.al(new jxp(8));
        if (agfrVarAl == null) {
            throw new NullPointerException("Null internalComposableRepositorySupplier");
        }
        nskVar.u = agfrVarAl;
        return nskVar;
    }

    public final View a() {
        WeakReference weakReference = this.b;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final agke c() {
        ntx ntxVar = this.x;
        return ntxVar != null ? ntxVar.h : this.r;
    }

    public final asnu d() {
        WeakReference weakReference = this.p;
        if (weakReference == null) {
            return null;
        }
        return (asnu) weakReference.get();
    }

    public final synchronized String e(String str) {
        StringBuilder sb = this.m;
        if (sb != null) {
            str = sb.toString();
        }
        return str;
    }

    public final boolean equals(Object obj) {
        nwy nwyVar;
        avnq avnqVar;
        mhc mhcVar;
        nt ntVar;
        StringBuilder sb;
        WeakReference weakReference;
        WeakReference weakReference2;
        adfx adfxVar;
        agke agkeVar;
        agke agkeVar2;
        ntg ntgVar;
        String str;
        String str2;
        ntx ntxVar;
        AtomicReference atomicReference;
        MaterializationResult materializationResult;
        String str3;
        String str4;
        ClientDataObservable clientDataObservable;
        String str5;
        BlockRegistryProvider blockRegistryProvider;
        nrv nrvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nsl) {
            nsl nslVar = (nsl) obj;
            WeakReference weakReference3 = this.b;
            if (weakReference3 != null ? weakReference3.equals(nslVar.b) : nslVar.b == null) {
                Integer num = this.c;
                if (num != null ? num.equals(nslVar.c) : nslVar.c == null) {
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(nslVar.d) : nslVar.d == null) {
                        if (this.e == nslVar.e && this.f == nslVar.f && this.g == nslVar.g && ((nwyVar = this.h) != null ? nwyVar.equals(nslVar.h) : nslVar.h == null) && ((avnqVar = this.i) != null ? avnqVar.equals(nslVar.i) : nslVar.i == null)) {
                            if (Float.floatToIntBits(this.j) == Float.floatToIntBits(nslVar.j) && ((mhcVar = this.L) != null ? mhcVar.equals(nslVar.L) : nslVar.L == null) && ((ntVar = this.k) != null ? ntVar.equals(nslVar.k) : nslVar.k == null) && this.l == nslVar.l && ((sb = this.m) != null ? sb.equals(nslVar.m) : nslVar.m == null) && this.n.equals(nslVar.n) && this.o.equals(nslVar.o) && ((weakReference = this.p) != null ? weakReference.equals(nslVar.p) : nslVar.p == null) && ((weakReference2 = this.q) != null ? weakReference2.equals(nslVar.q) : nslVar.q == null) && ((adfxVar = this.M) != null ? adfxVar.equals(nslVar.M) : nslVar.M == null) && ((agkeVar = this.r) != null ? aguu.v(agkeVar, nslVar.r) : nslVar.r == null) && ((agkeVar2 = this.s) != null ? aguu.v(agkeVar2, nslVar.s) : nslVar.s == null) && ((ntgVar = this.t) != null ? ntgVar.equals(nslVar.t) : nslVar.t == null) && ((str = this.u) != null ? str.equals(nslVar.u) : nslVar.u == null) && ((str2 = this.v) != null ? str2.equals(nslVar.v) : nslVar.v == null) && this.w == nslVar.w && ((ntxVar = this.x) != null ? ntxVar.equals(nslVar.x) : nslVar.x == null) && this.y == nslVar.y && this.z == nslVar.z && ((atomicReference = this.A) != null ? atomicReference.equals(nslVar.A) : nslVar.A == null) && ((materializationResult = this.B) != null ? materializationResult.equals(nslVar.B) : nslVar.B == null) && ((str3 = this.C) != null ? str3.equals(nslVar.C) : nslVar.C == null) && ((str4 = this.D) != null ? str4.equals(nslVar.D) : nslVar.D == null) && this.E == nslVar.E && ((clientDataObservable = this.F) != null ? clientDataObservable.equals(nslVar.F) : nslVar.F == null) && ((str5 = this.G) != null ? str5.equals(nslVar.G) : nslVar.G == null) && ((blockRegistryProvider = this.H) != null ? blockRegistryProvider.equals(nslVar.H) : nslVar.H == null) && ((nrvVar = this.I) != null ? nrvVar.equals(nslVar.I) : nslVar.I == null) && this.J.equals(nslVar.J)) {
                                ContextSubscriptionInput contextSubscriptionInput = this.K;
                                if (contextSubscriptionInput == null) {
                                    if (nslVar.K == null) {
                                        return true;
                                    }
                                } else if (contextSubscriptionInput.equals(nslVar.K)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final synchronized String f(String str) {
        return (String) qnl.br(e(""), false).orElse(str);
    }

    public final synchronized void g(String... strArr) {
        StringBuilder sb = this.m;
        if (sb != null) {
            for (int i = 0; i < 2; i++) {
                sb.append(strArr[i]);
            }
        }
    }

    public final boolean h() {
        ntx ntxVar = this.x;
        return ntxVar != null ? ntxVar.e : this.l;
    }

    public final int hashCode() {
        WeakReference weakReference = this.b;
        int iHashCode = weakReference == null ? 0 : weakReference.hashCode();
        Integer num = this.c;
        int iHashCode2 = (((iHashCode ^ 1000003) * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.d;
        int iHashCode3 = (((((((iHashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        nwy nwyVar = this.h;
        int iHashCode4 = (iHashCode3 ^ (nwyVar == null ? 0 : nwyVar.hashCode())) * 1000003;
        avnq avnqVar = this.i;
        int iHashCode5 = (((iHashCode4 ^ (avnqVar == null ? 0 : avnqVar.hashCode())) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003;
        mhc mhcVar = this.L;
        int iHashCode6 = (iHashCode5 ^ (mhcVar == null ? 0 : mhcVar.hashCode())) * 1000003;
        nt ntVar = this.k;
        int iHashCode7 = ((((iHashCode6 ^ (ntVar == null ? 0 : ntVar.hashCode())) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ 1237;
        StringBuilder sb = this.m;
        int iHashCode8 = ((((((iHashCode7 * (-721379959)) ^ (sb == null ? 0 : sb.hashCode())) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003;
        WeakReference weakReference2 = this.p;
        int iHashCode9 = (iHashCode8 ^ (weakReference2 == null ? 0 : weakReference2.hashCode())) * 1000003;
        WeakReference weakReference3 = this.q;
        int iHashCode10 = (iHashCode9 ^ (weakReference3 == null ? 0 : weakReference3.hashCode())) * 1000003;
        adfx adfxVar = this.M;
        int iHashCode11 = (iHashCode10 ^ (adfxVar == null ? 0 : adfxVar.hashCode())) * 1000003;
        agke agkeVar = this.r;
        int iHashCode12 = (iHashCode11 ^ (agkeVar == null ? 0 : agkeVar.hashCode())) * 1000003;
        agke agkeVar2 = this.s;
        int iHashCode13 = (iHashCode12 ^ (agkeVar2 == null ? 0 : agkeVar2.hashCode())) * 1000003;
        ntg ntgVar = this.t;
        int iHashCode14 = (iHashCode13 ^ (ntgVar == null ? 0 : ntgVar.hashCode())) * 1000003;
        String str = this.u;
        int iHashCode15 = (iHashCode14 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.v;
        int iHashCode16 = (((iHashCode15 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003;
        ntx ntxVar = this.x;
        int iHashCode17 = (((((iHashCode16 ^ (ntxVar == null ? 0 : ntxVar.hashCode())) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ this.z) * 1000003;
        AtomicReference atomicReference = this.A;
        int iHashCode18 = (iHashCode17 ^ (atomicReference == null ? 0 : atomicReference.hashCode())) * 1000003;
        MaterializationResult materializationResult = this.B;
        int iHashCode19 = (iHashCode18 ^ (materializationResult == null ? 0 : materializationResult.hashCode())) * 1000003;
        String str3 = this.C;
        int iHashCode20 = (iHashCode19 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.D;
        int iHashCode21 = (((iHashCode20 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true != this.E ? 1237 : 1231)) * 1000003;
        ClientDataObservable clientDataObservable = this.F;
        int iHashCode22 = (iHashCode21 ^ (clientDataObservable == null ? 0 : clientDataObservable.hashCode())) * 1000003;
        String str5 = this.G;
        int iHashCode23 = (iHashCode22 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        BlockRegistryProvider blockRegistryProvider = this.H;
        int iHashCode24 = (iHashCode23 ^ (blockRegistryProvider == null ? 0 : blockRegistryProvider.hashCode())) * 1000003;
        nrv nrvVar = this.I;
        int iHashCode25 = (((iHashCode24 ^ (nrvVar == null ? 0 : nrvVar.hashCode())) * 583896283) ^ this.J.hashCode()) * 1000003;
        ContextSubscriptionInput contextSubscriptionInput = this.K;
        return iHashCode25 ^ (contextSubscriptionInput != null ? contextSubscriptionInput.hashCode() : 0);
    }

    public final adfx i() {
        ntx ntxVar = this.x;
        return ntxVar != null ? ntxVar.i : this.M;
    }

    public final grj j() {
        return (grj) this.J.io();
    }

    public final String toString() {
        ContextSubscriptionInput contextSubscriptionInput = this.K;
        agfr agfrVar = this.J;
        nrv nrvVar = this.I;
        BlockRegistryProvider blockRegistryProvider = this.H;
        ClientDataObservable clientDataObservable = this.F;
        MaterializationResult materializationResult = this.B;
        AtomicReference atomicReference = this.A;
        ntx ntxVar = this.x;
        ntg ntgVar = this.t;
        agke agkeVar = this.s;
        agke agkeVar2 = this.r;
        adfx adfxVar = this.M;
        WeakReference weakReference = this.q;
        WeakReference weakReference2 = this.p;
        StringBuilder sb = this.m;
        nt ntVar = this.k;
        mhc mhcVar = this.L;
        avnq avnqVar = this.i;
        nwy nwyVar = this.h;
        String strValueOf = String.valueOf(this.b);
        String strValueOf2 = String.valueOf(nwyVar);
        String strValueOf3 = String.valueOf(avnqVar);
        String strValueOf4 = String.valueOf(mhcVar);
        String strValueOf5 = String.valueOf(ntVar);
        String strValueOf6 = String.valueOf(sb);
        String strValueOf7 = String.valueOf(weakReference2);
        String strValueOf8 = String.valueOf(weakReference);
        String strValueOf9 = String.valueOf(adfxVar);
        String strValueOf10 = String.valueOf(agkeVar2);
        String strValueOf11 = String.valueOf(agkeVar);
        String strValueOf12 = String.valueOf(ntgVar);
        String strValueOf13 = String.valueOf(ntxVar);
        String strValueOf14 = String.valueOf(atomicReference);
        String strValueOf15 = String.valueOf(materializationResult);
        String strValueOf16 = String.valueOf(clientDataObservable);
        String strValueOf17 = String.valueOf(blockRegistryProvider);
        String strValueOf18 = String.valueOf(nrvVar);
        String strValueOf19 = String.valueOf(agfrVar);
        String strValueOf20 = String.valueOf(contextSubscriptionInput);
        StringBuilder sb2 = new StringBuilder("ConversionContext{containerInternal=");
        sb2.append(strValueOf);
        sb2.append(", widthConstraint=");
        sb2.append(this.c);
        sb2.append(", heightConstraint=");
        sb2.append(this.d);
        sb2.append(", gridRowIndex=");
        sb2.append(this.e);
        sb2.append(", gridColumnCount=");
        sb2.append(this.f);
        sb2.append(", gridColumnIndex=");
        sb2.append(this.g);
        sb2.append(", templateLoggerFactory=");
        sb2.append(strValueOf2);
        sb2.append(", rootDisposableContainer=");
        sb2.append(strValueOf3);
        sb2.append(", imagePrefetchRangeRatio=");
        sb2.append(this.j);
        sb2.append(", horizontalCollectionTouchInterceptor=");
        sb2.append(strValueOf4);
        sb2.append(", horizontalCollectionSwipeProtector=");
        sb2.append(strValueOf5);
        sb2.append(", useIncrementalMountOnChildrenInternal=");
        sb2.append(this.l);
        sb2.append(", useLegacyVisibleInternal=false, recyclerBinderConfiguration=null, pathBuilder=");
        sb2.append(strValueOf6);
        String str = this.G;
        boolean z = this.E;
        String str2 = this.D;
        String str3 = this.C;
        int i = this.z;
        boolean z2 = this.y;
        boolean z3 = this.w;
        String str4 = this.v;
        String str5 = this.u;
        String str6 = this.o;
        String str7 = this.n;
        sb2.append(", elementId=");
        sb2.append(str7);
        sb2.append(", identifierProperty=");
        sb2.append(str6);
        sb2.append(", loggingNodeInternal=");
        sb2.append(strValueOf7);
        sb2.append(", parentLoggingNodeInternal=");
        sb2.append(strValueOf8);
        sb2.append(", elementsInteractionLoggerInternal=");
        sb2.append(strValueOf9);
        sb2.append(", globalCommandEventDataDecoratorsInternal=");
        sb2.append(strValueOf10);
        sb2.append(", globalCommandEventWithViewDataDecoratorsInternal=");
        sb2.append(strValueOf11);
        sb2.append(", decoratingElementBuilder=");
        sb2.append(strValueOf12);
        sb2.append(", debugId=");
        sb2.append(str5);
        sb2.append(", treeDebugId=");
        sb2.append(str4);
        sb2.append(", shouldAddDebuggerViewTags=");
        sb2.append(z3);
        sb2.append(", elementsConfigInternal=");
        sb2.append(strValueOf13);
        sb2.append(", couldOverlapWithElementsConfig=");
        sb2.append(z2);
        sb2.append(", elementDepthInTree=");
        sb2.append(i);
        sb2.append(", scrollStrategyListenerHolder=");
        sb2.append(strValueOf14);
        sb2.append(", materializationResult=");
        sb2.append(strValueOf15);
        sb2.append(", stylesheetId=");
        sb2.append(str3);
        sb2.append(", themeKey=");
        sb2.append(str2);
        sb2.append(", enableDroppedFrameLogging=");
        sb2.append(z);
        sb2.append(", clientDataObservableInternal=");
        sb2.append(strValueOf16);
        sb2.append(", blockRegistryRef=");
        sb2.append(str);
        sb2.append(", blockRegistryProvider=");
        sb2.append(strValueOf17);
        sb2.append(", propagatedCommandEventData=");
        sb2.append(strValueOf18);
        sb2.append(", renderNextServices=null, renderNextGroupScope=null, internalComposableRepositorySupplier=");
        sb2.append(strValueOf19);
        sb2.append(", contextSubscriptionInput=");
        sb2.append(strValueOf20);
        sb2.append('}');
        return sb2.toString();
    }

    public nsl() {
        throw null;
    }
}
