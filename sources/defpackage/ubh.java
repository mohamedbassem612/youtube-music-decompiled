package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubh extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        audx audxVar = (audx) obj;
        aihf aihfVarCreateBuilder = andd.a.createBuilder();
        if ((audxVar.b & 1) != 0) {
            long j = audxVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andd anddVar = (andd) aihfVarCreateBuilder.instance;
            anddVar.b |= 1;
            anddVar.c = j;
        }
        if ((audxVar.b & 2) != 0) {
            long j2 = audxVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andd anddVar2 = (andd) aihfVarCreateBuilder.instance;
            anddVar2.b |= 2;
            anddVar2.d = j2;
        }
        if ((audxVar.b & 4) != 0) {
            int iAS = a.aS(audxVar.e);
            int i = iAS != 0 ? iAS : 1;
            aihfVarCreateBuilder.copyOnWrite();
            andd anddVar3 = (andd) aihfVarCreateBuilder.instance;
            anddVar3.e = i - 1;
            anddVar3.b |= 4;
        }
        if ((audxVar.b & 8) != 0) {
            String str = audxVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            andd anddVar4 = (andd) aihfVarCreateBuilder.instance;
            str.getClass();
            anddVar4.b |= 8;
            anddVar4.f = str;
        }
        return (andd) aihfVarCreateBuilder.build();
    }
}
