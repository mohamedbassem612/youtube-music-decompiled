package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahhk {
    public static final ahnf a = ahnf.b(new byte[0]);

    public static final ahnf a(int i) {
        return ahnf.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final ahnf b(int i) {
        return ahnf.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
