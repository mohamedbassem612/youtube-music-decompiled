package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.time.Duration;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class tix extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tix(Duration duration, boolean z, tja tjaVar, tiz tizVar, toe toeVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.c = duration;
        this.b = z;
        this.d = tjaVar;
        this.e = tizVar;
        this.f = toeVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        if (this.$cid == 0) {
            Object obj2 = this.c;
            boolean z = this.b;
            Object obj3 = this.d;
            return new tix((Duration) obj2, z, (tja) obj3, (tiz) this.e, (toe) this.f, awoqVar, 0);
        }
        Object obj4 = this.e;
        Object obj5 = this.f;
        Object obj6 = this.c;
        return new tix((pit) obj4, (plx) obj5, (pot) obj6, (plb) this.d, this.b, awoqVar, 1);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (this.$cid != 0) {
            return ((tix) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((tix) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE;
        Object objJ;
        if (this.$cid == 0) {
            awox awoxVar = awox.a;
            int i = this.a;
            atqp.j(obj);
            if (i == 0) {
                long millis = ((Duration) this.c).toMillis();
                this.a = 1;
                if (avkz.y(millis, this) == awoxVar) {
                    return awoxVar;
                }
            }
            if (this.b && ((tja) this.d).b.D()) {
                ((tiz) this.e).a((toe) this.f);
                return awmy.a;
            }
            try {
                Object obj2 = this.d;
                tjk tjkVar = ((tja) obj2).f;
                if (tjkVar == null) {
                    awrc.b("callbacks");
                    tjkVar = null;
                }
                ((tja) obj2).e(tjkVar);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                if (!this.b) {
                    throw th;
                }
                twu.c(6, "Unexpected failure in retry runInternal", th);
                Object obj3 = this.e;
                toe toeVar = th instanceof toe ? th : null;
                if (toeVar == null) {
                    toeVar = new toe(th);
                }
                ((tiz) obj3).a(toeVar);
            }
            return awmy.a;
        }
        awox awoxVar2 = awox.a;
        int i2 = this.a;
        atqp.j(obj);
        if (i2 != 0) {
            if (i2 != 1) {
                objE = obj;
                return (pgz) objE;
            }
            objJ = obj;
            return (pgz) objJ;
        }
        boolean zH = auuw.h();
        Object obj4 = this.e;
        if (!zH) {
            Object obj5 = this.f;
            Object obj6 = this.c;
            Object obj7 = this.d;
            boolean z = this.b;
            this.a = 2;
            objE = ((pit) obj4).e((plx) obj5, (pot) obj6, (plb) obj7, z, this);
            if (objE == awoxVar2) {
                return awoxVar2;
            }
            return (pgz) objE;
        }
        Object obj8 = this.f;
        Object obj9 = this.c;
        Object obj10 = this.d;
        boolean z2 = this.b;
        this.a = 1;
        pit pitVar = (pit) obj4;
        Context context = pitVar.b;
        plb plbVarI = pit.i((plb) obj10);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.notifications_icon_size);
        pot potVar = (pot) obj9;
        aidq aidqVar = potVar.o;
        objJ = awrc.J(new pis((plx) obj8, plbVarI, nwd.i(aidqVar), dimensionPixelSize, pitVar, aidqVar, z2, potVar, null), this);
        if (objJ == awoxVar2) {
            return awoxVar2;
        }
        return (pgz) objJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tix(pit pitVar, plx plxVar, pot potVar, plb plbVar, boolean z, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.e = pitVar;
        this.f = plxVar;
        this.c = potVar;
        this.d = plbVar;
        this.b = z;
    }
}
