package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class wms extends wlu {
    private final aiir a;

    public wms(abxv abxvVar, zwa zwaVar, String str, aiir aiirVar, boolean z) {
        super(str, abxvVar, zwaVar, 1, z, null, null);
        aiirVar.getClass();
        this.a = aiirVar;
    }

    @Override // defpackage.wlu
    public final aiir a() {
        return this.a.mo53clone();
    }
}
