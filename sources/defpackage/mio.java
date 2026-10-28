package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mio {
    public static final String a = "mio";
    public static final AtomicInteger b = new AtomicInteger(1);

    public static CommandOuterClass$Command a(mzg mzgVar, nuc nucVar, nsl nslVar) {
        if (mzgVar == null) {
            return null;
        }
        try {
            return (CommandOuterClass$Command) aihn.parseFrom(CommandOuterClass$Command.a, mzgVar.f(), ExtensionRegistryLite.getGeneratedRegistry());
        } catch (aiik e) {
            nucVar.f(aslh.LOG_TYPE_WIRE_FORMAT_ERROR, nslVar, e, "Failed to parse Command", new Object[0]);
            return CommandOuterClass$Command.getDefaultInstance();
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [awmd, java.lang.Object] */
    public static void b(myz myzVar, awmd awmdVar, nsl nslVar, String str, avmm avmmVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        mnd mndVar;
        mnc mncVar = (mnc) awmdVar.io();
        nro nroVarA = mncVar.a(myzVar.h(), nslVar, str);
        if (nroVarA != null) {
            atomicReference.set(nroVarA);
            avmmVar.c(nroVarA);
            if (nroVarA.c) {
                tld tldVar = mncVar.b;
                nslVar.getClass();
                myzVar.getClass();
                nry nryVar = (nry) tldVar.a.io();
                nryVar.getClass();
                avmb avmbVar = (avmb) tldVar.b.io();
                avmbVar.getClass();
                mndVar = new mnd(new mne(nslVar, nroVarA, myzVar, nryVar, avmbVar));
            } else {
                mndVar = null;
            }
            if (mndVar != null) {
                atomicReference2.set(mndVar);
            }
        }
    }

    public static void c(RecyclerView recyclerView, nry nryVar, CommandOuterClass$Command commandOuterClass$Command, nru nruVar, ntx ntxVar, ntq ntqVar) {
        nrt nrtVarD = nrv.d();
        nrtVarD.d(recyclerView);
        nrtVarD.g = ntxVar;
        nrtVarD.f = ntqVar;
        nruVar.a(nrtVarD);
        nryVar.a(commandOuterClass$Command, nrtVarD.a()).D();
    }

    public static void d(AtomicReference atomicReference, avmm avmmVar, nro nroVar, nsl nslVar) {
        atomicReference.set(avmmVar);
        if (avmmVar == null || nroVar == null) {
            return;
        }
        avmmVar.c(nroVar);
        avnq avnqVar = nslVar.i;
        if (avnqVar != null) {
            avnqVar.c(avmmVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    static int e(int i, int i2, boolean z, nuc nucVar, nsl nslVar) {
        int i3;
        int i4;
        int i5 = Integer.MIN_VALUE;
        if (!z && i != 3 && i != 1) {
            nucVar.c(aslh.LOG_TYPE_CONFIGURATION_ERROR, nslVar, "Only snap to start is implemented for vertical lists", new Object[0]);
            return Integer.MIN_VALUE;
        }
        int i6 = -1;
        int i7 = i - 1;
        int i8 = i2 - 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i6 = 2147483644;
                i3 = Integer.MIN_VALUE;
                i4 = 2147483646;
            }
            if (i7 != 1) {
                return i7 != 2 ? i3 : i6;
            }
            return i4;
        }
        i5 = 2147483643;
        i3 = i5;
        i4 = Integer.MAX_VALUE;
        if (i7 != 1) {
            if (i7 != 2) {
            }
        }
        return i4;
    }
}
