package defpackage;

import app.rive.semantics.SemanticState;
import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
class yzb implements buj {
    private final yye b;
    private GvrAudioSurround e;
    private boolean g;
    private float i;
    private float j;
    private float k;
    private float h = 1.0f;
    private bug c = bug.a;
    private ByteBuffer f = a;
    private int d = 0;

    public yzb(yye yyeVar) {
        this.b = yyeVar;
    }

    private final void l() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.a();
            this.e = null;
        }
    }

    @Override // defpackage.buj
    public final synchronized bug b(bug bugVar) {
        if (bugVar.d != 2) {
            l();
            throw new bui("Unhandled input format:", bugVar);
        }
        int i = bugVar.c;
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i2 = 4;
                if (i != 4) {
                    i2 = 6;
                    if (i == 6) {
                        i2 = 3;
                    } else if (i == 9) {
                        i2 = 5;
                    } else if (i != 16) {
                        throw new bui("Unhandled input format:", bugVar);
                    }
                }
            } else {
                i2 = 2;
            }
        }
        this.d = i2;
        if (this.f == a) {
            this.f = ByteBuffer.allocateDirect(SemanticState.Obscured).order(ByteOrder.nativeOrder());
        }
        this.c = bugVar;
        return new bug(bugVar.b, 2, 2);
    }

    @Override // defpackage.buj
    public ByteBuffer c() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround == null) {
            return a;
        }
        ByteBuffer byteBuffer = this.f;
        this.f.position(0).limit(gvrAudioSurround.nativeGetOutput(gvrAudioSurround.a, byteBuffer, 0, byteBuffer.capacity()));
        return this.f;
    }

    @Override // defpackage.buj
    public final void d() {
        if (this.d != 0) {
            l();
            try {
                int i = this.d;
                bug bugVar = this.c;
                GvrAudioSurround gvrAudioSurround = new GvrAudioSurround(i, bugVar.b, bugVar.c);
                this.e = gvrAudioSurround;
                gvrAudioSurround.b(this.h, this.i, this.j, this.k);
                this.d = 0;
            } catch (UnsatisfiedLinkError e) {
                zcf zcfVar = this.b.m;
                if (zcfVar != null) {
                    zhv zhvVar = new zhv("android.audiotrack");
                    zhvVar.e(0L);
                    zhvVar.d = e;
                    zhvVar.c = "c.GvrAudio";
                    zcfVar.Z.k(zhvVar.a());
                    return;
                }
                return;
            }
        } else {
            GvrAudioSurround gvrAudioSurround2 = this.e;
            if (gvrAudioSurround2 != null) {
                gvrAudioSurround2.nativeFlush(gvrAudioSurround2.a);
            }
        }
        this.g = false;
    }

    @Override // defpackage.buj
    public final void e() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.nativeTriggerProcessing(gvrAudioSurround.a);
        }
        this.g = true;
    }

    @Override // defpackage.buj
    public void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        GvrAudioSurround gvrAudioSurround = this.e;
        gvrAudioSurround.getClass();
        byteBuffer.position(iPosition + gvrAudioSurround.nativeAddInput(gvrAudioSurround.a, byteBuffer, iPosition, byteBuffer.limit() - iPosition));
    }

    @Override // defpackage.buj
    public final synchronized void g() {
        l();
        k(1.0f, 0.0f, 0.0f, 0.0f);
        this.g = false;
        this.c = bug.a;
        this.f = a;
        this.d = 0;
    }

    @Override // defpackage.buj
    public final boolean h() {
        return (this.d == 0 && this.e == null) ? false : true;
    }

    @Override // defpackage.buj
    public final boolean i() {
        if (!this.g) {
            return false;
        }
        GvrAudioSurround gvrAudioSurround = this.e;
        return gvrAudioSurround == null || gvrAudioSurround.nativeGetAvailableOutputSize(gvrAudioSurround.a) == 0;
    }

    @Override // defpackage.buj
    public final /* synthetic */ void j() {
        d();
    }

    public final synchronized void k(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.b(f, f2, f3, f4);
        }
    }

    @Override // defpackage.buj
    public final /* synthetic */ long a(long j) {
        return j;
    }
}
