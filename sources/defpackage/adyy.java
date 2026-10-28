package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adyy implements adzr {
    private final xgn a;
    private final xgm b;
    private final adyx c;
    private final Optional d = Optional.empty();
    private final vxz e;

    public adyy(xgn xgnVar, xgm xgmVar, vxz vxzVar, adyx adyxVar) {
        this.a = xgnVar;
        this.b = xgmVar;
        this.c = adyxVar;
        this.e = vxzVar;
    }

    @Override // defpackage.adzr
    public final void b() {
        adyx adyxVar = this.c;
        Optional optionalOfNullable = adyxVar.b;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable((aihh) ((aihn) optionalOfNullable.get()).toBuilder());
        }
        aihh aihhVar = (aihh) optionalOfNullable.orElse((aihh) ajwo.a.createBuilder());
        aihl aihlVar = aoaq.b;
        if ((((aoar) aihhVar.b(aihlVar)).b & 1) == 0) {
            aihf builder = aihhVar.c(aihlVar) ? ((aoar) aihhVar.b(aihlVar)).toBuilder() : aoar.a.createBuilder();
            String strI = this.b.hB().i();
            builder.copyOnWrite();
            aoar aoarVar = (aoar) builder.instance;
            strI.getClass();
            aoarVar.b |= 1;
            aoarVar.c = strI;
            aihhVar.e(aihlVar, (aoar) builder.build());
        }
        d().b(xhb.a(((Integer) adyxVar.a.orElse(123695)).intValue()), (ajwo) aihhVar.build(), null);
        if (this.e.l(33, 45414861L, false)) {
            d().d(new xgj(((ajwo) aihhVar.build()).c, (amud) null));
        }
    }

    @Override // defpackage.adzr
    public final void c() {
        d().t();
    }

    public final xgn d() {
        this.d.isPresent();
        return this.a;
    }

    @Override // defpackage.adzr
    public final void a() {
    }
}
