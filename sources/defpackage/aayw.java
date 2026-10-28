package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aayw {
    public static final aayw a = new aayw(abnw.a, null, null, null);
    public final abnw b;
    public final wjf c;
    public final wgi d;
    public final ajwo e;
    public final String f;

    public aayw(abnw abnwVar, wjf wjfVar, wgi wgiVar, ajwo ajwoVar, String str) {
        this.b = abnwVar;
        this.c = wjfVar;
        this.d = wgiVar;
        this.e = ajwoVar;
        this.f = str;
    }

    public final String toString() {
        return "SequencerStageEvent{stage=" + String.valueOf(this.b) + ", cpn=" + this.f + '}';
    }

    public aayw(abnw abnwVar, wjf wjfVar, wgi wgiVar, ajwo ajwoVar) {
        this(abnwVar, null, null, null, null);
    }
}
