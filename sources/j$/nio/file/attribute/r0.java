package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r0 implements UserDefinedFileAttributeView {
    public final /* synthetic */ s0 a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(String str) throws IOException {
        ((q0) this.a).c(str);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        s0 s0Var = this.a;
        if (obj instanceof r0) {
            obj = ((r0) obj).a;
        }
        return s0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ List list() {
        return ((q0) this.a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((q0) this.a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(String str, ByteBuffer byteBuffer) {
        return ((q0) this.a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(String str) {
        return ((q0) this.a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(String str, ByteBuffer byteBuffer) {
        return ((q0) this.a).g(str, byteBuffer);
    }
}
