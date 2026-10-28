package defpackage;

import android.media.AudioFormat;
import j$.time.Duration;
import j$.time.temporal.ChronoUnit;
import j$.util.Optional;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyb implements qxz {
    public static final rbm a = new rbm("qyb");
    private final cgf b;
    private AudioFormat c;
    private boolean d;

    public qyb(byte[] bArr) {
        this.d = false;
        chd chdVarA = new cgz().a();
        this.b = chdVarA;
        chdVarA.c = new qya();
    }

    @Override // defpackage.qxz
    public final synchronized Optional a() {
        long jC;
        jC = this.b.c(this.d);
        return jC == Long.MIN_VALUE ? Optional.empty() : Optional.of(Duration.of(jC, ChronoUnit.MICROS));
    }

    @Override // defpackage.qxz
    public final synchronized void b() {
        this.b.i();
        this.d = false;
    }

    @Override // defpackage.qxz
    public final synchronized void c() {
        this.d = true;
        try {
            this.b.m();
        } catch (cge e) {
            rbc rbcVar = new rbc(a, rbd.e);
            rbcVar.a = e;
            rbcVar.c();
            rbcVar.a("AudioSink error while playing to end of stream.", new Object[0]);
        }
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.o();
        this.d = false;
    }

    @Override // defpackage.qxz
    public final synchronized void d() {
        this.b.k();
    }

    @Override // defpackage.qxz
    public final synchronized void e() {
        this.b.l();
    }

    @Override // defpackage.qxz
    public final synchronized void f(cgc cgcVar) {
        ((chd) this.b).c = cgcVar;
    }

    @Override // defpackage.qxz
    public final synchronized boolean g() {
        return this.d && this.b.G();
    }

    @Override // defpackage.qxz
    public final synchronized void h() {
        this.b.D(1.0f);
    }

    @Override // defpackage.ahxj
    public final synchronized void iA(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        AudioFormat audioFormat2 = this.c;
        if (audioFormat2 == null || !audioFormat.equals(audioFormat2)) {
            try {
                cgf cgfVar = this.b;
                bsd bsdVar = new bsd();
                bsdVar.e("audio/raw");
                bsdVar.J = audioFormat.getEncoding();
                bsdVar.G = audioFormat.getChannelCount();
                bsdVar.I = audioFormat.getSampleRate();
                cfy cfyVar = new cfy(new bse(bsdVar));
                cfyVar.b = null;
                cgfVar.g(cfyVar.a());
                this.c = audioFormat;
            } catch (cga e) {
                rbc rbcVar = new rbc(a, rbd.e);
                rbcVar.a = e;
                rbcVar.c();
                rbcVar.a("AudioSink could not be configured.", new Object[0]);
                return;
            }
        }
        try {
            this.b.E(byteBuffer, j, 1);
        } catch (cgb | cge e2) {
            rbc rbcVar2 = new rbc(a, rbd.e);
            rbcVar2.a = e2;
            rbcVar2.c();
            rbcVar2.a("Error pushing audio to sink.", new Object[0]);
        }
    }

    public qyb() {
        throw null;
    }
}
