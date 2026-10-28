package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubg extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audw audwVar = (audw) obj;
        aihf aihfVarCreateBuilder = andc.a.createBuilder();
        if ((audwVar.b & 1) != 0) {
            long j = audwVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andc andcVar = (andc) aihfVarCreateBuilder.instance;
            andcVar.b |= 1;
            andcVar.c = j;
        }
        if ((audwVar.b & 2) != 0) {
            int i = audwVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            andc andcVar2 = (andc) aihfVarCreateBuilder.instance;
            andcVar2.b |= 2;
            andcVar2.d = i;
        }
        if ((audwVar.b & 4) != 0) {
            int i2 = audwVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andc andcVar3 = (andc) aihfVarCreateBuilder.instance;
            andcVar3.b |= 4;
            andcVar3.e = i2;
        }
        if ((audwVar.b & 8) != 0) {
            boolean z = audwVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            andc andcVar4 = (andc) aihfVarCreateBuilder.instance;
            andcVar4.b |= 8;
            andcVar4.f = z;
        }
        if ((audwVar.b & 16) != 0) {
            long j2 = audwVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            andc andcVar5 = (andc) aihfVarCreateBuilder.instance;
            andcVar5.b |= 16;
            andcVar5.g = j2;
        }
        return (andc) aihfVarCreateBuilder.build();
    }
}
