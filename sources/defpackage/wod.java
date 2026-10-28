package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wod extends wlu {
    public final List a;
    public ajgq b;

    public wod(abxv abxvVar, zwa zwaVar, String str, boolean z, Optional optional, boolean z2) {
        super(abxvVar, zwaVar, z2, optional, str, Boolean.valueOf(z));
        this.a = new ArrayList();
        this.b = ajgq.ENGAGEMENT_TYPE_UNKNOWN;
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alll.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alll alllVar = (alll) aihfVarCreateBuilder.instance;
        aiie aiieVar = alllVar.e;
        if (!aiieVar.c()) {
            alllVar.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(this.a, alllVar.e);
        ajgq ajgqVar = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alll alllVar2 = (alll) aihfVarCreateBuilder.instance;
        alllVar2.d = ajgqVar.T;
        alllVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!e());
    }

    public final boolean e() {
        return this.b == ajgq.ENGAGEMENT_TYPE_UNKNOWN;
    }
}
