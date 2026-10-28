package defpackage;

import com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate;
import com.google.android.libraries.elements.interfaces.ValidationResult;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.time.Instant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adbf extends ResourceLoaderDelegate {
    private final aczb a;
    private final aczd b;
    private final nuc c;
    private final tqj d;
    private final aunn e;

    public adbf(aczb aczbVar, aczd aczdVar, nuc nucVar, aunn aunnVar, tqj tqjVar) {
        this.a = aczbVar;
        this.b = aczdVar;
        this.c = nucVar;
        this.d = tqjVar;
        this.e = aunnVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onAttemptedToCacheResource(String str, ValidationResult validationResult, Status status) {
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int iOrdinal = validationResult.ordinal();
        if (iOrdinal == 0) {
            nuc nucVar = this.c;
            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
            asncVar.d = aslhVar.I;
            asncVar.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
            str.getClass();
            asncVar2.b |= 32;
            asncVar2.i = str;
            nucVar.b((asnc) aihfVarCreateBuilder.build(), "ELMCache: Error caching resource due to unknown reason.", new Object[0]);
            return;
        }
        if (iOrdinal == 2) {
            if (status.getCode() == Status.Code.RESOURCE_EXHAUSTED) {
                aihf aihfVarCreateBuilder2 = asnb.a.createBuilder();
                int iValue = status.getCode().value();
                aihfVarCreateBuilder2.copyOnWrite();
                asnb asnbVar = (asnb) aihfVarCreateBuilder2.instance;
                asnbVar.b |= 1;
                asnbVar.c = iValue;
                if (!ahno.aa(status.getDescription())) {
                    String description = status.getDescription();
                    aihfVarCreateBuilder2.copyOnWrite();
                    asnb asnbVar2 = (asnb) aihfVarCreateBuilder2.instance;
                    description.getClass();
                    asnbVar2.b |= 2;
                    asnbVar2.d = description;
                }
                nuc nucVar2 = this.c;
                aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
                aslh aslhVar2 = aslh.LOG_TYPE_RESOURCE_WARNING;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
                asncVar3.d = aslhVar2.I;
                asncVar3.b |= 2;
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
                str.getClass();
                asncVar4.b |= 32;
                asncVar4.i = str;
                asnb asnbVar3 = (asnb) aihfVarCreateBuilder2.build();
                aihfVarCreateBuilder3.copyOnWrite();
                asnc asncVar5 = (asnc) aihfVarCreateBuilder3.instance;
                asnbVar3.getClass();
                asncVar5.j = asnbVar3;
                asncVar5.b |= 64;
                nucVar2.b((asnc) aihfVarCreateBuilder3.build(), "ELMCache: Resource was not cached because the cache filled up while writing.", new Object[0]);
                return;
            }
            aihf aihfVarCreateBuilder4 = asnb.a.createBuilder();
            int iValue2 = status.getCode().value();
            aihfVarCreateBuilder4.copyOnWrite();
            asnb asnbVar4 = (asnb) aihfVarCreateBuilder4.instance;
            asnbVar4.b |= 1;
            asnbVar4.c = iValue2;
            if (!ahno.aa(status.getDescription())) {
                String description2 = status.getDescription();
                aihfVarCreateBuilder4.copyOnWrite();
                asnb asnbVar5 = (asnb) aihfVarCreateBuilder4.instance;
                description2.getClass();
                asnbVar5.b |= 2;
                asnbVar5.d = description2;
            }
            nuc nucVar3 = this.c;
            aihf aihfVarCreateBuilder5 = asnc.a.createBuilder();
            aslh aslhVar3 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder5.copyOnWrite();
            asnc asncVar6 = (asnc) aihfVarCreateBuilder5.instance;
            asncVar6.d = aslhVar3.I;
            asncVar6.b |= 2;
            aihfVarCreateBuilder5.copyOnWrite();
            asnc asncVar7 = (asnc) aihfVarCreateBuilder5.instance;
            str.getClass();
            asncVar7.b |= 32;
            asncVar7.i = str;
            asnb asnbVar6 = (asnb) aihfVarCreateBuilder4.build();
            aihfVarCreateBuilder5.copyOnWrite();
            asnc asncVar8 = (asnc) aihfVarCreateBuilder5.instance;
            asnbVar6.getClass();
            asncVar8.j = asnbVar6;
            asncVar8.b |= 64;
            nucVar3.b((asnc) aihfVarCreateBuilder5.build(), "ELMCache: Error caching resource due to failure.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r12v1, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [agfr, java.lang.Object] */
    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onDiskCacheServingContextUpdated(byte[] bArr, Long l) {
        int i = tqr.a;
        if (!this.d.k(1073808332)) {
            return;
        }
        aczd aczdVar = this.b;
        Instant instantOfEpochSecond = l != null ? Instant.ofEpochSecond(l.longValue()) : null;
        if (!aczdVar.h.k(1073808332)) {
            return;
        }
        synchronized (aczdVar.a) {
            if (aczdVar.c || bArr.length == 0) {
                ((aczl) aczdVar.i.io()).d();
                if (!aczdVar.b) {
                    ((AtomicReference) aczdVar.e).set(new agfu(aher.a));
                }
                return;
            }
            aczl aczlVar = (aczl) aczdVar.i.io();
            Long lValueOf = instantOfEpochSecond != null ? Long.valueOf(instantOfEpochSecond.getEpochSecond()) : null;
            bArr.getClass();
            long jLongValue = lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE;
            aczlVar.a();
            aigj aigjVarV = aigj.v(bArr);
            aigjVarV.getClass();
            ByteBuffer byteBufferPutLong = ByteBuffer.allocate(aigjVarV.d() + 20).order(ByteOrder.BIG_ENDIAN).putInt(1397904178).putLong(jLongValue).putLong(0L);
            byteBufferPutLong.getClass();
            byteBufferPutLong.put(((aigh) aigjVarV).a);
            try {
                File fileC = aczlVar.c();
                byte[] bArrArray = byteBufferPutLong.array();
                bArrArray.getClass();
                zdj zdjVar = new zdj(fileC);
                File parentFile = ((File) zdjVar.a).getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                File fileG = zdjVar.g();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileG);
                    zdjVar.b = fileG;
                    try {
                        fileOutputStream.write(bArrArray);
                        int iB = nsi.b(bArrArray, bArrArray.length);
                        fileOutputStream.write(new byte[]{(byte) (iB & 255), (byte) ((iB >>> 8) & 255), (byte) ((iB >>> 16) & 255), (byte) (iB >> 24)});
                        Object obj = zdjVar.b;
                        if (obj == null) {
                            throw new IOException("commitWrite called without an active startWrite transaction");
                        }
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            Object obj2 = zdjVar.a;
                            if (!tqs.a((File) obj, (File) obj2) && !((File) obj).renameTo((File) obj2)) {
                                Objects.toString(obj2);
                                throw new IOException("Failed to atomically rename temporary file to ".concat(obj2.toString()));
                            }
                            zdjVar.b = null;
                            zdjVar.h(fileOutputStream);
                            if (!aczdVar.b) {
                                ((AtomicReference) aczdVar.e).set(new agfu(new aher(aigjVarV)));
                            }
                        } catch (Throwable th) {
                            fileOutputStream.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        zdjVar.h(fileOutputStream);
                        throw th2;
                    }
                } catch (IOException e) {
                    fileG.delete();
                    throw e;
                }
            } catch (IOException e2) {
                if (((AtomicBoolean) aczlVar.e).compareAndSet(false, true)) {
                    ?? r0 = aczlVar.b;
                    aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    atqn.f(aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR, aihfVarCreateBuilder);
                    r0.e(atqn.e(aihfVarCreateBuilder), e2, "Failed to write DiskCache ServingContext file.", new Object[0]);
                }
            }
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onMissingCacheDependency(String str) {
        aihf aihfVarCreateBuilder = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        aihfVarCreateBuilder.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
        str.getClass();
        asncVar2.b |= 32;
        asncVar2.i = str;
        this.c.b((asnc) aihfVarCreateBuilder.build(), "ELMCache: The following resource is missing during caching.", new Object[0]);
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceCachePrepared(String str, Status status) {
        if (status.e()) {
            return;
        }
        aihf aihfVarCreateBuilder = asnb.a.createBuilder();
        int iValue = status.getCode().value();
        aihfVarCreateBuilder.copyOnWrite();
        asnb asnbVar = (asnb) aihfVarCreateBuilder.instance;
        asnbVar.b |= 1;
        asnbVar.c = iValue;
        if (!ahno.aa(status.getDescription())) {
            String description = status.getDescription();
            aihfVarCreateBuilder.copyOnWrite();
            asnb asnbVar2 = (asnb) aihfVarCreateBuilder.instance;
            description.getClass();
            asnbVar2.b |= 2;
            asnbVar2.d = description;
        }
        nuc nucVar = this.c;
        aihf aihfVarCreateBuilder2 = asnc.a.createBuilder();
        aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
        aihfVarCreateBuilder2.copyOnWrite();
        asnc asncVar = (asnc) aihfVarCreateBuilder2.instance;
        asncVar.d = aslhVar.I;
        asncVar.b |= 2;
        aihfVarCreateBuilder2.copyOnWrite();
        asnc asncVar2 = (asnc) aihfVarCreateBuilder2.instance;
        str.getClass();
        asncVar2.b |= 32;
        asncVar2.i = str;
        asnb asnbVar3 = (asnb) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        asnc asncVar3 = (asnc) aihfVarCreateBuilder2.instance;
        asnbVar3.getClass();
        asncVar3.j = asnbVar3;
        asncVar3.b |= 64;
        nucVar.b((asnc) aihfVarCreateBuilder2.build(), "ELMCache: Error preparing resource for caching.", new Object[0]);
    }

    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onResourceProcessed(String str, ValidationResult validationResult, Status status) {
        avlb avlbVarV;
        ValidationResult validationResult2 = ValidationResult.UNKNOWN;
        int iOrdinal = validationResult.ordinal();
        if (iOrdinal == 0) {
            ((vzt) this.e.io()).d();
            nuc nucVar = this.c;
            aihf aihfVarCreateBuilder = asnc.a.createBuilder();
            aslh aslhVar = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar = (asnc) aihfVarCreateBuilder.instance;
            asncVar.d = aslhVar.I;
            asncVar.b |= 2;
            aihfVarCreateBuilder.copyOnWrite();
            asnc asncVar2 = (asnc) aihfVarCreateBuilder.instance;
            str.getClass();
            asncVar2.b |= 32;
            asncVar2.i = str;
            nucVar.b((asnc) aihfVarCreateBuilder.build(), "Error loading resource due to unknown reason.", new Object[0]);
            return;
        }
        if (iOrdinal == 1) {
            aczb aczbVar = this.a;
            aczbVar.d.add(str);
            if (!((adak) aczbVar.e.io()).d || !aczbVar.k()) {
                avlbVarV = avpy.a;
                avnn avnnVar = atqp.p;
            } else if (((vxz) aczbVar.f.io()).l(14, 45785871L, false)) {
                ListenableFuture listenableFutureF = aczbVar.f();
                avps avpsVar = new avps(new tzb(listenableFutureF));
                avnn avnnVar2 = atqp.p;
                avmb avmbVar = aczbVar.g;
                avlbVarV = avpsVar.r(avmbVar).j(new vtu(listenableFutureF, 19)).v(avmbVar);
            } else {
                avlbVarV = new avqa(new isg(aczbVar, 6));
                avnn avnnVar3 = atqp.p;
            }
            avmb avmbVar2 = awlg.b;
            avnn avnnVar4 = atqp.g;
            avlbVarV.v(avmbVar2).D();
            return;
        }
        if (iOrdinal == 2) {
            aihf aihfVarCreateBuilder2 = asnb.a.createBuilder();
            int iValue = status.getCode().value();
            aihfVarCreateBuilder2.copyOnWrite();
            asnb asnbVar = (asnb) aihfVarCreateBuilder2.instance;
            asnbVar.b |= 1;
            asnbVar.c = iValue;
            if (!ahno.aa(status.getDescription())) {
                String description = status.getDescription();
                aihfVarCreateBuilder2.copyOnWrite();
                asnb asnbVar2 = (asnb) aihfVarCreateBuilder2.instance;
                description.getClass();
                asnbVar2.b |= 2;
                asnbVar2.d = description;
            }
            ((vzt) this.e.io()).d();
            nuc nucVar2 = this.c;
            aihf aihfVarCreateBuilder3 = asnc.a.createBuilder();
            aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR;
            aihfVarCreateBuilder3.copyOnWrite();
            asnc asncVar3 = (asnc) aihfVarCreateBuilder3.instance;
            asncVar3.d = aslhVar2.I;
            asncVar3.b |= 2;
            aihfVarCreateBuilder3.copyOnWrite();
            asnc asncVar4 = (asnc) aihfVarCreateBuilder3.instance;
            str.getClass();
            asncVar4.b |= 32;
            asncVar4.i = str;
            asnb asnbVar3 = (asnb) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder3.copyOnWrite();
            asnc asncVar5 = (asnc) aihfVarCreateBuilder3.instance;
            asnbVar3.getClass();
            asncVar5.j = asnbVar3;
            asncVar5.b |= 64;
            nucVar2.b((asnc) aihfVarCreateBuilder3.build(), "Error loading resource due to failure.", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, tqj] */
    @Override // com.google.android.libraries.elements.interfaces.ResourceLoaderDelegate
    public final void onServingContextUpdated(byte[] bArr) {
        aigj aigjVar = aigj.d;
        try {
            aigj aigjVarH = aigj.H(bArr, 0, bArr.length);
            aczd aczdVar = this.b;
            ?? r0 = aczdVar.h;
            int i = tqr.a;
            if (!r0.k(1073808332)) {
                ((AtomicReference) aczdVar.d).set(aigjVarH);
                return;
            }
            synchronized (aczdVar.a) {
                aczdVar.b = true;
                ((AtomicReference) aczdVar.e).set(new agfu(aigjVarH == null ? aher.a : new aher(aigjVarH)));
            }
        } catch (aiik e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }
}
