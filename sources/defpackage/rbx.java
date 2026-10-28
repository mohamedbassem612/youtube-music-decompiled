package defpackage;

import java.security.Key;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class rbx implements byd {
    private final quo a;
    private final byd b;
    private final qua c;

    public rbx(byd bydVar, quo quoVar, qua quaVar) {
        this.b = bydVar;
        this.a = quoVar;
        this.c = quaVar;
    }

    @Override // defpackage.byd
    public final bye a() {
        quo quoVar = this.a;
        return new rbw(quoVar.a, (Key) quoVar.b.orElse(null), this.b.a(), this.c);
    }
}
