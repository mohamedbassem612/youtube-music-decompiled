package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aboh {
    public String a;
    public volatile boolean c;
    public volatile boolean d;
    private final abmt f;
    private volatile boolean g;
    private volatile int h = 3;
    public volatile AtomicInteger b = new AtomicInteger();
    public volatile boolean e = true;

    public aboh(abmt abmtVar) {
        this.f = abmtVar;
    }

    final void a(aazj aazjVar) {
        afvn afvnVarB = aawb.b(aazjVar, "DPM");
        try {
            abme abmeVar = abme.NAVIGATION;
            int iOrdinal = aazjVar.a.ordinal();
            if (iOrdinal == 5) {
                this.b.set(0);
                this.g = false;
            } else if (iOrdinal == 8 && this.g) {
                this.b.incrementAndGet();
                this.g = false;
            }
            afvnVarB.close();
        } catch (Throwable th) {
            try {
                afvnVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean b() {
        return this.h == 2;
    }

    @tcc
    void handleInternalVideoBoundaryEvent(aboj abojVar) {
        this.b.incrementAndGet();
    }

    @tcc
    void handlePlaybackScriptedOperationEvent(abme abmeVar) {
        abme abmeVar2 = abme.NAVIGATION;
        int iOrdinal = abmeVar.ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            i = 2;
        }
        this.h = i;
    }

    @tcc
    void handleSequenceChangedEvent(abmf abmfVar) {
        this.a = abmfVar.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @tcc
    void handleSequencerNavigationRequestEvent(abmh abmhVar) {
        abme abmeVar = abme.NAVIGATION;
        switch (abmhVar.a.ordinal()) {
            case 0:
            case 5:
                this.e = true;
                break;
            case 1:
            case 2:
            case 6:
                this.e = true;
                this.b.set(0);
                this.g = false;
                this.c = false;
                this.d = false;
                break;
            case 3:
            case 4:
                this.g = true;
                this.c = true;
                this.d = true;
                break;
            case 7:
                this.b.set(0);
                this.g = false;
                this.c = false;
                this.d = false;
                break;
        }
        this.h = this.h == 1 ? 2 : 3;
    }

    @tcc
    void handleVideoStageEvent(aazj aazjVar) {
        if (this.f.bx(64L)) {
            return;
        }
        a(aazjVar);
    }
}
