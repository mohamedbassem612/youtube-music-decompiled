package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrl extends wlu {
    public byte[] a;
    public Optional b;

    public wrl(abxv abxvVar, zwa zwaVar) {
        super("notification/record_interactions", abxvVar, zwaVar, 1, true, null, null);
        this.b = Optional.empty();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = altl.a.createBuilder();
        aigj aigjVarV = aigj.v(this.a);
        aihfVarCreateBuilder.copyOnWrite();
        altl altlVar = (altl) aihfVarCreateBuilder.instance;
        aigjVarV.getClass();
        altlVar.b |= 2;
        altlVar.d = aigjVarV;
        if (this.b.isPresent()) {
            aihf aihfVarCreateBuilder2 = altk.a.createBuilder();
            boolean zBooleanValue = ((Boolean) this.b.get()).booleanValue();
            aihfVarCreateBuilder2.copyOnWrite();
            altk altkVar = (altk) aihfVarCreateBuilder2.instance;
            altkVar.b |= 1;
            altkVar.c = zBooleanValue;
            aihfVarCreateBuilder.copyOnWrite();
            altl altlVar2 = (altl) aihfVarCreateBuilder.instance;
            altk altkVar2 = (altk) aihfVarCreateBuilder2.build();
            altkVar2.getClass();
            altlVar2.e = altkVar2;
            altlVar2.b |= 8;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
