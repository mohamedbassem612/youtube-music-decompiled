package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyz extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ awqk b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyz(awqk awqkVar, aia aiaVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
        this.c = aiaVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aia, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid != 0) {
            dyz dyzVar = new dyz(this.b, (aia) this.c, awoqVar, 1);
            dyzVar.d = obj;
            return dyzVar;
        }
        dyz dyzVar2 = new dyz(this.b, (aqi) this.c, awoqVar, 0);
        dyzVar2.d = obj;
        return dyzVar2;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((dyz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((dyz) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aia, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.$cid;
        Object obj2 = this.d;
        if (i != 0) {
            awut awutVar = (awut) obj2;
            awox awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 == 0) {
                awqk awqkVar = this.b;
                aih aihVar = new aih(this.c, awutVar.b());
                this.d = null;
                this.a = 1;
                if (awqkVar.invoke(aihVar, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return awmy.a;
        }
        awut awutVar2 = (awut) obj2;
        awox awoxVar2 = awox.a;
        try {
            if (this.a != 0) {
                atqp.j(obj);
            } else {
                atqp.j(obj);
                awqk awqkVar2 = this.b;
                this.d = null;
                this.a = 1;
                obj = awqkVar2.invoke(awutVar2, this);
                if (obj == awoxVar2) {
                    return awoxVar2;
                }
            }
            ((aqi) this.c).b(obj);
        } catch (CancellationException unused) {
            ((aqi) this.c).c();
        } catch (Throwable th) {
            ((aqi) this.c).d(th);
        }
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyz(awqk awqkVar, aqi aqiVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = awqkVar;
        this.c = aqiVar;
    }
}
