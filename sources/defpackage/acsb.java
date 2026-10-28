package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acsb implements awmd {
    private final acsv a;
    private final ajwo b;
    private final long c;
    private final avgj d;

    public acsb(acsv acsvVar, ajwo ajwoVar, long j, avgj avgjVar) {
        this.a = acsvVar;
        this.b = ajwoVar;
        this.c = j;
        this.d = avgjVar;
    }

    @Override // defpackage.awmd, defpackage.awmc
    public final /* bridge */ /* synthetic */ Object io() {
        acsv acsvVar = this.a;
        ajwo ajwoVar = this.b;
        abng abngVarC = acsvVar.c(ajwoVar, this.c);
        if (abngVarC == null) {
            return null;
        }
        ((acsv) this.d.a).f(ajwoVar, true, false);
        return abngVarC;
    }
}
