package defpackage;

import android.content.SharedPreferences;
import android.webkit.WebView;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hqx extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(aehr aehrVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = aehrVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        switch (this.$cid) {
            case 0:
                return new hqx((Runnable) this.a, awoqVar, 0);
            case 1:
                return new hqx((ees) this.a, awoqVar, 1);
            case 2:
                return new hqx((Runnable) this.a, awoqVar, 2, (byte[]) null);
            case 3:
                return new hqx((Runnable) this.a, awoqVar, 3, (char[]) null);
            case 4:
                return new hqx((axfd) this.a, awoqVar, 4);
            case 5:
                return new hqx((tkd) this.a, awoqVar, 5);
            case 6:
                return new hqx((uzt) this.a, awoqVar, 6);
            case 7:
                return new hqx((uzt) this.a, awoqVar, 7, (byte[]) null);
            case 8:
                return new hqx((uzt) this.a, awoqVar, 8, (char[]) null);
            case 9:
                return new hqx((vwp) this.a, awoqVar, 9);
            case 10:
                return new hqx((vwp) this.a, awoqVar, 10, (byte[]) null);
            case 11:
                return new hqx((Function0) this.a, awoqVar, 11);
            default:
                return new hqx((aehr) this.a, awoqVar, 12);
        }
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 1:
                return ((hqx) create((bou) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 2:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 3:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 4:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 5:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 6:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 7:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 8:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 9:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 10:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            case 11:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
            default:
                return ((hqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [aunn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        WebView webView;
        switch (this.$cid) {
            case 0:
                atqp.j(obj);
                this.a.run();
                return awmy.a;
            case 1:
                atqp.j(obj);
                String str = egn.a;
                dzf.b();
                Objects.toString(this.a);
                return awmy.a;
            case 2:
                atqp.j(obj);
                this.a.run();
                return awmy.a;
            case 3:
                atqp.j(obj);
                this.a.run();
                return awmy.a;
            case 4:
                atqp.j(obj);
                return Boolean.valueOf(((SharedPreferences) ((axfd) this.a).c.io()).getBoolean(gzj.DONT_PLAY_VIDEO_SETTING, false));
            case 5:
                atqp.j(obj);
                ((tkd) this.a).j();
                return awmy.a;
            case 6:
                atqp.j(obj);
                ((uzt) this.a).i.r();
                return awmy.a;
            case 7:
                atqp.j(obj);
                ((uzt) this.a).i.r();
                return awmy.a;
            case 8:
                atqp.j(obj);
                ((uzt) this.a).i.r();
                return awmy.a;
            case 9:
                atqp.j(obj);
                ((vwp) this.a).a();
                return awmy.a;
            case 10:
                atqp.j(obj);
                ((vwp) this.a).a();
                return awmy.a;
            case 11:
                atqp.j(obj);
                this.a.invoke();
                return awmy.a;
            default:
                atqp.j(obj);
                aehr aehrVar = (aehr) this.a;
                aehrVar.y(35);
                aehrVar.h.n("gw_arf");
                aehd aehdVarX = aehrVar.x();
                if (aehdVarX != null && (webView = aehdVarX.i) != null) {
                    webView.reload();
                }
                return awmy.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(axfd axfdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = axfdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(ees eesVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = eesVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(Runnable runnable, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(Runnable runnable, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(Runnable runnable, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = runnable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(Function0 function0, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(tkd tkdVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = tkdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(uzt uztVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = uztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(uzt uztVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = uztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(uzt uztVar, awoq awoqVar, int i, char[] cArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = uztVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(vwp vwpVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = vwpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqx(vwp vwpVar, awoq awoqVar, int i, byte[] bArr) {
        super(2, awoqVar);
        this.$cid = i;
        this.a = vwpVar;
    }
}
