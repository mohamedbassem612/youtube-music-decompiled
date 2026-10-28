package defpackage;

import j$.time.Instant;
import j$.util.DesugarDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aanh implements aaqu {
    public static final aami a;
    private static final aamh b;
    private aaqw c = null;

    static {
        aqmh aqmhVar = aofu.a.d;
        if (aqmhVar == null) {
            aqmhVar = aqmh.a;
        }
        aamh aamhVar = new aamh("id", "title", null, null, new abuz(aqmhVar), 0, false, false, DesugarDate.from(Instant.EPOCH), aofu.a);
        b = aamhVar;
        a = new aami(aamhVar, 0);
    }

    @Override // defpackage.aaqu
    public final aaqw a(String str) {
        return null;
    }

    @Override // defpackage.aaqu
    public final aaqw b(aamh aamhVar, Collection collection) {
        aaqw aaqwVar = this.c;
        if (aaqwVar != null) {
            return aaqwVar;
        }
        aang aangVar = new aang(this, b);
        this.c = aangVar;
        return aangVar;
    }

    @Override // defpackage.aaqu
    public final /* synthetic */ List c(String str) {
        return agpi.a;
    }

    @Override // defpackage.aaqu
    public final /* synthetic */ Map d() {
        return agpn.b;
    }

    @Override // defpackage.aaqu
    public final void f(String str) {
    }

    @Override // defpackage.aaqu
    public final void e(String str, String str2) {
    }

    @Override // defpackage.aaqu
    public final void g(String str, String str2) {
    }
}
