package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxs {
    public final CommandOuterClass$Command a;
    public final nry b;
    private final CommandOuterClass$Command c;
    private FrameSequenceDrawable d;
    private fce e;
    private final Object f;

    public nxs(CommandOuterClass$Command commandOuterClass$Command, CommandOuterClass$Command commandOuterClass$Command2, nry nryVar, Object obj) {
        this.a = commandOuterClass$Command;
        this.c = commandOuterClass$Command2;
        this.b = nryVar;
        this.f = obj;
    }

    public final void a() {
        List list;
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.setOnFinishedListener(null);
        } else {
            fce fceVar = this.e;
            if (fceVar != null && (list = fceVar.e) != null) {
                list.clear();
            }
        }
        this.d = null;
        this.e = null;
    }

    final void b() {
        CommandOuterClass$Command commandOuterClass$Command = this.c;
        if (commandOuterClass$Command != null) {
            this.b.a(commandOuterClass$Command, null).D();
        }
    }

    public final void c(FrameSequenceDrawable frameSequenceDrawable) {
        this.d = frameSequenceDrawable;
        frameSequenceDrawable.setLoopBehavior(1);
        frameSequenceDrawable.setLoopCount(1);
        frameSequenceDrawable.setOnFinishedListener(new oto(this, 1));
    }

    public final void d(fce fceVar) {
        this.e = fceVar;
        fceVar.d();
        fceVar.c(new nxr(this));
    }

    public final void e() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.start();
            b();
            return;
        }
        fce fceVar = this.e;
        if (fceVar != null) {
            fceVar.start();
            b();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nxs)) {
            return false;
        }
        nxs nxsVar = (nxs) obj;
        Object obj2 = this.f;
        if (obj2 instanceof ahuj) {
            Object obj3 = nxsVar.f;
            if (obj3 instanceof ahuj) {
                ahuj ahujVar = (ahuj) obj2;
                ahuj ahujVar2 = (ahuj) obj3;
                if (ahujVar == null) {
                    if (ahujVar2 != null) {
                        return false;
                    }
                } else {
                    if (ahujVar2 == null) {
                        return false;
                    }
                    ByteBuffer byteBuffer = ahujVar.b;
                    ByteBuffer byteBuffer2 = ahujVar2.b;
                    if (byteBuffer == null) {
                        if (byteBuffer2 != null) {
                            return false;
                        }
                    } else {
                        if (byteBuffer2 == null) {
                            return false;
                        }
                        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray() || byteBuffer.arrayOffset() != byteBuffer2.arrayOffset() || byteBuffer.capacity() != byteBuffer2.capacity() || byteBuffer.position() != byteBuffer2.position() || byteBuffer.remaining() != byteBuffer2.remaining() || byteBuffer.array() != byteBuffer2.array()) {
                            return ahujVar.b.equals(ahujVar2.b);
                        }
                    }
                }
                return true;
            }
        }
        return obj2.equals(nxsVar.f);
    }

    public final void f() {
        FrameSequenceDrawable frameSequenceDrawable = this.d;
        if (frameSequenceDrawable != null) {
            frameSequenceDrawable.stop();
            return;
        }
        fce fceVar = this.e;
        if (fceVar != null) {
            fceVar.stop();
        }
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
