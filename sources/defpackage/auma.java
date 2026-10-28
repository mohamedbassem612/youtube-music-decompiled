package defpackage;

import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class auma extends auly implements fge {
    private int a;

    protected auma(String str) {
        super(str);
    }

    public final int h() {
        if (!this.c) {
            g();
        }
        return this.a;
    }

    protected final void i(ByteBuffer byteBuffer) {
        int i = byteBuffer.get();
        if (i < 0) {
            i += SemanticState.Hidden;
        }
        this.a = i;
        fhz.g(byteBuffer);
        byteBuffer.get();
    }
}
