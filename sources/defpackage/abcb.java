package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abcb {
    private final int a;
    private final int b;
    private int c;

    public abcb(float[] fArr, int i) {
        this.c = 0;
        int length = fArr.length;
        ahno.F(length % i == 0);
        this.b = i;
        this.a = i << 2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr).position(0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        abbz.a(iArr[0]);
        int i2 = iArr[0];
        this.c = i2;
        GLES20.glBindBuffer(34962, i2);
        GLES20.glBufferData(34962, floatBufferAsFloatBuffer.capacity() << 2, floatBufferAsFloatBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
        floatBufferAsFloatBuffer.clear();
    }

    public final void a(int i) {
        int i2 = this.c;
        if (i2 != 0) {
            GLES20.glBindBuffer(34962, i2);
            GLES20.glVertexAttribPointer(i, this.b, 5126, false, this.a, 0);
            GLES20.glBindBuffer(34962, 0);
        }
    }

    public final void b() {
        int i = this.c;
        if (i != 0) {
            GLES20.glDeleteBuffers(1, new int[]{i}, 0);
            this.c = 0;
        }
    }
}
