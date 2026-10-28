package defpackage;

import j$.time.Instant;
import java.io.FileDescriptor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aejm implements tae {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aejm(Object obj, long j, Object obj2, Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.tae, defpackage.twi
    public final void a(Object obj) {
        if (this.$cid == 0) {
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                aejo aejoVar = (aejo) this.b;
                if (aejoVar.O.get()) {
                    Object obj2 = this.d;
                    Object obj3 = this.c;
                    if (l.longValue() > this.a) {
                        aejoVar.p = aejoVar.o.submit(afwl.j(new aejk(aejoVar, (FileDescriptor) obj3, l, (byte[]) obj2, 0)));
                        taf.j(aejoVar.p, new abwu(15));
                        return;
                    } else {
                        aejoVar.p = aejoVar.o.schedule(afwl.i(new aasv(aejoVar, (FileDescriptor) obj3, l, (byte[]) obj2, 13)), 20L, TimeUnit.MILLISECONDS);
                        taf.j(aejoVar.p, new abwu(16));
                        return;
                    }
                }
                return;
            }
            return;
        }
        hsd hsdVar = (hsd) this.b;
        Instant instantA = hsdVar.i.a();
        Instant instantOfEpochSecond = Instant.ofEpochSecond(((Long) obj).longValue());
        long jMax = Math.max(this.a, 900L);
        Instant instantPlusSeconds = instantA.plusSeconds(jMax);
        boolean zIsBefore = instantOfEpochSecond.isBefore(instantA);
        ?? r5 = this.c;
        if (zIsBefore || instantOfEpochSecond.isAfter(instantPlusSeconds)) {
            try {
                taf.j(((ayq) ((iqk) ahng.v(r5)).a.io()).j(new iqh(instantPlusSeconds.getEpochSecond(), 2)), new ihw(8));
            } catch (ExecutionException e) {
                ((agrc) ((agrc) ((agrc) hsd.a.b().i(agso.a, "LegacyCascadeMusicPlayl")).j(e)).k("com/google/android/apps/youtube/music/offline/entitycontroller/LegacyCascadeMusicPlaylistEntityController", "maybeScheduleNextSyncNoLaterThan", (char) 466, "LegacyCascadeMusicPlaylistEntityController.java")).t("Failed to retrieve musicDownloadsPrefsStore");
            }
            hsdVar.b.c((String) this.d, jMax);
        }
    }
}
