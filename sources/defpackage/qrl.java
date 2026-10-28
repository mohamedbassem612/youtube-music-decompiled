package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qrl {
    public rmp a;
    private Uri b;
    private MessageLite c;
    private agev d = agdf.a;
    private agjz e;
    private agke f;
    private boolean g;
    private byte h;

    public final qrm a() {
        Uri uri;
        MessageLite messageLite;
        rmp rmpVar;
        agjz agjzVar = this.e;
        if (agjzVar != null) {
            this.f = agjzVar.g();
        } else if (this.f == null) {
            this.f = agpi.a;
        }
        if (this.h == 3 && (uri = this.b) != null && (messageLite = this.c) != null && (rmpVar = this.a) != null) {
            return new qrm(uri, messageLite, this.d, this.f, rmpVar, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" uri");
        }
        if (this.c == null) {
            sb.append(" schema");
        }
        if (this.a == null) {
            sb.append(" variantConfig");
        }
        if ((this.h & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.h & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(qrh qrhVar) {
        if (this.e == null) {
            if (this.f == null) {
                this.e = new agjz(4);
            } else {
                agjz agjzVar = new agjz(4);
                this.e = agjzVar;
                agjzVar.j(this.f);
                this.f = null;
            }
        }
        this.e.h(qrhVar);
    }

    public final void c() {
        this.h = (byte) (this.h | 2);
    }

    public final void d(qrb qrbVar) {
        qrbVar.getClass();
        this.d = new agfa(qrbVar);
    }

    public final void e(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = messageLite;
    }

    public final void f(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.b = uri;
    }

    public final void g(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 1);
    }
}
