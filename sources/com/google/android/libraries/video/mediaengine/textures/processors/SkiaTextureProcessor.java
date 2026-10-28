package com.google.android.libraries.video.mediaengine.textures.processors;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.util.Size;
import android.util.SizeF;
import com.google.protobuf.ExtensionRegistryLite;
import defpackage.aghu;
import defpackage.agjz;
import defpackage.agke;
import defpackage.agpi;
import defpackage.agqs;
import defpackage.ahxq;
import defpackage.aifs;
import defpackage.aihf;
import defpackage.aihn;
import defpackage.aiik;
import defpackage.atrf;
import defpackage.atrk;
import defpackage.atrl;
import defpackage.atrm;
import defpackage.awme;
import defpackage.bvn;
import defpackage.nra;
import defpackage.nrc;
import defpackage.qug;
import defpackage.quh;
import defpackage.quk;
import defpackage.qup;
import defpackage.quu;
import defpackage.quy;
import defpackage.rbc;
import defpackage.rbd;
import defpackage.rbm;
import defpackage.rco;
import defpackage.rcp;
import defpackage.rcu;
import defpackage.rew;
import defpackage.rfp;
import defpackage.rfs;
import defpackage.rgi;
import defpackage.rgr;
import defpackage.rjc;
import defpackage.tge;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class SkiaTextureProcessor extends rgr {
    public static final rbm g = new rbm("SkiaTextureProcessor");
    public final Optional d;
    public final Optional e;
    public long f;
    private final rjc h;
    private final qug i;
    private rco j;
    private UUID k;
    public final Object c = new Object();
    private float l = 1.0f;

    public SkiaTextureProcessor(rjc rjcVar, Optional optional, Optional optional2, qug qugVar) {
        this.h = rjcVar;
        this.d = optional;
        this.e = optional2;
        this.i = qugVar;
    }

    private native byte[] nativeDrawStickersSceneFromBytes(long j, int i, int i2, byte[] bArr, long j2, boolean z);

    @Override // defpackage.rgr
    protected final void c(rfs rfsVar) {
        boolean zL;
        synchronized (this.c) {
            UUID uuid = this.k;
            zL = true;
            if (uuid != null && rfsVar.A(uuid)) {
                this.k = null;
            } else if (!rfsVar.B()) {
                zL = false;
                if (this.k == null) {
                    zL = l(rfsVar, false);
                }
            }
        }
        if (zL) {
            e(rfsVar);
        } else {
            g(rfsVar);
        }
    }

    @Override // defpackage.rgr, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.h.c(new rcu(this, 20));
    }

    public final void h() {
        this.h.c(new rcu(this, 19));
    }

    public final void i(float f) {
        synchronized (this.c) {
            this.l = f;
        }
    }

    public final void j(rco rcoVar) {
        synchronized (this.c) {
            this.j = rcoVar;
        }
    }

    @Override // defpackage.rhd
    public final void k(rfs rfsVar) {
        synchronized (this.c) {
            this.k = rfsVar.l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(rfs rfsVar, boolean z) {
        agke agkeVarG;
        awme awmeVarP;
        int i = 0;
        if (this.f != 0) {
            rjc rjcVar = this.h;
            if (Thread.currentThread() == rjcVar.a()) {
                if (!z) {
                    try {
                        rjcVar.a().g(rfsVar.getTextureName(), rfsVar.getWidth(), rfsVar.getHeight());
                    } catch (ahxq e) {
                        e = e;
                        Iterable$EL.forEach(this.j.f, new rew(this, e, 2, null));
                        rbc rbcVar = new rbc(g, rbd.e);
                        rbcVar.c();
                        rbcVar.a = e;
                        rbcVar.a("Gl Error, failed to render the frame.", new Object[0]);
                        return false;
                    } catch (bvn e2) {
                        e = e2;
                        Iterable$EL.forEach(this.j.f, new rew(this, e, 2, null));
                        rbc rbcVar2 = new rbc(g, rbd.e);
                        rbcVar2.c();
                        rbcVar2.a = e;
                        rbcVar2.a("Gl Error, failed to render the frame.", new Object[0]);
                        return false;
                    } catch (RuntimeException e3) {
                        Iterable$EL.forEach(this.j.f, new rew(this, e3, 3, null));
                        rbc rbcVar3 = new rbc(g, rbd.e);
                        rbcVar3.c();
                        rbcVar3.a = e3;
                        rbcVar3.a("Failed to render the frame.", new Object[0]);
                        return false;
                    }
                }
                final Size size = new Size(rfsVar.getWidth(), rfsVar.getHeight());
                aihf aihfVarCreateBuilder = atrl.a.createBuilder();
                rco rcoVar = this.j;
                final float f = this.l;
                final Duration durationJ = rfsVar.j();
                agke agkeVar = (agke) Collection.EL.stream(rco.j(rcoVar.e, durationJ)).map(new Function() { // from class: rcn
                    @Override // java.util.function.Function
                    /* JADX INFO: renamed from: andThen */
                    public final /* synthetic */ Function mo840andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        qup qupVar = (qup) obj;
                        rbm rbmVar = rco.g;
                        rar rarVarJ = nqz.j(qupVar, qupVar.a.hashCode(), new rfb(size, f, 1));
                        rarVarJ.b = true;
                        rarVarJ.c = true;
                        return rarVarJ.b(durationJ.minus(qupVar.c));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(aghu.a);
                aihfVarCreateBuilder.copyOnWrite();
                atrl atrlVar = (atrl) aihfVarCreateBuilder.instance;
                atrlVar.a();
                aifs.addAll(agkeVar, atrlVar.b);
                byte[] bArrNativeDrawStickersSceneFromBytes = nativeDrawStickersSceneFromBytes(this.f, rfsVar.getWidth(), rfsVar.getHeight(), ((atrl) aihfVarCreateBuilder.build()).toByteArray(), rfsVar.getTimestamp(), !z);
                Duration durationJ2 = rfsVar.j();
                if (bArrNativeDrawStickersSceneFromBytes == null) {
                    throw new IllegalStateException("Scene info bytes is null.");
                }
                try {
                    atrm atrmVar = (atrm) aihn.parseFrom(atrm.a, bArrNativeDrawStickersSceneFromBytes, ExtensionRegistryLite.getGeneratedRegistry());
                    rco rcoVar2 = this.j;
                    agke agkeVarN = agke.n(atrmVar.b);
                    agke agkeVarJ = rco.j(rcoVar2.e, durationJ2);
                    if (agkeVarN.size() != agkeVarJ.size()) {
                        rbc rbcVar4 = new rbc(rco.g, rbd.e);
                        rbcVar4.c();
                        rbcVar4.a("layer bounds list size does not match the segments list size.", new Object[0]);
                        agkeVarG = agpi.a;
                    } else {
                        agjz agjzVar = new agjz(4);
                        agqs agqsVarListIterator = agkeVarJ.listIterator(0);
                        int size2 = agkeVarN.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            atrf atrfVar = (atrf) agkeVarN.get(i2);
                            qup qupVar = (qup) agqsVarListIterator.next();
                            UUID uuid = qupVar.a;
                            if (uuid.hashCode() != atrfVar.b) {
                                rbc rbcVar5 = new rbc(rco.g, rbd.e);
                                rbcVar5.c();
                                rbcVar5.a("layer bounds id does not match the segments id.", new Object[i]);
                                break;
                            }
                            Duration durationMinus = durationJ2.minus(qupVar.c);
                            quu quuVar = (quu) qupVar.b;
                            RectF rectF = new RectF();
                            for (atrk atrkVar : atrfVar.c) {
                                rectF.union(atrkVar.c, atrkVar.d, atrkVar.e, atrkVar.f);
                                agkeVarN = agkeVarN;
                            }
                            agke agkeVar2 = agkeVarN;
                            float fWidth = rectF.width();
                            float fHeight = rectF.height();
                            if (!quuVar.i.isEmpty()) {
                                fWidth *= quuVar.i.width() * 0.5f;
                                fHeight *= quuVar.i.height() * 0.5f;
                            }
                            float f2 = fWidth;
                            float f3 = fHeight;
                            if (quuVar instanceof quy) {
                                SizeF sizeFK = nrc.k(quuVar);
                                awmeVarP = nra.o(quuVar, new Size((int) (sizeFK.getWidth() * f2), (int) (sizeFK.getHeight() * f3)), size, durationMinus);
                            } else {
                                awmeVarP = nra.p(nra.r(quuVar.i, nrc.k(quuVar), nrc.j(quuVar), nrc.l(quuVar), f2, f3, size.getWidth(), size.getHeight(), quuVar.j), size);
                            }
                            agjzVar.h(new rfp(uuid, awmeVarP));
                            i2++;
                            agkeVarN = agkeVar2;
                            i = 0;
                        }
                        agkeVarG = agjzVar.g();
                    }
                    rfsVar.o(agkeVarG);
                    if (z) {
                        GLES20.glFlush();
                        return true;
                    }
                    rgi.g();
                    GLES20.glFinish();
                    return true;
                } catch (aiik e4) {
                    throw new IllegalStateException("Failed to parse scene info.", e4);
                }
            }
        }
        Iterable$EL.forEach(this.j.f, new rcp(this, 14));
        rbc rbcVar6 = new rbc(g, rbd.e);
        rbcVar6.c();
        rbcVar6.a("Preconditions failed!", new Object[0]);
        return false;
    }

    public final void m(qup qupVar, Throwable th, int i) {
        tge tgeVarA = quk.a();
        tgeVarA.b = th;
        tgeVarA.c = new quh(qupVar.a, i);
        this.i.a(tgeVarA.e());
    }

    public native long nativeCreateStickersScene(byte[] bArr, long j);

    public native void nativeReleaseStickersScene(long j);
}
