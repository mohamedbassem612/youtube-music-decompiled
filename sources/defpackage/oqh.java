package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oqh extends ho {
    final /* synthetic */ agke a;
    final /* synthetic */ oqj b;

    public oqh(oqj oqjVar, agke agkeVar) {
        this.a = agkeVar;
        this.b = oqjVar;
    }

    @Override // defpackage.ho
    public final int a() {
        agke agkeVar = this.a;
        if (agkeVar == null) {
            return 0;
        }
        return agkeVar.size();
    }

    @Override // defpackage.ho
    public final int b() {
        agke agkeVar = this.b.i;
        if (agkeVar == null) {
            return 0;
        }
        return agkeVar.size();
    }

    @Override // defpackage.ho
    public final boolean c(int i, int i2) {
        return true;
    }

    @Override // defpackage.ho
    public final boolean d(int i, int i2) {
        agke agkeVar;
        agke agkeVar2 = this.b.i;
        if (agkeVar2 == null || (agkeVar = this.a) == null) {
            return false;
        }
        return ((String) agkeVar2.get(i)).equals(agkeVar.get(i2));
    }
}
