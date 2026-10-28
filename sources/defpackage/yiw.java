package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yiw extends ynp {
    public final ajvt a;

    public yiw(ajvt ajvtVar) {
        super((yno) null);
        this.a = ajvtVar;
    }

    @Override // defpackage.ynp
    public final void a(xir xirVar) {
        aihf aihfVarCreateBuilder = amiu.a.createBuilder();
        aihf aihfVarCreateBuilder2 = amiw.a.createBuilder();
        aihf aihfVarCreateBuilder3 = amiv.a.createBuilder();
        aihfVarCreateBuilder3.copyOnWrite();
        amiv amivVar = (amiv) aihfVarCreateBuilder3.instance;
        amivVar.b |= 1;
        amivVar.c = true;
        aihfVarCreateBuilder3.copyOnWrite();
        amiv amivVar2 = (amiv) aihfVarCreateBuilder3.instance;
        amivVar2.d = this.a.getNumber();
        amivVar2.b |= 2;
        aihfVarCreateBuilder2.by((amiv) aihfVarCreateBuilder3.build());
        aihfVarCreateBuilder.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder.instance;
        amiw amiwVar = (amiw) aihfVarCreateBuilder2.build();
        amiwVar.getClass();
        amiuVar.N = amiwVar;
        amiuVar.d |= 8;
        xirVar.h((amiu) aihfVarCreateBuilder.build());
    }
}
