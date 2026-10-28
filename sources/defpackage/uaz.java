package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class uaz extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audp audpVar = (audp) obj;
        aihf aihfVarCreateBuilder = ancv.a.createBuilder();
        if ((audpVar.b & 1) != 0) {
            int i = audpVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ancv ancvVar = (ancv) aihfVarCreateBuilder.instance;
            ancvVar.b |= 1;
            ancvVar.c = i;
        }
        return (ancv) aihfVarCreateBuilder.build();
    }
}
