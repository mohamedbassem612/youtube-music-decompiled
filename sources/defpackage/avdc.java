package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class avdc implements avka {
    public static final Logger t = Logger.getLogger(avdc.class.getName());

    public abstract avdb b();

    @Override // defpackage.avka
    public boolean o() {
        throw null;
    }

    protected abstract avht p();

    @Override // defpackage.avka
    public final void r() {
        avht avhtVarP;
        axst axstVar;
        if (p().g || (axstVar = (avhtVarP = p()).k) == null || axstVar.g() <= 0) {
            return;
        }
        avhtVarP.a(false, true);
    }

    @Override // defpackage.avka
    public final void s() {
        avdb avdbVarB = b();
        avhp avhpVar = avdbVarB.d;
        avhpVar.a = avdbVarB;
        avdbVarB.a = avhpVar;
    }

    @Override // defpackage.avka
    public final void t(auyz auyzVar) {
        p().c = auyzVar;
    }

    @Override // defpackage.avka
    public final void u(InputStream inputStream) {
        int iA;
        try {
            if (!p().g) {
                avht avhtVarP = p();
                if (avhtVarP.g) {
                    throw new IllegalStateException("Framer already closed");
                }
                avhtVarP.h++;
                avhtVarP.i++;
                avhtVarP.j = 0L;
                avjz.b(avhtVarP.f);
                auyz auyzVar = avhtVarP.c;
                auyy auyyVar = auyx.a;
                try {
                    try {
                        int iAvailable = inputStream.available();
                        int i = 0;
                        if (iAvailable != 0 && auyzVar != auyyVar) {
                            avhq avhqVar = new avhq();
                            try {
                                iA = ((avkj) inputStream).a(avhqVar);
                                avhqVar.close();
                                int i2 = avhtVarP.a;
                                if (i2 >= 0 && iA > i2) {
                                    throw new avcg(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(avhtVarP.a))));
                                }
                                avhtVarP.b(avhqVar, true);
                            } catch (Throwable th) {
                                avhqVar.close();
                                throw th;
                            }
                        } else if (iAvailable != -1) {
                            avhtVarP.j = iAvailable;
                            int i3 = avhtVarP.a;
                            if (i3 >= 0 && iAvailable > i3) {
                                throw new avcg(Status.h.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iAvailable), Integer.valueOf(avhtVarP.a))));
                            }
                            ByteBuffer byteBuffer = avhtVarP.e;
                            byteBuffer.clear();
                            byteBuffer.put((byte) 0).putInt(iAvailable);
                            avhtVarP.b = iAvailable + 5;
                            avhtVarP.c(byteBuffer.array(), 0, byteBuffer.position());
                            iA = ((avkj) inputStream).a(avhtVarP.d);
                        } else {
                            avhq avhqVar2 = new avhq();
                            iA = ((avkj) inputStream).a(avhqVar2);
                            avhtVarP.b(avhqVar2, false);
                        }
                        if (iAvailable != -1 && iA != iAvailable) {
                            throw new avcg(Status.l.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(iA), Integer.valueOf(iAvailable))));
                        }
                        avjz avjzVar = avhtVarP.f;
                        avjz.b(avjzVar);
                        long j = avhtVarP.j;
                        while (true) {
                            avjt[] avjtVarArr = avjzVar.b;
                            if (i >= avjtVarArr.length) {
                                break;
                            }
                            avjtVarArr[i].c(j);
                            i++;
                        }
                        avjz.b(avjzVar);
                    } catch (RuntimeException e) {
                        throw new avcg(Status.l.withDescription("Failed to frame message").c(e));
                    }
                } catch (avcg e2) {
                    throw e2;
                } catch (IOException e3) {
                    throw new avcg(Status.l.withDescription("Failed to frame message").c(e3));
                }
            }
            avfp.e(inputStream);
        } catch (Throwable th2) {
            avfp.e(inputStream);
            throw th2;
        }
    }

    @Override // defpackage.avka
    public final void v() {
        avdb avdbVarB = b();
        avei aveiVar = avdbVarB.a;
        int i = avky.a;
        afjc afjcVar = new afjc(avdbVarB, 17, null);
        synchronized (((avfs) avdbVarB).s) {
            afjcVar.run();
        }
    }
}
