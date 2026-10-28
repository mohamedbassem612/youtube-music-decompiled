package app.rive;

import defpackage.aif;
import defpackage.atqp;
import defpackage.awmh;
import defpackage.awmy;
import defpackage.awoq;
import defpackage.awox;
import defpackage.awpk;
import defpackage.awqk;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ArtboardKt$rememberArtboardResult$1$1 extends awpk implements awqk {
    final /* synthetic */ String $artboardName;
    final /* synthetic */ RiveFile $file;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtboardKt$rememberArtboardResult$1$1(RiveFile riveFile, String str, awoq awoqVar) {
        super(2, awoqVar);
        this.$file = riveFile;
        this.$artboardName = str;
    }

    static final awmy invokeSuspend$lambda$0(Artboard artboard) {
        artboard.close();
        return awmy.a;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        ArtboardKt$rememberArtboardResult$1$1 artboardKt$rememberArtboardResult$1$1 = new ArtboardKt$rememberArtboardResult$1$1(this.$file, this.$artboardName, awoqVar);
        artboardKt$rememberArtboardResult$1$1.L$0 = obj;
        return artboardKt$rememberArtboardResult$1$1;
    }

    @Override // defpackage.awqk
    public final Object invoke(aif aifVar, awoq awoqVar) {
        return ((ArtboardKt$rememberArtboardResult$1$1) create(aifVar, awoqVar)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v4, types: [aif] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        ?? r1 = this.label;
        try {
            if (r1 != 0) {
                if (r1 == 1) {
                    aif aifVar = (aif) this.L$0;
                    atqp.j(obj);
                    r1 = aifVar;
                } else {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(obj);
                }
                throw new awmh();
            }
            atqp.j(obj);
            aif aifVar2 = (aif) this.L$0;
            Artboard.Companion companion = Artboard.Companion;
            RiveFile riveFile = this.$file;
            String str = this.$artboardName;
            this.L$0 = aifVar2;
            this.label = 1;
            obj = companion.create(riveFile, str, this);
            r1 = aifVar2;
            if (obj == awoxVar) {
                return awoxVar;
            }
            final Artboard artboard = (Artboard) obj;
            r1.f(new Result.Success(artboard));
            Function0 function0 = new Function0() { // from class: app.rive.ArtboardKt$rememberArtboardResult$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ArtboardKt$rememberArtboardResult$1$1.invokeSuspend$lambda$0(artboard);
                }
            };
            this.L$0 = null;
            this.label = 2;
            if (r1.a(function0, this) == awoxVar) {
                return awoxVar;
            }
            throw new awmh();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            r1.f(new Result.Error(e2));
            return awmy.a;
        }
    }
}
