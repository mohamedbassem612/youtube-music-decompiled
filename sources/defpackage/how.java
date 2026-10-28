package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class how {
    public static final agrf a = agrf.h("com/google/android/apps/youtube/music/offline/compat/DownloadedEntityFaultHandler");
    public static final Duration b = Duration.ofMillis(300);
    public final Executor c;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public avmn i;
    public wek j;
    private final wbz k;
    private final zwb l;
    public final awkv d = new awkx();
    public final awlk h = new awlk();
    private final avmm m = new avmm();

    public how(wbz wbzVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, Executor executor, awmd awmdVar3) {
        this.k = wbzVar;
        this.l = zwbVar;
        this.e = awmdVar;
        this.f = awmdVar2;
        this.c = executor;
        this.g = awmdVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        avmm avmmVar = this.m;
        avmmVar.b();
        zwb zwbVar = this.l;
        if (zwbVar.u()) {
            wby wbyVarB = this.k.b(zwbVar.e());
            agqs agqsVarListIterator = ((agke) hpv.a.values()).listIterator(0);
            while (agqsVarListIterator.hasNext()) {
                Class cls = (Class) agqsVarListIterator.next();
                int i = 1;
                avmmVar.c(wbyVarB.b(cls).O((avmb) this.f.io()).ag(new vqn(this, wbyVarB, cls, i), new hpw(i)));
            }
        }
    }

    @tcc
    public void handleSignInEvent(zwt zwtVar) {
        a();
    }

    @tcc
    public void handleSignOutEvent(zwu zwuVar) {
        this.m.b();
    }
}
