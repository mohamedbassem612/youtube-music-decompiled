package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kic implements kis {
    public final kib a;
    public boolean b;
    public ArrayList c;
    protected ArrayList d;
    public ArrayList e;
    public Set f;
    public final String g;
    public String h;
    public final kiq i;
    public final ListenableFuture j;
    public boolean k;
    public int l;
    public final aihh m;

    protected kic(kib kibVar) {
        aihh aihhVar = (aihh) aulj.a.createBuilder();
        this.m = aihhVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.k = false;
        this.a = kibVar;
        this.h = kibVar.g;
        this.g = kibVar.d;
        Object applicationContext = kibVar.e.getApplicationContext();
        kin kinVar = applicationContext instanceof kin ? (kin) applicationContext : (kin) kip.a.get();
        kiq kiqVarA = kinVar != null ? kinVar.a() : null;
        if (kiqVarA == null) {
            this.i = null;
        } else {
            int i = kiqVarA.b;
            if (i == 2 || i == 3) {
                this.i = kiqVarA;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + Integer.toString(i - 1) + " is not one of the process-level expected values: 1 or 2");
                this.i = null;
            }
        }
        this.j = kinVar != null ? kinVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        auljVar.b |= 1;
        auljVar.c = jCurrentTimeMillis;
        long j = ((aulj) aihhVar.instance).c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long offset = ((long) TimeZone.getDefault().getOffset(j)) / 1000;
        aihhVar.copyOnWrite();
        aulj auljVar2 = (aulj) aihhVar.instance;
        auljVar2.b |= 131072;
        auljVar2.g = offset;
        if (!mef.h(kibVar.e)) {
            aihhVar.copyOnWrite();
            aulj auljVar3 = (aulj) aihhVar.instance;
            auljVar3.b |= 8388608;
            auljVar3.h = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            aihhVar.copyOnWrite();
            aulj auljVar4 = (aulj) aihhVar.instance;
            auljVar4.b |= 2;
            auljVar4.d = jElapsedRealtime;
        }
    }

    public final int a() {
        return ((aulj) this.m.instance).e;
    }

    public final long b() {
        return ((aulj) this.m.instance).c;
    }

    public kic c() {
        synchronized (this.a) {
        }
        return this;
    }

    public abstract kiw d();

    public abstract lpa e();

    public abstract ListenableFuture f(kid kidVar);

    public final void g(kiq kiqVar) {
        aihh aihhVar = this.m;
        aulk aulkVar = ((aulj) aihhVar.instance).l;
        if (aulkVar == null) {
            aulkVar = aulk.a;
        }
        aihh aihhVar2 = (aihh) aulkVar.toBuilder();
        int i = kiqVar.b;
        aihhVar2.copyOnWrite();
        aulk aulkVar2 = (aulk) aihhVar2.instance;
        aulkVar2.d = i - 1;
        aulkVar2.b |= 2;
        aiou aiouVar = aulkVar2.c;
        if (aiouVar == null) {
            aiouVar = aiou.a;
        }
        aihf builder = aiouVar.toBuilder();
        aiot aiotVar = ((aiou) builder.instance).c;
        if (aiotVar == null) {
            aiotVar = aiot.a;
        }
        int i2 = kiqVar.a;
        aihf builder2 = aiotVar.toBuilder();
        builder2.copyOnWrite();
        aiot aiotVar2 = (aiot) builder2.instance;
        aiotVar2.b |= 1;
        aiotVar2.c = i2;
        builder.copyOnWrite();
        aiou aiouVar2 = (aiou) builder.instance;
        aiot aiotVar3 = (aiot) builder2.build();
        aiotVar3.getClass();
        aiouVar2.c = aiotVar3;
        aiouVar2.b |= 1;
        aihhVar2.copyOnWrite();
        aulk aulkVar3 = (aulk) aihhVar2.instance;
        aiou aiouVar3 = (aiou) builder.build();
        aiouVar3.getClass();
        aulkVar3.c = aiouVar3;
        aulkVar3.b |= 1;
        aulk aulkVar4 = (aulk) aihhVar2.build();
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        aulkVar4.getClass();
        auljVar.l = aulkVar4;
        auljVar.b |= 268435456;
    }

    public abstract void h(double d);

    public final int i() {
        int i = this.l;
        return i == 0 ? this.a.k : i;
    }

    public final void j(int[] iArr) {
        if (this.a.d()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr.length != 0) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            for (int i : iArr) {
                this.d.add(Integer.valueOf(i));
            }
        }
    }

    public final void k(int i) {
        aihh aihhVar = this.m;
        aihhVar.copyOnWrite();
        aulj auljVar = (aulj) aihhVar.instance;
        aulj auljVar2 = aulj.a;
        auljVar.b |= 32;
        auljVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.g);
        sb.append(", logSourceName: ");
        sb.append(this.h);
        sb.append(", qosTier: ");
        sb.append(i() - 1);
        sb.append(", veMessage: null, testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList != null ? kib.b(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? kib.b(arrayList2) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? kib.b(arrayList3) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
