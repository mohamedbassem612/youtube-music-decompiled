package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubu extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auek auekVar = (auek) obj;
        aihf aihfVarCreateBuilder = andr.a.createBuilder();
        if ((auekVar.b & 1) != 0) {
            int i = auekVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andr andrVar = (andr) aihfVarCreateBuilder.instance;
            andrVar.b |= 1;
            andrVar.c = i;
        }
        if ((auekVar.b & 2) != 0) {
            int i2 = auekVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andr andrVar2 = (andr) aihfVarCreateBuilder.instance;
            andrVar2.b |= 2;
            andrVar2.d = i2;
        }
        return (andr) aihfVarCreateBuilder.build();
    }
}
