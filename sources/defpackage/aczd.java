package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.ResourceLoader;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import internal.org.jni_zero.JniZero;
import j$.util.OptionalInt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aczd {
    public final Object a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    private final Object k;

    public aczd(Context context, vyo vyoVar, nuc nucVar, final aunn aunnVar, vxz vxzVar, final tqj tqjVar, mbc mbcVar, agev agevVar) {
        this.d = new AtomicReference();
        final Object obj = new Object();
        this.a = obj;
        this.b = false;
        this.c = false;
        this.f = new AtomicBoolean(false);
        this.k = vyoVar;
        this.g = aunnVar;
        this.j = vxzVar;
        this.h = tqjVar;
        final agfr agfrVarAl = aguu.al(new rqw(context, nucVar, tqjVar, mbcVar, 3));
        this.i = agfrVarAl;
        this.e = new AtomicReference(aguu.al(new agfr() { // from class: aczc
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, nuc] */
            /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, mbc] */
            @Override // defpackage.agfr
            public final Object io() {
                Object acziVar;
                Object aczkVar;
                Object obj2 = obj;
                agfr agfrVar = agfrVarAl;
                synchronized (obj2) {
                    aczl aczlVar = (aczl) agfrVar.io();
                    if (aczlVar.c().exists()) {
                        try {
                            File fileC = aczlVar.c();
                            if (!fileC.exists()) {
                                Objects.toString(fileC);
                                throw new FileNotFoundException("File does not exist: ".concat(fileC.toString()));
                            }
                            long length = fileC.length();
                            if (length < 4) {
                                throw new IOException(a.cf(length, "File too short for CRC32 trailer: ", " bytes"));
                            }
                            if (length > 10485760) {
                                throw new IOException(a.cf(length, "File exceeds maximum allowed size: ", " bytes"));
                            }
                            int i = (int) length;
                            int i2 = i - 4;
                            byte[] bArr = new byte[i2];
                            byte[] bArr2 = new byte[4];
                            FileInputStream fileInputStream = new FileInputStream(fileC);
                            try {
                                nsi.c(fileInputStream, bArr, i2, fileC);
                                nsi.c(fileInputStream, bArr2, 4, fileC);
                                JniZero.l(fileInputStream, null);
                                int i3 = (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[2] & 255) << 16) | ((bArr2[3] & 255) << 24);
                                int iB = nsi.b(bArr, i2);
                                if (iB != i3) {
                                    throw new IOException("CRC32 mismatch: expected 0x" + Integer.toHexString(i3) + ", computed 0x" + Integer.toHexString(iB));
                                }
                                if (i2 < 20) {
                                    aczlVar.d();
                                    acziVar = aczj.a;
                                } else {
                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
                                    byteBufferOrder.getClass();
                                    if (byteBufferOrder.getInt() != 1397904178) {
                                        aczlVar.d();
                                        acziVar = aczj.a;
                                    } else {
                                        long j = byteBufferOrder.getLong();
                                        long epochSecond = aczlVar.d.f().getEpochSecond();
                                        if (j == Long.MAX_VALUE || epochSecond < j - 86700) {
                                            long j2 = byteBufferOrder.getLong();
                                            aigj aigjVarW = aigj.w(bArr, 20, i - 24);
                                            aczh aczhVarA = aczlVar.a();
                                            if (awrc.c(aczhVarA, acze.a) || awrc.c(aczhVarA, aczf.a)) {
                                                if (j2 == 0) {
                                                    ((AtomicBoolean) aczlVar.g).set(true);
                                                    aigjVarW.getClass();
                                                    aczkVar = new aczk(aigjVarW);
                                                    acziVar = aczkVar;
                                                } else {
                                                    aczlVar.d();
                                                    acziVar = new aczi(null);
                                                }
                                            } else {
                                                if (!awrc.c(aczhVarA, aczg.a)) {
                                                    throw new awmj();
                                                }
                                                if (j2 == 0) {
                                                    ((AtomicBoolean) aczlVar.g).set(true);
                                                    aigjVarW.getClass();
                                                    aczkVar = new aczk(aigjVarW);
                                                    acziVar = aczkVar;
                                                } else {
                                                    acziVar = new aczi(null);
                                                }
                                            }
                                        } else {
                                            aczlVar.d();
                                            aczlVar.b();
                                            acziVar = new aczi(null);
                                        }
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    JniZero.l(fileInputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (IOException e) {
                            ?? r7 = aczlVar.b;
                            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                            aihfVarCreateBuilder.getClass();
                            atqn.f(aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR, aihfVarCreateBuilder);
                            r7.e(atqn.e(aihfVarCreateBuilder), e, "Failed to read DiskCache ServingContext file.", new Object[0]);
                            aczlVar.d();
                            acziVar = aczj.a;
                        }
                    } else {
                        acziVar = aczj.a;
                    }
                }
                if (acziVar instanceof aczk) {
                    return ahng.n(((aczk) acziVar).a);
                }
                if (acziVar instanceof aczi) {
                    return ahng.n(null);
                }
                tqj tqjVar2 = tqjVar;
                int i4 = tqr.a;
                if (tqjVar2.k(1073815695) && !tqjVar2.k(88687)) {
                    return ahcs.e(((adak) aunnVar.io()).c(), afwl.a(new abzr(18)), MoreExecutors.directExecutor());
                }
                ((aczl) agfrVar.io()).b();
                return ahng.n(null);
            }
        }));
    }

    public static boolean f(tqj tqjVar) {
        int i = tqr.a;
        return tqjVar.k(1073808332);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    public final ResourceLoader a() {
        return ((adak) this.g.io()).a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aunn, java.lang.Object] */
    public final ListenableFuture b(OptionalInt optionalInt, Executor executor) {
        if (h(optionalInt)) {
            return ahng.n(null);
        }
        if (f(this.h)) {
            return (optionalInt.isPresent() && c().isDone()) ? ahcs.e(c(), afwl.a(new acpb(optionalInt, 3)), executor) : d();
        }
        ListenableFuture listenableFutureE = aher.a;
        if (g() && ((AtomicBoolean) this.f).compareAndSet(false, true)) {
            if (((vxz) this.j).l(27, 45368905L, false)) {
                ((adak) this.g.io()).d();
                return ahng.n((aigj) ((AtomicReference) this.d).get());
            }
            listenableFutureE = ahcs.e(c(), afwl.a(new acpb(this, 4)), executor);
        }
        return optionalInt.isPresent() ? aheo.p(listenableFutureE).q(afwl.a(new acpb(this, 5)), executor).q(afwl.a(new acpb(optionalInt, 6)), executor) : ahcs.e(listenableFutureE, afwl.a(new acpb(this, 7)), executor);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    public final ListenableFuture c() {
        return ((adak) this.g.io()).c();
    }

    public final ListenableFuture d() {
        return (ListenableFuture) ((agfr) ((AtomicReference) this.e).get()).io();
    }

    public final void e(ResourceLoader resourceLoader) {
        ((AtomicReference) this.d).set(aigj.v(resourceLoader.getServingContext()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aunn, java.lang.Object] */
    public final boolean g() {
        return ((adak) this.g.io()).d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqj] */
    public final boolean h(OptionalInt optionalInt) {
        int i = tqr.a;
        ?? r0 = this.h;
        if (!r0.k(1073808332)) {
            alik alikVarB = ((vyo) this.k).b();
            if (alikVarB != null) {
                apjp apjpVar = alikVarB.l;
                if (apjpVar == null) {
                    apjpVar = apjp.a;
                }
                if (apjpVar.b) {
                    return true;
                }
            }
        } else if (r0.k(88634)) {
            return true;
        }
        return optionalInt.isPresent() && optionalInt.getAsInt() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [awmd, java.lang.Object] */
    public final synchronized void i() {
        if (this.c) {
            return;
        }
        this.c = true;
        xxk xxkVar = (xxk) this.g.io();
        Object obj = this.h;
        xxkVar.i = false;
        ((tbt) obj).f(xxkVar.g);
        ((tbt) obj).f(this.f.io());
        ((tbt) obj).f(this.d.io());
        ((tbt) obj).f(((xqz) this.a.io()).e);
        ((adhg) this.k.io()).a((xkd) this.j.io());
        ((xuy) this.e.io()).a();
        ((xon) this.i.io()).d();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awmd, java.lang.Object] */
    public final synchronized void j() {
        if (!this.b) {
            this.b = true;
            ((xuy) this.e.io()).a();
        }
    }

    public aczd(tbt tbtVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8) {
        this.h = tbtVar;
        this.g = awmdVar;
        this.a = awmdVar2;
        this.f = awmdVar3;
        this.d = awmdVar4;
        this.j = awmdVar5;
        this.k = awmdVar6;
        this.e = awmdVar7;
        this.i = awmdVar8;
    }
}
