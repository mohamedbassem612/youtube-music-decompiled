package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qjl {
    public final boolean a;
    protected final axhi b;

    public qjl(boolean z, axhi axhiVar) {
        this.a = z;
        this.b = axhiVar;
    }

    public qjj a(String str) {
        return d(str);
    }

    public abstract axhi b(qjj qjjVar);

    public qjj d(String str) {
        return a(str);
    }

    final axhi e() {
        aihf builder = f(null).toBuilder();
        int i = qjj.b.c;
        builder.copyOnWrite();
        axhi axhiVar = (axhi) builder.instance;
        axhiVar.c = 2;
        axhiVar.d = Integer.valueOf(i);
        return (axhi) builder.build();
    }

    public axhi f(qjj qjjVar) {
        if (qjjVar != null) {
            axhi axhiVar = this.b;
            if (!qjjVar.equals(qjj.b(axhiVar))) {
                aihf aihfVarCreateBuilder = axhi.a.createBuilder();
                int iBt = a.bt(axhiVar.e);
                if (iBt == 0) {
                    iBt = 1;
                }
                aihfVarCreateBuilder.copyOnWrite();
                axhi axhiVar2 = (axhi) aihfVarCreateBuilder.instance;
                axhiVar2.e = iBt - 1;
                axhiVar2.b |= 2;
                qjjVar.g(aihfVarCreateBuilder);
                return (axhi) aihfVarCreateBuilder.build();
            }
        }
        return this.b;
    }
}
