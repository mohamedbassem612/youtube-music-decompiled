package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasw implements aarz {
    public final aarz a;
    public Executor b;

    public aasw(aarz aarzVar, Executor executor) {
        this.a = aarzVar;
        this.b = executor;
    }

    @Override // defpackage.aarz
    public final void a(aamw aamwVar) {
        this.b.execute(new aadw(this, aamwVar, 6, (byte[]) null));
    }
}
