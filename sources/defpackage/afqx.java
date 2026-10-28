package defpackage;

import com.google.protobuf.MessageLite;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqx {
    public String a;
    public afqw b;
    public byte c;
    private agke d;
    private MessageLite e;
    private Optional f = Optional.empty();
    private final Optional g = Optional.empty();

    public final afqy a() {
        String str;
        MessageLite messageLite;
        afqw afqwVar;
        if (this.d == null) {
            this.d = agpi.a;
        }
        if (this.c == 1 && (str = this.a) != null && (messageLite = this.e) != null && (afqwVar = this.b) != null) {
            return new afqy(str, this.d, messageLite, afqwVar, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        if (this.c == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(bgr bgrVar) {
        this.f = Optional.of(bgrVar);
    }

    public final void c(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null schema");
        }
        this.e = messageLite;
    }
}
