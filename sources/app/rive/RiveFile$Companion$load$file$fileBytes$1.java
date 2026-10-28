package app.rive;

import defpackage.atqp;
import defpackage.avkz;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awpk;
import defpackage.awqk;
import defpackage.awut;
import internal.org.jni_zero.JniZero;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class RiveFile$Companion$load$file$fileBytes$1 extends awpk implements awqk {
    final /* synthetic */ RiveFileSource $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiveFile$Companion$load$file$fileBytes$1(RiveFileSource riveFileSource, awoq awoqVar) {
        super(2, awoqVar);
        this.$source = riveFileSource;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new RiveFile$Companion$load$file$fileBytes$1(this.$source, awoqVar);
    }

    @Override // defpackage.awqk
    public final Object invoke(awut awutVar, awoq awoqVar) {
        return ((RiveFile$Companion$load$file$fileBytes$1) create(awutVar, awoqVar)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atqp.j(obj);
        InputStream inputStreamOpenRawResource = ((RiveFileSource.RawRes) this.$source).getResources().openRawResource(((RiveFileSource.RawRes) this.$source).getResId());
        try {
            inputStreamOpenRawResource.getClass();
            byte[] bArrB = avkz.b(inputStreamOpenRawResource);
            JniZero.l(inputStreamOpenRawResource, null);
            return bArrB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                JniZero.l(inputStreamOpenRawResource, th);
                throw th2;
            }
        }
    }
}
