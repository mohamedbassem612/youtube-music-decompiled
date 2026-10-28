package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzo implements byd {
    public bzk a;
    public byd b;

    @Override // defpackage.byd
    public final /* bridge */ /* synthetic */ bye a() {
        byd bydVar = this.b;
        bzn bznVar = null;
        bye byeVarA = bydVar != null ? bydVar.a() : null;
        bzk bzkVar = this.a;
        bzkVar.getClass();
        if (byeVarA != null) {
            bzm bzmVar = new bzm();
            bzmVar.a = bzkVar;
            bzk bzkVar2 = bzmVar.a;
            bzkVar2.getClass();
            bznVar = new bzn(bzkVar2);
        }
        return new bzp(bzkVar, byeVarA, new byq(), bznVar);
    }
}
