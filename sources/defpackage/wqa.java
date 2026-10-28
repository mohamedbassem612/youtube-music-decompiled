package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqa extends wlu {
    public String a;
    public String b;
    public String c;
    public String d;
    public alab e;

    public wqa(abxv abxvVar, zwa zwaVar, boolean z) {
        super("flow", abxvVar, zwaVar, 1, z, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihh aihhVar = (aihh) akzs.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihhVar.copyOnWrite();
            akzs akzsVar = (akzs) aihhVar.instance;
            akzsVar.b |= 2;
            akzsVar.d = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            aihhVar.copyOnWrite();
            akzs akzsVar2 = (akzs) aihhVar.instance;
            akzsVar2.b |= 64;
            akzsVar2.h = str2;
        }
        String str3 = this.c;
        if (str3 != null) {
            aihhVar.copyOnWrite();
            akzs akzsVar3 = (akzs) aihhVar.instance;
            akzsVar3.b |= 8;
            akzsVar3.e = str3;
        }
        String str4 = this.d;
        if (str4 != null) {
            aihhVar.copyOnWrite();
            akzs akzsVar4 = (akzs) aihhVar.instance;
            akzsVar4.b |= 16;
            akzsVar4.f = str4;
        }
        alab alabVar = this.e;
        if (alabVar != null) {
            aihhVar.copyOnWrite();
            akzs akzsVar5 = (akzs) aihhVar.instance;
            akzsVar5.g = alabVar;
            akzsVar5.b |= 32;
        }
        return aihhVar;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (ahno.aa(this.a)) {
            throw new IllegalStateException();
        }
    }
}
