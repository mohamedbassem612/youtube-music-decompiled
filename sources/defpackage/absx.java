package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class absx extends AbstractHttpEntity {
    private final bye a;
    private final byi b;
    private byg c;

    public absx(bye byeVar, byi byiVar) {
        this.a = byeVar;
        this.b = byiVar;
        setContentType("video/mp4");
    }

    @Override // org.apache.http.HttpEntity
    public final synchronized InputStream getContent() {
        byg bygVar;
        bygVar = this.c;
        if (bygVar == null) {
            byg bygVar2 = new byg(this.a, this.b);
            this.c = bygVar2;
            bygVar = bygVar2;
        }
        return bygVar;
    }

    @Override // org.apache.http.HttpEntity
    public final long getContentLength() {
        return this.b.i;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public final boolean isStreaming() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        InputStream content = getContent();
        try {
            agyi.a(content, outputStream);
        } finally {
            content.close();
        }
    }
}
