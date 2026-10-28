package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pso implements bdx {
    private static final boolean d(pym pymVar) {
        int iAT;
        String str = pymVar.j;
        str.getClass();
        return str.length() > 0 && (iAT = a.aT(pymVar.i)) != 0 && iAT == 2;
    }

    private static final boolean e(pym pymVar) {
        int iAT;
        String str = pymVar.c;
        str.getClass();
        return str.length() > 0 && (iAT = a.aT(pymVar.i)) != 0 && iAT == 3;
    }

    @Override // defpackage.bdx
    public final /* synthetic */ Object a(Object obj, awoq awoqVar) {
        pym pymVar = (pym) obj;
        aihf builder = pymVar.toBuilder();
        builder.getClass();
        if (e(pymVar)) {
            qnl.R(4, builder);
        } else if (d(pymVar)) {
            qnl.R(3, builder);
        }
        builder.copyOnWrite();
        ((pym) builder.instance).l = true;
        return qnl.H(builder);
    }

    @Override // defpackage.bdx
    public final /* bridge */ /* synthetic */ Object b(Object obj, awoq awoqVar) {
        pym pymVar = (pym) obj;
        boolean z = false;
        if (!pymVar.l && (e(pymVar) || d(pymVar))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdx
    public final Object c() {
        return awmy.a;
    }
}
