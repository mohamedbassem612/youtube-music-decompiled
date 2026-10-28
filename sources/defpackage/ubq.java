package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubq extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aueg auegVar = (aueg) obj;
        aihf aihfVarCreateBuilder = andn.a.createBuilder();
        if ((auegVar.b & 1) != 0) {
            int i = auegVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andn andnVar = (andn) aihfVarCreateBuilder.instance;
            andnVar.b |= 1;
            andnVar.c = i;
        }
        if ((auegVar.b & 2) != 0) {
            int i2 = auegVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andn andnVar2 = (andn) aihfVarCreateBuilder.instance;
            andnVar2.b |= 2;
            andnVar2.d = i2;
        }
        if ((auegVar.b & 4) != 0) {
            boolean z = auegVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andn andnVar3 = (andn) aihfVarCreateBuilder.instance;
            andnVar3.b |= 4;
            andnVar3.e = z;
        }
        return (andn) aihfVarCreateBuilder.build();
    }
}
