package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import j$.nio.channels.DesugarChannels;
import j$.util.concurrent.ConcurrentMap;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qqp implements qpn {
    private final /* synthetic */ int $cid;

    public qqp(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, qqv] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, qqv] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, qqv] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v53, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    @Override // defpackage.qpn
    public final /* synthetic */ Object a(rrq rrqVar) throws IOException {
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        agev agevVarA;
        ?? C;
        byte[] bArrB;
        int i = this.$cid;
        closeable = null;
        Closeable closeable = null;
        if (i == 0) {
            OutputStream outputStreamE = rrqVar.f.e((Uri) rrqVar.d);
            ArrayList arrayList = new ArrayList();
            arrayList.add(outputStreamE);
            ?? r3 = rrqVar.a;
            if (!r3.isEmpty()) {
                Object obj = rrqVar.c;
                int i2 = qpl.a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = r3.iterator();
                while (it.hasNext()) {
                    qqy qqyVarA = ((qqz) it.next()).a((Uri) obj);
                    if (qqyVarA != null) {
                        arrayList2.add(qqyVarA);
                    }
                }
                qpl qplVar = arrayList2.isEmpty() ? null : new qpl(outputStreamE, arrayList2);
                if (qplVar != null) {
                    arrayList.add(qplVar);
                }
            }
            Iterator it2 = rrqVar.b.iterator();
            if (!it2.hasNext()) {
                Collections.reverse(arrayList);
                return (OutputStream) arrayList.get(0);
            }
            OutputStream outputStream = (OutputStream) aguu.K(arrayList);
            if (outputStream != null) {
                outputStream.close();
            }
            throw new qqf("wrapForAppend not supported by compress");
        }
        if (i == 1) {
            if (rrqVar.d()) {
                throw new qqf("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(rrqVar.c))));
            }
            return new tld(rrqVar.e, rrqVar.c);
        }
        if (i == 2) {
            qqr qqrVar = new qqr();
            qqrVar.b();
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) ((ayq) rrqVar.e).X((Uri) rrqVar.d, qqrVar), 805306368);
            try {
                parcelFileDescriptorOpen.getFd();
                if (parcelFileDescriptorOpen == null) {
                    return null;
                }
                parcelFileDescriptorOpen.close();
                return null;
            } catch (Throwable th) {
                if (parcelFileDescriptorOpen != null) {
                    try {
                        parcelFileDescriptorOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (i != 3) {
            long jV = 0;
            if (i != 4) {
                ArrayDeque arrayDeque = new ArrayDeque();
                Uri uriBuild = ((Uri) rrqVar.c).buildUpon().fragment(null).build();
                ayq ayqVar = (ayq) rrqVar.e;
                aguu.P(arrayDeque, ayqVar.W(uriBuild));
                while (!arrayDeque.isEmpty()) {
                    Uri uri = (Uri) arrayDeque.remove();
                    if (ayqVar.ad(uri)) {
                        aguu.P(arrayDeque, ayqVar.W(uri));
                    } else {
                        if (!ayqVar.ac(uri)) {
                            throw new FileNotFoundException(String.format("Child %s could not be opened", uri));
                        }
                        jV += ayqVar.V(uri);
                    }
                }
                return Long.valueOf(jV);
            }
            ?? A = new qqs().a(rrqVar);
            try {
                Long lA = A instanceof qqd ? ((qqd) A).a() : null;
                if (lA == null && !rrqVar.d()) {
                    try {
                        long jV2 = ((ayq) rrqVar.e).V((Uri) rrqVar.c);
                        if (jV2 > 0) {
                            lA = Long.valueOf(jV2);
                        }
                    } catch (qqf unused) {
                    }
                }
                if (lA == null) {
                    bArrB = agyi.b(A);
                } else {
                    int iK = ahng.K(lA.longValue());
                    byte[] bArr = new byte[iK];
                    int iD = agyi.d(A, bArr, iK);
                    if (iD != iK) {
                        throw new EOFException("reached end of stream after reading " + iD + " bytes; " + iK + " bytes expected");
                    }
                    bArrB = bArr;
                }
                if (A == 0) {
                    return bArrB;
                }
                A.close();
                return bArrB;
            } catch (Throwable th3) {
                if (A != 0) {
                    try {
                        A.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        Uri uriBuild2 = ((Uri) rrqVar.c).buildUpon().path(String.valueOf(((Uri) rrqVar.d).getPath()).concat(".lock")).fragment("").build();
        Semaphore semaphore = (Semaphore) ConcurrentMap.EL.computeIfAbsent(rrqVar.f.b().c, uriBuild2.toString(), new qdi(7));
        try {
            semaphore.acquire();
            qpz qpzVar = new qpz(semaphore, 2, null);
            try {
                Object obj2 = qpzVar.a;
                qpzVar.a = null;
                qpz qpzVar2 = new qpz(obj2, 0);
                qpzVar.close();
                qqc qqcVar = new qqc(qpzVar2);
                try {
                    if (qqcVar.a != null) {
                        ?? r10 = rrqVar.f;
                        qqc qqcVar2 = new qqc(r10.f(uriBuild2));
                        try {
                            Closeable closeable2 = qqcVar2.a;
                            if (closeable2 instanceof qpv) {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((qpv) closeable2).b();
                            } else {
                                if (!(closeable2 instanceof RandomAccessFile)) {
                                    throw new IOException("Lock stream not convertible to FileChannel");
                                }
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) closeable2).getChannel());
                            }
                            r10.b();
                            agev agevVarA2 = qqa.a(fileChannelConvertMaybeLegacyFileChannelFromLibrary);
                            if (agevVarA2.g()) {
                                C = agevVarA2.c();
                            } else {
                                qqa.a.longValue();
                                qqa.b.longValue();
                                qqi qqiVar = new qqi();
                                do {
                                    SystemClock.sleep(qqiVar.next().longValue());
                                    agevVarA = qqa.a(fileChannelConvertMaybeLegacyFileChannelFromLibrary);
                                } while (!agevVarA.g());
                                C = agevVarA.c();
                            }
                            qqc qqcVar3 = new qqc(C);
                            try {
                                if (qqcVar3.a == null) {
                                    qqcVar3.close();
                                    qqcVar2.close();
                                } else {
                                    final Closeable closeableA = qqcVar.a();
                                    final Closeable closeableA2 = qqcVar2.a();
                                    final Closeable closeableA3 = qqcVar3.a();
                                    Closeable closeable3 = new Closeable() { // from class: qqq
                                        @Override // java.io.Closeable, java.lang.AutoCloseable
                                        public final void close() throws IOException {
                                            Closeable closeable4 = closeableA;
                                            Closeable closeable5 = closeableA2;
                                            Closeable closeable6 = closeableA3;
                                            if (closeable6 != null) {
                                                try {
                                                    try {
                                                        closeable6.close();
                                                    } catch (Throwable th5) {
                                                        if (closeable5 != null) {
                                                            try {
                                                                closeable5.close();
                                                            } catch (Throwable th6) {
                                                                th5.addSuppressed(th6);
                                                            }
                                                        }
                                                        throw th5;
                                                    }
                                                } catch (Throwable th7) {
                                                    if (closeable4 != null) {
                                                        try {
                                                            closeable4.close();
                                                        } catch (Throwable th8) {
                                                            th7.addSuppressed(th8);
                                                        }
                                                    }
                                                    throw th7;
                                                }
                                            }
                                            if (closeable5 != null) {
                                                closeable5.close();
                                            }
                                            if (closeable4 != null) {
                                                closeable4.close();
                                            }
                                        }
                                    };
                                    qqcVar3.close();
                                    qqcVar2.close();
                                    closeable = closeable3;
                                }
                            } catch (Throwable th5) {
                                try {
                                    qqcVar3.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (Throwable th7) {
                            try {
                                qqcVar2.close();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    }
                    qqcVar.close();
                    return closeable;
                } catch (Throwable th9) {
                    try {
                        qqcVar.close();
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            } catch (Throwable th11) {
                try {
                    qpzVar.close();
                } catch (Throwable th12) {
                    th11.addSuppressed(th12);
                }
                throw th11;
            }
        } catch (InterruptedException e) {
            throw new InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
        }
    }
}
