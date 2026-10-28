package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kuh implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kuh(Object obj, long j, long j2, int i) {
        this.$cid = i;
        this.c = obj;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.lot
    public final void a(lpa lpaVar) {
        int i = this.$cid;
        if (i == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            ((kue) ((kwq) this.c).a).a(35502, lpaVar, this.b, jCurrentTimeMillis, jElapsedRealtime);
            return;
        }
        if (i != 1) {
            ((kul) this.c).a.a(35503, lpaVar, this.b, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.a);
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.a;
            ((kue) ((kwq) this.c).a).a(35501, lpaVar, this.b, jCurrentTimeMillis2, jElapsedRealtime2);
        }
    }
}
