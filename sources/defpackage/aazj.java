package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class aazj extends tas {
    public final abob a;
    public final wjf b;
    public final wjf c;
    public final acfw f;
    public final String g;
    public final String h;
    public final boolean i;

    public aazj(abob abobVar, wjf wjfVar, wjf wjfVar2, acfw acfwVar, String str, String str2, boolean z) {
        abobVar.getClass();
        this.a = abobVar;
        this.b = wjfVar;
        this.c = wjfVar2;
        this.f = acfwVar;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    public final String toString() {
        return "VideoStageEvent{stage=" + this.a.toString() + ", videoCpn=" + this.g + ", interstitialCpn=" + this.h + ", live=" + this.i + '}';
    }
}
