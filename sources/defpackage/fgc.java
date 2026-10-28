package defpackage;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class fgc implements fgd {
    private static final Logger b = Logger.getLogger(fgc.class.getName());
    final ThreadLocal a = new fgb();

    @Override // defpackage.fgd
    public final fge a(aumd aumdVar, fgf fgfVar) throws EOFException {
        int iA;
        long jC;
        long jB = aumdVar.b();
        ThreadLocal threadLocal = this.a;
        ((ByteBuffer) threadLocal.get()).rewind().limit(8);
        do {
            iA = aumdVar.a((ByteBuffer) threadLocal.get());
            if (iA == 8) {
                ((ByteBuffer) threadLocal.get()).rewind();
                long jE = fhz.e((ByteBuffer) threadLocal.get());
                if (jE < 8 && jE > 1) {
                    Logger logger = b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jE);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr = new byte[4];
                ((ByteBuffer) threadLocal.get()).get(bArr);
                try {
                    String str = new String(bArr, "ISO-8859-1");
                    if (jE == 1) {
                        ThreadLocal threadLocal2 = this.a;
                        ((ByteBuffer) threadLocal2.get()).limit(16);
                        aumdVar.a((ByteBuffer) threadLocal2.get());
                        ((ByteBuffer) threadLocal2.get()).position(8);
                        jC = fhz.f((ByteBuffer) threadLocal2.get()) - 16;
                    } else {
                        jC = jE == 0 ? aumdVar.c() - aumdVar.b() : jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ThreadLocal threadLocal3 = this.a;
                        ((ByteBuffer) threadLocal3.get()).limit(((ByteBuffer) threadLocal3.get()).limit() + 16);
                        aumdVar.a((ByteBuffer) threadLocal3.get());
                        byte[] bArr2 = new byte[16];
                        for (int iPosition = ((ByteBuffer) threadLocal3.get()).position() - 16; iPosition < ((ByteBuffer) threadLocal3.get()).position(); iPosition++) {
                            bArr2[iPosition - (((ByteBuffer) threadLocal3.get()).position() - 16)] = ((ByteBuffer) threadLocal3.get()).get(iPosition);
                        }
                        jC -= 16;
                    }
                    long j = jC;
                    if (fgfVar instanceof fge) {
                    }
                    fge fgeVarB = b(str);
                    ThreadLocal threadLocal4 = this.a;
                    ((ByteBuffer) threadLocal4.get()).rewind();
                    fgeVarB.d(aumdVar, (ByteBuffer) threadLocal4.get(), j, this);
                    return fgeVarB;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iA >= 0);
        aumdVar.d(jB);
        throw new EOFException();
    }

    public abstract fge b(String str);
}
