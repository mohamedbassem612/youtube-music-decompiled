package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.youtube.music.watch.WatchFragment;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protos.youtube.api.innertube.InnertubeContext$ClientInfo;
import com.google.protos.youtube.api.innertube.InnertubeContext$InnerTubeContext;
import j$.time.Duration;
import j$.util.Map;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import pl.droidsonroids.gif.GifInfoHandle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jkb implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jkb(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x038d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v76, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        File fileCreateTempFile;
        axst axstVar;
        int i = 5;
        switch (this.$cid) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                try {
                    return ((jkc) obj2).g.d((String) obj, ((jkc) obj2).c, null);
                } catch (wno e) {
                    ((agrc) ((agrc) ((agrc) jkc.a.b().i(agso.a, "TastebuilderSearch")).j(e)).k("com/google/android/apps/youtube/music/userengagement/presenters/TastebuilderSearchPresenter", "fetchSearchResults", (char) 145, "TastebuilderSearchPresenter.java")).t("Error fetching tastebuilder search suggestions");
                    return null;
                }
            case 1:
                iux iuxVar = (iux) ahng.v(this.a);
                if (iuxVar == null) {
                    return null;
                }
                agke agkeVar = (agke) ahng.v(this.b);
                iuw iuwVar = new iuw();
                iuwVar.b(iuxVar.a);
                iuwVar.c(iuxVar.b);
                iuwVar.d(agkeVar);
                return iuwVar.a();
            case 2:
                fg.r((Activity) this.a, (fg) ((fg) ((WatchFragment) this.b).J.io()).a);
                return null;
            case 3:
                return new fya(new mqd(this.a, this.b));
            case 4:
                return new fyf(new jkb(this.a, this.b, i));
            case 5:
                Object obj3 = this.b;
                lbd lbdVarH = ((lfk) this.a).v().h((String) obj3);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", obj3);
                map.put("gmp_version", 192008L);
                if (lbdVarH == null) {
                    return map;
                }
                String strZ = lbdVarH.z();
                if (strZ != null) {
                    map.put("app_version", strZ);
                }
                map.put("app_version_int", Long.valueOf(lbdVarH.c()));
                map.put("dynamite_version", Long.valueOf(lbdVarH.g()));
                return map;
            case 6:
                return (Void) mda.n(((lmm) ((lkk) this.b).a.io()).b((Uri) this.a));
            case 7:
                aczl aczlVar = (aczl) this.b;
                aamo aamoVarA = ((kwv) aczlVar.d).a();
                if (aamoVarA == null) {
                    ((omj) aczlVar.g).j(15004);
                    return "";
                }
                String strN = aamoVarA.n((Context) this.a);
                if (strN != null) {
                    return strN;
                }
                ((omj) aczlVar.g).j(15006);
                return "";
            case 8:
                return Boolean.valueOf(((syn) this.a).c.containsKey(this.b));
            case 9:
                return agev.h((ListenableFuture) ((syn) this.a).c.get(this.b));
            case 10:
                return ((omm) this.a).p((plx) this.b);
            case 11:
                Object obj4 = this.b;
                Object obj5 = this.a;
                try {
                    File file = new File((String) ((qnc) obj5).b.io());
                    agyo.b(file);
                    fileCreateTempFile = File.createTempFile("snapshot", ".pb", file.getParentFile());
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                        try {
                            ((aifs) obj4).writeTo(fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            fileOutputStream.close();
                            if (fileCreateTempFile.renameTo(file)) {
                                return null;
                            }
                            throw new IOException(String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        Exception exc = e;
                        if (fileCreateTempFile != null) {
                            try {
                                fileCreateTempFile.delete();
                            } catch (SecurityException e3) {
                                exc.addSuppressed(e3);
                            }
                            break;
                        }
                        qnc qncVar = (qnc) obj5;
                        qnl.q(Level.WARNING, qncVar.a.b(), exc, "Failed to update snapshot for %s flags may be stale.", qncVar.c);
                        return null;
                    } catch (RuntimeException e4) {
                        e = e4;
                        Exception exc2 = e;
                        if (fileCreateTempFile != null) {
                            fileCreateTempFile.delete();
                            break;
                        }
                        qnc qncVar2 = (qnc) obj5;
                        qnl.q(Level.WARNING, qncVar2.a.b(), exc2, "Failed to update snapshot for %s flags may be stale.", qncVar2.c);
                        return null;
                    }
                } catch (IOException | RuntimeException e5) {
                    e = e5;
                    fileCreateTempFile = null;
                }
                break;
            case 12:
                this.b.close();
                return ahng.v(this.a);
            case 13:
                qsi qsiVar = (qsi) this.a;
                qsiVar.d.b();
                try {
                    return this.b.call();
                } finally {
                    qsiVar.d.a();
                }
            case 14:
                Object obj6 = this.a;
                ((qxt) obj6).c.clear();
                Map.EL.forEach(this.b, new gpd(obj6, i));
                return null;
            case 15:
                int i2 = rdl.c;
                ?? r0 = this.a;
                ((ConcurrentLinkedDeque) this.b).remove(r0);
                return r0.get();
            case 16:
                Object obj7 = this.a;
                rdr rdrVar = (rdr) obj7;
                rbo rboVar = rdrVar.w;
                quc qucVar = rdrVar.n.b;
                rdj rdjVar = rdrVar.g;
                rboVar.g(qucVar, rdjVar.a());
                Duration durationV = rdrVar.v((Duration) this.b);
                rdrVar.h.lock();
                try {
                    try {
                        ((rdr) obj7).w.e(durationV.minus(rdjVar.a()).abs());
                        ((rdr) obj7).d.a();
                        rdo rdoVar = ((rdr) obj7).i;
                        synchronized (rdoVar.a) {
                            rdoVar.d = false;
                            rdoVar.g = false;
                            rdoVar.f = true;
                            rdoVar.b();
                            break;
                        }
                        ((rdr) obj7).g.c(durationV);
                        ((rdr) obj7).A.b();
                        ((rdr) obj7).z.iz(durationV);
                        ((rdr) obj7).A.c();
                        ((rdr) obj7).t.a(durationV).get(rdr.a.toNanos(), TimeUnit.NANOSECONDS);
                        ((rdr) obj7).A.a();
                        rdrVar.h.unlock();
                        rdrVar.m.post(new rcu(obj7, 9));
                        rdrVar.d.c();
                        return durationV;
                    } catch (InterruptedException e6) {
                        throw e6;
                    } catch (Exception e7) {
                        rbc rbcVar = new rbc(rdr.I, rbd.d);
                        rbcVar.a = e7;
                        rbcVar.c();
                        rbcVar.a("Error seeking.", new Object[0]);
                        tge tgeVarA = quk.a();
                        tgeVarA.b = e7;
                        tgeVarA.c = new quf(1);
                        ((rdr) obj7).D(tgeVarA.e());
                        throw e7;
                    }
                } catch (Throwable th3) {
                    rdrVar.h.unlock();
                    throw th3;
                }
            case 17:
                Object obj8 = this.a;
                rhc rhcVar = (rhc) obj8;
                rhcVar.l.remove(this.b);
                synchronized (rhcVar.k) {
                    ((rhc) obj8).n();
                    break;
                }
                return null;
            case 18:
                Object obj9 = this.a;
                Optional optional = ((rhg) this.b).h;
                rbj rbjVar = new rbj(obj9, 10);
                if (true != optional.isPresent()) {
                    return null;
                }
                nqy.i(agyz.c(Stream.CC.of(new AbstractMap.SimpleImmutableEntry(rbjVar.a, (qvk) optional.get()))));
                return null;
            case 19:
                Object obj10 = this.a;
                Object obj11 = this.b;
                rhy rhyVar = (rhy) obj11;
                qwr qwrVar = rhyVar.a;
                if (!(qwrVar instanceof qwt)) {
                    qwr qwrVar2 = rhyVar.a;
                    rbc rbcVar2 = new rbc(rhy.j, rbd.e);
                    rbcVar2.c();
                    rbcVar2.a("Failed to load image with unknown source: %s", qwrVar2);
                    throw new IllegalStateException("Failed to load image with unknown source");
                }
                try {
                    AssetFileDescriptor assetFileDescriptorA = qol.a((Context) obj10, ((qwt) qwrVar).a, "r", ((qwt) qwrVar).a());
                    try {
                        FileInputStream fileInputStreamCreateInputStream = assetFileDescriptorA.createInputStream();
                        try {
                            int iAvailable = fileInputStreamCreateInputStream.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamCreateInputStream.read(bArr);
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                            bmu bmuVar = new bmu(byteArrayInputStream);
                            byteArrayInputStream.close();
                            int iJ = bmuVar.j();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(bArr, 0, iAvailable, options);
                            Size size = new Size(options.outWidth, options.outHeight);
                            if (iJ == 6) {
                                size = new Size(size.getHeight(), size.getWidth());
                            } else if (iJ == 8) {
                                iJ = 8;
                                size = new Size(size.getHeight(), size.getWidth());
                            }
                            ((rif) obj11).t(size);
                            int width = size.getWidth() / ((rif) obj11).o().getWidth();
                            if (iAvailable > 3 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70) {
                                axss axssVar = new axss();
                                if (width <= 0 || width > 65535) {
                                    axssVar.a = (char) 1;
                                } else {
                                    axssVar.a = (char) width;
                                }
                                axstVar = new axst(new axst(bArr), axssVar);
                            } else {
                                axstVar = null;
                            }
                            if (axstVar == null || ((GifInfoHandle) axstVar.a).d() <= 1 || axstVar.a() <= 0) {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = width;
                                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iAvailable, options2);
                                Bitmap bitmapJ = rhy.j(bitmapDecodeByteArray, iJ);
                                bitmapDecodeByteArray.recycle();
                                ((rif) obj11).t(new Size(bitmapJ.getWidth(), bitmapJ.getHeight()));
                                ((rhy) obj11).n(null, bitmapJ);
                            } else {
                                ((rhy) obj11).m(axstVar);
                                ((rif) obj11).t(new Size(axstVar.e(), axstVar.c()));
                                ((rhy) obj11).b.set(axstVar);
                                ((rhy) obj11).g.set(true);
                                ((rhy) obj11).n(axstVar, null);
                            }
                            if (fileInputStreamCreateInputStream != null) {
                                fileInputStreamCreateInputStream.close();
                            }
                            if (assetFileDescriptorA == null) {
                                return null;
                            }
                            assetFileDescriptorA.close();
                            return null;
                        } catch (Throwable th4) {
                            if (fileInputStreamCreateInputStream == null) {
                                throw th4;
                            }
                            try {
                                fileInputStreamCreateInputStream.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                            rbc rbcVar3 = new rbc(rhy.j, rbd.e);
                            rbcVar3.a = e;
                            rbcVar3.c();
                            rbcVar3.a("Failed to load image from Uri", new Object[0]);
                            throw new IllegalStateException("Failed to load image", e);
                        }
                    } catch (Throwable th6) {
                        if (assetFileDescriptorA == null) {
                            throw th6;
                        }
                        try {
                            assetFileDescriptorA.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Exception e8) {
                    rbc rbcVar4 = new rbc(rhy.j, rbd.e);
                    rbcVar4.a = e8;
                    rbcVar4.c();
                    rbcVar4.a("Failed to load image from Uri", new Object[0]);
                    throw new IllegalStateException("Failed to load image", e8);
                }
            default:
                aaai aaaiVar = (aaai) this.a;
                anim animVar = ((vxu) aaaiVar.b).c().n;
                if (animVar == null) {
                    animVar = anim.a;
                }
                aihf aihfVarCreateBuilder = InnertubeContext$ClientInfo.a.createBuilder();
                if (animVar.i && animVar.h) {
                    aobj aobjVarA = ((rrl) aaaiVar.a.io()).a();
                    aihfVarCreateBuilder.copyOnWrite();
                    InnertubeContext$ClientInfo innertubeContext$ClientInfo = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
                    innertubeContext$ClientInfo.S = aobjVarA.g;
                    innertubeContext$ClientInfo.d |= 262144;
                }
                agev agevVar = (agev) ahng.v(this.b);
                if (agevVar.g() && animVar.m && animVar.j) {
                    long jLongValue = ((Long) agevVar.c()).longValue() / 1024;
                    aihfVarCreateBuilder.copyOnWrite();
                    InnertubeContext$ClientInfo innertubeContext$ClientInfo2 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.instance;
                    innertubeContext$ClientInfo2.d |= 524288;
                    innertubeContext$ClientInfo2.T = jLongValue;
                }
                aihf aihfVarCreateBuilder2 = InnertubeContext$InnerTubeContext.a.createBuilder();
                aihfVarCreateBuilder2.copyOnWrite();
                InnertubeContext$InnerTubeContext innertubeContext$InnerTubeContext = (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.instance;
                InnertubeContext$ClientInfo innertubeContext$ClientInfo3 = (InnertubeContext$ClientInfo) aihfVarCreateBuilder.build();
                innertubeContext$ClientInfo3.getClass();
                innertubeContext$InnerTubeContext.c = innertubeContext$ClientInfo3;
                innertubeContext$InnerTubeContext.b |= 1;
                return (InnertubeContext$InnerTubeContext) aihfVarCreateBuilder2.build();
        }
    }

    public /* synthetic */ jkb(Object obj, Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
