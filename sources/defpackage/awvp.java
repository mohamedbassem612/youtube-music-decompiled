package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class awvp extends awvr {
    final /* synthetic */ awvt a;
    private final awuc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awvp(awvt awvtVar, long j, awuc awucVar) {
        super(j);
        this.a = awvtVar;
        this.c = awucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e(this.a, awmy.a);
    }

    @Override // defpackage.awvr
    public final String toString() {
        String string = super.toString();
        awuc awucVar = this.c;
        Objects.toString(awucVar);
        return string.concat(awucVar.toString());
    }
}
