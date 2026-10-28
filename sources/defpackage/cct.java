package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cct extends RuntimeException {
    public final int a;

    public cct(int i) {
        super(i != 1 ? i != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.a = i;
    }
}
