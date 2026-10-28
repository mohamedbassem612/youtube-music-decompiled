package defpackage;

import com.google.protobuf.MessageLite;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class abqh implements tmv {
    public final agkz a;
    public final wlx b;
    public boolean c;
    private final awqk d;
    private final awmi e = atqp.k(1, new zqe(this, 13));

    public abqh(awqk awqkVar, agkz agkzVar, wlx wlxVar) {
        this.d = awqkVar;
        this.a = agkzVar;
        this.b = wlxVar;
    }

    @Override // defpackage.tmv
    public final String Y() {
        String strY = h().Y();
        strY.getClass();
        return strY;
    }

    @Override // defpackage.tmv
    public final /* synthetic */ String Z() {
        return null;
    }

    public abstract wlu a();

    public abstract alyi b(tmv tmvVar, MessageLite messageLite);

    public abstract Object e(tnw tnwVar);

    protected abstract Object f(MessageLite messageLite);

    public void g(aihf aihfVar) {
        aihfVar.getClass();
        h().t();
    }

    public final wlu h() {
        return (wlu) this.e.a();
    }

    public final avlr i(avlr avlrVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int i = 2;
        int i2 = 5;
        return avlrVar.B(new wsh(new abqf(this, i), 11)).aa(new wsh(new yta(10), 12)).x(new abqg(new abqf(atomicBoolean, 4), i)).n(avlr.o(new tuf(atomicBoolean, i2))).K(new abqe(new abqf(this, i2), i)).al();
    }

    public final avlr j(avlr avlrVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        int i = 9;
        int i2 = 1;
        int i3 = 0;
        return avlrVar.B(new wsh(new yrc(this, 20), i)).aa(new wsh(new yta(i), 10)).x(new abqg(new abqf(atomicBoolean, i2), i2)).n(avlr.o(new tuf(atomicBoolean, 4))).x(new abqg(new abqf(this, i3), i3)).K(new abqe(new abqf(this, 3), i2)).K(new abqe(new hho((Object) this, 14, (char[][][]) null), i3)).al();
    }

    public final void k(alyg alygVar) {
        alygVar.getClass();
        if (this.c) {
            return;
        }
        awqk awqkVar = this.d;
        aiir aiirVarA = h().a();
        aiirVarA.getClass();
        awqkVar.invoke(alygVar, aiirVarA);
    }
}
