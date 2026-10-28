package defpackage;

import app.rive.ImageAsset;
import app.rive.RiveFile;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adpp extends awpk implements awqk {
    final /* synthetic */ RiveFile a;
    final /* synthetic */ adps b;
    final /* synthetic */ String c;
    final /* synthetic */ ImageAsset d;
    final /* synthetic */ awqg e;
    final /* synthetic */ awrm f;
    final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adpp(RiveFile riveFile, adps adpsVar, String str, ImageAsset imageAsset, awqg awqgVar, awrm awrmVar, Function0 function0, awoq awoqVar) {
        super(2, awoqVar);
        this.a = riveFile;
        this.b = adpsVar;
        this.c = str;
        this.d = imageAsset;
        this.e = awqgVar;
        this.f = awrmVar;
        this.g = function0;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new adpp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adpp) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        RiveFile riveFile = this.a;
        adps adpsVar = this.b;
        if (riveFile == adpsVar.g) {
            String str = this.c;
            AutoCloseable autoCloseable = this.d;
            Map map = adpsVar.f;
            synchronized (map) {
                if (adpsVar.g != null) {
                    AutoCloseable autoCloseable2 = (AutoCloseable) map.put(str, autoCloseable);
                    autoCloseable = autoCloseable2 == autoCloseable ? null : autoCloseable2;
                }
            }
            if (autoCloseable != null) {
                adpsVar.d(autoCloseable);
            }
            this.e.invoke(this.d);
            this.f.a = null;
            Function0 function0 = this.g;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return awmy.a;
    }
}
