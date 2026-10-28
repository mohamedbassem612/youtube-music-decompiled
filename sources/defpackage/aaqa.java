package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaqa extends wlu {
    public float D;
    public final vyo a;
    public final List b;
    public long c;
    public long d;
    public int e;

    public aaqa(abxv abxvVar, zwa zwaVar, vyo vyoVar, boolean z) {
        super("offline/playlist_sync_check", abxvVar, zwaVar, 1, z, null, null);
        this.a = vyoVar;
        this.b = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = altr.a.createBuilder();
        long j = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        altr altrVar = (altr) aihfVarCreateBuilder.instance;
        altrVar.b |= 2;
        altrVar.e = j;
        long j2 = this.d;
        aihfVarCreateBuilder.copyOnWrite();
        altr altrVar2 = (altr) aihfVarCreateBuilder.instance;
        altrVar2.b |= 4;
        altrVar2.f = j2;
        int i = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        altr altrVar3 = (altr) aihfVarCreateBuilder.instance;
        altrVar3.b |= 8;
        altrVar3.g = i;
        float f = this.D;
        aihfVarCreateBuilder.copyOnWrite();
        altr altrVar4 = (altr) aihfVarCreateBuilder.instance;
        altrVar4.b |= 16;
        altrVar4.h = f;
        aihfVarCreateBuilder.copyOnWrite();
        altr altrVar5 = (altr) aihfVarCreateBuilder.instance;
        aiie aiieVar = altrVar5.d;
        if (!aiieVar.c()) {
            altrVar5.d = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.b, altrVar5.d);
        return aihfVarCreateBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(!this.b.isEmpty());
        ahno.F(((this.c > 0L ? 1 : (this.c == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        ahno.F(((this.d > 0L ? 1 : (this.d == 0L ? 0 : -1)) ^ (-1)) >>> 31);
        ahno.F((this.e ^ (-1)) >>> 31);
        float f = this.D;
        ahno.F(f >= 0.0f && f <= 1.0f);
    }
}
