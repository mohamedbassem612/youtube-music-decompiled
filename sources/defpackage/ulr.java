package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ulr {
    public static final /* synthetic */ int a = 0;

    static {
        agpf.b(Double.valueOf(0.0d), Double.valueOf(1.0d));
    }

    public static aljj a(ukh ukhVar) {
        aihf aihfVarCreateBuilder = aljj.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aljj aljjVar = (aljj) aihfVarCreateBuilder.instance;
        aljjVar.b |= 1;
        aljjVar.c = ukhVar.a;
        aihfVarCreateBuilder.copyOnWrite();
        aljj aljjVar2 = (aljj) aihfVarCreateBuilder.instance;
        aljjVar2.b |= 2;
        aljjVar2.d = ukhVar.b;
        aihfVarCreateBuilder.copyOnWrite();
        aljj aljjVar3 = (aljj) aihfVarCreateBuilder.instance;
        aljjVar3.b |= 4;
        aljjVar3.e = 1.0f - ukhVar.c;
        aihfVarCreateBuilder.copyOnWrite();
        aljj aljjVar4 = (aljj) aihfVarCreateBuilder.instance;
        aljjVar4.b |= 8;
        aljjVar4.f = 1.0f - ukhVar.d;
        return (aljj) aihfVarCreateBuilder.build();
    }
}
