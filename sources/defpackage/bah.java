package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bah extends awpj implements awqk {
    int a;
    final /* synthetic */ View b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bah(View view, awoq awoqVar) {
        super(2, awoqVar);
        this.b = view;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        bah bahVar = new bah(this.b, awoqVar);
        bahVar.c = obj;
        return bahVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bah) create((awsz) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awsz awszVar = (awsz) this.c;
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i != 0) {
            if (i == 1) {
            }
            return awmy.a;
        }
        View view = this.b;
        this.c = awszVar;
        this.a = 1;
        if (awszVar.a(view, this) == awoxVar) {
            return awoxVar;
        }
        View view2 = this.b;
        if (view2 instanceof ViewGroup) {
            bag bagVar = new bag((ViewGroup) view2, 0);
            this.c = null;
            this.a = 2;
            Object objB = awszVar.b(bagVar.a(), this);
            if (objB != awoxVar) {
                objB = awmy.a;
            }
            if (objB == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
