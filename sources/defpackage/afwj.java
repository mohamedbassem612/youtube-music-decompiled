package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afwj implements aheh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public afwj(ahpu ahpuVar, int i) {
        this.$cid = i;
        this.b = "com.google.apps.tiktok.account.data.AllAccounts";
        this.a = ahpuVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aheh, java.lang.Object] */
    @Override // defpackage.aheh
    public final void a(Throwable th) {
        if (this.$cid == 0) {
            th.getClass();
            ?? r0 = this.a;
            afvh afvhVarA = afty.a();
            afvl afvlVarE = afty.e(afvhVarA, r0);
            try {
                this.b.a(th);
                afty.e(afvhVarA, afvlVarE);
            } catch (Throwable th2) {
                try {
                    aftt.a(th2);
                    throw th2;
                } catch (Throwable th3) {
                    afty.e(afvhVarA, afvlVarE);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [afvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aheh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aheh
    public final void b(Object obj) {
        agpo agpoVar;
        if (this.$cid == 0) {
            afvh afvhVar = (afvh) afty.d.get();
            afvl afvlVarE = afty.e(afvhVar, this.a);
            try {
                this.b.b(obj);
                afty.e(afvhVar, afvlVarE);
                return;
            } catch (Throwable th) {
                try {
                    aftt.a(th);
                    throw th;
                } catch (Throwable th2) {
                    afty.e(afvhVar, afvlVarE);
                    throw th2;
                }
            }
        }
        Object obj2 = this.b;
        Object obj3 = this.a;
        synchronized (((ahpu) obj3).a) {
            agkr agkrVar = new agkr(4);
            agku agkuVar = (agku) ((ahpu) obj3).b.get(obj2);
            if (agkuVar != null) {
                agkrVar.b(agkuVar);
            }
            agpoVar = new agpo((agpq) agkrVar.a());
        }
        agqr it = agpoVar.iterator();
        while (it.hasNext()) {
            afmv afmvVar = (afmv) it.next();
            if (afmvVar != null) {
                afmvVar.a();
            }
        }
    }

    public afwj(afvl afvlVar, aheh ahehVar, int i) {
        this.$cid = i;
        this.a = afvlVar;
        this.b = ahehVar;
    }
}
