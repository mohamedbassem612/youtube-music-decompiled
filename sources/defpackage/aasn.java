package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aasn implements aasb {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/transfer/executor/DefaultTransfersRunner");
    public final mbc b;
    private Thread c;

    public aasn(mbc mbcVar) {
        this.b = mbcVar;
    }

    @Override // defpackage.aasb
    public final void a(aarw aarwVar) {
        aasm aasmVar = new aasm(this, aarwVar);
        this.c = aasmVar;
        WeakHashMap weakHashMap = mck.a;
        Thread.State state = aasmVar.getState();
        if (state == Thread.State.NEW) {
            WeakHashMap weakHashMap2 = mck.a;
            synchronized (weakHashMap2) {
                weakHashMap2.put(aasmVar, Boolean.TRUE);
            }
            this.c.start();
            return;
        }
        throw new IllegalArgumentException("This method can only be applied to threads that have been created but not yet started, and " + String.valueOf(aasmVar) + " was in state " + String.valueOf(state));
    }
}
