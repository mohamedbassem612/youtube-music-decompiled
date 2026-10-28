package defpackage;

import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kjy {
    public kiw a;
    public Consumer b;
    public Consumer c;
    private boolean d;
    private boolean e;
    private byte f = 3;

    public kjy(kjz kjzVar) {
        this.a = kjzVar.a;
        this.b = kjzVar.b;
        this.c = kjzVar.c;
        this.d = kjzVar.d;
        this.e = kjzVar.e;
    }

    public final kjz a() {
        kiw kiwVar;
        Consumer consumer;
        Consumer consumer2;
        if (this.f == 3 && (kiwVar = this.a) != null && (consumer = this.b) != null && (consumer2 = this.c) != null) {
            return new kjz(kiwVar, consumer, consumer2, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" logEventParcelable");
        }
        if (this.b == null) {
            sb.append(" successResultSetter");
        }
        if (this.c == null) {
            sb.append(" failedResultSetter");
        }
        if ((this.f & 1) == 0) {
            sb.append(" isRetryEvent");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isLastRetryEvent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }
}
