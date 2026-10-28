package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class wfk implements wfl {
    private static final ThreadLocal b = new wfj();
    protected final Queue a = new agit(SemanticState.Focused);
    private final mbc c;

    public wfk(mbc mbcVar) {
        this.c = mbcVar;
    }

    @Override // defpackage.wfl
    public synchronized void a(String str, String str2) {
        String str3 = "[" + str + "] " + str2;
        this.a.add(((SimpleDateFormat) b.get()).format(DesugarDate.from(this.c.f())) + ' ' + str3);
    }
}
