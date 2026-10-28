package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aaqd extends wlu {
    public final List a;
    public long b;
    public Instant c;

    public aaqd(abxv abxvVar, zwa zwaVar, boolean z) {
        super("offline/offline_video_playback_position_sync", abxvVar, zwaVar, 1, z, null, null);
        this.c = null;
        this.a = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = aohf.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aohf aohfVar = (aohf) aihfVarCreateBuilder.instance;
        aiie aiieVar = aohfVar.d;
        if (!aiieVar.c()) {
            aohfVar.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, aohfVar.d);
        long j = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        aohf aohfVar2 = (aohf) aihfVarCreateBuilder.instance;
        aohfVar2.b |= 2;
        aohfVar2.e = j;
        Instant instant = this.c;
        if (instant != null) {
            long jB = ahbu.b(instant);
            aihfVarCreateBuilder.copyOnWrite();
            aohf aohfVar3 = (aohf) aihfVarCreateBuilder.instance;
            aohfVar3.b |= 4;
            aohfVar3.f = jB;
        }
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(((this.b > 0L ? 1 : (this.b == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        ahno.F(!this.a.isEmpty());
    }
}
