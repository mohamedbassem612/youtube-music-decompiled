package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afok implements auph {
    public final affd a;
    public final afoi b;
    private final agev c;
    private final Object d = new Object();
    private final afpa e;
    private volatile gjt f;

    public afok(affd affdVar, agev agevVar, afpa afpaVar, afoi afoiVar) {
        this.a = affdVar;
        this.c = agevVar;
        this.e = afpaVar;
        this.b = afoiVar;
    }

    private final gjt b() {
        agev agevVar = this.c;
        boolean zG = agevVar.g();
        afoi afoiVar = this.b;
        if (zG) {
            ggg gggVarA = ((afoj) atqp.a(afoiVar.b(this.a), afoj.class)).a();
            gggVarA.a = (Activity) agevVar.c();
            return gggVarA.a();
        }
        ggg gggVarA2 = ((afoj) atqp.a(afoiVar.b(this.a), afoj.class)).a();
        gggVarA2.b = this.e;
        return gggVarA2.a();
    }

    @Override // defpackage.auph
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gjt generatedComponent() {
        gjt gjtVarB;
        if (this.f == null) {
            synchronized (this.d) {
                if (this.f == null) {
                    if (afty.o()) {
                        afuu afuuVarD = afwt.d(137, "ActAcc#Comp", afux.a, true);
                        try {
                            gjtVarB = b();
                            afuuVarD.close();
                        } catch (Throwable th) {
                            try {
                                afuuVarD.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        gjtVarB = b();
                    }
                    this.f = gjtVarB;
                }
            }
        }
        return this.f;
    }
}
