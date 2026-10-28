package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class achi implements achs {
    final /* synthetic */ String a;
    final /* synthetic */ achj b;

    public achi(achj achjVar, String str) {
        this.a = str;
        this.b = achjVar;
    }

    @Override // defpackage.achs
    public final void a(wqh wqhVar, aihf aihfVar) {
        wqhVar.r = this.a;
        String str = this.b.a;
        str.getClass();
        aihfVar.copyOnWrite();
        alur alurVar = (alur) aihfVar.instance;
        alur alurVar2 = alur.a;
        alurVar.b |= 4;
        alurVar.e = str;
    }
}
