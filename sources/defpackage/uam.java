package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class uam extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audk audkVar = (audk) obj;
        aihf aihfVarCreateBuilder = ancq.a.createBuilder();
        if ((audkVar.b & 1) != 0) {
            long j = audkVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ancq ancqVar = (ancq) aihfVarCreateBuilder.instance;
            ancqVar.b |= 1;
            ancqVar.c = j;
        }
        if ((audkVar.b & 2) != 0) {
            long j2 = audkVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancq ancqVar2 = (ancq) aihfVarCreateBuilder.instance;
            ancqVar2.b |= 2;
            ancqVar2.d = j2;
        }
        return (ancq) aihfVarCreateBuilder.build();
    }
}
