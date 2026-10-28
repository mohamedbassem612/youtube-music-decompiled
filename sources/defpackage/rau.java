package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rau extends rar {
    public rau(qup qupVar, int i, raq raqVar) {
        super(qupVar, i, raqVar);
    }

    @Override // defpackage.rar
    protected final atqv a(qup qupVar) {
        aihf aihfVarCreateBuilder = ahxc.a.createBuilder();
        qux quxVar = (qux) qupVar.b;
        if (quxVar.l != null) {
            aihf aihfVarCreateBuilder2 = ahxd.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            ahxd ahxdVar = (ahxd) aihfVarCreateBuilder2.instance;
            ahxdVar.b |= 1;
            ahxdVar.c = "_txt_0";
            String str = quxVar.l;
            str.getClass();
            aihfVarCreateBuilder2.copyOnWrite();
            ahxd ahxdVar2 = (ahxd) aihfVarCreateBuilder2.instance;
            ahxdVar2.b |= 2;
            ahxdVar2.d = str;
            aihfVarCreateBuilder.as((ahxd) aihfVarCreateBuilder2.build());
        }
        if (quxVar.m != null) {
            aihf aihfVarCreateBuilder3 = ahxd.a.createBuilder();
            aihfVarCreateBuilder3.copyOnWrite();
            ahxd ahxdVar3 = (ahxd) aihfVarCreateBuilder3.instance;
            ahxdVar3.b |= 1;
            ahxdVar3.c = "_txt_1";
            String str2 = quxVar.m;
            str2.getClass();
            aihfVarCreateBuilder3.copyOnWrite();
            ahxd ahxdVar4 = (ahxd) aihfVarCreateBuilder3.instance;
            ahxdVar4.b |= 2;
            ahxdVar4.d = str2;
            aihfVarCreateBuilder.as((ahxd) aihfVarCreateBuilder3.build());
        }
        aihf aihfVarCreateBuilder4 = atqv.a.createBuilder();
        aihf aihfVarCreateBuilder5 = atro.a.createBuilder();
        aihf aihfVarCreateBuilder6 = atqw.a.createBuilder();
        String path = quxVar.p().getPath();
        path.getClass();
        aihfVarCreateBuilder6.copyOnWrite();
        atqw atqwVar = (atqw) aihfVarCreateBuilder6.instance;
        atqwVar.b = 2;
        atqwVar.c = path;
        aihfVarCreateBuilder5.copyOnWrite();
        atro atroVar = (atro) aihfVarCreateBuilder5.instance;
        atqw atqwVar2 = (atqw) aihfVarCreateBuilder6.build();
        atqwVar2.getClass();
        atroVar.c = atqwVar2;
        atroVar.b |= 1;
        aihfVarCreateBuilder5.copyOnWrite();
        atro atroVar2 = (atro) aihfVarCreateBuilder5.instance;
        ahxc ahxcVar = (ahxc) aihfVarCreateBuilder.build();
        ahxcVar.getClass();
        atroVar2.d = ahxcVar;
        atroVar2.b |= 2;
        aihfVarCreateBuilder4.copyOnWrite();
        atqv atqvVar = (atqv) aihfVarCreateBuilder4.instance;
        atro atroVar3 = (atro) aihfVarCreateBuilder5.build();
        atroVar3.getClass();
        atqvVar.c = atroVar3;
        atqvVar.b = 3;
        return (atqv) aihfVarCreateBuilder4.build();
    }
}
