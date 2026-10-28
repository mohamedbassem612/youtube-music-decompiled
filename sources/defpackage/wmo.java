package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmo {
    public static final ExtensionRegistryLite a;
    public final tqj b;
    public int c;

    static {
        ExtensionRegistryLite generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        generatedRegistry.getClass();
        a = generatedRegistry;
    }

    public wmo(tqj tqjVar) {
        tqjVar.getClass();
        this.b = tqjVar;
    }

    public static final void b(ByteBuffer byteBuffer, awrk awrkVar, ArrayList arrayList, awrl awrlVar, int i) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.getClass();
        byteBufferDuplicate.position(awrkVar.a);
        byteBufferDuplicate.limit(awrkVar.a + i);
        arrayList.add(byteBufferDuplicate);
        awrkVar.a += i;
        awrlVar.a += (long) i;
    }

    public final aigm a(Iterable iterable) {
        return c() ? nsi.i(iterable) : aigm.T(iterable);
    }

    public final boolean c() {
        int i = tqr.a;
        return this.b.k(1073815716);
    }
}
