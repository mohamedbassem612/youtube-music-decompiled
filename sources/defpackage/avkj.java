package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class avkj extends InputStream implements InputStreamRetargetInterface, avaf {
    public MessageLite a;
    public final aiix b;
    private ByteArrayInputStream c;

    public avkj(MessageLite messageLite, aiix aiixVar) {
        this.a = messageLite;
        this.b = aiixVar;
    }

    public final int a(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.a.writeTo(outputStream);
            this.a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = avkl.a;
        outputStream.getClass();
        byte[] bArr = new byte[SemanticState.Multiline];
        long j = 0;
        while (true) {
            int i = byteArrayInputStream.read(bArr);
            if (i == -1) {
                int i2 = (int) j;
                this.c = null;
                return i2;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (i2 >= serializedSize) {
                aigo aigoVar = new aigo(bArr, i, serializedSize, null);
                this.a.writeTo(aigoVar);
                aigoVar.d();
                aigoVar.P();
                this.a = null;
                this.c = null;
                return serializedSize;
            }
            this.c = new ByteArrayInputStream(this.a.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        MessageLite messageLite = this.a;
        if (messageLite != null) {
            this.c = new ByteArrayInputStream(messageLite.toByteArray());
            this.a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }
}
