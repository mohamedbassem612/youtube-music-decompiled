package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.adl.UpbMessageValueUtils;
import com.google.android.libraries.elements.adl.UpbMiniTable;
import com.google.android.libraries.elements.interfaces.JSEnvironment;
import com.google.android.libraries.elements.interfaces.JSModuleCache;
import com.google.common.util.concurrent.MoreExecutors;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ksy {
    public static aedj a;
    private static Context b;
    private static Boolean c;

    public ksy() {
    }

    public static void A(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            int iG = g(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            h(parcel, iG);
        }
    }

    public static void B(Parcel parcel, int i, String str) {
        if (str != null) {
            int iG = g(parcel, i);
            parcel.writeString(str);
            h(parcel, iG);
        }
    }

    public static void C(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            int iG = g(parcel, i);
            parcel.writeStringArray(strArr);
            h(parcel, iG);
        }
    }

    public static void D(Parcel parcel, int i, List list) {
        if (list != null) {
            int iG = g(parcel, i);
            parcel.writeStringList(list);
            h(parcel, iG);
        }
    }

    public static void E(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int iG = g(parcel, i);
            parcel.writeInt(parcelableArr.length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, parcelable, i2);
                }
            }
            h(parcel, iG);
        }
    }

    public static void F(Parcel parcel, int i, List list) {
        if (list != null) {
            int iG = g(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    n(parcel, parcelable, 0);
                }
            }
            h(parcel, iG);
        }
    }

    public static double G(Parcel parcel, int i) {
        Z(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float H(Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int I(Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt();
    }

    public static int J(Parcel parcel, int i) {
        int i2 = (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
        if (i2 < 0 || parcel.dataPosition() + i2 > parcel.dataSize()) {
            throw new krz(a.bR(i2, "Invalid field size: "), parcel);
        }
        return i2;
    }

    public static int K(Parcel parcel) {
        int i = parcel.readInt();
        int iJ = J(parcel, i);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new krz("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iJ + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new krz(a.bQ(i2, iDataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i2;
    }

    public static long L(Parcel parcel, int i) {
        Z(parcel, i, 8);
        return parcel.readLong();
    }

    public static Bundle M(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iJ);
        return bundle;
    }

    public static IBinder N(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iJ);
        return strongBinder;
    }

    public static Parcelable O(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iJ);
        return parcelable;
    }

    public static Boolean P(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        ai(parcel, iJ, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Float Q(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        ai(parcel, iJ, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer R(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        ai(parcel, iJ, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long S(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        if (iJ == 0) {
            return null;
        }
        ai(parcel, iJ, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String T(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iJ);
        return string;
    }

    public static ArrayList U(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayList;
    }

    public static ArrayList V(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayList;
    }

    public static ArrayList W(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateStringArrayList;
    }

    public static ArrayList X(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return arrayListCreateTypedArrayList;
    }

    public static void Y(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new krz(a.bR(i, "Overread allowed size end="), parcel);
        }
    }

    public static void Z(Parcel parcel, int i, int i2) {
        int iJ = J(parcel, i);
        if (iJ == i2) {
            return;
        }
        throw new krz("Expected size " + i2 + " got " + iJ + " (0x" + Integer.toHexString(iJ) + ')', parcel);
    }

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static JSModuleCache aA() {
        meg.a();
        JSModuleCache jSModuleCacheCreate = JSModuleCache.create();
        if (jSModuleCacheCreate != null) {
            return jSModuleCacheCreate;
        }
        throw new RuntimeException("JS Module Cache not created - was it included in the .so?");
    }

    public static UpbMessage aB(long j, UpbMiniTable upbMiniTable, long j2) {
        return new UpbMessage(j, upbMiniTable, UpbArena.a(j2));
    }

    public static long[] aC(mew mewVar) {
        UpbMessage upbMessage = mewVar.b;
        long j = upbMessage.a;
        long j2 = upbMessage.c.a;
        return new long[]{j, !UpbArena.jniIncrementReferenceCount(j2) ? 0L : Long.rotateLeft(j2, 16) ^ 6148914691236517205L};
    }

    public static int aD(met metVar) {
        if (metVar instanceof meq) {
            return ((meq) metVar).a();
        }
        if (!(metVar instanceof mew)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(String.valueOf(metVar.getClass()))));
        }
        UpbMessage upbMessage = ((mew) metVar).b;
        return upbMessage.jniGetFirstExtensionOrUnknownFieldNumber(upbMessage.a);
    }

    public static met aE(met metVar, mep mepVar, UpbArena upbArena) {
        UpbMessage upbMessage;
        if (!(metVar instanceof mew)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(String.valueOf(metVar.getClass()))));
        }
        UpbMessage upbMessage2 = ((mew) metVar).b;
        long jA = mepVar.a();
        UpbMiniTable upbMiniTableD = mepVar.d();
        long jJniGetExtensionIntoArena = UpbMessage.jniGetExtensionIntoArena(upbMessage2.a, jA, upbArena.a);
        if (jJniGetExtensionIntoArena == 0) {
            upbMessage = null;
        } else {
            long j = 1 & jJniGetExtensionIntoArena;
            long j2 = jJniGetExtensionIntoArena & (-2);
            if (j != 0) {
                upbArena = upbMessage2.c;
            }
            upbMessage = new UpbMessage(j2, upbMiniTableD, upbArena);
        }
        return mepVar.c(upbMessage);
    }

    public static agke aF(met metVar, int i) {
        if (metVar instanceof meq) {
            return ((meq) metVar).b(i);
        }
        if (!(metVar instanceof mew)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(String.valueOf(metVar.getClass()))));
        }
        UpbMessage upbMessage = ((mew) metVar).b;
        long j = upbMessage.a;
        UpbArena upbArena = upbMessage.c;
        Object[] objArrJniGetExtensionOrUnknownField = upbMessage.jniGetExtensionOrUnknownField(j, i, upbArena.a, UpbMessageValueUtils.a);
        agjz agjzVar = new agjz(objArrJniGetExtensionOrUnknownField.length);
        for (Object obj : objArrJniGetExtensionOrUnknownField) {
            agjzVar.h(UpbMessageValueUtils.a(obj, upbArena));
        }
        return agjzVar.g();
    }

    public static int[] aG(met metVar) {
        if (metVar instanceof meq) {
            return ((meq) metVar).c();
        }
        if (!(metVar instanceof mew)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(String.valueOf(metVar.getClass()))));
        }
        UpbMessage upbMessage = ((mew) metVar).b;
        return upbMessage.jniGetExtensionOrUnknownFieldNumbers(upbMessage.a);
    }

    public static asnu aH(asnw asnwVar, asnu asnuVar, nsl nslVar, String str) {
        if (str == null && (str = nslVar.o) == null) {
            str = "";
        }
        int i = agxm.b;
        agxk agxkVarF = agxy.b.f();
        agxkVarF.k(asnuVar == null ? 0 : asnuVar.d);
        agxkVarF.j(str);
        agxkVarF.h(asnwVar.toByteArray());
        aihf aihfVarCreateBuilder = asnu.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        asnu asnuVar2 = (asnu) aihfVarCreateBuilder.instance;
        asnwVar.getClass();
        asnuVar2.c = asnwVar;
        asnuVar2.b |= 1;
        int iA = agxkVarF.o().a();
        aihfVarCreateBuilder.copyOnWrite();
        asnu asnuVar3 = (asnu) aihfVarCreateBuilder.instance;
        asnuVar3.b |= 2;
        asnuVar3.d = iA;
        if (asnuVar != null) {
            int i2 = asnuVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            asnu asnuVar4 = (asnu) aihfVarCreateBuilder.instance;
            asnuVar4.b |= 4;
            asnuVar4.e = i2;
        }
        return (asnu) aihfVarCreateBuilder.build();
    }

    public static long aI(boolean z, boolean z2, boolean z3, int i, int i2, int i3, long j) {
        long j2 = true != z ? 0L : 1L;
        return (((((((((((j2 << 1) | (true != z2 ? 0L : 1L)) << 1) | (true == z3 ? 1L : 0L)) << 6) | ((long) ((i + 21) & 63))) << 6) | ((long) (i2 + 21))) << 6) | ((long) ((i3 + 21) & 63))) << 43) | (j & 8796093022207L);
    }

    public static mcp aJ(Map map) {
        mcp mcnVar;
        agpn agpnVar = (agpn) map;
        int i = agpnVar.d;
        if (i == 0) {
            mcnVar = new mcn();
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("More than 1 ThreadMonitoringConfiguration");
            }
            mcnVar = (mcp) aguu.C(((agpl) agpnVar.keySet()).iterator());
        }
        mcnVar.d();
        mcnVar.d();
        mcnVar.d();
        mcnVar.e();
        mcnVar.e();
        mcnVar.a();
        mcnVar.a();
        mcnVar.a();
        mcnVar.b();
        mcnVar.b();
        mcnVar.c();
        mcnVar.c();
        mcnVar.c();
        mcnVar.f();
        mcnVar.f();
        return mcnVar;
    }

    public static ThreadFactory aK(String str, ThreadFactory threadFactory) {
        ahfi ahfiVar = new ahfi();
        ahfiVar.b();
        ahfiVar.c(str.concat(" Thread #%d"));
        ahfiVar.d(threadFactory);
        return ahfi.a(ahfiVar);
    }

    public static ExecutorService aL(mdh mdhVar, ThreadFactory threadFactory, mdm mdmVar) {
        if (mdhVar.c) {
            threadFactory = new mdo(threadFactory, mdmVar, 0);
        }
        return new agzc(mdhVar.b, mdhVar.d != mdj.a ? new mdk(threadFactory, 0) : threadFactory, true, new iqc(mdmVar, 19), new iqc(mdmVar, 20));
    }

    public static ahey aM(ThreadFactory threadFactory, ahey aheyVar, agev agevVar) {
        ThreadFactory threadFactoryAK = aK("Blocking", new kyn(new kyn(threadFactory, 3), 2));
        return new mbr(MoreExecutors.a(new mbu(new mbh(TimeUnit.SECONDS, new SynchronousQueue(), threadFactoryAK), (zhk) ((agfa) agevVar).a)), aheyVar);
    }

    public static ntv aN(mla mlaVar, nvp nvpVar, final nry nryVar, final nxl nxlVar, final nuc nucVar, agev agevVar, final omj omjVar, final boolean z, agev agevVar2, final Map map, agev agevVar3, agev agevVar4, final avmb avmbVar, final avmb avmbVar2) {
        final nso nsoVar = (nso) agevVar.e(nxy.a);
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar3.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar4.e(bool)).booleanValue();
        final omj omjVar2 = new omj(nucVar);
        return mlaVar.a(nvpVar, new mky() { // from class: mjw
            /* JADX WARN: Code duplicated, block: B:12:0x0055  */
            /* JADX WARN: Code duplicated, block: B:14:0x0075  */
            /* JADX WARN: Code duplicated, block: B:15:0x007e  */
            /* JADX WARN: Code duplicated, block: B:18:0x008d  */
            /* JADX WARN: Code duplicated, block: B:19:0x0096  */
            /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:23:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
            /* JADX WARN: Code duplicated, block: B:31:0x00ec  */
            /* JADX WARN: Code duplicated, block: B:34:0x0102  */
            /* JADX WARN: Code duplicated, block: B:36:0x0122  */
            /* JADX WARN: Code duplicated, block: B:37:0x012b  */
            /* JADX WARN: Code duplicated, block: B:40:0x013a  */
            /* JADX WARN: Code duplicated, block: B:41:0x0143  */
            /* JADX WARN: Code duplicated, block: B:44:0x0152  */
            /* JADX WARN: Code duplicated, block: B:45:0x015b  */
            /* JADX WARN: Code duplicated, block: B:48:0x0169  */
            /* JADX WARN: Code duplicated, block: B:53:0x0193  */
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                boolean zM;
                boolean zO;
                boolean zH;
                boolean zN;
                boolean zI;
                Map map2;
                boolean z2;
                nso nsoVar2;
                omj omjVar3;
                nuc nucVar2;
                nxl nxlVar2;
                omj omjVar4;
                boolean z3;
                nry nryVar2;
                omj omjVarB;
                omj omjVarB2;
                omj omjVarB3;
                boolean z4;
                omj omjVarB4;
                omj omjVarB5;
                omj omjVarB6;
                boolean z5;
                nar narVar = (nar) obj;
                if (!zBooleanValue) {
                    mep mepVar = nbl.T;
                    if (ndsVar.e(mepVar)) {
                        nbl nblVar = (nbl) ndsVar.d(mepVar);
                        zO = nblVar.o();
                        zH = nblVar.h();
                        zN = nblVar.n();
                        zI = nblVar.i();
                        zM = nblVar.m();
                    } else {
                        zM = false;
                        zO = false;
                    }
                    map2 = map;
                    z2 = z;
                    nsoVar2 = nsoVar;
                    omjVar3 = omjVar;
                    nucVar2 = nucVar;
                    nxlVar2 = nxlVar;
                    omjVar4 = omjVar2;
                    z3 = zO;
                    nryVar2 = nryVar;
                    boolean z6 = zI;
                    if (z3) {
                        mjx mjxVar = new mjx(fhdVar, new mka());
                        mka mkaVar = mjxVar.a;
                        mkaVar.a = nryVar2;
                        BitSet bitSet = mjxVar.d;
                        bitSet.set(0);
                        mkaVar.d = narVar;
                        bitSet.set(3);
                        if (narVar.z()) {
                            omjVarB4 = omjVar4.B(narVar.n(), nslVar);
                        } else {
                            omjVarB4 = null;
                        }
                        mkaVar.t = omjVarB4;
                        bitSet.set(8);
                        if (narVar.A()) {
                            omjVarB5 = omjVar4.B(narVar.o(), nslVar);
                        } else {
                            omjVarB5 = null;
                        }
                        mkaVar.u = omjVarB5;
                        bitSet.set(9);
                        if (narVar.y()) {
                            omjVarB6 = omjVar4.B(narVar.m(), nslVar);
                        } else {
                            omjVarB6 = null;
                        }
                        mkaVar.s = omjVarB6;
                        bitSet.set(7);
                        mkaVar.v = narVar.C() ? omjVar4.B(narVar.q(), nslVar) : null;
                        bitSet.set(10);
                        mkaVar.r = nxlVar2;
                        bitSet.set(12);
                        mkaVar.g = nucVar2;
                        bitSet.set(6);
                        mkaVar.w = omjVar3;
                        bitSet.set(5);
                        mkaVar.c = nsoVar2;
                        bitSet.set(2);
                        if (!z2 || z6) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        mkaVar.f = z5;
                        bitSet.set(4);
                        mkaVar.b = nslVar;
                        bitSet.set(1);
                        mkaVar.q = map2;
                        bitSet.set(11);
                        mkaVar.e = zM;
                        return mjxVar;
                    }
                    mjt mjtVar = new mjt(fhdVar, new mjv());
                    mjv mjvVar = mjtVar.a;
                    mjvVar.b = nryVar2;
                    BitSet bitSet2 = mjtVar.d;
                    bitSet2.set(1);
                    mjvVar.e = narVar;
                    bitSet2.set(4);
                    if (narVar.z()) {
                        omjVarB = omjVar4.B(narVar.n(), nslVar);
                    } else {
                        omjVarB = null;
                    }
                    mjvVar.y = omjVarB;
                    bitSet2.set(8);
                    if (narVar.A()) {
                        omjVarB2 = omjVar4.B(narVar.o(), nslVar);
                    } else {
                        omjVarB2 = null;
                    }
                    mjvVar.z = omjVarB2;
                    bitSet2.set(9);
                    if (narVar.y()) {
                        omjVarB3 = omjVar4.B(narVar.m(), nslVar);
                    } else {
                        omjVarB3 = null;
                    }
                    mjvVar.x = omjVarB3;
                    bitSet2.set(7);
                    mjvVar.A = narVar.C() ? omjVar4.B(narVar.q(), nslVar) : null;
                    bitSet2.set(10);
                    mjvVar.v = nxlVar2;
                    bitSet2.set(12);
                    mjvVar.t = nucVar2;
                    bitSet2.set(6);
                    mjvVar.B = omjVar3;
                    bitSet2.set(3);
                    if (!z2 || z6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    avmb avmbVar3 = avmbVar2;
                    avmb avmbVar4 = avmbVar;
                    boolean z7 = zBooleanValue3;
                    boolean z8 = zBooleanValue2;
                    mjvVar.q = z4;
                    mjvVar.d = z8;
                    mjvVar.c = nslVar;
                    bitSet2.set(2);
                    mjvVar.u = map2;
                    bitSet2.set(11);
                    mjvVar.r = zN;
                    mjvVar.f = zH;
                    bitSet2.set(5);
                    mjvVar.s = z7;
                    mjvVar.g = zM;
                    mjvVar.a = avmbVar4;
                    bitSet2.set(0);
                    mjvVar.w = avmbVar3;
                    bitSet2.set(13);
                    return mjtVar;
                }
                zM = false;
                zO = true;
                zH = false;
                zN = false;
                zI = false;
                map2 = map;
                z2 = z;
                nsoVar2 = nsoVar;
                omjVar3 = omjVar;
                nucVar2 = nucVar;
                nxlVar2 = nxlVar;
                omjVar4 = omjVar2;
                z3 = zO;
                nryVar2 = nryVar;
                boolean z9 = zI;
                if (z3) {
                    mjx mjxVar2 = new mjx(fhdVar, new mka());
                    mka mkaVar2 = mjxVar2.a;
                    mkaVar2.a = nryVar2;
                    BitSet bitSet3 = mjxVar2.d;
                    bitSet3.set(0);
                    mkaVar2.d = narVar;
                    bitSet3.set(3);
                    if (narVar.z()) {
                        omjVarB4 = omjVar4.B(narVar.n(), nslVar);
                    } else {
                        omjVarB4 = null;
                    }
                    mkaVar2.t = omjVarB4;
                    bitSet3.set(8);
                    if (narVar.A()) {
                        omjVarB5 = omjVar4.B(narVar.o(), nslVar);
                    } else {
                        omjVarB5 = null;
                    }
                    mkaVar2.u = omjVarB5;
                    bitSet3.set(9);
                    if (narVar.y()) {
                        omjVarB6 = omjVar4.B(narVar.m(), nslVar);
                    } else {
                        omjVarB6 = null;
                    }
                    mkaVar2.s = omjVarB6;
                    bitSet3.set(7);
                    mkaVar2.v = narVar.C() ? omjVar4.B(narVar.q(), nslVar) : null;
                    bitSet3.set(10);
                    mkaVar2.r = nxlVar2;
                    bitSet3.set(12);
                    mkaVar2.g = nucVar2;
                    bitSet3.set(6);
                    mkaVar2.w = omjVar3;
                    bitSet3.set(5);
                    mkaVar2.c = nsoVar2;
                    bitSet3.set(2);
                    if (z2) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    mkaVar2.f = z5;
                    bitSet3.set(4);
                    mkaVar2.b = nslVar;
                    bitSet3.set(1);
                    mkaVar2.q = map2;
                    bitSet3.set(11);
                    mkaVar2.e = zM;
                    return mjxVar2;
                }
                mjt mjtVar2 = new mjt(fhdVar, new mjv());
                mjv mjvVar2 = mjtVar2.a;
                mjvVar2.b = nryVar2;
                BitSet bitSet4 = mjtVar2.d;
                bitSet4.set(1);
                mjvVar2.e = narVar;
                bitSet4.set(4);
                if (narVar.z()) {
                    omjVarB = omjVar4.B(narVar.n(), nslVar);
                } else {
                    omjVarB = null;
                }
                mjvVar2.y = omjVarB;
                bitSet4.set(8);
                if (narVar.A()) {
                    omjVarB2 = omjVar4.B(narVar.o(), nslVar);
                } else {
                    omjVarB2 = null;
                }
                mjvVar2.z = omjVarB2;
                bitSet4.set(9);
                if (narVar.y()) {
                    omjVarB3 = omjVar4.B(narVar.m(), nslVar);
                } else {
                    omjVarB3 = null;
                }
                mjvVar2.x = omjVarB3;
                bitSet4.set(7);
                mjvVar2.A = narVar.C() ? omjVar4.B(narVar.q(), nslVar) : null;
                bitSet4.set(10);
                mjvVar2.v = nxlVar2;
                bitSet4.set(12);
                mjvVar2.t = nucVar2;
                bitSet4.set(6);
                mjvVar2.B = omjVar3;
                bitSet4.set(3);
                if (z2) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                avmb avmbVar5 = avmbVar2;
                avmb avmbVar6 = avmbVar;
                boolean z10 = zBooleanValue3;
                boolean z11 = zBooleanValue2;
                mjvVar2.q = z4;
                mjvVar2.d = z11;
                mjvVar2.c = nslVar;
                bitSet4.set(2);
                mjvVar2.u = map2;
                bitSet4.set(11);
                mjvVar2.r = zN;
                mjvVar2.f = zH;
                bitSet4.set(5);
                mjvVar2.s = z10;
                mjvVar2.g = zM;
                mjvVar2.a = avmbVar6;
                bitSet4.set(0);
                mjvVar2.w = avmbVar5;
                bitSet4.set(13);
                return mjtVar2;
            }
        }, null, nar.P, false);
    }

    public static ntv aO(mla mlaVar, nvp nvpVar, final nry nryVar, final nxl nxlVar, final nuc nucVar, agev agevVar, final Map map, final ntd ntdVar, final omj omjVar, final boolean z, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7) {
        final nso nsoVar = (nso) agevVar.e(nxy.a);
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar3.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar4.e(bool)).booleanValue();
        final boolean zBooleanValue4 = ((Boolean) agevVar5.e(bool)).booleanValue();
        final boolean zBooleanValue5 = ((Boolean) agevVar6.e(bool)).booleanValue();
        final boolean zBooleanValue6 = ((Boolean) agevVar7.e(bool)).booleanValue();
        bool.booleanValue();
        bool.booleanValue();
        Integer num = 0;
        num.getClass();
        bool.booleanValue();
        return mlaVar.a(nvpVar, new mky() { // from class: mmw
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                boolean zI;
                boolean zG;
                boolean zL;
                boolean zJ;
                ner nerVar = (ner) obj;
                mep mepVar = nbl.T;
                if (ndsVar.e(mepVar)) {
                    nbl nblVar = (nbl) ndsVar.d(mepVar);
                    zG = nblVar.g();
                    zL = nblVar.l();
                    zJ = nblVar.j();
                    zI = nblVar.i();
                } else {
                    zI = false;
                    zG = false;
                    zL = false;
                    zJ = false;
                }
                boolean z2 = zBooleanValue3;
                boolean z3 = zBooleanValue2;
                boolean z4 = zBooleanValue;
                ntd ntdVar2 = ntdVar;
                Map map2 = map;
                omj omjVar2 = omjVar;
                boolean z5 = z;
                boolean z6 = zI;
                nso nsoVar2 = nsoVar;
                boolean z7 = zG;
                nuc nucVar2 = nucVar;
                nxl nxlVar2 = nxlVar;
                boolean z8 = zJ;
                nry nryVar2 = nryVar;
                if (!zBooleanValue5 && !z8 && !nerVar.k()) {
                    msk mskVar = new msk(fhdVar, new msm());
                    mskVar.c(nryVar2);
                    mskVar.i(nerVar);
                    mskVar.j(nxlVar2);
                    mskVar.g(nucVar2);
                    mskVar.e(nsoVar2);
                    boolean z9 = z5 || z6;
                    msm msmVar = mskVar.a;
                    msmVar.q = z9;
                    mskVar.d(nslVar);
                    msmVar.B = omjVar2;
                    mskVar.h(map2);
                    mskVar.f(ntdVar2.a());
                    msmVar.r = z4;
                    msmVar.s = z3;
                    msmVar.e = z2;
                    msmVar.g = z7 || zBooleanValue4;
                    mep mepVar2 = nem.ah;
                    if (!ndsVar.e(mepVar2)) {
                        return mskVar;
                    }
                    nem nemVar = (nem) ndsVar.d(mepVar2);
                    if (!nemVar.u()) {
                        return mskVar;
                    }
                    msmVar.a = Boolean.valueOf(nemVar.s());
                    return mskVar;
                }
                mso msoVar = new mso(fhdVar, new msp());
                msp mspVar = msoVar.a;
                mspVar.b = nryVar2;
                BitSet bitSet = msoVar.d;
                bitSet.set(0);
                mspVar.A = nerVar;
                bitSet.set(5);
                mspVar.B = nxlVar2;
                bitSet.set(6);
                mspVar.u = nucVar2;
                bitSet.set(3);
                mspVar.d = nsoVar2;
                boolean z10 = z5 || z6;
                boolean z11 = zBooleanValue6;
                mspVar.q = z10;
                mspVar.c = nslVar;
                bitSet.set(1);
                mspVar.C = omjVar2;
                mspVar.z = map2;
                bitSet.set(4);
                mspVar.f = ntdVar2.a();
                bitSet.set(2);
                mspVar.r = z4;
                mspVar.t = z3;
                mspVar.e = z2;
                mspVar.g = zL;
                mspVar.s = z11;
                mep mepVar3 = nem.ah;
                if (ndsVar.e(mepVar3)) {
                    nem nemVar2 = (nem) ndsVar.d(mepVar3);
                    if (nemVar2.u()) {
                        mspVar.a = Boolean.valueOf(nemVar2.s());
                    }
                }
                return msoVar;
            }
        }, null, ner.ai, false);
    }

    public static mdm aP(kjc kjcVar, mdh mdhVar) {
        return mdhVar.c ? kjcVar.s(mdhVar) : mdm.a;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [awmd, java.lang.Object] */
    public static axfd aQ(Map map, awmd awmdVar, mqq mqqVar, agev agevVar, awmd awmdVar2, awmd awmdVar3, agev agevVar2) {
        return new axfd(awmdVar, mqqVar, (awmd) ((agfa) agevVar).a, awmdVar2, awmdVar3, agevVar2, map);
    }

    public static void aa(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    public static boolean ab(Parcel parcel, int i) {
        Z(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] ac(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return bArrCreateByteArray;
    }

    public static int[] ad(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return iArrCreateIntArray;
    }

    public static long[] ae(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return jArrCreateLongArray;
    }

    public static Object[] af(Parcel parcel, int i, Parcelable.Creator creator) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iJ);
        return objArrCreateTypedArray;
    }

    public static String[] ag(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iJ);
        return strArrCreateStringArray;
    }

    public static byte[][] ah(Parcel parcel, int i) {
        int iJ = J(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iJ == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iJ);
        return bArr;
    }

    public static void ai(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new krz("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ')', parcel);
    }

    public static String aj(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static ScheduledExecutorService ak(ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return new kym(threadPoolExecutor, kyo.a);
    }

    public static ExecutorService al(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public static ScheduledExecutorService am() {
        return ak(new kyp(0));
    }

    public static ExecutorService an(int i) {
        return al(i, new kyp(0));
    }

    public static String ao(File file, String str) {
        return new File(file, str).getPath();
    }

    public static kmv ap() {
        ksy ksyVar = kxz.b;
        return ar();
    }

    public static kmv aq() {
        kmv kmvVarAp = ap();
        return kro.s(kmvVarAp.b, true, kmvVarAp.d, kmvVarAp.e);
    }

    public static kmv ar() {
        kmv kmvVar = new kmv(new kmx(-1, -1, 0, true), false, null);
        kmvVar.e = false;
        return kmvVar;
    }

    public static fxl as(Context context, String str, String str2) {
        return new kwf(context, str, str2).f();
    }

    public static ntv at(mla mlaVar, nvp nvpVar, final nry nryVar, final mqg mqgVar, agev agevVar, agev agevVar2, final awmd awmdVar, final nuc nucVar, final awmd awmdVar2, final agev agevVar3, agev agevVar4, agev agevVar5, agev agevVar6, agev agevVar7, agev agevVar8) {
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar4.e(bool)).booleanValue();
        final nso nsoVar = (nso) agevVar5.e(nxy.a);
        final boolean zBooleanValue4 = ((Boolean) agevVar6.e(bool)).booleanValue();
        final boolean zBooleanValue5 = ((Boolean) agevVar7.e(bool)).booleanValue();
        final boolean zBooleanValue6 = ((Boolean) agevVar8.e(bool)).booleanValue();
        return mlaVar.a(nvpVar, new mky() { // from class: mih
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                myz myzVar = (myz) obj;
                avmm avmmVar = new avmm();
                mie mieVar = new mie(fhdVar, new mig());
                mig migVar = mieVar.a;
                migVar.F = mqgVar;
                BitSet bitSet = mieVar.d;
                bitSet.set(13);
                migVar.e = nslVar;
                bitSet.set(4);
                migVar.b = avmmVar;
                bitSet.set(1);
                migVar.c = myzVar;
                bitSet.set(2);
                migVar.v = zBooleanValue;
                migVar.r = zBooleanValue3;
                bitSet.set(6);
                migVar.C = zBooleanValue2;
                migVar.g = nsoVar;
                bitSet.set(5);
                migVar.s = zBooleanValue4;
                bitSet.set(7);
                migVar.a = list;
                bitSet.set(0);
                migVar.t = zBooleanValue5;
                bitSet.set(8);
                migVar.u = zBooleanValue6;
                if (mipVar != null) {
                    migVar.G = mipVar;
                }
                awmd awmdVar3 = awmdVar;
                migVar.D = nslVar.A;
                migVar.E = awmdVar3;
                if (str != null) {
                    migVar.q = str;
                }
                if (nslVar.E) {
                    migVar.H = (ci) ((agfa) agevVar3).a;
                }
                nuc nucVar2 = nucVar;
                migVar.d = nryVar;
                bitSet.set(3);
                migVar.y = nucVar2;
                bitSet.set(9);
                migVar.A = myzVar.y() ? myzVar.k() : null;
                bitSet.set(11);
                migVar.z = myzVar.z() ? myzVar.l() : null;
                bitSet.set(10);
                mzg mzgVarM = myzVar.A() ? myzVar.m() : null;
                awmd awmdVar4 = awmdVar2;
                migVar.B = mzgVarM;
                bitSet.set(12);
                migVar.f = awmdVar4;
                return mieVar;
            }
        }, null, myz.H, true);
    }

    public static ntv au(mla mlaVar, awmd awmdVar, mln mlnVar, nvp nvpVar, agev agevVar) {
        return ((agfa) agevVar).a instanceof nxz ? mlaVar.a(nvpVar, null, (mkz) awmdVar.io(), mzq.J, false) : mlaVar.a(nvpVar, null, mlnVar, mzq.J, false);
    }

    public static ntv av(mla mlaVar, nvp nvpVar, agev agevVar, agev agevVar2, agev agevVar3) {
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar3.e(bool)).booleanValue();
        String str = mjg.a;
        return mlaVar.a(nvpVar, new mky() { // from class: mjf
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str2, nds ndsVar, mip mipVar, List list) {
                nad nadVar = (nad) obj;
                String str3 = mjg.a;
                mjd mjdVar = new mjd(fhdVar, new mje());
                mjdVar.e(list);
                mje mjeVar = mjdVar.a;
                mjeVar.c = zBooleanValue;
                mjeVar.d = zBooleanValue3;
                mep mepVar = ndn.ae;
                if (ndsVar.e(mepVar)) {
                    mjdVar.i(mjg.a(((ndn) ndsVar.d(mepVar)).J()));
                } else {
                    mjdVar.i(1);
                }
                if (nadVar.g()) {
                    mjdVar.Y();
                    mjdVar.H(mjg.a + mjg.b.getAndIncrement());
                }
                if (zBooleanValue2) {
                    mep mepVar2 = nce.Y;
                    if (ndsVar.e(mepVar2)) {
                        nce nceVar = (nce) ndsVar.d(mepVar2);
                        if (nceVar.h()) {
                            mjdVar.g(nceVar.g());
                        }
                    }
                }
                return mjdVar;
            }
        }, null, nad.N, false);
    }

    public static ntv aw(mla mlaVar, nvp nvpVar, final nry nryVar, final nxl nxlVar, final nuc nucVar, agev agevVar, final Map map, final ntd ntdVar) {
        final nso nsoVar = (nso) agevVar.e(nxy.a);
        final omj omjVar = new omj(nucVar);
        return mlaVar.a(nvpVar, new mky() { // from class: mll
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                nbi nbiVar = (nbi) obj;
                mlh mlhVar = new mlh(fhdVar, new mlj());
                boolean zX = nbiVar.x();
                omj omjVar2 = omjVar;
                omj omjVarB = zX ? omjVar2.B(nbiVar.n(), nslVar) : null;
                mlj mljVar = mlhVar.a;
                mljVar.s = omjVarB;
                BitSet bitSet = mlhVar.d;
                bitSet.set(6);
                omj omjVarB2 = nbiVar.w() ? omjVar2.B(nbiVar.m(), nslVar) : null;
                Map map2 = map;
                ntd ntdVar2 = ntdVar;
                nso nsoVar2 = nsoVar;
                nuc nucVar2 = nucVar;
                nxl nxlVar2 = nxlVar;
                nry nryVar2 = nryVar;
                mljVar.r = omjVarB2;
                bitSet.set(0);
                mljVar.a = nryVar2;
                bitSet.set(1);
                mljVar.e = nbiVar;
                bitSet.set(5);
                mljVar.q = nxlVar2;
                bitSet.set(9);
                mljVar.f = nucVar2;
                bitSet.set(7);
                mljVar.c = nsoVar2;
                bitSet.set(3);
                mljVar.b = nslVar;
                bitSet.set(2);
                mljVar.d = ntdVar2.a();
                bitSet.set(4);
                mljVar.g = map2;
                bitSet.set(8);
                return mlhVar;
            }
        }, null, nbi.S, false);
    }

    public static ntv ax(mla mlaVar, nvp nvpVar, final nry nryVar, final nuc nucVar, agev agevVar, agev agevVar2, agev agevVar3, agev agevVar4, agev agevVar5) {
        Boolean bool = Boolean.FALSE;
        final boolean zBooleanValue = ((Boolean) agevVar.e(bool)).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) agevVar2.e(bool)).booleanValue();
        final boolean zBooleanValue3 = ((Boolean) agevVar3.e(bool)).booleanValue();
        final boolean zBooleanValue4 = ((Boolean) agevVar4.e(bool)).booleanValue();
        final boolean zBooleanValue5 = ((Boolean) agevVar5.e(bool)).booleanValue();
        final omj omjVar = new omj(nucVar);
        return mlaVar.a(nvpVar, new mky() { // from class: mmp
            @Override // defpackage.mky
            public final fgv a(fhd fhdVar, nsl nslVar, Object obj, String str, nds ndsVar, mip mipVar, List list) {
                nee neeVar = (nee) obj;
                mmg mmgVar = new mmg(fhdVar, new mmi());
                mmi mmiVar = mmgVar.a;
                mmiVar.a = list;
                BitSet bitSet = mmgVar.d;
                bitSet.set(0);
                mep mepVar = ndn.ae;
                if (ndsVar.e(mepVar)) {
                    mmgVar.g(mjg.a(((ndn) ndsVar.d(mepVar)).J()));
                } else {
                    mmgVar.g(1);
                }
                mep mepVar2 = nbl.T;
                if (ndsVar.e(mepVar2)) {
                    mmgVar.d(((nbl) ndsVar.d(mepVar2)).k());
                } else {
                    mmgVar.d(false);
                }
                if (str != null) {
                    mmiVar.d = str;
                }
                omj omjVar2 = omjVar;
                nry nryVar2 = nryVar;
                bitSet.set(7);
                mmiVar.b = nryVar2;
                bitSet.set(1);
                mmiVar.s = neeVar;
                bitSet.set(11);
                mmiVar.A = neeVar.t() ? omjVar2.B(neeVar.g(), nslVar) : null;
                bitSet.set(9);
                mmiVar.z = neeVar.u() ? omjVar2.B(neeVar.h(), nslVar) : null;
                bitSet.set(8);
                omj omjVarB = neeVar.v() ? omjVar2.B(neeVar.i(), nslVar) : null;
                boolean z = zBooleanValue4;
                boolean z2 = zBooleanValue3;
                boolean z3 = zBooleanValue2;
                boolean z4 = zBooleanValue;
                mmiVar.B = omjVarB;
                bitSet.set(10);
                mmiVar.c = nslVar;
                bitSet.set(2);
                mmiVar.r = z4;
                bitSet.set(5);
                mmiVar.e = z3;
                mmiVar.g = z2;
                mmiVar.q = z;
                mmiVar.x = mipVar;
                bitSet.set(3);
                return mmgVar;
            }
        }, null, nee.ag, false);
    }

    public static void ay(fgv fgvVar, Map map) {
        hee heeVar = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_ALPHA);
        if (heeVar != null) {
            fgvVar.b.j().put(1, heeVar);
        }
        hee heeVar2 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_SCALE_X);
        if (heeVar2 != null) {
            fgvVar.b.j().put(4, heeVar2);
        }
        hee heeVar3 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_SCALE_Y);
        if (heeVar3 != null) {
            fgvVar.b.j().put(5, heeVar3);
        }
        hee heeVar4 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_ROTATION);
        if (heeVar4 != null) {
            fgvVar.b.j().put(8, heeVar4);
        }
        hee heeVar5 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_X);
        if (heeVar5 != null) {
            fgvVar.b.j().put(2, heeVar5);
        }
        hee heeVar6 = (hee) map.get(asmn.DYNAMIC_PROP_TYPE_TRANSLATION_Y);
        if (heeVar6 != null) {
            fgvVar.b.j().put(3, heeVar6);
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, nuh] */
    public static JSEnvironment az(aunn aunnVar, awmd awmdVar, Optional optional, Map map, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, awmd awmdVar2) {
        mhn mhnVar = (mhn) aunnVar.io();
        Boolean bool = Boolean.FALSE;
        mho mhoVar = new mho(mhnVar, awmdVar, optional, map, ((Boolean) optional2.orElse(bool)).booleanValue(), optional3, ((Boolean) optional4.orElse(bool)).booleanValue(), optional5, awmdVar2);
        optional6.isPresent();
        optional6.get().a();
        return mhoVar;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static synchronized boolean c(Context context) {
        boolean zBooleanValue;
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = b;
        if (context2 == null || (bool = c) == null || context2 != applicationContext) {
            c = null;
            Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            c = boolValueOf;
            b = applicationContext;
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean d() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    @Deprecated
    public static List e(Object... objArr) {
        return DesugarCollections.unmodifiableList(Arrays.asList(objArr));
    }

    public static List f(Object obj) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return arrayList;
    }

    public static int g(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void h(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static void i(Parcel parcel, int i, boolean z) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void j(Parcel parcel, int i, double d) {
        parcel.writeInt(i | 524288);
        parcel.writeDouble(d);
    }

    public static void k(Parcel parcel, int i, float f) {
        parcel.writeInt(i | 262144);
        parcel.writeFloat(f);
    }

    public static void l(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | 262144);
        parcel.writeInt(i2);
    }

    public static void m(Parcel parcel, int i, long j) {
        parcel.writeInt(i | 524288);
        parcel.writeLong(j);
    }

    public static void n(Parcel parcel, Parcelable parcelable, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static void o(Parcel parcel, int i, Boolean bool) {
        if (bool != null) {
            parcel.writeInt(i | 262144);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static void p(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            int iG = g(parcel, i);
            parcel.writeBundle(bundle);
            h(parcel, iG);
        }
    }

    public static void q(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            int iG = g(parcel, i);
            parcel.writeByteArray(bArr);
            h(parcel, iG);
        }
    }

    public static void r(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int iG = g(parcel, i);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            h(parcel, iG);
        }
    }

    public static void s(Parcel parcel, int i, Float f) {
        if (f != null) {
            parcel.writeInt(i | 262144);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static void t(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int iG = g(parcel, i);
            parcel.writeStrongBinder(iBinder);
            h(parcel, iG);
        }
    }

    public static void u(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            int iG = g(parcel, i);
            parcel.writeIntArray(iArr);
            h(parcel, iG);
        }
    }

    public static void v(Parcel parcel, int i, List list) {
        if (list != null) {
            int iG = g(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            h(parcel, iG);
        }
    }

    public static void w(Parcel parcel, int i, Integer num) {
        if (num != null) {
            parcel.writeInt(i | 262144);
            parcel.writeInt(num.intValue());
        }
    }

    public static void x(Parcel parcel, int i, long[] jArr) {
        if (jArr != null) {
            int iG = g(parcel, i);
            parcel.writeLongArray(jArr);
            h(parcel, iG);
        }
    }

    public static void y(Parcel parcel, int i, List list) {
        if (list != null) {
            int iG = g(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(((Long) list.get(i2)).longValue());
            }
            h(parcel, iG);
        }
    }

    public static void z(Parcel parcel, int i, Long l) {
        if (l != null) {
            parcel.writeInt(i | 524288);
            parcel.writeLong(l.longValue());
        }
    }

    public ksy(byte[] bArr, char[] cArr) {
    }
}
