package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oig extends Exception {
    public final oif a;
    public final int b;
    public final int c;

    public oig(acb acbVar) {
        super((String) acbVar.c, (Throwable) acbVar.d);
        this.a = (oif) acbVar.b;
        this.c = acbVar.a;
        this.b = 0;
    }

    public static acb a() {
        acb acbVar = new acb();
        acbVar.a = 2;
        return acbVar;
    }
}
