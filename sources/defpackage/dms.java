package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import internal.org.jni_zero.JniZero;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dms {
    public static final Object a(dmq dmqVar, awqg awqgVar, awoq awoqVar) {
        if (dmqVar.q() && dmqVar.s() && dmqVar.r()) {
            return awqgVar.invoke(awoqVar);
        }
        return awoqVar.getContext().get(awxn.b) == null ? awqgVar.invoke(awoqVar) : c(dmqVar, awqgVar, awoqVar);
    }

    public static final Object b(dmq dmqVar, awqg awqgVar, awoq awoqVar) {
        return c(dmqVar, new pvw(dmqVar, awqgVar, (awoq) null, 1), awoqVar);
    }

    public static final Object c(dmq dmqVar, awqg awqgVar, awoq awoqVar) {
        dmr dmrVar = new dmr(awqgVar, (awoq) null, 0);
        dmx dmxVar = (dmx) awoqVar.getContext().get(dmx.b);
        awor aworVar = dmxVar != null ? dmxVar.a : null;
        return aworVar != null ? awro.p(aworVar, dmrVar, awoqVar) : x(dmqVar, dmrVar, awoqVar);
    }

    public static final Object d(dml dmlVar, String str, awoq awoqVar) {
        Object objA = dmlVar.a(str, new bfu(3), awoqVar);
        return objA != awox.a ? awmy.a : objA;
    }

    public static final Object e(awqk awqkVar) {
        Thread.interrupted();
        return awqx.l(awov.a, new doa(awqkVar, (awoq) null, 0));
    }

    public static final String f(String str, String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final void g(WorkDatabase workDatabase, int i) {
        workDatabase.x().b(new edz("next_job_scheduler_id", Long.valueOf(i)));
    }

    public static final ees h(ees eesVar) {
        boolean zB = eesVar.g.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zB2 = eesVar.g.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zB3 = eesVar.g.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zB || !zB2 || !zB3) {
            return eesVar;
        }
        String str = eesVar.e;
        dov dovVar = new dov((byte[]) null);
        dovVar.h(eesVar.g);
        dovVar.k("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return ees.f(eesVar, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", dovVar.g(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public static final dzk i(UUID uuid, ebm ebmVar) {
        uuid.getClass();
        azx azxVar = ebmVar.c.j;
        ?? r1 = ebmVar.k.a;
        r1.getClass();
        return bbl.f(azxVar, "CancelWorkById", r1, new efi(ebmVar, uuid, 0));
    }

    public static final void j(ebm ebmVar, String str) {
        eby ebyVarA;
        WorkDatabase workDatabase = ebmVar.d;
        workDatabase.getClass();
        eet eetVarC = workDatabase.C();
        edw edwVarW = workDatabase.w();
        ArrayList arrayList = new ArrayList(new awnl(new String[]{str}, true));
        arrayList.addAll(bou.g(edwVarW, str));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            dzr dzrVarB = eetVarC.b((String) next);
            if (dzrVarB != null ? !dzrVarB.a() : false) {
                arrayList2.add(next);
            }
        }
        eet eetVarC2 = ebmVar.d.C();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            eetVarC2.z((String) it2.next());
        }
        eam eamVar = ebmVar.f;
        eamVar.getClass();
        synchronized (eamVar.l) {
            dzf.b();
            eamVar.i.add(str);
            ebyVarA = eamVar.a(str);
        }
        eam.g(ebyVarA, 1);
        ListIterator listIterator = ((awoa) ebmVar.e).listIterator(0);
        while (listIterator.hasNext()) {
            ((eao) listIterator.next()).b(str);
        }
    }

    public static final void k(ebm ebmVar) {
        eaq.a(ebmVar.c, ebmVar.d, ebmVar.e);
    }

    public static final int l(dzr dzrVar) {
        dzrVar.getClass();
        int iOrdinal = dzrVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 2;
        }
        if (iOrdinal == 3) {
            return 3;
        }
        if (iOrdinal == 4) {
            return 4;
        }
        if (iOrdinal != 5) {
            throw new awmj();
        }
        return 5;
    }

    public static final dzr m(int i) {
        if (i == 0) {
            return dzr.a;
        }
        if (i == 1) {
            return dzr.b;
        }
        if (i == 2) {
            return dzr.c;
        }
        if (i == 3) {
            return dzr.d;
        }
        if (i == 4) {
            return dzr.e;
        }
        if (i == 5) {
            return dzr.f;
        }
        throw new IllegalArgumentException(a.bP(i, "Could not convert ", " to State"));
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final efo n(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new efo(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                int[] iArr3 = efn.a;
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (IllegalArgumentException e) {
                        dzf.b();
                        Log.w(efo.a, a.ci((byte) 39, i6, "Ignoring adding capability '"), e);
                    }
                }
                for (int i7 : efn.a) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= i3) {
                            try {
                                builder.removeCapability(i7);
                            } catch (IllegalArgumentException e2) {
                                dzf.b();
                                Log.w(efo.a, a.ci((byte) 39, i7, "Ignoring removing default capability '"), e2);
                            }
                        } else if (i7 != iArr2[i8]) {
                            i8++;
                        } else if (i8 < 0) {
                            builder.removeCapability(i7);
                        }
                    }
                }
                for (int i9 = 0; i9 < i; i9++) {
                    builder.addTransportType(iArr[i9]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                efo efoVar = new efo(networkRequestBuild);
                objectInputStream.close();
                byteArrayInputStream.close();
                return efoVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                        throw th2;
                    }
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    byteArrayInputStream.close();
                    throw th5;
                } catch (Throwable th6) {
                    avkz.d(th4, th6);
                    throw th5;
                }
            }
        }
    }

    public static final Set o(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int i = objectInputStream.readInt();
                        for (int i2 = 0; i2 < i; i2++) {
                            Uri uri = Uri.parse(objectInputStream.readUTF());
                            boolean z = objectInputStream.readBoolean();
                            uri.getClass();
                            linkedHashSet.add(new dym(uri, z));
                        }
                        objectInputStream.close();
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable th3) {
                                avkz.d(th, th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th6) {
                        avkz.d(th4, th6);
                    }
                    throw th5;
                }
            }
        }
        return linkedHashSet;
    }

    public static final byte[] p(efo efoVar) throws IOException {
        Object obj;
        int[] iArrAz;
        if (Build.VERSION.SDK_INT < 28 || (obj = efoVar.b) == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrAz = ((NetworkRequest) obj).getTransportTypes();
                    iArrAz.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr[i];
                        int[] iArr2 = efn.a;
                        if (((NetworkRequest) obj).hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    iArrAz = atqq.az(arrayList);
                }
                int[] iArrM = qa.M((NetworkRequest) obj);
                objectOutputStream.writeInt(iArrAz.length);
                for (int i3 : iArrAz) {
                    objectOutputStream.writeInt(i3);
                }
                objectOutputStream.writeInt(iArrM.length);
                for (int i4 : iArrM) {
                    objectOutputStream.writeInt(i4);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    avkz.d(th4, th6);
                }
                throw th5;
            }
        }
    }

    public static final byte[] q(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    dym dymVar = (dym) it.next();
                    objectOutputStream.writeUTF(dymVar.a.toString());
                    objectOutputStream.writeBoolean(dymVar.b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable th3) {
                        avkz.d(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th6) {
                    avkz.d(th4, th6);
                }
                throw th5;
            }
        }
    }

    public static final int r(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + ((Object) bbl.e(i)) + " to int");
    }

    public static final int s(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static final int t(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT < 30 || i != 5) {
                    throw new IllegalArgumentException(a.bP(i, "Could not convert ", " to NetworkType"));
                }
                return 6;
            }
        }
        return i2;
    }

    public static final int u(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.bP(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int v(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static final int w(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.bP(i, "Could not convert ", " to BackoffPolicy"));
    }

    private static final Object x(dmq dmqVar, awqk awqkVar, awoq awoqVar) {
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        try {
            Executor executor = dmqVar.d;
            if (executor == null) {
                awrc.b("internalTransactionExecutor");
                executor = null;
            }
            executor.execute(new bf((awuc) awudVar, dmqVar, awqkVar, 16));
        } catch (RejectedExecutionException e) {
            awudVar.f(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object objJ = awudVar.j();
        if (objJ == awox.a) {
            awoqVar.getClass();
        }
        return objJ;
    }
}
