package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wlh {
    public byte[] a;
    public int b;
    public byte c;
    public byte d;

    public wlh(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            this.a = new byte[(int) file.length()];
            int i = 0;
            while (true) {
                byte[] bArr = this.a;
                int i2 = fileInputStream.read(bArr, i, bArr.length - i);
                if (i2 <= 0) {
                    break;
                } else {
                    i += i2;
                }
            }
            fileInputStream.close();
            if (i >= 4) {
                byte[] bArr2 = this.a;
                if ((bArr2[0] & bArr2[1] & bArr2[2]) == -1) {
                    this.c = bArr2[3];
                    this.b += 4;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void b(OutputStream outputStream, MessageLite messageLite) throws IOException {
        if (messageLite == null) {
            outputStream.write(0);
            outputStream.write(0);
            outputStream.write(0);
        } else {
            byte[] byteArray = messageLite.toByteArray();
            int length = byteArray.length;
            outputStream.write(length & 255);
            outputStream.write((length >> 8) & 255);
            outputStream.write((length >> 16) & 255);
            outputStream.write(byteArray);
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public final MessageLite a(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite) {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        this.b = i + 3;
        int i5 = i2 | (i3 << 8) | (i4 << 16);
        ?? I = messageLite.getParserForType().i(this.a, this.b, i5, extensionRegistryLite);
        this.b += i5;
        return I;
    }
}
