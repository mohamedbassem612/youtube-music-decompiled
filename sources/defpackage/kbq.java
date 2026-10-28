package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class kbq extends ket {
    final /* synthetic */ kbu a;

    public kbq(kbu kbuVar) {
        this.a = kbuVar;
    }

    @Override // defpackage.ket
    public final void a(String str, long j, int i, long j2, long j3) {
        qcb qcbVar = this.a.e;
        if (qcbVar != null) {
            kdi kdiVarA = ((aepb) qcbVar.a).a();
            ked kedVar = new ked(str);
            kedVar.b = j;
            kedVar.c = i;
            kedVar.d = j2;
            kedVar.e = j3;
            kee keeVar = new kee(kedVar);
            keeVar.f = kdiVarA.j;
            kdiVarA.f.add(keeVar);
        }
    }

    @Override // defpackage.ket
    public final void b() {
        kbu kbuVar = this.a;
        kfm kfmVar = kbuVar.d;
        kax kaxVarH = kfmVar != null ? kfmVar.h() : null;
        qcb qcbVar = kbuVar.e;
        if (qcbVar == null || kaxVarH == null) {
            return;
        }
        kdi kdiVarA = ((aepb) qcbVar.a).a();
        kde kdeVar = new kde(new amp(kaxVarH));
        kde kdeVar2 = kdiVarA.o;
        if (kdeVar2 == null || kdeVar2.a != 2) {
            kdeVar.c = kdiVarA.j;
            kdiVarA.o = kdeVar;
        }
    }
}
