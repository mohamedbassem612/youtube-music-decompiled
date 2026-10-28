package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ucd extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aues auesVar = (aues) obj;
        aihf aihfVarCreateBuilder = anec.a.createBuilder();
        if ((auesVar.b & 1) != 0) {
            String str = auesVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anec anecVar = (anec) aihfVarCreateBuilder.instance;
            str.getClass();
            anecVar.b |= 1;
            anecVar.c = str;
        }
        return (anec) aihfVarCreateBuilder.build();
    }
}
