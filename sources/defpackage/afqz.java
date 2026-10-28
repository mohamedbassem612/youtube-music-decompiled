package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afqz {
    public String a;
    public afqw b;
    public Executor c;
    public byte d;
    private final agev e;
    private MessageLite f;
    private agke g;
    private agev h;
    private final agev i;

    public afqz() {
        agdf agdfVar = agdf.a;
        this.e = agdfVar;
        this.h = agdfVar;
        this.i = agdfVar;
    }

    public final afra a() {
        String str;
        MessageLite messageLite;
        afqw afqwVar;
        if (this.g == null) {
            this.g = agpi.a;
        }
        if (this.d == 1 && (str = this.a) != null && (messageLite = this.f) != null && (afqwVar = this.b) != null) {
            return new afra(str, this.e, messageLite, afqwVar, this.g, this.h, this.i, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(qrb qrbVar) {
        this.h = new agfa(qrbVar);
    }

    public final void c(MessageLite messageLite) {
        if (messageLite == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = messageLite;
    }
}
